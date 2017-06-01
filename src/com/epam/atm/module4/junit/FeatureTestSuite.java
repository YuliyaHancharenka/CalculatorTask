package com.epam.atm.module4.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CosTest.class,
        CtgTest.class,
        DivByZeroTest.class,
        DivDoubleTest.class,
        DivLongTest.class,
        MultDoubleTest.class,
        MultLongTest.class,
        PowTest.class,
        SinTest.class,
        SqrtTest.class,
        SubDoubleTest.class,
        SubLongTest.class,
        SumDoubleTest.class,
        SumLongTest.class,
        TgTest.class,
})

public class FeatureTestSuite {

    // the class remains empty,
    // used only as a holder for the above annotations
}