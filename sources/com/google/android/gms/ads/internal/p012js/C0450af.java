package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.util.C0615am;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.js.af */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0450af implements C0426e {

    /* renamed from: a */
    final /* synthetic */ C0497o f8418a;

    /* renamed from: b */
    final /* synthetic */ C0615am f8419b;

    /* renamed from: c */
    final /* synthetic */ C0465au f8420c;

    public C0450af(C0465au auVar, C0497o oVar, C0615am amVar) {
        this.f8420c = auVar;
        this.f8418a = oVar;
        this.f8419b = amVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.ads.internal.gmsg.e, java.lang.Object], assign insn: 0x0026: IGET  (r1v1 ? I:java.lang.Object) = (r1v0 com.google.android.gms.ads.internal.util.am) com.google.android.gms.ads.internal.util.am.a java.lang.Object */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6625a(Object obj, Map map) {
        C0466av avVar = (C0466av) obj;
        synchronized (this.f8420c.f8443a) {
            C0633h.m5670c("JS Engine is requesting an update");
            if (this.f8420c.f8449g == 0) {
                C0633h.m5670c("Starting reload.");
                C0465au auVar = this.f8420c;
                auVar.f8449g = 2;
                auVar.mo6656a();
            }
            this.f8418a.mo6658b("/requestReload", (C0426e) this.f8419b.f8929a);
        }
    }
}
