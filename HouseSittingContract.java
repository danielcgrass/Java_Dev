public class HouseSittingContract {
    private String client;
    private int days;

    public void setDays(int numDays) {
        final int MAX = 7;
        if (numDays > MAX) {
            days = MAX;
        } else {
            days = numDays;
        }
    }

    public int getDays() {
        return days;
    }

}

public static void main(String[] args){
    HouseSittingContract contract = new HouseSittingContract();
    contract.setDays(4);
    System.out.println("Days = " + contract.getDays());
}