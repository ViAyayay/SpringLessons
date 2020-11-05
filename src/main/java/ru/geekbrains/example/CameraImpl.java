package ru.geekbrains.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.example.Camera;

@Component
@Scope("prototype")
public class CameraImpl implements Camera {
    @Autowired
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    @Override
    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Override
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    @Override
    public void doPhotograph(){
        if(isBroken()){
            System.out.println("поломано");
            return;
        }
        cameraRoll.processing();
        System.out.println(cameraRoll.getCount());
    }

    @Override
    public void breaking() {
        this.broken = true;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

}
