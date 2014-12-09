/* Creature.java
*  Author: Samuel Lamb
*  KUID 2118080
*  Last Change: 2014-12-8
*/

public class Creature
{
	private int curhp, maxhp, congruence, quads, acuteness, eccentricity, experience, plasticity, sprightliness;
	
	// Getter methods for stats:
	
	// Returns current Health
	public int get_curhp()
	{
		return curhp;
	}
	// Returns maximum Health
	public int get_maxhp()
	{
		return maxhp;
	}
	// Returns congruence
	public int get_congruence()
	{
		return congruence;
	}
	// Returns quads
	public int get_quads()
	{
		return quads;
	}
	// Returns acuteness
	public int get_acuteness()
	{
		return acuteness;
	}
	// Returns eccentricity
	public int get_eccentricity()
	{
		return eccentricity;
	}
	// Returns experience
	public int get_experience()
	{
		return experience;
	}
	// Returns plasticity
	public int get_plasticity()
	{
		return plasticity;
	}
	// Returns sprightliness
	public int get_sprightliness()
	{
		return sprightliness;
	}
	
	// Setter methods for same:
	
	public void set_curhp(int newval)
	{
		self.curhp = newval;
	}
	public void set_maxhp(int newval)
	{
		self.maxhp = newval;
	}
	public void set_congruence(int newval)
	{
		self.congruence = newval;
	}
	public void set_quads(int newval)
	{
		self.quads = newval;
	}
	public void set_acuteness(int newval)
	{
		self.acuteness = newval;
	}
	public void set_eccentricity(int newval)
	{
		self.eccentricity = newval;
	}
	public void set_experience(int newval)
	{
		self.experience = newval;
	}
	public void set_plasticity(int newval)
	{
		self.plasticity = newval;
	}
	public void set_sprightliness(int newval)
	{
		self.sprightliness = newval;
	}
}