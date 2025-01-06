class gen<T>
{
    T name;
    T rollno;

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public T getRollno() {
        return rollno;
    }
    public void setRollno(T rollno) {
        this.rollno = rollno;
    }
    
}


public class Main {
    public static void main(String args[])
    {
        gen<String> f = new gen<>();
        f.setName("Gowtham");
        gen<Integer> f1 = new gen<>();
        f1.setRollno(61);
        System.out.println(f.getName());
        System.out.println(f1.getRollno());


    }


    
}
