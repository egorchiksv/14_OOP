package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        persister.save();
        Report report = new Report();
        report.report(user);
    }
}