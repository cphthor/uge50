/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import quiz.QuizHandler;
import quiz.Quiz;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class QuizHandlerTest {
	
	public QuizHandlerTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testFillWithRandomQuestions() {
		System.out.println("fillWithRandomQuestions");
		int sizeOfList = 10;
		QuizHandler instance = new QuizHandler();
		ArrayList<Quiz> resultList = instance.fillWithRandomQuestions(sizeOfList);
		for (Quiz quiz : resultList) {
			System.out.println(quiz.getQuizText());
		}
		int expResult = 10;
		int actual = resultList.size();
		assertEquals(expResult, actual);
	}
	
}
