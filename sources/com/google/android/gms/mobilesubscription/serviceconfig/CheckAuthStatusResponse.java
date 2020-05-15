package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CheckAuthStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahan();

    /* renamed from: a */
    public String f80352a;

    /* renamed from: b */
    public CarrierInfo f80353b;

    /* renamed from: c */
    public AuthType f80354c;

    /* renamed from: d */
    public AuthStatus f80355d;

    /* renamed from: e */
    public UserKey f80356e;

    /* renamed from: f */
    public Bundle f80357f;

    public CheckAuthStatusResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusResponse) {
            CheckAuthStatusResponse checkAuthStatusResponse = (CheckAuthStatusResponse) obj;
            return sdg.m34949a(this.f80352a, checkAuthStatusResponse.f80352a) && sdg.m34949a(this.f80353b, checkAuthStatusResponse.f80353b) && sdg.m34949a(this.f80354c, checkAuthStatusResponse.f80354c) && sdg.m34949a(this.f80355d, checkAuthStatusResponse.f80355d) && sdg.m34949a(this.f80356e, checkAuthStatusResponse.f80356e) && sdg.m34949a(this.f80357f, checkAuthStatusResponse.f80357f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80352a, this.f80353b, this.f80354c, this.f80355d, this.f80356e, this.f80357f});
    }

    public CheckAuthStatusResponse(String str, CarrierInfo carrierInfo, AuthType authType, AuthStatus authStatus, UserKey userKey, Bundle bundle) {
        this.f80352a = str;
        this.f80353b = carrierInfo;
        this.f80354c = authType;
        this.f80355d = authStatus;
        this.f80356e = userKey;
        this.f80357f = bundle;
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
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80352a, false);
        see.m35040a(parcel, 2, this.f80353b, i, false);
        see.m35040a(parcel, 3, this.f80354c, i, false);
        see.m35040a(parcel, 4, this.f80355d, i, false);
        see.m35040a(parcel, 5, this.f80356e, i, false);
        see.m35037a(parcel, 63, this.f80357f, false);
        see.m35062b(parcel, a);
    }
}
