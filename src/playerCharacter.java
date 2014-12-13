/* playerCharacter.java
*  Author: Samuel Lamb
*  KUID 2118080
*  Last Change: 2014-12-8
*/

public class playerCharacter extends Creature
{
	// Shape is (roughly) the character's class
	// It has three acceptable values: "Square", "Triangle", and "Circle" (note the caps)
	private String charShape;
	
	// These variables correspond to the experience price for improving each stat
	private int hpprice = 1;
	private int congruenceprice = 1;
	private int quadsprice = 1;
	private int acutenessprice = 1;
	private int eccentricityprice = 1;
	private int plasticityprice = 1;
	private int sprightlinessprice = 1;
	
	// Utility item quantities:
	private int archimead = 0;
	private int crystalmath = 0;
	private int bifurcator = 0;
	private int pythagoreanserum = 0;
	
	private String wearing = "";
	
	// Getter method for charShape:
	public String get_charShape()
	{
		return charShape;
	}
	
	// Setter method for charShape:
	public void set_charShape(String newshape)
	{
		charShape = newshape;
	}
	
	// Getter methods for items:
	public int get_archimead()
	{
		return archimead;
	}
	public int get_crystalmath()
	{
		return crystalmath;
	}
	public int get_bifurcator()
	{
		return bifurcator;
	}
	public int get_pythagoreanserum()
	{
		return pythagoreanserum;
	}
	
	// Setters for items:
	public void set_archimead(int newval)
	{
		archimead = newval;
	}
	public void set_crystalmath(int newval)
	{
		crystalmath = newval;
	}
	public void set_bifurcator(int newval)
	{
		bifurcator = newval;
	}
	public void set_pythagoreanserum(int newval)
	{
		pythagoreanserum = newval;
	}
	
	// Getter methods for prices:
	public int get_hpprice()
	{
	return hpprice;
	}
	public int get_congruenceprice()
	{
	return congruenceprice;
	}
	public int get_quadsprice()
	{
	return quadsprice;
	}
	public int get_acutenessprice()
	{
	return acutenessprice;
	}
	public int get_eccentricityprice()
	{
	return eccentricityprice;
	}
	public int get_plasticityprice()
	{
	return plasticityprice;
	}
	public int get_sprightlinessprice()
	{
	return sprightlinessprice;
	}
	public String get_wearing()
	{
		return wearing;
	}
	
	// Setter methods for prices:
	public void set_hpprice(int newval)
	{
	hpprice = newval;
	}
	public void set_congruenceprice(int newval)
	{
	congruenceprice = newval;
	}
	public void set_quadsprice(int newval)
	{
	quadsprice = newval;
	}
	public void set_acutenessprice(int newval)
	{
	acutenessprice = newval;
	}
	public void set_eccentricityprice(int newval)
	{
	eccentricityprice = newval;
	}
	public void set_plasticityprice(int newval)
	{
	plasticityprice = newval;
	}
	public void set_sprightlinessprice(int newval)
	{
	sprightlinessprice = newval;
	}
	public void set_wearing(String newwear)
	{
		wearing = newwear;
	}
	
