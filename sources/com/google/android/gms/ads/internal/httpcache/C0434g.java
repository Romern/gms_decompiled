package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.ads.internal.httpcache.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0434g extends dcj implements C0436i {
    public C0434g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo6478a(HttpRequestParcel httpRequestParcel) {
        throw null;
    }

    /* renamed from: a */
    public final void mo6479a(HttpRequestParcel httpRequestParcel, C0433f fVar) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, httpRequestParcel);
        dcl.m8164a(bj, fVar);
        mo8530c(2, bj);
    }
}
