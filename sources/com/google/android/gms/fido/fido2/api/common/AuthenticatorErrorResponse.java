package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new xpg();

    /* renamed from: a */
    public final ErrorCode f31727a;

    /* renamed from: b */
    public final String f31728b;

    public AuthenticatorErrorResponse(int i, String str) {
        try {
            this.f31727a = ErrorCode.m23473a(i);
            this.f31728b = str;
        } catch (xpt e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static AuthenticatorErrorResponse m23451a(byte[] bArr) {
        return (AuthenticatorErrorResponse) sef.m35069a(bArr, CREATOR);
    }

    /* renamed from: b */
    public final byte[] mo18665b() {
        return sef.m35074a(this);
    }

    /* renamed from: c */
    public final int mo18674c() {
        return this.f31727a.f31755m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorErrorResponse) {
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
            if (!sdg.m34949a(this.f31727a, authenticatorErrorResponse.f31727a) || !sdg.m34949a(this.f31728b, authenticatorErrorResponse.f31728b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31727a, this.f31728b});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66883a("errorCode", this.f31727a.f31755m);
        String str = this.f31728b;
        if (str != null) {
            a.mo66885a("errorMessage", str);
        }
        return a.toString();
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", this.f31727a.f31755m);
            String str = this.f31728b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
        }
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
        see.m35063b(parcel, 2, mo18674c());
        see.m35046a(parcel, 3, this.f31728b, false);
        see.m35062b(parcel, a);
    }
}
