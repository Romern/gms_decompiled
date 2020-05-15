package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.state.C0600g;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.appcontent.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0311b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0312c f8066a;

    public C0311b(C0312c cVar) {
        this.f8066a = cVar;
    }

    public final void run() {
        synchronized (this.f8066a.f8068b) {
            C0312c cVar = this.f8066a;
            if (!cVar.f8069c || !cVar.f8070d) {
                C0633h.m5664a("App is still foreground");
            } else {
                cVar.f8069c = false;
                C0633h.m5664a("App went background");
                for (C0600g gVar : this.f8066a.f8071e) {
                    try {
                        gVar.mo6787a(false);
                    } catch (Exception e) {
                        C0633h.m5666a(e);
                    }
                }
            }
        }
    }
}
