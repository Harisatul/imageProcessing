package org.unsri;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GetRgbFromImage {

    public static void main(String[] args) throws IOException {

        File file = new File("blackandwhite.jpg");
        BufferedImage image = ImageIO.read(file);
        int height = image.getHeight();
        int width = image.getWidth();
        System.out.println(height + "px");
        System.out.println(width + "px");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int rgb = image.getRGB(j, i);
                Color color = new Color(rgb);
                System.out.println("height : " + i  + " : " + "width : " + j +  " : " + color.getRed() + " : "  +
                        color.getGreen() + " " + color.getBlue() );
            }

        }
    }


}
