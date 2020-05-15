package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new xyd();

    /* renamed from: a */
    public final ErrorCode f31908a;

    /* renamed from: b */
    public final String f31909b;

    public ErrorResponseData(int i, String str) {
        this.f31908a = ErrorCode.m23582a(i);
        this.f31909b = str;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f31908a.f31907g);
            String str = this.f31909b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ErrorResponseData) {
            ErrorResponseData errorResponseData = (ErrorResponseData) obj;
            if (!sdg.m34949a(this.f31908a, errorResponseData.f31908a) || !sdg.m34949a(this.f31909b, errorResponseData.f31909b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31908a, this.f31909b});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66883a("errorCode", this.f31908a.f31907g);
        String str = this.f31909b;
        if (str != null) {
            a.mo66885a("errorMessage", str);
        }
        return a.toString();
    }

    public ErrorResponseData(ErrorCode errorCode) {
        sdo.m34959a(errorCode);
        this.f31908a = errorCode;
        this.f31909b = null;
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
        see.m35063b(parcel, 2, this.f31908a.f31907g);
        see.m35046a(parcel, 3, this.f31909b, false);
        see.m35062b(parcel, a);
    }

    public ErrorResponseData(ErrorCode errorCode, String str) {
        sdo.m34959a(errorCode);
        this.f31908a = errorCode;
        this.f31909b = str;
    }
}
