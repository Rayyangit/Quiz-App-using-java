import java.util.Scanner;

public class QuestionService {
  Questions[] questions = new Questions[5];
  String selection[]=new String[5];

  public QuestionService() {
    questions[0] = new Questions(1, "Language invented in 1995", "1.java", "2.cpp", "3.python", "4.csharp", "1.java");
    questions[1] = new Questions(2, "Procedural language", "1.java", "2.c", "3.python", "4.csharp", "2.c");
    questions[2] = new Questions(3, "Size of int", "1.1byte", "2.2byte", "3.3byte", "4.4byte", "2.2byte");
    questions[3] = new Questions(4, "vowels in English", "1.abc", "2.aeiou", "3.eioz", "4.hfj", "2.aeiou");
    questions[4] = new Questions(5, "low-level language", "1.java", "2.Assembly", "3.python", "4.csharp", "2.Assembly");
  }

  public void playquiz() {
    int i = 0;
    for (Questions q : questions) {
      i++; // Increment question number
      System.out.println("Question no.:" + i);
      System.out.println(q.getQuestions());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i-1] = sc.nextLine(); // Store the answer at index i - 1
    }
    for (String s : selection) {
      System.out.println(s);
    }

  }
  public void printscore(){
    int score=0;
    for (int i=0;i<questions.length;i++){
      Questions que= questions[i];
      String actualanswer= que.getAnswer();
      String useranswer= selection[i];
      if(actualanswer.equals(useranswer)){
        score++;
      }

    }
    System.out.println("your score is :" +score);
  }

}