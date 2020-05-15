package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleDeviceIdentifier extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new yaj();

    /* renamed from: a */
    public final String f31954a;

    /* renamed from: b */
    public final String f31955b;

    /* renamed from: c */
    public final boolean f31956c;

    public BleDeviceIdentifier(String str, String str2) {
        this(str, str2, false);
    }

    /* renamed from: a */
    public static BleDeviceIdentifier m23607a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.has("requiresPinPairing")) {
            z = jSONObject.getBoolean("requiresPinPairing");
        } else {
            z = false;
        }
        return new BleDeviceIdentifier(jSONObject.getString("deviceName"), jSONObject.getString("deviceId"), z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleDeviceIdentifier) {
            BleDeviceIdentifier bleDeviceIdentifier = (BleDeviceIdentifier) obj;
            return this.f31955b.equals(bleDeviceIdentifier.f31955b) && this.f31954a.equals(bleDeviceIdentifier.f31954a) && this.f31956c == bleDeviceIdentifier.f31956c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31955b, this.f31954a, Boolean.valueOf(this.f31956c)});
    }

    public BleDeviceIdentifier(String str, String str2, boolean z) {
        sdo.m34959a((Object) str);
        this.f31954a = str;
        sdo.m34959a((Object) str2);
        this.f31955b = str2;
        this.f31956c = z;
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
        see.m35046a(parcel, 2, this.f31954a, false);
        see.m35046a(parcel, 3, this.f31955b, false);
        see.m35051a(parcel, 4, this.f31956c);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject jSONObject = new JSONObject();
        mo18850a(jSONObject, false);
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18850a(JSONObject jSONObject, boolean z) {
        String str;
        String str2 = "scrubbed";
        if (!z) {
            try {
                str = this.f31954a;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            str = str2;
        }
        jSONObject.put("deviceName", str);
        if (!z) {
            str2 = this.f31955b;
        }
        jSONObject.put("deviceId", str2);
        jSONObject.put("requiresPinPairing", this.f31956c);
    }
}
