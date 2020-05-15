package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DomainUtils$DomainParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kcw();

    /* renamed from: a */
    public final kcv f11612a;

    public DomainUtils$DomainParcel(kcv kcv) {
        bmxy.m108581a(kcv);
        this.f11612a = kcv;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        kcx.m17655a(this.f11612a, parcel);
    }
}
