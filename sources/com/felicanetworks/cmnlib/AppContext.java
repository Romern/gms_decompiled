package com.felicanetworks.cmnlib;

import android.content.Context;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.Felica;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppContext implements FunctionCodeInterface {
    public Context androidContext = null;
    public Felica felica = null;
    public FSC fsc = null;
    public LogMgr logMgr = null;
    public String[] permitList;
    public SgMgr sgMgr = null;
    public String userAgent = null;

    public int getClassCode() {
        return 0;
    }

    public int getFunctionCode() {
        return 0;
    }
}
