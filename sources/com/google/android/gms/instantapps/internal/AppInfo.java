package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adfw();

    /* renamed from: a */
    public final String f79142a;

    /* renamed from: b */
    public final String f79143b;

    /* renamed from: c */
    public final List f79144c;

    /* renamed from: d */
    public final List f79145d;

    /* renamed from: e */
    public final int f79146e;

    /* renamed from: f */
    public final byte[] f79147f;

    /* renamed from: g */
    public final PackageInfo f79148g;

    /* renamed from: h */
    public final List f79149h;

    /* renamed from: i */
    public final byte[] f79150i;

    public AppInfo(String str, String str2, List list, List list2, List list3, int i, byte[] bArr, PackageInfo packageInfo, byte[] bArr2) {
        this.f79142a = str;
        this.f79143b = str2;
        this.f79144c = list;
        this.f79145d = list2;
        this.f79146e = i;
        this.f79147f = bArr;
        this.f79148g = packageInfo;
        this.f79149h = list3;
        this.f79150i = bArr2;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f79142a, false);
        see.m35046a(parcel, 3, this.f79143b, false);
        see.m35066c(parcel, 5, this.f79144c, false);
        see.m35066c(parcel, 6, this.f79145d, false);
        see.m35063b(parcel, 7, this.f79146e);
        see.m35052a(parcel, 8, this.f79147f, false);
        see.m35040a(parcel, 9, this.f79148g, i, false);
        see.m35066c(parcel, 11, this.f79149h, false);
        see.m35052a(parcel, 12, this.f79150i, false);
        see.m35062b(parcel, a);
    }
}
