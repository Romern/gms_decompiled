package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);
    
    public static final Parcelable.Creator CREATOR = new xyc();

    /* renamed from: g */
    public final int f31907g;

    static {
        ErrorCode.class.getSimpleName();
    }

    private ErrorCode(int i) {
        this.f31907g = i;
    }

    /* renamed from: a */
    public static ErrorCode m23582a(int i) {
        ErrorCode[] values = values();
        for (ErrorCode errorCode : values) {
            if (i == errorCode.f31907g) {
                return errorCode;
            }
        }
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(i);
        return OTHER_ERROR;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31907g);
    }
}
