package Donaldson.Wesley.Calculator;

/**
 * Created by wesleydonaldson on 9/13/16.
 */
public class Memory {

    private int memPlus;
    private int memClear;
    private int memRecall;

    private int id;

    private static int memFunc = 0;

    public Memory(int MP, int MC, int MRC){

        memPlus = MP;
        memClear = MC;
        memRecall = MRC;

        id = ++memFunc;


   }

   public void setMemPlus(int newValue){

       memPlus = newValue;
   }

    public void setMemClear(int newValue){

        memClear = newValue;
    }

    public void setMemRecall(int oldValue){

        memRecall = oldValue;
    }
}
