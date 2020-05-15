package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleSelectViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yan();

    /* renamed from: a */
    public final boolean f31962a;

    /* renamed from: b */
    public final List f31963b;

    public BleSelectViewOptions(boolean z) {
        this(z, (List) null);
    }

    /* renamed from: a */
    private final JSONObject m23623a(boolean z) {
        JSONObject jSONObject;
        JSONObject a = super.mo18664a();
        try {
            a.put("previousPairingAttemptFailed", this.f31962a);
            if (this.f31963b != null) {
                JSONArray jSONArray = new JSONArray();
                for (BleDeviceIdentifier bleDeviceIdentifier : this.f31963b) {
                    if (z) {
                        jSONObject = new JSONObject();
                        bleDeviceIdentifier.mo18850a(jSONObject, true);
                    } else {
                        jSONObject = bleDeviceIdentifier.mo18664a();
                    }
                    jSONArray.put(jSONObject);
                }
                a.put("devicesList", jSONArray);
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
        return yav.BLE_SELECT;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return m23623a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleSelectViewOptions) {
            BleSelectViewOptions bleSelectViewOptions = (BleSelectViewOptions) obj;
            return this.f31962a == bleSelectViewOptions.f31962a && sdg.m34949a(this.f31963b, bleSelectViewOptions.f31963b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31962a), this.f31963b});
    }

    public BleSelectViewOptions(boolean z, Collection collection) {
        this.f31962a = z;
        this.f31963b = collection != null ? new ArrayList(collection) : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31962a);
        see.m35066c(parcel, 3, this.f31963b, false);
        see.m35062b(parcel, a);
    }

    public BleSelectViewOptions(boolean z, List list) {
        this.f31962a = z;
        this.f31963b = list;
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        return m23623a(false);
    }
}
