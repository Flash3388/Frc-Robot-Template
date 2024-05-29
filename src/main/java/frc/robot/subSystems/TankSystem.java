package frc.robot.subSystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankSystem extends SubsystemBase {
    public WPI_TalonSRX motor1;
    public WPI_TalonSRX motor2;
    public WPI_TalonSRX motor3;
    public WPI_VictorSPX motor4;
     public TankSystem(WPI_VictorSPX motor4, WPI_TalonSRX motor1, WPI_TalonSRX motor2, WPI_TalonSRX motor3){
         this.motor1 = motor1;
         this.motor2 = motor2;
         this.motor3 = motor3;
     }
     public void stop()
     {
         this.motor1.stopMotor();
         this.motor2.stopMotor();
         this.motor3.stopMotor();
         this.motor4.stopMotor();
     }

     public void setSpeedR(double speed){
         this.motor1.set(speed * -1 * speed);
         this.motor2.set(speed * -1 * speed);
     }

     public void setSpeedL(double speed){
         this.motor3.set(speed * -1 * speed);
         this.motor4.set(speed * -1 * speed);
     }
}
