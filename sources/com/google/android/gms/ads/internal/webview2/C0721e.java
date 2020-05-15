package com.google.android.gms.ads.internal.webview2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.augmentedreality.C0316a;
import com.google.android.gms.ads.internal.clearcut.C0327b;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.csi.C0384i;
import com.google.android.gms.ads.internal.csi.C0385j;
import com.google.android.gms.ads.internal.csi.C0386k;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.mraid.C0515d;
import com.google.android.gms.ads.internal.overlay.C0520c;
import com.google.android.gms.ads.internal.p012js.C0490h;
import com.google.android.gms.ads.internal.p012js.C0491i;
import com.google.android.gms.ads.internal.util.C0623au;
import com.google.android.gms.ads.internal.util.client.C0626a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.gmsg.C0683b;
import com.google.android.gms.ads.internal.webview.C0689ae;
import com.google.android.gms.ads.internal.webview.C0690af;
import com.google.android.gms.ads.internal.webview.C0691ag;
import com.google.android.gms.ads.internal.webview.C0699i;
import com.google.android.gms.ads.internal.webview.C0715y;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.webview2.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0721e extends C0726j implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, C0491i, C0699i {

    /* renamed from: a */
    public static final /* synthetic */ int f9106a = 0;

    /* renamed from: b */
    private final C0690af f9107b;

    /* renamed from: c */
    private final C0718b f9108c;

    /* renamed from: d */
    private final VersionInfoParcel f9109d;

    /* renamed from: e */
    private final DisplayMetrics f9110e;

    /* renamed from: f */
    private final C0327b f9111f;

    /* renamed from: g */
    private final C0691ag f9112g;

    /* renamed from: h */
    private final String f9113h;

    /* renamed from: i */
    private final C0384i f9114i;

    /* renamed from: j */
    private C0384i f9115j;

    /* renamed from: k */
    private final C0385j f9116k;

    /* renamed from: l */
    private final C0623au f9117l;

    /* renamed from: m */
    private final AtomicReference f9118m = new AtomicReference();

    /* renamed from: n */
    private int f9119n = -1;

    /* renamed from: o */
    private int f9120o = -1;

    /* renamed from: p */
    private int f9121p = -1;

    /* renamed from: q */
    private int f9122q = -1;

    /* renamed from: r */
    private final WindowManager f9123r;

    protected C0721e(C0690af afVar, C0718b bVar, C0691ag agVar, String str, VersionInfoParcel versionInfoParcel, C0327b bVar2) {
        super(afVar, bVar);
        this.f9107b = afVar;
        this.f9108c = bVar;
        this.f9112g = agVar;
        this.f9113h = str;
        this.f9109d = versionInfoParcel;
        this.f9123r = (WindowManager) getContext().getSystemService("window");
        this.f9110e = C0387d.m5363a().mo6843a(this.f9123r);
        this.f9111f = bVar2;
        this.f9117l = new C0623au(mo6918c(), this, this);
        C0387d.m5363a().mo6851a(afVar, versionInfoParcel.f8949a, getSettings());
        setDownloadListener(this);
        m5874v();
        int i = Build.VERSION.SDK_INT;
        addJavascriptInterface(C0715y.m5857a(this), "googleAdsJsInterface");
        m5873u();
        C0385j jVar = new C0385j(new C0386k(true, "make_wv", this.f9113h));
        this.f9116k = jVar;
        jVar.f8295b.mo6620c();
        C0384i a = this.f9116k.f8295b.mo6616a();
        this.f9114i = a;
        this.f9116k.mo6615a("native:view_create", a);
        this.f9115j = null;
        C0387d.m5364b().mo6870b(afVar);
    }

    /* renamed from: u */
    private final void m5873u() {
        C0385j jVar = this.f9116k;
        if (jVar != null) {
            C0386k kVar = jVar.f8295b;
            if (C0387d.m5366d().mo6781a() != null) {
                C0387d.m5366d().mo6781a().mo6611a(kVar);
            }
        }
    }

    /* renamed from: v */
    private static final synchronized void m5874v() {
        synchronized (C0721e.class) {
            int i = Build.VERSION.SDK_INT;
            C0633h.m5664a("Enabling hardware acceleration on an AdView.");
        }
    }

    /* renamed from: w */
    private final void m5875w() {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", "0");
        try {
            C0490h.m5475b(this, "onAdVisibilityChanged", C0387d.m5363a().mo6849a(hashMap));
        } catch (JSONException e) {
            C0633h.m5672d("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final WebView mo6913a() {
        return this;
    }

    /* renamed from: a */
    public final void mo6659a(String str, String str2) {
        C0490h.m5473a(this, str, str2);
    }

    /* renamed from: a */
    public final void mo6641a(String str, JSONObject jSONObject) {
        C0490h.m5475b(this, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo6915a(String str, ssx ssx) {
        C0718b bVar = this.f9108c;
        if (bVar != null) {
            bVar.f9095b.mo6686a(str, ssx);
        }
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
        return this.f9107b.f9032a;
    }

    /* renamed from: d */
    public final Context mo6919d() {
        return this.f9107b.f9033b;
    }

    /* renamed from: e */
    public final synchronized C0520c mo6921e() {
        return null;
    }

    /* renamed from: f */
    public final synchronized C0691ag mo6922f() {
        return this.f9112g;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0689ae mo6923g() {
        return this.f9108c;
    }

    /* renamed from: h */
    public final WebViewClient mo6929h() {
        return this.f9108c;
    }

    /* renamed from: i */
    public final dbe mo6883i() {
        return null;
    }

    /* renamed from: j */
    public final VersionInfoParcel mo6930j() {
        return this.f9109d;
    }

    /* renamed from: k */
    public final vzr mo6931k() {
        return (vzr) this.f9118m.get();
    }

    /* renamed from: l */
    public final synchronized boolean mo6932l() {
        return false;
    }

    /* renamed from: n */
    public final void mo6937n() {
    }

    /* renamed from: o */
    public final void mo6938o() {
        this.f9117l.mo6797a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo7017m()) {
            this.f9117l.mo6799c();
        }
        C0718b bVar = this.f9108c;
        if (bVar != null) {
            bVar.mo6984b();
        }
        m5875w();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo7017m()) {
                this.f9117l.mo6800d();
            }
            super.onDetachedFromWindow();
        }
        m5875w();
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C0387d.m5363a().mo6850a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C0633h.m5664a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        super.onDraw(canvas);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        int i;
        int i2;
        if (this.f9108c.f9097d) {
            C0626a a = C0341h.m5274a();
            DisplayMetrics displayMetrics = this.f9110e;
            int a2 = a.mo6804a(displayMetrics, displayMetrics.widthPixels);
            C0626a a3 = C0341h.m5274a();
            DisplayMetrics displayMetrics2 = this.f9110e;
            int a4 = a3.mo6804a(displayMetrics2, displayMetrics2.heightPixels);
            Activity c = mo6918c();
            if (c == null || c.getWindow() == null) {
                i2 = a2;
                i = a4;
            } else {
                int[] a5 = C0387d.m5363a().mo6858a(c);
                int a6 = C0341h.m5274a().mo6804a(this.f9110e, a5[0]);
                i = C0341h.m5274a().mo6804a(this.f9110e, a5[1]);
                i2 = a6;
            }
            if (this.f9120o != a2 || this.f9119n != a4 || this.f9121p != i2 || this.f9122q != i) {
                this.f9120o = a2;
                this.f9119n = a4;
                this.f9121p = i2;
                this.f9122q = i;
                new C0515d(this).mo6699a(a2, a4, i2, i, this.f9110e.density, this.f9123r.getDefaultDisplay().getRotation());
                return;
            }
            return;
        }
        this.f9108c.mo6984b();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        if (mo7017m()) {
            setMeasuredDimension(0, 0);
            return;
        }
        isInEditMode();
        super.onMeasure(i, i2);
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            C0633h.m5669b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            C0633h.m5669b("Could not resume webview.", e);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f9108c.mo6984b();
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo6939p() {
        if (this.f9115j == null) {
            C0384i a = this.f9116k.f8295b.mo6616a();
            this.f9115j = a;
            this.f9116k.mo6615a("native:view_load", a);
        }
    }

    /* renamed from: q */
    public final C0316a mo6940q() {
        return null;
    }

    /* renamed from: r */
    public final boolean mo6941r() {
        ((Boolean) C0371o.f8220aG.mo6604a()).booleanValue();
        return false;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C0633h.m5669b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: a */
    public final void mo6914a(String str, C0426e eVar) {
        C0718b bVar = this.f9108c;
        if (bVar != null) {
            bVar.f9095b.mo6684a(str, eVar);
        }
    }

    /* renamed from: d */
    public final synchronized void mo6661d(String str) {
        if (mo7017m()) {
            C0633h.m5672d("The webview is destroyed. Ignoring action.");
        } else {
            C0727k.m5911a(this, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo6988a(boolean z) {
        if (!z) {
            m5873u();
            this.f9117l.mo6798b();
        }
        this.f9118m.set(null);
        C0718b bVar = this.f9108c;
        bVar.f9095b.mo6690d();
        bVar.f9095b.f8493c = null;
        synchronized (bVar.f9096c) {
            bVar.f9098e = null;
        }
        C0387d.m5373k();
        C0683b.m5749a(this);
    }

    /* renamed from: a */
    public final boolean mo6916a(boolean z, int i) {
        destroy();
        this.f9111f.mo6567a(new C0720d(z, i));
        this.f9111f.mo6566a(10003);
        return true;
    }
}
