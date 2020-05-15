package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalTransportChallengeCompletedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrm();

    /* renamed from: a */
    public final int f31827a;

    /* renamed from: b */
    public final byte[] f31828b;

    public InternalTransportChallengeCompletedViewOptions(int i, byte[] bArr) {
        this.f31827a = i;
        this.f31828b = bArr;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("statusCode", this.f31827a);
            byte[] bArr = this.f31828b;
            if (bArr != null) {
                a.put("signedData", boan.f132470d.mo68794a(bArr));
            }
            return a;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.INTERNAL;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.INTERNAL_TRANSPORT_CHALLENGE_COMPLETED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTransportChallengeCompletedViewOptions) {
            InternalTransportChallengeCompletedViewOptions internalTransportChallengeCompletedViewOptions = (InternalTransportChallengeCompletedViewOptions) obj;
            if (this.f31827a != internalTransportChallengeCompletedViewOptions.f31827a || !Arrays.equals(this.f31828b, internalTransportChallengeCompletedViewOptions.f31828b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31827a), this.f31828b});
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
        see.m35063b(parcel, 1, this.f31827a);
        see.m35052a(parcel, 2, this.f31828b, false);
        see.m35062b(parcel, a);
    }
}
