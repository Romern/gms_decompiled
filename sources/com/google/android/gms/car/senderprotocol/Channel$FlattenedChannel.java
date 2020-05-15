package com.google.android.gms.car.senderprotocol;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Channel$FlattenedChannel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ofy();

    /* renamed from: a */
    public static Channel$FlattenedChannel m22093a(int i, int i2, int i3, olk olk) {
        return new AutoValue_Channel_FlattenedChannel(i, i2, i3, olk);
    }

    /* renamed from: a */
    public abstract int mo17384a();

    /* renamed from: b */
    public abstract int mo17385b();

    /* renamed from: c */
    public abstract int mo17386c();

    /* renamed from: d */
    public abstract olk mo17387d();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo17384a());
        parcel.writeInt(mo17385b());
        parcel.writeInt(mo17386c());
        parcel.writeString(mo17387d().name());
    }
}
