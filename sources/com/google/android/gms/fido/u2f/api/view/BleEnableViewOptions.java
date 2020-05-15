package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yak();

    /* renamed from: a */
    public final boolean f31957a;

    /* renamed from: b */
    public final boolean f31958b;

    public BleEnableViewOptions(boolean z, boolean z2) {
        this.f31957a = z;
        this.f31958b = z2;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("bluetoothEnabled", this.f31957a);
            a.put("locationServiceEnabled", this.f31958b);
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
        return yav.BLE_ENABLE;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return mo18664a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleEnableViewOptions) {
            BleEnableViewOptions bleEnableViewOptions = (BleEnableViewOptions) obj;
            return this.f31957a == bleEnableViewOptions.f31957a && this.f31958b == bleEnableViewOptions.f31958b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31957a), Boolean.valueOf(this.f31958b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31957a);
        see.m35051a(parcel, 3, this.f31958b);
        see.m35062b(parcel, a);
    }
}
