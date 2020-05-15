package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiScan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeix();

    /* renamed from: a */
    public static final long[] f79398a = new long[0];

    /* renamed from: b */
    public static final int[] f79399b = new int[0];

    /* renamed from: c */
    public final long f79400c;

    /* renamed from: d */
    final long[] f79401d;

    /* renamed from: e */
    final int[] f79402e;

    /* renamed from: f */
    final int[] f79403f;

    /* renamed from: g */
    final int[] f79404g;

    /* renamed from: h */
    final int[] f79405h;

    /* renamed from: i */
    final int[] f79406i;

    /* renamed from: j */
    final int[] f79407j;

    public WifiScan(long j, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.f79400c = j;
        this.f79401d = jArr == null ? f79398a : jArr;
        this.f79402e = iArr == null ? f79399b : iArr;
        this.f79403f = iArr2 == null ? f79399b : iArr2;
        this.f79404g = iArr3 == null ? f79399b : iArr3;
        this.f79405h = iArr4 == null ? f79399b : iArr4;
        this.f79406i = iArr5 == null ? f79399b : iArr5;
        this.f79407j = iArr6 == null ? f79399b : iArr6;
    }

    /* renamed from: a */
    public static WifiScan m66875a(Location location) {
        byte[] byteArray;
        Bundle extras = location.getExtras();
        if (extras == null || (byteArray = extras.getByteArray("wifiScan")) == null) {
            return null;
        }
        return m66876a(byteArray);
    }

    /* renamed from: i */
    private final void m66877i(int i) {
        if (i < 0 || i >= mo43592a()) {
            int a = mo43592a();
            StringBuilder sb = new StringBuilder(49);
            sb.append("Index ");
            sb.append(i);
            sb.append(" out of bounds: [0, ");
            sb.append(a);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: b */
    public final byte mo43594b(int i) {
        m66877i(i);
        return (byte) ((int) ((this.f79401d[i] & 71776119061217280L) >>> 48));
    }

    /* renamed from: c */
    public final int mo43595c(int i) {
        m66877i(i);
        return this.f79402e[i];
    }

    /* renamed from: d */
    public final int mo43596d(int i) {
        m66877i(i);
        int[] iArr = this.f79403f;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo43597e(int i) {
        m66877i(i);
        int[] iArr = this.f79404g;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiScan) {
            WifiScan wifiScan = (WifiScan) obj;
            if (wifiScan.f79400c != this.f79400c || !Arrays.equals(wifiScan.f79401d, this.f79401d) || !Arrays.equals(wifiScan.f79402e, this.f79402e) || !Arrays.equals(wifiScan.f79403f, this.f79403f) || !Arrays.equals(wifiScan.f79404g, this.f79404g) || !Arrays.equals(wifiScan.f79405h, this.f79405h) || !Arrays.equals(wifiScan.f79406i, this.f79406i) || !Arrays.equals(wifiScan.f79407j, this.f79407j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo43599f(int i) {
        m66877i(i);
        int[] iArr = this.f79405h;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo43600g(int i) {
        m66877i(i);
        int[] iArr = this.f79406i;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo43601h(int i) {
        m66877i(i);
        int[] iArr = this.f79407j;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f79401d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiScan[elapsed rt: ");
        sb.append(this.f79400c);
        int a = mo43592a();
        for (int i = 0; i < a; i++) {
            sb.append(", Device[mac: ");
            sb.append(mo43593a(i));
            sb.append(", dbm: ");
            sb.append((int) mo43594b(i));
            sb.append(", mhz: ");
            sb.append(mo43595c(i));
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, long[], boolean):void
     arg types: [android.os.Parcel, int, long[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f79400c);
        see.m35056a(parcel, 2, this.f79401d, false);
        see.m35055a(parcel, 3, this.f79402e, false);
        see.m35055a(parcel, 4, this.f79403f, false);
        see.m35055a(parcel, 5, this.f79404g, false);
        see.m35055a(parcel, 6, this.f79405h, false);
        see.m35055a(parcel, 7, this.f79406i, false);
        see.m35055a(parcel, 8, this.f79407j, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static WifiScan m66876a(byte[] bArr) {
        return (WifiScan) sef.m35069a(bArr, CREATOR);
    }

    /* renamed from: a */
    public final int mo43592a() {
        return this.f79401d.length;
    }

    /* renamed from: a */
    public final long mo43593a(int i) {
        m66877i(i);
        return this.f79401d[i] & 281474976710655L;
    }
}
