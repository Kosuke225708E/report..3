package jp.ac.uryukyu.ie.e225708;

 /**
  * ヒーロークラス。
  *  String name; //敵の名前
  *  int hitPoint; //敵のHP
  *  int attack; //敵の攻撃力
  *  boolean dead; //敵の生死状態。true=死亡。
  * Created by tnal on 2016/11/13.
  */
  public class Hero  {
   private String name;
   private int hitPoint;
   private int attack;
   private boolean dead;



   public String getName(){
       return this.name;
   }

   public int getHitPoint(){
       return this.hitPoint;
   }

   public int getAttack(){
       return this.attack;
   }

   public boolean Dead_s(){
       return this.dead;
   }
   
   public Hero (String _name, int _maximumHP, int _attack) {
      this.setName(_name);
      this.setHitPoint(_maximumHP);
      this.setAttack(_attack);
      dead = false;

      System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _maximumHP, _attack);
     }

     public void setName(String _name){
         this.name = _name;
     }

     public void setHitPoint(int _maximumHP){
         this.hitPoint = _maximumHP;
     }

     public void setAttack(int _attack){
         this.attack = _attack;
     }

     
     public void attack(Enemy e){
      if(this.dead == false){
         int damage = (int)(Math.random() * this.getAttack());
         System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), e.getName(), damage);
         e.wounded(damage);
     }

 }

 
 public void wounded(int damage){
   this.hitPoint -= damage;
   if( hitPoint < 0 ) {
      this.dead = true;
             System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
         }
     }
 }

     