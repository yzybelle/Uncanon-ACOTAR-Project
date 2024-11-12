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
               return true;
          }
          else{
               return false;
          }
     }

}
