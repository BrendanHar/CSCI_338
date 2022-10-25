package Project1.MyGame;

import java.time.Month;
import java.util.Random;

public class MonsterControl {

    private Character myCharacter;
    private int monsterType;
    private int monsterHealth;
    private int monsterAttack;
    private boolean turn;

    public MonsterControl(Character c){
        myCharacter = c;
        Random rand = new Random();
        monsterType = rand.nextInt(3) + 1;
        turn = true;

    }
    public MonsterControl(){
        Random rand = new Random();
        monsterType = rand.nextInt(3) + 1;
    }

    public void setMonsterAttack(int num){
        monsterAttack = num;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public int getMonsterAttack() {
//        Random rand = new Random();
//        int chance = rand.nextInt(10) + 1;
//        if (monsterType == 1){
//            System.out.println("It seems to be a weak monster. Atacks reduced");
//            if (chance >= 1){
//                monsterAttack = 2;
//            }
//            else {
//                monsterAttack = 1;
//            }
//        }
//        else if (monsterType == 2){
//            System.out.println("It seems to be a normal monster. Attacks are normal");
//            if (chance >= 3){
//                monsterAttack = 2;
//            }
//            else {
//                monsterAttack = 1;
//            }
//        }
//        else if (monsterType == 3){
//            System.out.println("It seems to be a Strong monster. Attacks are Strong");
//            if (chance >= 3){
//                monsterAttack = 3;
//            }
//            else {
//                monsterAttack = 2;
//            }
//        }

        monsterAttack += 1;
        return monsterAttack;
    }

//    public int getMonsterType() {
//        return monsterType;
//    }

    public void receiveAttack(int damage){
        monsterHealth -= damage;
    }

    public void getAction(){
        Random rand = new Random();
        int chance = rand.nextInt(10) + 1;
//            if (chance <= 2 ){
//                System.out.println("Monster seems to be scared. It doesn't know what to do.");
//            }
//            else if (chance > 2 && chance <= 8){
//                System.out.println("Monster Attacks!");
//                getMonsterAttack();
//            }
//            else if (chance > 8){
//                System.out.println("Monster does nothing");
//            }
            getMonsterAttack();
            if (chance <= 2){
                System.out.println(chance);
                monsterAttack--;
            }
            if (monsterAttack == 6){
                System.out.println("Monster has attacked and killed you.");
                myCharacter.die();
            }
    }

    public void printMonsterHealth(){
        System.out.println("Monster Health: " + monsterHealth);
    }


    //MONSTERS
    // Tier 1 monsters
    public void printSlime() {
        System.out.println("A Slime has Appeared!! It's almost cute.");
//        if (monsterType == 1){
//            System.out.println("It seems to be a weak monster.");
//            monsterHealth = 3;
//        }
//        else if (monsterType == 2){
//            System.out.println("It seems to be a normal monster.");
//            monsterHealth = 5;
//        }
//        else if (monsterType == 3){
//            System.out.println("It seems to be a Strong monster");
//            monsterHealth = 8;
//        }
//        System.out.println("Monster Health: " + monsterHealth);
        System.out.println("        ██████████        \n" +
                "    ████▒▒▒▒░░░░░░████    \n" +
                "  ██▒▒▒▒░░░░░░      ░░██  \n" +
                "  ██▒▒▒▒░░░░░░░░    ░░██  \n" +
                "██▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒██\n" +
                "██▒▒▒▒▒▒▒▒░░░░░░░░░░░░▒▒██\n" +
                "██▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒██\n" +
                "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  \n" +
                "    ██████████████████    \n");
    }
    public void printGoblin() {
        System.out.println("Oh no A goblin has appeared! what will you do?");
        System.out.println(" ,      ,\n" +
                "            /(.-\"\"-.)\\\n" +
                "        |\\  \\/      \\/  /|\n" +
                "        | \\ / =.  .= \\ / |\n" +
                "        \\( \\   o\\/o   / )/\n" +
                "         \\_, '-/  \\-' ,_/\n" +
                "           /   \\__/   \\\n" +
                "           \\ \\__/\\__/ /\n" +
                "         ___\\ \\|--|/ /___\n" +
                "       /`    \\      /    `\\\n" +
                "      /       '----'       \\");
    }
    public void printBear() {
        System.out.println("A bear roars throughout the forrest!");
        System.out.println(".'\"'.        ___,,,___        .'``.\n" +
                ": (\\  `.\"'\"```         ```\"'\"-'  /) ;\n" +
                " :  \\                         `./  .'\n" +
                "  `.                            :.'\n" +
                "    /        _         _        \\\n" +
                "   |         0}       {0         |\n" +
                "   |         /         \\         |\n" +
                "   |        /           \\        |\n" +
                "   |       /             \\       |\n" +
                "    \\     |      .-.      |     /\n" +
                "     `.   | . . /   \\ . . |   .'\n" +
                " jgs   `-._\\.'.(     ).'./_.-'\n" +
                "           `\\'  `._.'  '/'\n" +
                "             `. --'-- .'\n" +
                "               `-...-'");
    }

    //Tier 2 Monsters
    public void printBandit() {
        System.out.println("Bandits descend on you!!");
        System.out.println("                /|\n" +
                "  _______________)|.. \n" +
                "<'______________<(,_|) \n" +
                "           .((()))| )) << YEAAYAAAAEAAAARGH!! >>\n" +
                "           (======)| \\ \n" +
                "          ((( \"_\"()|_ \\\n" +
                "         '()))(_)/_/ ' )\n" +
                "         .--/_\\ /(  /./\n" +
                "        /'._.--\\ .-(_/  \n" +
                "       / / )\\___:___) \n" +
                "      ( -.'.._  |  /\n" +
                "       \\  \\_\\ ( | )\n" +
                "        '. /\\)_(_)|\n" +
                "          '-|  XX |\n" +
                "           %%%%%%%%\n" +
                "          / %%%%%%%\\\n" +
                "         ( /.-'%%%. \\ \n" +
                "        /(.'   %%\\ :|\n" +
                "       / ,|    %  ) )\n" +
                "     _|___)   %  (__|_\n" +
                "     )___/       )___(\n" +
                "      |x/      mrf\\ >\n" +
                "      |x)         / '.\n" +
                "      |x\\       _(____''.__\n" +
                "    --\\ -\\--\n" +
                "     --\\__|--");
    }
    public void printMinotaur() {
        System.out.println("Suddenly you hear the snort of a bull, and as you turn to see the source of the noise you see a Minotaur!!");
        System.out.println("      -\"\"\\\n" +
                "    .-\"  .`)     (\n" +
                "   j   .'_+     :[                )      .^--..\n" +
                "  i    -\"       |l                ].    /      i\n" +
                " ,\" .:j         `8o  _,,+.,.--,   d|   `:::;    b\n" +
                " i  :'|          \"88p;.  (-.\"_\"-.oP        \\.   :\n" +
                " ; .  (            >,%%%   f),):8\"          \\:'  i\n" +
                "i  :: j          ,;%%%:; ; ; i:%%%.,        i.   `.\n" +
                "i  `: ( ____  ,-::::::' ::j  [:```          [8:   )\n" +
                "<  ..``'::::8888oooooo.  :(jj(,;,,,         [8::  <\n" +
                "`. ``:.      oo.8888888888:;%%%8o.::.+888+o.:`:'  |\n" +
                " `.   `        `o`88888888b`%%%%%88< Y888P\"\"'-    ;\n" +
                "   \"`---`.       Y`888888888;;.,\"888b.\"\"\"..::::'-'\n" +
                "          \"-....  b`8888888:::::.`8888._::-\"\n" +
                "             `:::. `:::::O:::::::.`%%'|\n" +
                "              `.      \"``::::::''    .'\n" +
                "                `.                   <\n" +
                "                  +:         `:   -';\n" +
                "                   `:         : .::/\n" +
                "                    ;+_  :::. :..;;;       LS\n" +
                "                    ;;;;,;;;;;;;;,;;");
    }
    public void printVampire() {
        System.out.println("You hear the flap of wings and looking up you see a vampire.");
        System.out.println("                                  _.-.\n" +
                "                                 ._.-.\\\n" +
                "                    .^         _.-'=. \\\\\n" +
                "                  .'  )    .-._.-=-..' \\'.\n" +
                "               .'   .'   _.--._-='.'   |  `.  ^.\n" +
                "             .'   .'    _`.-.`=-./'.-. / .-.\\ `. `.\n" +
                "           .'    /      _.-=-=-/ | '._)`(_.'|   \\  `.\n" +
                "          /    /|       _.--=.'  `. (.-v-.)/    |\\   \\\n" +
                "        .'    / \\       _.-.' \\-.' `-..-..'     / \\   `.\n" +
                "       /     /   `-.._ .-.'      `.'  \" \". _..-'  |    |\n" +
                "      '      |    |   /   )        \\  /   \\   \\    \\    `.\n" +
                "     /      /    /   /   /\\                \\   \\   |      \\\n" +
                "    /      /    /  .'  .'\\ `.        .'     \\   |   \\      \\\n" +
                "   /      /    /  /   /   \\  `-    -' .`.    .  \\    \\     |\n" +
                "  |      /    / .''\\.'    | `.      .'   `.   \\  |    |    |\n" +
                " .'     /    / /   |      |      .'/       `.- `./    /    |\n" +
                " |     /    .-|   /--.    / `.    |    _.-''\\   |     |    \\\n" +
                ".'    /  .-'  |  /    `-.|       .'\\_.'      `. |`.   |    |\n" +
                "|    |.-'     / /       /           \\          \\ \\ `. \\     \\\n" +
                "|    /       /  |      /             \\         |  `. `.|    |\n" +
                "|   |       /   `.     |      `   .'  \\        /    \\  \\    /\n" +
                "|   |      ///.-'.\\    |       \\ /    `\\      / /-.  \\ |    |\n" +
                "|   /      \\\\\\\\    `    \\.-     |    `-.\\     |/   \\\\\\\\'.   |\n" +
                " \\ |        \\\\\\|        |      / \\      |          //// |  /\n" +
                " | |         '''        |     /   \\     |          |//  |  \\\n" +
                " \\ |                    |.-  |     \\  .-|          ''   |  /\n" +
                "  \\|                    /    |    / ` ../               / /\n" +
                "                        |'   /    |    /               | /\n" +
                "                        \\.'  |    | `./                |/\n" +
                "                        /    \\   /    \\\n" +
                "                        \\ `. /   \\    /\n" +
                "                         |  |     '. '\n" +
                "                         /  |      |  \\\n" +
                "                        /   |      /   `.\n" +
                "                       | | | \\   .'  `.. \\\n" +
                "                      / / / ._`. \\.'-. \\`/\n" +
                "             LGB      |/ / /  `'  `  |/|/\n" +
                "                       \\|\\|");
    }


    //Tier 3 Monsters
    public void printKnight() {
        System.out.println("Oh no. It seems a hostile knight has crossed paths with you.");
        System.out.println("      _,.\n" +
                "    ,` -.)\n" +
                "   ( _/-\\\\-._\n" +
                "  /,|`--._,-^|            ,\n" +
                "  \\_| |`-._/||          ,'|\n" +
                "    |  `-, / |         /  /\n" +
                "    |     || |        /  /\n" +
                "     `r-._||/   __   /  /\n" +
                " __,-<_     )`-/  `./  /\n" +
                "'  \\   `---'   \\   /  /\n" +
                "    |           |./  /\n" +
                "    /           //  /\n" +
                "\\_/' \\         |/  /\n" +
                " |    |   _,^-'/  /\n" +
                " |    , ``  (\\/  /_\n" +
                "  \\,.->._    \\X-=/^\n" +
                "  (  /   `-._//^`\n" +
                "   `Y-.____(__}\n" +
                "    |     {__)\n" +
                "          ()");
    }

    public void printMage() {
        System.out.println("Mist fills the air. As a mage appears!");
        System.out.println("              _,-'|\n" +
                "           ,-'._  |\n" +
                " .||,      |####\\ |\n" +
                "\\.`',/     \\####| |\n" +
                "= ,. =      |###| |\n" +
                "/ || \\    ,-'\\#/,'`.\n" +
                "  ||     ,'   `,,. `.\n" +
                "  ,|____,' , ,;' \\| |\n" +
                " (3|\\    _/|/'   _| |\n" +
                "  ||/,-''  | >-'' _,\\\\\n" +
                "  ||'      ==\\ ,-'  ,'\n" +
                "  ||       |  V \\ ,|\n" +
                "  ||       |    |` |\n" +
                "  ||       |    |   \\\n" +
                "  ||       |    \\    \\\n" +
                "  ||       |     |    \\\n" +
                "  ||       |      \\_,-'\n" +
                "  ||       |___,,--\")_\\\n" +
                "  ||         |_|   ccc/\n" +
                "  ||        ccc/\n" +
                "  ||                ");

    }

    public void printHydra(){
        System.out.println("A Hydra Appears!!");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⣠⣦⣄⣀⣴⣦⣄⣈⣻⣿⣿⣿⣿⣿⣿⡇⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣀⡀⣀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⠁⠀⠀⠀⠀⠀⠸⢿⣿⣷⣄⣀⠀⠀\n" +
                "⠀⠀⠀⣶⣶⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀\n" +
                "⠀⣀⣠⣿⣿⣿⡿⠟⠁⠀⢀⣄⣀⣠⣦⣀⣠⣄⠀⢹⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⡿⠁⣰⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⠟⠛⠉⠉⠉⠉⠙⢻⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⠁⠀⠀⠹⠛⠁⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠙⣷⠄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⡄⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣿⣿⣿⣿⡿⠟⠛⠛⠛⠻⠿⣿⣿⣷⣤⣆⠀⣈⠻⣿⣿⣿⣿⣶⣶⣶⠆⠀⠀\n" +
                "⠀⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠉⠉⠀⠀⠀\n" +
                "⠀⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠹⢿⣿⣷⣄⣀⠀⠀⠀⠀\n" +
                "⠀⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀");

    }

