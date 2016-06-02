package Entity;

import java.util.Date;

public class RefundLogInfo {
    private String orderno;

    private Date logtime;

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }
}