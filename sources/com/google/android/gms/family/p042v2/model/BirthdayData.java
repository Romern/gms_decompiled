package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.BirthdayData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BirthdayData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wql();

    /* renamed from: a */
    public int f31427a;

    /* renamed from: b */
    public int f31428b;

    public BirthdayData() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31427a);
        parcel.writeInt(this.f31428b);
    }

    public BirthdayData(Parcel parcel) {
        this.f31427a = parcel.readInt();
        this.f31428b = parcel.readInt();
    }
}
