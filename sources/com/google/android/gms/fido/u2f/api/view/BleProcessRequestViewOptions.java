package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleProcessRequestViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yam();

    /* renamed from: a */
    public final BleDeviceIdentifier f31960a;

    /* renamed from: b */
    public final boolean f31961b;

    public BleProcessRequestViewOptions(BleDeviceIdentifier bleDeviceIdentifier, boolean z) {
        sdo.m34959a(bleDeviceIdentifier);
        this.f31960a = bleDeviceIdentifier;
        this.f31961b = z;
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
    private final JSONObject m23618a(boolean z) {
        JSONObject a = super.mo18664a();
        try {
            this.f31960a.mo18850a(a, z);
            if (this.f31961b) {
                a.put("tupNeeded", true);
            }
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18854b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final yav mo18855c() {
        return yav.BLE_PROCESS_REQUEST;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return m23618a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleProcessRequestViewOptions) {
            BleProcessRequestViewOptions bleProcessRequestViewOptions = (BleProcessRequestViewOptions) obj;
            return this.f31961b == bleProcessRequestViewOptions.f31961b && sdg.m34949a(this.f31960a, bleProcessRequestViewOptions.f31960a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31961b), this.f31960a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31960a, i, false);
        see.m35051a(parcel, 3, this.f31961b);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        return m23618a(false);
    }
}
