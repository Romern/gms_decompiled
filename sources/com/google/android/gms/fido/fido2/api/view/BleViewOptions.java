package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrl();

    /* renamed from: a */
    public final boolean f31826a;

    public BleViewOptions() {
        this(false);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("anyFido2DevicesPaired", this.f31826a);
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
        return xrv.BLE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BleViewOptions) || this.f31826a != ((BleViewOptions) obj).f31826a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31826a)});
    }

    public BleViewOptions(boolean z) {
        this.f31826a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31826a);
        see.m35062b(parcel, a);
    }
}
