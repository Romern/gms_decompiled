package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyHandle extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new xye();

    /* renamed from: a */
    public final int f31910a;

    /* renamed from: b */
    public final byte[] f31911b;

    /* renamed from: c */
    public final ProtocolVersion f31912c;

    /* renamed from: d */
    public final List f31913d;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.f31910a = i;
        this.f31911b = bArr;
        try {
            this.f31912c = ProtocolVersion.m23585a(str);
            this.f31913d = list;
        } catch (xyg e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyHandle) {
            KeyHandle keyHandle = (KeyHandle) obj;
            if (Arrays.equals(this.f31911b, keyHandle.f31911b) && this.f31912c.equals(keyHandle.f31912c)) {
                List list2 = this.f31913d;
                if (list2 == null && keyHandle.f31913d == null) {
                    return true;
                }
                return list2 != null && (list = keyHandle.f31913d) != null && list2.containsAll(list) && keyHandle.f31913d.containsAll(this.f31913d);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f31911b)), this.f31912c, this.f31913d});
    }

    public final String toString() {
        String str;
        List list = this.f31913d;
        if (list != null) {
            str = list.toString();
        } else {
            str = "null";
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", sqd.m35968b(this.f31911b), this.f31912c, str);
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
        see.m35063b(parcel, 1, this.f31910a);
        see.m35052a(parcel, 2, this.f31911b, false);
        see.m35046a(parcel, 3, this.f31912c.f31918d, false);
        see.m35066c(parcel, 4, this.f31913d, false);
        see.m35062b(parcel, a);
    }

    public KeyHandle(byte[] bArr, ProtocolVersion protocolVersion, List list) {
        this.f31910a = 1;
        this.f31911b = bArr;
        this.f31912c = protocolVersion;
        this.f31913d = list;
    }
}
