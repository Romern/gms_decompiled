package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalTransportChallengeViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrn();

    /* renamed from: a */
    public final String f31829a;

    /* renamed from: b */
    public final byte[] f31830b;

    /* renamed from: c */
    public final byte[] f31831c;

    public InternalTransportChallengeViewOptions(String str, byte[] bArr, byte[] bArr2) {
        sdo.m34959a((Object) str);
        this.f31829a = str;
        this.f31830b = bArr;
        this.f31831c = bArr2;
    }

    /* renamed from: a */
    private static String m23523a(byte[] bArr) {
        return boan.f132470d.mo68794a(bArr);
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.INTERNAL;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.INTERNAL_TRANSPORT_CHALLENGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTransportChallengeViewOptions) {
            InternalTransportChallengeViewOptions internalTransportChallengeViewOptions = (InternalTransportChallengeViewOptions) obj;
            if (!this.f31829a.equals(internalTransportChallengeViewOptions.f31829a) || !Arrays.equals(this.f31830b, internalTransportChallengeViewOptions.f31830b) || !Arrays.equals(this.f31831c, internalTransportChallengeViewOptions.f31831c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31829a, this.f31830b, this.f31831c});
    }

    /* renamed from: a */
    public static byte[] m23524a(String str) {
        return boan.f132470d.mo68796b(str);
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
        see.m35046a(parcel, 1, this.f31829a, false);
        see.m35052a(parcel, 2, this.f31830b, false);
        see.m35052a(parcel, 3, this.f31831c, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("rpId", this.f31829a);
            byte[] bArr = this.f31830b;
            if (bArr != null) {
                a.put("keyHandle", m23523a(bArr));
            }
            byte[] bArr2 = this.f31831c;
            if (bArr2 != null) {
                a.put("dataToSign", m23523a(bArr2));
            }
            return a;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
