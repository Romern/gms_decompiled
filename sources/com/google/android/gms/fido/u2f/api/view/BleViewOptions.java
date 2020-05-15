package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yao();

    /* renamed from: a */
    public final boolean f31964a;

    public BleViewOptions() {
        this(false);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("anyU2fDevicesPaired", this.f31964a);
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
        return yav.BLE;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return mo18664a();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BleViewOptions) && this.f31964a == ((BleViewOptions) obj).f31964a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31964a)});
    }

    public BleViewOptions(boolean z) {
        this.f31964a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31964a);
        see.m35062b(parcel, a);
    }
}
