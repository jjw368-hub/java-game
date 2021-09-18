package Entity;

public class Entities {
        int x;
        int y;

        int[] Location = {x, y};

        int[] GetLocation() {
            return Location;

        }
        void SetLocation(int setx, int sety) {
            x = setx;
            y = sety;
        }
    }