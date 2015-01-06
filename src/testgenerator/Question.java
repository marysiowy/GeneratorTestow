package testgenerator;



public class Question {
	
	private String unitName;
	
	private String questionType;	
	
	private String questionText;
	
	private String answer;
	
	private String answerCorrect;
	
	public Question(){
		
	}
	
	public Question(String unitName, String questionType, String questionText, String answer, String answerCorrect) {
		this.unitName = unitName;
		this.questionType = questionType;
		this.questionText = questionText;
		this.answer = answer;
		this.answerCorrect = answerCorrect;
	}
	
	public String getUnitName() {
		return unitName;
	}
	
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}
	public String getQuestionType() {
		return questionType;
	}
	
	public void setQuestionType(String questionType){
		this.questionType = questionType;
	}
	
	public String getQuestionText() {
		return questionText;
	}
	
	public void setQuestionText(String questionText){
		this.questionText = questionText;
	}
	public String getAnswer(){
		return answer;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}	
	public String getAnswerCorrect(){
		return answerCorrect;
	}
	
	public void setAnswerCorrect(String answerCorrect){
		this.answerCorrect = answerCorrect;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Unit name: " + getUnitName());
		sb.append("\n");
		sb.append("Question Type: " + getQuestionType());
		sb.append("\n");
		sb.append("Question: " + getQuestionText());
		sb.append("\n");
		sb.append("Answer: " + getAnswer());
		
		return sb.toString();
	}
	
}