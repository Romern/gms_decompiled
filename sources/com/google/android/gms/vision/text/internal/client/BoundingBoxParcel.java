package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avzw();

    /* renamed from: a */
    public final int f109732a;

    /* renamed from: b */
    public final int f109733b;

    /* renamed from: c */
    public final int f109734c;

    /* renamed from: d */
    public final int f109735d;

    /* renamed from: e */
    public final float f109736e;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.f109732a = i;
        this.f109733b = i2;
        this.f109734c = i3;
        this.f109735d = i4;
        this.f109736e = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109732a);
        see.m35063b(parcel, 3, this.f109733b);
        see.m35063b(parcel, 4, this.f109734c);
        see.m35063b(parcel, 5, this.f109735d);
        see.m35034a(parcel, 6, this.f109736e);
        see.m35062b(parcel, a);
    }
}
