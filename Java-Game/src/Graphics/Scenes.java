package Graphics;

public class Scenes {
    static char OneFirstLine[] =  {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
    static char OneSecondLine[] = {'|', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '|'};
    static char OneThirdLine[] =  {'|', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '|'};
    static char OneFourthLine[] = {'|', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '|'};
    static char OneFifthLine[] =  {'|', 'a', 'a', 'a', '0', 'a', 'a', 'a', 'a', '|'};

    static char SceneOne[][] = {OneFirstLine, OneSecondLine, OneThirdLine, OneFourthLine, OneFifthLine};

    static char TwoFirstLine[] =  {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
    static char TwoSecondLine[] = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
    static char TwoThirdLine[] =  {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
    static char TwoFourthLine[] = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
    static char TwoFifthLine[] =  {'a', 'a', 'a', 'a', 'a', '0', 'a', 'a', 'a', 'a'};

    static char SceneTwo[][] = {TwoFirstLine, TwoSecondLine, TwoThirdLine, TwoFourthLine, TwoFifthLine};

    public static char AllScenes[][][] = {SceneOne, SceneTwo};

    public static int CurrentSceneNumber = 0;

    public static char CurrentSceneState[][] = AllScenes[CurrentSceneNumber];
}