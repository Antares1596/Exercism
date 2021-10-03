class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        
        if(knightIsAwake==true)
            return false;
        else
            return true;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        
        if(knightIsAwake==true || prisonerIsAwake == true || archerIsAwake==true)
            return true;
        else 
            return false;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       
        if(prisonerIsAwake == true && archerIsAwake==false)
            return true;
        else 
            return false;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       
        if((knightIsAwake==false && prisonerIsAwake == true && archerIsAwake==false) || (archerIsAwake== false && knightIsAwake==true && petDogIsPresent==true &&  (prisonerIsAwake==true || prisonerIsAwake==false))||(knightIsAwake==false && prisonerIsAwake == false && archerIsAwake==false)&& petDogIsPresent== true )
            return true;
        else 
            return false;
    }
}
