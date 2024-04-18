package org.iths.consumer;

import java.util.Scanner;

public class ColorsMenu {
    static void continues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                With which color do you want to declare and write commands?
                1-Red
                2_Green
                3-Blue
                4-Yellow
                5-Orange
                6-Purple
                7-Pink
                8-Cyan
                9-Magenta
                10-Black
                """);
        int color = scanner.nextInt();
        ColorText.Value selectedColor = null;
        switch (color) {
            case 1 -> selectedColor = ColorText.Value.RED;
            case 2 -> selectedColor = ColorText.Value.GREEN;
            case 3 -> selectedColor = ColorText.Value.BLUE;
            case 4 -> selectedColor = ColorText.Value.YELLOW;
            case 5 -> selectedColor = ColorText.Value.ORANGE;
            case 6 -> selectedColor = ColorText.Value.PURPLE;
            case 7 -> selectedColor = ColorText.Value.PINK;
            case 8 -> selectedColor = ColorText.Value.CYAN;
            case 9 -> selectedColor = ColorText.Value.MAGENTA;
            case 10 -> selectedColor = ColorText.Value.BLACK;
            default -> {
                System.out.println("Please enter a valid number");
                System.exit(1);
            }
        }
        System.out.println(selectedColor.getCode()+"You can write commands with the color "+selectedColor.getName());
    }
}
