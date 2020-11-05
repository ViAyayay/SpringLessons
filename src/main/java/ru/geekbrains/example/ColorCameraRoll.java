package ru.geekbrains.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.geekbrains.example.CameraRoll;

@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {
    @Value("30")
    private byte count;

    public ColorCameraRoll() {
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
