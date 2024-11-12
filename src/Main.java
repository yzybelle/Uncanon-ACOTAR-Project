import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Canon canon = new Canon();
     Trials trials = new Trials();


        System.out.println("Welcome to Uncanon ACOTAR!\n" +
                "This is a choose your own adventure game based off the hit book series \"A Court of Thorns and Roses\"\n" +
                "All code belong to Ysabelle Ramirez\n" +
                "_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n" +
                "Feyre despised being the sole provider for her family. Her sisters, wrapped up in their own sense of entitlement, refused to lift a finger to help, and her father—despite his weak attempts—was all but useless.\n" +
                "Years ago, his leg had been shattered by the ruthless loan collectors, but it was the reckless investment he’d made, one that had drained their savings and led to their downfall, that truly condemned them." +
                "\n" +
                "Feyre couldn't forgive him for it. The man who had once been a proud merchant had not only squandered their money but also broken the fragile safety they once had.\n" +
                "She only felt a faint stir of pity for the man who had, in his own way, doomed them all. Now, it was all on her.\n" +
                "\n" +
                "Though she never said it aloud, a part of her longed for something better than the grinding poverty they faced—a life where hunger wasn't a constant companion, and survival didn't feel like an endless battle.\n" +
                "_________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        System.out.println("Trial One: Feyre meets her fate\n" +
                "Feyre was hiding on top of a birch tre branch, the harsh winters making it difficult for her to find prey that hadn't already migrated or gone into hibernation.\n" +
                "Snow flakes landed in her eyelashes, melting as they encountered her bodywarmth, making it difficult for her to see. But despite that, it wasn't long before she saw a\n" +
                "white-tailed deer grazing it's nose on the cold snow bed. She carefully took out her worn out bow and silently prepared to pull the bowstring\n" +
                "when she spotted a larger, darker figure looming behind the deer. A wolf. But not a normal wolf. It's coat was shiny, shimmering almost,\n" +
                "encapsulating a size so large and unnatural that it couldn't have been anything other than a Faerie. But Faerie hadn't crossed the border in decades.\n" +
                "How could it have been here? But it didn't matter to Feyre. She hated them. They were violent and killed so many humans in the Great War\n" +
                "it was only reasonable to kill it.");
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        System.out.println("Welcome to your first trial. You are expected to answer four questions carefully.\n" +
                "One wrong answer will change the plot permanently. Choose carefully...\n ");

        Scanner trialOneQuest = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many fingers are there on an average person's hand?");
        String answer = trialOneQuest.nextLine();

        if (answer.equals("5")) {
            trials.addScore(2);
        }
        else{
            trials.addScore(1);
        }
        System.out.println("What is the largest continent?");
        String answer2 = trialOneQuest.nextLine();

        if (answer2.equals("Asia")||answer2.equals("asia")) {
            trials.addScore(2);
        }
        else{
            trials.addScore(1);
        }
        System.out.println("Does Feyre love her family? (Trick Question)");
        String answer3 = trialOneQuest.nextLine();
        if (answer2.equals("yes")||answer2.equals("Yes")) {
            trials.addScore(2);
        }
        else{
            trials.addScore(1);
        }
        System.out.println("Is the wolf a faerie...? (Trick Question)");
        String answer4 = trialOneQuest.nextLine();
        if (answer2.equals("yes")||answer2.equals("Yes")) {
            trials.addScore(2);
        }
        else{
            trials.addScore(1);
        }

        if(trials.trialOne()){
            System.out.println("Yay");
        }
        else{
            System.out.println("bye!");
        }

    }
}