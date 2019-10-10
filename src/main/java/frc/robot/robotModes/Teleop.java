
package frc.robot.robotModes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.HatchManager;
import frc.robot.commands.TeleDrive;

public class Teleop extends CommandGroup {

    public Teleop() {

        //Add each Command here in parallel(remember to import it)
        addParallel(new HatchManager());
        addParallel(new TeleDrive());

    }

}