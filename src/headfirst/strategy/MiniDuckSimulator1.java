package headfirst.strategy;

public class MiniDuckSimulator1 {
 
 public static void main(String[] args) {//MAIN�Լ�//�ڿ�  �Ѱ�����ϴ� �Ķ���� : string[] args, ���α׷� �����ҋ� ���ڿ���
 
  Duck mallard = new MallardDuck(); //(��)Duck:SUPERCLASS ,(��)Mallarduck
  //mallard.performQuack();
  mallard.performFly();
   
  Duck model = new ModelDuck();
  model.performFly();
  model.setFlyBehavior(new FlyRocketPowered());//SWITCH�ϴ� �Լ��� ���ִ�.
  model.performFly();

 }
}