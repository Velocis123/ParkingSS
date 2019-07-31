package com.booking.parkingss.Application;

import android.app.Application;

public class Flag extends Application {

    private boolean flag;


public boolean login_type;

    public boolean isLogin_type() {
        return login_type;
    }

    public void setLogin_type(boolean login_type) {
        this.login_type = login_type;
    }

    public Flag() {

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
