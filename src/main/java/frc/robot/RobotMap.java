package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class RobotMap {
    public RobotMap() {

    }

    public static int leftMasterid = 6;
    public static int leftFollower1id = 4;
    public static int leftFollower2id = 5;
    public static int rightMasterid = 1;
    public static int rightFollower1id = 2;
    public static int rightFollower2id = 3;
    public static TalonSRX leftFollower =new TalonSRX(leftFollower1id);
    public static TalonSRX leftMaster =new TalonSRX(leftMasterid);
    public static TalonSRX rightMaster =new TalonSRX(rightMasterid);
    public static TalonSRX rightFollower =new TalonSRX(rightFollower1id);




} 
