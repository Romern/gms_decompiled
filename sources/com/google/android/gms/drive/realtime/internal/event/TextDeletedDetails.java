package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextDeletedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vkk();

    /* renamed from: a */
    final int f31176a;

    /* renamed from: b */
    final int f31177b;

    public TextDeletedDetails(int i, int i2) {
        this.f31176a = i;
        this.f31177b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f31176a);
        see.m35063b(parcel, 3, this.f31177b);
        see.m35062b(parcel, a);
    }
}
