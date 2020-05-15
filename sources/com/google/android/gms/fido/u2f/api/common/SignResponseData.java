package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new xyo();

    /* renamed from: a */
    public final byte[] f31945a;

    /* renamed from: b */
    public final String f31946b;

    /* renamed from: c */
    public final byte[] f31947c;

    /* renamed from: d */
    public final byte[] f31948d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.f31945a = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a((Object) str);
        this.f31946b = str;
        this.f31947c = (byte[]) sdo.m34959a(bArr2);
        this.f31948d = (byte[]) sdo.m34959a(bArr3);
    }

    /* renamed from: a */
    private static final String m23603a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignResponseData) {
            SignResponseData signResponseData = (SignResponseData) obj;
            if (!Arrays.equals(this.f31945a, signResponseData.f31945a) || !sdg.m34949a(this.f31946b, signResponseData.f31946b) || !Arrays.equals(this.f31947c, signResponseData.f31947c) || !Arrays.equals(this.f31948d, signResponseData.f31948d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31945a)), this.f31946b, Integer.valueOf(Arrays.hashCode(this.f31947c)), Integer.valueOf(Arrays.hashCode(this.f31948d))});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("keyHandle", boan.f132472f.mo68794a(this.f31945a));
        a.mo66885a("clientDataString", this.f31946b);
        a.mo66885a("signatureData", boan.f132472f.mo68794a(this.f31947c));
        a.mo66885a("application", boan.f132472f.mo68794a(this.f31948d));
        return a.toString();
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", m23603a(this.f31945a));
            jSONObject.put("clientData", m23603a(this.f31946b.getBytes()));
            jSONObject.put("signatureData", m23603a(this.f31947c));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
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
        see.m35052a(parcel, 2, this.f31945a, false);
        see.m35046a(parcel, 3, this.f31946b, false);
        see.m35052a(parcel, 4, this.f31947c, false);
        see.m35052a(parcel, 5, this.f31948d, false);
        see.m35062b(parcel, a);
    }
}
