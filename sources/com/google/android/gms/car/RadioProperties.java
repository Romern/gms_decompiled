package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RadioProperties extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nvl();

    /* renamed from: a */
    public int f29414a;

    /* renamed from: b */
    public int f29415b;

    /* renamed from: c */
    public List f29416c;

    /* renamed from: d */
    public List f29417d;

    /* renamed from: e */
    public int f29418e;

    /* renamed from: f */
    public boolean f29419f;

    /* renamed from: g */
    public int f29420g;

    /* renamed from: h */
    public int f29421h;

    /* renamed from: i */
    public boolean f29422i;

    /* renamed from: j */
    public boolean f29423j;

    /* renamed from: k */
    public int f29424k;

    /* renamed from: l */
    public boolean f29425l;

    /* renamed from: m */
    public boolean f29426m;

    /* renamed from: n */
    public int f29427n;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ChannelRange extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new npo();

        /* renamed from: a */
        public int f29428a;

        /* renamed from: b */
        public int f29429b;

        public ChannelRange(int i, int i2) {
            this.f29428a = i;
            this.f29429b = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f29428a);
            see.m35063b(parcel, 2, this.f29429b);
            see.m35062b(parcel, a);
        }
    }

    public RadioProperties(int i, int i2, List list, List list2, int i3, boolean z, int i4, int i5, boolean z2, boolean z3, int i6, boolean z4, boolean z5, int i7) {
        this.f29414a = i;
        this.f29415b = i2;
        this.f29416c = list;
        this.f29417d = list2;
        this.f29418e = i3;
        this.f29419f = z;
        this.f29420g = i4;
        this.f29421h = i5;
        this.f29422i = z2;
        this.f29423j = z3;
        this.f29424k = i6;
        this.f29425l = z4;
        this.f29426m = z5;
        this.f29427n = i7;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29414a);
        see.m35063b(parcel, 2, this.f29415b);
        see.m35066c(parcel, 3, this.f29416c, false);
        see.m35049a(parcel, 4, this.f29417d, false);
        see.m35063b(parcel, 5, this.f29418e);
        see.m35051a(parcel, 6, this.f29419f);
        see.m35063b(parcel, 7, this.f29420g);
        see.m35063b(parcel, 8, this.f29421h);
        see.m35051a(parcel, 9, this.f29422i);
        see.m35051a(parcel, 10, this.f29423j);
        see.m35063b(parcel, 11, this.f29424k);
        see.m35051a(parcel, 12, this.f29425l);
        see.m35051a(parcel, 13, this.f29426m);
        see.m35063b(parcel, 14, this.f29427n);
        see.m35062b(parcel, a);
    }
}
