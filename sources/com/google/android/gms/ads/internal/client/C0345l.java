package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.C0511b;

/* renamed from: com.google.android.gms.ads.internal.client.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0345l extends dcj implements C0347n {
    public C0345l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder newAdManager(vzr vzr, AdSizeParcel adSizeParcel, String str, C0511b bVar, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, adSizeParcel);
        bj.writeString(str);
        dcl.m8164a(bj, bVar);
        bj.writeInt(i);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }

    public final IBinder newAdManagerByType(vzr vzr, AdSizeParcel adSizeParcel, String str, C0511b bVar, int i, int i2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, adSizeParcel);
        bj.writeString(str);
        dcl.m8164a(bj, bVar);
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
