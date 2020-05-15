package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleDeviceIdentifier extends AbstractSafeParcelable implements xhm {
    public static final Parcelable.Creator CREATOR = new xrg();

    /* renamed from: a */
    public final String f31816a;

    /* renamed from: b */
    public final String f31817b;

    /* renamed from: c */
    public final boolean f31818c;

    public BleDeviceIdentifier(String str, String str2) {
        this(str, str2, false);
    }

    /* renamed from: a */
    public static BleDeviceIdentifier m23502a(JSONObject jSONObject) {
        boolean z;
        sdo.m34959a(jSONObject);
        if (jSONObject.has("requiresPinPairing")) {
            z = jSONObject.getBoolean("requiresPinPairing");
        } else {
            z = false;
        }
        return new BleDeviceIdentifier(jSONObject.getString("deviceName"), jSONObject.getString("deviceId"), z);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18754b(JSONObject jSONObject) {
        try {
            jSONObject.put("deviceName", this.f31816a);
            jSONObject.put("deviceId", this.f31817b);
            jSONObject.put("requiresPinPairing", this.f31818c);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleDeviceIdentifier) {
            BleDeviceIdentifier bleDeviceIdentifier = (BleDeviceIdentifier) obj;
            if (!this.f31817b.equals(bleDeviceIdentifier.f31817b) || !this.f31816a.equals(bleDeviceIdentifier.f31816a) || this.f31818c != bleDeviceIdentifier.f31818c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31817b, this.f31816a, Boolean.valueOf(this.f31818c)});
    }

    public BleDeviceIdentifier(String str, String str2, boolean z) {
        sdo.m34959a((Object) str);
        this.f31816a = str;
        sdo.m34959a((Object) str2);
        this.f31817b = str2;
        this.f31818c = z;
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
        see.m35046a(parcel, 2, this.f31816a, false);
        see.m35046a(parcel, 3, this.f31817b, false);
        see.m35051a(parcel, 4, this.f31818c);
        see.m35062b(parcel, a);
    }
}
