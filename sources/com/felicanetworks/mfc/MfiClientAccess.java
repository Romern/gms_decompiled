package com.felicanetworks.mfc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.felicanetworks.mfc.IFelicaEventListener;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.FlavorConst;
import com.felicanetworks.mfc.mfi.IMfiFelica;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.mfi.User;
import com.felicanetworks.mfc.util.LogMgr;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MfiClientAccess {
    static final int DEFAULT_BIND_TIMEOUT = 10000;
    private static final String EXC_INVALID_LISTENER = "The specified Listener is null.";
    public static final String EXC_UNKNOWN_ERROR = "Unknown error.";
    private static final int MAX_SIGNER_SIZE = 100;
    private static final String MFI_ADAPTER_CLASS_NAME = "com.felicanetworks.mfc.mfi.FelicaAdapter";
    protected static final String MFI_SERVICE_PACKAGE_NAME = "com.felicanetworks.mfm.main";
    /* access modifiers changed from: private */
    public BindTimerHandler mBindTimerHandler = new BindTimerHandler();
    /* access modifiers changed from: private */
    public FelicaEventListener mCallback;
    /* access modifiers changed from: private */
    public FSCEventListener mFSCEventListener;
    private WeakReference mFelica = null;
    /* access modifiers changed from: private */
    public IFelicaEventListener mIFelicaEventListener = new FelicaEventListenerStub();
    private boolean mLoggingInOut = false;
    private User mLoginUser;
    private MfiConnection mMfiConnectionHooker = new MfiConnection();
    /* access modifiers changed from: private */
    public IMfiFelica mMfiFelica = null;
    /* access modifiers changed from: private */
    public BaseMfiEventCallback mMfiLogInOutEventCallback;
    /* access modifiers changed from: private */
    public BaseMfiEventCallback mMfiOnlineEventCallback;
    private boolean mOnline = false;
    /* access modifiers changed from: private */
    public String mPackageName;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class BindTimerHandler extends Handler {
        static final int MSG_BIND_TIMER = 1;

        public BindTimerHandler() {
        }

        public void handleMessage(Message message) {
            FelicaEventListener felicaEventListener;
            LogMgr.log(7, "%s what=%d", "000", Integer.valueOf(message.what));
            if (message.what == 1) {
                LogMgr.log(2, "%s bind timeout connecting=%b", "700", Boolean.valueOf(MfiClientAccess.this.checkConnecting()));
                synchronized (MfiClientAccess.this) {
                    if (MfiClientAccess.this.checkConnecting()) {
                        LogMgr.log(7, "%s", "001");
                        felicaEventListener = MfiClientAccess.this.mCallback;
                        FelicaEventListener unused = MfiClientAccess.this.mCallback = null;
                        MfiClientAccess.this.unbindMfiClient();
                    } else {
                        felicaEventListener = null;
                    }
                }
                if (felicaEventListener != null) {
                    LogMgr.log(7, "%s Do the callback", "002");
                    felicaEventListener.errorOccurred(1, "Bind timeout.", null);
                }
            }
            super.handleMessage(message);
            LogMgr.log(7, "%s", "999");
        }

        public void startTimer(int i) {
            LogMgr.log(7, "%s timeout=%d", "000", Integer.valueOf(i));
            if (i > 0) {
                LogMgr.log(7, "%s", "001");
                sendMessageDelayed(MfiClientAccess.this.mBindTimerHandler.obtainMessage(1), (long) i);
            }
            LogMgr.log(7, "%s", "999");
        }

        public void stopTimer() {
            LogMgr.log(7, "%s", "000");
            removeMessages(1);
            LogMgr.log(7, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class FelicaEventListenerStub extends IFelicaEventListener.Stub {
        public FelicaEventListenerStub() {
        }

        public void errorOccurred(int i, String str, AppInfo appInfo) {
            FelicaEventListener access$200;
            AppInfo appInfo2 = appInfo;
            LogMgr.log(7, "%s", "000");
            synchronized (MfiClientAccess.this) {
                LogMgr.log(7, "%s", "001");
                access$200 = MfiClientAccess.this.mCallback;
                FelicaEventListener unused = MfiClientAccess.this.mCallback = null;
                try {
                    MfiClientAccess.this.unbindMfiClient();
                } catch (Exception e) {
                    LogMgr.log(2, "%s %s", "700", e.getMessage());
                }
            }
            if (access$200 != null) {
                try {
                    LogMgr.log(7, "%s %s %d %s", "002", "FelicaEventListener#errorOccurred", Integer.valueOf(i), str);
                    if (appInfo2 != null) {
                        LogMgr.log(7, "%s %s %d", "003", "FelicaEventListener#errorOccurred", Integer.valueOf(appInfo.getPid()));
                    }
                    access$200.errorOccurred(i, str, appInfo2);
                } catch (Exception e2) {
                    LogMgr.log(2, "%s %s", "701", e2.getMessage());
                }
            }
            LogMgr.log(7, "%s", "999");
        }

        public void finished() {
            FelicaEventListener felicaEventListener;
            LogMgr.log(7, "%s %s", "000", "FelicaEventListener#finished");
            try {
                synchronized (MfiClientAccess.this) {
                    felicaEventListener = null;
                    if (MfiClientAccess.this.mCallback != null) {
                        LogMgr.log(7, "%s", "001");
                        FelicaEventListener access$200 = MfiClientAccess.this.mCallback;
                        FelicaEventListener unused = MfiClientAccess.this.mCallback = null;
                        felicaEventListener = access$200;
                    } else {
                        LogMgr.log(7, "%s", "002");
                        MfiClientAccess.this.unbindMfiClient();
                    }
                }
                if (felicaEventListener != null) {
                    try {
                        LogMgr.log(7, "%s", "003");
                        felicaEventListener.finished();
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(2, "%s %s", "701", e2.getMessage());
            }
            LogMgr.log(7, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class MfiConnection implements ServiceConnection {
        public MfiConnection() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            int i;
            FelicaEventListener felicaEventListener;
            AppInfo appInfo;
            LogMgr.log(7, "%s %s", "000", componentName.getClassName());
            synchronized (MfiClientAccess.this) {
                IMfiFelica unused = MfiClientAccess.this.mMfiFelica = IMfiFelica.Stub.asInterface(iBinder);
                MfiClientAccess.this.mBindTimerHandler.stopTimer();
                i = 1;
                if (MfiClientAccess.this.mCallback != null) {
                    try {
                        MfcUtil.checkMfcResult(MfiClientAccess.this.mMfiFelica.activateFelica(MfiClientAccess.this.mPackageName, MfiClientAccess.this.mIFelicaEventListener));
                        LogMgr.log(7, "%s", "002");
                        felicaEventListener = null;
                        appInfo = null;
                    } catch (FelicaException e) {
                        LogMgr.log(7, "%s", "001");
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
                        LogMgr.log(7, "%s", "002");
                        LogMgr.log(7, "%s", "003");
                        felicaEventListener = MfiClientAccess.this.mCallback;
                        FelicaEventListener unused2 = MfiClientAccess.this.mCallback = null;
                        MfiClientAccess.this.unbindMfiClient();
                    } catch (Exception e2) {
                        try {
                            LogMgr.log(2, "%s Exception %s", "703", e2.getMessage());
                            LogMgr.log(7, "%s", "002");
                            LogMgr.log(7, "%s", "003");
                            felicaEventListener = MfiClientAccess.this.mCallback;
                            FelicaEventListener unused3 = MfiClientAccess.this.mCallback = null;
                            MfiClientAccess.this.unbindMfiClient();
                            appInfo = null;
                        } catch (Throwable th) {
                            LogMgr.log(7, "%s", "002");
                            throw th;
                        }
                    }
                } else {
                    LogMgr.log(2, "%s", "704");
                    MfiClientAccess.this.unbindMfiClient();
                    felicaEventListener = null;
                    appInfo = null;
                }
            }
            LogMgr.log(7, "%s", "004");
            if (felicaEventListener != null) {
                LogMgr.log(7, "%s Do the callback", "005");
                felicaEventListener.errorOccurred(i, null, appInfo);
            }
            LogMgr.log(7, "%s", "999");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            FelicaEventListener felicaEventListener;
            FSCEventListener fSCEventListener;
            BaseMfiEventCallback baseMfiEventCallback;
            BaseMfiEventCallback baseMfiEventCallback2;
            LogMgr.log(7, "%s %s", "000", componentName);
            synchronized (MfiClientAccess.this) {
                if (MfiClientAccess.this.mCallback != null) {
                    LogMgr.log(7, "%s", "001");
                    felicaEventListener = MfiClientAccess.this.mCallback;
                    FelicaEventListener unused = MfiClientAccess.this.mCallback = null;
                } else {
                    felicaEventListener = null;
                }
                if (MfiClientAccess.this.mFSCEventListener != null) {
                    LogMgr.log(7, "%s", "002");
                    fSCEventListener = MfiClientAccess.this.mFSCEventListener;
                    FSCEventListener unused2 = MfiClientAccess.this.mFSCEventListener = null;
                } else {
                    fSCEventListener = null;
                }
                if (MfiClientAccess.this.mMfiLogInOutEventCallback != null) {
                    LogMgr.log(7, "%s", "003");
                    baseMfiEventCallback = MfiClientAccess.this.mMfiLogInOutEventCallback;
                    BaseMfiEventCallback unused3 = MfiClientAccess.this.mMfiLogInOutEventCallback = null;
                } else {
                    baseMfiEventCallback = null;
                }
                if (MfiClientAccess.this.mMfiOnlineEventCallback != null) {
                    LogMgr.log(7, "%s", "004");
                    baseMfiEventCallback2 = MfiClientAccess.this.mMfiOnlineEventCallback;
                    BaseMfiEventCallback unused4 = MfiClientAccess.this.mMfiOnlineEventCallback = null;
                } else {
                    baseMfiEventCallback2 = null;
                }
                MfiClientAccess.this.unbindMfiClient();
            }
            if (felicaEventListener != null) {
                LogMgr.log(7, "%s", "004");
                felicaEventListener.errorOccurred(1, MfiClientAccess.EXC_UNKNOWN_ERROR, null);
            }
            if (fSCEventListener != null) {
                LogMgr.log(7, "%s", "005");
                fSCEventListener.errorOccurred(1, MfiClientAccess.EXC_UNKNOWN_ERROR);
            }
            if (baseMfiEventCallback != null) {
                LogMgr.log(7, "%s", "006");
                baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
            }
            if (baseMfiEventCallback2 != null) {
                LogMgr.log(7, "%s", "007");
                baseMfiEventCallback2.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
            }
            LogMgr.log(7, "%s", "999");
        }
    }

    public MfiClientAccess(Felica felica) {
        LogMgr.log(7, "%s", "000");
        this.mFelica = new WeakReference(felica);
        LogMgr.log(7, "%s", "999");
    }

    private static String byte2hex(byte[] bArr) {
        LogMgr.log(7, "%s", "000");
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
        }
        LogMgr.log(7, "%s", "999");
        return sb.toString();
    }

    private static boolean checkAppCertHash(Context context) {
        LogMgr.log(7, "%s context=%s", "000", context);
        String replaceAll = FlavorConst.MENU_APP_SIGNATURE_HASH.toUpperCase().replaceAll(":", "");
        LogMgr.log(7, "%s", "999");
        String[] hashes = hashes(context, MFI_SERVICE_PACKAGE_NAME);
        if (hashes == null) {
            return false;
        }
        for (String str : hashes) {
            if (replaceAll.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean checkConnecting() {
        LogMgr.log(7, "%s", "000");
        if (this.mMfiFelica == null && this.mCallback != null) {
            LogMgr.log(7, "%s", "001");
            return true;
        }
        LogMgr.log(7, "%s", "002");
        return false;
    }

    private static byte[] computeSha256(byte[] bArr) {
        byte[] bArr2;
        LogMgr.log(7, "%s", "000");
        try {
            bArr2 = MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            LogMgr.log(2, "%s %s", "700", e.toString());
            bArr2 = null;
        }
        LogMgr.log(7, "%s", "999");
        return bArr2;
    }

    private static String[] hashes(Context context, String str) {
        LogMgr.log(7, "%s context=%s packageName=%s", "000", context, str);
        String[] strArr = null;
        if (context == null || str == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures.length <= 100) {
                strArr = new String[packageInfo.signatures.length];
                int i = 0;
                while (i < packageInfo.signatures.length) {
                    try {
                        strArr[i] = byte2hex(computeSha256(packageInfo.signatures[i].toByteArray()));
                        i++;
                    } catch (PackageManager.NameNotFoundException e) {
                        e = e;
                        LogMgr.log(2, "%s %s", "701", e.toString());
                        LogMgr.log(7, "%s", "999");
                        return strArr;
                    }
                }
                LogMgr.log(7, "%s", "999");
                return strArr;
            }
            LogMgr.log(2, "%s pkginfo.signatures exceeds max size.", "700");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            LogMgr.log(2, "%s %s", "701", e.toString());
            LogMgr.log(7, "%s", "999");
            return strArr;
        }
    }

    public synchronized void activate(String str, FelicaEventListener felicaEventListener) {
        LogMgr.log(7, "%s", "000");
        if (felicaEventListener != null) {
            checkNotActivated();
            this.mPackageName = str;
            this.mCallback = felicaEventListener;
            try {
                bindMfiClientService();
                LogMgr.log(7, "%s", "999");
            } catch (Exception e) {
                LogMgr.log(2, "%s can not bind to MFI", "700");
                this.mCallback = null;
                throw new FelicaException(1, 47, "can not bind to MFI");
            }
        } else {
            throw new IllegalArgumentException(EXC_INVALID_LISTENER);
        }
    }

    /* access modifiers changed from: protected */
    public void bindMfiClientService() {
        LogMgr.log(7, "%s", "000");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MFI_SERVICE_PACKAGE_NAME, MFI_ADAPTER_CLASS_NAME));
        Felica felica = (Felica) this.mFelica.get();
        if (felica != null) {
            Context context = felica.getContext();
            if (context == null) {
                LogMgr.log(3, "%s %s", "701", "Failed to connect for MFI Client Service. context is null.");
                throw new FelicaException(1, 47);
            } else if (!checkAppCertHash(context)) {
                LogMgr.log(3, "%s %s", "702", "Failed to connect for MFI Client Service. AppCertHash check failed.");
                throw new FelicaException(1, 47);
            } else if (context.bindService(intent, this.mMfiConnectionHooker, 1)) {
                this.mBindTimerHandler.startTimer(DEFAULT_BIND_TIMEOUT);
                LogMgr.log(7, "%s", "999");
            } else {
                LogMgr.log(3, "%s %s", "703", "Failed to connect for MFI Client Service");
                context.unbindService(this.mMfiConnectionHooker);
                throw new FelicaException(1, 47);
            }
        } else {
            LogMgr.log(3, "%s %s", "700", "Failed to connect for MFI Client Service. felica is null.");
            throw new FelicaException(1, 47);
        }
    }

    public void checkActivated() {
        LogMgr.log(7, "%s", "000");
        if (((Felica) this.mFelica.get()) == null || this.mMfiFelica == null || this.mCallback != null) {
            LogMgr.log(7, "%s", "001");
            throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, null);
        } else {
            LogMgr.log(7, "%s", "999");
        }
    }

    public boolean checkAfterActivating() {
        LogMgr.log(7, "%s", "000");
        if (this.mMfiFelica == null && this.mCallback == null) {
            LogMgr.log(7, "%s", "002");
            return false;
        }
        LogMgr.log(7, "%s", "001");
        return true;
    }

    public void checkNotActivated() {
        LogMgr.log(7, "%s", "000");
        if (this.mCallback != null) {
            throw new FelicaException(2, 49);
        } else if (this.mMfiFelica == null) {
            LogMgr.log(7, "%s", "999");
        } else {
            throw new FelicaException(2, 42);
        }
    }

    public void checkUserLoggedIn(User user) {
        LogMgr.log(7, "%s", "000");
        User user2 = this.mLoginUser;
        if (user2 == null || !user2.equals(user)) {
            LogMgr.log(2, "%s", "700", "logged out.");
            throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, null);
        } else {
            LogMgr.log(7, "%s", "999");
        }
    }

    /* access modifiers changed from: protected */
    public void cleanUp() {
        LogMgr.log(7, "%s", "000");
        this.mPackageName = null;
        this.mMfiFelica = null;
        this.mCallback = null;
        this.mFSCEventListener = null;
        this.mMfiLogInOutEventCallback = null;
        this.mMfiOnlineEventCallback = null;
        this.mBindTimerHandler.stopTimer();
        this.mLoggingInOut = false;
        this.mOnline = false;
        this.mLoginUser = null;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void clearFSCEventListener() {
        LogMgr.log(7, "%s", "000");
        this.mFSCEventListener = null;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void clearLoginUser() {
        LogMgr.log(7, "%s", "000");
        this.mLoginUser = null;
        LogMgr.log(7, "%s", "999");
    }

    public void finish() {
        LogMgr.log(7, "%s", "000");
        try {
            synchronized (this) {
                LogMgr.log(6, "%s", "001");
                try {
                    if (this.mMfiFelica != null) {
                        LogMgr.log(6, "%s", "002");
                        this.mMfiFelica.close();
                        this.mMfiFelica.inactivateFelica();
                    }
                } catch (Exception e) {
                    LogMgr.log(6, "%s %s", "003", e.getMessage());
                }
                unbindMfiClient();
            }
        } catch (Exception e2) {
            LogMgr.log(6, "%s %s", "004", e2.getMessage());
        }
        LogMgr.log(7, "%s", "999");
    }

    public synchronized IMfiFelica getIMfiFelica() {
        LogMgr.log(7, "%s", "000");
        LogMgr.log(7, "%s", "999");
        return this.mMfiFelica;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        return;
     */
    public synchronized void inactivate() {
        LogMgr.log(7, "%s", "000");
        if (checkAfterActivating()) {
            if (!checkConnecting()) {
                try {
                    MfcUtil.checkMfcResult(this.mMfiFelica.inactivateFelica());
                    unbindMfiClient();
                    LogMgr.log(7, "%s", "999");
                } catch (FelicaException e) {
                    LogMgr.log(2, "%s %s id:%d type:%d", "700", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
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
                unbindMfiClient();
            }
        }
    }

    public synchronized boolean isFSCStarted() {
        LogMgr.log(7, "%s", "000");
        LogMgr.log(7, "%s", "999");
        return this.mFSCEventListener != null;
    }

    public boolean isMfiClientStarted() {
        return this.mLoginUser != null;
    }

    public synchronized void setFSCEventListener(FSCEventListener fSCEventListener) {
        LogMgr.log(7, "%s", "000");
        this.mFSCEventListener = fSCEventListener;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void setLoginUser(User user) {
        LogMgr.log(7, "%s", "000");
        this.mLoginUser = user;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void startLoggingInOut(BaseMfiEventCallback baseMfiEventCallback, boolean z) {
        LogMgr.log(7, "%s", "000");
        if (!this.mLoggingInOut) {
            if (this.mOnline) {
                if (!z) {
                    LogMgr.log(7, "%s", "001", "online processing, but it continues");
                } else {
                    LogMgr.log(2, "%s", "700", "online processing");
                    throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, null);
                }
            }
            this.mLoggingInOut = true;
            this.mOnline = true;
            this.mMfiLogInOutEventCallback = baseMfiEventCallback;
            LogMgr.log(7, "%s", "999");
        } else {
            LogMgr.log(2, "%s", "700", "login/logout processing");
            throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, null);
        }
    }

    public synchronized void startOnline(BaseMfiEventCallback baseMfiEventCallback) {
        LogMgr.log(7, "%s", "000");
        if (!this.mOnline) {
            this.mOnline = true;
            this.mMfiOnlineEventCallback = baseMfiEventCallback;
            LogMgr.log(7, "%s", "999");
        } else {
            LogMgr.log(2, "%s", "700", "online processing");
            throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, null);
        }
    }

    public synchronized BaseMfiEventCallback stopLoggingInOut() {
        BaseMfiEventCallback baseMfiEventCallback;
        LogMgr.log(7, "%s", "000");
        baseMfiEventCallback = this.mMfiLogInOutEventCallback;
        this.mLoggingInOut = false;
        this.mOnline = false;
        this.mMfiLogInOutEventCallback = null;
        this.mMfiOnlineEventCallback = null;
        LogMgr.log(7, "%s", "999");
        return baseMfiEventCallback;
    }

    public synchronized BaseMfiEventCallback stopOnline() {
        BaseMfiEventCallback baseMfiEventCallback;
        LogMgr.log(7, "%s", "000");
        baseMfiEventCallback = this.mMfiOnlineEventCallback;
        this.mOnline = false;
        this.mMfiOnlineEventCallback = null;
        LogMgr.log(7, "%s", "999");
        return baseMfiEventCallback;
    }

    /* access modifiers changed from: protected */
    public void unbindMfiClient() {
        LogMgr.log(7, "%s", "000");
        try {
            Felica felica = (Felica) this.mFelica.get();
            if (felica != null) {
                LogMgr.log(6, "%s", "001");
                Context context = felica.getContext();
                if (context == null) {
                    LogMgr.log(2, "%s %s", "702", "Failed to unbindMfiClient. Context is null.");
                } else {
                    context.unbindService(this.mMfiConnectionHooker);
                }
            } else {
                LogMgr.log(2, "%s %s", "701", "Failed to unbindMfiClient. felica is null.");
            }
        } catch (Exception e) {
            LogMgr.log(6, "%s", "002");
        } catch (Throwable th) {
            cleanUp();
            throw th;
        }
        cleanUp();
        LogMgr.log(7, "%s", "999");
    }
}
