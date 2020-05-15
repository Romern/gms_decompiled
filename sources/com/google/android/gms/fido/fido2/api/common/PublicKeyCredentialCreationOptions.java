package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new xpx();

    /* renamed from: a */
    public final PublicKeyCredentialRpEntity f31764a;

    /* renamed from: b */
    public final PublicKeyCredentialUserEntity f31765b;

    /* renamed from: c */
    public final byte[] f31766c;

    /* renamed from: d */
    public final List f31767d;

    /* renamed from: e */
    public final Double f31768e;

    /* renamed from: f */
    public final List f31769f;

    /* renamed from: g */
    public final AuthenticatorSelectionCriteria f31770g;

    /* renamed from: h */
    public final Integer f31771h;

    /* renamed from: i */
    public final TokenBinding f31772i;

    /* renamed from: j */
    public final AttestationConveyancePreference f31773j;

    /* renamed from: k */
    public final AuthenticationExtensions f31774k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        sdo.m34959a(publicKeyCredentialRpEntity);
        this.f31764a = publicKeyCredentialRpEntity;
        sdo.m34959a(publicKeyCredentialUserEntity);
        this.f31765b = publicKeyCredentialUserEntity;
        this.f31766c = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a(list);
        this.f31767d = list;
        this.f31768e = d;
        this.f31769f = list2;
        this.f31770g = authenticatorSelectionCriteria;
        this.f31771h = num;
        this.f31772i = tokenBinding;
        if (str != null) {
            try {
                this.f31773j = AttestationConveyancePreference.m23444a(str);
            } catch (xow e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f31773j = null;
        }
        this.f31774k = authenticationExtensions;
    }

    /* renamed from: a */
    public final byte[] mo18682a() {
        return this.f31766c;
    }

    /* renamed from: b */
    public final Double mo18683b() {
        return this.f31768e;
    }

    /* renamed from: c */
    public final Integer mo18684c() {
        return this.f31771h;
    }

    /* renamed from: d */
    public final TokenBinding mo18685d() {
        return this.f31772i;
    }

    /* renamed from: e */
    public final AuthenticationExtensions mo18686e() {
        return this.f31774k;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof PublicKeyCredentialCreationOptions) {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
            if (!sdg.m34949a(this.f31764a, publicKeyCredentialCreationOptions.f31764a) || !sdg.m34949a(this.f31765b, publicKeyCredentialCreationOptions.f31765b) || !Arrays.equals(this.f31766c, publicKeyCredentialCreationOptions.f31766c) || !sdg.m34949a(this.f31768e, publicKeyCredentialCreationOptions.f31768e) || !this.f31767d.containsAll(publicKeyCredentialCreationOptions.f31767d) || !publicKeyCredentialCreationOptions.f31767d.containsAll(this.f31767d) || ((((list = this.f31769f) != null || publicKeyCredentialCreationOptions.f31769f != null) && (list == null || (list2 = publicKeyCredentialCreationOptions.f31769f) == null || !list.containsAll(list2) || !publicKeyCredentialCreationOptions.f31769f.containsAll(this.f31769f))) || !sdg.m34949a(this.f31770g, publicKeyCredentialCreationOptions.f31770g) || !sdg.m34949a(this.f31771h, publicKeyCredentialCreationOptions.f31771h) || !sdg.m34949a(this.f31772i, publicKeyCredentialCreationOptions.f31772i) || !sdg.m34949a(this.f31773j, publicKeyCredentialCreationOptions.f31773j) || !sdg.m34949a(this.f31774k, publicKeyCredentialCreationOptions.f31774k))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final byte[] mo18689g() {
        return sef.m35074a(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31764a, this.f31765b, Integer.valueOf(Arrays.hashCode(this.f31766c)), this.f31767d, this.f31768e, this.f31769f, this.f31770g, this.f31771h, this.f31772i, this.f31773j, this.f31774k});
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
        String str;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31764a, i, false);
        see.m35040a(parcel, 3, this.f31765b, i, false);
        see.m35052a(parcel, 4, this.f31766c, false);
        see.m35066c(parcel, 5, this.f31767d, false);
        see.m35042a(parcel, 6, this.f31768e);
        see.m35066c(parcel, 7, this.f31769f, false);
        see.m35040a(parcel, 8, this.f31770g, i, false);
        see.m35044a(parcel, 9, this.f31771h);
        see.m35040a(parcel, 10, this.f31772i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.f31773j;
        if (attestationConveyancePreference != null) {
            str = attestationConveyancePreference.f31714d;
        } else {
            str = null;
        }
        see.m35046a(parcel, 11, str, false);
        see.m35040a(parcel, 12, this.f31774k, i, false);
        see.m35062b(parcel, a);
    }
}
