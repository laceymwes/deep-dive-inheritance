package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Canis> kennel = fillKennel();
    inspect(kennel);
  }

  private static List<Canis> fillKennel(){
    List<Canis> kennel = new ArrayList<>();
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisLupus());
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisDirus());
    kennel.add(new CanisLupus());
    ((CanisLupusFamiliaris) kennel.get(0)).setGoodBoy(false);
    return kennel;
  }

  private static void inspect(List<Canis> kennel){
    for(Canis canis : kennel){
      canis.hunt();
      if(canis instanceof CanisLupus){
        ((CanisLupus) canis).speak(); // cast to CanisLupus reference type
      }
      if((canis instanceof CanisLupusFamiliaris)
          && ((CanisLupusFamiliaris) canis).isGoodBoy()){
        System.out.println("I'm a good boy!");

      }
    }
  }

}
