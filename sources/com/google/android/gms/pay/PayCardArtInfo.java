package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PayCardArtInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfo();

    /* renamed from: a */
    public int f81541a;

    /* renamed from: b */
    public String f81542b;

    public PayCardArtInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArtInfo) {
            PayCardArtInfo payCardArtInfo = (PayCardArtInfo) obj;
            return sdg.m34949a(Integer.valueOf(this.f81541a), Integer.valueOf(payCardArtInfo.f81541a)) && sdg.m34949a(this.f81542b, payCardArtInfo.f81542b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81541a), this.f81542b});
    }

    public PayCardArtInfo(int i, String str) {
        this.f81541a = i;
        this.f81542b = str;
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
        see.m35063b(parcel, 1, this.f81541a);
        see.m35046a(parcel, 2, this.f81542b, false);
        see.m35062b(parcel, a);
    }
}
