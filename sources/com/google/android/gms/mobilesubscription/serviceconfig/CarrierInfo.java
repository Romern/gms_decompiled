package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarrierInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahaj();

    /* renamed from: a */
    public Long f80343a;

    /* renamed from: b */
    public String f80344b;

    /* renamed from: c */
    public OauthRedirect f80345c;

    public CarrierInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierInfo) {
            CarrierInfo carrierInfo = (CarrierInfo) obj;
            return sdg.m34949a(this.f80343a, carrierInfo.f80343a) && sdg.m34949a(this.f80344b, carrierInfo.f80344b) && sdg.m34949a(this.f80345c, carrierInfo.f80345c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80343a, this.f80344b, this.f80345c});
    }

    public CarrierInfo(Long l, String str, OauthRedirect oauthRedirect) {
        this.f80343a = l;
        this.f80344b = str;
        this.f80345c = oauthRedirect;
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
        see.m35045a(parcel, 1, this.f80343a);
        see.m35046a(parcel, 2, this.f80344b, false);
        see.m35040a(parcel, 3, this.f80345c, i, false);
        see.m35062b(parcel, a);
    }
}
