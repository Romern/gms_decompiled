package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new guf();

    /* renamed from: a */
    final int f10072a;

    /* renamed from: b */
    public boolean f10073b;

    /* renamed from: c */
    public long f10074c;

    /* renamed from: d */
    public final boolean f10075d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f10072a = i;
        this.f10073b = z;
        this.f10074c = j;
        this.f10075d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10072a);
        see.m35051a(parcel, 2, this.f10073b);
        see.m35036a(parcel, 3, this.f10074c);
        see.m35051a(parcel, 4, this.f10075d);
        see.m35062b(parcel, a);
    }
}
