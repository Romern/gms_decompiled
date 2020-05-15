package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveHarmfulAppData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apfm();

    /* renamed from: a */
    public final int f107323a;

    /* renamed from: b */
    public final boolean f107324b;

    public RemoveHarmfulAppData(int i, boolean z) {
        this.f107323a = i;
        this.f107324b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f107323a);
        see.m35051a(parcel, 3, this.f107324b);
        see.m35062b(parcel, a);
    }
}
