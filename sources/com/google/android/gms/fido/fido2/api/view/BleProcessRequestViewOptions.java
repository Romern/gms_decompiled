package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleProcessRequestViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrj();

    /* renamed from: a */
    public final BleDeviceIdentifier f31822a;

    /* renamed from: b */
    public final boolean f31823b;

    public BleProcessRequestViewOptions(BleDeviceIdentifier bleDeviceIdentifier, boolean z) {
        sdo.m34959a(bleDeviceIdentifier);
        this.f31822a = bleDeviceIdentifier;
        this.f31823b = z;
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.BLE_PROCESS_REQUEST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleProcessRequestViewOptions) {
            BleProcessRequestViewOptions bleProcessRequestViewOptions = (BleProcessRequestViewOptions) obj;
            if (this.f31823b != bleProcessRequestViewOptions.f31823b || !sdg.m34949a(this.f31822a, bleProcessRequestViewOptions.f31822a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31823b), this.f31822a});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{org.json.JSONObject.put(java.lang.String, double):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, long):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, int):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, java.lang.Object):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException} */
    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            this.f31822a.mo18754b(a);
            if (this.f31823b) {
                a.put("tupNeeded", true);
            }
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31822a, i, false);
        see.m35051a(parcel, 3, this.f31823b);
        see.m35062b(parcel, a);
    }
}
