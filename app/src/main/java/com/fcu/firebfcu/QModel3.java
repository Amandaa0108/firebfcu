package com.fcu.firebfcu;

public class QModel3 {

    String qImage;

    String qText;

    String ans1;

    String ans2;

    String ans3;

    public QModel3(String qImage, String qText, String ans1, String ans2, String ans3, char answer) {
        this.qImage = qImage; this.qText = qText; this.ans1 = ans1; this.ans2 = ans2; this.ans3 = ans3; this.answer = answer; }

    public String getqImage() {
        return qImage;
    }

    public void setqImage(String qImage) {
        this.qImage = qImage;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    char answer;

}