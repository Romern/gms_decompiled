package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.promise.C0662c;

/* renamed from: com.google.android.gms.ads.internal.js.ai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0453ai implements C0662c {

    /* renamed from: a */
    final /* synthetic */ C0464at f8425a;

    /* renamed from: b */
    final /* synthetic */ C0465au f8426b;

    public C0453ai(C0465au auVar, C0464at atVar) {
        this.f8426b = auVar;
        this.f8425a = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6648a(Object obj) {
        C0497o oVar = (C0497o) obj;
        synchronized (this.f8426b.f8443a) {
            C0465au auVar = this.f8426b;
            auVar.f8449g = 0;
            C0464at atVar = auVar.f8448f;
            if (atVar != null) {
                if (this.f8425a != atVar) {
                    atVar.mo6654c();
                }
            }
            this.f8426b.f8448f = this.f8425a;
        }
    }
}
