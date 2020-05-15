package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.eventattestation.internal.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0255l extends dcj implements IInterface {
    public C0255l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IImpressionAttestationTokenCallback");
    }

    /* renamed from: a */
    public final void mo6471a(String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(1);
        bj.writeString(str);
        mo8530c(3, bj);
    }
}
