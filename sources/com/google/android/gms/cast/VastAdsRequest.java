package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgu();

    /* renamed from: a */
    public final String f29858a;

    /* renamed from: b */
    public final String f29859b;

    public VastAdsRequest(String str, String str2) {
        this.f29858a = str;
        this.f29859b = str2;
    }

    /* renamed from: a */
    public static VastAdsRequest m22291a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new VastAdsRequest(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VastAdsRequest) {
            VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
            return ptk.m31236a(this.f29858a, vastAdsRequest.f29858a) && ptk.m31236a(this.f29859b, vastAdsRequest.f29859b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29858a, this.f29859b});
    }

    /* renamed from: a */
    public final JSONObject mo17573a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f29858a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f29859b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
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
        see.m35046a(parcel, 2, this.f29858a, false);
        see.m35046a(parcel, 3, this.f29859b, false);
        see.m35062b(parcel, a);
    }
}
