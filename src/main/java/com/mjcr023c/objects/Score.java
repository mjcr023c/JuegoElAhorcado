/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.objects;

import java.util.ArrayList;

/**
 *
 * @author Martin Corrales
 */
public class Score {

    private int hits;
    private int fails;
    private int total;
    private ArrayList<Character> word;

    public Score(int hits, int fails, int total) {
        this.hits = hits;
        this.fails = fails;
        this.total = total;
        this.initWord(total);
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getFails() {
        return fails;
    }

    public void setFails(int fails) {
        this.fails = fails;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Character> getWord() {
        return word;
    }

    public void setWord(ArrayList<Character> word) {
        this.word = word;
    }

    public void initWord(int length) {
        this.word = new ArrayList<Character>();
        for (int i=0; i < length; i++) {
            this.word.add(i, '_');
        }

    }

}
