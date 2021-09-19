package Entity;
import AllEntities.Entities;

public class Character {

    Entities Character = new Entities();

	for (int i = 0; i <= 4; i++) {
        for (int a = 0; a <= 9; a++) {
            if (AllScenes[CurrentScene][i][a] == '0') {
                Character.SetLocation(a, i);
            }
        }
    }
}

