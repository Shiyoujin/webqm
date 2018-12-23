

public class Student {


    private  String stuid;
    private  String name;

    public Student(){
    }

    public Student(String stuid,String name){
        this.stuid=stuid;
        this.name=name;
    }


    public String getStuid() {
        return stuid;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setStuid(String stuid){
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return stuid;
    }
}
