package de.telran.data;

public class TransferRuleLength4 implements Transferable{
   public String input;


    @Override
    public boolean transfer() {
        return input.length()==4;

    }
}
