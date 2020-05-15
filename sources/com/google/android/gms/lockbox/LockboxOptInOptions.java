package com.google.android.gms.lockbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeyn();

    /* renamed from: a */
    public int f79793a;

    /* renamed from: b */
    public int f79794b;

    public LockboxOptInOptions(int i, int i2) {
        this.f79793a = i;
        this.f79794b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f79793a);
        see.m35063b(parcel, 3, this.f79794b);
        see.m35062b(parcel, a);
    }
}
