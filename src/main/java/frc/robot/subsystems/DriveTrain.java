package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

   public static OI oi = new OI();

  public DriveTrain() {
      


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void teleopPeriodic(){

      tankDrive();
  }
  public void tankDrive(){
    double turn;

    if(Math.abs(oi.driverController.getRawAxis(4)) > 0.1) {
        turn = (oi.driverController.getRawAxis(4));
    }
    else {
        turn = 0; 
    }


      if(Math.abs(oi.driverController.getRawAxis(1)) > 0.1) {
          RobotMap.rightMaster.set(ControlMode.PercentOutput,oi.driverController.getRawAxis(1)+turn);
          RobotMap.leftMaster.set(ControlMode.PercentOutput,oi.driverController.getRawAxis(1)-turn);
      }
      else {
          RobotMap.rightMaster.set(ControlMode.PercentOutput,turn);
          RobotMap.leftMaster.set(ControlMode.PercentOutput,-turn);
        
      }

     
      }

      


      
      }
      

      
      
  

