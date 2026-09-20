public class Date {
    private int month, day, year;

    public Date (int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public Date (){
    }

    public void setMonth(int m){
        month = m;
    }

    public void setDay(int d){
        day = d;
    }

    public void setYear(int y){
        year = y;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public String formatDate(int m, int d, int y){
        return (m + "/" + d + "/" + y);
    }

    public String formatDate2(int m, int y, int d){
        return (numToMonth(m) + "/" + d + "/" + y);
    }

    public String formatDate3(int m, int y, int d){
        return (d + "/" + numToMonth(m) + "/" + y);
    }

    public static String numToMonth(int m){
        if (m == 1)
            return "January";
        else if (m == 2)
            return "Febuary";
        else if (m == 3)
            return "March";
        else if (m == 4)
            return "April";
        else if (m == 5)
            return "May";
        else if (m == 6)
            return "June";
        else if (m == 7)
            return "July";
        else if (m == 8)
            return "August";
        else if (m == 9)
            return "September";
        else if (m == 10)
            return "October";
        else if (m == 11)
            return "November";
        else if (m == 12)
            return "December";

        return "Not A Month";
    }
}

