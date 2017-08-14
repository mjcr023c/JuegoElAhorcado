/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.objects;

import java.util.ArrayList;
import static com.mjcr023c.utils.Constants.EMPTY;

/**
 *
 * @author Martin Corrales
 */
public class Word {

    private String name;
    private int length;
    private ArrayList<Character> word;

    public Word(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<Character> getWord() {
        return word;
    }

    public void setWord(ArrayList<Character> word) {
        this.word = word;
    }

    public boolean validate() {
        if (this.name == null || EMPTY.equals(this.name.trim())) {
            return false;
        }
        this.length = this.name.length();
        this.word = new ArrayList<Character>();
        for (int i = 0; i < this.length; i++) {
            this.word.add(i, this.name.charAt(i));
        }
        return true;
    }

    public int countLetterInWord(char letter) {
        int count = 0;
        for (char c : this.word) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }

    public ArrayList getPositionOfLetters(char letter) {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        int count = 0;
        for (char c : this.word) {
            if (c == letter) {
                positions.add(count);
            }
            count++;
        }
        return positions;
    }
}
