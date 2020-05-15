package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqzc();

    /* renamed from: a */
    public final D2DDevice f107865a;

    /* renamed from: b */
    public final String f107866b;

    /* renamed from: c */
    public final String f107867c;

    /* renamed from: d */
    public final byte[] f107868d;

    /* renamed from: e */
    public final String f107869e;

    /* renamed from: f */
    public final int f107870f;

    public ConnectionRequest(D2DDevice d2DDevice, String str, String str2, byte[] bArr, String str3, int i) {
        this.f107865a = d2DDevice;
        this.f107866b = str;
        this.f107867c = str2;
        this.f107868d = bArr;
        this.f107869e = str3;
        this.f107870f = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionRequest) {
            ConnectionRequest connectionRequest = (ConnectionRequest) obj;
            return sdg.m34949a(connectionRequest.f107865a, this.f107865a) && sdg.m34949a(connectionRequest.f107866b, this.f107866b) && sdg.m34949a(connectionRequest.f107867c, this.f107867c) && Arrays.equals(connectionRequest.f107868d, this.f107868d) && sdg.m34949a(connectionRequest.f107869e, this.f107869e) && connectionRequest.f107870f == this.f107870f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f107865a, this.f107866b, Integer.valueOf(Arrays.hashCode(this.f107868d)), this.f107867c, this.f107869e, Integer.valueOf(this.f107870f)});
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
        see.m35040a(parcel, 1, this.f107865a, i, false);
        see.m35046a(parcel, 2, this.f107866b, false);
        see.m35046a(parcel, 3, this.f107867c, false);
        see.m35052a(parcel, 4, this.f107868d, false);
        see.m35046a(parcel, 5, this.f107869e, false);
        see.m35063b(parcel, 6, this.f107870f);
        see.m35062b(parcel, a);
    }
}
