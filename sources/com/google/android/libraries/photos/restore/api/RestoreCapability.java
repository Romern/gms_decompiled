package com.google.android.libraries.photos.restore.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RestoreCapability implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bebd();

    /* renamed from: a */
    public final boolean f111408a;

    /* renamed from: b */
    private final int f111409b;

    /* renamed from: c */
    private final long f111410c;

    /* renamed from: d */
    private final boolean f111411d;

    public RestoreCapability(Parcel parcel) {
        this.f111408a = beei.m91849a(parcel);
        this.f111409b = parcel.readInt();
        this.f111410c = parcel.readLong();
        this.f111411d = beei.m91849a(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111408a ? 1 : 0);
        parcel.writeInt(this.f111409b);
        parcel.writeLong(this.f111410c);
        parcel.writeInt(this.f111411d ? 1 : 0);
    }
}
