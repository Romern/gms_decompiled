package com.google.android.gms.smartdevice.d2d.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aria();

    /* renamed from: a */
    public arit f108000a;

    /* renamed from: b */
    public ConnectionRequest f108001b;

    /* renamed from: c */
    public ariq f108002c;

    private ConnectParams() {
    }

    public ConnectParams(arit arit, ConnectionRequest connectionRequest, ariq ariq) {
        this.f108000a = arit;
        this.f108001b = connectionRequest;
        this.f108002c = ariq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        arit arit = this.f108000a;
        IBinder iBinder2 = null;
        if (arit != null) {
            iBinder = arit.asBinder();
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 1, iBinder);
        see.m35040a(parcel, 2, this.f108001b, i, false);
        ariq ariq = this.f108002c;
        if (ariq != null) {
            iBinder2 = ariq.asBinder();
        }
        see.m35038a(parcel, 3, iBinder2);
        see.m35062b(parcel, a);
    }
}
