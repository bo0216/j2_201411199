package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {//FlyBehavior interface�� strategy������ �Ѵ�.,FlyBehavior = marker,
  //�ٶ� FlyBehavior �Ʒ��� �Լ��� �״�� ���ش�.
 public void fly() {
  System.out.println("I'm flying!!");
 }
}