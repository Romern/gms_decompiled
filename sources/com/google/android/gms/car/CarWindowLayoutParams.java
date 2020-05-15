package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarWindowLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ntl();

    /* renamed from: a */
    public final int f29379a;

    /* renamed from: b */
    public final int f29380b;

    /* renamed from: c */
    public final int f29381c;

    /* renamed from: d */
    public final int f29382d;

    /* renamed from: e */
    public final int f29383e;

    /* renamed from: f */
    public final int f29384f;

    /* renamed from: g */
    public final int f29385g;

    /* renamed from: h */
    public final int f29386h;

    /* renamed from: i */
    public final int f29387i;

    /* renamed from: j */
    public final int f29388j;

    /* renamed from: k */
    public final int f29389k;

    /* renamed from: l */
    public final int f29390l;

    /* renamed from: m */
    public final boolean f29391m;

    /* renamed from: n */
    public final int f29392n;

    /* renamed from: o */
    public final int f29393o;

    /* renamed from: p */
    public final int f29394p;

    /* renamed from: q */
    public final Rect f29395q;

    public CarWindowLayoutParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13, int i14, int i15, Rect rect) {
        this.f29379a = i;
        this.f29380b = i2;
        this.f29381c = i3;
        this.f29382d = i4;
        this.f29383e = i5;
        this.f29384f = i6;
        this.f29385g = i7;
        this.f29386h = i8;
        this.f29387i = i9;
        this.f29388j = i10;
        this.f29389k = i11;
        this.f29390l = i12;
        this.f29391m = z;
        this.f29392n = i13;
        this.f29393o = i14;
        this.f29394p = i15;
        this.f29395q = rect;
    }

    public final String toString() {
        int i = this.f29379a;
        int i2 = this.f29380b;
        int i3 = this.f29381c;
        int i4 = this.f29382d;
        int i5 = this.f29383e;
        int i6 = this.f29384f;
        int i7 = this.f29385g;
        int i8 = this.f29386h;
        int i9 = this.f29387i;
        int i10 = this.f29388j;
        int i11 = this.f29389k;
        int i12 = this.f29390l;
        boolean z = this.f29391m;
        int i13 = this.f29392n;
        int i14 = this.f29393o;
        int i15 = this.f29394p;
        String valueOf = String.valueOf(this.f29395q);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 386);
        sb.append("CarWindowLayoutParams{versionCode=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", leftMargin=");
        sb.append(i4);
        sb.append(", topMargin=");
        sb.append(i5);
        sb.append(", rightMargin=");
        sb.append(i6);
        sb.append(", bottomMargin=");
        sb.append(i7);
        sb.append(", gravity=");
        sb.append(i8);
        sb.append(", z=");
        sb.append(i9);
        sb.append(", inAnimRes=");
        sb.append(i10);
        sb.append(", outAnimRes=");
        sb.append(i11);
        sb.append(", shadowType=");
        sb.append(i12);
        sb.append(", alpha=");
        sb.append(z);
        sb.append(", focusFlags=");
        sb.append(i13);
        sb.append(", themeRes=");
        sb.append(i14);
        sb.append(", shadowHeightDp=");
        sb.append(i15);
        sb.append(", insets=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29380b);
        see.m35063b(parcel, 2, this.f29381c);
        see.m35063b(parcel, 3, this.f29382d);
        see.m35063b(parcel, 4, this.f29383e);
        see.m35063b(parcel, 5, this.f29384f);
        see.m35063b(parcel, 6, this.f29385g);
        see.m35063b(parcel, 7, this.f29386h);
        see.m35063b(parcel, 8, this.f29387i);
        see.m35063b(parcel, 9, this.f29388j);
        see.m35063b(parcel, 10, this.f29389k);
        see.m35063b(parcel, 11, this.f29390l);
        see.m35051a(parcel, 12, this.f29391m);
        see.m35063b(parcel, 13, this.f29392n);
        see.m35063b(parcel, 14, this.f29393o);
        see.m35063b(parcel, 15, this.f29394p);
        see.m35040a(parcel, 16, this.f29395q, i, false);
        see.m35063b(parcel, 1000, this.f29379a);
        see.m35062b(parcel, a);
    }
}
