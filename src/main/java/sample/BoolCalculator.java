package sample;

import org.apache.log4j.Logger;

/*

 */
public class BoolCalculator {

    static final Logger logger = Logger.getLogger(BoolCalculator.class);


    public static boolean conjunction(Boolean x, Boolean y){
        logger.info("conjunction operation " + " " + x + " " + y);
        if(!x){
            if (!y){
                logger.info("result is false");
                return false;//00;

            }
            else {
                logger.info("result is false");
                return false;//01

            }
        }
        else{
            if (!y){
                logger.info("result is false");
                return false;//10

            }
            else {
                logger.info("result is true");
                return true;//11

            }
        }

    }
    public static boolean denial_implication(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return false;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }
    public static boolean repeat_x(Boolean x, Boolean y){
        logger.info("repeat_x operation " + " " + x + " " + y);
        logger.info("result " + x);
        return x;
    }
    public static boolean denial_inverse_implication(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return true;//01
        }
        else{
            if (!y) return false;//10
            else  return false;//11
        }

    }
    public static boolean repeat_y(Boolean x, Boolean y){
        return y;
    }
    public static boolean denial_equivalence(Boolean x, Boolean y){
        if(!x){
            if (!y) return false;//00
            else  return true;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }
    public static boolean disjunction(Boolean x, Boolean y){
        if(x!=null) return (x||y);
        else return (y||x);
    }
    public static boolean denial_disjunction(Boolean x, Boolean y){
        if(x!=null) return (!(x||y));
        else return (!(y||x));

    }
    public static boolean equivalence(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return false;//01
        }
        else{
            if (!y) return false;//10
            else  return true;//11
        }

    }
    public static boolean denial_repeat_y(Boolean x, Boolean y){
        return !y;
    }
    public static boolean inverse_implication(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return false;//01
        }
        else{
            if (!y) return true;//10
            else  return true;//11
        }

    }
    public static boolean denial_repeat_x(Boolean x, Boolean y){
        return !x;
    }
    public static boolean implication(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return true;//01
        }
        else{
            if (!y) return false;//10
            else  return true;//11
        }

    }
    public static boolean denial_conjunction(Boolean x, Boolean y){
        if(!x){
            if (!y) return true;//00
            else  return true;//01
        }
        else{
            if (!y) return true;//10
            else  return false;//11
        }

    }

    
}
