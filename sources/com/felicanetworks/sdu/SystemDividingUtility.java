package com.felicanetworks.sdu;

import android.content.Context;
import com.felicanetworks.cmnctrl.net.NetworkAccessException;
import com.felicanetworks.cmnctrl.net.NetworkUtil;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.cmnlib.p005sg.SgMgrException;
import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.sductrl.ControlFunctionException;
import com.felicanetworks.sductrl.ControlFunctionLibrary;
import com.felicanetworks.sdulib.p006sg.SduSgMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemDividingUtility {
    protected Context androidContext;
    protected AppContext appContext;
    protected ControlFunctionLibrary controller;
    protected String[] permitList;

    public SystemDividingUtility(Context context, String[] strArr) {
        if (context != null) {
            this.permitList = strArr;
            this.androidContext = context;
            return;
        }
        throw new SystemDividingException("context is null.");
    }

    private AppContext createAppContext(Context context) {
        AppContext appContext2 = new AppContext();
        appContext2.androidContext = context.getApplicationContext();
        appContext2.sgMgr = new SduSgMgr(appContext2);
        appContext2.sgMgr.loadSg();
        appContext2.logMgr = new LogMgr(appContext2);
        NetworkUtil.setUserAgent(appContext2, (String) appContext2.sgMgr.getSgValue(55));
        return appContext2;
    }

    public static String getLibraryVersion() {
        return "1.5.0";
    }

    private void init() {
        if (this.appContext == null) {
            try {
                this.appContext = createAppContext(this.androidContext);
                this.controller = new ControlFunctionLibrary(this.appContext);
                this.appContext.permitList = this.permitList;
            } catch (SgMgrException e) {
                throw new SystemDividingException("", e);
            } catch (NetworkAccessException e2) {
                throw new SystemDividingException("", e2);
            }
        }
    }

    public void startCheckingStatus(Felica felica, CheckingStatusEventListener checkingStatusEventListener) {
        if (felica == null) {
            throw new SystemDividingException("felica is null.");
        } else if (checkingStatusEventListener != null) {
            try {
                init();
                this.appContext.felica = felica;
                this.controller.startCheckingStatus(checkingStatusEventListener);
            } catch (ControlFunctionException e) {
                throw new SystemDividingException("", e);
            }
        } else {
            throw new SystemDividingException("listener is null.");
        }
    }

    public void startDividing(Felica felica, FSC fsc, DividingEventListener dividingEventListener) {
        if (felica == null) {
            throw new SystemDividingException("felica is null.");
        } else if (fsc == null) {
            throw new SystemDividingException("fsc is null.");
        } else if (dividingEventListener != null) {
            try {
                init();
                AppContext appContext2 = this.appContext;
                appContext2.felica = felica;
                appContext2.fsc = fsc;
                this.controller.startDividing(dividingEventListener);
            } catch (ControlFunctionException e) {
                throw new SystemDividingException("", e);
            }
        } else {
            throw new SystemDividingException("listener is null.");
        }
    }

    public void stopCheckingStatus() {
        try {
            init();
            this.controller.stopCheckingStatus();
        } catch (ControlFunctionException e) {
            throw new SystemDividingException("", e);
        }
    }

    public void stopDividing() {
        try {
            init();
            this.controller.stopDividing();
        } catch (ControlFunctionException e) {
            throw new SystemDividingException("", e);
        }
    }
}
