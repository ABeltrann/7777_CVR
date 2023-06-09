// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class DriveConstants{
    public static final int FRONT_LEFT_ID = 1;
    public static final int FRONT_RIGHT_ID = 3;
    public static final int BACK_LEFT_ID = 2;
    public static final int BACK_RIGHT_ID = 4;

    public static final double MAX_FOWARD_DRIVE = .9;
    public static final double MAX_TURN_DRIVE = .5;

  }
  public static class ArmConstants{
    public static final int PIVOT_ID = 0;
    public static final int EXTEND_ID = 0;
    public static final double MAX_PIVOT = 0.0;
    public static final double MAX_EXTEND = 0.0;
    
  }
}
