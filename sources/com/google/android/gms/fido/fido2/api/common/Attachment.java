package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator CREATOR = new xot();

    /* renamed from: c */
    public final String f31709c;

    private Attachment(String str) {
        this.f31709c = str;
    }

    /* renamed from: a */
    public static Attachment m23443a(String str) {
        Attachment[] values = values();
        for (Attachment attachment : values) {
            if (str.equals(attachment.f31709c)) {
                return attachment;
            }
        }
        throw new xou(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f31709c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709c);
    }
}
