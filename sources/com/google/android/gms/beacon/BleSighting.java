package com.google.android.gms.beacon;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BleSighting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new neo();

    /* renamed from: a */
    public BluetoothDevice f29271a;

    /* renamed from: b */
    public nek f29272b;

    /* renamed from: c */
    public byte[] f29273c;

    /* renamed from: d */
    public int f29274d;

    /* renamed from: e */
    public long f29275e;

    public BleSighting(BluetoothDevice bluetoothDevice, byte[] bArr, int i, long j) {
        this.f29271a = bluetoothDevice;
        this.f29273c = bArr;
        this.f29274d = i;
        this.f29275e = j;
        this.f29272b = nek.m26028a(bArr);
    }

    /* renamed from: a */
    public final long mo17302a() {
        return TimeUnit.NANOSECONDS.toMillis(this.f29275e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleSighting bleSighting = (BleSighting) obj;
            return sdg.m34949a(this.f29271a, bleSighting.f29271a) && this.f29274d == bleSighting.f29274d && Arrays.equals(this.f29273c, bleSighting.f29273c) && this.f29275e == bleSighting.f29275e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29271a, Integer.valueOf(this.f29274d), Long.valueOf(this.f29275e), Integer.valueOf(Arrays.hashCode(this.f29273c))});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29271a);
        String valueOf2 = String.valueOf(this.f29272b);
        int i = this.f29274d;
        long j = this.f29275e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87 + String.valueOf(valueOf2).length());
        sb.append("BleSighting{device=");
        sb.append(valueOf);
        sb.append(", bleRecord=");
        sb.append(valueOf2);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", timestampNanos=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
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
        see.m35040a(parcel, 2, this.f29271a, i, false);
        see.m35052a(parcel, 3, this.f29273c, false);
        see.m35063b(parcel, 4, this.f29274d);
        see.m35036a(parcel, 5, this.f29275e);
        see.m35062b(parcel, a);
    }
}
