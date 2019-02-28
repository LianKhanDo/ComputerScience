/**
 * @(#)Lab13.java
 *
 * Lab13 application
 *
 * @author
 * @version 1.00 2019/2/26
 */

public class Lab13
{

    public static void main(String[] args)
    {
    	Robotics Lian = new ProgrammingTeam();
    	Robotics Moiz = new CADTeam();
    	Robotics Matthew = new ElectricalTeam();
    	Robotics Duncan = new MechanicalTeam();
    	Robotics Natasha = new PRTeam();

		Lian.MemberCount();
    	Lian.DressCode();
    	Lian.OffSeasonMeetingDays();
    	Lian.OffSeasonMeetingHours();
    	Lian.BuildSeasonDays();
    	Lian.BuildSeasonHours();
    	Lian.BuildSeasonDays();
    	Lian.CompetitionDays();
    	Lian.StudentLeaders();
    	System.out.println();

    	System.out.println("Lian is in the Programming Team");
    	Lian.TeamLeader();
    	Lian.TeamCount();
    	Lian.Duty();
    	System.out.println();

    	System.out.println("Moiz is in the CAD Team");
    	Moiz.TeamLeader();
    	Moiz.TeamCount();
    	Moiz.Duty();
    	System.out.println();

    	System.out.println("Matthew is in the Electrical Team");
    	Matthew.TeamLeader();
    	Matthew.TeamCount();
    	Matthew.Duty();
    	System.out.println();

    	System.out.println("Duncan is in the Electrical Team");
    	Duncan.TeamLeader();
    	Duncan.TeamCount();
    	Duncan.Duty();
    	System.out.println();

    	System.out.println("Natasha is in the PR Team");
    	Natasha.TeamLeader();
    	Natasha.TeamCount();
    	Natasha.Duty();
    	System.out.println();
    }
}

abstract interface Robotics
{
	public abstract void MemberCount();
	public abstract void DressCode();
	public abstract void OffSeasonMeetingDays();
	public abstract void OffSeasonMeetingHours();
	public abstract void BuildSeasonDays();
	public abstract void BuildSeasonHours();
	public abstract void CompetitionDays();
	public abstract void StudentLeaders();
	public abstract void TeamLeader();
	public abstract void TeamCount();
	public abstract void Duty();
}

abstract class CommonRobotics implements Robotics
{
	public void MemberCount()
	{
		System.out.println("Robotics has over 30 Members");
	}
	public void DressCode()
	{
		System.out.println("The Dress Code is: No Shorts, Close-tied shoes, and tied hair");
	}
	public void OffSeasonMeetingDays()
	{
		System.out.println("Robotics Off Season meeting days are Tuesdays, Thursdays, and Saturdays");
	}
	public void OffSeasonMeetingHours()
	{
		System.out.println("Robotics Off Season meeting hours are Tuesdays: 6-8 PM, Thursdays: 6-8 PM, and SaturdayL 6-8 PM");
	}
	public void BuildSeasonDays()
	{
		System.out.println("Robotics Build season starts at January 5 and ends at February 19. It is everyday except Sundays");
	}
	public void BuildSeasonHours()
	{
		System.out.println("Robotics Build season hours are Mondays: 4-8:30 PM, Tuesdays: 4-8:30 PM, Wednesdays: 4-8:30 PM, Thursdays: 4-8:30 PM, Fridays: 4-8:30 PM, Saturday: 10 AM - 5 PM");
	}
	public void CompetitionDays()
	{
		System.out.println("Robotics competition days are March 6-9 and April 9-12");
	}
	public void StudentLeaders()
	{
		System.out.println("Our president is Lily Violet, vice president is Shannon Langley, and Chief of Engineering is Daniel Evans");
	}
}

class PRTeam extends CommonRobotics
{
	public void TeamLeader()
	{
		System.out.println("PR's team leader is Shannon Langley");
	}
	public void TeamCount()
	{
		System.out.println("There are about 10 people in PR");
	}
	public void Duty()
	{
		System.out.println("In charge of partnerships, funding, requesting awards during competition, and social media");
	}
}

class MechanicalTeam extends CommonRobotics
{
	public void TeamLeader()
	{
		System.out.println("Mechanical's team leader is Colton Roe");
	}
	public void TeamCount()
	{
		System.out.println("There are about 6 people in Mechanical");
	}
	public void Duty()
	{
		System.out.println("In charge of building the actual parts of the robot and the obstacles for our courses");
	}
}

class ElectricalTeam extends CommonRobotics
{
	public void TeamLeader()
	{
		System.out.println("Electrical's team leader is Sarah Down");
	}
	public void TeamCount()
	{
		System.out.println("There are about 10 people in Electrical");
	}
	public void Duty()
	{
		System.out.println("In charge of wiring robotic, putting lights on the robot, and making sure the electric parts work");
	}
}

class CADTeam extends CommonRobotics
{
	public void TeamLeader()
	{
		System.out.println("CAD's team leader is Sam Yaeger");
	}
	public void TeamCount()
	{
		System.out.println("There are about 3 people in CAD");
	}
	public void Duty()
	{
		System.out.println("In charge of making the frame for the robot and the technical book");
	}
}

class ProgrammingTeam extends CommonRobotics
{
	public void TeamLeader()
	{
		System.out.println("Programming's team leader is Nick Thompson");
	}
	public void TeamCount()
	{
		System.out.println("There are 4 people in programming");
	}
	public void Duty()
	{
		System.out.println("In charge of making the code for the robot");
	}
}


