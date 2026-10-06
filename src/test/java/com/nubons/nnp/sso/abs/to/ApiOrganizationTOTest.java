package com.nubons.nnp.sso.abs.to;

import com.nubons.nnp.sso.abs.entity.ApiOrganization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApiOrganizationTOTest {

    @Test
    void testEntityToDtoMapping() {
        ApiOrganization entity = new ApiOrganization();
        entity.setOrgId("ORG-101");
        entity.setOrgName("FinTech Corp");
        entity.setOrgType("ENTERPRISE");

        ApiOrganizationTO to = ApiOrganizationTO.fromEntity(entity);
        assertNotNull(to);
        assertEquals("ORG-101", to.getOrgId());
        assertEquals("FinTech Corp", to.getOrgName());
        assertEquals("ENTERPRISE", to.getOrgType());

        ApiOrganization convertedBack = ApiOrganizationTO.toEntity(to);
        assertNotNull(convertedBack);
        assertEquals("ORG-101", convertedBack.getOrgId());
        assertEquals("FinTech Corp", convertedBack.getOrgName());
        assertEquals("ENTERPRISE", convertedBack.getOrgType());
    }
}
