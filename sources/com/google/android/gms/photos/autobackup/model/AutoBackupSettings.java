package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoBackupSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anjy();

    /* renamed from: a */
    public final int f82164a;

    /* renamed from: b */
    public String f82165b;

    /* renamed from: c */
    public boolean f82166c;

    /* renamed from: d */
    public boolean f82167d;

    /* renamed from: e */
    public boolean f82168e;

    /* renamed from: f */
    public boolean f82169f;

    /* renamed from: g */
    public boolean f82170g;

    /* renamed from: h */
    public boolean f82171h;

    /* renamed from: i */
    public boolean f82172i;

    /* renamed from: j */
    public boolean f82173j;

    /* renamed from: k */
    public UserQuota f82174k;

    public AutoBackupSettings() {
        this.f82164a = 1;
    }

    public AutoBackupSettings(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, UserQuota userQuota) {
        this.f82164a = i;
        this.f82165b = str;
        this.f82166c = z;
        this.f82167d = z2;
        this.f82168e = z3;
        this.f82169f = z4;
        this.f82170g = z5;
        this.f82171h = z6;
        this.f82172i = z7;
        this.f82173j = z8;
        this.f82174k = userQuota;
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
        see.m35063b(parcel, 1, this.f82164a);
        see.m35046a(parcel, 2, this.f82165b, false);
        see.m35051a(parcel, 3, this.f82166c);
        see.m35051a(parcel, 4, this.f82167d);
        see.m35051a(parcel, 5, this.f82168e);
        see.m35051a(parcel, 6, this.f82169f);
        see.m35051a(parcel, 7, this.f82170g);
        see.m35051a(parcel, 8, this.f82171h);
        see.m35051a(parcel, 9, this.f82172i);
        see.m35051a(parcel, 10, this.f82173j);
        see.m35040a(parcel, 11, this.f82174k, i, false);
        see.m35062b(parcel, a);
    }
}
