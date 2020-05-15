package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UnlockFactoryResetProtectionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jee();

    /* renamed from: a */
    final int f10969a;

    /* renamed from: b */
    public final int f10970b;

    public UnlockFactoryResetProtectionResponse(int i) {
        this(1, i);
    }

    public UnlockFactoryResetProtectionResponse(int i, int i2) {
        this.f10969a = i;
        this.f10970b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10969a);
        see.m35063b(parcel, 2, this.f10970b);
        see.m35062b(parcel, a);
    }
}
