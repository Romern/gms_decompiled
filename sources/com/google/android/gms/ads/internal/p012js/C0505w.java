package com.google.android.gms.ads.internal.p012js;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0410w;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.util.C0616an;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.C0689ae;
import com.google.android.gms.ads.internal.webview.C0691ag;
import com.google.android.gms.ads.internal.webview.C0699i;
import com.google.android.gms.ads.internal.webview.C0704n;
import com.google.android.gms.ads.internal.webview.C0705o;
import com.google.android.gms.ads.internal.webview.C0706p;
import com.google.android.gms.ads.internal.webview2.C0719c;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.w */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0505w implements C0497o, C0491i {

    /* renamed from: a */
    public final C0699i f8506a;

    public C0505w(Context context, VersionInfoParcel versionInfoParcel) {
        C0699i iVar;
        C0706p pVar = C0387d.f8300a.f8302c;
        C0691ag agVar = new C0691ag();
        C0327b bVar = new C0327b();
        C0371o.m5339a(context);
        if (!((Boolean) C0410w.f8369b.mo6621a()).booleanValue()) {
            try {
                iVar = (C0699i) C0616an.m5620a(new C0704n(context, agVar, "", versionInfoParcel, bVar));
            } catch (Throwable th) {
                throw new C0705o("Webview initialization failed.", th);
            }
        } else {
            try {
                iVar = (C0699i) C0616an.m5620a(new C0719c(context, agVar, "", versionInfoParcel, bVar));
            } catch (Throwable th2) {
                C0387d.m5366d().mo6783a(th2, "AdWebViewFactory.newAdWebView2");
                throw new C0705o("Webview initialization failed.", th2);
            }
        }
        this.f8506a = iVar;
        iVar.mo6917b().setWillNotDraw(true);
    }

    /* renamed from: a */
    private static final void m5495a(Runnable runnable) {
        if (C0341h.m5274a().mo6806a()) {
            runnable.run();
        } else {
            C0658o.f9012a.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo6659a(String str, String str2) {
        C0490h.m5473a(this, str, str2);
    }

    /* renamed from: a */
    public final void mo6641a(String str, JSONObject jSONObject) {
        throw null;
    }

    /* renamed from: b */
    public final void mo6678b(String str) {
        m5495a(new C0502t(this, str));
    }

    /* renamed from: b */
    public final void mo6660b(String str, JSONObject jSONObject) {
        C0490h.m5474a(this, str, jSONObject);
    }

    /* renamed from: c */
    public final C0467aw mo6680c() {
        return new C0467aw(this);
    }

    /* renamed from: d */
    public final void mo6661d(String str) {
        m5495a(new C0498p(this, str));
    }

    /* renamed from: b */
    public final void mo6658b(String str, C0426e eVar) {
        this.f8506a.mo6915a(str, new C0499q(eVar));
    }

    /* renamed from: c */
    public final void mo6681c(String str) {
        m5495a(new C0503u(this, str));
    }

    /* renamed from: a */
    public final void mo6675a() {
        this.f8506a.destroy();
    }

    /* renamed from: a */
    public final void mo6676a(C0446ab abVar) {
        C0689ae g = this.f8506a.mo6923g();
        abVar.getClass();
        g.mo6886a(new C0500r(abVar));
    }

    /* renamed from: b */
    public final boolean mo6679b() {
        return this.f8506a.mo6935m();
    }

    /* renamed from: a */
    public final void mo6677a(String str) {
        m5495a(new C0501s(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    /* renamed from: a */
    public final void mo6657a(String str, C0426e eVar) {
        this.f8506a.mo6914a(str, new C0504v(this, eVar));
    }
}
