package BinPacking.Data.LogicUI;
import BinPacking.Logic.PackingStrategy.PackingStrategy;
import javafx.collections.ObservableList;

/**
 * Created by Xsignati on 21.03.2017.
 * Structure that is being passed from Controller (View) to BinPacker (logic).
 */
public class InputData {
    private final ObservableList<Bin> binList;
    private final PackingStrategy packingStrategy;
    private final ObservableList<Box> boxList;
    private final double binLength;
    private final double binWidth;
    private final double binHeight;

    public InputData(double binLength, double binWidth, double binHeight, ObservableList<Bin> binList, PackingStrategy packingStrategy, ObservableList<Box> boxList){
        this.binLength = binLength;
        this.binWidth = binWidth;
        this.binHeight = binHeight;
        this.binList = binList;
        this.packingStrategy = packingStrategy;
        this.boxList = boxList;
    }

    public ObservableList<Bin> getBinList() {
        return binList;
    }
    public PackingStrategy getPackingStrategy() {
        return packingStrategy;
    }
    public ObservableList<Box> getBoxList() {
        return boxList;
    }
    public double getBinLength() {return binLength;}
    public double getBinWidth() {return binWidth;}
    public double getBinHeight() {return binHeight;}

}