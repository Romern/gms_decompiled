package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new yaq();

    /* renamed from: b */
    public final Transport mo18854b() {
        return Transport.NFC;
    }

    /* renamed from: c */
    public final yav mo18855c() {
        return yav.NFC_ENABLE;
    }

    /* renamed from: d */
    public final JSONObject mo18856d() {
        return mo18664a();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof NfcEnableViewOptions);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        see.m35062b(parcel, see.m35030a(parcel));
    }
}