    public void printDemon(){
        System.out.println("A burst of flames comes from nowhere. As you scan for where it came from you see a demon on the horizon!!");
        System.out.println("                            ,-.\n" +
                "       ___,---.__          /'|`\\          __,---,___\n" +
                "    ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.\n" +
                "  ,'        |           ~'\\     /`~           |        `.\n" +
                " /      ___//              `. ,'          ,  , \\___      \\\n" +
                "|    ,-'   `-.__   _         |        ,    __,-'   `-.    |\n" +
                "|   /          /\\_  `   .    |    ,      _/\\          \\   |\n" +
                "\\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /\n" +
                " \\  \\           | `._   `\\\\  |  //'   _,' |           /  /\n" +
                "  `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'\n" +
                "     ``       /     \\    ,='/ \\`=.    /     \\       ''\n" +
                "             |__   /|\\_,--.,-.--,--._/|\\   __|\n" +
                "             /  `./  \\\\`\\ |  |  | /,//' \\,'  \\\n" +
                "FASTKIT     /   /     ||--+--|--+-/-|     \\   \\\n" +
                "           |   |     /'\\_\\_\\ | /_/_/`\\     |   |\n" +
                "            \\   \\__, \\_     `~'     _/ .__/   /\n" +
                "             `-._,-'   `-._______,-'   `-._,-'");
    }

