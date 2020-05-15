package com.felicanetworks.sductrl;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.sdu.CheckingStatusEventListener;
import com.felicanetworks.sdu.DividingEventListener;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControlFunctionLibrary implements FunctionCodeInterface {
    private CheckChipStatusThread _ciThread = null;
    private AppContext _context;
    private DivideThread _riThread = null;

    public ControlFunctionLibrary(AppContext appContext) {
        this._context = appContext;
    }

    public int getClassCode() {
        return 2;
    }

    public int getFunctionCode() {
        return 33;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r0.isAliveThread() == false) goto L_0x0017;
     */
    public void startCheckingStatus(CheckingStatusEventListener checkingStatusEventListener) {
        if (checkingStatusEventListener != null) {
            try {
                CheckChipStatusThread checkChipStatusThread = this._ciThread;
                if (checkChipStatusThread == null || !checkChipStatusThread.isAliveThread()) {
                    DivideThread divideThread = this._riThread;
                    if (divideThread == null) {
                    }
                    CheckChipStatusThread checkChipStatusThread2 = new CheckChipStatusThread(this._context);
                    this._ciThread = checkChipStatusThread2;
                    checkChipStatusThread2.startThread(checkingStatusEventListener);
                    return;
                }
                throw new IllegalThreadStateException("Running Process");
            } catch (Exception e) {
                throw new ControlFunctionException(e.getMessage(), this._context.logMgr.out(LogMgr.CatExp.ERR, this, e), 3);
            }
        } else {
            throw new IllegalArgumentException("Bad Param : Listener is null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r0.isAliveThread() == false) goto L_0x0017;
     */
    public void startDividing(DividingEventListener dividingEventListener) {
        if (dividingEventListener != null) {
            try {
                CheckChipStatusThread checkChipStatusThread = this._ciThread;
                if (checkChipStatusThread == null || !checkChipStatusThread.isAliveThread()) {
                    DivideThread divideThread = this._riThread;
                    if (divideThread == null) {
                    }
                    DivideThread divideThread2 = new DivideThread(this._context);
                    this._riThread = divideThread2;
                    divideThread2.startThread(dividingEventListener);
                    return;
                }
                throw new IllegalThreadStateException("Running Process");
            } catch (Exception e) {
                throw new ControlFunctionException(e.getMessage(), this._context.logMgr.out(LogMgr.CatExp.ERR, this, e), 3);
            }
        } else {
            throw new IllegalArgumentException("Bad Param : Listener is null");
        }
    }

    public void stopCheckingStatus() {
        try {
            CheckChipStatusThread checkChipStatusThread = this._ciThread;
            if (checkChipStatusThread != null && checkChipStatusThread.isAliveThread()) {
                this._ciThread.stopThread();
            }
        } catch (Exception e) {
            throw new ControlFunctionException(e.getMessage(), this._context.logMgr.out(LogMgr.CatExp.ERR, this, e), 3);
        }
    }

    public void stopDividing() {
        try {
            DivideThread divideThread = this._riThread;
            if (divideThread != null && divideThread.isAliveThread()) {
                this._riThread.stopThread();
            }
        } catch (Exception e) {
            throw new ControlFunctionException(e.getMessage(), this._context.logMgr.out(LogMgr.CatExp.ERR, this, e), 3);
        }
    }
}
