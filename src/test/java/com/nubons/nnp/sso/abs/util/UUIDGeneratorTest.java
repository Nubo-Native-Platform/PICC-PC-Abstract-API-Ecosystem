package com.nubons.nnp.sso.abs.util;

import com.nubons.nnp.sso.abs.constants.APIConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UUIDGeneratorTest {

    @Test
    void testGenerateId() {
        String id = UUIDGenerator.generateId(APIConstants.ID_PREFIX_REGISTRY);
        assertNotNull(id);
        assertTrue(id.startsWith(APIConstants.ID_PREFIX_REGISTRY + APIConstants.ID_DELIM));
    }

    @Test
    void testUniqueIdGeneration() {
        String id1 = UUIDGenerator.generateId(APIConstants.ID_PREFIX_ROUTE);
        String id2 = UUIDGenerator.generateId(APIConstants.ID_PREFIX_ROUTE);
        assertNotNull(id1);
        assertNotNull(id2);
        assertTrue(!id1.equals(id2));
    }
}
