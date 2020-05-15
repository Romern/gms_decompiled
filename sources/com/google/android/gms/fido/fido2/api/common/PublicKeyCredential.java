package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xpy();

    /* renamed from: a */
    public final String f31757a;

    /* renamed from: b */
    public final String f31758b;

    /* renamed from: c */
    public final byte[] f31759c;

    /* renamed from: d */
    public final AuthenticatorAttestationResponse f31760d;

    /* renamed from: e */
    public final AuthenticatorAssertionResponse f31761e;

    /* renamed from: f */
    public final AuthenticatorErrorResponse f31762f;

    /* renamed from: g */
    public final AuthenticationExtensionsClientOutputs f31763g;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
        boolean z = true;
        if (!((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || ((authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null)))) {
            z = false;
        }
        sdo.m34974b(z);
        this.f31757a = str;
        this.f31758b = str2;
        this.f31759c = bArr;
        this.f31760d = authenticatorAttestationResponse;
        this.f31761e = authenticatorAssertionResponse;
        this.f31762f = authenticatorErrorResponse;
        this.f31763g = authenticationExtensionsClientOutputs;
    }

    /* renamed from: a */
    public final AuthenticatorResponse mo18710a() {
        AuthenticatorResponse authenticatorResponse = this.f31760d;
        if (authenticatorResponse != null || (authenticatorResponse = this.f31761e) != null) {
            return authenticatorResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f31762f;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredential) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
            if (!sdg.m34949a(this.f31757a, publicKeyCredential.f31757a) || !sdg.m34949a(this.f31758b, publicKeyCredential.f31758b) || !Arrays.equals(this.f31759c, publicKeyCredential.f31759c) || !sdg.m34949a(this.f31760d, publicKeyCredential.f31760d) || !sdg.m34949a(this.f31761e, publicKeyCredential.f31761e) || !sdg.m34949a(this.f31762f, publicKeyCredential.f31762f) || !sdg.m34949a(this.f31763g, publicKeyCredential.f31763g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31757a, this.f31758b, this.f31759c, this.f31761e, this.f31760d, this.f31762f, this.f31763g});
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
        see.m35046a(parcel, 1, this.f31757a, false);
        see.m35046a(parcel, 2, this.f31758b, false);
        see.m35052a(parcel, 3, this.f31759c, false);
        see.m35040a(parcel, 4, this.f31760d, i, false);
        see.m35040a(parcel, 5, this.f31761e, i, false);
        see.m35040a(parcel, 6, this.f31762f, i, false);
        see.m35040a(parcel, 7, this.f31763g, i, false);
        see.m35062b(parcel, a);
    }
}
