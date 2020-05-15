package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OauthRedirect extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahax();

    /* renamed from: a */
    public String f80379a;

    /* renamed from: b */
    public String f80380b;

    /* renamed from: c */
    public String f80381c;

    /* renamed from: d */
    public String f80382d;

    /* renamed from: e */
    public String f80383e;

    public OauthRedirect() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OauthRedirect) {
            OauthRedirect oauthRedirect = (OauthRedirect) obj;
            return sdg.m34949a(this.f80379a, oauthRedirect.f80379a) && sdg.m34949a(this.f80380b, oauthRedirect.f80380b) && sdg.m34949a(this.f80381c, oauthRedirect.f80381c) && sdg.m34949a(this.f80382d, oauthRedirect.f80382d) && sdg.m34949a(this.f80383e, oauthRedirect.f80383e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80379a, this.f80380b, this.f80381c, this.f80382d, this.f80383e});
    }

    public OauthRedirect(String str, String str2, String str3, String str4, String str5) {
        this.f80379a = str;
        this.f80380b = str2;
        this.f80381c = str3;
        this.f80382d = str4;
        this.f80383e = str5;
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
        see.m35046a(parcel, 1, this.f80379a, false);
        see.m35046a(parcel, 2, this.f80380b, false);
        see.m35046a(parcel, 3, this.f80381c, false);
        see.m35046a(parcel, 4, this.f80382d, false);
        see.m35046a(parcel, 5, this.f80383e, false);
        see.m35062b(parcel, a);
    }
}
