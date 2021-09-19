import java.util.Scanner;
import GameGraphics.Scenes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! This is a game where you have to make it to the end of the maze!");
        System.out.println(Scenes.AllScenes[0][0][0]);
    }
    // prints out the current scene
    public static void ShowScreen(char[][] CurrentSceneState) {
        for (int i = 0; i <= 4; i++) {
            for (int a = 0; a <= 9; a++) {
                if (AllScenes[CurrentSceneNumber][i][a] == '0') {
                    Character.SetLocation(a, i);
                }
            }
        }
    }
}