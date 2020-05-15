package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadRemindersOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aosb();

    /* renamed from: a */
    public final List f107037a;

    /* renamed from: b */
    public final List f107038b;

    /* renamed from: c */
    public final Long f107039c;

    /* renamed from: d */
    public final Long f107040d;

    /* renamed from: e */
    public final Long f107041e;

    /* renamed from: f */
    public final Long f107042f;

    /* renamed from: g */
    public final boolean f107043g;

    /* renamed from: h */
    public final int f107044h;

    /* renamed from: i */
    public final boolean f107045i;

    /* renamed from: j */
    public final boolean f107046j;

    /* renamed from: k */
    public final int f107047k;

    /* renamed from: l */
    public final int f107048l;

    /* renamed from: m */
    public final List f107049m;

    /* renamed from: n */
    public final Long f107050n;

    /* renamed from: o */
    public final Long f107051o;

    static {
        new LoadRemindersOptions(null, null, null, null, null, null, false, 0, false, false, -1, 0, null, null, null);
    }

    public LoadRemindersOptions(List list, List list2, Long l, Long l2, Long l3, Long l4, boolean z, int i, boolean z2, boolean z3, int i2, int i3, List list3, Long l5, Long l6) {
        this.f107037a = list;
        this.f107038b = list2;
        this.f107039c = l;
        this.f107040d = l2;
        this.f107041e = l3;
        this.f107042f = l4;
        this.f107043g = z;
        this.f107044h = i;
        this.f107045i = z2;
        this.f107046j = z3;
        this.f107047k = i2;
        this.f107048l = i3;
        this.f107049m = list3;
        this.f107050n = l5;
        this.f107051o = l6;
    }

    /* renamed from: a */
    public final boolean mo58602a(int i, int i2) {
        return (i & (1 << i2)) != 0;
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
        see.m35065b(parcel, 3, this.f107037a, false);
        see.m35049a(parcel, 4, this.f107038b, false);
        see.m35045a(parcel, 5, this.f107039c);
        see.m35045a(parcel, 6, this.f107040d);
        see.m35045a(parcel, 7, this.f107041e);
        see.m35045a(parcel, 8, this.f107042f);
        see.m35051a(parcel, 9, this.f107043g);
        see.m35063b(parcel, 10, this.f107044h);
        see.m35051a(parcel, 11, this.f107045i);
        see.m35051a(parcel, 12, this.f107046j);
        see.m35063b(parcel, 13, this.f107047k);
        see.m35063b(parcel, 14, this.f107048l);
        see.m35065b(parcel, 15, this.f107049m, false);
        see.m35045a(parcel, 16, this.f107050n);
        see.m35045a(parcel, 17, this.f107051o);
        see.m35062b(parcel, a);
    }
}
