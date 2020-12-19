package lt.bit;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface TournamentUtils {

    static List<IParticipantName> read(InputStream is) {
        List<IParticipantName> dalyviai = new ArrayList<>();

        try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(is),
                StandardCharsets.UTF_8)) {

            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
                if (c == '\n') {
                    String name = sb.toString();
                    if (name.trim().length() > 0) {
                   //     dalyviai.add(name.tr  im());
                        Dalyvis dalyvis = new Dalyvis(name.trim());
                        dalyviai.add(dalyvis);
                    }
                    sb = new StringBuilder();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dalyviai;

    }


    static int dalyviaiCountInNextRound(int totalDalyviai) {
        if (totalDalyviai <= 2) return 0;
        int roundsCount = rounds(totalDalyviai);
        int maxDalyviai = (int) Math.pow(2, roundsCount);

        int nextRoundDalyviai = maxDalyviai - totalDalyviai;
        return nextRoundDalyviai;


    }


    static int rounds(int visoDalyviai) {
        if (visoDalyviai <= 1) return 0;


        int dalyviaiCount = 2;
        int roundCount = 1;
        while (dalyviaiCount < visoDalyviai) {
            dalyviaiCount *= 2;
            roundCount++;
        }
        return roundCount;
    }
    static List<IParticipantName> randomize(List<IParticipantName> list) {

        Random random = new Random();
        for (int i = 0; i < list.size() * 2; i++) {
            int index = random.nextInt(list.size());
            IParticipantName name = list.remove(index);
            list.add(0, name);
        }
        return list;
    }
}
