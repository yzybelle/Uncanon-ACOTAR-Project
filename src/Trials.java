import java.util.ArrayList;

public class Trials
{
     int score;
     Trials (){
          this.score =0;
     }

     public void addScore(int num){
          score +=num;

     }
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
