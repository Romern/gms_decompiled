package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.augmentedreality.C0316a;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.overlay.C0520c;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.C0679a;
import com.google.android.gms.ads.internal.video.C0680b;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.webview.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0709s extends FrameLayout implements C0699i {

    /* renamed from: a */
    public final C0699i f9062a;

    /* renamed from: b */
    private final C0680b f9063b;

    /* renamed from: c */
    private final AtomicBoolean f9064c = new AtomicBoolean();

    public C0709s(C0699i iVar) {
        super(iVar.getContext());
        this.f9062a = iVar;
        this.f9063b = new C0680b(iVar.mo6919d());
        if (!mo6941r()) {
            addView(this.f9062a.mo6917b());
        }
    }

    /* renamed from: a */
    public final WebView mo6913a() {
        return this.f9062a.mo6913a();
    }

    /* renamed from: b */
    public final View mo6917b() {
        return this;
    }

    /* renamed from: b */
    public final void mo6660b(String str, JSONObject jSONObject) {
        throw null;
    }

    /* renamed from: c */
    public final Activity mo6918c() {
        return this.f9062a.mo6918c();
    }

    /* renamed from: d */
    public final Context mo6919d() {
        return this.f9062a.mo6919d();
    }

    public final void destroy() {
        if (mo6931k() != null) {
            C0658o.f9012a.post(new C0707q());
            C0658o.f9012a.postDelayed(new C0708r(this), (long) ((Integer) C0371o.f8240ar.mo6604a()).intValue());
            return;
        }
        this.f9062a.destroy();
    }

    /* renamed from: e */
    public final C0520c mo6921e() {
        return this.f9062a.mo6921e();
    }

    /* renamed from: f */
    public final C0691ag mo6922f() {
        return this.f9062a.mo6922f();
    }

    /* renamed from: g */
    public final C0689ae mo6923g() {
        return this.f9062a.mo6923g();
    }

    /* renamed from: h */
    public final WebViewClient mo6929h() {
        return this.f9062a.mo6929h();
    }

    /* renamed from: i */
    public final dbe mo6883i() {
        return this.f9062a.mo6883i();
    }

    /* renamed from: j */
    public final VersionInfoParcel mo6930j() {
        return this.f9062a.mo6930j();
    }

    /* renamed from: k */
    public final vzr mo6931k() {
        return this.f9062a.mo6931k();
    }

    /* renamed from: l */
    public final boolean mo6932l() {
        return this.f9062a.mo6932l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f9062a.loadData(str, str2, str3);
    }

    public final void loadUrl(String str) {
        this.f9062a.loadUrl(str);
    }

    /* renamed from: m */
    public final boolean mo6935m() {
        return this.f9062a.mo6935m();
    }

    /* renamed from: n */
    public final void mo6937n() {
        C0680b bVar = this.f9063b;
        sdo.m34967a("onDestroy must be called from the UI thread.");
        C0679a aVar = bVar.f9028a;
        this.f9062a.mo6937n();
    }

    /* renamed from: o */
    public final void mo6938o() {
        this.f9062a.mo6938o();
    }

    /* renamed from: p */
    public final void mo6939p() {
        this.f9062a.mo6939p();
    }

    /* renamed from: q */
    public final C0316a mo6940q() {
        return this.f9062a.mo6940q();
    }

    /* renamed from: r */
    public final boolean mo6941r() {
        return this.f9062a.mo6941r();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9062a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f9062a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f9062a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f9062a.setWebViewClient(webViewClient);
    }

    /* renamed from: a */
    public final void mo6914a(String str, C0426e eVar) {
        this.f9062a.mo6914a(str, eVar);
    }

    /* renamed from: d */
    public final void mo6661d(String str) {
        this.f9062a.mo6661d(str);
    }

    /* renamed from: a */
    public final void mo6641a(String str, JSONObject jSONObject) {
        this.f9062a.mo6641a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo6915a(String str, ssx ssx) {
        this.f9062a.mo6915a(str, ssx);
    }

    /* renamed from: a */
    public final boolean mo6916a(boolean z, int i) {
        if (!this.f9064c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C0371o.f8190D.mo6604a()).booleanValue()) {
            return false;
        }
        if (this.f9062a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f9062a.getParent()).removeView(this.f9062a.mo6917b());
        }
        return this.f9062a.mo6916a(z, i);
    }
}
