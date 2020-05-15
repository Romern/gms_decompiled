package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NfcEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new xrq();

    /* renamed from: b */
    public final Transport mo18758b() {
        return Transport.NFC;
    }

    /* renamed from: c */
    public final xrv mo18759c() {
        return xrv.NFC_ENABLE;
    }

    public final boolean equals(Object obj) {
        return obj instanceof NfcEnableViewOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        see.m35062b(parcel, see.m35030a(parcel));
    }
}
