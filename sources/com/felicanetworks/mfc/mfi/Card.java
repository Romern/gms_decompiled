package com.felicanetworks.mfc.mfi;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.MfiClientAccess;
import com.felicanetworks.mfc.mfi.ICardDeleteEventCallback;
import com.felicanetworks.mfc.mfi.ICardDisableEventCallback;
import com.felicanetworks.mfc.mfi.ICardEnableEventCallback;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Card {
    public static final String EXC_INVALID_CALLBACK = "The specified Callback is null.";
    public static final String EXC_INVALID_LINKAGE_DATA = "The specified LinkageData is null or invalid.";
    protected CardInfo mCardInfo;
    protected final MfiClientAccess mMfiClientAccess;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class LocalICardDeleteEventCallback extends ICardDeleteEventCallback.Stub {
        public LocalICardDeleteEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = Card.this.mMfiClientAccess.stopOnline();
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

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
        public void onSuccess() {
            Exception e;
            BaseMfiEventCallback baseMfiEventCallback;
            LogMgr.log(3, "%s", "000");
            try {
                baseMfiEventCallback = Card.this.mMfiClientAccess.stopOnline();
                if (baseMfiEventCallback != null) {
                    try {
                        if (baseMfiEventCallback instanceof CardDeleteEventCallback) {
                            LogMgr.log(6, "%s", "001");
                            try {
                                ((CardDeleteEventCallback) baseMfiEventCallback).onSuccess();
                            } catch (Exception e2) {
                                LogMgr.log(2, "%s %s", "700", e2.getMessage());
                            }
                            LogMgr.log(3, "%s", "999");
                        }
                    } catch (Exception e3) {
                        e = e3;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "002");
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
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class LocalICardDisableEventCallback extends ICardDisableEventCallback.Stub {
        public LocalICardDisableEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = Card.this.mMfiClientAccess.stopOnline();
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

        /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
        public void onSuccess(CardInfo cardInfo) {
            LogMgr.log(3, "%s", "000");
            BaseMfiEventCallback baseMfiEventCallback = null;
            Card card = null;
            try {
                BaseMfiEventCallback stopOnline = Card.this.mMfiClientAccess.stopOnline();
                if (cardInfo != null) {
                    try {
                        LogMgr.log(6, "%s", "001");
                        card = new Card(cardInfo, Card.this.mMfiClientAccess);
                    } catch (Exception e) {
                        e = e;
                        baseMfiEventCallback = stopOnline;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                if (stopOnline != null) {
                    if (stopOnline instanceof CardDisableEventCallback) {
                        LogMgr.log(6, "%s", "002");
                        try {
                            ((CardDisableEventCallback) stopOnline).onSuccess(card);
                        } catch (Exception e2) {
                            LogMgr.log(2, "%s %s", "700", e2.getMessage());
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "003");
            } catch (Exception e3) {
                e = e3;
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
    class LocalICardEnableEventCallback extends ICardEnableEventCallback.Stub {
        public LocalICardEnableEventCallback() {
        }

        public void onError(int i, String str) {
            LogMgr.log(3, "%s", "000");
            try {
                BaseMfiEventCallback stopOnline = Card.this.mMfiClientAccess.stopOnline();
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

        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        public void onSuccess(CardInfo cardInfo, CardInfo cardInfo2) {
            Card card;
            LogMgr.log(3, "%s", "000");
            BaseMfiEventCallback baseMfiEventCallback = null;
            Card card2 = null;
            try {
                BaseMfiEventCallback stopOnline = Card.this.mMfiClientAccess.stopOnline();
                if (cardInfo != null) {
                    try {
                        LogMgr.log(6, "%s", "001");
                        card = new Card(cardInfo, Card.this.mMfiClientAccess);
                    } catch (Exception e) {
                        e = e;
                        baseMfiEventCallback = stopOnline;
                        LogMgr.log(1, "%s %s", "800", e.getMessage());
                        if (baseMfiEventCallback != null) {
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                } else {
                    card = null;
                }
                if (cardInfo2 != null) {
                    LogMgr.log(6, "%s", "002");
                    card2 = new Card(cardInfo2, Card.this.mMfiClientAccess);
                }
                if (stopOnline != null) {
                    if (stopOnline instanceof CardEnableEventCallback) {
                        LogMgr.log(6, "%s", "003");
                        try {
                            ((CardEnableEventCallback) stopOnline).onSuccess(card, card2);
                        } catch (Exception e2) {
                            LogMgr.log(2, "%s %s", "700", e2.getMessage());
                        }
                        LogMgr.log(3, "%s", "999");
                    }
                }
                LogMgr.log(6, "%s", "004");
            } catch (Exception e3) {
                e = e3;
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

    public Card(CardInfo cardInfo, MfiClientAccess mfiClientAccess) {
        LogMgr.log(7, "%s", "000");
        this.mCardInfo = cardInfo;
        this.mMfiClientAccess = mfiClientAccess;
        LogMgr.log(7, "%s", "999");
    }

    public synchronized void delete(String str, CardDeleteEventCallback cardDeleteEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (str == null) {
            LogMgr.log(2, "%s linkageData is null.", "700");
            throw new IllegalArgumentException("The specified LinkageData is null or invalid.");
        } else if (str.isEmpty()) {
            LogMgr.log(2, "%s linkageData is empty.", "701");
            throw new IllegalArgumentException("The specified LinkageData is null or invalid.");
        } else if (cardDeleteEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.startOnline(cardDeleteEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().delete(this.mCardInfo, str, new LocalICardDeleteEventCallback()));
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

    public synchronized void disable(CardDisableEventCallback cardDisableEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (cardDisableEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.startOnline(cardDisableEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().disable(this.mCardInfo, new LocalICardDisableEventCallback()));
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

    public synchronized void enable(CardEnableEventCallback cardEnableEventCallback) {
        LogMgr.log(3, "%s", "000");
        if (cardEnableEventCallback != null) {
            this.mMfiClientAccess.checkActivated();
            this.mMfiClientAccess.startOnline(cardEnableEventCallback);
            try {
                MfiUtil.checkMfcResult(this.mMfiClientAccess.getIMfiFelica().enable(this.mCardInfo, new LocalICardEnableEventCallback()));
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

    public CardInfo getCardInfo() {
        return this.mCardInfo;
    }
}
