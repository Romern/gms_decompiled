package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.ads.internal.httpcache.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0431d extends dcj implements C0433f {
    public C0431d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* renamed from: a */
    public final void mo6633a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(1, bj);
    }
}
