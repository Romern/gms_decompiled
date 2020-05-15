package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new apmz();

    /* renamed from: a */
    public Status f107377a;

    /* renamed from: b */
    public GetStorageStatsCall$PackageStats[] f107378b;

    /* renamed from: c */
    public long f107379c;

    /* renamed from: d */
    public long f107380d;

    /* renamed from: e */
    public long f107381e;

    public GetStorageStatsCall$Response() {
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f107377a;
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.f107377a = status;
        this.f107378b = getStorageStatsCall$PackageStatsArr;
        this.f107379c = j;
        this.f107380d = j2;
        this.f107381e = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f107377a, i, false);
        see.m35057a(parcel, 2, this.f107378b, i);
        see.m35036a(parcel, 3, this.f107379c);
        see.m35036a(parcel, 4, this.f107380d);
        see.m35036a(parcel, 5, this.f107381e);
        see.m35062b(parcel, a);
    }
}