    //Tier 4

    public void printDragon(){
        System.out.println("With a thunderous roar, a dragon appears from the clouds bellowing fire!");
        System.out.println("                            ==(W{==========-      /===-                        \n" +
                "                              ||  (.--.)         /===-_---~~~~~~~~~------____  \n" +
                "                              | \\_,|**|,__      |===-~___                _,-' `\n" +
                "                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~      \n" +
                "             ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`         \n" +
                "       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'             \n" +
                "    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /               \n" +
                "  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'                \n" +
                " /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                  \n" +
                "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   \n" +
                "                  \\_|      /        _) | ;  ),   __--~~                        \n" +
                "                    '~~--_/      _-~/- |/ \\   '-~ \\                            \n" +
                "                   {\\__--_/}    / \\\\_>-|)<__\\      \\                           \n" +
                "                   /'   (_/  _-~  | |__>--<__|      |                          \n" +
                "                  |   _/) )-~     | |__>--<__|      |                          \n" +
                "                  / /~ ,_/       / /__>---<__/      |                          \n" +
                "                 o-o _//        /-~_>---<__-~      /                           \n" +
                "                 (^(~          /~_>---<__-      _-~                            \n" +
                "                ,/|           /__>--<__/     _-~                               \n" +
                "             ,//('(          |__>--<__|     /  -Alex Wargacki  .----_          \n" +
                "            ( ( '))          |__>--<__|    |                 /' _---_~\\        \n" +
                "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\      \n" +
                "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||      \n" +
                "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       \n" +
                "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  \n" +
                "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    \n" +
                "   ;'( ')/ ,)(                              ~~~~~~~~~~                         \n" +
                "  ' ') '( (/                                                                   \n" +
                "    '   '  `");
    }

