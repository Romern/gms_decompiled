package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.UnsupportedEncodingException;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator CREATOR = new xyf();

    /* renamed from: d */
    public final String f31918d;

    private ProtocolVersion(String str) {
        this.f31918d = str;
    }

    /* renamed from: a */
    public static ProtocolVersion m23585a(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        ProtocolVersion[] values = values();
        for (ProtocolVersion protocolVersion : values) {
            if (str.equals(protocolVersion.f31918d)) {
                return protocolVersion;
            }
        }
        throw new xyg(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31918d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31918d);
    }

    /* renamed from: a */
    public static ProtocolVersion m23586a(byte[] bArr) {
        try {
            return m23585a(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
