
import java.util.Scanner;

class Question {
    Scanner sc = new Scanner(System.in);
    String[] ques = new String[3];
    String[] ans = new String[3];
    String[] user_ans = new String[3];
    int correct_ans=0;
    int wronng_answer=0;
    long starTime;
    long endTime;
    public void starttimer(){
        starTime=System.currentTimeMillis();}
    public void endtimer(){
        endTime=System.currentTimeMillis();}
    public long quaddtime(){
        return (endTime-starTime)/1000;
    }
    public void accept_ans(){
        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);
            user_ans[i] = sc.nextLine();
            user_ans[i].toLowerCase();
        }
    }
    public void check_ans(){
        for (int i = 0; i < user_ans.length; i++) {
            if (ans[i].equalsIgnoreCase(user_ans[i])) { // Using equalsIgnoreCase for case-insensitive comparison
                System.out.println("Correct answer");
                correct_ans++;
            } else {
                System.out.println("Wrong answer");
                wronng_answer++;
            }
        }
    }
    public void domain_1() {
        ques[0] = "Who is our PM?";
        ans[0] = "narendra Modi";
        ques[1] = "Who is CM of Rajasthan?";
        ans[1] = "ashok Gehlot";
        ques[2] = "Who is the President of India?";
        ans[2] = "aroupadi Murmu";}

    public void domain_2() {
        ques[0] = "Who is our pm of india";
        ans[0] = "naredra modi";
        ques[1] = "Who was CM of Rajasthan in year 2020-2024?";
        ans[1] = "Ashok Gehlot";
        ques[2] = "Who was the previous President of India?";
        ans[2] = "Ram Nath Kovind";
    }
}

public class quizwithtimer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question ques = new Question();

        System.out.println("Please Select Your Domain\n(1) > General Knowledge 1\n(2) > General Knowledge 2");
        int user = sc.nextInt();
        sc.nextLine();  // Consume newline left-over
        System.out.println("User decision is " + user);
        while (true) {


            if (user == 1) {
                ques.domain_1();
            } else if (user == 2) {

                ques.domain_2();

            } else {
                System.out.println("No domain is present you entered");
            }
            ques.starttimer();
            ques.accept_ans();
            ques.check_ans();
            ques.endtimer();
            System.out.println("you achived"+ques.correct_ans+"/3");
            System.out.println("completion time is "+ ques.quaddtime()+"seconds");
            System.out.println("Press key-1 to exit and 0 to continue");
            int number=sc.nextInt();
            if(number==1){
                System.out.println("thankyou for using our app Exited");
                break;}
            else if (number==0) {
                System.out.println("you press 0 to continue");
                continue;
            }
            else{
                System.out.println("invalid key"+number);
                break;}
        }
        sc.close();
    }

    public static class grade_calculator {
        public static void main(String[] args) {
            System.out
                    .println("                      WELCOME TO JECRC GRADE CALCULATOR                                   ");

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your name");
            String name = sc.nextLine();
            System.out.println("enter your subjects");
            int num = sc.nextInt();
            int[] mks = new int[num];

            for (int i = 0; i < num; i++) {
                System.out.println("subject code=000" + i);
                System.out.println("ENTER YOUR MARKS ACHIEVED IN THAT SUBJECT" + "subject code=000" + i);
                int marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    mks[i] = marks;
                } else {
                    System.out.println("wrong input entered");
                }
            }
            float avg = (mks[0] + mks[1] + mks[2] + mks[3] + mks[4]) * 100 / 500;
            System.out.println("perscentage=" + avg);
            if (avg >= 85 && avg <= 100) {
                System.out.println("grade A");
            } else if (avg >= 75 && avg <= 84.99) {
                System.out.println("grade b");
            } else if (avg >= 65 && avg <= 74.99) {
                System.out.println("grade c");
            } else if (avg >= 55 && avg <= 64.99) {
                System.out.println("grade d");
            } else if (avg >= 45 && avg <= 54.99) {
                System.out.println("grade e");
            } else {
                System.out.println("fail");
                System.out.println("sorry you are fail mr" + " " + name);
                System.out.println("please focus on studies");
            }
            System.out.println("                    Thankyou for your time                        ");
            System.out.println("                           EXIT                                   ");
        }
    }
}