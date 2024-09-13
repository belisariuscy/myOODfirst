package edu.neu.csye6200;

public class Person {
    // 无参数构造函数
    public Person() {
        this.age = 0;
        this.firstName = "John";
        this.mi = 'C';
        this.lastName = "Doe";
    }

    // 带参数的构造函数
    public Person(int age, String firstName, char mi, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.mi = mi;
        this.lastName = lastName;
    }

    // Getter 和 Setter 方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMi() {
        return mi;
    }

    public void setMi(char mi) {
        this.mi = mi;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // 成员变量
    private int age;
    private String firstName;
    private char mi;
    private String lastName;
    
    // 静态 demo 方法
    public static void demo() {
        // 创建一个 Person 实例
        Person s1 = new Person();
        
        // 使用实例的 getter 方法输出信息
        System.out.println("I am: "
            + s1.getFirstName()
            + " " + s1.getMi()
            + ". " + s1.getLastName()
            + ", " + s1.getAge()
            + " years of age!");
    }
}
