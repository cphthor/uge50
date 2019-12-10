/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quiz;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thor
 */
public class QuizHandler {
	
	ArrayList<Quiz> questions;
	String[] operands = {"A","M","S","D"};
	Quiz quiz;
	
	public QuizHandler() {
		questions = new ArrayList<>();
	}
	
	public Quiz getQuiz(String operand, ArrayList<Integer> args) {
		Quiz quiz = null;
		quiz = new Quiz(0, args, operand);
		return quiz;
	}
	
	public ArrayList<Quiz> fillWithRandomQuestions(int sizeOfList) {
		Quiz tmpQuiz = null;
		int counter=0;
		int randInt1=0;
		int randInt2=0;
		String randStr="";
		int randRange = 50;
		ArrayList<Integer> args = new ArrayList<>();
		Random myRand = new Random();
		for (int i = 0; i < sizeOfList; i++) {
			do {
				args = new ArrayList<>();
				randInt1 = myRand.nextInt(randRange)+(2*randRange)+1;
				randInt2 = myRand.nextInt(randRange)+1;
				args.add(randInt1);
				args.add(randInt2);
				randStr = operands[(i%4)];
				tmpQuiz = getQuiz(randStr, args);
			} while (tmpQuiz.getAnswer() == -1);
			System.out.println(tmpQuiz);
			questions.add(tmpQuiz);
		}
		
		return questions;
	}
}
