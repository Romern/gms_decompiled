package com.google.android.gms.ads.internal.p012js;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0410w;
import com.google.android.gms.ads.internal.util.C0615am;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.ads.internal.js.y */
final /* synthetic */ class C0507y implements Runnable {

    /* renamed from: a */
    private final C0465au f8507a;

    /* renamed from: b */
    private final C0464at f8508b;

    public C0507y(C0465au auVar, C0464at atVar) {
        this.f8507a = auVar;
        this.f8508b = atVar;
    }

    public final void run() {
        C0497o oVar;
        C0465au auVar = this.f8507a;
        C0464at atVar = this.f8508b;
        try {
            Context context = auVar.f8444b;
            VersionInfoParcel versionInfoParcel = auVar.f8446d;
            if (((Boolean) C0410w.f8370c.mo6621a()).booleanValue()) {
                oVar = new C0489g(context, versionInfoParcel);
            } else {
                oVar = new C0505w(context, versionInfoParcel);
            }
            oVar.mo6676a(new C0446ab(auVar, atVar, oVar));
            oVar.mo6657a("/jsLoaded", new C0449ae(auVar, atVar, oVar));
            C0615am amVar = new C0615am();
            C0450af afVar = new C0450af(auVar, oVar, amVar);
            amVar.f8929a = afVar;
            oVar.mo6657a("/requestReload", afVar);
            if (auVar.f8445c.endsWith(".js")) {
                oVar.mo6677a(auVar.f8445c);
            } else if (auVar.f8445c.startsWith("<html>")) {
                oVar.mo6678b(auVar.f8445c);
            } else {
                oVar.mo6681c(auVar.f8445c);
            }
            C0658o.f9012a.postDelayed(new C0452ah(auVar, atVar, oVar), 60000);
        } catch (Throwable th) {
            C0633h.m5669b("Error creating webview.", th);
            C0387d.m5366d().mo6783a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            atVar.mo6866e();
        }
    }
}
