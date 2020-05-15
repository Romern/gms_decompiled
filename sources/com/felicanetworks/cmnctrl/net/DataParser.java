package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.cmnlib.util.DataCheckerException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataParser implements FunctionCodeInterface {
    public static final int COM_DATA_LENGTH = 8;
    public static final String CONNECT_TYPE_POST = "POST";
    public static final String CONTENT_LENGTH_KEY = "content-length";
    public static final String CONTENT_TYPE_KEY = "content-type";
    public static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded";
    public static final String USER_AGENT_KEY = "user-agent";
    protected AppContext context;

    public DataParser(AppContext appContext) {
        this.context = appContext;
    }

    /* access modifiers changed from: protected */
    public DataParseException createDataParseException(Exception exc, boolean z, int i) {
        int i2;
        if (z) {
            if (!(exc instanceof DataCheckerException)) {
                return new DataParseException(exc, this.context.logMgr.out(LogMgr.CatExp.ERR, this, exc), 3);
            }
            if (((DataCheckerException) exc).getErrorId() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            return new DataParseException(exc, this.context.logMgr.out(LogMgr.CatExp.ERR, this, exc), i2);
        } else if (i == 0) {
            return new DataParseException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), 2);
        } else {
            return new DataParseException(exc, this.context.logMgr.out(LogMgr.CatExp.WAR, this, exc), i, 2);
        }
    }

    public int getClassCode() {
        return 2;
    }

    public int getFunctionCode() {
        return 4;
    }
}
