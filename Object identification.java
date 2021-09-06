package SB;

public class Time {
 
private char ClassRoom;
private int min;
private boolean reserved;
private String name;
Time (char a, int b, boolean c, String d){
ClassRoom=a; min=b; reserved=c; name=d;
}

public char getClassRoom(){
return ClassRoom;
}
public int getMin() {
return  min;
}
public boolean isReserved() {
return reserved;
}
public void setName(String name) {
this.name = name;
}
public String getName() {
return name;
}
public void setReserved(boolean b) {
reserved=b;
}

}
