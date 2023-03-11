// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.DriveConstants.*;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  CANSparkMax m_FrontRight;
  CANSparkMax m_BackRight;
  CANSparkMax m_FrontLeft;
  CANSparkMax m_BackLeft;
  MotorControllerGroup m_righMotorControllerGroup;  
  MotorControllerGroup m_lefMotorControllerGroup; 
  DifferentialDrive drive;
  
  public DriveSubsystem() {
    m_FrontRight = new CANSparkMax(FRONT_RIGHT_ID, MotorType.kBrushless);
m_BackRight = new CANSparkMax(BACK_RIGHT_ID, MotorType.kBrushless);
m_FrontLeft = new CANSparkMax(FRONT_LEFT_ID, MotorType.kBrushless);
m_BackLeft = new CANSparkMax(BACK_LEFT_ID, MotorType.kBrushless);  

  m_righMotorControllerGroup = new MotorControllerGroup(m_FrontRight, m_BackRight);
m_lefMotorControllerGroup = new MotorControllerGroup(m_FrontLeft, m_BackLeft);

m_righMotorControllerGroup.setInverted(true);
m_lefMotorControllerGroup.setInverted(false);

drive = new DifferentialDrive(m_righMotorControllerGroup, m_lefMotorControllerGroup);



  }
  public void Drive(double foward, double turning){
    drive.tankDrive(foward * MAX_FOWARD_DRIVE, turning* MAX_TURN_DRIVE);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
