package BTBuoi3.BT2;

public class Time
{
    private int hour;
    private int minute;
    private int second;
    Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0&&hour<=23){
            this.hour = hour;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (hour>=0&&hour<=59) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (hour>=0&&hour<=59) {
            this.second = second;
        }
    }
    public void setTime(int hour,int minute,int second){
       this.hour=hour;
       this.minute=minute;
       this.second=second;
    }
    public Time nextSecond(){
        second=second+1;
      return this;

    }
    public Time previosSecond(){
        second=second-1;
      return this;

    }

    @Override
    public String toString() {
       return "Time{" +
               "hour=" + hour +
                ", minute=" + minute +
               ", second=" + second +
               '}';
//        return String.format("%tH %tM %tS",hour,minute,second);
    }
}
