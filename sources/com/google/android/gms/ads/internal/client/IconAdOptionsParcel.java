package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IconAdOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0351r();

    /* renamed from: a */
    public final int f8154a;

    public IconAdOptionsParcel(int i) {
        this.f8154a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f8154a);
        see.m35062b(parcel, a);
    }
}
