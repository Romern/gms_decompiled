package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.future.C0645d;

/* renamed from: com.google.android.gms.ads.internal.js.ah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0452ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0464at f8422a;

    /* renamed from: b */
    final /* synthetic */ C0497o f8423b;

    /* renamed from: c */
    final /* synthetic */ C0465au f8424c;

    public C0452ah(C0465au auVar, C0464at atVar, C0497o oVar) {
        this.f8424c = auVar;
        this.f8422a = atVar;
        this.f8423b = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return;
     */
    public final void run() {
        synchronized (this.f8424c.f8443a) {
            if (this.f8422a.mo6867f() != -1 && this.f8422a.mo6867f() != 1) {
                this.f8422a.mo6866e();
                bqgj bqgj = C0645d.f8976d;
                C0497o oVar = this.f8423b;
                oVar.getClass();
                bqgj.execute(new C0451ag(oVar));
            }
        }
    }
}
