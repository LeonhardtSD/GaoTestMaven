package com.gzx;

/**
 * @author Leon
 */
public class Hello {
//    class P{}
    public void Hello(){
        Person p=new Person("1","2",3);
        System.out.println(" "+p.getId()+" "+p.getName()+""+p.getAge());
    }
}

class Person{
    private String id;
    private String name;
    private int age;

    public Person(String id, String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
