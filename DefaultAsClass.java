package com.keyword;

class Animal         //Default Class
{
    void Color()
    {
        System.out.println("What is the Color ? ");
    }
    void Category()
    {
        System.out.println("What is the Category ?");
    }
    void Sound()
    {
        System.out.println("I Barks.");
    }
    void ChildName()
    {
        System.out.println("What is the Child Name ? ");
    }
    void Competitor()
    {
        System.out.println("Who is the Competitor ? ");
    }
}
class Dog extends Animal
{
    void Color()
    {
        System.out.println("I am Brown in Color. ");
    }
    void Category()
    {
        System.out.println("My Category is Pug.");
    }
    void Sound()
   {
       System.out.println("I Barks.");
   }
    void ChildName()
    {
        System.out.println("My Child Name is Puppy. ");
    }
    void Competitor()
    {
        System.out.println("My Competitor is Cat. ");
    }
}
public class DefaultAsClass
{
    public static void main(String[] args)
    {
        Dog puppy = new Dog();
        System.out.println("Dog Says: ");
        puppy.Color();
        puppy.Sound();
        puppy.Category();
        puppy.ChildName();
        puppy.Competitor();
    }
}
