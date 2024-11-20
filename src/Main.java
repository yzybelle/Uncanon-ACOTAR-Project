import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

     Trials trials = new Trials();
     Feyre feyre = new Feyre();
     Tamlin tamlin = new Tamlin();

     String RESET = "\u001B[0m";
     String GREEN = "\u001B[32m";

     String stats = (GREEN +   "_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n\n" + RESET +
             "Feyre\n\uD83D\uDC4D Karma: "+ feyre.getKarma()+"\n\n"+ GREEN+ "_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n\n"
              + RESET + "Tamlin\n\uD83D\uDD25 Anger: " + tamlin.getAnger()+"\n\uD83E\uDEC0 Love: "+tamlin.getLove()+ GREEN+  "\n\n_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n\n" + RESET);

//INTRODUCE NESTA AND ELAIN
        System.out.println("Welcome to Uncanon ACOTAR!\n" +
                "This is a choose your own adventure game based off the hit book series \"A Court of Thorns and Roses\"\n" +
                "All code belong to Ysabelle Ramirez\n" + GREEN +
                "_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n" + RESET+
                "Feyre resented being the sole provider for her family. Her sisters, Nesta and Elain, and their father were of no help. Her father’s reckless investment years ago had ruined them,\nleaving Feyre to shoulder the burden of survival alone. " +
                "\n" +
                "Nesta, the eldest, blamed Feyre for their situation, despite her own stubbornness and pride. Elain, the gentle middle sister, was too naive to understand the harsh reality they faced. \n\nFeyre loved her sisters, but their ignorance made the struggle even harder. The fight to survive was hers alone, and it felt endless.\n" + GREEN+
                "_________________________________________________________________________________________________________________________________________________________________________________________________________________________"+RESET);

        System.out.println("TRIAL ONE: FEYRE MEETS HER FATE\n" + GREEN+
                "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET +
                "\n" +
                "Feyre was hiding on top of a redwood tree branch, the harsh winters making it difficult for her to find prey that hadn't already migrated or gone into hibernation.\n" +
                "\n" +
                "Snowflakes melted on her lashes as Feyre squinted through the blur. Ahead, a white-tailed deer grazed the snowy ground, and she quietly readied her bow. But then, a massive, dark shape appeared— a wolf. No ordinary wolf.\n" +
                "\n" +
                "Its sleek, shimmering coat and unnatural size screamed Faerie, though they hadn’t crossed the border in decades. Feyre’s gut tightened. She hated them. They had slaughtered so many during the Great War. This one was no different.\n\n" +
                "It had its sights on the deer, and Feyre wouldn’t let it steal her family’s only meal.\n" +
                "\n" +
                "A heartbeat later, the wolf lunged.\n" );
        System.out.println(GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);

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
            System.out.println(stats);
            System.out.println("\nShe fired the ash arrow before it destroyed much else of the deer. The arrow found its mark in it's side, and she could have sworn the ground itself shuddered.\n\n" +
                    "It barked in pain, releasing the doe’s neck as it's blood sprayed on the snow—so ruby bright. It whirled towards her, those yellow eyes wide, hackles raised.\n\n" +
                    "It's low growl reverberated in the empty pit of her stomach as she surged to her feet, snow churning around her, another arrow drawn.\n" +
                    "\n" +
                    "But the wolf merely looked at her, it's maw stained with blood, her ash arrow protruding so vulgarly from his side. The snow began falling again. It looked, and with a sort of awareness and\n\n" +
                    "surprise that made her fire the second arrow. Just in case—just in case that intelligence was of the immortal, wicked sort. It didn’t try to dodge the arrow as it went clean through it's wide yellow eye.\n\n" +
                    "It collapsed to the ground. Though it wasted precious minutes—minutes during which any predator could smell the fresh blood—Feyre skinned him and cleaned her arrows as best she could.");
        }
        else{

            feyre.minuskarma();
            System.out.println(stats);
            System.out.println("She fired the ash arrow before it destroyed much else of the deer. The arrow grazed it's ears, dealing no damage and directing it's attention to her.\n\n" +
                    "The deer ran off quickly, leaving nothing but her and that...wolf. It's yellow eyes pierced through her as she grabbed her bow,\n\n" +
                    "hopping off the tree and running towards the denser parts of the forest. But she wasn't as fast as she thought. She heard it's four paws hitting the snow,\n\n" +
                    "catching up faster and faster until she fell to the ground as 230 pounds lunged on top of her. She flipped over on her back as it's teeth bared, dripping its thick\n\n" +
                    "saliva on her face. She grabbed the pocketknife she had placed on her belt loop and stabbed it through it's eye. She could feel the exact moment it had hit it's brain, \n\n" +
                    "it's legs going limp and it's body falling over her. She rolled it off her body and Though it wasted precious minutes—minutes during which any predator could smell the fresh\n\n" +
                    "blood—Feyre skinned him and cleaned her arrows as best she could. ");
        }

        System.out.println(GREEN+  "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("Trial Two: Feyre meets the Beast\n");
        System.out.println("Later, after another dinner of venison, when Feyre and her family were all gathered around the fire for the quiet hour before bed, she watched her sisters whispering and laughing together.\n\n" +
                "They’d spent every copper Feyre had given them—on what, she didn’t know, though Elain had brought back a new chisel for their father’s wood carving. The cloak and boots they’d whined about the night before had been too expensive.\n\n" +
                "But Feyre hadn’t scolded them for it, not when Nesta went out a second time to chop more wood without asking Feyre. Her father was dozing in his chair, his cane laid across his gnarled knee.\n\n" +
                "As good a time as any to broach the subject of saving money with Nesta. Feyre turned to her, opening her mouth. But there was a roar that half deafened Feyre, and her sisters screamed as snow burst into the room and an enormous, \n\n" +
                "growling shape appeared in the doorway.\n\n" +
                "“MURDERERS!” the beast roared again, hackles raised.\n\n" +
                "“P-please,” their father babbled from behind Feyre, failing to find it in himself to come to her side.\n\n" +
                "“Whatever we have done, we did so unknowingly, and—”\n\n" +
                "“W-w-we didn’t kill anyone,” Nesta added, choking on her sobs, arm lifted over her head, as if that tiny iron bracelet would do anything against the creature.\n\n" +
                "“I smell him on you, and you dare lie?” he growled even louder\n\n"+
                "\"Feyre sold its hide at the market today. If she had known it was a faerie, she wouldn’t have touched it.” Nesta shouted. Feyre's neck snapped to her youngest sister.\n\n" +
                 "“Liar,” he snarled, eyes landing on Feyre. “You knew. You would have been more tempted to slaughter it had you known it was one of my kind.”\n\n" +
                 "True, true, true. “Can you blame me?”\n\n"+
                "Feyre’s knees quaked. She couldn’t escape this, couldn’t outrun this. Couldn't even try to run, since he blocked the way to the door. “If you're going to kill me, do it outside,” she whispered, her voice trembling.\n\n" +
                "“Not... here.” Not where her family would have to wash away her blood and gore. If he even let them live.\n\n"+
                "The faerie huffed a vicious laugh. “Willing to accept your fate so easily?” When Feyre just stared at him, he said, “For having the nerve to request where I slaughter you, I’ll let you in on a secret, human:\n\n" +
                "Prythian must claim your life in some way, for the life you took from it. So as a representative of the immortal realm, I can either gut you like swine, or … you can cross the wall and live out the remainder of your days in Prythian.”\n\n" +
                "Feyre blinked. “What?”\n\n" +
                "He said slowly, as if Feyre were indeed as stupid as a swine, “You can either die tonight or offer your life to Prythian by living in it forever, forsaking the human realm.”");
                 tamlin.addAnger();
                 System.out.println(stats);

        System.out.println(GREEN+ "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("You must leave the future to fate.\n Will you go with the beast? Or will you be banished to the Faerie land of Prythian?");
        Scanner trialTwoQuest = new Scanner(System.in);
        System.out.println("Choose any number that will determine your fate");
        String num = trialTwoQuest.nextLine();
        int number = Integer.parseInt(num);
        System.out.println("If you were Feyre, what emotion would you be feeling? Hint: The MORE you feel is how much you want to live!!!");
        String emo = trialTwoQuest.nextLine();
        int trialTew = trials.trialTwo(number,emo);
        //Greater than 0 means YES!!!!!!! SHE LIVES!!!
        if(trialTew>=0){
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);
            System.out.println("Feyre loosened her grip on the dagger and stared into the green eyes before asking, “When do we go?” She could smell her doom on his breath as he replied, “Now.”\n" +
                    "\n" +
                    "“The venison should last two weeks,” Feyre said to her father as she bundled up against the cold. “Start on the fresh meat, then the jerky. You know how to make it.”\n\n" +
                    "“Feyre—” her father breathed, but she kept going.\n\n" +
                    "“I left the money on the dresser,” she added. “It’ll last if you’re careful.”\n" +
                    "\n" +
                    "She looked at her father for a moment, memorizing his face. Her eyes stung, but she blinked the tears away. “When spring comes, hunt by Silverspring Creek. Ask Isaac Hale about snares—I taught him last year.”\n" +
                    "\n" +
                    "Her father nodded, his hand over his mouth. The beast’s growl came from outside. Feyre glanced at her sisters, huddled by the fire, still too scared to move.\n\n" +
                    "Elain mouthed her name, but Feyre turned to Nesta, whose cold gaze mirrored their mother’s.\n\n" +
                    "“Don’t marry Tomas Mandray,” Feyre said quietly. “His father beats his wife, and none of his sons stop him. Bruises are harder to hide than poverty.”\n\n" +
                    "Nesta’s eyes widened, but she said nothing.\n" +
                    "\n" +
                    "Feyre turned to leave, but her father’s hand gripped her arm. Outside, the beast snarled.\n\n" +
                    "“Feyre,” he said, his voice cracking. He squeezed her hands, his eyes clear for the first time in years. “You were always too good for this place, for us. If you ever escape, don’t come back.”\n\n" +
                    "Feyre’s heart twisted, but she nodded.\n\n" +
                    "“Go somewhere new,” her father whispered, shaking her by the shoulders. “Make a name for yourself.”");
        }
        else{
            feyre.addkarma();
            tamlin.addLove();
            tamlin.addLove();
            System.out.println(stats);
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
        System.out.println(GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("TRIAL THREE: FEYRE'S JOURNEY");
        System.out.println("Okay, okay... I know you're sick and tired of the reading. What's with this new gen and their short attention span? Have people even read *The Feminine Mystique*??\n" +
                "(The narrator has never read a book. He is a program. He just has a superiority complex.)\n\n" +
                "\"My name... is Tamlin,\" the beast grunts.\n" +
                "Feyre doesn't respond. Why would she care what her captor's name is?\n" +
                "\"If you think I'm a monster, I'm not. Even you know I can't bypass the treaty. A life for a life.\"\n" +
                "\"What treaty?\" she whispers.\n" +
                "\"You're too young to remember.\"\n\n" +
                "\"Oh yeah? And how old are you?\"\n\n" +
                "\"Over 500 years old,\"\n\n" +
                "If he could live that long, Feyre thought that her punishment would truly last a lifetime. Once she crosses those borders, there would be no way back.\n\n" +
                "This would be her only chance to escape.\n\n"+ GREEN+  "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("\n\nHe throws Feyre on his back and start running towards the Prythian border. Try your best not to anger him.\nThis will have consequence.\n\n"+ GREEN+  "_________________________________________________________________________________________________________________________________________________________________________________________________________________________\n\n"+RESET +
                "Straight north heads towards Prythian, however you notice that the closer you get to the border, the sleepier you get. Is this a spell? If it can place magic on you, wouldn't escaping be futile?\n\n" +
                "West heads towards the forest. The trees seem far too dense for the beast to fit. Maybe this is your chance to escape....\n\n" +
                "East heads towards the town. What are you thinking? If the village sees you with a faerie, you'll both be dead. However.. there is a faerie-killing mercenary there. Maybe she can help.\n\n" +
                "South heads back to your home. Umm... do you really think that would work?\n");



        Scanner trialThreeQuest = new Scanner(System.in);
        System.out.println("Choose which direction you want to go in: Input n for north, s for south, e for east, and w for west");
        String direction = trialThreeQuest.nextLine();

        if(direction.equalsIgnoreCase("n")){
            System.out.println("Feyre’s pulse quickened as she saw the border approaching. She couldn’t let the Beast drag her over—she had to escape. Her mind raced as she realized there was no way to control him, so she had to outsmart him. The moment the Beast slowed to navigate a rocky path, Feyre tried to leap off his back, hoping to break free before he noticed.\n" +
                    "\n" +
                    "But as soon as her feet hit the ground, the Beast’s claws scraped across the dirt, and his massive form twisted to pull her back with an almost predatory speed. Feyre scrambled, trying to sprint for the trees, but her legs were heavy with exhaustion, and the Beast’s roar sent a jolt of fear through her. He lunged forward, faster than she could run, and within seconds, he was back on the path to the border.\n" +
                    "\n" +
                    "The world blurred as the magic pulled at her, and the Beast crossed the line effortlessly. Feyre’s heart sank. She was in Prythian now, her brief attempt at freedom crushed.");
                     feyre.addkarma();
                     tamlin.addAnger();
                     System.out.println(stats);
        }
        if(direction.equalsIgnoreCase("s")){
            System.out.println("Feyre’s mind raced as she caught sight of the path home, a glimmer of hope in the distance. She knew the Beast couldn’t follow her easily if she could just get away. As soon as they hit a patch of uneven ground, she twisted violently, swinging her leg over and attempting to jump off his back. She landed with a harsh thud on the ground, but before she could make it more than a few steps, the Beast’s claws raked across the dirt, pulling her back with terrifying force.\n" +
                    "\n" +
                    "Feyre cried out, but her arms were trapped by the Beast’s claws as he dragged her back toward him. She fought, kicking at his paws, trying to break free, but his grip was iron-strong. The moment her hands slipped from his fur, she was pulled back onto his back with ease. The Beast surged forward again, crossing the border as if nothing had happened.\n" +
                    "\n" +
                    "Feyre’s chest tightened as she realized it was over. She had failed to escape, and the border of Prythian stretched out before her.");
            feyre.addkarma();
            tamlin.addAnger();
                    System.out.println(stats);
        }
        if(direction.equalsIgnoreCase("e")){
            System.out.println("The village in the distance looked like salvation, but Feyre knew the villagers would never help her if they saw her with the Beast. She needed to get away before they noticed her—before she became their target. As the Beast moved, Feyre saw a brief opening, a gap in the way he was moving. She gathered her courage and made a desperate dash to the side, attempting to dart into the trees just beyond the road.\n" +
                    "\n" +
                    "But the Beast’s reaction was instant. With a roar, he surged to the side, knocking her off balance, and before Feyre could recover, she was back on his back, his claws digging into her. She struggled beneath him, her mind racing with the knowledge that she couldn’t outrun him. The village—her last hope—was slipping farther away as the Beast pushed forward.\n" +
                    "\n" +
                    "No matter how hard she fought, the border was ahead, and Feyre found herself crossing it with the Beast, unable to stop it. Her stomach turned as she realized it was hopeless. Prythian was now her fate.");
            feyre.addkarma();
            tamlin.addAnger();
            System.out.println(stats);

        }
        if(direction.equalsIgnoreCase("w")){
            System.out.println("The thick trees of the forest loomed ahead, a potential hiding place that could offer a chance at freedom. Feyre’s heart pounded as she saw the opening—if she could just slip off his back when the Beast slowed, she could make a run for it. With all the strength she could muster, she wrenched herself sideways and jumped off, hoping to lose herself in the shadows of the forest.\n" +
                    "\n" +
                    "But the Beast was quicker than she anticipated. He twisted mid-gallop, his claws scratching the earth as he reached out to grab her, pulling her back with alarming speed. Feyre’s body crashed against his, and before she could even recover, the Beast was already surging forward again, moving past the trees and towards the border.\n" +
                    "\n" +
                    "The moment they crossed, Feyre felt the weight of magic pressing on her. She was trapped in Prythian, and there was no escaping.");
            feyre.addkarma();
            tamlin.addAnger();
                    System.out.println(stats);

        }
        System.out.println(GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("Final Trial: Feyre's Choices");
        System.out.println("After Feyre is taken to the mystical lands of the Fae, she finds herself in the grand, yet eerie, estate of Tamlin, a powerful High Fae lord. Her arrival is filled with tension, as Tamlin’s true nature remains shrouded in mystery. As Feyre navigates their uneasy interactions, \n" +
                "the choices she makes will determine whether Tamlin remains the feared, cursed beast trapped in his monstrous form—or if he becomes the noble, compassionate future she never expected. Will she earn his trust and find love, or will his darkness consume her? \n" +
                "The path she chooses will shape her fate and the future of their entwined worlds.");
        System.out.println(GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);


        Scanner trialFourQuest = new Scanner(System.in);
        System.out.println("Feyre wakes up from the long journey, in a bedroom much larger than her previous. In shock, she jolts off the bed, noticing that she was also no longer in the same clothes she had arrived in.\n" +
                "She was greeted by a faerie named Alice, who informed her that she had been the one who had dressed her, and that Sir Tamlin had prepared supper downstairs.\n" +
                "Hungry, she decided to go downstairs just to find Tamlin sitting in silence, waiting for her.\n" +
                "Option 1: Approach Tamlin with caution\n" +
                "Option 2: Challenge Tamlin immediately");
        String choiceOne = trialFourQuest.nextLine();
        int choice = Integer.parseInt(choiceOne);

        if(choice==1){
            System.out.println("Tamlin is cold and distant, but she notices a flicker of sadness behind his eyes. He doesn’t open up, but she earned his respect by not rushing him. Their relationship remains neutral.");
            feyre.addkarma();
            System.out.println(stats);

        }
        else{
            System.out.println(" Tamlin’s temper flares. He grows defensive and sarcastic, testing her resolve. She's made him wary of her, but he secretly admires her boldness. The tension between them deepens.");
            tamlin.addAnger();
            feyre.minuskarma();
            tamlin.addLove();
            System.out.println(stats);
        }

        System.out.println("Choice 2: The Dinner Invitation\n" +
                "Tamlin asks Feyre to sit down and eat. In the back of her mind, she remembers that faerie food can not be consumed by humans. However, hunger consumes her. She decides to sit.\n" +
                "He says nothing, and simply stares at her. Who is this man.. and why has the food not poisoned her? Is he.. good? Curiosity gets the best of her, and it is up to you to decide what her next step is.\n" +
                "Choice 1: Say thank you and ask about his past\n" +
                "Choice 2: Stop eating and keep your distance");
        String choice2 = trialFourQuest.nextLine();
        int choicetwo = Integer.parseInt(choice2);

        if(choice==1){
            System.out.println("Tamlin reluctantly opens up and the pain he’s endured as a High Lord of Prythian. He reveals that he is cursed and can no longer use his\n" +
                    "powers at will due to a tyrant in Prythian. She learns that he isn't the monster she perceived him to be. \n" +
                    "The more he speaks, the more she understand the sadness behind his anger. Their bond begins to form, and you earn his trust.");
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);
        }

        System.out.println("Choice 3: The Curse\n" +
                "She learns more about Tamlin’s curse: he was once a kind and honorable lord, but a dark spell has transformed him into a monstrous form. Breaking the curse is not just about magic—it’s about trust, sacrifice, and emotional connection. \n" +
                "As you get closer to Tamlin, you’re presented with the option to help him lift the curse.\n" +
                "Option 1:  Offer to help break the curse, even if it means risking yourself." +
                "Option 2: Reject the idea of helping, wanting to keep your distance from the curse.");
        String choice3 = trialFourQuest.nextLine();
        int choicethree = Integer.parseInt(choice3);

        if (choicethree==1){
            System.out.println("Tamlin is overwhelmed by Feyre’s willingness to risk everything for him. Her selflessness cuts through the walls of bitterness he’s built around his heart. Her decision to help him, despite the dangers, sparks a shift in Tamlin’s demeanor. \n" +
                    "He begins to trust her more deeply, and the possibility of love between them feels more attainable. However, this path comes with great risk, and both must face the trials ahead.");
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);

        }
        else{
            System.out.println("Tamlin feels a deep sense of disappointment and rejection. He thought that Feyre might be the one person who could understand and help him. Instead, her refusal drives him further into despair, and his dark side becomes more prominent. \n" +
                    "The emotional gulf between them widens, and Feyre starts to see just how deep Tamlin’s pain truly runs.");
            feyre.minuskarma();
            tamlin.addAnger();
            tamlin.minusLove();
            System.out.println(stats);
        }

        System.out.println("Choice 4: Trusting Tamlin\n" +
                "As time passes, Feyre begins to see the layers beneath Tamlin’s monstrous form. The curse has made him wary, but there are moments of vulnerability that break through the hardness of his facade. She must decide whether to open up to him, sharing her own past, \n" +
                "or whether to keep her walls firmly in place.\n" +
                "Choice 1: Confide in Tamlin about her struggles\n" +
                "Choice 2: Keep your distance, maintaining your guard");
        String choice4 = trialFourQuest.nextLine();
        int choicefour = Integer.parseInt(choice4);

        if (choicefour==1){

            System.out.println("Tamlin is moved by Feyre’s openness and vulnerability. In sharing her pain, she allows him to see her as more than just a captive. The emotional walls between them begin to crumble, and Tamlin begins to trust her more fully. \n" +
                    "His feelings for her deepen, and the possibility of a future together becomes more real. Feyre’s decision to open up creates a connection that strengthens their bond and gives Tamlin hope for the future.");
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);
        }

        else{
            System.out.println("Tamlin grows frustrated with Feyre’s inability to trust him. He sees her silence as a refusal to truly engage with him, and it pushes him further into his isolation. The emotional distance between them increases, and his darker tendencies begin to resurface. \n" +
                    "Feyre’s reluctance to connect has made it harder for them to move forward, and Tamlin becomes more distant and unpredictable.");
            feyre.minuskarma();
            tamlin.addAnger();
            tamlin.minusLove();
            System.out.println(stats);
        }
        System.out.println("Choice 5: A Dangerous Encounter\n" +
                "A sudden, dangerous event tests the limits of Feyre’s growing bond with Tamlin. Whether it’s an attack by an enemy or an explosion of Tamlin’s cursed power, Feyre must decide how to respond. This moment will reveal how much she truly trusts Tamlin—\n" +
                "and whether she’s willing to risk everything for him.\n" +
                "Choice 1: Stand by Tamlin, despite the danger\n" +
                "Choice 2: Run from the danger, choose self-preservation");
        String choice5 = trialFourQuest.nextLine();
        int choicefive = Integer.parseInt(choice5);

        if (choicefive==1){

            System.out.println("Feyre’s decision to stand with Tamlin, even in the face of danger, proves her loyalty. Tamlin is moved by her courage and begins to see her as someone who is truly on his side, no matter the cost. This act of bravery draws them closer, \n" +
                    "strengthening their bond and increasing the chance of breaking the curse. Together, they are more than just a prince and a captive—they are partners in the fight for their future.");
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);
        }

        else{
            System.out.println("Tamlin’s anger erupts as he sees Feyre flee in his moment of need. He feels betrayed, and the trust between them crumbles. The darkness in him surges, and his beastly nature becomes more dominant. \n" +
                    "Feyre’s choice pushes him further into despair, and her relationship with him becomes even more fragile. She must decide if it’s worth trying to mend the rift, or if it’s too late.");
            feyre.minuskarma();
            tamlin.addAnger();
            tamlin.minusLove();
            System.out.println(stats);
        }

        System.out.println("Choice 6: The Final Test\n" +
                "The curse can finally be broken, but it will require a great sacrifice. Tamlin’s fate is in Feyre’s hands. This is the moment where all of her choices culminate. Will she take the risk to save him, or will she walk away?\n" +
                "Choice 1: Risk everything to break his curse, even at great personal cost\n" +
                "Choice 2: Let Tamlin face his fate alone, unwilling to risk your life");
        String choice6 = trialFourQuest.nextLine();
        int choicesix = Integer.parseInt(choice6);

        if (choicefive==1){

            System.out.println("Feyre chooses to risk everything, and the curse begins to unravel. Tamlin’s form shifts, but the full impact of her decision isn’t clear. While there’s hope for him, they now face new challenges—emotionally and magically. \n" +
                    "Their bond is deeper than before, but the path ahead is uncertain, and both must confront the consequences of this choice.");
            feyre.addkarma();
            tamlin.addLove();
            System.out.println(stats);
        }

        else{
            System.out.println("Feyre steps back, unsure if she’s ready to risk herself. Tamlin retreats into his monstrous form, but the curse isn’t fully broken. There’s still a chance to help him, but trust has been damaged. \n" +
                    "Feyre now faces the choice of whether to try again, or accept the consequences of her hesitation.");
            feyre.minuskarma();
            tamlin.addAnger();
            tamlin.minusLove();
            System.out.println(stats);
        }

        System.out.println(GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET);
        System.out.println("We've made it all this way, congrats! Now lets look at your stats.");
        System.out.println(stats);


        if (tamlin.getAnger()>6){
            System.out.println( "Yikes, things arent looking good for Feyre and Tamlin. How did you manage to get him that angry?\n" + GREEN + "_________________________________________________________________________________________________________________________________________________________________________________________________________________________" + RESET +
                    "\nYour Ending: Feyre has made a series of choices that pushed Tamlin away. Whether it was her refusal to help him break the curse, her emotional distance, or her inability to trust him when it mattered most, Tamlin’s feelings have begun to change.\n" +
                    " As the curse lingers, so does the distance between them. As the curse continues to bind Tamlin, he becomes more withdrawn and cold. He no longer seeks her presence, and when they do speak, his tone is distant, as though the warmth they once shared has disappeared.\n" +
                    "Feyre lives on till the age of 40, suffering a death that could've been avoided had Tamlin loved her enough to save her.");
        }
        else{
            System.out.println("");
        }












    }
}