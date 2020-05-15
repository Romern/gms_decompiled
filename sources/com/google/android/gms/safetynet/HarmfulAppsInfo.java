package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HarmfulAppsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apfk();

    /* renamed from: a */
    public final long f107318a;

    /* renamed from: b */
    public final HarmfulAppsData[] f107319b;

    /* renamed from: c */
    public final int f107320c;

    /* renamed from: d */
    public final boolean f107321d;

    public HarmfulAppsInfo(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.f107318a = j;
        this.f107319b = harmfulAppsDataArr;
        this.f107321d = z;
        if (!z) {
            this.f107320c = -1;
        } else {
            this.f107320c = i;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f107318a);
        see.m35057a(parcel, 3, this.f107319b, i);
        see.m35063b(parcel, 4, this.f107320c);
        see.m35051a(parcel, 5, this.f107321d);
        see.m35062b(parcel, a);
    }
}
