package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aucv();

    /* renamed from: a */
    public final int f109009a;

    /* renamed from: b */
    public final String f109010b;

    /* renamed from: c */
    public final long f109011c;

    /* renamed from: d */
    public final int f109012d;

    /* renamed from: e */
    public final long f109013e;

    public CallSpamOptions(int i, String str, long j, int i2, long j2) {
        this.f109009a = i;
        this.f109010b = str;
        this.f109011c = j;
        this.f109012d = i2;
        this.f109013e = j2;
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
        see.m35063b(parcel, 1, this.f109009a);
        see.m35046a(parcel, 2, this.f109010b, false);
        see.m35036a(parcel, 3, this.f109011c);
        see.m35063b(parcel, 4, this.f109012d);
        see.m35036a(parcel, 5, this.f109013e);
        see.m35062b(parcel, a);
    }
}
