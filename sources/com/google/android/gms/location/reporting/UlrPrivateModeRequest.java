package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeqf();

    /* renamed from: a */
    public final String f79610a;

    /* renamed from: b */
    public final boolean f79611b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.f79610a = str;
        this.f79611b = z;
    }

    public final String toString() {
        String str = this.f79610a;
        boolean z = this.f79611b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("UlrPrivateModeRequest{Tag='");
        sb.append(str);
        sb.append(", privateMode=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
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
        see.m35046a(parcel, 1, this.f79610a, false);
        see.m35051a(parcel, 2, this.f79611b);
        see.m35062b(parcel, a);
    }
}