    public void printDragon2(){
        System.out.println("With a thunderous roar, a dragon appears from the clouds bellowing fire!");
        System.out.println("          _/          ,          .                                          \n" +
                "       , -' )         ( \\-------.,')            (\\_________________________  \n" +
                "     , ,-/ |          /\\_) )     \\/            ,' _.----------------------,\\ \n" +
                "   ,',  /, |         /      >--. ,)           / /\\\\                          \n" +
                "  / ,  //|,'        /'     '\\--'\\\\)          /,'  \\\\     `         `   ,     \n" +
                " / ,  // ||       ,'     (.--^( `')         //     \\\\                \\       \n" +
                "( ,  //  ||,___,-'    (___\\\\  '^^^'        //       \\\\              ,        \n" +
                " \\  //   ||--.__     (     \\`^--)  _____.-'/         \\\\   `                  \n" +
                "  >'/    ||,        (       \\|_(\\-'      ,'           \\\\         \\,          \n" +
                " /,'     ||          \\           \\      /              \\\\                    \n" +
                "(/       ||           \\           )  ,'(     `     `    \\\\      ,            \n" +
                " `       ||\\           \\      ) ,'  /_  )                \\\\    \\             \n" +
                "         || `.          `.    ,'   /( `.\\  \\ , \\ \\,       \\\\   ,             \n" +
                "   `     || (_`.          ` .'   .'  )  `)'            ,   \\\\                \n" +
                "         ||  (_ `-v-------  ^--v' , )                      '\\\\,              \n" +
                "         ||    (    , _,-  /  -./ )'                         `)              \n" +
                "     `   '|     ),  ,'    '     )'                                           \n" +
                "        ' ;    /  ,'          ,'                                             \n" +
                "       /,'    /  /      '    /     , - --- .                                 \n" +
                "       \\|    /  (          ,'   '           `.                               \n" +
                "       ('  ,'    `.    \"  / ,'                \\                              \n" +
                "         ,'        \\    ,/,'        '`)   (_   )                             \n" +
                "        /           \\ , /'          ,      /  /                              \n" +
                "       .             )  ,       ,         '  /                               \n" +
                "                      )      ,              /                                \n" +
                "       .            ' `|   ,'              /                                 \n" +
                "                    '  |  /              ,'                                  \n" +
                "        |\\             | <    ______,---'                                    \n" +
                "        ` \\            ','   (                                               \n" +
                "         \\ '          /(____ ,`-._,-.                                        \n" +
                "          `.         /      `._, )---)                                       \n" +
                "            `-------'\\         `/ \\                                          \n" +
                "               )   )  \\          ` \\                                         \n" +
                "              /  '(    `.         `                                          \n" +
                "         ___,' _, /      `.         .                                        \n" +
                "        ('.---/ \\(          .      '|                                        \n" +
                "        /'    `|^'           .     ,                                         \n" +
                "                             .     /                                         \n" +
                " Art by                           '                                          \n" +
                "  xop...@athena.mit.edu     '    '                                           \n" +
                "    James Goodwin         ,'  ,                                              \n" +
                "                         (_ '                  g o o d w i n");
    }

