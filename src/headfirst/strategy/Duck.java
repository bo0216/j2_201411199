package headfirst.strategy;//�ڹ� �� ����ִ� ���//���丮��� �����ض�!

public abstract class Duck{
  //FlyBehavior flyBehavior;//ī��
  FlyBehavior flyBehavior;
  //QuackBehavior quackBehavior;
  
  public Duck(){
  }
  public void setFlyBehavior(FlyBehavior fb){//fb�� ����ī�� //SUPER CLASS�� ����
    flyBehavior = fb; //fb = ī��(flyBehavior)�� ����ī��� �ٲ����. �ᱹ fb�� ����ī���.
}
  //public void setQuackBehavior(QuackBehavior qb){
    //quackBehavior = qb;
  //}
  
  abstract void display();//����Ŭ������ �����ϴ� �Ž� ������ �� �Լ� �ϳ��� ABSTRACK�̸� CLASS ��ü�� ABSTRACT
  public void performFly(){
    flyBehavior.fly();
  }
  //public void performQuack(){
    //quackBehavior.quack();
  //}
  public void swim(){
  System.out.println("All ducks float, even decoys!");
  }
}

//�������̽� ��� �� ���� �����ð���(03/22)
