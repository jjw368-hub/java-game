package Game;

import Graphics.ShowGUI.*;

public class Loop {
    boolean LoopActive = true;
    public void GameLoop() {
        if (LoopActive == true) {
            char PressedKey = GetInput();
            switch (PressedKey) {
                case 'w':
                    MoveUp();
                    break;
                case 'a':
                    MoveL();
                    break;
                case 'd':
                    MoveR();
                    break;
                case 's':
                    MoveDown();
                    break;
                case 'p':
                    PauseLoop();
                default:
                    break;
            }
            PrintGUI();
            GameLoop();
        }
        else if (LoopActive == false) {
            System.out.println("Paused");
            char PressedKey = GetInput();
            if (PressedKey == 'p') {
                StartLoop();
            }
            GameLoop();
        }
    }
    public void StartLoop() {
        LoopActive = true;
        GameLoop();
    }
    public void PauseLoop() {
        LoopActive = false;
    }
}