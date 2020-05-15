package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisteredKey extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new xyl();

    /* renamed from: a */
    public final KeyHandle f31934a;

    /* renamed from: b */
    public final String f31935b;

    /* renamed from: c */
    public String f31936c;

    public RegisteredKey(KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f31936c;
        if (str == null) {
            if (registeredKey.f31936c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f31936c)) {
            return false;
        }
        if (!this.f31934a.equals(registeredKey.f31934a)) {
            return false;
        }
        String str2 = this.f31935b;
        if (str2 != null) {
            if (!str2.equals(registeredKey.f31935b)) {
                return false;
            }
        } else if (registeredKey.f31935b != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f31936c;
        int i = 0;
        int hashCode = ((((str != null ? str.hashCode() : 0) + 31) * 31) + this.f31934a.hashCode()) * 31;
        String str2 = this.f31935b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f31934a.f31911b, 11));
            if (this.f31934a.f31912c != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.f31934a.f31912c.f31918d);
            }
            List list = this.f31934a.f31913d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f31936c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f31935b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        sdo.m34959a(keyHandle);
        this.f31934a = keyHandle;
        this.f31936c = str;
        this.f31935b = str2;
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
        see.m35040a(parcel, 2, this.f31934a, i, false);
        see.m35046a(parcel, 3, this.f31936c, false);
        see.m35046a(parcel, 4, this.f31935b, false);
        see.m35062b(parcel, a);
    }
}
