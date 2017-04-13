package sample;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 */
public class BoolCalculatorTest {

    static final Logger logger = Logger.getLogger(BoolCalculator.class);



    /**  AND Кон*юнкція*/
    @Test
    public void conjunction_null_null() throws Exception {

        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_null_null result= " + result);
        Assert.assertEquals(null, result);

    }
    @Test
    public void conjunction_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("conjunction_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void conjunction_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("conjunction_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void conjunction_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void conjunction_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void conjunction_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void conjunction_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void conjunction_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_true_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void conjunction_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.conjunction(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test conjunction_true_true result= " + result);
        Assert.assertEquals(true, result);
    }

    /** INHIBITION  заперечення імплікації*/
    @Test
    public void denial_implication_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_implication_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_implication_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_implication_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_implication_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_implication_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_implication_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_implication_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_implication_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_implication(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_implication_true_true result= " + result);
        Assert.assertEquals(false, result);
    }
    /**  REPEAT X */
    @Test
    public void repeat_x_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_x_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_x_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_x_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_false_null result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_x_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_x_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_x_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_true_null result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void repeat_x_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void repeat_x_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_x(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_x_true_true result= " + result);
        Assert.assertEquals(true, result);
    }

    /**   заперечення оберненої імплікації*/
    @Test
    public void denial_inverse_implication_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_inverse_implication_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_inverse_implication_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_inverse_implication_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_inverse_implication_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("denial_inverse_implication_false_false= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_inverse_implication_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("denial_inverse_implication_false_true= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_inverse_implication_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_inverse_implication_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("denial_inverse_implication_true_false= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_inverse_implication_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_inverse_implication(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_inverse_implication_true_true result= " + result);
        Assert.assertEquals(false, result);
    }
    /** FUNCTION F5 - Repeat Y */
    @Test
    public void repeat_y_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_y_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_null_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_y_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_null_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void repeat_y_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_y_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_y_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void repeat_y_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void repeat_y_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_true_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void repeat_y_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.repeat_y(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test repeat_y_true_true result= " + result);
        Assert.assertEquals(true, result);
    }
    /**  XOR додавання за модулем 2*/
    @Test
    public void denial_equivalence_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_equivalence_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_equivalence_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_equivalence_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_equivalence_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_equivalence_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_equivalence_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_equivalence_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_equivalence_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_equivalence(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_equivalence_true_true result= " + result);
        Assert.assertEquals(false, result);
    }
    /**  OR диз'юнкція*/
    @Test
    public void disjunction_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_null_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunction_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void disjunction_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_false_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void disjunction_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(false, true);
        }

        catch (NullPointerException e){

        }
        logger.info("Test disjunction_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunction_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_true_null result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunction_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void disjunction_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.disjunction(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test disjunction_true_true result= " + result);
        Assert.assertEquals(true, result);
    }
    /**  NOR заперечення диз*юнкції, стрілка Пірса*/
    @Test
    public void denial_disjunction_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_disjunction_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_disjunction_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_null_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_disjunction_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_disjunction_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_disjunction_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_disjunction_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_true_null result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_disjunction_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_true_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_disjunction_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_disjunction(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_disjunction_true_true result= " + result);
        Assert.assertEquals(false, result);
    }
    /**  EQUIVALENCE еквівалентність */
    @Test
    public void equivalence_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void equivalence_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void equivalence_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void equivalence_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void equivalence_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void equivalence_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void equivalence_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void equivalence_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_true_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void equivalence_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.equivalence(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test equivalence_true_true result= " + result);
        Assert.assertEquals(true, result);
    }
    /**  NOT Y заперечення другого аргументую*/
    @Test
    public void denial_repeat_y_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_y_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_null_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_y_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_null_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_repeat_y_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_y_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_y_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_repeat_y_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_y_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_y_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_y(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_y_true_true= " + result);
        Assert.assertEquals(false, result);
    }
    /**  ANTI-IMPLICATION */
    @Test
    public void inverse_implication_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void inverse_implication_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void inverse_implication_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void inverse_implication_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void inverse_implication_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void inverse_implication_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_false_true result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void inverse_implication_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void inverse_implication_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void inverse_implication_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.inverse_implication(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test inverse_implication_true_true result= " + result);
        Assert.assertEquals(true, result);
    }
    /** NOT X заперечення першого аргументу*/
    @Test
    public void denial_repeat_x_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_x_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_x_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_null_truel result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_repeat_x_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_false_null result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_x_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_x_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_repeat_x_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_true_null result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_repeat_x_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_true_falsel result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void denial_repeat_x_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_repeat_x(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_repeat_x_true_true result= " + result);
        Assert.assertEquals(false, result);
    }
    /**  IMPLICATION імплікація */
    @Test
    public void implication_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void implication_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void implication_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void implication_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void implication_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_false_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implication_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void implication_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void implication_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_true_false result= " + result);
        Assert.assertEquals(false, result);
    }
    @Test
    public void implication_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.implication(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test implication_true_true result= " + result);
        Assert.assertEquals(true, result);
    }
    /**  NOT AND заперечення кон*юнкції ,штрих Шефера  */
    @Test
    public void denial_conjunction_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(null, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_null_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_conjunction_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(null, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_null_false result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_conjunction_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(null, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_null_true result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_conjunction_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(false, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_false_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_conjunction_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(false, false);
        }
        catch (NullPointerException e){

        }
        logger.info("denial_conjunction_false_false= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_conjunction_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(false, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_false_true result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_conjunction_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(true, null);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_true_null result= " + result);
        Assert.assertEquals(null, result);
    }
    @Test
    public void denial_conjunction_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(true, false);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_true_false result= " + result);
        Assert.assertEquals(true, result);
    }
    @Test
    public void denial_conjunction_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.denial_conjunction(true, true);
        }
        catch (NullPointerException e){

        }
        logger.info("Test denial_conjunction_true_true result= " + result);
        Assert.assertEquals(false, result);
    }


}