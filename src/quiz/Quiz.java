package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author thor
 */
public class Quiz implements QuizInterface{
	int id;
	HashMap<String, String> operations;
	String operation;
	int answer;
	ArrayList<Integer> operands;
	String textOfQuiz;
	
	
	public Quiz(int id, ArrayList<Integer> operands, String operation) {
		this.id = id;
		this.operation = operation;
		this.operands = operands;
		initMap();
		this.setTextOfQuiz();

	}

	public void initMap() {
		this.operations = new HashMap<String, String>();
		operations.put("A", "add");
		operations.put("M", "multiply");
		operations.put("S", "subtract");
		operations.put("D", "divide");

	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setAnswer() {
		this.answer = getAnswer();
	}
	public void setTextOfQuiz() {
		String tmpTxt = "What is ";
		tmpTxt += " " + operands.get(0) + " " + operations.get(operation)
			+ " " + operands.get(1) + "?";
		this.textOfQuiz = tmpTxt;
	}
	
	@Override
	public String getQuizText() {
		String retVal = textOfQuiz;
		return retVal;
	}
	
	@Override
	public int getAnswer() {
		//String[] operations = {"addition","subtraction","multiplication","division"};
		int retVal = 0;
		switch(operation) {
			case "A":
				retVal =  operands.get(0) + operands.get(1); break;
				//retVal =  Integer.toString(operands.get(0) + operands.get(1)); break;
			case "M":
				retVal = operands.get(0) * operands.get(1); break;
			case "S":
				//retVal =  Integer.toString(operands.get(0) - operands.get(1)); break;
				retVal =  operands.get(0) - operands.get(1); break;
			case "D":
				retVal = -1;
					if (operands.get(0) % operands.get(1)==0){
						retVal =  operands.get(0) / operands.get(1);
					} 
					break;
		}
		return retVal;
	}
	
	
}
