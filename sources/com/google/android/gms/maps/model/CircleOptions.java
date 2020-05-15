package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afha();

    /* renamed from: a */
    public LatLng f79873a;

    /* renamed from: b */
    public double f79874b;

    /* renamed from: c */
    public float f79875c;

    /* renamed from: d */
    public int f79876d;

    /* renamed from: e */
    public int f79877e;

    /* renamed from: f */
    public float f79878f;

    /* renamed from: g */
    public boolean f79879g;

    /* renamed from: h */
    public boolean f79880h;

    /* renamed from: i */
    public List f79881i;

    public CircleOptions() {
        this.f79873a = null;
        this.f79874b = 0.0d;
        this.f79875c = 10.0f;
        this.f79876d = -16777216;
        this.f79877e = 0;
        this.f79878f = 0.0f;
        this.f79879g = true;
        this.f79880h = false;
        this.f79881i = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79873a, i, false);
        see.m35033a(parcel, 3, this.f79874b);
        see.m35034a(parcel, 4, this.f79875c);
        see.m35063b(parcel, 5, this.f79876d);
        see.m35063b(parcel, 6, this.f79877e);
        see.m35034a(parcel, 7, this.f79878f);
        see.m35051a(parcel, 8, this.f79879g);
        see.m35051a(parcel, 9, this.f79880h);
        see.m35066c(parcel, 10, this.f79881i, false);
        see.m35062b(parcel, a);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.f79873a = latLng;
        this.f79874b = d;
        this.f79875c = f;
        this.f79876d = i;
        this.f79877e = i2;
        this.f79878f = f2;
        this.f79879g = z;
        this.f79880h = z2;
        this.f79881i = list;
    }
}
