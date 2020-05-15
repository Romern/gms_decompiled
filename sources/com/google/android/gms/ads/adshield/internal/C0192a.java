package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.adshield.internal.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0192a extends dcj implements C0194c {
    public C0192a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder newAdShieldClient(String str, vzr vzr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }

    public final IBinder newAdShieldClientWithoutAdvertisingId(String str, vzr vzr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, vzr);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
