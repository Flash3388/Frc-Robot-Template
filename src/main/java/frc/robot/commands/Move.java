package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subSystems.TankSystem;

public class Move extends Command {
    public TankSystem tankSystem;
    double speedR;
    double speedL;
    public Move(TankSystem tankSystem, double speedL, double speedR){
        this.tankSystem = tankSystem;
        this.speedL = speedL;
        this.speedR = speedR;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
      this.tankSystem.setSpeedL(this.speedL);
      this.tankSystem.setSpeedR(speedR);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
