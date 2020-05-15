package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LookupSpamStatusOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aucx();

    /* renamed from: a */
    public final int f109016a;

    /* renamed from: b */
    public final String f109017b;

    /* renamed from: c */
    public final String f109018c;

    /* renamed from: d */
    public final boolean f109019d;

    /* renamed from: e */
    public final String f109020e;

    /* renamed from: f */
    public final boolean f109021f;

    public LookupSpamStatusOptions(int i, String str, String str2, boolean z, String str3, boolean z2) {
        this.f109016a = i;
        this.f109017b = str;
        this.f109018c = str2;
        this.f109019d = z;
        this.f109020e = str3;
        this.f109021f = z2;
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
        see.m35063b(parcel, 1, this.f109016a);
        see.m35046a(parcel, 2, this.f109017b, false);
        see.m35046a(parcel, 3, this.f109018c, false);
        see.m35051a(parcel, 4, this.f109019d);
        see.m35046a(parcel, 5, this.f109020e, false);
        see.m35051a(parcel, 6, this.f109021f);
        see.m35062b(parcel, a);
    }
}
