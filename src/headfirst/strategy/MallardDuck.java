package headfirst.strategy;

public class MallardDuck extends Duck {//Duck = abstract, display()�� �׻� �־���Ѵ�.
 
 public MallardDuck() {
 
  //quackBehavior = new Quack();
  //flyBehavior = new FlyWithWings();//sub class, flyBehavior�� Duck���� ��������.
  setFlyBehavior(new FlyWithWings());
  //setFlyBehavior(new FlyWithWings)�� ���ִ� ���� ����.
 }
 
 public void display() {
  System.out.println("I'm a real Mallard duck");
 }
}