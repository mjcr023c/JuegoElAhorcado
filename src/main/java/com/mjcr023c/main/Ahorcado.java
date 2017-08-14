/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.main;

import com.mjcr023c.objects.Score;
import com.mjcr023c.objects.Word;
import com.mjcr023c.views.Paint;
import java.util.ArrayList;
import java.util.Scanner;
import com.mjcr023c.utils.Constants;
import com.mjcr023c.utils.Messages;
import com.mjcr023c.views.Pages;

/**
 *
 * @author Martin Corrales
 * @version 1.0
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
        String opcion = Constants.EMPTY;
        String opcionM = Constants.EMPTY;

        System.out.println(opcion);
        Pages page = new Pages();
        while (!Constants.ZERO.equals(opcion)) {
            System.out.print(page.getView(1));
            opcion = entradaEscaner.nextLine();
            switch (opcion) {
                case Constants.ONE:
                    System.out.print(Messages.MSG_INFO_INSERT_WORD);
                    String palabra = entradaEscaner.nextLine();
                    Word word = new Word(palabra.toLowerCase());
                    if (word.validate()) {
                        Paint paint = new Paint();
                        Score score = new Score(0, 0, word.getLength());
                        System.out.print(paint.drawCleanDisplay());
                        while (!opcionM.equalsIgnoreCase(Constants.RETURN)) {
                            System.out.print(page.getView(2));
                            System.out.println(paint.drawConsole(score.getFails()));
                            System.out.println(score.getWord());
                            if (score.getHits() == score.getTotal()) {
                                System.out.print(Messages.MSG_INFO_WINNER);
                                opcionM = entradaEscaner.nextLine();
                                opcionM = Constants.RETURN;
                            } else if (score.getFails() > 9) {
                                System.out.print(Messages.MSG_INFO_LOSER);
                                opcionM = entradaEscaner.nextLine();
                                opcionM = Constants.RETURN;
                            } else {
                                System.out.print(Messages.MSG_INFO_INSERT_LETTER);
                                opcionM = entradaEscaner.nextLine().toLowerCase();
                                if (!Constants.RETURN.equalsIgnoreCase(opcionM)) {
                                    if (opcionM.length() != 1) {
                                        System.out.println(Messages.MSG_ERROR_LETTER);
                                        continue;
                                    }
                                    char letter = opcionM.charAt(0);
                                    if (!score.getWord().isEmpty() && score.getWord().contains(letter)) {
                                        System.out.println(Messages.MSG_INFO_LETTER_REPEAT);
                                    } else if (word.getWord().contains(letter)) {
                                        int c = word.countLetterInWord(letter);
                                        ArrayList<Integer> positions = word.getPositionOfLetters(letter);
                                        for (int position : positions) {
                                            score.getWord().remove(position);
                                            score.getWord().add(position, letter);
                                        }
                                        score.setHits(score.getHits() + c);
                                    } else {
                                        score.setFails(score.getFails() + 1);
                                    }
                                }

                            }
                        }
                        opcionM = Constants.EMPTY;
                    } else {
                        System.out.println(Messages.MSG_ERROR_NO_VALID_WORD);
                    }
                    break;

            }
        }
    }

}
