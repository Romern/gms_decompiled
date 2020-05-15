package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhj();

    /* renamed from: a */
    public final List f79915a;

    /* renamed from: b */
    public final List f79916b;

    /* renamed from: c */
    public float f79917c;

    /* renamed from: d */
    public int f79918d;

    /* renamed from: e */
    public int f79919e;

    /* renamed from: f */
    public float f79920f;

    /* renamed from: g */
    public boolean f79921g;

    /* renamed from: h */
    public boolean f79922h;

    /* renamed from: i */
    public boolean f79923i;

    /* renamed from: j */
    public int f79924j;

    /* renamed from: k */
    public List f79925k;

    public PolygonOptions() {
        this.f79917c = 10.0f;
        this.f79918d = -16777216;
        this.f79919e = 0;
        this.f79920f = 0.0f;
        this.f79921g = true;
        this.f79922h = false;
        this.f79923i = false;
        this.f79924j = 0;
        this.f79925k = null;
        this.f79915a = new ArrayList();
        this.f79916b = new ArrayList();
    }

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.f79915a = list;
        this.f79916b = list2;
        this.f79917c = f;
        this.f79918d = i;
        this.f79919e = i2;
        this.f79920f = f2;
        this.f79921g = z;
        this.f79922h = z2;
        this.f79923i = z3;
        this.f79924j = i3;
        this.f79925k = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f79915a, false);
        see.m35048a(parcel, 3, this.f79916b);
        see.m35034a(parcel, 4, this.f79917c);
        see.m35063b(parcel, 5, this.f79918d);
        see.m35063b(parcel, 6, this.f79919e);
        see.m35034a(parcel, 7, this.f79920f);
        see.m35051a(parcel, 8, this.f79921g);
        see.m35051a(parcel, 9, this.f79922h);
        see.m35051a(parcel, 10, this.f79923i);
        see.m35063b(parcel, 11, this.f79924j);
        see.m35066c(parcel, 12, this.f79925k, false);
        see.m35062b(parcel, a);
    }
}
