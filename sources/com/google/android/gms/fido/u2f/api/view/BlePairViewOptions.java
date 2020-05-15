package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlePairViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yal();

    /* renamed from: a */
    public final BleDeviceIdentifier f31959a;

    public BlePairViewOptions(BleDeviceIdentifier bleDeviceIdentifier) {
        sdo.m34959a(bleDeviceIdentifier);
        this.f31959a = bleDeviceIdentifier;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        this.f31959a.mo18850a(a, false);
        return a;
    }

    /* renamed from: b */
    public final Transport mo18854b() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: c */
    public final yav mo18855c() {
        return yav.BLE_PAIR;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        JSONObject a = super.mo18664a();
        this.f31959a.mo18850a(a, true);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlePairViewOptions) {
            return sdg.m34949a(this.f31959a, ((BlePairViewOptions) obj).f31959a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31959a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31959a, i, false);
        see.m35062b(parcel, a);
    }
}
