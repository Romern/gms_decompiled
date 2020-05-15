package com.felicanetworks.sductrl;

import com.felicanetworks.cmnctrl.net.DataParseException;
import com.felicanetworks.cmnctrl.net.NetworkAccess;
import com.felicanetworks.cmnctrl.net.NetworkAccessException;
import com.felicanetworks.cmnctrl.net.NetworkAccessRequestData;
import com.felicanetworks.cmnctrl.net.NetworkAccessResponseData;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.log.LogMgr;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.DividingEventListener;
import com.felicanetworks.sdu.ErrorInfo;
import com.felicanetworks.sdu.ErrorInfoFactory;
import com.felicanetworks.sductrl.chip.FelicaAccess;
import com.felicanetworks.sductrl.chip.FelicaAccessException;
import com.felicanetworks.sductrl.net.AuthResponseData;
import com.felicanetworks.sductrl.net.SduDataParser;
import com.felicanetworks.sductrl.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DivideThread implements FunctionCodeInterface {
    /* access modifiers changed from: private */
    public AppContext _context;
    /* access modifiers changed from: private */
    public DivideWorkerThread _thread = null;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DivideWorkerThread extends Thread {
        private static final String MOBILE_IDENTIFICATION_INFO = "0000000000000000000000";
        private static final int RESULT_KIND_CANCELED = 3;
        private static final int RESULT_KIND_COMPLETE = 0;
        private static final int RESULT_KIND_ERROR = 2;
        private ErrorInfo _errorInfo = null;
        private FelicaAccess _felicaAccess = null;
        private DividingEventListener _listener = null;
        private NetworkAccess _na = new NetworkAccess(DivideThread.this._context);
        private int _resultKind = 0;

        public DivideWorkerThread(DividingEventListener dividingEventListener) {
            this._listener = dividingEventListener;
        }

        private void notifyResult() {
            DividingEventListener dividingEventListener = this._listener;
            if (dividingEventListener != null) {
                int i = this._resultKind;
                if (i == 0) {
                    dividingEventListener.finished();
                } else if (i == 2) {
                    dividingEventListener.errorOccurred(this._errorInfo);
                }
                this._listener = null;
            }
        }

        private void setResultComplete() {
            this._resultKind = 0;
        }

        private void setResultError(ErrorInfo errorInfo) {
            this._resultKind = 2;
            this._errorInfo = errorInfo;
        }

        public synchronized void checkCancel() {
            if (isInterrupted()) {
                throw new InterruptedException();
            }
        }

        public synchronized void finishFeliCaAccess() {
            FelicaAccess felicaAccess = this._felicaAccess;
            if (felicaAccess != null) {
                felicaAccess.felicaUseEnd();
            }
        }

        public void run() {
            byte[] createTicket;
            int startOnline;
            try {
                synchronized (this) {
                    checkCancel();
                    FelicaAccess felicaAccess = new FelicaAccess(DivideThread.this._context, this);
                    this._felicaAccess = felicaAccess;
                    felicaAccess.felicaUseStart();
                }
                Integer num = (Integer) DivideThread.this._context.sgMgr.getSgValue(53);
                synchronized (this) {
                    checkCancel();
                    createTicket = new TextUtils(DivideThread.this._context).createTicket(MOBILE_IDENTIFICATION_INFO, num.intValue(), this._felicaAccess);
                }
                checkCancel();
                if (createTicket != null) {
                    checkCancel();
                    SduDataParser sduDataParser = new SduDataParser(DivideThread.this._context);
                    NetworkAccessRequestData createAuthQuerryData = sduDataParser.createAuthQuerryData(createTicket);
                    checkCancel();
                    NetworkAccessResponseData connect = this._na.connect(createAuthQuerryData);
                    checkCancel();
                    try {
                        AuthResponseData parseAuthResponseData = sduDataParser.parseAuthResponseData(connect);
                        int i = parseAuthResponseData.resCode;
                        if (i == 0) {
                            String str = parseAuthResponseData.startUrl;
                            synchronized (this) {
                                checkCancel();
                                startOnline = this._felicaAccess.startOnline(str);
                            }
                            checkCancel();
                            ErrorInfo checkFscStatus = ErrorInfoFactory.checkFscStatus(startOnline);
                            if (checkFscStatus != null) {
                                LogMgr logMgr = DivideThread.this._context.logMgr;
                                LogMgr.CatExp catExp = LogMgr.CatExp.ERR;
                                DivideThread divideThread = DivideThread.this;
                                logMgr.out(catExp, divideThread, new ControlFunctionException("FSC Result : " + startOnline, 3));
                                setResultError(checkFscStatus);
                            } else {
                                setResultComplete();
                            }
                            synchronized (DivideThread.this) {
                                if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                                    this._listener = null;
                                } else {
                                    DivideWorkerThread unused = DivideThread.this._thread = null;
                                }
                            }
                            try {
                                if (!isInterrupted()) {
                                    finishFeliCaAccess();
                                    notifyResult();
                                }
                            } catch (Exception e) {
                                DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, e);
                            }
                        } else if (i != 1) {
                            setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_UNKNOWN, DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, new ControlFunctionException("Unknown Result : Network Access", 3))));
                            synchronized (DivideThread.this) {
                                if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                                    this._listener = null;
                                } else {
                                    DivideWorkerThread unused2 = DivideThread.this._thread = null;
                                }
                            }
                            if (!isInterrupted()) {
                                finishFeliCaAccess();
                                notifyResult();
                            }
                        } else {
                            LogMgr logMgr2 = DivideThread.this._context.logMgr;
                            LogMgr.CatExp catExp2 = LogMgr.CatExp.ERR;
                            DivideThread divideThread2 = DivideThread.this;
                            logMgr2.out(catExp2, divideThread2, new ControlFunctionException("Auth Result : " + parseAuthResponseData.authFinishCode, 3));
                            setResultError(ErrorInfoFactory.createStatusErrorInfo(parseAuthResponseData.authFinishCode));
                            synchronized (DivideThread.this) {
                                if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                                    this._listener = null;
                                } else {
                                    DivideWorkerThread unused3 = DivideThread.this._thread = null;
                                }
                            }
                            if (!isInterrupted()) {
                                finishFeliCaAccess();
                                notifyResult();
                            }
                        }
                    } catch (DataParseException e2) {
                        DivideThread.this._context.logMgr.out(LogMgr.CatExp.WAR, DivideThread.this, e2);
                        setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ""));
                        synchronized (DivideThread.this) {
                            if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                                this._listener = null;
                            } else {
                                DivideWorkerThread unused4 = DivideThread.this._thread = null;
                            }
                            if (!isInterrupted()) {
                                finishFeliCaAccess();
                                notifyResult();
                            }
                        }
                    }
                } else {
                    setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_UNKNOWN, DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, new ControlFunctionException("Creating Ticket Failed", 3))));
                    synchronized (DivideThread.this) {
                        if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            DivideWorkerThread unused5 = DivideThread.this._thread = null;
                        }
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (NetworkAccessException e3) {
                DivideThread.this._context.logMgr.out(LogMgr.CatExp.WAR, DivideThread.this, e3);
                int errorId = e3.getErrorId();
                if (errorId == 1 || errorId == 3 || errorId == 4) {
                    DivideThread.this._context.logMgr.out(LogMgr.CatExp.WAR, DivideThread.this, e3);
                    setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ""));
                    synchronized (DivideThread.this) {
                        if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            DivideWorkerThread unused6 = DivideThread.this._thread = null;
                        }
                        if (!isInterrupted()) {
                            finishFeliCaAccess();
                            notifyResult();
                        }
                    }
                } else if (errorId != 5) {
                    setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_UNKNOWN, DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, e3)));
                    synchronized (DivideThread.this) {
                        if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            DivideWorkerThread unused7 = DivideThread.this._thread = null;
                        }
                        if (!isInterrupted()) {
                            finishFeliCaAccess();
                            notifyResult();
                        }
                    }
                } else {
                    throw new InterruptedException("Network is canceled");
                }
            } catch (InterruptedException e4) {
                this._resultKind = 3;
                interrupt();
                synchronized (DivideThread.this) {
                    if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        DivideWorkerThread unused8 = DivideThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (FelicaAccessException e5) {
                DivideThread.this._context.logMgr.out(LogMgr.CatExp.WAR, DivideThread.this, e5);
                setResultError(ErrorInfoFactory.createErrorInfo(e5));
                synchronized (DivideThread.this) {
                    if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        DivideWorkerThread unused9 = DivideThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (FelicaException e6) {
                DivideThread.this._context.logMgr.out(LogMgr.CatExp.WAR, DivideThread.this, e6);
                setResultError(ErrorInfoFactory.createErrorInfo(e6));
                synchronized (DivideThread.this) {
                    if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                        this._listener = null;
                    } else {
                        DivideWorkerThread unused10 = DivideThread.this._thread = null;
                    }
                    if (!isInterrupted()) {
                        finishFeliCaAccess();
                        notifyResult();
                    }
                }
            } catch (Exception e7) {
                try {
                    setResultError(ErrorInfoFactory.createSduErrorInfo(ErrorInfo.TYPE_SDU_UNKNOWN, DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, e7)));
                    synchronized (DivideThread.this) {
                        if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            DivideWorkerThread unused11 = DivideThread.this._thread = null;
                        }
                        if (!isInterrupted()) {
                            finishFeliCaAccess();
                            notifyResult();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (DivideThread.this) {
                        if (DivideThread.this._thread == null || !DivideThread.this._thread.equals(this)) {
                            this._listener = null;
                        } else {
                            DivideWorkerThread unused12 = DivideThread.this._thread = null;
                        }
                        try {
                            if (!isInterrupted()) {
                                finishFeliCaAccess();
                                notifyResult();
                            }
                        } catch (Exception e8) {
                            DivideThread.this._context.logMgr.out(LogMgr.CatExp.ERR, DivideThread.this, e8);
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
            this._na.cancel();
        }
    }

    public DivideThread(AppContext appContext) {
        this._context = appContext;
    }

    public int getClassCode() {
        return 4;
    }

    public int getFunctionCode() {
        return 33;
    }

    public synchronized boolean isAliveThread() {
        DivideWorkerThread divideWorkerThread;
        divideWorkerThread = this._thread;
        return divideWorkerThread != null ? divideWorkerThread.isAlive() : false;
    }

    public synchronized void startThread(DividingEventListener dividingEventListener) {
        if (!isAliveThread()) {
            DivideWorkerThread divideWorkerThread = new DivideWorkerThread(dividingEventListener);
            this._thread = divideWorkerThread;
            divideWorkerThread.start();
        }
    }

    public synchronized void stopThread() {
        DivideWorkerThread divideWorkerThread = this._thread;
        if (divideWorkerThread != null) {
            divideWorkerThread.setCancel();
            this._thread = null;
        }
    }
}
