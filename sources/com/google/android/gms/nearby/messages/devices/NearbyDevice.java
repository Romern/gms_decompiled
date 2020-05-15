package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajba();

    /* renamed from: a */
    public static final NearbyDevice f80710a = new NearbyDevice("", null);

    /* renamed from: b */
    final int f80711b;

    /* renamed from: c */
    public final String f80712c;

    /* renamed from: d */
    public final String f80713d;

    public NearbyDevice(int i, String str, String str2) {
        Integer valueOf = Integer.valueOf(i);
        sdo.m34959a(valueOf);
        this.f80711b = valueOf.intValue();
        this.f80712c = str == null ? "" : str;
        this.f80713d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyDevice) {
            NearbyDevice nearbyDevice = (NearbyDevice) obj;
            return sdg.m34949a(this.f80712c, nearbyDevice.f80712c) && sdg.m34949a(this.f80713d, nearbyDevice.f80713d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80712c, this.f80713d});
    }

    public final String toString() {
        String str = this.f80712c;
        String str2 = this.f80713d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public NearbyDevice(String str, String str2) {
        this(1, str, str2);
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
        see.m35046a(parcel, 3, this.f80712c, false);
        see.m35046a(parcel, 6, this.f80713d, false);
        see.m35063b(parcel, 1000, this.f80711b);
        see.m35062b(parcel, a);
    }
}
