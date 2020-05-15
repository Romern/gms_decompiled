package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CheckAuthStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahal();

    /* renamed from: a */
    public String f80346a;

    /* renamed from: b */
    public ServiceType f80347b;

    /* renamed from: c */
    public Long f80348c;

    /* renamed from: d */
    public AuthType f80349d;

    /* renamed from: e */
    public String f80350e;

    /* renamed from: f */
    public Bundle f80351f;

    public CheckAuthStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusRequest) {
            CheckAuthStatusRequest checkAuthStatusRequest = (CheckAuthStatusRequest) obj;
            return sdg.m34949a(this.f80346a, checkAuthStatusRequest.f80346a) && sdg.m34949a(this.f80347b, checkAuthStatusRequest.f80347b) && sdg.m34949a(this.f80348c, checkAuthStatusRequest.f80348c) && sdg.m34949a(this.f80349d, checkAuthStatusRequest.f80349d) && sdg.m34949a(this.f80350e, checkAuthStatusRequest.f80350e) && sdg.m34949a(this.f80351f, checkAuthStatusRequest.f80351f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80346a, this.f80347b, this.f80348c, this.f80349d, this.f80350e, this.f80351f});
    }

    public CheckAuthStatusRequest(String str, ServiceType serviceType, Long l, AuthType authType, String str2, Bundle bundle) {
        this.f80346a = str;
        this.f80347b = serviceType;
        this.f80348c = l;
        this.f80349d = authType;
        this.f80350e = str2;
        this.f80351f = bundle;
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
        see.m35046a(parcel, 1, this.f80346a, false);
        see.m35040a(parcel, 2, this.f80347b, i, false);
        see.m35045a(parcel, 3, this.f80348c);
        see.m35040a(parcel, 4, this.f80349d, i, false);
        see.m35046a(parcel, 5, this.f80350e, false);
        see.m35037a(parcel, 63, this.f80351f, false);
        see.m35062b(parcel, a);
    }
}
