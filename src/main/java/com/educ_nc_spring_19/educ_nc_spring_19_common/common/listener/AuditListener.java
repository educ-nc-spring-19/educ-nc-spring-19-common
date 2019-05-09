package com.educ_nc_spring_19.educ_nc_spring_19_common.common.listener;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.Audit;
import com.educ_nc_spring_19.educ_nc_spring_19_common.common.Auditable;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class AuditListener {

    @PrePersist
    public void setCreated(Auditable auditable) {
        Audit audit = auditable.getAudit();

        if (audit == null) {
            audit = new Audit();
            auditable.setAudit(audit);
        }

        audit.setCreatedDate(OffsetDateTime.now());
        // use "System" user UUID till implementation AAA service
        audit.setCreatedByUserId(UUID.fromString("b9ed2a13-de38-4df0-b70a-92c9baf32494"));
    }

    @PreUpdate
    public void setUpdated(Auditable auditable) {
        Audit audit = auditable.getAudit();

        audit.setUpdatedDate(OffsetDateTime.now());
        // use "System" user UUID till implementation AAA service
        audit.setUpdatedByUserId(UUID.fromString("b9ed2a13-de38-4df0-b70a-92c9baf32494"));
    }
}
