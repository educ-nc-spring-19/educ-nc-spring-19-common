package com.educ_nc_spring_19.educ_nc_spring_19_common.common;

public interface Auditable {
    Audit getAudit();

    void setAudit(Audit audit);
}
