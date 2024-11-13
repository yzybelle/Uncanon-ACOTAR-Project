import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Trials trials = new Trials();
     Feyre feyre = new Feyre();


//INTRODUCE NESTA AND ELAIN
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
                "it was only reasonable to kill it. It's eyes were set on the deer. The poor innocent deer. Feyre couldn't let it get her family's dinner.\n" +
                "A moment later, it lunged for the deer's neck.");
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        System.out.println("Welcome to your first trial. You are expected to answer four questions carefully.\n" +
                "One wrong answer will change the plot permanently. Choose carefully...\n ");

        Scanner trialOneQuest = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many fingers are there on an average person's hand?");
        String answer = trialOneQuest.nextLine();

        if (answer.equals("5")||answer.equals("five")||answer.equals("Five")) {
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
            feyre.addkarma();
            System.out.println("\nShe fired the ash arrow before it destroyed much else of the deer." +
                    "The arrow found its mark in it's side, and she could have sworn the ground itself shuddered. \nIt" +
                    "barked in pain, releasing the doe’s neck as it's blood sprayed on the snow—so ruby bright." +
                    "It whirled towards her, those yellow eyes wide, hackles raised. \nIt's low growl reverberated in the" +
                    "empty pit of my stomach as she surged to her feet, snow churning around her, another arrow drawn.\n" +
                    "But the wolf merely looked at her, it's maw stained with blood, her ash arrow protruding so" +
                    "vulgarly from his side. The snow began falling again. It looked, and with a sort of awareness and" +
                    "surprise that made her fire the second arrow. \nJust in case—just in case that intelligence was of the" +
                    "immortal, wicked sort." + "It didn’t try to dodge the arrow as it went clean through it's wide yellow eye.\n" +
                    "It collapsed to the ground." +
                    "Though it wasted precious minutes—minutes during which any predator could smell the fresh\n" +
                    "blood—Feyre skinned him and cleaned her arrows as best she could.");
        }
        else{
            feyre.minuskarma();
            System.out.println("She fired the ash arrow before it destroyed much else of the deer. The arrow grazed it's ears, dealing no damage and directing it's attention to her.\n" +
                    "The deer ran off quickly, leaving nothing but her and that...wolf. It's yellow eyes pierced through her as she grabbed her bow,\n" +
                    "hopping off the tree and running towards the denser parts of the forest. But she wasn't as fast as she thought. She heard it's four paws hitting the snow,\n" +
                    "catching up faster and faster until she fell to the ground as 230 pounds lunged on top of her. She flipped over on her back as it's teeth bared, dripping its thick\n" +
                    "saliva on her face. She grabbed the pocketknife she had placed on her belt loop and stabbed it through it's eye. She could feel the exact moment it had hit it's brain, \n" +
                    "it's legs going limp and it's body falling over her. She rolled it off her body and Though it wasted precious minutes—minutes during which any predator could smell the fresh\n" +
                    "blood—Feyre skinned him and cleaned her arrows as best she could. ");
        }

        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Trial Two: Feyre meets the Beast\n");
        System.out.println("Later, after another dinner of venison, when Feyre and her family were all gathered around the fire for the quiet hour before bed, she watched her sisters whispering and laughing together.\n" +
                "They’d spent every copper Feyre had given them—on what, she didn’t know, though Elain had brought back a new chisel for their father’s wood carving. The cloak and boots they’d whined about the night before had been too expensive.\n" +
                "But Feyre hadn’t scolded them for it, not when Nesta went out a second time to chop more wood without asking Feyre. Her father was dozing in his chair, his cane laid across his gnarled knee.\n" +
                "As good a time as any to broach the subject of saving money with Nesta. Feyre turned to her, opening her mouth.\n" +
                "But there was a roar that half deafened Feyre, and her sisters screamed as snow burst into the room and an enormous, growling shape appeared in the doorway.\n" +
                "“MURDERERS!” the beast roared again, hackles raised.\n" +
                "“P-please,” their father babbled from behind Feyre, failing to find it in himself to come to her side.\n" +
                "“Whatever we have done, we did so unknowingly, and—”\n" +
                "“W-w-we didn’t kill anyone,” Nesta added, choking on her sobs, arm lifted over her head, as if that tiny iron bracelet would do anything against the creature.\n" +
                "“I smell him on you, and you dare lie?” he growled even louder"+
                "\"Feyre sold its hide at the market today. If she had known it was a faerie, she wouldn’t have touched it.” Nesta shouted. Feyre's neck snapped to her youngest sister.\n" +
                 "“Liar,” he snarled, eyes landing on Feyre. “You knew. You would have been more tempted to slaughter it had you known it was one of my kind.”\n" +
                 "True, true, true. “Can you blame me?”\n"+
                "Feyre’s knees quaked. She couldn’t escape this, couldn’t outrun this. Couldn't even try to run, since he blocked the way to the door. “If you're going to kill me, do it outside,” she whispered, her voice trembling.\n" +
                "“Not... here.” Not where her family would have to wash away her blood and gore. If he even let them live.\n"+
                "The faerie huffed a vicious laugh. “Willing to accept your fate so easily?” When Feyre just stared at him, he said, “For having the nerve to request where I slaughter you, I’ll let you in on a secret, human:\n" +
                "Prythian must claim your life in some way, for the life you took from it. So as a representative of the immortal realm, I can either gut you like swine, or … you can cross the wall and live out the remainder of your days in Prythian.”\n" +
                "Feyre blinked. “What?”\n" +
                "He said slowly, as if Feyre were indeed as stupid as a swine, “You can either die tonight or offer your life to Prythian by living in it forever, forsaking the human realm.”");

        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Normally, I'd give you the choice to choose. But now, you must leave the future to fate.\n Will you go with the beast? Or will you be banished to the Faerie land of Prythian?");
        Scanner trialTwoQuest = new Scanner(System.in);
        System.out.println("Choose any number that will determine your fate");
        String num = trialTwoQuest.nextLine();
        int number = Integer.parseInt(num);
        System.out.println("If you were Feyre, what emotion would you be feeling? Hint: The MORE you feel is how much you want to live!!!");
        String emo = trialTwoQuest.nextLine();
        int trialTew = trials.trialTwo(number,emo);
        //Greater than 0 means YES!!!!!!! SHE LIVES!!!
        if(trialTew>=0){
            System.out.println("Feyre loosened her grip on the dagger and stared into the green eyes before asking, “When do we go?” She could smell her doom on his breath as he replied, “Now.”\n" +
                    "\n" +
                    "“The venison should last two weeks,” Feyre said to her father as she bundled up against the cold. “Start on the fresh meat, then the jerky. You know how to make it.”\n" +
                    "“Feyre—” her father breathed, but she kept going.\n" +
                    "“I left the money on the dresser,” she added. “It’ll last if you’re careful.”\n" +
                    "\n" +
                    "She looked at her father for a moment, memorizing his face. Her eyes stung, but she blinked the tears away. “When spring comes, hunt by Silverspring Creek. Ask Isaac Hale about snares—I taught him last year.”\n" +
                    "\n" +
                    "Her father nodded, his hand over his mouth. The beast’s growl came from outside. Feyre glanced at her sisters, huddled by the fire, still too scared to move.\n" +
                    "Elain mouthed her name, but Feyre turned to Nesta, whose cold gaze mirrored their mother’s.\n" +
                    "“Don’t marry Tomas Mandray,” Feyre said quietly. “His father beats his wife, and none of his sons stop him. Bruises are harder to hide than poverty.”\n" +
                    "Nesta’s eyes widened, but she said nothing.\n" +
                    "\n" +
                    "Feyre turned to leave, but her father’s hand gripped her arm. Outside, the beast snarled.\n" +
                    "“Feyre,” he said, his voice cracking. He squeezed her hands, his eyes clear for the first time in years. “You were always too good for this place, for us. If you ever escape, don’t come back.”\n" +
                    "Feyre’s heart twisted, but she nodded.\n" +
                    "“Go somewhere new,” her father whispered, shaking her by the shoulders. “Make a name for yourself.”");
        }
        else{
            System.out.println("Feyre loosened her grip on the dagger, her voice steady despite the fear. “I’d rather die than go with you.”\n" +
                    "\n" +
                    "The faerie’s eyes darkened, but he didn’t move to strike. Instead, he watched  her for a long moment, something unspoken passing between them. He understood her defiance—he understood why she’d rather die than submit. But he wouldn’t let her die.\n" +
                    "\n" +
                    "“So be it,” he said, his voice low. He stepped forward, his hand locking onto her arm with unyielding strength. Feyre tried to pull away, but his grip was like iron.\n" +
                    "\n" +
                    "“You’re coming with me,” he said, voice soft but final.\n" +
                    "\n" +
                    "She glanced back at her father and sisters, their faces pale and tear-stricken. She wanted to stay—to die here with them—but she knew it was pointless. He wasn’t going to kill her. Not yet.\n" +
                    "\n" +
                    "Her heart twisted as the faerie dragged her toward the door, out into the cold night. “You’ll come with me, Feyre,” he repeated. “There’s no other way.”\n" +
                    "\n" +
                    "Feyre’s gaze met his for a brief moment, and in that fleeting glance, she saw something—a flicker of understanding, maybe even pity. But it was gone in an instant.\n" +
                    "\n" +
                    "And as the faerie pulled her into the darkness, Feyre knew her fate was sealed. She would live, but not here. Not in her world.");
            System.out.println();
        }
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________");







    }
}