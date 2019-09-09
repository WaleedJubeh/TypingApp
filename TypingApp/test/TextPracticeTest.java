/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import typingapp.TextPractice;

/**
 *
 * @author Relax
 */
public class TextPracticeTest {

    TextPractice tester = new TextPractice();

    public TextPracticeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
         tester = new TextPractice();
    }

    //Test cleanString(String code)
    @Test
    public void cleanString_test1() {
        System.out.println(" Test cleanString(String code) function");
        String code = "int x=5;Size = 15";
        System.out.println("Input :\n" + code);
        String expected = "int x=5;Size = 15";
        assertEquals(expected, tester.cleanString(code));
    }

    @Test
    public void cleanString_test2() {
        System.out.println(" Test cleanString(String code) function");
        String code = "import Java.*;\n"
                + "import <iostream>;\n";
        System.out.println("Input :\n" + code);
        String expected = "import Java.*;\n"
                + "import &lt;iostream&gt;;\n";
        assertEquals(expected, tester.cleanString(code));
    }

    @Test
    public void cleanString_test3() {
        System.out.println(" Test cleanString(String code) function");
        String code = "cout<<\"Yes its me  \n \";";
        System.out.println("Input :\n" + code);
        String expected = "cout&lt;&lt;&quot;Yes its me  \n &quot;;";
        assertEquals(expected, tester.cleanString(code));
    }

    // Test  boolean compareWord(String orginal, String userInput)
    //Check for empty parameters
    @Test
    public void compareWord_test1() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "";
        String userInput = "";
        assertTrue(tester.compareWord(Orginal, userInput));
    }

    @Test
    public void compareWord_test2() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "Waleed";
        String userInput = "waleed";
        boolean is_true = tester.compareWord(Orginal, userInput);
        assertFalse(is_true);
    }
    //Lets check special characters

    @Test
    public void compareWord_test3() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "<iostream>";
        String userInput = "<iostream>";
        assertTrue(tester.compareWord(Orginal, userInput));
    }
    //Lets make they both different by one character

    @Test
    public void compareWord_test4() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "aaaaaaaaaaa";
        String userInput = "aaaaaaaaaa";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    // Lets assume Orginal is empty

    @Test
    public void compareWord_test5() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "";
        String userInput = "aaaaaaaaaa";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    //Lets assume userInput is empty

    @Test
    public void compareWord_test6() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "aaaaaaaaaaa";
        String userInput = "";
        assertFalse(tester.compareWord(Orginal, userInput));
    }

    @Test
    // userinput length is less than the orginal
    public void compareWord_test7() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "import";
        String userInput = "imp";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    //userinput length is bigger than Orginal by one 

    @Test
    public void compareWord_test8() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "import";
        String userInput = "imports";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    // Lets make Orginal = null

    @Test
    public void compareWord_test9() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");

        String Orginal = null;
        String userInput = "imports";
        assertFalse(tester.compareWord(Orginal, userInput));
    }

    // Lets make userInput =null
    @Test
    public void compareWord_test10() {
        String Orginal = "import";
        String userInput = null;
        assertFalse(tester.compareWord(Orginal, userInput));
    }

    // Input with {}
    @Test
    public void compareWord_test11() {
        String Orginal = "{";
        String userInput = "{";
        assertTrue(tester.compareWord(Orginal, userInput));
    }

}
