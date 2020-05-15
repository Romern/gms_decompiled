package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum UserVerificationRequirement implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator CREATOR = new xqq();

    /* renamed from: d */
    public final String f31811d;

    private UserVerificationRequirement(String str) {
        this.f31811d = str;
    }

    /* renamed from: a */
    public static UserVerificationRequirement m23501a(String str) {
        UserVerificationRequirement[] values = values();
        for (UserVerificationRequirement userVerificationRequirement : values) {
            if (str.equals(userVerificationRequirement.f31811d)) {
                return userVerificationRequirement;
            }
        }
        throw new xqr(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31811d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31811d);
    }
}
