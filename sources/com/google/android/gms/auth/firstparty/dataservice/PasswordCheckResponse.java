package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ixv();

    /* renamed from: a */
    final int f10680a;

    /* renamed from: b */
    String f10681b;

    /* renamed from: c */
    String f10682c;

    /* renamed from: d */
    String f10683d;

    public PasswordCheckResponse(int i, String str, String str2, String str3) {
        this.f10680a = i;
        this.f10681b = str;
        this.f10682c = str2;
        this.f10683d = str3;
    }

    public PasswordCheckResponse(izj izj) {
        this(izj, null, null);
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
        see.m35063b(parcel, 1, this.f10680a);
        see.m35046a(parcel, 2, this.f10681b, false);
        see.m35046a(parcel, 3, this.f10682c, false);
        see.m35046a(parcel, 4, this.f10683d, false);
        see.m35062b(parcel, a);
    }

    public PasswordCheckResponse(izj izj, String str, String str2) {
        this.f10680a = 1;
        sdo.m34959a(izj);
        this.f10681b = izj.f22000ac;
        this.f10682c = str;
        this.f10683d = str2;
    }
}
