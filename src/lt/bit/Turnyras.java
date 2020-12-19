package lt.bit;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Ka mes turim gauti? Jei turim 7 zaidejus:
 * <p>
 * 1 Turas/Round: 1. Jonas - Petras
 * 2. Antanas - Rasa
 * 3. Sigita - Maryte
 * <p>
 * 2 Turas: 4. Janina - 1 poros laimetojas
 * 5. 2 poros laimetojas - 3 poros laimetojas
 * <p>
 * 3 Turas: 6. 4 poros laimetojas - 5 poros laimetojas
 * <p>
 * 2,4,8,16
 * <p>
 * 2 -> 2x1 ok     -> 0 + 2 = 2
 * 3 -> 2x1 + 1    -> 1 + 3 = 4
 * 4 -> 2x2 ok     -> 0 + 4 = 4
 * 5 -> 2x1 + 3    -> 3 + 5 = 8
 * 6 -> 2x2 + 2    -> 2 + 6 = 8
 * 7 -> 2x3 + 1    -> 1 + 7 = 8
 * 8 -> 2x4  ok    -> 0 + 8 = 8
 * 9 -> 2x1 + 7    -> 7 + 9 = 16
 * 10 -> 2x2 + 6   -> 6 + 10 = 16
 */


public class Turnyras {

    private final InputStream is;
   // private final OutputStream out;
    private final PrintStream print;

    private List<String> dalyviai = new ArrayList<>();

    public Turnyras(InputStream is, OutputStream out) throws UnsupportedEncodingException {
        this.is = is;
     //    this.out = out;
        print = new PrintStream(out, true, "UTF-8");

    }

    public void execute() {

        List<IParticipantName> dalyviai = TournamentUtils.read(this.is);
        System.out.println(dalyviai);

        dalyviai = TournamentUtils.randomize(dalyviai);
        System.out.println(dalyviai);

        int roundsCount = TournamentUtils.rounds(dalyviai.size());
        System.out.println("VISO TURU YRA : " + roundsCount);


        print.println("Turnyrine lentele");

        for  ( int currentRound = 1; currentRound <= roundsCount; currentRound++ ) {
            print.println(currentRound  + " Turas: ");

            int dalyviaiTotal = dalyviai.size();
     //
            int toNextRound = TournamentUtils.dalyviaiCountInNextRound(dalyviaiTotal);
            int inCurrentRound = dalyviaiTotal - toNextRound;

            List<Pair> round = new ArrayList<>();
            for (int i = 0; i < inCurrentRound; i += 2 ){
                Pair pair = new Pair(dalyviai.get(i), dalyviai.get(i + 1));
                round.add(pair);

                print.println( "  " + pair.content());

            }
            // Pasiruosti sekanciam turui

            List<IParticipantName> nextRoundPlayers = new ArrayList<>();
            //  perkeliam i sekanti tura nezaidusius zaidejus
            for (int i = inCurrentRound; i < dalyviaiTotal; i++ ) {
                nextRoundPlayers.add(dalyviai.get(i));
            }

            // perkeliam poru nugaletojus

            round.forEach( p -> nextRoundPlayers.add(p));

            // pakeiciu zaideju sarasa nauju
            dalyviai = nextRoundPlayers;
        }
    }

}
