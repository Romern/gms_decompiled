package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.future.C0645d;

/* renamed from: com.google.android.gms.ads.internal.js.ac */
final /* synthetic */ class C0447ac implements Runnable {

    /* renamed from: a */
    private final C0465au f8411a;

    /* renamed from: b */
    private final C0464at f8412b;

    /* renamed from: c */
    private final C0497o f8413c;

    public C0447ac(C0465au auVar, C0464at atVar, C0497o oVar) {
        this.f8411a = auVar;
        this.f8412b = atVar;
        this.f8413c = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return;
     */
    public final void run() {
        C0465au auVar = this.f8411a;
        C0464at atVar = this.f8412b;
        C0497o oVar = this.f8413c;
        synchronized (auVar.f8443a) {
            if (atVar.mo6867f() != -1 && atVar.mo6867f() != 1) {
                atVar.mo6866e();
                bqgj bqgj = C0645d.f8976d;
                oVar.getClass();
                bqgj.execute(new C0448ad(oVar));
            }
        }
    }
}
