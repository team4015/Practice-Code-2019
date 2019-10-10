package frc.robot.robotModes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.AutoDrive;

/* ===================================================
 * This CommandGroup calls the autonomous command to
 * drive to the base line.
 * =================================================*/

public class Auto extends CommandGroup
{
	// CONSTRUCTOR //
	public Auto()
	{
		addSequential(new AutoDrive());

    }
	
}