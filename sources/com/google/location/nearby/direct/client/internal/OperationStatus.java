package com.google.location.nearby.direct.client.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OperationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bvbi();

    /* renamed from: a */
    final byte[] f191775a;

    /* renamed from: b */
    public final bvbc f191776b;

    public OperationStatus(bvbc bvbc) {
        this.f191776b = bvbc;
        this.f191775a = bvbc.mo73642k();
    }

    public final String toString() {
        return "Unloggable";
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
        see.m35052a(parcel, 1, this.f191775a, false);
        see.m35062b(parcel, a);
    }

    public OperationStatus(byte[] bArr) {
        this.f191775a = bArr;
        try {
            this.f191776b = (bvbc) bxvk.m124014a(bvbc.f155522h, bArr);
        } catch (bxwf e) {
            throw new IllegalArgumentException("Invalid proto bytes", e);
        }
    }
}
