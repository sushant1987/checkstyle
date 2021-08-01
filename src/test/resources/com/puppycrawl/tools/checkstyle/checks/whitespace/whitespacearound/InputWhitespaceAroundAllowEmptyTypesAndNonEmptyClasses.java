/*
WhitespaceAround
allowEmptyConstructors = (default)false
allowEmptyMethods = (default)false
allowEmptyTypes = (default)false
allowEmptyLoops = (default)false
allowEmptyLambdas = (default)false
allowEmptyCatches = (default)false
ignoreEnhancedForColon = (default)true
tokens = (default)ASSIGN, BAND, BAND_ASSIGN, BOR, BOR_ASSIGN, BSR, BSR_ASSIGN, BXOR, \
         BXOR_ASSIGN, COLON, DIV, DIV_ASSIGN, DO_WHILE, EQUAL, GE, GT, LAMBDA, LAND, \
         LCURLY, LE, LITERAL_CATCH, LITERAL_DO, LITERAL_ELSE, LITERAL_FINALLY, \
         LITERAL_FOR, LITERAL_IF, LITERAL_RETURN, LITERAL_SWITCH, LITERAL_SYNCHRONIZED, \
         LITERAL_TRY, LITERAL_WHILE, LOR, LT, MINUS, MINUS_ASSIGN, MOD, MOD_ASSIGN, \
         NOT_EQUAL, PLUS, PLUS_ASSIGN, QUESTION, RCURLY, SL, SLIST, SL_ASSIGN, SR, \
         SR_ASSIGN, STAR, STAR_ASSIGN, LITERAL_ASSERT, TYPE_EXTENSION_AND


*/

package com.puppycrawl.tools.checkstyle.checks.whitespace.whitespacearound;

import java.util.function.Function;
import java.util.function.Supplier;

public class InputWhitespaceAroundAllowEmptyTypesAndNonEmptyClasses{ // violation

    private Object object;

    class SomeClass{
        int a = 5;
    }

    public class CheckstyleTest{
        private static final int SOMETHING = 1;
    }

    class MyClass{ int a; }

    class SomeTestClass{int a;}

    class TestClass { int a; }int b;

    class Table {}

    interface SupplierFunction<T> extends Function<Supplier<T>, T> {}

    class NotEmptyClass{ public void foo1() { foo2(); } }

    public void foo2() {
        do {} while (true);
    }
}
