package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.gmsg.C0426e;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.js.ae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0449ae implements C0426e {

    /* renamed from: a */
    final /* synthetic */ C0464at f8415a;

    /* renamed from: b */
    final /* synthetic */ C0497o f8416b;

    /* renamed from: c */
    final /* synthetic */ C0465au f8417c;

    public C0449ae(C0465au auVar, C0464at atVar, C0497o oVar) {
        this.f8417c = auVar;
        this.f8415a = atVar;
        this.f8416b = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6625a(Object obj, Map map) {
        C0466av avVar = (C0466av) obj;
        synchronized (this.f8417c.f8443a) {
            if (this.f8415a.mo6867f() != -1 && this.f8415a.mo6867f() != 1) {
                C0465au auVar = this.f8417c;
                auVar.f8449g = 0;
                auVar.f8447e.mo6649a(this.f8416b);
                this.f8415a.mo6865a(this.f8416b);
                this.f8417c.f8448f = this.f8415a;
            }
        }
    }
}
