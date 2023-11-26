package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;

public class DriveTrain implements Subsystem {
    private fi TalonSRX motorLeft1 = new TalonSRX(Constants.MOTOR_LEFT_1_ID);
    private final TalonSRX motorLeft2 = new TalonSRX(Constants.MOTOR_LEFT_2_ID);
    private final TalonSRX motorRight1 = new TalonSRX(Constants.MOTOR_RIGHT_1_ID);
    private final TalonSRX motorRight2 = new TalonSRX(Constants.MOTOR_RIGHT_2_ID);

    public void setLeftMotors(double speed) {
        motorLeft1.set(ControlMode.PercentOutput, speed);
        motorLeft2.set(ControlMode.PercentOutput, speed);
    }
    public void setRightMotors(double speed) {
        motorRight1.set(ControlMode.PercentOutput, speed);
        motorRight2.set(ControlMode.PercentOutput, speed);
    }
}

