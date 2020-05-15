package com.google.android.gms.nearby.internal.connection;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OnEndpointFoundParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aihp();

    /* renamed from: a */
    public String f80590a;

    /* renamed from: b */
    public String f80591b;

    /* renamed from: c */
    public String f80592c;

    /* renamed from: d */
    public BluetoothDevice f80593d;

    /* renamed from: e */
    public byte[] f80594e;

    public OnEndpointFoundParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointFoundParams) {
            OnEndpointFoundParams onEndpointFoundParams = (OnEndpointFoundParams) obj;
            return sdg.m34949a(this.f80590a, onEndpointFoundParams.f80590a) && sdg.m34949a(this.f80591b, onEndpointFoundParams.f80591b) && sdg.m34949a(this.f80592c, onEndpointFoundParams.f80592c) && sdg.m34949a(this.f80593d, onEndpointFoundParams.f80593d) && Arrays.equals(this.f80594e, onEndpointFoundParams.f80594e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80590a, this.f80591b, this.f80592c, this.f80593d, Integer.valueOf(Arrays.hashCode(this.f80594e))});
    }

    public OnEndpointFoundParams(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f80590a = str;
        this.f80591b = str2;
        this.f80592c = str3;
        this.f80593d = bluetoothDevice;
        this.f80594e = bArr;
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
        see.m35046a(parcel, 1, this.f80590a, false);
        see.m35046a(parcel, 2, this.f80591b, false);
        see.m35046a(parcel, 3, this.f80592c, false);
        see.m35040a(parcel, 4, this.f80593d, i, false);
        see.m35052a(parcel, 5, this.f80594e, false);
        see.m35062b(parcel, a);
    }
}
