package sample;

import org.apache.log4j.Logger;

/*

 */
public class BoolCalculator {

    static final Logger logger = Logger.getLogger(BoolCalculator.class);


    public static boolean conjunction(Boolean x, Boolean y){
        logger.info("Function conjunction started");

        if(!x){
            if (!y){

                return false;//00;

            }
            else {

                return false;//01

            }
        }
        else{
            if (!y){

                return false;//10

            }
            else {

                return true;//11

            }
        }

    }
    public static boolean denial_implication(Boolean x, Boolean y){
        logger.info("Function denial_implication started");

        if(!x){
            if (!y)
            {

                 return false;//00
            }

            else{

                return false;//01
            }
        }
        else{
            if (!y){

                 return true;//10
            }
            else {

                return false;//11
            }
        }

    }
    public static boolean repeat_x(Boolean x, Boolean y){

        logger.info("Function repeat_x started");
        return x;
    }
    public static boolean denial_inverse_implication(Boolean x, Boolean y){
        logger.info("Function denial_inverse_implication started");
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
        logger.info("Function repeat_y started");
        return y;
    }
    public static boolean denial_equivalence(Boolean x, Boolean y){
        logger.info("Function denial_equivalence started");
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
        logger.info("Function disjunction started");
        if(x!=null) return (x||y);
        else return (y||x);
    }
    public static boolean denial_disjunction(Boolean x, Boolean y){
        logger.info("Function denial_disjunction started");
        if(x!=null) return (!(x||y));
        else return (!(y||x));

    }
    public static boolean equivalence(Boolean x, Boolean y){
        logger.info("Function equivalence started");
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
        logger.info("Function denial_repeat_y started");
        return !y;
    }
    public static boolean inverse_implication(Boolean x, Boolean y){
        logger.info("Function inverse_implication started");
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
        logger.info("Function denial_repeat_x started");
        return !x;
    }
    public static boolean implication(Boolean x, Boolean y){
        logger.info("Function implication started");
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
        logger.info("Function denial_conjunction started");

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
