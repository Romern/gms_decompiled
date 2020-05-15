package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleSelectViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrk();

    /* renamed from: a */
    public final boolean f31824a;

    /* renamed from: b */
    public final List f31825b;

    public BleSelectViewOptions(boolean z, List list) {
        this.f31824a = z;
        this.f31825b = list;
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.BLE_SELECT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleSelectViewOptions) {
            BleSelectViewOptions bleSelectViewOptions = (BleSelectViewOptions) obj;
            if (this.f31824a != bleSelectViewOptions.f31824a || !sdg.m34949a(this.f31825b, bleSelectViewOptions.f31825b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31824a), this.f31825b});
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("previousPairingAttemptFailed", this.f31824a);
            if (this.f31825b != null) {
                JSONArray jSONArray = new JSONArray();
                for (BleDeviceIdentifier bleDeviceIdentifier : this.f31825b) {
                    JSONObject jSONObject = new JSONObject();
                    bleDeviceIdentifier.mo18754b(jSONObject);
                    jSONArray.put(jSONObject);
                }
                a.put("devicesList", jSONArray);
            }
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31824a);
        see.m35066c(parcel, 3, this.f31825b, false);
        see.m35062b(parcel, a);
    }
}
