package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yar();

    /* renamed from: a */
    public final boolean f31967a;

    /* renamed from: b */
    public final boolean f31968b;

    public NfcViewOptions() {
        this(false, false);
    }

    /* renamed from: a */
    public final JSONObject mo18664a() {
        JSONObject a = super.mo18664a();
        try {
            a.put("deviceRemovedTooSoon", this.f31967a);
            a.put("recommendUsb", this.f31968b);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Transport mo18854b() {
        return Transport.NFC;
    }

    /* renamed from: c */
    public final yav mo18855c() {
        return yav.NFC;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return mo18664a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NfcViewOptions) {
            NfcViewOptions nfcViewOptions = (NfcViewOptions) obj;
            return this.f31967a == nfcViewOptions.f31967a && this.f31968b == nfcViewOptions.f31968b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31967a), Boolean.valueOf(this.f31968b)});
    }

    public NfcViewOptions(boolean z, boolean z2) {
        this.f31967a = z;
        this.f31968b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f31967a);
        see.m35051a(parcel, 3, this.f31968b);
        see.m35062b(parcel, a);
    }
}
