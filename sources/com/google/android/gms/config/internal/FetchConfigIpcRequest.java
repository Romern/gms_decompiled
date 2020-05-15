package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new swu();

    /* renamed from: a */
    public final String f30448a;

    /* renamed from: b */
    public final long f30449b;

    /* renamed from: c */
    public final DataHolder f30450c;

    /* renamed from: d */
    public final String f30451d;

    /* renamed from: e */
    public final String f30452e;

    /* renamed from: f */
    public final String f30453f;

    /* renamed from: g */
    public final List f30454g;

    /* renamed from: h */
    public final int f30455h;

    /* renamed from: i */
    public final List f30456i;

    /* renamed from: j */
    public final int f30457j;

    /* renamed from: k */
    public final int f30458k;

    public FetchConfigIpcRequest(String str) {
        this(str, 43200, null, null, null, null, null, 0, null, -1, -1);
    }

    public FetchConfigIpcRequest(String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List list, int i, List list2, int i2, int i3) {
        this.f30448a = str;
        this.f30449b = j;
        this.f30450c = dataHolder;
        this.f30451d = str2;
        this.f30452e = str3;
        this.f30453f = str4;
        this.f30454g = list;
        this.f30455h = i;
        this.f30456i = list2;
        this.f30457j = i2;
        this.f30458k = i3;
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
        see.m35046a(parcel, 2, this.f30448a, false);
        see.m35036a(parcel, 3, this.f30449b);
        see.m35040a(parcel, 4, this.f30450c, i, false);
        see.m35046a(parcel, 5, this.f30451d, false);
        see.m35046a(parcel, 6, this.f30452e, false);
        see.m35046a(parcel, 7, this.f30453f, false);
        see.m35065b(parcel, 8, this.f30454g, false);
        see.m35063b(parcel, 9, this.f30455h);
        see.m35066c(parcel, 10, this.f30456i, false);
        see.m35063b(parcel, 11, this.f30457j);
        see.m35063b(parcel, 12, this.f30458k);
        see.m35062b(parcel, a);
    }
}
