package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenBinding extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new xqo();

    /* renamed from: a */
    public final TokenBindingStatus f31799a;

    /* renamed from: b */
    public final String f31800b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator CREATOR = new xqm();

        /* renamed from: d */
        public final String f31805d;

        private TokenBindingStatus(String str) {
            this.f31805d = str;
        }

        /* renamed from: a */
        public static TokenBindingStatus m23500a(String str) {
            TokenBindingStatus[] values = values();
            for (TokenBindingStatus tokenBindingStatus : values) {
                if (str.equals(tokenBindingStatus.f31805d)) {
                    return tokenBindingStatus;
                }
            }
            throw new xqn(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.f31805d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f31805d);
        }
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.f31805d, null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.f31805d, null);
    }

    public TokenBinding(String str, String str2) {
        sdo.m34959a((Object) str);
        try {
            this.f31799a = TokenBindingStatus.m23500a(str);
            this.f31800b = str2;
        } catch (xqn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenBinding) {
            TokenBinding tokenBinding = (TokenBinding) obj;
            if (!bmxi.m108538a(this.f31799a, tokenBinding.f31799a) || !bmxi.m108538a(this.f31800b, tokenBinding.f31800b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31799a, this.f31800b});
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f31799a.f31805d, false);
        see.m35046a(parcel, 3, this.f31800b, false);
        see.m35062b(parcel, a);
    }
}
