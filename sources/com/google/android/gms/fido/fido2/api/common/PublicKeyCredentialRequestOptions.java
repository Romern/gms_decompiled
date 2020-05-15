package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new xqd();

    /* renamed from: a */
    public final byte[] f31781a;

    /* renamed from: b */
    public final Double f31782b;

    /* renamed from: c */
    public final String f31783c;

    /* renamed from: d */
    public final List f31784d;

    /* renamed from: e */
    public final Integer f31785e;

    /* renamed from: f */
    public final TokenBinding f31786f;

    /* renamed from: g */
    public final UserVerificationRequirement f31787g;

    /* renamed from: h */
    public final AuthenticationExtensions f31788h;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions) {
        this.f31781a = (byte[]) sdo.m34959a(bArr);
        this.f31782b = d;
        sdo.m34959a((Object) str);
        this.f31783c = str;
        this.f31784d = list;
        this.f31785e = num;
        this.f31786f = tokenBinding;
        if (str2 != null) {
            try {
                this.f31787g = UserVerificationRequirement.m23501a(str2);
            } catch (xqr e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f31787g = null;
        }
        this.f31788h = authenticationExtensions;
    }

    /* renamed from: a */
    public static PublicKeyCredentialRequestOptions m23484a(JSONObject jSONObject) {
        xqc xqc = new xqc();
        xqc.mo30032a(Base64.decode(jSONObject.getString("challenge"), 11));
        if (jSONObject.has("timeoutSeconds")) {
            xqc.f52905a = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
        }
        xqc.mo30031a(jSONObject.getString("rpId"));
        if (jSONObject.has("allowList")) {
            JSONArray jSONArray = jSONObject.getJSONArray("allowList");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(PublicKeyCredentialDescriptor.m23482a(jSONArray.getJSONObject(i)));
            }
            xqc.f52906b = arrayList;
        }
        if (jSONObject.has("requestId")) {
            xqc.f52907c = Integer.valueOf(jSONObject.getInt("requestId"));
        }
        if (jSONObject.has("tokenBinding")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
            xqc.f52908d = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
        }
        if (jSONObject.has("userVerification")) {
            xqc.f52909e = UserVerificationRequirement.m23501a(jSONObject.getString("userVerification"));
        }
        if (jSONObject.has("authenticationExtensions")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("authenticationExtensions");
            xox xox = new xox();
            if (jSONObject3.has("fidoAppIdExtension")) {
                xox.f52848a = new FidoAppIdExtension(jSONObject3.getJSONObject("fidoAppIdExtension").getString("appid"));
            }
            if (jSONObject3.has("cableAuthenticationExtension")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("cableAuthenticationExtension");
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    arrayList2.add(new CableAuthenticationData(jSONObject4.getLong("version"), Base64.decode(jSONObject4.getString("clientEid"), 11), Base64.decode(jSONObject4.getString("authenticatorEid"), 11), Base64.decode(jSONObject4.getString("sessionPreKey"), 11)));
                }
                xox.f52850c = new CableAuthenticationExtension(arrayList2);
            }
            if (jSONObject3.has("userVerificationMethodExtension")) {
                xox.f52849b = new UserVerificationMethodExtension(jSONObject3.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            }
            xqc.f52910f = xox.mo29982a();
        }
        return xqc.mo30030a();
    }

    /* renamed from: a */
    public final byte[] mo18682a() {
        return this.f31781a;
    }

    /* renamed from: b */
    public final Double mo18683b() {
        return this.f31782b;
    }

    /* renamed from: c */
    public final Integer mo18684c() {
        return this.f31785e;
    }

    /* renamed from: d */
    public final TokenBinding mo18685d() {
        return this.f31786f;
    }

    /* renamed from: e */
    public final AuthenticationExtensions mo18686e() {
        return this.f31788h;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof PublicKeyCredentialRequestOptions) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
            if (!Arrays.equals(this.f31781a, publicKeyCredentialRequestOptions.f31781a) || !sdg.m34949a(this.f31782b, publicKeyCredentialRequestOptions.f31782b) || !sdg.m34949a(this.f31783c, publicKeyCredentialRequestOptions.f31783c) || ((((list = this.f31784d) != null || publicKeyCredentialRequestOptions.f31784d != null) && (list == null || (list2 = publicKeyCredentialRequestOptions.f31784d) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.f31784d.containsAll(this.f31784d))) || !sdg.m34949a(this.f31785e, publicKeyCredentialRequestOptions.f31785e) || !sdg.m34949a(this.f31786f, publicKeyCredentialRequestOptions.f31786f) || !sdg.m34949a(this.f31787g, publicKeyCredentialRequestOptions.f31787g) || !sdg.m34949a(this.f31788h, publicKeyCredentialRequestOptions.f31788h))) {
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
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31781a)), this.f31782b, this.f31783c, this.f31784d, this.f31785e, this.f31786f, this.f31787g, this.f31788h});
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
        see.m35052a(parcel, 2, this.f31781a, false);
        see.m35042a(parcel, 3, this.f31782b);
        see.m35046a(parcel, 4, this.f31783c, false);
        see.m35066c(parcel, 5, this.f31784d, false);
        see.m35044a(parcel, 6, this.f31785e);
        see.m35040a(parcel, 7, this.f31786f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.f31787g;
        if (userVerificationRequirement != null) {
            str = userVerificationRequirement.f31811d;
        } else {
            str = null;
        }
        see.m35046a(parcel, 8, str, false);
        see.m35040a(parcel, 9, this.f31788h, i, false);
        see.m35062b(parcel, a);
    }
}
