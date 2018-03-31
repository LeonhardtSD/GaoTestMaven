package com.gzx;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Leon
 */
public class HelloTest {

    @Test
    public void hello() {


            Person p=new Person("1","2",3);
            System.out.println(" "+p.getId()+" "+p.getName()+""+p.getAge());

    }
}