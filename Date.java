public class Date {
    public int dayOfMonth, month;

    public Date(int dayOfMOnth, int month) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
    }

    private int getDaysInMonth(int month) {
        int ret = 0;
        boolean flag = false;
        for (int i=1; i<=month; i++) {
            if (i == 2) {
                ret = ret + 28;
            }
            else if (i%2 != 0) {
                ret = ret + 31;
            }
            else {
                ret = ret + 30;
            }
        }
        return ret;
    }

    public int dayOfYear() {
        return getDaysInMonth(month-1)+dayOfMonth;
    }
}