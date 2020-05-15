package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.client.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0348o extends dcj implements C0350q {
    public C0348o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder getMobileAdsSettingManager(vzr vzr, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeInt(i);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
