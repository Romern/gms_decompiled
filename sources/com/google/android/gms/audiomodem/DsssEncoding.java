package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DsssEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdn();

    /* renamed from: a */
    public final int f9859a;

    /* renamed from: b */
    public final boolean f9860b;

    /* renamed from: c */
    public final boolean f9861c;

    /* renamed from: d */
    public final int f9862d;

    /* renamed from: e */
    public final int f9863e;

    /* renamed from: f */
    public final float f9864f;

    /* renamed from: g */
    public final int f9865g;

    /* renamed from: h */
    public final float f9866h;

    /* renamed from: i */
    public final int f9867i;

    /* renamed from: j */
    public final int f9868j;

    /* renamed from: k */
    public final int f9869k;

    /* renamed from: l */
    public final int f9870l;

    public DsssEncoding(int i, boolean z, boolean z2, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8) {
        this.f9859a = i;
        this.f9860b = z;
        this.f9861c = z2;
        this.f9862d = i2;
        this.f9863e = i3;
        this.f9864f = f;
        this.f9865g = i4;
        this.f9866h = f2;
        this.f9867i = i5;
        this.f9868j = i6;
        this.f9869k = i7;
        this.f9870l = i8;
    }

    /* renamed from: a */
    public final int mo7321a() {
        return this.f9859a + this.f9870l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DsssEncoding) {
            DsssEncoding dsssEncoding = (DsssEncoding) obj;
            return this.f9859a == dsssEncoding.f9859a && this.f9860b == dsssEncoding.f9860b && this.f9861c == dsssEncoding.f9861c && this.f9862d == dsssEncoding.f9862d && this.f9863e == dsssEncoding.f9863e && this.f9864f == dsssEncoding.f9864f && this.f9865g == dsssEncoding.f9865g && this.f9866h == dsssEncoding.f9866h && this.f9867i == dsssEncoding.f9867i && this.f9868j == dsssEncoding.f9868j && this.f9869k == dsssEncoding.f9869k && this.f9870l == dsssEncoding.f9870l;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9859a), Boolean.valueOf(this.f9860b), Boolean.valueOf(this.f9861c), Integer.valueOf(this.f9862d), Integer.valueOf(this.f9863e), Float.valueOf(this.f9864f), Integer.valueOf(this.f9865g), Float.valueOf(this.f9866h), Integer.valueOf(this.f9867i), Integer.valueOf(this.f9868j), Integer.valueOf(this.f9869k), Integer.valueOf(this.f9870l)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f9859a);
        see.m35051a(parcel, 3, this.f9860b);
        see.m35051a(parcel, 4, this.f9861c);
        see.m35063b(parcel, 5, this.f9862d);
        see.m35063b(parcel, 6, this.f9863e);
        see.m35034a(parcel, 7, this.f9864f);
        see.m35063b(parcel, 8, this.f9865g);
        see.m35034a(parcel, 9, this.f9866h);
        see.m35063b(parcel, 10, this.f9867i);
        see.m35063b(parcel, 11, this.f9868j);
        see.m35063b(parcel, 12, this.f9869k);
        see.m35063b(parcel, 13, this.f9870l);
        see.m35062b(parcel, a);
    }
}