	// Stat increase method
	public boolean increasecongruence()
	{
		if (get_experience() >= congruenceprice)
		{
			// Deduct experience price
			set_experience(get_experience() - congruenceprice);
			// Increment price for next time
			if((int)(congruenceprice*1.5) == congruenceprice)
			{
				congruenceprice = congruenceprice * 2;
			}
			else
			{
				congruenceprice = (int)(congruenceprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_congruence(get_congruence() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasehp()
	{
		if (get_experience() >= hpprice)
		{
			// Deduct experience price
			set_experience(get_experience() -hpprice);
			// Increment price for next time
			if((int)(hpprice*1.5) == hpprice)
			{
				hpprice = hpprice * 2;
			}
			else
			{
				hpprice = (int)(hpprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_maxhp(get_maxhp() + 5);
			set_curhp(get_curhp() + 3);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasequads()
	{
		if (get_experience() >= quadsprice)
		{
			// Deduct experience price
			set_experience(get_experience() -quadsprice);
			// Increment price for next time
			if((int)(quadsprice*1.5) == quadsprice)
			{
				quadsprice = quadsprice * 2;
			}
			else
			{
				quadsprice = (int)(quadsprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_quads(get_quads()+ 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseacuteness()
	{
		if (get_experience() >= acutenessprice)
		{
			// Deduct experience price
			set_experience(get_experience() -acutenessprice);
			// Increment price for next time
			if((int)(acutenessprice*1.5) == acutenessprice)
			{
				acutenessprice = acutenessprice * 2;
			}
			else
			{
				acutenessprice = (int)(acutenessprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_acuteness(get_acuteness() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseeccentricity()
	{
		if (get_experience() >= eccentricityprice)
		{
			// Deduct experience price
			set_experience(get_experience() -eccentricityprice);
			// Increment price for next time
			if((int)(eccentricityprice*1.5) == eccentricityprice)
			{
				eccentricityprice = eccentricityprice * 2;
			}
			else
			{
				eccentricityprice = (int)(eccentricityprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_eccentricity(get_eccentricity()+ 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseplasticity()
	{
		if (get_experience() >= plasticityprice)
		{
			// Deduct experience price
			set_experience(get_experience() -plasticityprice);
			// Increment price for next time
			if((int)(plasticityprice*1.5) == plasticityprice)
			{
				plasticityprice = plasticityprice * 2;
			}
			else
			{
				plasticityprice = (int)(plasticityprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_plasticity(get_plasticity() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasesprightliness()
	{
		if (get_experience() >= sprightlinessprice)
		{
			// Deduct experience price
			set_experience(get_experience() -sprightlinessprice);
			// Increment price for next time
			if((int)(sprightlinessprice*1.5) == sprightlinessprice)
			{
				sprightlinessprice=sprightlinessprice * 2;
			}
			else
			{
				sprightlinessprice = (int)(sprightlinessprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_sprightliness(get_sprightliness() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}

	// Utility item usage methods:
	
	// Archimead heals 5 HP
	public boolean usearchimead()
	{
		if(archimead >= 1)
		{
			// remove item
			archimead -= 1;
			// use item
			if(get_curhp() + 5 < get_maxhp())
			{
				set_curhp(get_curhp() +5);
			}
			else
			{
				set_curhp(get_maxhp());
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// HEY COMBAT PERSON! This causes damage!
	// Bifurcators do 2 unblockable damage
	public boolean usebifurcator(Creature target)
	{
		if(bifurcator >= 1)
		{
			// remove item
			bifurcator -= 1;
			// use item
			target.set_curhp(target.get_curhp() - 2);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* HEY COMBAT PERSON!
	* These next items should give a temporary bonus for
	* the current combat only. Not sure how you want to 
	* swing that. So, for now, they just return false. */
	
	// The Pythagorean Serum increases acuteness
	public boolean usepythagoreanserum()
	{
	
		return false;
	}
	
	// Crystal Math increases your speed
	// It may have side effects.
	public boolean usecrystalmath()
	{
	
		return false;
	}
	
	// Wear wearable items:
	public boolean wearitem(String towear)
	{
		// If you're already wearing something, you need to remove it, first.
		// Why? Because I said so. That's why.
		if (!wearing.equals(""))
		{
			return false;
		}
		else
		{
			// The values below are entirely negotiable
			
			
			// This is a messy way to do this, but it works.
			if (towear.equals("Spline"))
			{
				set_eccentricity(get_eccentricity()+4);
			}
			else if (towear.equals("Krig"))
			{
				if(get_eccentricity()<3)
				{
					return false;
				}
				else 
				{
					set_eccentricity(get_eccentricity()-3);
					set_congruence(get_congruence()+4);
				}
			}
			else if (towear.equals("Sierpin Snow-Skis"))
			{
				set_acuteness(get_acuteness()+4);
			}
			else if (towear.equals("Strange Attractor"))
			{
				set_congruence(get_congruence()+2);
			}
			else if (towear.equals("Axe of Choice"))
			{
				set_quads(get_quads()+4);
			}
			else if (towear.equals("Fuzzy Boundary"))
			{
				if (get_congruence() < 4)
				{
					return false;
				}
				else
				{
					set_congruence(get_congruence()-4);
					set_plasticity(get_plasticity()+5);
				}
			}
			else if (towear.equals("Lacy Gödel"))
			{
				set_congruence(get_congruence()+5);
			}
			else if (towear.equals("Gauss Hand-Cannon"))
			{
				set_acuteness(get_acuteness()+4);
			}
			else if (towear.equals("Brass Knuthles"))
			{
				set_quads(get_quads()+3);
			}
			else if (towear.equals("Greeble"))
			{
				if(get_congruence()<5)
				{
					return false;
				}
				else
				{
					set_congruence(get_congruence()-5);
					set_quads(get_quads()+4);
					set_eccentricity(get_eccentricity()+5);
				}
			}
			else
			{
				// You have to wear an item that's in the game
				return false;
			}
			set_wearing(towear);
			return true;
		}
	}
	
	// remove wearable items:
	public boolean removeitem()
	{
		// If you're not wearing something, you can't remove it.
		// Why? Because you'll break the universe. That's why.
		if (wearing.equals(""))
		{
			return false;
		}
		else
		{
			// The values below NEED to match those in wearitem
			
			
			if (wearing.equals("Spline"))
			{
				set_eccentricity(get_eccentricity()-4);
			}
			else if (wearing.equals("Krig"))
			{
					set_eccentricity(get_eccentricity()+3);
					set_congruence(get_congruence()-4);
			}
			else if (wearing.equals("Sierpin Snow-Skis"))
			{
				set_acuteness(get_acuteness()-4);
			}
			else if (wearing.equals("Strange Attractor"))
			{
				set_congruence(get_congruence()-2);
			}
			else if (wearing.equals("Axe of Choice"))
			{
				set_quads(get_quads()-4);
			}
			else if (wearing.equals("Fuzzy Boundary"))
			{
					set_congruence(get_congruence()+4);
					set_plasticity(get_plasticity()-5);

			}
			else if (wearing.equals("Lacy Gödel"))
			{
				set_congruence(get_congruence()-5);
			}
			else if (wearing.equals("Gauss Hand-Cannon"))
			{
				set_acuteness(get_acuteness()-4);
			}
			else if (wearing.equals("Brass Knuthles"))
			{
				set_quads(get_quads()-3);
			}
			else if (wearing.equals("Greeble"))
			{
					set_congruence(get_congruence()+5);
					set_quads(get_quads()-4);
					set_eccentricity(get_eccentricity()-5);
			}
			else
			{
				// You have already broken the item system.
				// You will not break it further.
				
				// Live with your shame.
				return false;
			}
			set_wearing("");
			return true;
		}
	}
	
	// Character creation method (?):
	/* Don't know if we want to do this here,
	*  or if that's a GUI sort of thing. */
	
	
}
