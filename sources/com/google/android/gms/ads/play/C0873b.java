package com.google.android.gms.ads.play;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.play.b */
final /* synthetic */ class C0873b implements Runnable {

    /* renamed from: a */
    private final C0874c f9414a;

    /* renamed from: b */
    private final bnj f9415b;

    public C0873b(C0874c cVar, bnj bnj) {
        this.f9414a = cVar;
        this.f9415b = bnj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    public final void run() {
        Bundle bundle;
        Exception e;
        C0874c cVar = this.f9414a;
        try {
            bundle = this.f9415b.mo3299a(new int[]{1});
            try {
                C0633h.m5670c("Successfully received play store parental controls the result.");
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("success", true);
                bundle.putBoolean("is_cacheable", true);
                bundle.putBoolean("is_service_available", true);
            } catch (Exception e2) {
                e = e2;
                try {
                    C0633h.m5669b("Error while retrieving parental controls.", e);
                    skh.m35531a().mo25693b(cVar.f9417b, cVar);
                    if (bundle == null) {
                    }
                    cVar.f9416a.mo6830a(bundle);
                } catch (Throwable th) {
                    skh.m35531a().mo25693b(cVar.f9417b, cVar);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bundle = null;
            C0633h.m5669b("Error while retrieving parental controls.", e);
            skh.m35531a().mo25693b(cVar.f9417b, cVar);
            if (bundle == null) {
            }
            cVar.f9416a.mo6830a(bundle);
        }
        skh.m35531a().mo25693b(cVar.f9417b, cVar);
        if (bundle == null) {
            bundle = new Bundle();
            bundle.putBoolean("success", false);
            bundle.putBoolean("is_cacheable", false);
            bundle.putBoolean("is_service_available", true);
        }
        cVar.f9416a.mo6830a(bundle);
    }
}
