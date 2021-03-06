package fr.neatmonster.intel8086.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestAdc.class,
    TestAdd.class,
    TestCmp.class,
    TestDec.class,
    TestInc.class,
    TestMov.class,
    TestPop.class,
    TestPush.class,
    TestSbb.class,
    TestSub.class,
    TestXchg.class })
public class TestSuite {

    public static void main(final String[] args) {
        JUnitCore.main(TestSuite.class.getName());
    }
}
