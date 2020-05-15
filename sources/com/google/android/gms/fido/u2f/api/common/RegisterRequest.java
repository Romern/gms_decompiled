package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterRequest extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new xyh();

    /* renamed from: a */
    public final int f31919a;

    /* renamed from: b */
    public final ProtocolVersion f31920b;

    /* renamed from: c */
    public final byte[] f31921c;

    /* renamed from: d */
    public final String f31922d;

    public RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.f31919a = i;
        try {
            this.f31920b = ProtocolVersion.m23585a(str);
            this.f31921c = bArr;
            this.f31922d = str2;
        } catch (xyg e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterRequest) {
            RegisterRequest registerRequest = (RegisterRequest) obj;
            if (Arrays.equals(this.f31921c, registerRequest.f31921c) && this.f31920b == registerRequest.f31920b) {
                String str = this.f31922d;
                if (str != null) {
                    if (!str.equals(registerRequest.f31922d)) {
                        return false;
                    }
                } else if (registerRequest.f31922d != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((Arrays.hashCode(this.f31921c) + 31) * 31) + this.f31920b.hashCode()) * 31;
        String str = this.f31922d;
        return hashCode + (str != null ? str.hashCode() : 0);
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
        see.m35063b(parcel, 1, this.f31919a);
        see.m35046a(parcel, 2, this.f31920b.f31918d, false);
        see.m35052a(parcel, 3, this.f31921c, false);
        see.m35046a(parcel, 4, this.f31922d, false);
        see.m35062b(parcel, a);
    }

    public RegisterRequest(ProtocolVersion protocolVersion, byte[] bArr) {
        boolean z = true;
        this.f31919a = 1;
        sdo.m34959a(protocolVersion);
        this.f31920b = protocolVersion;
        this.f31921c = (byte[]) sdo.m34959a(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            sdo.m34975b(bArr.length != 65 ? false : z, "invalid challengeValue length for V1");
        }
        this.f31922d = null;
    }
}
