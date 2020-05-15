package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.formats.client.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0414a extends dcj implements C0416c {
    public C0414a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder newNativeAdViewDelegate(vzr vzr, vzr vzr2, vzr vzr3, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8164a(bj, vzr3);
        bj.writeInt(i);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
