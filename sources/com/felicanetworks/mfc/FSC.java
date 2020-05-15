package com.felicanetworks.mfc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.felicanetworks.mfc.IFSC;
import com.felicanetworks.mfc.IFSCEventListener;
import com.felicanetworks.mfc.util.LogMgr;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FSC {
    static final int DEFAULT_BIND_TIMEOUT = 10000;
    private static final String EXC_CURRENTLY_ONLINE = "Currently online.";
    private static final String EXC_DEVICE_LIST_NOT_SET = "Device list not set.";
    private static final String EXC_ERR_UNKNOWN = "Unknown error.";
    private static final String EXC_FELICA_NOT_OPEND = "FeliCa chip is not opened yet.";
    private static final String EXC_FELICA_NOT_SET = "Felica not set.";
    private static final String EXC_INTERRUPTED_BY_USER = "Interrupted.";
    private static final String EXC_INVALID_URL = "The specified URL is null.";
    private static final String EXC_LISTENER_NOT_SET = "Listener not set.";
    private static final String MFC_ADAPTER_CLASS_NAME = "com.felicanetworks.mfc.FSCAdapter";
    private static final String MFC_PACKAGE_NAME = "com.felicanetworks.mfc";
    static int bindTimeout = DEFAULT_BIND_TIMEOUT;
    private static FSC sInstance;
    /* access modifiers changed from: private */
    public BindTimerHandler bindTimerHandler = new BindTimerHandler();
    /* access modifiers changed from: private */
    public boolean canceled = false;
    private MfcConnection connectionHooker = new MfcConnection();
    /* access modifiers changed from: private */
    public DeviceList deviceList;
    /* access modifiers changed from: private */
    public Felica felica;
    /* access modifiers changed from: private */
    public IFSC fsc = null;
    /* access modifiers changed from: private */
    public FSCEventListener fscEventListener;
    /* access modifiers changed from: private */
    public IFSCEventListener ifscEventHooker = new IFSCEventListener.Stub() {
        /* class com.felicanetworks.mfc.FSC.C01001 */

        public void errorOccurred(int i, String str) {
            FSCEventListener fSCEventListener;
            LogMgr.log(3, "%s type:%d, message:%s", "000", Integer.valueOf(i), str);
            try {
                synchronized (FSC.this) {
                    if (FSC.this.fscEventListener != null) {
                        LogMgr.log(7, "%s", "001");
                        fSCEventListener = FSC.this.fscEventListener;
                    } else {
                        fSCEventListener = null;
                    }
                    FSC.this.terminate();
                }
                if (fSCEventListener != null) {
                    LogMgr.log(7, "%s", "003");
                    if (i != 100) {
                        LogMgr.log(7, "%s", "005");
                        fSCEventListener.errorOccurred(i, str);
                    } else {
                        LogMgr.log(7, "%s", "004");
                    }
                } else {
                    LogMgr.log(7, "%s", "002");
                }
            } catch (Exception e) {
                LogMgr.log(2, "%s msg:%s", "700", e.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        public void finished(int i) {
            FSCEventListener fSCEventListener;
            LogMgr.log(3, "%s status:%d", "000", Integer.valueOf(i));
            try {
                synchronized (FSC.this) {
                    if (FSC.this.fscEventListener != null) {
                        LogMgr.log(7, "%s", "001");
                        fSCEventListener = FSC.this.fscEventListener;
                    } else {
                        fSCEventListener = null;
                    }
                    FSC.this.terminate();
                }
                if (fSCEventListener != null) {
                    LogMgr.log(7, "%s", "003");
                    fSCEventListener.finished(i);
                } else {
                    LogMgr.log(7, "%s", "002");
                }
            } catch (Exception e) {
                LogMgr.log(2, "%s msg:%s", "700", e.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        public void operationRequested(int i, String str, byte[] bArr) {
            LogMgr.log(3, "%s DIB:%d param:%s data:%s", "020", Integer.valueOf(i), str, bArr);
            try {
                byte[] operationRequested = FSC.this.fscEventListener.operationRequested(i, str, bArr);
                LogMgr.log(3, "%s %s:%s", "020", "Client operation is completed", String.valueOf(operationRequested));
                try {
                    if (FSC.this.isMfiFscOnline()) {
                        FSC.this.felica.getMfiClientAccess().getIMfiFelica().notifyResult(operationRequested);
                    } else {
                        FSC.this.fsc.notifyResult(operationRequested);
                    }
                } catch (Exception e) {
                    LogMgr.log(2, "%s %s", "700", "Remote Access failed");
                }
            } catch (Exception e2) {
                LogMgr.log(3, "%s %s:%s", "020", "Client operation is failed", e2.getMessage());
                try {
                    if (FSC.this.isMfiFscOnline()) {
                        FSC.this.felica.getMfiClientAccess().getIMfiFelica().notifyError(e2.getMessage());
                    } else {
                        FSC.this.fsc.notifyError(e2.getMessage());
                    }
                } catch (Exception e3) {
                    LogMgr.log(2, "%s %s", "701", "Remote Access failed");
                }
            }
            LogMgr.log(3, "%s", "999");
        }
    };
    private WeakReference mContext;
    /* access modifiers changed from: private */
    public boolean online = false;
    /* access modifiers changed from: private */
    public String url;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class BindTimerHandler extends Handler {
        static final int MSG_BIND_TIMER = 1;

        public BindTimerHandler() {
        }

        public void handleMessage(Message message) {
            FSCEventListener fSCEventListener;
            LogMgr.log(3, "%s what=%d", "000", Integer.valueOf(message.what));
            if (message.what == 1) {
                LogMgr.log(2, "%s bind timeout online=%b", "800", Boolean.valueOf(FSC.this.online));
                synchronized (FSC.this) {
                    fSCEventListener = null;
                    if (FSC.this.online && FSC.this.fsc == null) {
                        LogMgr.log(7, "%s", "001");
                        fSCEventListener = FSC.this.fscEventListener;
                        boolean unused = FSC.this.canceled = true;
                        boolean unused2 = FSC.this.online = false;
                    }
                }
                if (fSCEventListener != null) {
                    LogMgr.log(3, "%s Do the callback", "010");
                    fSCEventListener.errorOccurred(1, "Bind timeout.");
                }
            }
            super.handleMessage(message);
            LogMgr.log(3, "%s", "999");
        }

        public void startTimer(int i) {
            LogMgr.log(3, "%s timeout=%d", "000", Integer.valueOf(i));
            if (i > 0) {
                LogMgr.log(7, "%s", "001");
                sendMessageDelayed(FSC.this.bindTimerHandler.obtainMessage(1), (long) i);
            }
            LogMgr.log(3, "%s", "999");
        }

        public void stopTimer() {
            LogMgr.log(3, "%s", "000");
            removeMessages(1);
            LogMgr.log(3, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ListenerParameter {
        String msg;
        int type;

        public ListenerParameter(int i, String str) {
            LogMgr.log(6, "%s %d msg:%s", "000", Integer.valueOf(i), str);
            this.type = i;
            this.msg = str;
            LogMgr.log(7, "%s", "999");
        }

        public String getMsg() {
            LogMgr.log(7, "%s", "000");
            LogMgr.log(7, "%s", "999");
            return this.msg;
        }

        public int getType() {
            LogMgr.log(7, "%s", "000");
            LogMgr.log(7, "%s", "999");
            return this.type;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class MfcConnection implements ServiceConnection {
        public MfcConnection() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb A[Catch:{ all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0128 A[Catch:{ all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x015b A[Catch:{ all -> 0x00be }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0173  */
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            FSCEventListener fSCEventListener;
            IFelica iFelica;
            ListenerParameter listenerParameter;
            ListenerParameter convExceptionToListenerParameter;
            FSCEventListener fSCEventListener2;
            String str;
            String str2;
            FSCEventListener fSCEventListener3;
            FSCEventListener fSCEventListener4;
            LogMgr.log(3, "%s %s", "000", componentName.getClassName());
            synchronized (FSC.this) {
                IFSC unused = FSC.this.fsc = IFSC.Stub.asInterface(iBinder);
                FSC.this.bindTimerHandler.stopTimer();
                if (FSC.this.canceled) {
                    LogMgr.log(7, "%s", "020");
                    fSCEventListener = FSC.this.fscEventListener;
                    ListenerParameter listenerParameter2 = new ListenerParameter(2, FSC.EXC_INTERRUPTED_BY_USER);
                    boolean unused2 = FSC.this.canceled = false;
                    boolean unused3 = FSC.this.online = false;
                    listenerParameter = listenerParameter2;
                    iFelica = null;
                } else {
                    try {
                        LogMgr.log(7, "%s", "010");
                        String access$800 = FSC.this.url;
                        if (FSC.this.felica != null) {
                            iFelica = FSC.this.felica.getIFelica();
                            if (iFelica != null) {
                                try {
                                    MfcUtil.checkMfcResult(FSC.this.fsc.start(access$800, FSC.this.deviceList, FSC.this.ifscEventHooker, iFelica));
                                    LogMgr.log(7, "%s", "010");
                                    fSCEventListener = null;
                                    listenerParameter = null;
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    LogMgr.log(2, "%s %s msg:%s", "701", "IllegalArgumentException", e.getMessage());
                                    convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                                    if (convExceptionToListenerParameter == null) {
                                    }
                                    str = "%s";
                                    str2 = "010";
                                    LogMgr.log(7, str, str2);
                                    listenerParameter = convExceptionToListenerParameter;
                                    fSCEventListener = fSCEventListener2;
                                    String unused4 = FSC.this.url = null;
                                    LogMgr.log(7, "%s", "030");
                                    if (fSCEventListener != null) {
                                    }
                                    LogMgr.log(3, "%s", "999");
                                } catch (FelicaException e2) {
                                    e = e2;
                                    LogMgr.log(2, "%s %s id:%d type:%d", "702", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                                    convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                                    if (convExceptionToListenerParameter == null) {
                                    }
                                    str = "%s";
                                    str2 = "010";
                                    LogMgr.log(7, str, str2);
                                    listenerParameter = convExceptionToListenerParameter;
                                    fSCEventListener = fSCEventListener2;
                                    String unused5 = FSC.this.url = null;
                                    LogMgr.log(7, "%s", "030");
                                    if (fSCEventListener != null) {
                                    }
                                    LogMgr.log(3, "%s", "999");
                                } catch (Exception e3) {
                                    e = e3;
                                    try {
                                        LogMgr.log(2, "%s %s msg:%s", "709", "Exception", e.getMessage());
                                        convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                                        if (convExceptionToListenerParameter == null) {
                                        }
                                        str = "%s";
                                        str2 = "010";
                                        LogMgr.log(7, str, str2);
                                        listenerParameter = convExceptionToListenerParameter;
                                        fSCEventListener = fSCEventListener2;
                                        String unused6 = FSC.this.url = null;
                                        LogMgr.log(7, "%s", "030");
                                        if (fSCEventListener != null) {
                                        }
                                        LogMgr.log(3, "%s", "999");
                                    } catch (Throwable th) {
                                        LogMgr.log(7, "%s", "010");
                                        throw th;
                                    }
                                }
                            } else {
                                LogMgr.log(2, "%s %s", "703", "IFelica instance is not found.");
                                throw new FelicaException(2, 1);
                            }
                        } else {
                            LogMgr.log(1, "%s %s", "800", "Felica hasn't been set.");
                            throw new FelicaException(2, 24);
                        }
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        iFelica = null;
                        LogMgr.log(2, "%s %s msg:%s", "701", "IllegalArgumentException", e.getMessage());
                        convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                        if (convExceptionToListenerParameter == null) {
                            LogMgr.log(7, "%s", "014");
                            fSCEventListener3 = FSC.this.fscEventListener;
                            boolean unused7 = FSC.this.online = false;
                        } else {
                            fSCEventListener3 = null;
                        }
                        str = "%s";
                        str2 = "010";
                        LogMgr.log(7, str, str2);
                        listenerParameter = convExceptionToListenerParameter;
                        fSCEventListener = fSCEventListener2;
                        String unused8 = FSC.this.url = null;
                        LogMgr.log(7, "%s", "030");
                        if (fSCEventListener != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    } catch (FelicaException e5) {
                        e = e5;
                        iFelica = null;
                        LogMgr.log(2, "%s %s id:%d type:%d", "702", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                        convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                        if (convExceptionToListenerParameter == null) {
                            LogMgr.log(7, "%s", "014");
                            fSCEventListener4 = FSC.this.fscEventListener;
                            boolean unused9 = FSC.this.online = false;
                        } else {
                            fSCEventListener4 = null;
                        }
                        str = "%s";
                        str2 = "010";
                        LogMgr.log(7, str, str2);
                        listenerParameter = convExceptionToListenerParameter;
                        fSCEventListener = fSCEventListener2;
                        String unused10 = FSC.this.url = null;
                        LogMgr.log(7, "%s", "030");
                        if (fSCEventListener != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    } catch (Exception e6) {
                        e = e6;
                        iFelica = null;
                        LogMgr.log(2, "%s %s msg:%s", "709", "Exception", e.getMessage());
                        convExceptionToListenerParameter = FSC.this.convExceptionToListenerParameter(e);
                        if (convExceptionToListenerParameter == null) {
                            LogMgr.log(7, "%s", "014");
                            fSCEventListener2 = FSC.this.fscEventListener;
                            boolean unused11 = FSC.this.online = false;
                        } else {
                            fSCEventListener2 = null;
                        }
                        str = "%s";
                        str2 = "010";
                        LogMgr.log(7, str, str2);
                        listenerParameter = convExceptionToListenerParameter;
                        fSCEventListener = fSCEventListener2;
                        String unused12 = FSC.this.url = null;
                        LogMgr.log(7, "%s", "030");
                        if (fSCEventListener != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                String unused13 = FSC.this.url = null;
            }
            LogMgr.log(7, "%s", "030");
            if (fSCEventListener != null) {
                if (iFelica != null && listenerParameter.getType() == 1 && listenerParameter.getMsg() != null && listenerParameter.getMsg().equals(FSC.EXC_FELICA_NOT_OPEND)) {
                    LogMgr.log(7, "%s break call back.", "011");
                } else {
                    LogMgr.log(3, "%s Doing the callback. type:%d, msg:%s", "031", Integer.valueOf(listenerParameter.getType()), listenerParameter.getMsg());
                    fSCEventListener.errorOccurred(listenerParameter.getType(), listenerParameter.getMsg());
                }
            }
            LogMgr.log(3, "%s", "999");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            FSCEventListener fSCEventListener;
            LogMgr.log(3, "%s %s", "000", componentName);
            synchronized (FSC.this) {
                if (FSC.this.online) {
                    LogMgr.log(7, "%s", "001");
                    fSCEventListener = FSC.this.fscEventListener;
                } else {
                    fSCEventListener = null;
                }
                FSC.this.unbindMfc();
            }
            if (fSCEventListener != null) {
                LogMgr.log(3, "%s %s id:%d msg:%s", "002", "Client Listener Call", 1, "Unknown error.");
                fSCEventListener.errorOccurred(1, "Unknown error.");
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    private FSC() {
        LogMgr.log(3, "%s", "000");
        LogMgr.log(3, "%s", "999");
    }

    private void checkNotOnline() {
        LogMgr.log(7, "%s", "000");
        if (this.online || isMfiFscOnline()) {
            LogMgr.log(2, "%s", "700", "online processing");
            throw new FelicaException(2, 2);
        } else {
            LogMgr.log(7, "%s", "999");
        }
    }

    public static synchronized FSC getInstance() {
        FSC fsc2;
        synchronized (FSC.class) {
            LogMgr.log(3, "%s", "000");
            if (sInstance == null) {
                LogMgr.log(7, "%s", "001");
                sInstance = new FSC();
            }
            LogMgr.log(3, "%s", "999");
            fsc2 = sInstance;
        }
        return fsc2;
    }

    /* access modifiers changed from: private */
    public synchronized boolean isMfiFscOnline() {
        Felica felica2;
        felica2 = this.felica;
        return (felica2 == null || felica2.getMfiClientAccess() == null || !this.felica.getMfiClientAccess().isFSCStarted()) ? false : true;
    }

    /* access modifiers changed from: private */
    public synchronized void terminate() {
        LogMgr.log(7, "%s", "000");
        Felica felica2 = this.felica;
        if (felica2 != null) {
            felica2.getMfiClientAccess().clearFSCEventListener();
        }
        this.canceled = false;
        this.online = false;
        LogMgr.log(7, "%s", "999");
    }

    /* access modifiers changed from: protected */
    public void bindMfc() {
        LogMgr.log(3, "%s", "000");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.felicanetworks.mfc", MFC_ADAPTER_CLASS_NAME));
        if (((Context) this.mContext.get()).bindService(intent, this.connectionHooker, 1)) {
            this.bindTimerHandler.startTimer(bindTimeout);
            LogMgr.log(3, "%s", "999");
            return;
        }
        LogMgr.log(3, "%s %s", "700", "Failed to connect for MFC Service");
        throw new FelicaException(1, 47);
    }

    /* access modifiers changed from: protected */
    public ListenerParameter convExceptionToListenerParameter(FelicaException felicaException) {
        LogMgr.log(7, "%s", "000");
        int type = felicaException.getType();
        String str = "Unknown error.";
        if (type == 1) {
            LogMgr.log(7, "%s", "005");
            str = EXC_FELICA_NOT_OPEND;
        } else if (type != 2) {
            switch (type) {
                case 24:
                    LogMgr.log(7, "%s", "002");
                    str = EXC_FELICA_NOT_SET;
                    break;
                case 25:
                    LogMgr.log(7, "%s", "003");
                    str = EXC_DEVICE_LIST_NOT_SET;
                    break;
                case 26:
                    LogMgr.log(7, "%s", "004");
                    str = EXC_LISTENER_NOT_SET;
                    break;
                case 27:
                    LogMgr.log(7, "%s", "006");
                    break;
                default:
                    LogMgr.log(2, "%s id:%d type:%d", "700", Integer.valueOf(felicaException.getID()), Integer.valueOf(felicaException.getType()));
                    break;
            }
        } else {
            LogMgr.log(7, "%s", "001");
            str = EXC_CURRENTLY_ONLINE;
        }
        LogMgr.log(7, "%s", "999");
        return new ListenerParameter(1, str);
    }

    public void finish() {
        LogMgr.log(3, "%s", "000");
        try {
            synchronized (this) {
                LogMgr.log(7, "%s", "001");
                try {
                    if (this.fsc != null) {
                        LogMgr.log(7, "%s", "002");
                        this.fsc.stop();
                    }
                } catch (Exception e) {
                    LogMgr.log(6, "%s %s", "003", e.getMessage());
                }
                unbindMfc();
                this.fscEventListener = null;
                this.mContext = null;
            }
        } catch (Exception e2) {
            LogMgr.log(6, "%s %s", "004", e2.getMessage());
        }
        LogMgr.log(3, "%s", "999");
    }

    public void init(Context context) {
        LogMgr.log(3, "%s", "000");
        if (context != null) {
            synchronized (this) {
                this.mContext = new WeakReference(context.getApplicationContext());
            }
            LogMgr.log(3, "%s", "999");
            return;
        }
        throw new IllegalArgumentException("context is null.");
    }

    public synchronized void setDeviceList(DeviceList deviceList2) {
        LogMgr.log(3, "%s", "000");
        checkNotOnline();
        this.deviceList = deviceList2;
        LogMgr.log(3, "%s", "999");
    }

    public synchronized void setFSCEventListener(FSCEventListener fSCEventListener) {
        LogMgr.log(3, "%s", "000");
        checkNotOnline();
        this.fscEventListener = fSCEventListener;
        LogMgr.log(3, "%s", "999");
    }

    public synchronized void setFelica(Felica felica2) {
        LogMgr.log(3, "%s", "000");
        checkNotOnline();
        this.felica = felica2;
        LogMgr.log(3, "%s", "999");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s msg:%s", "725", "Exception", r9.getMessage());
        r8.felica.getMfiClientAccess().clearFSCEventListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s msg:%s", "724", "IllegalArgumentException", r9.getMessage());
        r8.felica.getMfiClientAccess().clearFSCEventListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s id:%s type:%s", "723", "FelicaException", java.lang.Integer.valueOf(r9.getID()), java.lang.Integer.valueOf(r9.getType()));
        r8.felica.getMfiClientAccess().clearFSCEventListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s msg:%s", "722", "Exception", r9.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s id:%s type:%s", "721", "FelicaException", java.lang.Integer.valueOf(r9.getID()), java.lang.Integer.valueOf(r9.getType()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s msg:%s", "799", "Exception", r9.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s msg:%s", "711", "IllegalArgumentException", r9.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s id:%s type:%s", "710", "FelicaException", java.lang.Integer.valueOf(r9.getID()), java.lang.Integer.valueOf(r9.getType()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0159, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s", "711", "NumberFormatException");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0169, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s id:%s type:%s", "712", "FelicaException", java.lang.Integer.valueOf(r9.getID()), java.lang.Integer.valueOf(r9.getType()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0024, B:16:0x0035, B:37:0x00eb, B:39:0x00f0] */
    public synchronized void start(String str) {
        LogMgr.log(3, "%s", "000");
        if (str != null) {
            checkNotOnline();
            Felica felica2 = this.felica;
            if (felica2 == null) {
                LogMgr.log(2, "%s %s", "701", "Felica is null");
                throw new FelicaException(2, 24);
            } else if (this.deviceList == null) {
                LogMgr.log(2, "%s %s", "702", "DeviceList is null");
                throw new FelicaException(2, 25);
            } else if (this.fscEventListener == null) {
                LogMgr.log(2, "%s %s", "703", "FSCEventListener is null");
                throw new FelicaException(2, 26);
            } else if (felica2.isMfiActivated()) {
                MfcUtil.checkMfcResult(this.felica.getMfiClientAccess().getIMfiFelica().checkOnlineAccess());
                this.felica.getMfiClientAccess().setFSCEventListener(this.fscEventListener);
                MfcUtil.checkMfcResult(this.felica.getMfiClientAccess().getIMfiFelica().start(str, this.deviceList, this.ifscEventHooker, this.felica.getMfiClientAccess().getIMfiFelica()));
            } else {
                this.felica.checkOnlineAccess();
                IFSC ifsc = this.fsc;
                if (ifsc != null) {
                    MfcUtil.checkMfcResult(ifsc.start(str, this.deviceList, this.ifscEventHooker, this.felica.getIFelica()));
                } else {
                    this.canceled = false;
                    this.url = str;
                    bindMfc();
                }
                this.online = true;
                LogMgr.log(3, "%s", "999");
            }
        } else {
            LogMgr.log(2, "%s %s", "700", EXC_INVALID_URL);
            throw new IllegalArgumentException(EXC_INVALID_URL);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(1, "%s %s msg:%s", "799", "Exception", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(1, "%s %s msg:%s", "700", "RemoteException", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(1, "%s %s msg:%s", "799", "Exception", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(1, "%s %s msg:%s", "700", "RemoteException", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008d, code lost:
        throw new com.felicanetworks.mfc.FelicaException(1, 47);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0028, B:32:0x005f] */
    public synchronized void stop() {
        LogMgr.log(3, "%s", "000");
        if (!this.online) {
            if (!isMfiFscOnline()) {
                LogMgr.log(3, "%s %s", "997", "Not online");
                return;
            }
        }
        if (isMfiFscOnline()) {
            this.felica.getMfiClientAccess().getIMfiFelica().stop();
            return;
        }
        IFSC ifsc = this.fsc;
        if (ifsc != null) {
            ifsc.stop();
            LogMgr.log(3, "%s", "999");
            return;
        }
        LogMgr.log(3, "%s %s", "998", "Connecting now. canceled flag On");
        this.canceled = true;
    }

    /* access modifiers changed from: protected */
    public void unbindMfc() {
        LogMgr.log(7, "%s", "000");
        LogMgr.log(3, "%s", "001");
        try {
            ((Context) this.mContext.get()).unbindService(this.connectionHooker);
        } catch (Exception e) {
            LogMgr.log(7, "%s %s msg:", "002", "Exception", e.getMessage());
        }
        this.fsc = null;
        this.online = false;
        this.canceled = false;
        this.bindTimerHandler.stopTimer();
        LogMgr.log(7, "%s", "999");
    }

    /* access modifiers changed from: protected */
    public ListenerParameter convExceptionToListenerParameter(Exception exc) {
        LogMgr.log(6, "%s %s msg:%s", "000", "Exception", exc.getMessage());
        LogMgr.log(7, "%s", "999");
        return new ListenerParameter(1, exc.getMessage());
    }

    /* access modifiers changed from: protected */
    public ListenerParameter convExceptionToListenerParameter(IllegalArgumentException illegalArgumentException) {
        LogMgr.log(6, "%s %s msg:%s", "000", "IllegalArgumentException", illegalArgumentException.getMessage());
        LogMgr.log(7, "%s", "999");
        return new ListenerParameter(1, illegalArgumentException.getMessage());
    }
}
