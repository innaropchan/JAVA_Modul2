package de.telran.data;

public interface Transferable {
    boolean transfer();



    static String createRules(String input, int actions) {
        switch (actions) {
            case 1:
                TransferRuleLength3 tr1 = new TransferRuleLength3();
                return input.toUpperCase();
            case 2:
                TransferRuleLength4 tr2 = new TransferRuleLength4();
                return input.toLowerCase();
            case 3:
                TransferRuleLength6 tr3 = new TransferRuleLength6();
                return input.replaceAll(input, "******");
            default:
                return null;
        }
    }
}
