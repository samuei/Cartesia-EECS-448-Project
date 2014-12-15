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
	// Returns congruence (cha)
	public int get_congruence()
	{
		return congruence;
	}
	// Returns quads (str)
	public int get_quads()
	{
		return quads;
	}
	// Returns acuteness (dex)
	public int get_acuteness()
	{
		return acuteness;
	}
	// Returns eccentricity (wis)
	public int get_eccentricity()
	{
		return eccentricity;
	}
	// Returns experience
	public int get_experience()
	{
		return experience;
	}
	// Returns plasticity (def)
	public int get_plasticity()
	{
		return plasticity;
	}
	// Returns sprightliness (spd)
	public int get_sprightliness()
	{
		return sprightliness;
	}
	
	// Setter methods for same:
	
	public void set_curhp(int newval)
	{
		curhp = newval;
	}
	public void set_maxhp(int newval)
	{
		maxhp = newval;
	}
	public void set_congruence(int newval)
	{
		congruence = newval;
	}
	public void set_quads(int newval)
	{
		quads = newval;
	}
	public void set_acuteness(int newval)
	{
		acuteness = newval;
	}
	public void set_eccentricity(int newval)
	{
		eccentricity = newval;
	}
	public void set_experience(int newval)
	{
		experience = newval;
	}
	public void set_plasticity(int newval)
	{
		plasticity = newval;
	}
	public void set_sprightliness(int newval)
	{
		sprightliness = newval;
	}
}
