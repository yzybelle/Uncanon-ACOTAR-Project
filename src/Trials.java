import java.util.ArrayList;
// This class is meant to create s trial for each chapter of the story.

public class Trials
{
     /**
      * Constructor for the Trials class. This creates a new instance of an
      * object that would call to the following methods.
      */
     int score;
     Trials (){
          this.score =0;
     }
     /**
      * addScore method for the Trials class. It adds a value to the
      * variable score.
      *
      * @param num represents the score a person will receive when
      * entering a certain value in a trial.
      */
     public void addScore(int num){
          score +=num;

     }

     /**
      * trialOne method checks if the score is even or odd, and
      * when that conclusion is reached, sets score to 0.
      *
      * @return returns a Boolean that, within context of
      * the runner class storyline, would determine whether
      * Feyre would shoot the arroq
      */

     public Boolean trialOne(){
          if (score%2==0){
               score=0;
               return true;

          }
          else{
               score=0;
               return false;
          }
     }

     /**
      * trialTwo method determines whether the number the user inputted x added to itself the length of
      * the string y is greater than the sum of two integers randomly chosen between 1 and 21.
      *
      * @param x represents the number the user will input for trial two.
      * @param y represents the string the user will input that corresponds
      *          with an emotion.
      * @return returns a number that is either positive or negative
      * depending on if the number the user had inputted for x added onto itself
      * iterated by the amount of letters they inputted for y subtracted by
      * the sum of two random integers each between 1 and 21.
      */

     public int trialTwo(int x, String y){

     int num1 = (int) (Math.random()*21+1);
     int num2 = (int) (Math.random()*21+1);
     int number = 0;
     for(int i = 0; i < y.length(); i++){
          number +=x ;
     }

     return (number-(num1+num2)) ;

     }

}
