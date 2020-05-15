package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrh();

    /* renamed from: a */
    public final boolean f31819a;

    /* renamed from: b */
    public final boolean f31820b;

    public BleEnableViewOptions(boolean z, boolean z2) {
        this.f31819a = z;
        this.f31820b = z2;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("bluetoothEnabled", this.f31819a);
            a.put("locationServiceEnabled", this.f31820b);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.BLE_ENABLE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BleEnableViewOptions) {
            BleEnableViewOptions bleEnableViewOptions = (BleEnableViewOptions) obj;
            if (this.f31819a == bleEnableViewOptions.f31819a && this.f31820b == bleEnableViewOptions.f31820b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31819a), Boolean.valueOf(this.f31820b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31819a);
        see.m35051a(parcel, 3, this.f31820b);
        see.m35062b(parcel, a);
    }
}
