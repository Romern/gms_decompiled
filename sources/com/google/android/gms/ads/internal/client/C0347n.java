package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.mediation.client.C0511b;

/* renamed from: com.google.android.gms.ads.internal.client.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface C0347n extends IInterface {
    IBinder newAdManager(vzr vzr, AdSizeParcel adSizeParcel, String str, C0511b bVar, int i);

    IBinder newAdManagerByType(vzr vzr, AdSizeParcel adSizeParcel, String str, C0511b bVar, int i, int i2);
}
