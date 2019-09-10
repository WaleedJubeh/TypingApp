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
 * @author Waleed Jubeh
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

    //  Normal test case
    //Test cleanString(String code)
    @Test
    public void cleanString_test1() {
        System.out.println(" Test cleanString(String code) function");
        String code = "int x=5;Size = 15";
        System.out.println("Input :\n" + code);
        String expected = "int x=5;Size = 15";
        assertEquals(expected, tester.cleanString(code));
    }

     //  Special characters test case
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
    
//  Special characters test case
    @Test
    public void cleanString_test3() {
        System.out.println(" Test cleanString(String code) function");
        String code = "cout<<\"Yes its me  \n \";";
        System.out.println("Input :\n" + code);
        String expected = "cout&lt;&lt;&quot;Yes its me  \n &quot;;";
        assertEquals(expected, tester.cleanString(code));
    }

    // Test  boolean compareWord(String orginal, String userInput)
    
    //Check for empty String parameters
    @Test
    public void compareWord_test1() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "";
        String userInput = "";
        assertTrue(tester.compareWord(Orginal, userInput));
    }

        //Normal test case
    @Test
    public void compareWord_test2() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "Waleed";
        String userInput = "waleed";
        boolean is_true = tester.compareWord(Orginal, userInput);
        assertFalse(is_true);
    }
    //Lets check special characters

    //Special character test case
    @Test
    public void compareWord_test3() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "<iostream>";
        String userInput = "<iostream>";
        assertTrue(tester.compareWord(Orginal, userInput));
    }
    
    //Lets make them be different by one character
    @Test
    public void compareWord_test4() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "aaaaaaaaaaa";
        String userInput = "aaaaaaaaaa";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    
    // Lets assume Orginal is empty string

    @Test
    public void compareWord_test5() {
        System.out.println("Test  boolean compareWord(String orginal, String userInput)");
        String Orginal = "";
        String userInput = "aaaaaaaaaa";
        assertFalse(tester.compareWord(Orginal, userInput));
    }
    
    
    //Lets assume userInput is empty string

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

    // Special character test case {
    @Test
    public void compareWord_test11() {
        String Orginal = "{";
        String userInput = "{";
        assertTrue(tester.compareWord(Orginal, userInput));
    }
    
  // Test public String getCurrentWord()
   
    // Normal test Case
    @Test
    public void getCurrentWord_test1() {
        tester.setText("string str1 = \"sister\";\n"
                + "string str2 = \"Sister\";\n"
                + "string relation;\n"
                + "int result;");
        String expected = "string";
        tester.setNewLine();// This function mean : point the first line of the text so The first word now is 'string'
        assertEquals(expected, tester.getCurrentWord());
    }

    // Normal test Case
    @Test
    public void getCurrentWord_test2() {

        tester.setText("string str1 = \"sister\";\n"
                + "string str2 = \"Sister\";\n"
                + "string relation;\n"
                + "int result;");
        tester.setNewLine();//Point to the first line
        String expected = "str1";
        tester.increase_CurrentWord();// Assume the first word of the line is written , now the target word is str1
        assertEquals(expected, tester.getCurrentWord());
    }
    // String is empty ("") in the object
    // enter the if branch
    @Test
    public void getCurrentWord_test3() {

        tester.setText("");
        tester.setNewLine();
        String expected = " ";//its a special case handled by the if statement
        assertEquals(expected, tester.getCurrentWord());
    }

    // All lines are written , so it should back to the first line.
    @Test
    public void getCurrentWord_test4() {

        tester.setText("import");
        tester.setNewLine();//first line is pointed
        tester.setNewLine();//second line is pointed but they are only one line , so it must point to the first line
        String expected = "import";
        assertEquals(expected, tester.getCurrentWord());
    }

    //Point to the third line
    @Test
    public void getCurrentWord_test5() {

        tester.setText("import <iostream>;\nUsing namespace std;\nint main()");
        tester.setNewLine();
        tester.setNewLine();
        tester.setNewLine();
        String expected = "int";//first word in the third line is 'int'
        assertEquals(expected, tester.getCurrentWord());
    }

    // if we reach last word in a line ,Focus in the next line
    @Test
    public void getCurrentWord_test6() {

        tester.setText("import <iostream>;\nUsing namespace std;\nint main()");
        tester.setNewLine();
        tester.increase_CurrentWord();//import written
        tester.increase_CurrentWord();// <iostream> written
        String expected = "Using";// now it must point to 'Using' in the next line
        assertEquals(expected, tester.getCurrentWord());
    }
    
    // Test  public ArrayList<String> getLines(int  numberOfLines)
    @Test
    public void getLines_test1() {

        tester.setText("import <iostream>;\nUsing namespace std;\nint main()");//Input
        String[] lines = "import <iostream>;\nUsing namespace std;\nint main()".split("\n");//Expected output
        ArrayList<String> recieved = tester.getLines(3);
        boolean isEqual = true;
        //Lets compare the expected output to input
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }
    
    //Check if we have only one line 
    //send back 3 lines when we already have only one line 
      @Test
    public void getLines_test2() {

        tester.setText("import <iostream>;");
        String[] lines = "import <iostream>;\n".split("\n");
        ArrayList<String> recieved = tester.getLines(3);
        boolean isEqual = true;
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }

        public void getLines_test3() {

        tester.setText("import <iostream>;");
        String[] lines = "import <iostream>;\n".split("\n");
        ArrayList<String> recieved = tester.getLines(1);
        boolean isEqual = true;
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }
        //What if we get 0 line ?
        @Test
        public void getLines_test4() {

        tester.setText("import <iostream>;");
        String[] lines = "import <iostream>;\n".split("\n");
        ArrayList<String> recieved = tester.getLines(0);
        boolean isEqual = true;
        for (int i = 0; i < recieved.size() && isEqual; i++) {
            if (recieved.get(i).equals(lines[i]) == false) {
                isEqual = false;
            }
        }

        assertTrue(isEqual);
    }  
}
