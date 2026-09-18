public class Date {
    private String month="", day="", year="";

    public Date (String m, String d, String y){
        month = m;
        day = d;
        year = y;
    }

    public Date (){
    }

    public void setMonth(String m){
        month = m;
    }

    public void setDay(String d){
        day = d;
    }

    public void setYear(String y){
        year = y;
    }

    public String getMonth(){
        return month;
    }

    public String getDay(){
        return day;
    }

    public String getYear(){
        return year;
    }

    public String printDate1(String m, String y, String d){
         return (m + "/" + y + "/" + d);
    }

}
