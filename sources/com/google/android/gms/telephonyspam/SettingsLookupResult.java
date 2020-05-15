package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsLookupResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new audc();

    /* renamed from: a */
    public final int f109034a;

    /* renamed from: b */
    public final boolean f109035b;

    public SettingsLookupResult(int i, boolean z) {
        this.f109034a = i;
        this.f109035b = z;
    }

    public SettingsLookupResult(boolean z) {
        this.f109034a = 1;
        this.f109035b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f109034a);
        see.m35051a(parcel, 2, this.f109035b);
        see.m35062b(parcel, a);
    }
}
