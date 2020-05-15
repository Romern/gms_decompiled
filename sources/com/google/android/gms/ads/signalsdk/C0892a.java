package com.google.android.gms.ads.signalsdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.signalsdk.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0892a extends dcj implements IInterface {
    public C0892a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    /* renamed from: a */
    public final void mo7121a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(2, bj);
    }
}
