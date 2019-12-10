/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quiz;

import quiz.Quiz;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class QuizTest {
	int id;
	String operation;
	String operation2;
	String operation3;
	String operation4;
	ArrayList<Integer> operands;
	
	
	
	@Before
	public void setUp() {
		operands = new ArrayList<>();
		id = 123;
		operands.add(55);
		operands.add(20);
		operation = "A";
		operation2 = "M";
		operation3 = "D";
		operation4 = "S";
	}
	
	/*
	@Test
	public void testGetTextOfQuiz() {
	System.out.println("getTextOfQuiz");
	Quiz instance = new Quiz(id, operands, operation);
	Quiz instance2 = new Quiz(id, operands, operation2);
	Quiz instance3 = new Quiz(id, operands, operation3);
	Quiz instance4 = new Quiz(id, operands, operation4);
	String expResult = "";
	String result = instance.getQuizText();
	System.out.println(result);
	String result2 = instance2.getQuizText();
	System.out.println(result2);
	String result3 = instance3.getQuizText();
	System.out.println(result3);
	String result4 = instance4.getQuizText();
	System.out.println(result4);
	assertEquals(expResult, result);
	}
	*/
	@Test
	public void testGetDivAnswer() {
		System.out.println("getDivAnswer");
		Quiz instance = null;
		try {
			instance = new Quiz(id, operands, "D");
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		System.out.println(instance.getQuizText());
		System.out.println(instance.getAnswer());
		assertTrue(true);
	}
	
	/*
	@Test
	public void testGetAnswer() {
	System.out.println("getAnswer");
	Quiz instance = new Quiz(id, operands, operation);
	Quiz instance2 = new Quiz(id, operands, operation2);
	Quiz instance3 = new Quiz(id, operands, operation3);
	Quiz instance4 = new Quiz(id, operands, operation4);
	String expResult = "";
	String result2 = instance2.getAnswer();
	System.out.println(result2);
	String result3 = instance3.getAnswer();
	System.out.println(result3);
	String result4 = instance4.getAnswer();
	String result = instance.getAnswer();
	System.out.println(result);
	assertEquals(expResult, result);
	}
	*/
	
}
