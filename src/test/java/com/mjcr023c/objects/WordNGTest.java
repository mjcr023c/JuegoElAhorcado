/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcr023c.objects;

import com.mjcr023c.utils.Constants;
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
public class WordNGTest {

    private Word word;

    public WordNGTest() {
    }

    @BeforeClass
    public void setUpClass() throws Exception {
        word = new Word("test");
        word.setLength(4);
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add(0, 't');
        arrayList.add(1, 'e');
        arrayList.add(2, 's');
        arrayList.add(3, 't');
        word.setWord(arrayList);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getName method, of class Word.
     */
    @Test
    public void testGetName() {
        System.out.println(Word.class + "test getName");
        String expResult = "test";
        String result = word.getName();

        Assert.assertNotNull(result);
        Assert.assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Word.
     */
    @Test
    public void testSetName() {
        System.out.println(Word.class + "test setName");
        String name = "testing";
        word.setName(name);
        String result = word.getName();
        Assert.assertNotNull(result);
        Assert.assertEquals(name, result);

    }

    /**
     * Test of getLength method, of class Word.
     */
    @Test
    public void testGetLength() {
        System.out.println(Word.class + "test getLength");
        int expResult = 4;
        int result = word.getLength();
        Assert.assertNotNull(result);
        Assert.assertEquals(expResult, result);

    }

    /**
     * Test of setLength method, of class Word.
     */
    @Test
    public void testSetLength() {
        System.out.println(Word.class + "test setLength");
        int length = 5;
        word.setLength(length);
        int result = word.getLength();
        Assert.assertNotNull(result);
        Assert.assertEquals(length, result);

    }

    /**
     * Test of getWord method, of class Word.
     */
    @Test
    public void testGetWord() {
        System.out.println(Word.class + "test getWord");

        ArrayList result = word.getWord();
        Assert.assertNotNull(result);
        Assert.assertEquals(result.get(0), 't');
        Assert.assertEquals(result.get(1), 'e');
        Assert.assertEquals(result.get(2), 's');
        Assert.assertEquals(result.get(3), 't');

    }

    /**
     * Test of setWord method, of class Word.
     */
    @Test
    public void testSetWord() {
        System.out.println(Word.class + "test setWord");
        ArrayList<Character> letterList = new ArrayList<>();
        letterList.add(0, 't');
        letterList.add(1, 'e');
        letterList.add(2, 's');
        letterList.add(3, 't');
        letterList.add(4, 'i');
        letterList.add(5, 'n');
        letterList.add(6, 'g');

        word.setWord(letterList);
        ArrayList<Character> result = word.getWord();
        Assert.assertNotNull(result);
        Assert.assertEquals(result.get(0), letterList.get(0));
        Assert.assertEquals(result.get(1), letterList.get(1));
        Assert.assertEquals(result.get(2), letterList.get(2));
        Assert.assertEquals(result.get(3), letterList.get(3));
        Assert.assertEquals(result.get(4), letterList.get(4));
        Assert.assertEquals(result.get(5), letterList.get(5));
        Assert.assertEquals(result.get(6), letterList.get(6));

    }

    /**
     * Test of validate method, of class Word.
     */
    @Test
    public void testValidate() {
        System.out.println(Word.class + "test validate");

        boolean expResult = true;
        boolean result = word.validate();
        Assert.assertEquals(result, expResult);

    }

    @Test
    public void testValidate2() {
        System.out.println(Word.class + "test2 validate");
        boolean expResult = false;
        word.setName(null);
        boolean result = word.validate();
        Assert.assertEquals(result, expResult);

    }

    @Test
    public void testValidate3() {
        System.out.println(Word.class + "test3 validate");
        boolean expResult = false;
        word.setName(Constants.EMPTY);
        boolean result = word.validate();
        Assert.assertEquals(result, expResult);

    }

    /**
     * Test of countLetterInWord method, of class Word.
     */
    @Test
    public void testCountLetterInWord() {
        System.out.println(Word.class + "test countLetterInWord");
        char letter = 't';
        int expResult = 2;
        int result = word.countLetterInWord(letter);
        Assert.assertEquals(result, expResult);

    }

    @Test
    public void testCountLetterInWord2() {
        System.out.println(Word.class + "test2 countLetterInWord");
        char letter = 'e';
        int expResult = 1;
        int result = word.countLetterInWord(letter);
        Assert.assertEquals(result, expResult);

    }

    @Test
    public void testCountLetterInWord3() {
        System.out.println(Word.class + "test3 countLetterInWord");
        char letter = 'z';
        int expResult = 0;
        int result = word.countLetterInWord(letter);
        Assert.assertEquals(result, expResult);

    }

    /**
     * Test of getPositionOfLetters method, of class Word.
     */
    @Test
    public void testGetPositionOfLetters() {
        System.out.println(Word.class + "test getPositionOfLetters");
        char letter = 't';
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(0, 0);
        expResult.add(1, 3);
        ArrayList result = word.getPositionOfLetters(letter);
        Assert.assertEquals(result.get(0), expResult.get(0));
        Assert.assertEquals(result.get(1), expResult.get(1));
    }
}
