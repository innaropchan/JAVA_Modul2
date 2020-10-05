package de.telran.data;

public class TransferRuleLength6 implements Transferable {
    private String input;

    @Override
    public boolean transfer() {
        return input.length() == 6;
    }
}
