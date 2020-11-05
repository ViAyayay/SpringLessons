package ru.geekbrains.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlackAndWhiteCameraRoll implements CameraRoll {
    private byte count;

    public BlackAndWhiteCameraRoll() {
    }

    @Value("25")
    public void setCount(byte count){
        this.count = count;
    }

    @Override
    public void processing() {
        count--;
    }

    @Override
    public byte getCount() {
        return count;
    }
}
