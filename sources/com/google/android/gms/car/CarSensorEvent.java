package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarSensorEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nmp();

    /* renamed from: a */
    public final int f29363a;

    /* renamed from: b */
    public int f29364b;

    /* renamed from: c */
    public long f29365c;

    /* renamed from: d */
    public final float[] f29366d;

    /* renamed from: e */
    public final byte[] f29367e;

    public CarSensorEvent(int i, int i2, long j, float[] fArr, byte[] bArr) {
        this.f29363a = i;
        this.f29364b = i2;
        this.f29365c = j;
        this.f29366d = fArr;
        this.f29367e = bArr;
    }

    /* renamed from: a */
    public static int m22069a(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & -16777216) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[type:");
        sb.append(Integer.toHexString(this.f29364b));
        float[] fArr = this.f29366d;
        if (fArr != null && fArr.length > 0) {
            sb.append(" float values:");
            float[] fArr2 = this.f29366d;
            for (float f : fArr2) {
                sb.append(" ");
                sb.append(f);
            }
        }
        byte[] bArr = this.f29367e;
        if (bArr != null && bArr.length > 0) {
            sb.append(" byte values:");
            byte[] bArr2 = this.f29367e;
            for (byte b : bArr2) {
                sb.append(" ");
                sb.append((int) b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CarSensorEvent(int i, long j, int i2, int i3) {
        this.f29363a = 3;
        this.f29364b = i;
        this.f29365c = j;
        this.f29366d = new float[i2];
        this.f29367e = new byte[i3];
    }

    /* renamed from: a */
    public static void m22070a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, float[], boolean):void
     arg types: [android.os.Parcel, int, float[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void */
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
        see.m35063b(parcel, 1, this.f29364b);
        see.m35036a(parcel, 2, this.f29365c);
        see.m35054a(parcel, 3, this.f29366d, false);
        see.m35052a(parcel, 4, this.f29367e, false);
        see.m35063b(parcel, 1000, this.f29363a);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo17332a(int i) {
        if (this.f29364b != i) {
            throw new UnsupportedOperationException(String.format("Invalid sensor type: expected %d, got %d", Integer.valueOf(i), Integer.valueOf(this.f29364b)));
        }
    }
}
