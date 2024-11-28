package br.com.danilo;

/**
 * @author danmoreira28
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ContratoServiceTest.class, ContratoServiceTestMock.class})
public class AllTests{
}

