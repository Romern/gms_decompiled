package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlePairViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xri();

    /* renamed from: a */
    public final BleDeviceIdentifier f31821a;

    public BlePairViewOptions(BleDeviceIdentifier bleDeviceIdentifier) {
        sdo.m34959a(bleDeviceIdentifier);
        this.f31821a = bleDeviceIdentifier;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        this.f31821a.mo18754b(a);
        return a;
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.BLE_PAIR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BlePairViewOptions) {
            return sdg.m34949a(this.f31821a, ((BlePairViewOptions) obj).f31821a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31821a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31821a, i, false);
        see.m35062b(parcel, a);
    }
}
