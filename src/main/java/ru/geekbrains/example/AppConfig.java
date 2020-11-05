package ru.geekbrains.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CameraRoll cameraRoll(){
        return new BlackAndWhiteCameraRoll();
    }

    @Bean
    public Camera camera(CameraRoll cameraRoll){
        Camera camera= new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
