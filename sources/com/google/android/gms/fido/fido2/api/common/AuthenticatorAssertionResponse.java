package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new xpc();

    /* renamed from: a */
    public final byte[] f31719a;

    /* renamed from: b */
    public final byte[] f31720b;

    /* renamed from: c */
    public final byte[] f31721c;

    /* renamed from: d */
    public final byte[] f31722d;

    /* renamed from: e */
    public final byte[] f31723e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f31719a = (byte[]) sdo.m34959a(bArr);
        this.f31720b = (byte[]) sdo.m34959a(bArr2);
        this.f31721c = (byte[]) sdo.m34959a(bArr3);
        this.f31722d = (byte[]) sdo.m34959a(bArr4);
        this.f31723e = bArr5;
    }

    /* renamed from: a */
    public static AuthenticatorAssertionResponse m23445a(byte[] bArr) {
        return (AuthenticatorAssertionResponse) sef.m35069a(bArr, CREATOR);
    }

    /* renamed from: b */
    private static final String m23446b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorAssertionResponse) {
            AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
            if (!Arrays.equals(this.f31719a, authenticatorAssertionResponse.f31719a) || !Arrays.equals(this.f31720b, authenticatorAssertionResponse.f31720b) || !Arrays.equals(this.f31721c, authenticatorAssertionResponse.f31721c) || !Arrays.equals(this.f31722d, authenticatorAssertionResponse.f31722d) || !Arrays.equals(this.f31723e, authenticatorAssertionResponse.f31723e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31719a)), Integer.valueOf(Arrays.hashCode(this.f31720b)), Integer.valueOf(Arrays.hashCode(this.f31721c)), Integer.valueOf(Arrays.hashCode(this.f31722d)), Integer.valueOf(Arrays.hashCode(this.f31723e))});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("keyHandle", boan.f132472f.mo68794a(this.f31719a));
        a.mo66885a("clientDataJSON", boan.f132472f.mo68794a(this.f31720b));
        a.mo66885a("authenticatorData", boan.f132472f.mo68794a(this.f31721c));
        a.mo66885a("signature", boan.f132472f.mo68794a(this.f31722d));
        if (this.f31723e != null) {
            a.mo66885a("userHandle", boan.f132472f.mo68794a(this.f31723e));
        }
        return a.toString();
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", m23446b(this.f31719a));
            jSONObject.put("clientDataJSON", m23446b(this.f31720b));
            jSONObject.put("authenticatorData", m23446b(this.f31721c));
            jSONObject.put("signature", m23446b(this.f31722d));
            byte[] bArr = this.f31723e;
            if (bArr != null) {
                jSONObject.put("userHandle", m23446b(bArr));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo18665b() {
        return sef.m35074a(this);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35052a(parcel, 2, this.f31719a, false);
        see.m35052a(parcel, 3, this.f31720b, false);
        see.m35052a(parcel, 4, this.f31721c, false);
        see.m35052a(parcel, 5, this.f31722d, false);
        see.m35052a(parcel, 6, this.f31723e, false);
        see.m35062b(parcel, a);
    }
}
