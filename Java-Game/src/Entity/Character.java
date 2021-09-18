package Entity;
import AllEntities.Entities;

public class Character {

    Entities Character = new Entities();

    // i think i found out why this isnt working, it works when i copy and paste it into Main.java so it must be the context
	for (int i = 0; i <= 4; i++) {
        for (int a = 0; a <= 9; a++) {
            if (AllScenes[CurrentScene][i][a] == '0') {
                Character.SetLocation(a, i);
            }
        }
    }
}

