package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemUpdateStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avlj();

    /* renamed from: A */
    public final boolean f109458A;

    /* renamed from: a */
    public final String f109459a;

    /* renamed from: b */
    public final boolean f109460b;

    /* renamed from: c */
    public final int f109461c;

    /* renamed from: d */
    public final int f109462d;

    /* renamed from: e */
    public final int f109463e;

    /* renamed from: f */
    public final double f109464f;

    /* renamed from: g */
    public final DownloadOptions f109465g;

    /* renamed from: h */
    public final InstallationOptions f109466h;

    /* renamed from: i */
    public final boolean f109467i;

    /* renamed from: j */
    public final boolean f109468j;

    /* renamed from: k */
    public final boolean f109469k;

    /* renamed from: l */
    public final boolean f109470l;

    /* renamed from: m */
    public final boolean f109471m;

    /* renamed from: n */
    public final long f109472n;

    /* renamed from: o */
    public final long f109473o;

    /* renamed from: p */
    public final long f109474p;

    /* renamed from: q */
    public final long f109475q;

    /* renamed from: r */
    public final ActivityStatus f109476r;

    /* renamed from: s */
    public final long f109477s;

    /* renamed from: t */
    public final String f109478t;

    /* renamed from: u */
    public final boolean f109479u;

    /* renamed from: v */
    public final long f109480v;

    /* renamed from: w */
    public final String f109481w;

    /* renamed from: x */
    public final UpdateDescription f109482x;

    /* renamed from: y */
    public final boolean f109483y;

    /* renamed from: z */
    public final boolean f109484z;

    public SystemUpdateStatus(String str, boolean z, int i, int i2, int i3, double d, DownloadOptions downloadOptions, InstallationOptions installationOptions, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, long j2, long j3, long j4, ActivityStatus activityStatus, long j5, String str2, boolean z7, long j6, String str3, UpdateDescription updateDescription, boolean z8, boolean z9, boolean z10) {
        this.f109459a = str;
        this.f109460b = z;
        this.f109461c = i;
        this.f109462d = i2;
        this.f109463e = i3;
        this.f109464f = d;
        this.f109465g = downloadOptions;
        this.f109466h = installationOptions;
        this.f109467i = z2;
        this.f109468j = z3;
        this.f109469k = z4;
        this.f109470l = z5;
        this.f109471m = z6;
        this.f109472n = j;
        this.f109473o = j2;
        this.f109474p = j3;
        this.f109475q = j4;
        this.f109476r = activityStatus;
        this.f109477s = j5;
        this.f109478t = str2;
        this.f109479u = z7;
        this.f109480v = j6;
        this.f109481w = str3;
        this.f109482x = updateDescription;
        this.f109483y = z8;
        this.f109484z = z9;
        this.f109458A = z10;
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
        see.m35046a(parcel, 1, this.f109459a, false);
        see.m35051a(parcel, 2, this.f109460b);
        see.m35063b(parcel, 3, this.f109461c);
        see.m35063b(parcel, 4, this.f109462d);
        see.m35063b(parcel, 5, this.f109463e);
        see.m35033a(parcel, 6, this.f109464f);
        see.m35040a(parcel, 7, this.f109465g, i, false);
        see.m35040a(parcel, 8, this.f109466h, i, false);
        see.m35051a(parcel, 9, this.f109467i);
        see.m35051a(parcel, 10, this.f109468j);
        see.m35051a(parcel, 11, this.f109469k);
        see.m35051a(parcel, 12, this.f109470l);
        see.m35051a(parcel, 13, this.f109471m);
        see.m35036a(parcel, 14, this.f109472n);
        see.m35036a(parcel, 15, this.f109473o);
        see.m35036a(parcel, 16, this.f109474p);
        see.m35036a(parcel, 17, this.f109475q);
        see.m35040a(parcel, 18, this.f109476r, i, false);
        see.m35036a(parcel, 19, this.f109477s);
        see.m35046a(parcel, 20, this.f109478t, false);
        see.m35051a(parcel, 21, this.f109479u);
        see.m35036a(parcel, 22, this.f109480v);
        see.m35046a(parcel, 23, this.f109481w, false);
        see.m35040a(parcel, 24, this.f109482x, i, false);
        see.m35051a(parcel, 25, this.f109483y);
        see.m35051a(parcel, 26, this.f109484z);
        see.m35051a(parcel, 27, this.f109458A);
        see.m35062b(parcel, a);
    }
}
