package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.gmsg.C0426e;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.js.l */
final /* synthetic */ class C0494l implements Runnable {

    /* renamed from: a */
    private final C0496n f8488a;

    /* renamed from: b */
    private final C0426e f8489b;

    /* renamed from: c */
    private final Map f8490c;

    public C0494l(C0496n nVar, C0426e eVar, Map map) {
        this.f8488a = nVar;
        this.f8489b = eVar;
        this.f8490c = map;
    }

    public final void run() {
        C0496n nVar = this.f8488a;
        this.f8489b.mo6625a(nVar.f8493c, this.f8490c);
    }
}
