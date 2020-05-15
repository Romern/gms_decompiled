package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajbb();

    /* renamed from: a */
    final int f80714a;

    /* renamed from: b */
    public final int f80715b;

    /* renamed from: c */
    public final byte[] f80716c;

    /* renamed from: d */
    public final boolean f80717d;

    public NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.f80714a = i;
        this.f80715b = i2;
        this.f80716c = bArr;
        this.f80717d = z;
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
        see.m35063b(parcel, 1, this.f80715b);
        see.m35052a(parcel, 2, this.f80716c, false);
        see.m35051a(parcel, 3, this.f80717d);
        see.m35063b(parcel, 1000, this.f80714a);
        see.m35062b(parcel, a);
    }
}
