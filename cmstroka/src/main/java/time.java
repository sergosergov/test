import java.util.Date;

public class time extends exe {
    String name;
    String desc;

    public time (String name, String desc){
        this.name=name;
        this.desc=desc;
    }

    @Override
    public void getName(){
        System.out.println(this.name);
    }

    @Override
    public void getDesc(){
        System.out.println(this.desc);
    }

    @Override
    public void execute(){
        Date date = new Date();
        System.out.println(date.toString());
    }

}

