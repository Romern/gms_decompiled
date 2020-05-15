package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new slt();

    /* renamed from: a */
    public final int f30356a;

    /* renamed from: b */
    public final long f30357b;

    /* renamed from: c */
    public int f30358c;

    /* renamed from: d */
    public final String f30359d;

    /* renamed from: e */
    public final String f30360e;

    /* renamed from: f */
    public final String f30361f;

    /* renamed from: g */
    public final int f30362g;

    /* renamed from: h */
    public final List f30363h;

    /* renamed from: i */
    public final String f30364i;

    /* renamed from: j */
    public final long f30365j;

    /* renamed from: k */
    public int f30366k;

    /* renamed from: l */
    public final String f30367l;

    /* renamed from: m */
    public final float f30368m;

    /* renamed from: n */
    public final long f30369n;

    /* renamed from: o */
    public final boolean f30370o;

    /* renamed from: p */
    public long f30371p;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f30356a = i;
        this.f30357b = j;
        this.f30358c = i2;
        this.f30359d = str;
        this.f30360e = str3;
        this.f30361f = str5;
        this.f30362g = i3;
        this.f30371p = -1;
        this.f30363h = list;
        this.f30364i = str2;
        this.f30365j = j2;
        this.f30366k = i4;
        this.f30367l = str4;
        this.f30368m = f;
        this.f30369n = j3;
        this.f30370o = z;
    }

    /* renamed from: a */
    public final long mo17890a() {
        return this.f30357b;
    }

    /* renamed from: b */
    public final int mo17891b() {
        return this.f30358c;
    }

    /* renamed from: c */
    public final long mo17892c() {
        return this.f30371p;
    }

    /* renamed from: d */
    public final String mo17893d() {
        String str;
        String str2 = this.f30359d;
        int i = this.f30362g;
        List list = this.f30363h;
        String str3 = "";
        if (list != null) {
            str = TextUtils.join(",", list);
        } else {
            str = str3;
        }
        int i2 = this.f30366k;
        String str4 = this.f30360e;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f30367l;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f30368m;
        String str6 = this.f30361f;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f30370o;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str).length();
        int length3 = str4.length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + length3 + str5.length() + str3.length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public WakeLockEvent(long j, int i, String str, int i2, List list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30356a);
        see.m35036a(parcel, 2, this.f30357b);
        see.m35046a(parcel, 4, this.f30359d, false);
        see.m35063b(parcel, 5, this.f30362g);
        see.m35065b(parcel, 6, this.f30363h, false);
        see.m35036a(parcel, 8, this.f30365j);
        see.m35046a(parcel, 10, this.f30360e, false);
        see.m35063b(parcel, 11, this.f30358c);
        see.m35046a(parcel, 12, this.f30364i, false);
        see.m35046a(parcel, 13, this.f30367l, false);
        see.m35063b(parcel, 14, this.f30366k);
        see.m35034a(parcel, 15, this.f30368m);
        see.m35036a(parcel, 16, this.f30369n);
        see.m35046a(parcel, 17, this.f30361f, false);
        see.m35051a(parcel, 18, this.f30370o);
        see.m35062b(parcel, a);
    }
}
