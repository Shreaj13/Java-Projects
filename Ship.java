public abstract class Ship implements Displayable {
    private String name;
    private String yearBuilt;

public Ship(String n , String y){
    name = n;
    yearBuilt = y;

}
public void setName (String n){
    name = n;

}
public void setYearBuilt(String y){
    yearBuilt = y;
}
public String getName(){
    return name;
}
public String getYearBuilt(){
    return yearBuilt;
}
@Override
    public String toString(){
    return name + yearBuilt;
}
}

