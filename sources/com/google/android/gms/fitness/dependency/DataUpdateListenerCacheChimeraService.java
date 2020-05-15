package com.google.android.gms.fitness.dependency;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataUpdateListenerCacheChimeraService extends TracingIntentService {

    /* renamed from: a */
    private static final srn f32189a = zvt.m46581a();

    public DataUpdateListenerCacheChimeraService() {
        super(DataUpdateListenerCacheChimeraService.class.getSimpleName());
    }

    /* renamed from: a */
    private final ytk m23697a() {
        return yzq.m45107a(this).mo30889j();
    }

    /* renamed from: b */
    private final void m23698b(Intent intent) {
        if (rsk.m34335a(intent) && rsk.m34336b(intent) == 2) {
            m23697a().mo30749a(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        try {
            m23698b(intent);
        } catch (BadParcelableException e) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.location.cache.cache_type", 2);
            bundle.putBoolean("com.google.android.location.cache.is_cache", true);
            intent.replaceExtras(bundle);
            m23698b(intent);
            m23697a().mo30748a();
            bnsl bnsl = (bnsl) f32189a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.dependency.DataUpdateListenerCacheChimeraService", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Found bad intent, had to clear it.");
        }
    }
}
