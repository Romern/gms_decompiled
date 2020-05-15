package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetEsimConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahar();

    /* renamed from: a */
    public String f80366a;

    /* renamed from: b */
    public String f80367b;

    /* renamed from: c */
    public Long f80368c;

    /* renamed from: d */
    public Long f80369d;

    /* renamed from: e */
    public String f80370e;

    /* renamed from: f */
    public String f80371f;

    /* renamed from: g */
    public Bundle f80372g;

    public GetEsimConfigResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigResponse) {
            GetEsimConfigResponse getEsimConfigResponse = (GetEsimConfigResponse) obj;
            return sdg.m34949a(this.f80366a, getEsimConfigResponse.f80366a) && sdg.m34949a(this.f80367b, getEsimConfigResponse.f80367b) && sdg.m34949a(this.f80368c, getEsimConfigResponse.f80368c) && sdg.m34949a(this.f80369d, getEsimConfigResponse.f80369d) && sdg.m34949a(this.f80370e, getEsimConfigResponse.f80370e) && sdg.m34949a(this.f80371f, getEsimConfigResponse.f80371f) && sdg.m34949a(this.f80372g, getEsimConfigResponse.f80372g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80366a, this.f80367b, this.f80368c, this.f80369d, this.f80370e, this.f80371f, this.f80372g});
    }

    public GetEsimConfigResponse(String str, String str2, Long l, Long l2, String str3, String str4, Bundle bundle) {
        this.f80366a = str;
        this.f80367b = str2;
        this.f80368c = l;
        this.f80369d = l2;
        this.f80370e = str3;
        this.f80371f = str4;
        this.f80372g = bundle;
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
        see.m35046a(parcel, 1, this.f80366a, false);
        see.m35046a(parcel, 2, this.f80367b, false);
        see.m35045a(parcel, 3, this.f80368c);
        see.m35045a(parcel, 4, this.f80369d);
        see.m35046a(parcel, 5, this.f80370e, false);
        see.m35046a(parcel, 6, this.f80371f, false);
        see.m35037a(parcel, 63, this.f80372g, false);
        see.m35062b(parcel, a);
    }
}
