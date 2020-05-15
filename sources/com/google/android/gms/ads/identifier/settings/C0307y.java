package com.google.android.gms.ads.identifier.settings;

import android.util.LruCache;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* renamed from: com.google.android.gms.ads.identifier.settings.y */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0307y {

    /* renamed from: a */
    private final LruCache f8056a;

    public C0307y() {
        this.f8056a = cbvp.m128516c() > 0 ? new LruCache((int) cbvp.m128516c()) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bqkp mo6534a(String str) {
        LruCache lruCache;
        Pair pair;
        lruCache = this.f8056a;
        return (lruCache == null || (pair = (Pair) lruCache.get(str)) == null || System.currentTimeMillis() - ((Long) pair.first).longValue() > cbvp.f178349a.mo6606a().mo75431c()) ? null : (bqkp) ((SoftReference) pair.second).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo6535a(String str, bqkp bqkp) {
        LruCache lruCache = this.f8056a;
        if (lruCache != null) {
            lruCache.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), new SoftReference(bqkp)));
        }
    }
}
