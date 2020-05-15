package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReplaySignal implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aemk();

    /* renamed from: a */
    private final Class f79498a;

    /* renamed from: b */
    private final Parcelable f79499b;

    /* renamed from: c */
    private final long f79500c;

    public ReplaySignal(Parcelable parcelable, long j, Class cls) {
        this.f79499b = parcelable;
        this.f79500c = j;
        this.f79498a = cls;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f79498a);
        parcel.writeParcelable(this.f79499b, 0);
        parcel.writeLong(this.f79500c);
    }
}
