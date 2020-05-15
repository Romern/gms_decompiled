package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum PublicKeyCredentialType implements Parcelable {
    PUBLIC_KEY;
    
    public static final Parcelable.Creator CREATOR = new xqf();

    /* renamed from: b */
    public final String f31794b;

    private PublicKeyCredentialType() {
        this.f31794b = r3;
    }

    /* renamed from: a */
    public static PublicKeyCredentialType m23491a(bypx bypx) {
        bmxy.m108581a(bypx);
        if (bypx instanceof bypv) {
            return m23492a(((bypv) bypx).f167363a);
        }
        throw new xqg("Cannot parse a credential type from non-textstring CBOR input");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31794b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31794b);
    }

    /* renamed from: a */
    public static PublicKeyCredentialType m23492a(String str) {
        PublicKeyCredentialType[] values = values();
        for (PublicKeyCredentialType publicKeyCredentialType : values) {
            if (str.equals(publicKeyCredentialType.f31794b)) {
                return publicKeyCredentialType;
            }
        }
        throw new xqg(String.format("PublicKeyCredentialType %s not supported", str));
    }
}
