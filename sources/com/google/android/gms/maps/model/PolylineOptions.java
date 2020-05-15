package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhk();

    /* renamed from: a */
    public final List f79926a;

    /* renamed from: b */
    public float f79927b;

    /* renamed from: c */
    public int f79928c;

    /* renamed from: d */
    public float f79929d;

    /* renamed from: e */
    public boolean f79930e;

    /* renamed from: f */
    public boolean f79931f;

    /* renamed from: g */
    public boolean f79932g;

    /* renamed from: h */
    public Cap f79933h;

    /* renamed from: i */
    public Cap f79934i;

    /* renamed from: j */
    public int f79935j;

    /* renamed from: k */
    public List f79936k;

    public PolylineOptions() {
        this.f79927b = 10.0f;
        this.f79928c = -16777216;
        this.f79929d = 0.0f;
        this.f79930e = true;
        this.f79931f = false;
        this.f79932g = false;
        this.f79933h = new ButtCap();
        this.f79934i = new ButtCap();
        this.f79935j = 0;
        this.f79936k = null;
        this.f79926a = new ArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f79926a, false);
        see.m35034a(parcel, 3, this.f79927b);
        see.m35063b(parcel, 4, this.f79928c);
        see.m35034a(parcel, 5, this.f79929d);
        see.m35051a(parcel, 6, this.f79930e);
        see.m35051a(parcel, 7, this.f79931f);
        see.m35051a(parcel, 8, this.f79932g);
        see.m35040a(parcel, 9, this.f79933h, i, false);
        see.m35040a(parcel, 10, this.f79934i, i, false);
        see.m35063b(parcel, 11, this.f79935j);
        see.m35066c(parcel, 12, this.f79936k, false);
        see.m35062b(parcel, a);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2) {
        this.f79927b = 10.0f;
        this.f79928c = -16777216;
        this.f79929d = 0.0f;
        this.f79930e = true;
        this.f79931f = false;
        this.f79932g = false;
        this.f79933h = new ButtCap();
        this.f79934i = new ButtCap();
        this.f79926a = list;
        this.f79927b = f;
        this.f79928c = i;
        this.f79929d = f2;
        this.f79930e = z;
        this.f79931f = z2;
        this.f79932g = z3;
        if (cap != null) {
            this.f79933h = cap;
        }
        if (cap2 != null) {
            this.f79934i = cap2;
        }
        this.f79935j = i2;
        this.f79936k = list2;
    }
}
