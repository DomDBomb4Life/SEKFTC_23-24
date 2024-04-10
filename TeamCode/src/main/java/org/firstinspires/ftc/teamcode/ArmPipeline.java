package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class ArmPipeline {
    //my motors
    private DcMotor lift1;
    private DcMotor lift2;
    private DcMotor arm;

    //costructor

    //is busy method
    public boolean isMoving(){
        if(lift1.isBusy() || lift2.isBusy() || arm.isBusy()){
            return true;
        }else{
            return false;
        }
    }
}
