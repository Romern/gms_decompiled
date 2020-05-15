package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ProgramResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaie();

    /* renamed from: a */
    public final int f32765a;

    /* renamed from: b */
    public final byte[] f32766b;

    /* renamed from: c */
    public final int f32767c;

    public ProgramResponse(int i, byte[] bArr, int i2) {
        this.f32765a = i;
        this.f32766b = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f32767c = i2;
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
        see.m35063b(parcel, 1, this.f32765a);
        see.m35052a(parcel, 2, this.f32766b, false);
        see.m35063b(parcel, 3, this.f32767c);
        see.m35062b(parcel, a);
    }

    public ProgramResponse(byte[] bArr, int i) {
        this(1, bArr, i);
    }
}
