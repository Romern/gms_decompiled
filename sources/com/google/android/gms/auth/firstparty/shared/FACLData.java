package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new izd();

    /* renamed from: a */
    final int f10864a;

    /* renamed from: b */
    public FACLConfig f10865b;

    /* renamed from: c */
    public String f10866c;

    /* renamed from: d */
    public boolean f10867d;

    /* renamed from: e */
    String f10868e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.f10864a = i;
        this.f10865b = fACLConfig;
        this.f10866c = str;
        this.f10867d = z;
        this.f10868e = str2;
    }

    public FACLData(FACLConfig fACLConfig, String str, String str2, boolean z) {
        this.f10864a = 1;
        this.f10865b = fACLConfig;
        this.f10866c = str;
        this.f10868e = str2;
        this.f10867d = z;
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
        see.m35063b(parcel, 1, this.f10864a);
        see.m35040a(parcel, 2, this.f10865b, i, false);
        see.m35046a(parcel, 3, this.f10866c, false);
        see.m35051a(parcel, 4, this.f10867d);
        see.m35046a(parcel, 5, this.f10868e, false);
        see.m35062b(parcel, a);
    }
}
