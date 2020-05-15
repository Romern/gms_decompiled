package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator CREATOR = new xps();

    /* renamed from: m */
    public final int f31755m;

    private ErrorCode(int i) {
        this.f31755m = i;
    }

    /* renamed from: a */
    public static ErrorCode m23473a(int i) {
        ErrorCode[] values = values();
        for (ErrorCode errorCode : values) {
            if (i == errorCode.f31755m) {
                return errorCode;
            }
        }
        throw new xpt(i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31755m);
    }
}
