package com.chief;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scan=new Scanner(System.in);

        String input="";

        File file=new File("C:\\Users\\Baby Beast\\Desktop\\Soft Piano Music_16000hz.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file) ;
        Clip clip=AudioSystem.getClip();
        clip.open(audio);



        while (input!="Q"){
            System.out.println("Enter your choice to control music: \nP-play , S-stop ");

            input=scan.next();
            input.toUpperCase();

            switch (input){
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;

            }

        }


    }
}
