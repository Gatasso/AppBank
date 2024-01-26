package java.dev.galasso.matheus.core.entities.account;

public enum AccountType {
    CHECKING("Checking",0.04,4000) {
    },

    SAVING("Saving",0.0,0.0) {
    },

    INVESTMENT("Investment",0.00,0.0){
    };

    /**********************************************************************************************************************/
    private final String accTypeName;
    private double maintenanceTax, creditLimit;

    AccountType(String accTypeName) {
        this.accTypeName = accTypeName;
    }

    AccountType(String accTypeName, double maintenanceTax, double creditLimit) {
        this.accTypeName = accTypeName;
        this.maintenanceTax = maintenanceTax;
        this.creditLimit = creditLimit;
    }

    /**********************************************************************************************************************/
    public double getCreditLimit(){
        return creditLimit;
    }
    public double getMaintenanceTax() {
        return maintenanceTax;
    }
    public String getAccTypeName() {
        return accTypeName;
    }
}
