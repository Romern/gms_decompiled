package com.felicanetworks.mfc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.felicanetworks.mfc.IFelica;
import com.felicanetworks.mfc.IFelicaEventListener;
import com.felicanetworks.mfc.IFelicaPushAppNotificationListener;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.util.LogMgr;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Felica {
    private static final int APP_CODE_LENGTH = 6;
    static final int DEFAULT_BIND_TIMEOUT = 10000;
    public static final int DEFAULT_RETRY_COUNT = 0;
    public static final int DEFAULT_TIMEOUT = 1000;
    private static final String EXC_INVALID_BLOCK_DATA_LIST = "The specified BlockDataList is null or empty.";
    private static final String EXC_INVALID_BLOCK_LIST = "The specified BlockList is null or empty.";
    private static final String EXC_INVALID_COMMAND = "The specified Command is null or invalid size.";
    private static final String EXC_INVALID_LISTENER = "The specified Listener is null.";
    private static final String EXC_INVALID_NODECODESIZE = "The specified NodeCodeSize is invalid value.";
    private static final String EXC_INVALID_NODE_CODE_LIST = "The specified parameter is invalid.";
    private static final String EXC_INVALID_PRIVACY_SETTING_DATA_LIST = "The specified parameter is invalid.";
    private static final String EXC_INVALID_PUSH_SEGMENT_DATA_LIST = "The specified parameter is invalid.";
    private static final String EXC_INVALID_SET_PUSH_LISTENER_PRM = "The specified parameter is invalid.";
    private static final String EXC_INVALID_SYSTEM_CODE = "The specified System Code is out of range.";
    private static final String EXC_INVALID_TARGET = "The specified Target is invalid value.";
    private static final String EXC_MAX_SIZE_PERMIT_LIST = "The size of permit list exceeds the maximum value.";
    private static final int GET_SYSTEM_CODE_WILD1 = 65535;
    private static final int GET_SYSTEM_CODE_WILD2 = 65280;
    private static final int GET_SYSTEM_CODE_WILD3 = 255;
    public static final int INTERFACE_WIRED = 0;
    public static final int INTERFACE_WIRELESS = 1;
    private static final int MAX_PACKET_DATA_LENGTH = 254;
    public static final int MAX_PERMIT_LIST_SIZE = 50;
    public static final int MAX_RETRY_COUNT = 10;
    private static final int MAX_SYSTEM_CODE = 65535;
    public static final int MAX_TIMEOUT = 60000;
    private static final String MENU_APP_PACKAGE_NAME = "com.felicanetworks.mfm.main";
    private static final String MFC_ADAPTER_CLASS_NAME = "com.felicanetworks.mfc.FelicaAdapter";
    private static final String MFC_PACKAGE_NAME = "com.felicanetworks.mfc";
    private static final String MFI_CLIENT_SERVICE_CLASS_NAME = "com.felicanetworks.mfc.mfi.FelicaAdapter";
    private static final String MFI_CLIENT_VERSION_RESOURCE_NAME = "mfi_client_version";
    private static final String MFI_CLIENT_VERSION_RESOURCE_TYPE = "string";
    public static final String MFI_PERMIT = "Y29tLmZlbGljYW5ldHdvcmtzLm1mYy5tZmkuTWZpQ2xpZW50";
    public static final int MIN_RETRY_COUNT = 0;
    private static final int MIN_SYSTEM_CODE = 0;
    public static final int MIN_TIMEOUT = 0;
    public static final int NODECODESIZE_2 = 2;
    public static final int NODECODESIZE_4 = 4;
    static int bindTimeout = DEFAULT_BIND_TIMEOUT;
    private static Felica sInstance = null;
    /* access modifiers changed from: private */
    public BindTimerHandler bindTimerHandler = new BindTimerHandler();
    private MfcConnection connectionHooker = new MfcConnection();
    /* access modifiers changed from: private */
    public IFelica felica = null;
    /* access modifiers changed from: private */
    public FelicaEventListener felicaEventListener;
    /* access modifiers changed from: private */
    public IFelicaEventListener iFelicaEventListener = new FelicaEventListenerStub();
    private WeakReference mContext;
    private final MfiClientAccess mMfiClientAccess;
    private int mRetryCount;
    private int mTimeout;
    private final MfiClient mfiClient;
    /* access modifiers changed from: private */
    public String[] permitList;
    private PushAppNotificationListenerStub pushAppNotificationHooker;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class BindTimerHandler extends Handler {
        static final int MSG_BIND_TIMER = 1;

        public BindTimerHandler() {
        }

        public void handleMessage(Message message) {
            FelicaEventListener felicaEventListener;
            LogMgr.log(3, "%s what=%d", "000", Integer.valueOf(message.what));
            if (message.what == 1) {
                LogMgr.log(2, "%s bind timeout connecting=%b", "800", Boolean.valueOf(Felica.this.checkConnecting()));
                synchronized (Felica.this) {
                    if (Felica.this.checkConnecting()) {
                        LogMgr.log(7, "%s", "001");
                        felicaEventListener = Felica.this.felicaEventListener;
                        FelicaEventListener unused = Felica.this.felicaEventListener = null;
                        Felica.this.unbindMfc();
                    } else {
                        felicaEventListener = null;
                    }
                }
                if (felicaEventListener != null) {
                    LogMgr.log(3, "%s Do the callback", "010");
                    felicaEventListener.errorOccurred(1, "Bind timeout.", null);
                }
            }
            super.handleMessage(message);
            LogMgr.log(3, "%s", "999");
        }

        public void startTimer(int i) {
            LogMgr.log(3, "%s timeout=%d", "000", Integer.valueOf(i));
            if (i > 0) {
                LogMgr.log(7, "%s", "001");
                sendMessageDelayed(Felica.this.bindTimerHandler.obtainMessage(1), (long) i);
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
    class FelicaEventListenerStub extends IFelicaEventListener.Stub {
        public FelicaEventListenerStub() {
        }

        public void errorOccurred(int i, String str, AppInfo appInfo) {
            FelicaEventListener access$000;
            AppInfo appInfo2 = appInfo;
            LogMgr.log(3, "%s", "000");
            synchronized (Felica.this) {
                LogMgr.log(7, "%s", "001");
                access$000 = Felica.this.felicaEventListener;
                FelicaEventListener unused = Felica.this.felicaEventListener = null;
                try {
                    Felica.this.unbindMfc();
                } catch (Exception e) {
                    LogMgr.log(1, "%s %s", "900", e.getMessage());
                }
            }
            if (access$000 != null) {
                try {
                    LogMgr.log(7, "%s %s %d %s", "002", "FelicaEventListener#errorOccurred", Integer.valueOf(i), str);
                    if (appInfo2 != null) {
                        LogMgr.log(3, "%s %s %d", "003", "FelicaEventListener#errorOccurred", Integer.valueOf(appInfo.getPid()));
                    }
                    access$000.errorOccurred(i, str, appInfo2);
                } catch (Exception e2) {
                    LogMgr.log(2, "%s %s", "700", e2.getMessage());
                }
            }
            LogMgr.log(3, "%s", "999");
        }

        public void finished() {
            FelicaEventListener felicaEventListener;
            LogMgr.log(3, "%s %s", "000", "FelicaEventListener#finished");
            try {
                synchronized (Felica.this) {
                    felicaEventListener = null;
                    if (Felica.this.felicaEventListener != null) {
                        LogMgr.log(7, "%s", "001");
                        FelicaEventListener access$000 = Felica.this.felicaEventListener;
                        FelicaEventListener unused = Felica.this.felicaEventListener = null;
                        felicaEventListener = access$000;
                    } else {
                        LogMgr.log(7, "%s", "002");
                        Felica.this.unbindMfc();
                    }
                }
                if (felicaEventListener != null) {
                    try {
                        LogMgr.log(3, "%s", "003");
                        felicaEventListener.finished();
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "900", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class MfcConnection implements ServiceConnection {
        public MfcConnection() {
        }

        /* JADX INFO: finally extract failed */
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            int i;
            FelicaEventListener felicaEventListener;
            AppInfo appInfo;
            LogMgr.log(3, "%s %s", "000", componentName.getClassName());
            synchronized (Felica.this) {
                IFelica unused = Felica.this.felica = IFelica.Stub.asInterface(iBinder);
                Felica.this.bindTimerHandler.stopTimer();
                i = 1;
                if (Felica.this.felicaEventListener == null) {
                    LogMgr.log(2, "%s", "704");
                    Felica.this.unbindMfc();
                    felicaEventListener = null;
                    appInfo = null;
                } else {
                    LogMgr.log(7, "%s", "001");
                    try {
                        MfcUtil.checkMfcResult(Felica.this.felica.activateFelica(Felica.this.permitList, Felica.this.iFelicaEventListener));
                        LogMgr.log(7, "%s", "010");
                        String[] unused2 = Felica.this.permitList = null;
                        felicaEventListener = null;
                        appInfo = null;
                    } catch (FelicaException e) {
                        LogMgr.log(7, "%s", "002");
                        int type = e.getType();
                        if (type == 39) {
                            appInfo = e.getOtherAppInfo();
                            LogMgr.log(2, "%s FelicaException id:%d type:%d pid%d", "700", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()), null, Integer.valueOf(appInfo.getPid()));
                            i = 7;
                        } else if (type != 42) {
                            LogMgr.log(2, "%s FelicaException id:%d type:%d", "702", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                            appInfo = null;
                        } else {
                            LogMgr.log(2, "%s FelicaException id:%d type:%d", "701", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                            appInfo = null;
                        }
                        LogMgr.log(7, "%s", "010");
                        String[] unused3 = Felica.this.permitList = null;
                        LogMgr.log(7, "%s", "011");
                        felicaEventListener = Felica.this.felicaEventListener;
                        FelicaEventListener unused4 = Felica.this.felicaEventListener = null;
                        Felica.this.unbindMfc();
                    } catch (Exception e2) {
                        try {
                            LogMgr.log(2, "%s Exception %s", "703", e2.getMessage());
                            LogMgr.log(7, "%s", "010");
                            String[] unused5 = Felica.this.permitList = null;
                            LogMgr.log(7, "%s", "011");
                            felicaEventListener = Felica.this.felicaEventListener;
                            FelicaEventListener unused6 = Felica.this.felicaEventListener = null;
                            Felica.this.unbindMfc();
                            appInfo = null;
                        } catch (Throwable th) {
                            LogMgr.log(7, "%s", "010");
                            String[] unused7 = Felica.this.permitList = null;
                            throw th;
                        }
                    }
                }
            }
            LogMgr.log(7, "%s", "700");
            if (felicaEventListener != null) {
                LogMgr.log(3, "%s Do the callback", "020");
                felicaEventListener.errorOccurred(i, null, appInfo);
            }
            LogMgr.log(3, "%s", "999");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            FelicaEventListener felicaEventListener;
            LogMgr.log(3, "%s %s", "000", componentName);
            synchronized (Felica.this) {
                if (Felica.this.felicaEventListener != null) {
                    LogMgr.log(7, "%s", "001");
                    felicaEventListener = Felica.this.felicaEventListener;
                    FelicaEventListener unused = Felica.this.felicaEventListener = null;
                } else {
                    felicaEventListener = null;
                }
                Felica.this.unbindMfc();
            }
            if (felicaEventListener != null) {
                LogMgr.log(7, "%s", "002");
                felicaEventListener.errorOccurred(1, MfiClientAccess.EXC_UNKNOWN_ERROR, null);
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class PushAppNotificationListenerStub extends IFelicaPushAppNotificationListener.Stub {
        PushAppNotificationListener listener;

        public PushAppNotificationListenerStub(PushAppNotificationListener pushAppNotificationListener) {
            LogMgr.log(3, "%s", "000");
            this.listener = pushAppNotificationListener;
            LogMgr.log(3, "%s", "999");
        }

        public void pushAppNotified(PushNotifyAppSegment pushNotifyAppSegment) {
            try {
                LogMgr.log(3, "%s", "000");
                synchronized (this) {
                    if (this.listener != null) {
                        LogMgr.log(3, "%s %s", "001", "pushAppNotified");
                        if (pushNotifyAppSegment != null) {
                            LogMgr.log(3, "%s %s %s", "002", pushNotifyAppSegment.getAppIdentificationCode(), pushNotifyAppSegment.getAppNotificationParam());
                        }
                        this.listener.pushAppNotified(pushNotifyAppSegment);
                    }
                }
            } catch (Exception e) {
                LogMgr.log(2, "%s %s", "700", e.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        public synchronized void setListener(PushAppNotificationListener pushAppNotificationListener) {
            LogMgr.log(3, "%s", "000");
            this.listener = pushAppNotificationListener;
            LogMgr.log(3, "%s", "999");
        }
    }

    private Felica() {
        LogMgr.log(3, "%s", "000");
        this.mTimeout = 1000;
        this.mRetryCount = 0;
        this.mMfiClientAccess = new MfiClientAccess(this);
        this.mfiClient = new MfiClient(this.mMfiClientAccess);
        LogMgr.log(3, "%s", "999");
    }

    private synchronized void activateMfiFelica(FelicaEventListener felicaEventListener2) {
        LogMgr.log(3, "%s", "000");
        if (felicaEventListener2 != null) {
            checkNotActivated();
            try {
                this.mMfiClientAccess.activate(((Context) this.mContext.get()).getPackageName(), felicaEventListener2);
                LogMgr.log(3, "%s", "999");
            } catch (Exception e) {
                LogMgr.log(2, "%s can not get Package Name.", "700");
                throw new FelicaException(1, 47);
            }
        } else {
            throw new IllegalArgumentException(EXC_INVALID_LISTENER);
        }
    }

    private boolean checkAfterActivating() {
        return (this.felica == null && this.felicaEventListener == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public boolean checkConnecting() {
        return this.felica == null && this.felicaEventListener != null;
    }

    public static synchronized Felica getInstance() {
        Felica felica2;
        synchronized (Felica.class) {
            LogMgr.log(3, "%s", "000");
            if (sInstance == null) {
                LogMgr.log(7, "%s", "001");
                sInstance = new Felica();
            }
            LogMgr.log(3, "%s", "999");
            felica2 = sInstance;
        }
        return felica2;
    }

    public static String getMFCVersion(Context context) {
        LogMgr.log(3, "%s", "000");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.felicanetworks.mfc", 0);
            LogMgr.log(3, "%s", "999");
            return packageInfo.versionName;
        } catch (Exception e) {
            LogMgr.log(2, "%s %s", "800", "package not found");
            throw new FelicaException(3, 60);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[Catch:{ Exception -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    public static String getMfiClientVersion(Context context) {
        ServiceInfo serviceInfo;
        LogMgr.log(3, "%s", "000");
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(MENU_APP_PACKAGE_NAME, 4);
            if (packageInfo.services != null) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                int length = serviceInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    serviceInfo = serviceInfoArr[i];
                    if (MFI_CLIENT_SERVICE_CLASS_NAME.equals(serviceInfo.name)) {
                        break;
                    }
                    i++;
                }
                if (serviceInfo == null) {
                    Resources resourcesForApplication = packageManager.getResourcesForApplication(MENU_APP_PACKAGE_NAME);
                    String string = resourcesForApplication.getString(resourcesForApplication.getIdentifier(MFI_CLIENT_VERSION_RESOURCE_NAME, MFI_CLIENT_VERSION_RESOURCE_TYPE, MENU_APP_PACKAGE_NAME));
                    LogMgr.log(3, "%s", "999");
                    return string;
                }
                LogMgr.log(2, "%s %s", "800", "service not found");
                throw new MfiClientException(3, MfiClientException.TYPE_MFICLIENT_NOT_FOUND, null);
            }
            serviceInfo = null;
            if (serviceInfo == null) {
            }
        } catch (Exception e) {
            LogMgr.log(2, "%s %s", "801", e.toString());
            throw new MfiClientException(3, MfiClientException.TYPE_MFICLIENT_NOT_FOUND, null);
        }
    }

    public synchronized void activateFelica(String[] strArr, FelicaEventListener felicaEventListener2) {
        LogMgr.log(3, "%s", "000");
        if (felicaEventListener2 != null) {
            if (strArr != null) {
                if (strArr.length > 50) {
                    LogMgr.log(2, "%s permitList.length > MAX_PERMIT_LIST_SIZE", "711");
                    throw new IllegalArgumentException(EXC_MAX_SIZE_PERMIT_LIST);
                }
            }
            checkNotActivated();
            if (strArr != null && strArr.length > 0) {
                if (MFI_PERMIT.equals(strArr[0])) {
                    activateMfiFelica(felicaEventListener2);
                    return;
                }
            }
            this.permitList = strArr;
            this.felicaEventListener = felicaEventListener2;
            try {
                bindMfc();
                LogMgr.log(3, "%s", "999");
            } catch (Exception e) {
                LogMgr.log(2, "%s", "712");
                this.permitList = null;
                this.felicaEventListener = null;
                throw new FelicaException(1, 47);
            }
        } else {
            LogMgr.log(2, "%s %s", "710", "Parameter Error");
            throw new IllegalArgumentException(EXC_INVALID_LISTENER);
        }
    }

    /* access modifiers changed from: protected */
    public void bindMfc() {
        LogMgr.log(3, "%s", "000");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.felicanetworks.mfc", MFC_ADAPTER_CLASS_NAME));
        Context context = (Context) this.mContext.get();
        if (context.bindService(intent, this.connectionHooker, 1)) {
            this.bindTimerHandler.startTimer(bindTimeout);
            LogMgr.log(3, "%s", "999");
            return;
        }
        LogMgr.log(3, "%s %s", "700", "Failed to connect for MFC Service");
        context.unbindService(this.connectionHooker);
        throw new FelicaException(1, 47);
    }

    public void cancelOffline() {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().cancelOffline());
            } else {
                MfcUtil.checkMfcResult(iFelica.cancelOffline());
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    /* access modifiers changed from: protected */
    public void checkActivated() {
        LogMgr.log(7, "%s", "000");
        if (this.felica == null || this.felicaEventListener != null) {
            LogMgr.log(7, "%s", "001");
            throw new FelicaException(2, 5);
        } else {
            LogMgr.log(7, "%s", "999");
        }
    }

    /* access modifiers changed from: protected */
    public void checkMfcOrMfiActivated() {
        boolean z;
        LogMgr.log(7, "%s", "000");
        try {
            checkActivated();
            z = true;
        } catch (FelicaException e) {
            LogMgr.log(7, "%s", "001");
            z = false;
        }
        boolean isMfiActivated = isMfiActivated();
        if (!z && !isMfiActivated) {
            LogMgr.log(7, "%s", "003");
            throw new FelicaException(2, 5);
        } else {
            LogMgr.log(7, "%s", "999");
        }
    }

    /* access modifiers changed from: protected */
    public void checkNotActivated() {
        LogMgr.log(7, "%s", "000");
        if (this.felicaEventListener != null) {
            LogMgr.log(3, "%s %s id:%d type:%d", "700", "FelicaException", 2, 49);
            throw new FelicaException(2, 49);
        } else if (this.felica == null) {
            MfiClientAccess mfiClientAccess = this.mMfiClientAccess;
            if (mfiClientAccess != null) {
                mfiClientAccess.checkNotActivated();
            }
            LogMgr.log(7, "%s", "999");
        } else {
            LogMgr.log(3, "%s %s id:%d type:%d", "701", "FelicaException", 2, 42);
            throw new FelicaException(2, 42);
        }
    }

    public synchronized void checkOnlineAccess() {
        LogMgr.log(3, "%s", "000");
        try {
            checkActivated();
            MfcUtil.checkMfcResult(this.felica.checkOnlineAccess());
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (NumberFormatException e2) {
            LogMgr.log(2, "%s %s", "701", "NumberFormatException");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "702", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    /* access modifiers changed from: protected */
    public void cleanUp() {
        LogMgr.log(7, "%s", "000");
        this.felica = null;
        this.felicaEventListener = null;
        this.permitList = null;
        if (this.pushAppNotificationHooker != null) {
            LogMgr.log(7, "%s", "001");
            this.pushAppNotificationHooker.setListener(null);
        }
        this.pushAppNotificationHooker = null;
        this.mTimeout = 1000;
        this.mRetryCount = 0;
        this.bindTimerHandler.stopTimer();
        LogMgr.log(7, "%s timeout = %d, retryCount = %d", "001", Integer.valueOf(this.mTimeout), Integer.valueOf(this.mRetryCount));
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void close() {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().close());
            } else {
                MfcUtil.checkMfcResult(iFelica.close());
            }
            PushAppNotificationListenerStub pushAppNotificationListenerStub = this.pushAppNotificationHooker;
            if (pushAppNotificationListenerStub != null) {
                pushAppNotificationListenerStub.setListener(null);
            }
            this.pushAppNotificationHooker = null;
            this.mTimeout = 1000;
            this.mRetryCount = 0;
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized byte[] executeFelicaCommand(byte[] bArr) {
        int length;
        FelicaResultInfoByteArray felicaResultInfoByteArray;
        byte[] bArr2;
        LogMgr.log(3, "%s", "START");
        try {
            checkMfcOrMfiActivated();
            if (bArr == null || (length = bArr.length) <= 0 || length > MAX_PACKET_DATA_LENGTH) {
                LogMgr.log(2, "%s", "Parameter Error");
                throw new IllegalArgumentException(EXC_INVALID_COMMAND);
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoByteArray = this.mMfiClientAccess.getIMfiFelica().executeFelicaCommand(bArr, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoByteArray = iFelica.executeFelicaCommand(bArr, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoByteArray);
            bArr2 = (byte[]) felicaResultInfoByteArray.getValue();
            LogMgr.log(3, "%s", "END");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s id:%d type:%d", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s %s", "IllegalArgumentException", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return bArr2;
    }

    public void finish() {
        LogMgr.log(3, "%s", "000");
        try {
            synchronized (this) {
                LogMgr.log(7, "%s", "001");
                this.mMfiClientAccess.finish();
                this.mfiClient.finish();
                try {
                    if (this.felica != null) {
                        LogMgr.log(7, "%s", "002");
                        this.felica.close();
                        this.felica.inactivateFelica();
                    }
                } catch (Exception e) {
                    LogMgr.log(6, "%s %s", "003", e.getMessage());
                }
                unbindMfc();
            }
            this.mContext = null;
        } catch (Exception e2) {
            try {
                LogMgr.log(6, "%s %s", "004", e2.getMessage());
            } finally {
                this.mContext = null;
            }
        }
        LogMgr.log(3, "%s", "999");
    }

    public synchronized BlockCountInformation[] getBlockCountInformation(int[] iArr) {
        int length;
        FelicaResultInfoBlockCountInformationArray felicaResultInfoBlockCountInformationArray;
        BlockCountInformation[] blockCountInformationArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (iArr == null || (length = iArr.length) <= 0 || length > 32) {
                LogMgr.log(1, "%s invalid NodeCodeList", "800");
                throw new IllegalArgumentException("The specified parameter is invalid.");
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoBlockCountInformationArray = this.mMfiClientAccess.getIMfiFelica().getBlockCountInformation(iArr, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoBlockCountInformationArray = iFelica.getBlockCountInformation(iArr, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoBlockCountInformationArray);
            blockCountInformationArr = (BlockCountInformation[]) felicaResultInfoBlockCountInformationArray.getValue();
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException", "702");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return blockCountInformationArr;
    }

    public synchronized byte[] getContainerId() {
        FelicaResultInfoByteArray felicaResultInfoByteArray;
        byte[] bArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoByteArray = this.mMfiClientAccess.getIMfiFelica().getContainerId(this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoByteArray = iFelica.getContainerId(this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoByteArray);
            bArr = (byte[]) felicaResultInfoByteArray.getValue();
            LogMgr.log(3, "%s returned %s", "999", bArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return bArr;
    }

    public synchronized byte[] getContainerIssueInformation() {
        FelicaResultInfoByteArray felicaResultInfoByteArray;
        byte[] bArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoByteArray = this.mMfiClientAccess.getIMfiFelica().getContainerIssueInformation(this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoByteArray = iFelica.getContainerIssueInformation(this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoByteArray);
            bArr = (byte[]) felicaResultInfoByteArray.getValue();
            LogMgr.log(3, "%s returned %s", "999", bArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return bArr;
    }

    public Context getContext() {
        Context context;
        LogMgr.log(3, "%s", "000");
        WeakReference weakReference = this.mContext;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        LogMgr.log(3, "%s", "999");
        return context;
    }

    public synchronized byte[] getICCode() {
        FelicaResultInfoByteArray felicaResultInfoByteArray;
        byte[] bArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoByteArray = this.mMfiClientAccess.getIMfiFelica().getICCode();
            } else {
                felicaResultInfoByteArray = iFelica.getICCode();
            }
            MfcUtil.checkMfcResult(felicaResultInfoByteArray);
            bArr = (byte[]) felicaResultInfoByteArray.getValue();
            LogMgr.log(3, "%s returned %s", "999", bArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return bArr;
    }

    public synchronized byte[] getIDm() {
        FelicaResultInfoByteArray felicaResultInfoByteArray;
        byte[] bArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoByteArray = this.mMfiClientAccess.getIMfiFelica().getIDm();
            } else {
                felicaResultInfoByteArray = iFelica.getIDm();
            }
            MfcUtil.checkMfcResult(felicaResultInfoByteArray);
            bArr = (byte[]) felicaResultInfoByteArray.getValue();
            LogMgr.log(3, "%s returned %s", "999", bArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return bArr;
    }

    public synchronized IFelica getIFelica() {
        LogMgr.log(7, "%s", "000");
        LogMgr.log(7, "%s", "999");
        return this.felica;
    }

    public synchronized int getInterface() {
        FelicaResultInfoInt felicaResultInfoInt;
        int intValue;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoInt = this.mMfiClientAccess.getIMfiFelica().getInterface();
            } else {
                felicaResultInfoInt = iFelica.getInterface();
            }
            MfcUtil.checkMfcResult(felicaResultInfoInt);
            intValue = ((Integer) felicaResultInfoInt.getValue()).intValue();
            LogMgr.log(3, "%s returned %d", "999", Integer.valueOf(intValue));
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return intValue;
    }

    public synchronized int getKeyVersion(int i) {
        FelicaResultInfoInt felicaResultInfoInt;
        int intValue;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoInt = this.mMfiClientAccess.getIMfiFelica().getKeyVersion(i, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoInt = iFelica.getKeyVersion(i, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoInt);
            intValue = ((Integer) felicaResultInfoInt.getValue()).intValue();
            LogMgr.log(3, "%s returned %d", "999", Integer.valueOf(intValue));
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s serviceCode:%d", "702", Integer.valueOf(i));
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return intValue;
    }

    public synchronized KeyInformation[] getKeyVersionV2(int[] iArr) {
        int length;
        FelicaResultInfoKeyInformationArray felicaResultInfoKeyInformationArray;
        KeyInformation[] keyInformationArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (iArr == null || (length = iArr.length) <= 0 || length > 32) {
                LogMgr.log(1, "%s invalid NodeCodeList", "800");
                throw new IllegalArgumentException("The specified parameter is invalid.");
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoKeyInformationArray = this.mMfiClientAccess.getIMfiFelica().getKeyVersionV2(iArr, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoKeyInformationArray = iFelica.getKeyVersionV2(iArr, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoKeyInformationArray);
            keyInformationArr = (KeyInformation[]) felicaResultInfoKeyInformationArray.getValue();
            LogMgr.log(3, "%s returned %d", "999", keyInformationArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s nodeCode:%d", "702", iArr);
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return keyInformationArr;
    }

    public MfiClient getMfiClient() {
        MfiClient mfiClient2 = this.mfiClient;
        if (mfiClient2 != null) {
            return mfiClient2;
        }
        LogMgr.log(7, "%s", "001");
        throw new MfiClientException(2, 5, null);
    }

    public MfiClientAccess getMfiClientAccess() {
        return this.mMfiClientAccess;
    }

    public synchronized NodeInformation getNodeInformation(int i) {
        FelicaResultInfoNodeInformation felicaResultInfoNodeInformation;
        NodeInformation nodeInformation;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            ServiceUtil.getInstance().checkAreaCode(i);
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoNodeInformation = this.mMfiClientAccess.getIMfiFelica().getNodeInformation(i, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoNodeInformation = iFelica.getNodeInformation(i, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoNodeInformation);
            nodeInformation = (NodeInformation) felicaResultInfoNodeInformation.getValue();
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException", "702");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return nodeInformation;
    }

    public synchronized NodeInformation getPrivacyNodeInformation(int i) {
        FelicaResultInfoNodeInformation felicaResultInfoNodeInformation;
        NodeInformation nodeInformation;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            ServiceUtil.getInstance().checkAreaCode(i);
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoNodeInformation = this.mMfiClientAccess.getIMfiFelica().getPrivacyNodeInformation(i, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoNodeInformation = iFelica.getPrivacyNodeInformation(i, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoNodeInformation);
            nodeInformation = (NodeInformation) felicaResultInfoNodeInformation.getValue();
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException", "702");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return nodeInformation;
    }

    public synchronized boolean getRFSState() {
        FelicaResultInfoBoolean felicaResultInfoBoolean;
        boolean booleanValue;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoBoolean = this.mMfiClientAccess.getIMfiFelica().getRFSState();
            } else {
                felicaResultInfoBoolean = iFelica.getRFSState();
            }
            MfcUtil.checkMfcResult(felicaResultInfoBoolean);
            booleanValue = ((Boolean) felicaResultInfoBoolean.getValue()).booleanValue();
            LogMgr.log(3, "%s returned %d", "999", Boolean.valueOf(booleanValue));
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return booleanValue;
    }

    public synchronized int getRetryCount() {
        LogMgr.log(3, "%s", "000");
        LogMgr.log(3, "%s %d", "999", "retryCount");
        return this.mRetryCount;
    }

    public synchronized int getSelectTimeout() {
        FelicaResultInfoInt felicaResultInfoInt;
        int intValue;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoInt = this.mMfiClientAccess.getIMfiFelica().getSelectTimeout();
            } else {
                felicaResultInfoInt = iFelica.getSelectTimeout();
            }
            MfcUtil.checkMfcResult(felicaResultInfoInt);
            intValue = ((Integer) felicaResultInfoInt.getValue()).intValue();
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return intValue;
    }

    public synchronized int getSystemCode() {
        FelicaResultInfoInt felicaResultInfoInt;
        int intValue;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoInt = this.mMfiClientAccess.getIMfiFelica().getSystemCode();
            } else {
                felicaResultInfoInt = iFelica.getSystemCode();
            }
            MfcUtil.checkMfcResult(felicaResultInfoInt);
            intValue = ((Integer) felicaResultInfoInt.getValue()).intValue();
            LogMgr.log(3, "%s returned %d", "999", Integer.valueOf(intValue));
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return intValue;
    }

    public synchronized int[] getSystemCodeList() {
        FelicaResultInfoIntArray felicaResultInfoIntArray;
        int[] iArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoIntArray = this.mMfiClientAccess.getIMfiFelica().getSystemCodeList(this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoIntArray = iFelica.getSystemCodeList(this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoIntArray);
            iArr = (int[]) felicaResultInfoIntArray.getValue();
            LogMgr.log(3, "%s %s", "999", iArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return iArr;
    }

    public synchronized int getTimeout() {
        LogMgr.log(3, "%s", "000");
        LogMgr.log(3, "%s timeout:%d", "999", Integer.valueOf(this.mTimeout));
        return this.mTimeout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        return;
     */
    public synchronized void inactivateFelica() {
        LogMgr.log(3, "%s", "000");
        if (isMfiAfterActivating()) {
            this.mMfiClientAccess.inactivate();
        } else if (checkAfterActivating()) {
            if (!checkConnecting()) {
                try {
                    MfcUtil.checkMfcResult(this.felica.inactivateFelica());
                    unbindMfc();
                    LogMgr.log(3, "%s", "999");
                } catch (FelicaException e) {
                    LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                    if (e.getID() == 2 && e.getType() == 5) {
                        LogMgr.log(7, "%s", "001");
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    LogMgr.log(2, "%s %s", "701", "Other Exception");
                    throw new FelicaException(1, 47);
                }
            } else {
                unbindMfc();
            }
        }
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

    public boolean isMfiActivated() {
        try {
            MfiClientAccess mfiClientAccess = this.mMfiClientAccess;
            if (mfiClientAccess == null) {
                return false;
            }
            mfiClientAccess.checkActivated();
            return true;
        } catch (FelicaException e) {
            LogMgr.log(7, "%s", "002");
            return false;
        }
    }

    public boolean isMfiAfterActivating() {
        MfiClientAccess mfiClientAccess = this.mMfiClientAccess;
        if (mfiClientAccess != null) {
            return mfiClientAccess.checkAfterActivating();
        }
        return false;
    }

    public synchronized void open() {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().open());
            } else {
                MfcUtil.checkMfcResult(iFelica.open());
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void push(PushSegment pushSegment) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (pushSegment != null) {
                IFelica iFelica = this.felica;
                if (iFelica != null) {
                    MfcUtil.checkMfcResult(iFelica.push(new PushSegmentParcelableWrapper(pushSegment)));
                } else {
                    MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().push(new PushSegmentParcelableWrapper(pushSegment)));
                }
                LogMgr.log(3, "%s", "999");
            } else {
                LogMgr.log(2, "%s %s", "710", "Parameter Error");
                throw new IllegalArgumentException("The specified parameter is invalid.");
            }
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s %s %s", "702", "IllegalArgumentException", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized Data[] read(BlockList blockList) {
        FelicaResultInfoDataArray felicaResultInfoDataArray;
        Data[] dataArr;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (blockList == null || blockList.size() == 0) {
                LogMgr.log(2, "%s %s", "710", "Parameter Error");
                throw new IllegalArgumentException(EXC_INVALID_BLOCK_LIST);
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                felicaResultInfoDataArray = this.mMfiClientAccess.getIMfiFelica().read(blockList, this.mTimeout, this.mRetryCount);
            } else {
                felicaResultInfoDataArray = iFelica.read(blockList, this.mTimeout, this.mRetryCount);
            }
            MfcUtil.checkMfcResult(felicaResultInfoDataArray);
            dataArr = (Data[]) felicaResultInfoDataArray.getValue();
            LogMgr.log(3, "%s returned %d", "999", dataArr);
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException", "702");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
        return dataArr;
    }

    public synchronized void reset() {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().reset());
            } else {
                MfcUtil.checkMfcResult(iFelica.reset());
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void select(int i) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (i < 0 || i > 65535) {
                LogMgr.log(2, "%s systemCode:%d", "710", Integer.valueOf(i));
                throw new IllegalArgumentException(EXC_INVALID_SYSTEM_CODE);
            } else if (i == 65535 || (i & GET_SYSTEM_CODE_WILD2) == GET_SYSTEM_CODE_WILD2 || (i & GET_SYSTEM_CODE_WILD3) == GET_SYSTEM_CODE_WILD3) {
                LogMgr.log(2, "%s systemCode:%d", "711", Integer.valueOf(i));
                throw new IllegalArgumentException(EXC_INVALID_SYSTEM_CODE);
            } else {
                IFelica iFelica = this.felica;
                if (iFelica == null) {
                    MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().select(i));
                } else {
                    MfcUtil.checkMfcResult(iFelica.select(i));
                }
                LogMgr.log(3, "%s", "999");
            }
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s systemCode:%d", "702", Integer.valueOf(i));
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void setNodeCodeSize(int i) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (i != 2) {
                if (i != 4) {
                    LogMgr.log(2, "%s %s nodeCodeSize:%d", "710", "Parameter Error", Integer.valueOf(i));
                    throw new IllegalArgumentException(EXC_INVALID_NODECODESIZE);
                }
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().setNodeCodeSize(i, this.mTimeout, this.mRetryCount));
            } else {
                MfcUtil.checkMfcResult(iFelica.setNodeCodeSize(i, this.mTimeout, this.mRetryCount));
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException nodeCodeSize:%d", "702", Integer.valueOf(i));
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void setPrivacy(PrivacySettingData[] privacySettingDataArr) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (privacySettingDataArr == null || privacySettingDataArr.length <= 0) {
                LogMgr.log(2, "%s %s", "710", "Parameter Error");
                throw new IllegalArgumentException("The specified parameter is invalid.");
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().setPrivacy(privacySettingDataArr, this.mTimeout, this.mRetryCount));
            } else {
                MfcUtil.checkMfcResult(iFelica.setPrivacy(privacySettingDataArr, this.mTimeout, this.mRetryCount));
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s %s %s", "702", "IllegalArgumentException", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s %s", "702", "IllegalArgumentException", r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e8, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e9, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        com.felicanetworks.mfc.util.LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", java.lang.Integer.valueOf(r8.getID()), java.lang.Integer.valueOf(r8.getType()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0104, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00da A[Catch:{ Exception -> 0x00a9, FelicaException -> 0x00e9, IllegalArgumentException -> 0x00da, FelicaException -> 0x00e9, IllegalArgumentException -> 0x00da, Exception -> 0x00c8 }, ExcHandler: IllegalArgumentException (r8v3 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:5:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9 A[Catch:{ Exception -> 0x00a9, FelicaException -> 0x00e9, IllegalArgumentException -> 0x00da, FelicaException -> 0x00e9, IllegalArgumentException -> 0x00da, Exception -> 0x00c8 }, ExcHandler: FelicaException (r8v2 'e' com.felicanetworks.mfc.FelicaException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:5:0x000b] */
    public synchronized void setPushNotificationListener(PushAppNotificationListener pushAppNotificationListener, String str) {
        PushAppNotificationListenerStub pushAppNotificationListenerStub;
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (pushAppNotificationListener == null) {
                if (str != null) {
                    LogMgr.log(2, "%s", "001");
                    throw new IllegalArgumentException("The specified parameter is invalid.");
                }
            }
            if (str != null) {
                LogMgr.log(7, "%s", "002");
                if (str.length() != 0) {
                    if (str.length() != 6) {
                        LogMgr.log(1, "%s invalid parameter", "800");
                        throw new IllegalArgumentException("The specified parameter is invalid.");
                    }
                }
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < ' ' || str.charAt(i) > '~') {
                        LogMgr.log(1, "%s not ASCII code", "801");
                        throw new IllegalArgumentException("The specified parameter is invalid.");
                    }
                }
            }
            if (pushAppNotificationListener != null) {
                LogMgr.log(7, "%s", "003");
                pushAppNotificationListenerStub = new PushAppNotificationListenerStub(pushAppNotificationListener);
            } else {
                pushAppNotificationListenerStub = null;
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().setPushNotificationListener(pushAppNotificationListenerStub, str));
            } else {
                MfcUtil.checkMfcResult(iFelica.setPushNotificationListener(pushAppNotificationListenerStub, str));
            }
            if (this.pushAppNotificationHooker != null) {
                LogMgr.log(7, "%s", "004");
                this.pushAppNotificationHooker.setListener(null);
            }
            this.pushAppNotificationHooker = pushAppNotificationListenerStub;
            LogMgr.log(3, "%s", "999");
        } catch (Exception e) {
            LogMgr.log(2, "%s %s", "710", "Error was happend in returening procedure");
            pushAppNotificationListenerStub.setListener(null);
            this.pushAppNotificationHooker = null;
            throw e;
        } catch (FelicaException e2) {
        } catch (IllegalArgumentException e3) {
        } catch (Exception e4) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void setRetryCount(int i) {
        LogMgr.log(3, "%s retryCount:%d", "000", Integer.valueOf(i));
        if (i < 0) {
            this.mRetryCount = 0;
            LogMgr.log(7, "%s", "001");
        } else if (i <= 10) {
            this.mRetryCount = i;
            LogMgr.log(7, "%s", "003");
        } else {
            this.mRetryCount = 10;
            LogMgr.log(7, "%s", "002");
        }
        LogMgr.log(3, "%s retryCount:%d is set", "999", Integer.valueOf(this.mRetryCount));
    }

    public synchronized void setSelectTimeout(int i) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().setSelectTimeout(i));
            } else {
                MfcUtil.checkMfcResult(iFelica.setSelectTimeout(i));
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void setTimeout(int i) {
        LogMgr.log(3, "%s timeout:%d", "000", Integer.valueOf(i));
        if (i < 0) {
            this.mTimeout = 0;
            LogMgr.log(7, "%s", "001");
        } else if (i <= 60000) {
            this.mTimeout = i;
            LogMgr.log(7, "%s", "003");
        } else {
            this.mTimeout = MAX_TIMEOUT;
            LogMgr.log(7, "%s", "002");
        }
        LogMgr.log(3, "%s timeout:%d is set", "999", Integer.valueOf(this.mTimeout));
    }

    /* access modifiers changed from: protected */
    public void unbindMfc() {
        LogMgr.log(7, "%s", "000");
        try {
            LogMgr.log(3, "%s", "001");
            ((Context) this.mContext.get()).unbindService(this.connectionHooker);
            LogMgr.log(3, "%s", "002");
        } catch (Exception e) {
            LogMgr.log(7, "%s %s", "004", "Unbind failed");
        } catch (Throwable th) {
            LogMgr.log(7, "%s", "003");
            cleanUp();
            throw th;
        }
        LogMgr.log(7, "%s", "003");
        cleanUp();
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void write(BlockDataList blockDataList) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (blockDataList == null || blockDataList.size() == 0) {
                LogMgr.log(2, "%s %s", "710", "Parameter Error");
                throw new IllegalArgumentException(EXC_INVALID_BLOCK_DATA_LIST);
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().write(blockDataList, this.mTimeout, this.mRetryCount));
            } else {
                MfcUtil.checkMfcResult(iFelica.write(blockDataList, this.mTimeout, this.mRetryCount));
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s IllegalArgumentException", "702");
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }

    public synchronized void select(int i, int i2) {
        LogMgr.log(3, "%s", "000");
        try {
            checkMfcOrMfiActivated();
            if (i != 0) {
                if (i != 1) {
                    LogMgr.log(2, "%s target:%d", "710", Integer.valueOf(i));
                    throw new IllegalArgumentException(EXC_INVALID_TARGET);
                }
            }
            if (i2 < 0 || i2 > 65535) {
                LogMgr.log(2, "%s systemCode:%d", "711", Integer.valueOf(i2));
                throw new IllegalArgumentException(EXC_INVALID_SYSTEM_CODE);
            }
            if (i == 0) {
                if (i2 == 65535 || (i2 & GET_SYSTEM_CODE_WILD2) == GET_SYSTEM_CODE_WILD2 || (i2 & GET_SYSTEM_CODE_WILD3) == GET_SYSTEM_CODE_WILD3) {
                    LogMgr.log(2, "%s systemCode:%d", "712", Integer.valueOf(i2));
                    throw new IllegalArgumentException(EXC_INVALID_SYSTEM_CODE);
                }
            }
            IFelica iFelica = this.felica;
            if (iFelica == null) {
                MfcUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().selectWithTarget(i, i2));
            } else {
                MfcUtil.checkMfcResult(iFelica.selectWithTarget(i, i2));
            }
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", "FelicaException", Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw e;
        } catch (IllegalArgumentException e2) {
            LogMgr.log(2, "%s systemCode:%d", "702", Integer.valueOf(i2));
            throw e2;
        } catch (Exception e3) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new FelicaException(1, 47);
        }
    }
}
