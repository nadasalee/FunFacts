package ma.projet.funfacts;

import java.util.Random;

public class FactBook {
    public String[] mFact={
            "Fourmis entendent quand ils se reveillent le matin",
   "Autruches peuvent courir ","kdjhfouehf","ksoifhsongf","kdhgroih","kjfdsgisd","kjhfjsdnnv","kdhfgjdv","kdjgkcxv  gfd","abvhbs f",
    };
    public String getFact(){
        String fact ="";
        Random randoGenerator =new Random();
        int randomNumber=randoGenerator.nextInt(mFact.length);
        fact=mFact[randomNumber];
        return  fact;
    }
}
