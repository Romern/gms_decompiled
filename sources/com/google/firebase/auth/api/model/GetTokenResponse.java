package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetTokenResponse extends AbstractSafeParcelable implements brpk {
    public static final Parcelable.Creator CREATOR = new brqq();

    /* renamed from: a */
    public String f152526a;

    /* renamed from: b */
    public String f152527b;

    /* renamed from: c */
    public Long f152528c;

    /* renamed from: d */
    public String f152529d;

    /* renamed from: e */
    public Long f152530e;

    public GetTokenResponse() {
        this.f152530e = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static GetTokenResponse m118899a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            GetTokenResponse getTokenResponse = new GetTokenResponse();
            getTokenResponse.f152526a = jSONObject.optString("refresh_token", null);
            getTokenResponse.f152527b = jSONObject.optString("access_token", null);
            getTokenResponse.f152528c = Long.valueOf(jSONObject.optLong("expires_in"));
            getTokenResponse.f152529d = jSONObject.optString("token_type", null);
            getTokenResponse.f152530e = Long.valueOf(jSONObject.optLong("issued_at"));
            return getTokenResponse;
        } catch (JSONException e) {
            throw new brjp(e);
        }
    }

    public GetTokenResponse(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
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
        long j;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f152526a, false);
        see.m35046a(parcel, 3, this.f152527b, false);
        Long l = this.f152528c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        see.m35045a(parcel, 4, Long.valueOf(j));
        see.m35046a(parcel, 5, this.f152529d, false);
        see.m35045a(parcel, 6, Long.valueOf(this.f152530e.longValue()));
        see.m35062b(parcel, a);
    }

    public GetTokenResponse(String str, String str2, Long l, String str3, Long l2) {
        this.f152526a = str;
        this.f152527b = str2;
        this.f152528c = l;
        this.f152529d = str3;
        this.f152530e = l2;
    }

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bydy.f165872e.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bydy) {
            bydy bydy = (bydy) bxxc;
            this.f152526a = stm.m36300b(bydy.f165877d);
            this.f152527b = stm.m36300b(bydy.f165874a);
            this.f152528c = Long.valueOf(bydy.f165875b);
            this.f152529d = stm.m36300b(bydy.f165876c);
            this.f152530e = Long.valueOf(System.currentTimeMillis());
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of GrantTokenResponse.");
    }
}
