package com.google.location.nearby.messages.debug.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugPokeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bvhb();

    /* renamed from: a */
    final int f191789a;

    /* renamed from: b */
    public final int f191790b;

    /* renamed from: c */
    public final byte[] f191791c;

    public DebugPokeResponse(int i) {
        this(1, i, null);
    }

    public final String toString() {
        Integer num;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f191790b);
        byte[] bArr = this.f191791c;
        if (bArr != null) {
            num = Integer.valueOf(bArr.length);
        } else {
            num = null;
        }
        objArr[1] = num;
        return String.format("DebugPokeResponse{statusCode=%s, protoData.length=%s}", objArr);
    }

    public DebugPokeResponse(int i, int i2, byte[] bArr) {
        this.f191789a = i;
        this.f191790b = i2;
        this.f191791c = bArr;
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
        see.m35063b(parcel, 1, this.f191790b);
        see.m35052a(parcel, 2, this.f191791c, false);
        see.m35063b(parcel, 1000, this.f191789a);
        see.m35062b(parcel, a);
    }
}
