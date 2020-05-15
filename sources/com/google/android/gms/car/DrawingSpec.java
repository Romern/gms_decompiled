package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrawingSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nqa();

    /* renamed from: a */
    public int f29402a;

    /* renamed from: b */
    public int f29403b;

    /* renamed from: c */
    public int f29404c;

    /* renamed from: d */
    public Surface f29405d;

    /* renamed from: e */
    public Rect f29406e;

    public DrawingSpec(int i, int i2, int i3, Surface surface, Rect rect) {
        this.f29402a = i;
        this.f29403b = i2;
        this.f29404c = i3;
        this.f29405d = surface;
        this.f29406e = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29402a);
        see.m35063b(parcel, 2, this.f29403b);
        see.m35063b(parcel, 3, this.f29404c);
        see.m35040a(parcel, 4, this.f29405d, i, false);
        see.m35040a(parcel, 5, this.f29406e, i, false);
        see.m35062b(parcel, a);
    }
}
