package com.google.android.libraries.photos.restore.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StatusResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bebe();

    /* renamed from: a */
    public final bebf f111412a;

    /* renamed from: b */
    private final String f111413b;

    /* renamed from: c */
    private final int f111414c;

    /* renamed from: d */
    private final int f111415d;

    /* renamed from: e */
    private final String f111416e;

    public StatusResult(Parcel parcel) {
        this.f111413b = parcel.readString();
        this.f111414c = parcel.readInt();
        this.f111415d = parcel.readInt();
        this.f111412a = bebf.m91712a(parcel.readString());
        this.f111416e = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111413b);
        parcel.writeInt(this.f111414c);
        parcel.writeInt(this.f111415d);
        parcel.writeString(this.f111412a.name());
        parcel.writeString(this.f111416e);
    }
}
