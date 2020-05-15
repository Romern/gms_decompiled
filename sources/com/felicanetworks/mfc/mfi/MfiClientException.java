package com.felicanetworks.mfc.mfi;

import com.felicanetworks.mfc.FelicaException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MfiClientException extends FelicaException {
    public static final int ID_CARD_ISSUE_ERROR = 100;
    public static final int ID_CARD_OPERATION_ERROR = 102;
    public static final int ID_GET_ACCOUNT_ERROR = 101;
    public static final int TYPE_CARD_NOT_CACHED = 157;
    public static final int TYPE_ILLEGAL_CARD_OPERATION = 158;
    public static final int TYPE_ILLEGAL_LINKAGE_DATA = 155;
    public static final int TYPE_MFICLIENT_ALREADY_STARTED = 160;
    public static final int TYPE_MFICLIENT_CURRENTLY_ONLINE = 159;
    public static final int TYPE_MFICLIENT_NOT_ACTIVATED = 152;
    public static final int TYPE_MFICLIENT_NOT_FOUND = 151;
    public static final int TYPE_MFICLIENT_NOT_STARTED = 154;
    public static final int TYPE_MFICLIENT_REMOTE_ACCESS_FAILED = 150;
    public static final int TYPE_MFICLIENT_STARTED = 153;
    public static final int TYPE_NO_ACCOUNT_INFO = 156;

    public MfiClientException(int i, int i2, String str) {
        super(i, i2, str);
    }

    public MfiClientException(FelicaException felicaException) {
        super(felicaException.getID(), felicaException.getType(), felicaException.getStatusFlag1(), felicaException.getStatusFlag2());
    }
}
