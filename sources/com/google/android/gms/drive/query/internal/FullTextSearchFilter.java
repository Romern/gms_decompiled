package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FullTextSearchFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new vgp();

    /* renamed from: a */
    final String f31113a;

    public FullTextSearchFilter(String str) {
        this.f31113a = str;
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        return vgn.mo28321a(this.f31113a);
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
        see.m35046a(parcel, 1, this.f31113a, false);
        see.m35062b(parcel, a);
    }
}
