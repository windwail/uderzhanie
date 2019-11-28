package ru.sber.uderganie.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import ru.sber.uderganie.model.Claim;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClaimRepositoryTest {

    @Autowired
    ClaimRepository claimRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testClaim() throws Exception {
        LocalDate now = LocalDate.now();

        Claim c = Claim.builder()
                .claimId("claimId")
                .claimStatus("claimStatus")
                .empleyeeId("empleyeeId")
                .employeeReason("employeeReason")
                .executionStatus("executionStatus")
                .fireDate(now)
                .fireType("fireType")
                .build();

        Long id = entityManager.persistAndGetId(c, Long.class);

        c = claimRepository.findById(id).get();

        assertThat(c)
                .hasFieldOrPropertyWithValue("claimId","claimId")
                .hasFieldOrPropertyWithValue("claimStatus","claimStatus")
                .hasFieldOrPropertyWithValue("empleyeeId","empleyeeId")
                .hasFieldOrPropertyWithValue("employeeReason","employeeReason")
                .hasFieldOrPropertyWithValue("executionStatus","executionStatus")
                .hasFieldOrPropertyWithValue("fireType","fireType")
                .hasFieldOrPropertyWithValue("fireDate",now);

    }

}
