package com.felicanetworks.mfc.mfi;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.MfiClientAccess;
import com.felicanetworks.mfc.mfi.ILoginEventCallback;
import com.felicanetworks.mfc.mfi.ILogoutEventCallback;
import com.felicanetworks.mfc.util.LogMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MfiClient {
    public static final String ACCOUNT_ISSUER_GOOGLE = "Google";
    private static final List ACCOUNT_ISSUER_LIST;
    public static final String EXC_INVALID_ACCOUNT_ISSUER = "The specified AccountIssuer is invalid.";
    public static final String EXC_INVALID_ACCOUNT_NAME = "The specified AccountName is null.";
    public static final String EXC_INVALID_CALLBACK = "The specified Callback is null.";
    private ILoginEventCallback mILoginEventCallback = new ILoginEventCallback.Stub() {
        /* class com.felicanetworks.mfc.mfi.MfiClient.C01381 */

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopLoggingInOut = MfiClient.this.mMfiClientAccess.stopLoggingInOut();
                if (stopLoggingInOut != null) {
                    LogMgr.log(6, "%s", "001");
                    try {
                        stopLoggingInOut.onError(i, str);
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "800", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
        public void onSuccess() {
            Exception e;
            BaseMfiEventCallback baseMfiEventCallback;
            LogMgr.log(3, "%s", "000");
            try {
                baseMfiEventCallback = MfiClient.this.mMfiClientAccess.stopLoggingInOut();
                try {
                    User user = new User(MfiClient.this.mMfiClientAccess);
                    MfiClient.this.mMfiClientAccess.setLoginUser(user);
                    if (baseMfiEventCallback != null) {
                        if (baseMfiEventCallback instanceof StartEventCallback) {
                            LogMgr.log(6, "%s", "001");
                            try {
                                ((StartEventCallback) baseMfiEventCallback).onSuccess(user);
                            } catch (Exception e2) {
                                LogMgr.log(2, "%s %s", "700", e2.getMessage());
                            }
                            LogMgr.log(3, "%s", "999");
                        }
                    }
                    LogMgr.log(6, "%s", "002");
                } catch (Exception e3) {
                    e = e3;
                    LogMgr.log(1, "%s %s", "800", e.getMessage());
                    if (baseMfiEventCallback != null) {
                    }
                    LogMgr.log(3, "%s", "999");
                }
            } catch (Exception e4) {
                e = e4;
                baseMfiEventCallback = null;
                LogMgr.log(1, "%s %s", "800", e.getMessage());
                if (baseMfiEventCallback != null) {
                    try {
                        baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
                    } catch (Exception e5) {
                        LogMgr.log(2, "%s %s", "701", e.getMessage());
                    }
                }
                LogMgr.log(3, "%s", "999");
            }
            LogMgr.log(3, "%s", "999");
        }
    };
    private ILogoutEventCallback mILogoutEventCallback = new ILogoutEventCallback.Stub() {
        /* class com.felicanetworks.mfc.mfi.MfiClient.C01392 */

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopLoggingInOut = MfiClient.this.mMfiClientAccess.stopLoggingInOut();
                if (stopLoggingInOut != null) {
                    LogMgr.log(6, "%s", "001");
                    try {
                        stopLoggingInOut.onError(i, str);
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "800", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        public void onSuccess() {
            Exception e;
            BaseMfiEventCallback baseMfiEventCallback;
            LogMgr.log(3, "%s", "000");
            try {
                baseMfiEventCallback = MfiClient.this.mMfiClientAccess.stopLoggingInOut();
                try {
                    MfiClient.this.mMfiClientAccess.clearLoginUser();
                    if (baseMfiEventCallback != null) {
                        if (baseMfiEventCallback instanceof StopEventCallback) {
                            LogMgr.log(6, "%s", "001");
                            try {
                                ((StopEventCallback) baseMfiEventCallback).onSuccess();
                            } catch (Exception e2) {
                                LogMgr.log(2, "%s %s", "700", e2.getMessage());
                            }
                            LogMgr.log(3, "%s", "999");
                        }
                    }
                    LogMgr.log(6, "%s", "002");
                } catch (Exception e3) {
                    e = e3;
                    LogMgr.log(1, "%s %s", "800", e.getMessage());
                    if (baseMfiEventCallback != null) {
                    }
                    LogMgr.log(3, "%s", "999");
                }
            } catch (Exception e4) {
                e = e4;
                baseMfiEventCallback = null;
                LogMgr.log(1, "%s %s", "800", e.getMessage());
                if (baseMfiEventCallback != null) {
                    try {
                        baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
                    } catch (Exception e5) {
                        LogMgr.log(2, "%s %s", "701", e.getMessage());
                    }
                }
                LogMgr.log(3, "%s", "999");
            }
            LogMgr.log(3, "%s", "999");
        }
    };
    /* access modifiers changed from: private */
    public final MfiClientAccess mMfiClientAccess;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ACCOUNT_ISSUER_GOOGLE);
        ACCOUNT_ISSUER_LIST = Collections.unmodifiableList(arrayList);
    }

    public MfiClient(MfiClientAccess mfiClientAccess) {
        LogMgr.log(3, "%s", "000");
        this.mMfiClientAccess = mfiClientAccess;
        LogMgr.log(3, "%s", "999");
    }

    public synchronized void cancelCardOperation() {
        LogMgr.log(3, "%s", "000");
        this.mMfiClientAccess.checkActivated();
        if (this.mMfiClientAccess.isMfiClientStarted()) {
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().cancelCardOperation());
                LogMgr.log(3, "%s", "999");
            } catch (FelicaException e) {
                LogMgr.log(2, "%s %s id:%d type:%d", "701", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                throw new MfiClientException(e);
            } catch (Exception e2) {
                LogMgr.log(2, "%s %s", "702", "Other Exception");
                throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
            }
        } else {
            LogMgr.log(2, "%s Not logged in.", "700");
            throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, null);
        }
    }

    public synchronized void clearMfiAccount() {
        LogMgr.log(3, "%s", "000");
        this.mMfiClientAccess.checkActivated();
        try {
            MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().clearMfiAccount());
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw new MfiClientException(e);
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
        }
    }

    public void finish() {
        LogMgr.log(3, "%s", "000");
        LogMgr.log(3, "%s", "999");
    }

    public synchronized String getCurrentAccountHash() {
        FelicaResultInfoString currentAccountHash;
        LogMgr.log(3, "%s", "000");
        this.mMfiClientAccess.checkActivated();
        try {
            currentAccountHash = this.mMfiClientAccess.getIMfiFelica().getCurrentAccountHash();
            MfiUtil.checkMfcResult(currentAccountHash);
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw new MfiClientException(e);
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
        }
        return (String) currentAccountHash.getValue();
    }

    public synchronized SeInfo getSeInformation() {
        FelicaResultInfoSeInfo seInfomation;
        LogMgr.log(3, "%s", "000");
        this.mMfiClientAccess.checkActivated();
        try {
            seInfomation = this.mMfiClientAccess.getIMfiFelica().getSeInfomation();
            MfiUtil.checkMfcResult(seInfomation);
            LogMgr.log(3, "%s", "999");
        } catch (FelicaException e) {
            LogMgr.log(2, "%s %s id:%d type:%d", "700", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
            throw new MfiClientException(e);
        } catch (Exception e2) {
            LogMgr.log(2, "%s %s", "701", "Other Exception");
            throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
        }
        return (SeInfo) seInfomation.getValue();
    }

    public synchronized void start(String str, String str2, StartEventCallback startEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (str != null) {
            if (!ACCOUNT_ISSUER_LIST.contains(str)) {
                LogMgr.log(2, "%s Account issuer is invalid. %s", "701", str);
                throw new IllegalArgumentException(EXC_INVALID_ACCOUNT_ISSUER);
            } else if (str2 == null) {
                LogMgr.log(2, "%s Account name is null.", "702");
                throw new IllegalArgumentException(EXC_INVALID_ACCOUNT_NAME);
            }
        } else if (str2 != null) {
            LogMgr.log(2, "%s Account issuer is null.", "700");
            throw new IllegalArgumentException(EXC_INVALID_ACCOUNT_ISSUER);
        }
        if (startEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            if (!this.mMfiClientAccess.isMfiClientStarted()) {
                this.mMfiClientAccess.startLoggingInOut(startEventCallback, true);
                try {
                    MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().login(str, str2, this.mILoginEventCallback));
                    LogMgr.log(3, "%s", "999");
                } catch (FelicaException e) {
                    LogMgr.log(2, "%s %s id:%d type:%d", "705", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw new MfiClientException(e);
                } catch (IllegalArgumentException e2) {
                    LogMgr.log(2, "%s %s", "706", e2.toString());
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw e2;
                } catch (Exception e3) {
                    LogMgr.log(2, "%s %s", "707", "Other Exception");
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
                }
            } else {
                LogMgr.log(2, "%s Already logged in.", "704");
                throw new MfiClientException(2, 160, null);
            }
        } else {
            LogMgr.log(2, "%s callback is null.", "703");
            throw new IllegalArgumentException("The specified Callback is null.");
        }
    }

    public synchronized void stop(boolean z, StopEventCallback stopEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (stopEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            if (this.mMfiClientAccess.isMfiClientStarted()) {
                this.mMfiClientAccess.startLoggingInOut(stopEventCallback, false);
                try {
                    MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().logout(z, this.mILogoutEventCallback));
                    LogMgr.log(3, "%s", "999");
                } catch (FelicaException e) {
                    LogMgr.log(2, "%s %s id:%d type:%d", "702", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw new MfiClientException(e);
                } catch (IllegalArgumentException e2) {
                    LogMgr.log(2, "%s %s", "703", e2.toString());
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw e2;
                } catch (Exception e3) {
                    LogMgr.log(2, "%s %s", "704", "Other Exception");
                    this.mMfiClientAccess.stopLoggingInOut();
                    throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
                }
            } else {
                LogMgr.log(2, "%s Not logged in.", "701");
                throw new MfiClientException(2, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, null);
            }
        } else {
            LogMgr.log(2, "%s callback is null.", "700");
            throw new IllegalArgumentException("The specified Callback is null.");
        }
    }
}
