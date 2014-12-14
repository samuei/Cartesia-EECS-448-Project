public class combat{

	private String p_shape;
	private int p_curhp;
	private int p_charisma;
	private int p_strength;
	private int p_dexterity;
	private int p_magic;
	private int p_defense;
	private int p_speed;
	private int p_experience;

	private int p_atk_pwr;
	private boolean def;

	private int e_curhp;
	private int e_charisma;
	private int e_strength;
	private int e_dexterity;
	private int e_magic;
	private int e_defense;
	private int e_speed;
	private int e_maxhp;

	private playerCharacter pro;
	private Creature bad;

	private boolean combat = true;
	private boolean enemy_dead = false;
	private boolean player_dead = false;

	public combat(playerCharacter pro, Creature bad){

		p_shape = pro.get_charShape();
		p_curhp = pro.get_curhp();
		p_charisma = pro.get_congruence();
		p_strength = pro.get_quads();
		p_dexterity = pro.get_acuteness();
		p_magic = pro.get_eccentricity();
		p_defense = pro.get_plasticity();
		p_speed = pro.get_sprightliness();
		p_experience = pro.get_experience();

		e_curhp = bad.get_curhp();
		e_maxhp = bad.get_maxhp();
		e_charisma = bad.get_congruence();
		e_strength = bad.get_quads();
		e_dexterity = bad.get_acuteness();
		e_magic = bad.get_eccentricity();
		e_defense = bad.get_plasticity();
		e_speed = bad.get_sprightliness();

		this.pro = pro;
		this.bad = bad;

		if(p_shape.equals("Circle")){
			p_atk_pwr = p_magic;
		}
		else if(p_shape.equals("Triangle")){
			p_atk_pwr = p_dexterity;
		}
		else if(p_shape.equals("Square")){
			p_atk_pwr = p_strength;
		}
	}

	public void p_attack(){
		int dmg = p_atk_pwr - e_defense;
		if(dmg <= 0){
			e_curhp -= 1;
		}
		else{
			e_curhp -= dmg;
		}	
		bad.set_curhp(e_curhp);

		return;
	}

	public void p_defend(){
		def = true;

		return;
	}

	public boolean p_useItem(String item){
		if(item.equals( "pythagoreanserum")){
			if(pro.get_pythagoreanserum() >= 1){
				p_dexterity += 2;
				pro.set_pythagoreanserum(pro.get_pythagoreanserum()-1);
				return true;
			}
			else{
				return false;
			}
		}
		else if(item.equals("bifurcator")){
			pro.usebifurcator(bad);
		}
		else if(item.equals("crystalmath")){
			if(pro.get_chrystalmath() >= 1){
				//side effects?
				p_speed += 5;
				pro.set_chrystalmath(pro.get_chrystalmath()-1);
				true;
			}
			else{
				false;
			}
		}
		else if(item.equals("archimead")){
			pro.usearchimead();
			p_curhp = pro.get_curhp();
		}
		else{
			return false;
		}

	public void p_flee(){
		if(p_speed >= e_speed){
			//player successfully flees
			//no exp gain
			combat = false;
		}
		else{
			//player fails to flee
		}
		return;
	}

	public void e_turn(){
		int damage;

		if(e_curhp > (0.1*e_maxhp)){
			if(def){
				damage = (int)(0.5*e_strength) - p_defense;
				def = false;
			}
			else
				damage = e_strength - p_defense;

			if(damage < 0)
				damage = 0;

			p_curhp -= damage;

			pro.set_curhp(p_curhp);

			//checks to see if player is dead
			if(p_curhp<=0){
				combat = false;
				player_dead = true;
			}
		}
		else if(e_curhp > 0){
			if(e_speed >= p_speed)
				//some kind of boolean
				//some kind of "Enemy fled" in the text box
				combat = false;
			else{
				//enemy is stuck in battle..
			}
		}
		else{
			enemy_dead = true;
			//i have no idea how much to add to experience for this...
			pro.set_experience(p_experience + 5);
		}
		return;
	}

	public boolean check_playerdead(){
		return player_dead;
	}

	public boolean check_enemydead(){
		return enemy_dead;
	}

	public boolean check_combat(){
		return combat;
	}

}
