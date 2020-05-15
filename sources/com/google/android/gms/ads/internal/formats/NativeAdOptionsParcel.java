package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0413a();

    /* renamed from: a */
    public final int f8372a;

    /* renamed from: b */
    public final boolean f8373b;

    /* renamed from: c */
    public final int f8374c;

    /* renamed from: d */
    public final boolean f8375d;

    /* renamed from: e */
    public final int f8376e;

    /* renamed from: f */
    public final VideoOptionsParcel f8377f;

    /* renamed from: g */
    public final boolean f8378g;

    /* renamed from: h */
    public final int f8379h;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel, boolean z3, int i4) {
        this.f8372a = i;
        this.f8373b = z;
        this.f8374c = i2;
        this.f8375d = z2;
        this.f8376e = i3;
        this.f8377f = videoOptionsParcel;
        this.f8378g = z3;
        this.f8379h = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f8372a);
        see.m35051a(parcel, 2, this.f8373b);
        see.m35063b(parcel, 3, this.f8374c);
        see.m35051a(parcel, 4, this.f8375d);
        see.m35063b(parcel, 5, this.f8376e);
        see.m35040a(parcel, 6, this.f8377f, i, false);
        see.m35051a(parcel, 7, this.f8378g);
        see.m35063b(parcel, 8, this.f8379h);
        see.m35062b(parcel, a);
    }
}
