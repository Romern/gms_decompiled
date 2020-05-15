package com.google.android.gms.ads.internal.cache;

/* renamed from: com.google.android.gms.ads.internal.cache.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0320b {

    /* renamed from: a */
    public final Object f8090a = new Object();

    public C0320b() {
        new C0319a(this);
    }

    /* renamed from: a */
    public final CacheEntryParcel mo6560a() {
        CacheEntryParcel cacheEntryParcel;
        synchronized (this.f8090a) {
            cacheEntryParcel = new CacheEntryParcel();
        }
        return cacheEntryParcel;
    }
}
