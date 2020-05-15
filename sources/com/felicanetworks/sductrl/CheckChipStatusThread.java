package com.felicanetworks.sductrl;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.CheckingStatusEventListener;
import com.felicanetworks.sdu.ErrorInfo;
import com.felicanetworks.sdu.ErrorInfoFactory;
import com.felicanetworks.sductrl.chip.FelicaAccess;
import com.felicanetworks.sductrl.chip.FelicaAccessException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckChipStatusThread implements FunctionCodeInterface {
    /* access modifiers changed from: private */
    public AppContext _context;
    /* access modifiers changed from: private */
    public CheckChipStatusWorkerThread _thread = null;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CheckChipStatusWorkerThread extends Thread {
        private static final int RESULT_KIND_CANCELED = 3;
        private static final int RESULT_KIND_COMPLETE = 0;
        private static final int RESULT_KIND_ERROR = 2;
        private int _compState = 0;
        private ErrorInfo _errorInfo = null;
        private FelicaAccess _felicaAccess = null;
        private CheckingStatusEventListener _listener;
        private int _resultKind = 0;

        public CheckChipStatusWorkerThread(CheckingStatusEventListener checkingStatusEventListener) {
            this._listener = checkingStatusEventListener;
        }

        private synchronized void checkCancel() {
            if (isInterrupted()) {
                throw new InterruptedException();
            }
        }

        private synchronized void finishFeliCaAccess() {
            FelicaAccess felicaAccess = this._felicaAccess;
            if (felicaAccess != null) {
                felicaAccess.felicaUseEnd();
                this._felicaAccess = null;
            }
        }

        private void notifyResult() {
            CheckingStatusEventListener checkingStatusEventListener = this._listener;
            if (checkingStatusEventListener != null) {
                int i = this._resultKind;
                if (i == 0) {
                    checkingStatusEventListener.finished(this._compState);
                } else if (i == 2) {
                    checkingStatusEventListener.errorOccurred(this._errorInfo);
                }
                this._listener = null;
            }
        }

        private void setResultComplete(int i) {
            this._resultKind = 0;
            this._compState = i;
        }

        private void setResultError(ErrorInfo errorInfo) {
            this._resultKind = 2;
            this._errorInfo = errorInfo;
        }

        public void run() {
            int chipStatus;
            try {
                synchronized (this) {
                    checkCancel();
                    FelicaAccess felicaAccess = new FelicaAccess(CheckChipStatusThread.this._context, this);
                    this._felicaAccess = felicaAccess;
                    felicaAccess.felicaUseStart();
                }
                synchronized (this) {
                    checkCancel();
                    chipStatus = this._felicaAccess.getChipStatus();
                }
                checkCancel();
                setResultComplete(chipStatus);
                synchronized (CheckChipStatusThread.this) {
                    if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        CheckChipStatusWorkerThread unused = CheckChipStatusThread.this._thread = null;
                    }
                }
                try {
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                } catch (Exception e) {
                    CheckChipStatusThread.this._context.logMgr.out(LogMgr.CatExp.ERR, CheckChipStatusThread.this, e);
                }
            } catch (InterruptedException e2) {
                this._resultKind = 3;
                interrupt();
                synchronized (CheckChipStatusThread.this) {
                    if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        CheckChipStatusWorkerThread unused2 = CheckChipStatusThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (FelicaAccessException e3) {
                CheckChipStatusThread.this._context.logMgr.out(LogMgr.CatExp.WAR, CheckChipStatusThread.this, e3);
                setResultError(ErrorInfoFactory.createErrorInfo(e3));
                synchronized (CheckChipStatusThread.this) {
                    if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        CheckChipStatusWorkerThread unused3 = CheckChipStatusThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (FelicaException e4) {
                CheckChipStatusThread.this._context.logMgr.out(LogMgr.CatExp.WAR, CheckChipStatusThread.this, e4);
                setResultError(ErrorInfoFactory.createErrorInfo(e4));
                synchronized (CheckChipStatusThread.this) {
                    if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        CheckChipStatusWorkerThread unused4 = CheckChipStatusThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (Exception e5) {
                try {
                    setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_UNKNOWN, CheckChipStatusThread.this._context.logMgr.out(LogMgr.CatExp.ERR, CheckChipStatusThread.this, e5)));
                    synchronized (CheckChipStatusThread.this) {
                        if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            CheckChipStatusWorkerThread unused5 = CheckChipStatusThread.this._thread = null;
                        }
                        if (!isInterrupted()) {
                            finishFeliCaAccess();
                            notifyResult();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (CheckChipStatusThread.this) {
                        if (CheckChipStatusThread.this._thread == null || !CheckChipStatusThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            CheckChipStatusWorkerThread unused6 = CheckChipStatusThread.this._thread = null;
                        }
                        try {
                            if (!isInterrupted()) {
                                finishFeliCaAccess();
                                notifyResult();
                            }
                        } catch (Exception e6) {
                            CheckChipStatusThread.this._context.logMgr.out(LogMgr.CatExp.ERR, CheckChipStatusThread.this, e6);
                        }
                        throw th;
                    }
                }
            }
        }

        public synchronized void setCancel() {
            interrupt();
            FelicaAccess felicaAccess = this._felicaAccess;
            if (felicaAccess != null) {
                felicaAccess.notifyThread();
            }
            finishFeliCaAccess();
        }
    }

    public CheckChipStatusThread(AppContext appContext) {
        this._context = appContext;
    }

    public int getClassCode() {
        return 1;
    }

    public int getFunctionCode() {
        return 33;
    }

    public synchronized boolean isAliveThread() {
        CheckChipStatusWorkerThread checkChipStatusWorkerThread;
        checkChipStatusWorkerThread = this._thread;
        return checkChipStatusWorkerThread != null ? checkChipStatusWorkerThread.isAlive() : false;
    }

    public synchronized void startThread(CheckingStatusEventListener checkingStatusEventListener) {
        if (!isAliveThread()) {
            CheckChipStatusWorkerThread checkChipStatusWorkerThread = new CheckChipStatusWorkerThread(checkingStatusEventListener);
            this._thread = checkChipStatusWorkerThread;
            checkChipStatusWorkerThread.start();
        }
    }

    public synchronized void stopThread() {
        CheckChipStatusWorkerThread checkChipStatusWorkerThread = this._thread;
        if (checkChipStatusWorkerThread != null) {
            checkChipStatusWorkerThread.setCancel();
            this._thread = null;
        }
    }
}
