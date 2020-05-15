package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awaz();

    /* renamed from: a */
    String f109817a;

    /* renamed from: b */
    String f109818b;

    /* renamed from: c */
    String f109819c;

    /* renamed from: d */
    String f109820d;

    /* renamed from: e */
    int f109821e;

    /* renamed from: f */
    String f109822f;

    LineItem() {
        this.f109821e = 0;
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
        see.m35046a(parcel, 2, this.f109817a, false);
        see.m35046a(parcel, 3, this.f109818b, false);
        see.m35046a(parcel, 4, this.f109819c, false);
        see.m35046a(parcel, 5, this.f109820d, false);
        see.m35063b(parcel, 6, this.f109821e);
        see.m35046a(parcel, 7, this.f109822f, false);
        see.m35062b(parcel, a);
    }

    public LineItem(String str, String str2, String str3, String str4, int i, String str5) {
        this.f109817a = str;
        this.f109818b = str2;
        this.f109819c = str3;
        this.f109820d = str4;
        this.f109821e = i;
        this.f109822f = str5;
    }
}
