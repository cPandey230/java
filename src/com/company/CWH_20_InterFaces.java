package com.company;

// Interface 1
interface Camera {
    void takePhoto();
    void recordVideo();
}

// Interface 2
interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

// Class implementing multiple interfaces
class Smartphone1 implements Camera, MusicPlayer {

    // Implementing Camera methods
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    // Implementing MusicPlayer methods
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}
public class CWH_20_InterFaces {
    public static void main(String[] args) {
        Smartphone1 s = new Smartphone1();

        s.takePhoto();
        s.playMusic();
    }
}
