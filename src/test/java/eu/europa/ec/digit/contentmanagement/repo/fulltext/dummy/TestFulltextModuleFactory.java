package eu.europa.ec.digit.contentmanagement.repo.fulltext.dummy;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.europa.ec.digit.contentmanagement.repo.fulltext.FulltextSearchModuleFactory;
import eu.europa.ec.digit.contentmanagement.repo.fulltext.FulltextSearchModule_i;

/**
 * 
 * @author bentsth
 */
public class TestFulltextModuleFactory {

    @Test
    public void test() throws Exception {
        FulltextSearchModule_i auth = FulltextSearchModuleFactory.getModule();
        assertNotNull(auth);
        assertEquals(FulltextSearchModuleDummyImpl.class, auth.getClass());
    }
}
