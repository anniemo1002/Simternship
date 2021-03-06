package csc309.simternship;

//Dustyn Zierman-Felix
//Simternship
import java.util.*;
import java.io.*;

public class PrepQuestion 
{
	private String question;
	private String[] answers;
	private int correctAnswerIndex;


	public PrepQuestion(String q, String a1, String a2, String a3, String a4, int correct) {
		this.answers = new String[4];
		this.answers[0] = a1;
		this.answers[1] = a2;
		this.answers[2] = a3;
		this.answers[3] = a4;
		this.question = q;
		this.correctAnswerIndex = correct;
	}

	public String getQuestion() {
		return this.question;
	}

	public String[] getAnswers () {
		return this.answers;
	}

	public int getCorrectAnswerIndex() {
		return this.correctAnswerIndex;
	}

	/*Scanner kb = new Scanner(System.in);
	int correctAnswers, wrongAnswers, numberQuestion;
	
	//create map to store questions and their respective answers
	Map<String, String> prepQuestionMap = new HashMap<String, String>();
	
	//constructor
	PrepQuestion()
	{
		//set answer counters to 0
		numberQuestion = correctAnswers = wrongAnswers = 0;
		//fill the prepQuestionMap from txt file
		fillPrepQuestionMap();
	}
	
	//returns the size of the prepQuestionMap for testing purposes
	//to iterate through all the questions
	public int getPrepQuestionMapSize()
	{
		return prepQuestionMap.size();
	}
	
	//requires the txt doc to be formatted correctly
	//line 1: question, 2: answer, 3: whitespace, ...
	private void fillPrepQuestionMap()
	{
		List<String> answerList = new ArrayList<>();
		List<String> questionList = new ArrayList<>();
		
		File file = new File("prepQ.txt");
		Scanner inputFile;
		String question = "", answer = "";
		int lineCount = 0;
		
		try 
		{
			inputFile = new Scanner(file);
			while(inputFile.hasNextLine())
			{
				String line = inputFile.nextLine();
				
				if(line.length() > 0 && ((lineCount % 2) == 0))
				{
					questionList.add(line);
					lineCount++;
				}
				else if(line.length() > 0 && ((lineCount % 2) != 0))
				{
					answerList.add(line);
					lineCount++;
				}
			}
			inputFile.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found.");
		}
		
		//put the contents of the array lists in the prepQuestionMap
		for(int i = 0; i < questionList.size(); i++)
		{
			prepQuestionMap.put(questionList.get(i), answerList.get(i));
		}
	}
	
	//add questions from keyboard... probably pointless?
	public void addQuestion()
	{
		String question = "", answer = "";
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter Question:");
		question = kb.nextLine();
		System.out.println("Enter Answer:");
		answer = kb.nextLine();
		
		prepQuestionMap.put(question, answer);
	}
	
	//get a random question
	public void getQuestion()
	{	
		Random rand = new Random();
		int max = prepQuestionMap.size();
		int index = rand.nextInt(max);
		
		//make array lists out of the prepQuestionMap
		List<String> questions = new ArrayList<String>(prepQuestionMap.keySet());
		List<String> answers = new ArrayList<String>(prepQuestionMap.values());
		
		//validate answer
		checkAnswer(questions.get(index), answers.get(index));
		
		//delete question from map
		prepQuestionMap.remove(questions.get(index));
		numberQuestion++;
	}
	
	//case sensitive right
	private void checkAnswer(String question, String answer)
	{
		String userAnswer;
		
		//output the question
		System.out.println("Question " + (numberQuestion + 1) + ":");
		System.out.println(question);
		
		//get user's answer
		userAnswer = kb.nextLine();
		
		//answer correct?
		if(answer.toLowerCase().equals(userAnswer.toLowerCase())) //use toLowerCase() to get rid of case sensitivity
			incrementCorrectAnswers();
		else
			incrementWrongAnswers();
	}
	
	//increment correctAnswers int
	private void incrementCorrectAnswers()
	{
		correctAnswers++;
	}
	//increment wrongAnswers int
	private void incrementWrongAnswers()
	{
		wrongAnswers++;
	}
	
	//output number of correct vs. wrong answers
	public void getStats()
	{	
		System.out.println("Correct Answers: " + correctAnswers);
		System.out.println("Wrong Answers: " + wrongAnswers);
	}*/
	
	/*
	//to view all questions
	public void viewQuestions()
	{
		System.out.println("Here are all the questions and their respective answers:\n");
		
		for (java.util.Map.Entry<String, String> entry : prepQuestionMap.entrySet()) 
		{
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}*/
}