    public void printSatan(){
        System.out.println("The Final Boss has appeared!!");
        System.out.println("      ,',            ,,,,,;;;;;;;;;;;;;;;;;;;;;,,,,,             ,',\n" +
                "     ;  ',        ,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,         ,  ',\n" +
                "     ;    ;     ,;;;;;; ;;; ;;  ;;;;;;;;;  ;;  ;;; ;;;;,       ;    ;\n" +
                "     ;     `, ,;;;;;;    ;    ;  ;;;;;;;  ;     ;    ;;;;,   ,'     ;\n" +
                "     ,       ',;;  ;           ;   ;;;   ;             ;  ;,'       ,\n" +
                "      ',       ; ,,,,,,,,,,     ;   ;   ;       ,,,,,,,,,,'.       ,\n" +
                "         ,    ,'          ',    ;       ;    ,''           ',    ,'\n" +
                "         ;;.,'                   ;     ;    '                '..'\n" +
                "        ;;;;                '    ;     ;   '                  ;;\n" +
                "       ;;;;  ;               ',  ;  ;  ;  '                ;  ;;;\n" +
                " :,    ;;;;   ;;               ',;  ;  ;,'               ;;   ;;;\n" +
                " ,`,   ;;;;     ;;;               ; ; ;                ;;;    ;;;;    ';\n" +
                ":  `,  ,;;;      ;;;;;;;;;;;;;;;,,  ;   ,,;;;;;;;;;;;;;;;     ;;;,  .' ;\n" +
                ";  ; `,;;;;                                                   ;;;; .'   ;\n" +
                ":  ;`, : ;;,,,,     ;\"\"/\\\"\";.                .;\"\"/\\\"\";,  ,'''';; ;' ,'; ;\n" +
                ":  ;  `; ;;    ',,'  \\ \\/ /  ',  ;     ;   ,'  \\ \\/ /  ',     ;; ;,'  ; ;\n" +
                ":  `,  ; ;;      '.,,;,,,;,.'    ;     ;    '.,,;,,,;,.'      ;; ;   ,  ;\n" +
                "`,  ; @; ;;                ,'    ;     ;    ',                ;; ;@ ;   ,\n" +
                "  `,'. ; ;               ,'      ;     ;      ',               ; ;  ; ,' \n" +
                "   `, ',          ,''''''       ;       ;       '''''',          ;,' ;\n" +
                "     `, :       ,'             ;         ;             '',       ;  ;\n" +
                "      '',    ,''              ;     ;     ;               ',     ;''\n" +
                "        ',  '                (,     ;      )                ',  ,'\n" +
                "         ',                    '''''''''''''                   ,'\n" +
                "           '.             ;;;;;;;;;;;;;;;;;;;;;;              ,\n" +
                "             ,          ,;;;;;;;;;;;;;;;;;;;;;;;;,          ,'\n" +
                "              ,        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;        ,\n" +
                "               ,      ;;;;/\\/ |  |\\/  \\/|  | \\/\\;;;;      ,\n" +
                "               ',     ;;;/     \\/        \\/     \\;;;    ,'\n" +
                "                ',    ;;;\\  /\\              /\\  /;;;   ,'\n" +
                "                  ',  ;;;;\\|  |/\\ /\\  /\\ /\\|  |/;;;; ,',\n" +
                "                 ,' ',;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;'   ',\n" +
                "               ,'     ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;      ',\n" +
                "             ,'        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;         ',\n" +
                "   ,',',',','           ;;;;;;;;;;;;;;;;;;;;;;;;;;            ',',',',','\n" +
                "                         ;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                "                         ;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                "                          ;;;;;;;;;;;;;;;;;;;;;;;\n" +
                "                           ;;;;;;         ;;;;;;\n" +
                "                           ;;;;;           ;;;;;\n" +
                "                            ;;;             ;;;\n" +
                "                             ;;             ;;  Art by: Timothy O'Connor");
    }

}
