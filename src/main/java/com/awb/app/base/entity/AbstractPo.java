package com.awb.app.base.entity;

import java.io.Serializable;

public abstract class AbstractPo implements Serializable {

    public abstract void setCreateUsername(String createUsername);

    public abstract void setCreateDatetime(String createDatetime);

    public abstract void setUpdateUsername(String updateUsername);

    public abstract void setUpdateDatetime(String updateDatetime);

}
