import jp.ac.uryukyu.ie.e225708.*;

 public class Main {
     public static void main(String[] args){
        Warrior hero = new Warrior("勇者", 10, 5);
         Enemy enemy = new Enemy("スライム", 6, 3);

         System.out.printf("%s vs. %s\n", hero, enemy);

         int turn = 0;
         while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
             turn++;
             System.out.printf("%dターン目開始！\n", turn);
             hero.attackWithWeponSkill(enemy);
             enemy.attack(hero);
         }
         System.out.println("戦闘終了");
      }
 }

