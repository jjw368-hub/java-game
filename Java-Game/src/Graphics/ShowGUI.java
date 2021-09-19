package Graphics;

public class ShowGUI {
    public void PrintGUI() {
        for (int i = 0; i <= 4; i++) {
            for (int a = 0; a <= 9; a++) {
                System.out.print(CurrentSceneState[i][a] + " ");
            }
            System.out.println();
        }
    }
}