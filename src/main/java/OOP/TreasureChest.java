package OOP;

public class TreasureChest {

    public static TreasureChest newInstance(){
        return new TreasureChest();
    }

    public static TreasureChest newInstanceWithGoldWeight(int goldWeight){
        TreasureChest newTreasureChest = new TreasureChest();
        newTreasureChest.goldWeight = goldWeight;
        return newTreasureChest;
    }
    public static TreasureChest newInstanceWithGemWeight(int gemWeight){
        TreasureChest newTreasureChest = new TreasureChest();
        newTreasureChest.gemWeight = gemWeight;
        return newTreasureChest;
    }
    public static TreasureChest newInstanceWithGoldWeightAndGemWeight(int goldWeight, int gemWeight){
        TreasureChest newTreasureChest = new TreasureChest();
        newTreasureChest.goldWeight = goldWeight;
        newTreasureChest.gemWeight = gemWeight;
        return newTreasureChest;
    }
    private int goldWeight;
    private int gemWeight;

    private TreasureChest(){

    }
}
