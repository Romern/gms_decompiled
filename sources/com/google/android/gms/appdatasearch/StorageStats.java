package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fss();

    /* renamed from: a */
    public final RegisteredPackageInfo[] f9687a;

    /* renamed from: b */
    public final long f9688b;

    /* renamed from: c */
    public final long f9689c;

    /* renamed from: d */
    public final long f9690d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.f9687a = registeredPackageInfoArr;
        this.f9688b = j;
        this.f9689c = j2;
        this.f9690d = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f9687a, i);
        see.m35036a(parcel, 2, this.f9688b);
        see.m35036a(parcel, 3, this.f9689c);
        see.m35036a(parcel, 4, this.f9690d);
        see.m35062b(parcel, a);
    }
}
