package com.google.android.places.p095ui.autocomplete;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.places.ui.autocomplete.SessionLogger */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionLogger extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bile();

    /* renamed from: a */
    int f151414a;

    /* renamed from: b */
    int f151415b;

    /* renamed from: c */
    boolean f151416c;

    /* renamed from: d */
    public boolean f151417d;

    /* renamed from: e */
    boolean f151418e;

    /* renamed from: f */
    boolean f151419f;

    /* renamed from: g */
    public int f151420g;

    /* renamed from: h */
    int f151421h;

    /* renamed from: i */
    public int f151422i;

    /* renamed from: j */
    public int f151423j;

    /* renamed from: k */
    public String f151424k;

    /* renamed from: l */
    public int f151425l;

    /* renamed from: m */
    public int f151426m;

    /* renamed from: n */
    public boolean f151427n;

    /* renamed from: o */
    int f151428o;

    /* renamed from: p */
    long f151429p;

    public SessionLogger() {
        this.f151414a = 0;
        this.f151415b = -1;
        this.f151416c = false;
        this.f151417d = false;
        this.f151418e = false;
        this.f151419f = false;
        this.f151420g = -1;
        this.f151421h = 0;
        this.f151422i = 0;
        this.f151423j = 0;
        this.f151424k = null;
        this.f151425l = 0;
        this.f151426m = 0;
        this.f151427n = false;
        this.f151428o = 0;
        this.f151429p = -1;
    }

    /* renamed from: a */
    public final bpqe mo71317a() {
        return (bpqe) bmxv.m108567c(bpqe.m112171a(this.f151414a)).mo66812a(bpqe.UNKNOWN_ORIGIN);
    }

    /* renamed from: b */
    public final boolean mo71318b() {
        return this.f151429p != -1;
    }

    public SessionLogger(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, int i6, String str, int i7, int i8, boolean z5, int i9, long j) {
        this.f151414a = i;
        this.f151415b = i2;
        this.f151416c = z;
        this.f151417d = z2;
        this.f151418e = z3;
        this.f151419f = z4;
        this.f151420g = i3;
        this.f151421h = i4;
        this.f151422i = i5;
        this.f151423j = i6;
        this.f151424k = str;
        this.f151425l = i7;
        this.f151426m = i8;
        this.f151427n = z5;
        this.f151428o = i9;
        this.f151429p = j;
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
        see.m35063b(parcel, 1, this.f151414a);
        see.m35063b(parcel, 2, this.f151415b);
        see.m35051a(parcel, 3, this.f151416c);
        see.m35051a(parcel, 4, this.f151417d);
        see.m35051a(parcel, 5, this.f151418e);
        see.m35051a(parcel, 6, this.f151419f);
        see.m35063b(parcel, 7, this.f151420g);
        see.m35063b(parcel, 8, this.f151421h);
        see.m35063b(parcel, 9, this.f151422i);
        see.m35063b(parcel, 10, this.f151423j);
        see.m35046a(parcel, 11, this.f151424k, false);
        see.m35063b(parcel, 12, this.f151425l);
        see.m35063b(parcel, 13, this.f151426m);
        see.m35051a(parcel, 14, this.f151427n);
        see.m35063b(parcel, 15, this.f151428o);
        see.m35036a(parcel, 16, this.f151429p);
        see.m35062b(parcel, a);
    }
}
