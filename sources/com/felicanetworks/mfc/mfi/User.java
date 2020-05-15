package com.felicanetworks.mfc.mfi;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.MfiClientAccess;
import com.felicanetworks.mfc.mfi.ICardAdditionalInfoListEventCallback;
import com.felicanetworks.mfc.mfi.ICardIssueEventCallback;
import com.felicanetworks.mfc.mfi.ICardListEventCallback;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class User {
    public static final String EXC_INVALID_CALLBACK = "The specified Callback is null.";
    public static final String EXC_INVALID_LINKAGE_DATA = "The specified LinkageData is null or invalid.";
    /* access modifiers changed from: private */
    public final MfiClientAccess mMfiClientAccess;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class LocalICardAdditionalInfoListEventCallback extends ICardAdditionalInfoListEventCallback.Stub {
        public LocalICardAdditionalInfoListEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = User.this.mMfiClientAccess.stopOnline();
                if (stopOnline != null) {
                    LogMgr.log(6, "%s", "001");
                    try {
                        stopOnline.onError(i, str);
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "800", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
        public void onSuccess(CardAdditionalInfo[] cardAdditionalInfoArr) {
            BaseMfiEventCallback baseMfiEventCallback;
            LogMgr.log(3, "%s", "000");
            try {
                baseMfiEventCallback = User.this.mMfiClientAccess.stopOnline();
                if (baseMfiEventCallback != null) {
                    try {
                        if (baseMfiEventCallback instanceof CardAdditionalInfoListEventCallback) {
                            LogMgr.log(6, "%s", "001");
                            try {
                                ((CardAdditionalInfoListEventCallback) baseMfiEventCallback).onSuccess(cardAdditionalInfoArr);
                            } catch (Exception e) {
                                LogMgr.log(2, "%s %s", "700", e.getMessage());
                            }
                            LogMgr.log(3, "%s", "999");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "002");
            } catch (Exception e3) {
                e = e3;
                baseMfiEventCallback = null;
                LogMgr.log(1, "%s %s", "800", e.getMessage());
                if (baseMfiEventCallback != null) {
                    try {
                        baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
                    } catch (Exception e4) {
                        LogMgr.log(2, "%s %s", "701", e.getMessage());
                    }
                }
                LogMgr.log(3, "%s", "999");
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class LocalICardIssueEventCallback extends ICardIssueEventCallback.Stub {
        public LocalICardIssueEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = User.this.mMfiClientAccess.stopOnline();
                if (stopOnline != null) {
                    LogMgr.log(6, "%s", "001");
                    try {
                        stopOnline.onError(i, str);
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "800", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
        public void onSuccess(CardInfo cardInfo) {
            LogMgr.log(3, "%s", "000");
            BaseMfiEventCallback baseMfiEventCallback = null;
            Card card = null;
            try {
                BaseMfiEventCallback stopOnline = User.this.mMfiClientAccess.stopOnline();
                if (cardInfo != null) {
                    try {
                        LogMgr.log(6, "%s", "001");
                        card = new Card(cardInfo, User.this.mMfiClientAccess);
                    } catch (Exception e) {
                        e = e;
                        baseMfiEventCallback = stopOnline;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                            try {
                                baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
                            } catch (Exception e2) {
                                LogMgr.log(2, "%s %s", "701", e.getMessage());
                            }
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                if (stopOnline != null) {
                    if (stopOnline instanceof CardIssueEventCallback) {
                        LogMgr.log(6, "%s", "002");
                        try {
                            ((CardIssueEventCallback) stopOnline).onSuccess(card);
                        } catch (Exception e3) {
                            LogMgr.log(2, "%s %s", "700", e3.getMessage());
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "003");
            } catch (Exception e4) {
                e = e4;
                LogMgr.log(1, "%s %s", "800", e.getMessage());
                if (baseMfiEventCallback != null) {
                }
                LogMgr.log(3, "%s", "999");
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class LocalICardListEventCallback extends ICardListEventCallback.Stub {
        public LocalICardListEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = User.this.mMfiClientAccess.stopOnline();
                if (stopOnline != null) {
                    LogMgr.log(6, "%s", "001");
                    try {
                        stopOnline.onError(i, str);
                    } catch (Exception e) {
                        LogMgr.log(2, "%s %s", "700", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                LogMgr.log(1, "%s %s", "800", e2.getMessage());
            }
            LogMgr.log(3, "%s", "999");
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
        public void onSuccess(CardInfo[] cardInfoArr) {
            LogMgr.log(3, "%s", "000");
            BaseMfiEventCallback baseMfiEventCallback = null;
            Card[] cardArr = null;
            try {
                BaseMfiEventCallback stopOnline = User.this.mMfiClientAccess.stopOnline();
                if (cardInfoArr != null) {
                    try {
                        LogMgr.log(6, "%s", "001");
                        int length = cardInfoArr.length;
                        Card[] cardArr2 = new Card[length];
                        for (int i = 0; i < length; i++) {
                            CardInfo cardInfo = cardInfoArr[i];
                            if (cardInfo != null) {
                                cardArr2[i] = new Card(cardInfo, User.this.mMfiClientAccess);
                            }
                        }
                        cardArr = cardArr2;
                    } catch (Exception e) {
                        e = e;
                        baseMfiEventCallback = stopOnline;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                            try {
                                baseMfiEventCallback.onError(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, MfiClientAccess.EXC_UNKNOWN_ERROR);
                            } catch (Exception e2) {
                                LogMgr.log(2, "%s %s", "701", e.getMessage());
                            }
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                if (stopOnline != null) {
                    if (stopOnline instanceof CardListEventCallback) {
                        LogMgr.log(6, "%s", "002");
                        try {
                            ((CardListEventCallback) stopOnline).onSuccess(cardArr);
                        } catch (Exception e3) {
                            LogMgr.log(2, "%s %s", "700", e3.getMessage());
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "003");
            } catch (Exception e4) {
                e = e4;
                LogMgr.log(1, "%s %s", "800", e.getMessage());
                if (baseMfiEventCallback != null) {
                }
                LogMgr.log(3, "%s", "999");
            }
            LogMgr.log(3, "%s", "999");
        }
    }

    public User(MfiClientAccess mfiClientAccess) {
        LogMgr.log(7, "%s", "000");
        this.mMfiClientAccess = mfiClientAccess;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void getCardAdditionalInfoList(CardAdditionalInfoListEventCallback cardAdditionalInfoListEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (cardAdditionalInfoListEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.checkUserLoggedIn(this);
            this.mMfiClientAccess.startOnline(cardAdditionalInfoListEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().getCardAdditionalInfoList(new LocalICardAdditionalInfoListEventCallback()));
                LogMgr.log(3, "%s", "999");
            } catch (FelicaException e) {
                LogMgr.log(2, "%s %s id:%d type:%d", "701", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(e);
            } catch (IllegalArgumentException e2) {
                LogMgr.log(2, "%s %s", "702", e2.toString());
                this.mMfiClientAccess.stopOnline();
                throw e2;
            } catch (Exception e3) {
                LogMgr.log(2, "%s %s", "703", "Other Exception");
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
            }
        } else {
            LogMgr.log(2, "%s callback is null.", "700");
            throw new IllegalArgumentException("The specified Callback is null.");
        }
    }

    public synchronized void getCardList(CardListEventCallback cardListEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (cardListEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.checkUserLoggedIn(this);
            this.mMfiClientAccess.startOnline(cardListEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().getCardList(new LocalICardListEventCallback()));
                LogMgr.log(3, "%s", "999");
            } catch (FelicaException e) {
                LogMgr.log(2, "%s %s id:%d type:%d", "701", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(e);
            } catch (IllegalArgumentException e2) {
                LogMgr.log(2, "%s %s", "702", e2.toString());
                this.mMfiClientAccess.stopOnline();
                throw e2;
            } catch (Exception e3) {
                LogMgr.log(2, "%s %s", "703", "Other Exception");
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
            }
        } else {
            LogMgr.log(2, "%s callback is null.", "700");
            throw new IllegalArgumentException("The specified Callback is null.");
        }
    }

    public synchronized void issueCard(String str, CardIssueEventCallback cardIssueEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (str == null) {
            LogMgr.log(2, "%s linkageData is null.", "700");
            throw new IllegalArgumentException("The specified LinkageData is null or invalid.");
        } else if (str.isEmpty()) {
            LogMgr.log(2, "%s linkageData is empty.", "701");
            throw new IllegalArgumentException("The specified LinkageData is null or invalid.");
        } else if (cardIssueEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.checkUserLoggedIn(this);
            this.mMfiClientAccess.startOnline(cardIssueEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().issueCard(str, new LocalICardIssueEventCallback()));
                LogMgr.log(3, "%s", "999");
            } catch (FelicaException e) {
                LogMgr.log(2, "%s %s id:%d type:%d", "703", e.toString(), Integer.valueOf(e.getID()), Integer.valueOf(e.getType()));
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(e);
            } catch (IllegalArgumentException e2) {
                LogMgr.log(2, "%s %s", "704", e2.toString());
                this.mMfiClientAccess.stopOnline();
                throw e2;
            } catch (Exception e3) {
                LogMgr.log(2, "%s %s", "705", "Other Exception");
                this.mMfiClientAccess.stopOnline();
                throw new MfiClientException(1, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, null);
            }
        } else {
            LogMgr.log(2, "%s callback is null.", "702");
            throw new IllegalArgumentException("The specified Callback is null.");
        }
    }
}
