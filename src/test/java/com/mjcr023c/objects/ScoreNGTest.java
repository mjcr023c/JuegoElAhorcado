/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.objects;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mcorrales
 */
public class ScoreNGTest {

    Score score;

    public ScoreNGTest() {
    }

    @BeforeClass
    public void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        score = new Score(0, 0, 4);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getHits method, of class Score.
     */
    @Test
    public void testGetHits() {
        System.out.println(Score.class + "test getHits");

        int expResult = 0;
        int result = score.getHits();
        Assert.assertEquals(result, expResult);

    }

    /**
     * Test of setHits method, of class Score.
     */
    @Test
    public void testSetHits() {
        System.out.println(Score.class + "test setHits");
        int hits = 3;

        score.setHits(hits);
        int result = score.getHits();
        Assert.assertEquals(result, hits);

    }

    /**
     * Test of getFails method, of class Score.
     */
    @Test
    public void testGetFails() {
        System.out.println(Score.class + "test getFails");

        int expResult = 0;
        int result = score.getFails();
        Assert.assertEquals(result, expResult);

    }

    /**
     * Test of setFails method, of class Score.
     */
    @Test
    public void testSetFails() {
        System.out.println(Score.class + "test setFails");
        int fails = 2;

        score.setFails(fails);
        int result = score.getFails();
        Assert.assertEquals(result, fails);

    }

    /**
     * Test of getTotal method, of class Score.
     */
    @Test
    public void testGetTotal() {
        System.out.println(Score.class + "test getTotal");

        int expResult = 4;
        int result = score.getTotal();
        Assert.assertEquals(result, expResult);

    }

    /**
     * Test of setTotal method, of class Score.
     */
    @Test
    public void testSetTotal() {
        System.out.println(Score.class + "test setTotal");
        int total = 10;

        score.setTotal(total);
        int result = score.getTotal();
        Assert.assertEquals(result, total);

    }

    /**
     * Test of getWord method, of class Score.
     */
    @Test
    public void testGetWord() {
        System.out.println(Score.class + "test getWord");

        ArrayList<Character> expResult = new ArrayList<>();
        expResult.add(0, '_');
        expResult.add(1, '_');
        expResult.add(2, '_');
        expResult.add(3, '_');

        ArrayList result = score.getWord();
        Assert.assertEquals(result.get(0), expResult.get(0));
        Assert.assertEquals(result.get(1), expResult.get(1));
        Assert.assertEquals(result.get(2), expResult.get(2));
        Assert.assertEquals(result.get(3), expResult.get(3));

    }

    /**
     * Test of setWord method, of class Score.
     */
    @Test
    public void testSetWord() {
        System.out.println(Score.class + "test setWord");
        ArrayList<Character> word = new ArrayList<>();
        word.add(0, 't');
        word.add(1, 'e');
        word.add(2, 's');
        word.add(3, 't');
        score.setWord(word);
        ArrayList<Character> result = score.getWord();
        Assert.assertEquals(result.get(0), word.get(0));
        Assert.assertEquals(result.get(1), word.get(1));
        Assert.assertEquals(result.get(2), word.get(2));
        Assert.assertEquals(result.get(3), word.get(3));

    }

    /**
     * Test of initWord method, of class Score.
     */
    @Test
    public void testInitWord() {
        System.out.println(Score.class + "test initWord");
        int length = 4;

        score.initWord(length);

        ArrayList<Character> expResult = new ArrayList<>();
        expResult.add(0, '_');
        expResult.add(1, '_');
        expResult.add(2, '_');
        expResult.add(3, '_');

        ArrayList result = score.getWord();
        Assert.assertEquals(result.get(0), expResult.get(0));
        Assert.assertEquals(result.get(1), expResult.get(1));
        Assert.assertEquals(result.get(2), expResult.get(2));
        Assert.assertEquals(result.get(3), expResult.get(3));
        
    }

}
