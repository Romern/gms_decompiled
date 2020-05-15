package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator CREATOR = new xov();

    /* renamed from: d */
    public final String f31714d;

    private AttestationConveyancePreference(String str) {
        this.f31714d = str;
    }

    /* renamed from: a */
    public static AttestationConveyancePreference m23444a(String str) {
        AttestationConveyancePreference[] values = values();
        for (AttestationConveyancePreference attestationConveyancePreference : values) {
            if (str.equals(attestationConveyancePreference.f31714d)) {
                return attestationConveyancePreference;
            }
        }
        throw new xow(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31714d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31714d);
    }
}
