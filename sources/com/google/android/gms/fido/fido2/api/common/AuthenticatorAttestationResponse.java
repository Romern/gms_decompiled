package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new xpe();

    /* renamed from: a */
    public final byte[] f31724a;

    /* renamed from: b */
    public final byte[] f31725b;

    /* renamed from: c */
    public final byte[] f31726c;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f31724a = (byte[]) sdo.m34959a(bArr);
        this.f31725b = (byte[]) sdo.m34959a(bArr2);
        this.f31726c = (byte[]) sdo.m34959a(bArr3);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final byte[] mo18665b() {
        return sef.m35074a(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorAttestationResponse) {
            AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
            if (!Arrays.equals(this.f31724a, authenticatorAttestationResponse.f31724a) || !Arrays.equals(this.f31725b, authenticatorAttestationResponse.f31725b) || !Arrays.equals(this.f31726c, authenticatorAttestationResponse.f31726c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31724a)), Integer.valueOf(Arrays.hashCode(this.f31725b)), Integer.valueOf(Arrays.hashCode(this.f31726c))});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("keyHandle", boan.f132472f.mo68794a(this.f31724a));
        a.mo66885a("clientDataJSON", boan.f132472f.mo68794a(this.f31725b));
        a.mo66885a("attestationObject", boan.f132472f.mo68794a(this.f31726c));
        return a.toString();
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
        see.m35052a(parcel, 2, this.f31724a, false);
        see.m35052a(parcel, 3, this.f31725b, false);
        see.m35052a(parcel, 4, this.f31726c, false);
        see.m35062b(parcel, a);
    }
}
