package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aucy();

    /* renamed from: a */
    public final int f109022a;

    /* renamed from: b */
    public final String f109023b;

    /* renamed from: c */
    public final int f109024c;

    /* renamed from: d */
    public final long f109025d;

    public MessageContent(int i, String str, int i2, long j) {
        this.f109022a = i;
        this.f109023b = str;
        this.f109024c = i2;
        this.f109025d = j;
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
        see.m35063b(parcel, 1, this.f109022a);
        see.m35046a(parcel, 2, this.f109023b, false);
        see.m35063b(parcel, 3, this.f109024c);
        see.m35036a(parcel, 4, this.f109025d);
        see.m35062b(parcel, a);
    }
}
