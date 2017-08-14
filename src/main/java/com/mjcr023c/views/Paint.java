/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.views;

/**
 *
 * @author Martin Corrales
 */
public class Paint {
    public String drawConsole(int fail) {
        String paint = "";
        if (fail < 0) {
            paint = "\n\n\n\n\n\n\n";
        } else if (fail > 10) {
            paint = "     ____          \n    |   (O)        \n    |   \\|/        \n    |    |         \n    |   / \\       \n    |             \n    |\n____|______________";
        } else {
            switch (fail) {
                case 0:
                    paint = "\n\n\n\n\n\n\n";
                    break;
                case 1:
                    paint = "\n\n\n\n\n\n\n____|______________";
                    break;
                case 2:
                    paint = "\n    |\n    |\n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 3:
                    paint = "     ____          \n    |\n    |\n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 4:
                    paint = "     ____          \n    |   (O)        \n    |\n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 5:
                    paint = "     ____          \n    |   (O)        \n    |    |        \n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 6:
                    paint = "     ____          \n    |   (O)        \n    |   \\|        \n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 7:
                    paint = "     ____          \n    |   (O)        \n    |   \\|/        \n    |\n    |\n    |\n    |\n____|______________";
                    break;
                case 8:
                    paint = "     ____          \n    |   (O)        \n    |   \\|/        \n    |    |         \n    |\n    |\n    |\n____|______________";
                    break;
                case 9:
                    paint = "     ____          \n    |   (O)        \n    |   \\|/        \n    |    |         \n    |   /         \n    |             \n    |\n____|______________";
                    break;
                case 10:
                    paint = "     ____          \n    |   (O)        \n    |   \\|/        \n    |    |         \n    |   / \\       \n    |             \n    |\n____|______________";
                    break;
            }
        }
        return paint;
    }
    
    public String drawCleanDisplay(){
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }
}
