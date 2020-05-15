package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrr();

    /* renamed from: a */
    public final boolean f31834a;

    /* renamed from: b */
    public final boolean f31835b;

    public NfcViewOptions() {
        this(false, false);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("deviceRemovedTooSoon", this.f31834a);
            a.put("recommendUsb", this.f31835b);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.NFC;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.NFC;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NfcViewOptions) {
            NfcViewOptions nfcViewOptions = (NfcViewOptions) obj;
            if (this.f31834a == nfcViewOptions.f31834a && this.f31835b == nfcViewOptions.f31835b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31834a), Boolean.valueOf(this.f31835b)});
    }

    public NfcViewOptions(boolean z, boolean z2) {
        this.f31834a = z;
        this.f31835b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31834a);
        see.m35051a(parcel, 3, this.f31835b);
        see.m35062b(parcel, a);
    }
}
