package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.C0511b;

/* renamed from: com.google.android.gms.ads.internal.reward.client.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0574a extends dcj implements C0576c {
    public C0574a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public final IBinder newRewardedVideoAd(vzr vzr, C0511b bVar, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, bVar);
        bj.writeInt(i);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
