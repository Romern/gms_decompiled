package com.google.android.gms.ads.internal.p012js;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.webview.C0705o;
import com.google.android.gms.ads.internal.webview2.C0726j;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0489g extends C0496n implements C0497o, C0491i {

    /* renamed from: a */
    public final C0726j f8485a;

    /* renamed from: b */
    public C0446ab f8486b;

    public C0489g(Context context, VersionInfoParcel versionInfoParcel) {
        try {
            C0726j jVar = new C0726j(context, new C0472f(this));
            this.f8485a = jVar;
            jVar.setWillNotDraw(true);
            this.f8485a.addJavascriptInterface(new C0471e(this), "GoogleJsInterface");
            C0387d.m5363a().mo6851a(context, versionInfoParcel.f8949a, this.f8485a.getSettings());
            this.f8493c = this;
        } catch (Throwable th) {
            throw new C0705o("Init failed.", th);
        }
    }

    /* renamed from: a */
    public final void mo6675a() {
        this.f8485a.destroy();
    }

    /* renamed from: a */
    public final void mo6676a(C0446ab abVar) {
        this.f8486b = abVar;
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
        C0645d.f8976d.execute(new C0468b(this, str));
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
        C0645d.f8976d.execute(new C0470d(this, str));
    }

    /* renamed from: c */
    public final void mo6681c(String str) {
        C0645d.f8976d.execute(new C0469c(this, str));
    }

    /* renamed from: a */
    public final void mo6677a(String str) {
        mo6678b(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    /* renamed from: b */
    public final boolean mo6679b() {
        return this.f8485a.mo7017m();
    }
}
