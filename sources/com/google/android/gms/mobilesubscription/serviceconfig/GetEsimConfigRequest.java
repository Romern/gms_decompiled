package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetEsimConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahap();

    /* renamed from: a */
    public String f80358a;

    /* renamed from: b */
    public UserKey f80359b;

    /* renamed from: c */
    public String f80360c;

    /* renamed from: d */
    public String f80361d;

    /* renamed from: e */
    public String f80362e;

    /* renamed from: f */
    public String f80363f;

    /* renamed from: g */
    public String[] f80364g;

    /* renamed from: h */
    public Bundle f80365h;

    public GetEsimConfigRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEsimConfigRequest) {
            GetEsimConfigRequest getEsimConfigRequest = (GetEsimConfigRequest) obj;
            return sdg.m34949a(this.f80358a, getEsimConfigRequest.f80358a) && sdg.m34949a(this.f80359b, getEsimConfigRequest.f80359b) && sdg.m34949a(this.f80360c, getEsimConfigRequest.f80360c) && sdg.m34949a(this.f80361d, getEsimConfigRequest.f80361d) && sdg.m34949a(this.f80362e, getEsimConfigRequest.f80362e) && sdg.m34949a(this.f80363f, getEsimConfigRequest.f80363f) && Arrays.equals(this.f80364g, getEsimConfigRequest.f80364g) && sdg.m34949a(this.f80365h, getEsimConfigRequest.f80365h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80358a, this.f80359b, this.f80360c, this.f80361d, this.f80362e, this.f80363f, Integer.valueOf(Arrays.hashCode(this.f80364g)), this.f80365h});
    }

    public GetEsimConfigRequest(String str, UserKey userKey, String str2, String str3, String str4, String str5, String[] strArr, Bundle bundle) {
        this.f80358a = str;
        this.f80359b = userKey;
        this.f80360c = str2;
        this.f80361d = str3;
        this.f80362e = str4;
        this.f80363f = str5;
        this.f80364g = strArr;
        this.f80365h = bundle;
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
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
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
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
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
        see.m35046a(parcel, 1, this.f80358a, false);
        see.m35040a(parcel, 2, this.f80359b, i, false);
        see.m35046a(parcel, 3, this.f80360c, false);
        see.m35046a(parcel, 4, this.f80361d, false);
        see.m35046a(parcel, 5, this.f80362e, false);
        see.m35046a(parcel, 6, this.f80363f, false);
        see.m35058a(parcel, 7, this.f80364g, false);
        see.m35037a(parcel, 63, this.f80365h, false);
        see.m35062b(parcel, a);
    }
}
