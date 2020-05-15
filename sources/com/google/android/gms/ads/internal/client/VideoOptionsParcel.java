package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0354u();

    /* renamed from: a */
    public final boolean f8156a;

    /* renamed from: b */
    public final boolean f8157b;

    /* renamed from: c */
    public final boolean f8158c;

    public VideoOptionsParcel(boolean z, boolean z2, boolean z3) {
        this.f8156a = z;
        this.f8157b = z2;
        this.f8158c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f8156a);
        see.m35051a(parcel, 3, this.f8157b);
        see.m35051a(parcel, 4, this.f8158c);
        see.m35062b(parcel, a);
    }
}
