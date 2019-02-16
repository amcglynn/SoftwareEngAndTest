package ie.gmit.softwareeng;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise3 {

    @Test
    public void testValidValue1() {
        Validator validator = new Validator();
        assertTrue(validator.isValid("ZWEyZTIzOGItNjdjNS00Y2FhLWExNjMtYWExM2QzNjE0Y2JlOmVhMmUyMzhiLTY3YzUtNGNhYS1hMTYzLWFhMTNkMzYxNGNiZQ=="));
    }

    @Test
    public void testValidValue2() {
        Validator validator = new Validator();
        assertTrue(validator.isValid("NTkyZTY1ZDctYjExZC00M2QwLTgwMzctMzI1M2QwNGYxOWQwOjRhYzFmMmY1LWE0MDMtNDMwNS1hMWFjLTkwMWQ3MzgwNTI3Yw=="));
    }

    @Test
    public void testValidatorFailsWhenThereIsNoColonInTheDecodedString() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("ZWEyZTIzOGItNjdjNS00Y2FhLWExNjMtYWExM2QzNjE0Y2JlZWEyZTIzOGItNjdjNS00Y2FhLWExNjMtYWExM2QzNjE0Y2Jl"));
    }

    @Test
    public void testValidatorFailsWhenThereAreTooManyColonsInTheDecodedString() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("ZWEyZTIzOGItNjdjNS00Y2FhLWExNjMtYWExM2QzNjE0OmE6YjpjYmVlYTJlMjM4Yi02N2M1LTRjYWEtYTE2My1hYTEzZDM2MTRjYmU="));
    }

    @Test
    public void testValidatorFailsWhenTheSecondUuidIsEmpty() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("ZWEyZTIzOGItNjdjNS00Y2FhLWExNjMtYWExM2QzNjE0Og=="));
    }

    @Test
    public void testValidatorFailsWhenTheUuidsAreInvalid1() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("ZWEyZTIzOGItNjdjNS00Y2FhOmExNjMtYWExM2QzNjE0"));
    }

    @Test
    public void testValidatorFailsWhenTheUuidsAreInvalid2() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("bnVsbDpudWxs"));
    }

    @Test
    public void testValidatorFailsWhenTheInputStringIsNull() {
        Validator validator = new Validator();
        assertFalse(validator.isValid(null));
    }

    @Test
    public void testValidatorFailsWhenTheInputStringIsNotBase64Encoded() {
        Validator validator = new Validator();
        assertFalse(validator.isValid("-----"));
    }

    @Test
    public void testValidatorFailsWhenTheInputStringIsEmpty() {
        Validator validator = new Validator();
        assertFalse(validator.isValid(""));
    }
}
