package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenBroadcaster$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gei();

    /* renamed from: a */
    public final byte[] f9891a;

    /* renamed from: b */
    public final int f9892b;

    /* renamed from: c */
    public final Encoding[] f9893c;

    /* renamed from: d */
    public final int f9894d;

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr) {
        this(bArr, i, encodingArr, -1);
    }

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr, int i2) {
        this.f9891a = bArr;
        this.f9892b = i;
        this.f9893c = encodingArr;
        this.f9894d = i2;
    }

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
        see.m35052a(parcel, 2, this.f9891a, false);
        see.m35063b(parcel, 3, this.f9892b);
        see.m35057a(parcel, 4, this.f9893c, i);
        see.m35063b(parcel, 5, this.f9894d);
        see.m35062b(parcel, a);
    }
}
