package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ValueChangedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vkm();

    /* renamed from: a */
    final int f31180a;

    public ValueChangedDetails(int i) {
        this.f31180a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f31180a);
        see.m35062b(parcel, a);
    }
}
