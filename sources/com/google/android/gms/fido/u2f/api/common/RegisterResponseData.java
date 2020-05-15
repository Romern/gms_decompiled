package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new xyk();

    /* renamed from: a */
    public final byte[] f31931a;

    /* renamed from: b */
    public final ProtocolVersion f31932b;

    /* renamed from: c */
    public final String f31933c;

    public RegisterResponseData(byte[] bArr, ProtocolVersion protocolVersion, String str) {
        boolean z;
        this.f31931a = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a(protocolVersion);
        this.f31932b = protocolVersion;
        boolean z2 = true;
        if (protocolVersion != ProtocolVersion.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (protocolVersion == ProtocolVersion.V1) {
            sdo.m34974b(str != null ? false : z2);
            this.f31933c = null;
            return;
        }
        sdo.m34959a((Object) str);
        this.f31933c = str;
    }

    /* renamed from: a */
    private static final String m23592a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RegisterResponseData) {
            RegisterResponseData registerResponseData = (RegisterResponseData) obj;
            if (!sdg.m34949a(this.f31932b, registerResponseData.f31932b) || !Arrays.equals(this.f31931a, registerResponseData.f31931a) || !sdg.m34949a(this.f31933c, registerResponseData.f31933c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31932b, Integer.valueOf(Arrays.hashCode(this.f31931a)), this.f31933c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("protocolVersion", this.f31932b);
        a.mo66885a("registerData", boan.f132472f.mo68794a(this.f31931a));
        String str = this.f31933c;
        if (str != null) {
            a.mo66885a("clientDataString", str);
        }
        return a.toString();
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", m23592a(this.f31931a));
            jSONObject.put("version", this.f31932b.f31918d);
            String str = this.f31933c;
            if (str != null) {
                jSONObject.put("clientData", m23592a(str.getBytes()));
            }
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
        see.m35052a(parcel, 2, this.f31931a, false);
        see.m35046a(parcel, 3, this.f31932b.f31918d, false);
        see.m35046a(parcel, 4, this.f31933c, false);
        see.m35062b(parcel, a);
    }

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.f31931a = bArr;
        try {
            this.f31932b = ProtocolVersion.m23585a(str);
            this.f31933c = str2;
        } catch (xyg e) {
            throw new IllegalArgumentException(e);
        }
    }
}
