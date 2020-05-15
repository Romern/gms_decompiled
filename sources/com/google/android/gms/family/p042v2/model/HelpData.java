package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.family.v2.model.HelpData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HelpData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wqr();

    /* renamed from: a */
    public String f31451a;

    /* renamed from: b */
    public String f31452b;

    public HelpData(Parcel parcel) {
        this.f31451a = parcel.readString();
        this.f31452b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31451a);
        parcel.writeString(this.f31452b);
    }

    public HelpData(breb breb) {
        this.f31451a = breb.f142587c;
        this.f31452b = breb.f142586b;
    }
}
