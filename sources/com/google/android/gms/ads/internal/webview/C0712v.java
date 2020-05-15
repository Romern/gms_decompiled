package com.google.android.gms.ads.internal.webview;

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
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
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
import com.google.android.gms.ads.internal.state.C0597d;
import com.google.android.gms.ads.internal.util.C0623au;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0626a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.gmsg.C0683b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.webview.v */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0712v extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, C0699i {

    /* renamed from: a */
    public static final /* synthetic */ int f9068a = 0;

    /* renamed from: b */
    private final C0690af f9069b;

    /* renamed from: c */
    private final VersionInfoParcel f9070c;

    /* renamed from: d */
    private final DisplayMetrics f9071d;

    /* renamed from: e */
    private C0703m f9072e;

    /* renamed from: f */
    private final C0691ag f9073f;

    /* renamed from: g */
    private final String f9074g;

    /* renamed from: h */
    private boolean f9075h;

    /* renamed from: i */
    private Boolean f9076i;

    /* renamed from: j */
    private final C0384i f9077j;

    /* renamed from: k */
    private C0384i f9078k;

    /* renamed from: l */
    private final C0385j f9079l;

    /* renamed from: m */
    private boolean f9080m;

    /* renamed from: n */
    private final C0623au f9081n;

    /* renamed from: o */
    private int f9082o = -1;

    /* renamed from: p */
    private int f9083p = -1;

    /* renamed from: q */
    private int f9084q = -1;

    /* renamed from: r */
    private int f9085r = -1;

    /* renamed from: s */
    private final WindowManager f9086s;

    /* renamed from: t */
    private final C0327b f9087t;

    protected C0712v(C0690af afVar, C0691ag agVar, String str, VersionInfoParcel versionInfoParcel, C0327b bVar) {
        super(afVar);
        this.f9069b = afVar;
        this.f9073f = agVar;
        this.f9074g = str;
        this.f9070c = versionInfoParcel;
        this.f9086s = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics a = C0387d.m5363a().mo6843a(this.f9086s);
        this.f9071d = a;
        float f = a.density;
        this.f9087t = bVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C0633h.m5669b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        int i = Build.VERSION.SDK_INT;
        settings.setMixedContentMode(2);
        C0387d.m5363a().mo6851a(afVar, versionInfoParcel.f8949a, settings);
        C0387d.m5364b().mo6869a(getContext(), settings);
        setDownloadListener(this);
        m5826w();
        int i2 = Build.VERSION.SDK_INT;
        addJavascriptInterface(C0715y.m5857a(this), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f9081n = new C0623au(this.f9069b.f9032a, this, this);
        m5825v();
        C0385j jVar = new C0385j(new C0386k(true, "make_wv", this.f9074g));
        this.f9079l = jVar;
        jVar.f8295b.mo6620c();
        C0384i a2 = this.f9079l.f8295b.mo6616a();
        this.f9077j = a2;
        this.f9079l.mo6615a("native:view_create", a2);
        this.f9078k = null;
        C0387d.m5364b().mo6870b(afVar);
        C0387d.m5366d().mo6784b();
    }

    /* renamed from: e */
    private final synchronized void m5822e(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C0387d.m5366d().mo6783a(e, "AdWebViewImpl.loadUrlUnsafe");
            C0633h.m5673d("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: t */
    private final synchronized void m5823t() {
        Boolean bool;
        C0597d d = C0387d.m5366d();
        synchronized (d.f8895a) {
            bool = d.f8899e;
        }
        this.f9076i = bool;
        if (bool == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                mo6961a((Boolean) true);
            } catch (IllegalStateException e) {
                mo6961a((Boolean) false);
            }
        }
    }

    /* renamed from: u */
    private final synchronized void m5824u() {
        if (!this.f9080m) {
            this.f9080m = true;
            C0387d.m5366d().mo6786c();
        }
    }

    /* renamed from: v */
    private final void m5825v() {
        C0385j jVar = this.f9079l;
        if (jVar != null) {
            C0386k kVar = jVar.f8295b;
            if (C0387d.m5366d().mo6781a() != null) {
                C0387d.m5366d().mo6781a().mo6611a(kVar);
            }
        }
    }

    /* renamed from: w */
    private static final synchronized void m5826w() {
        synchronized (C0712v.class) {
            int i = Build.VERSION.SDK_INT;
            C0633h.m5664a("Enabling hardware acceleration on an AdView.");
        }
    }

    /* renamed from: x */
    private final void m5827x() {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", "0");
        try {
            mo6641a("onAdVisibilityChanged", C0387d.m5363a().mo6849a(hashMap));
        } catch (JSONException e) {
            C0633h.m5672d("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final WebView mo6913a() {
        return this;
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
        return this.f9069b.f9032a;
    }

    /* renamed from: d */
    public final Context mo6919d() {
        return this.f9069b.f9033b;
    }

    public final synchronized void destroy() {
        m5825v();
        this.f9081n.mo6798b();
        this.f9072e.mo6950b();
        if (!this.f9075h) {
            C0387d.m5373k();
            C0683b.m5749a(this);
            this.f9075h = true;
            m5822e("about:blank");
        }
    }

    /* renamed from: e */
    public final synchronized C0520c mo6921e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (mo6935m()) {
            C0633h.m5675e("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    /* renamed from: f */
    public final synchronized C0691ag mo6922f() {
        return this.f9073f;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f9075h) {
                    this.f9072e.mo6950b();
                    C0387d.m5373k();
                    C0683b.m5749a(this);
                    m5824u();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0689ae mo6923g() {
        return this.f9072e;
    }

    /* renamed from: h */
    public final WebViewClient mo6929h() {
        return this.f9072e;
    }

    /* renamed from: i */
    public final dbe mo6883i() {
        return null;
    }

    /* renamed from: j */
    public final VersionInfoParcel mo6930j() {
        return this.f9070c;
    }

    /* renamed from: k */
    public final synchronized vzr mo6931k() {
        return null;
    }

    /* renamed from: l */
    public final synchronized boolean mo6932l() {
        return false;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo6935m()) {
            super.loadData(str, str2, str3);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo6935m()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo6935m()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C0387d.m5366d().mo6783a(e, "AdWebViewImpl.loadUrl");
                C0633h.m5673d("Could not call loadUrl. ", e);
            }
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized boolean mo6935m() {
        return this.f9075h;
    }

    /* renamed from: n */
    public final synchronized void mo6937n() {
        m5824u();
        C0658o.f9012a.post(new C0711u(this));
    }

    /* renamed from: o */
    public final void mo6938o() {
        this.f9081n.mo6797a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo6935m()) {
            this.f9081n.mo6799c();
        }
        C0703m mVar = this.f9072e;
        if (mVar != null) {
            mVar.mo6951f();
        }
        m5827x();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo6935m()) {
                this.f9081n.mo6800d();
            }
            super.onDetachedFromWindow();
        }
        m5827x();
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
        if (!mo6935m()) {
            int i = Build.VERSION.SDK_INT;
            super.onDraw(canvas);
        }
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
        boolean z;
        int i;
        int i2;
        C0703m mVar = this.f9072e;
        synchronized (mVar.f9053c) {
            z = mVar.f9054d;
        }
        if (z) {
            C0626a a = C0341h.m5274a();
            DisplayMetrics displayMetrics = this.f9071d;
            int a2 = a.mo6804a(displayMetrics, displayMetrics.widthPixels);
            C0626a a3 = C0341h.m5274a();
            DisplayMetrics displayMetrics2 = this.f9071d;
            int a4 = a3.mo6804a(displayMetrics2, displayMetrics2.heightPixels);
            Activity c = mo6918c();
            if (c == null || c.getWindow() == null) {
                i2 = a2;
                i = a4;
            } else {
                int[] a5 = C0387d.m5363a().mo6858a(c);
                int a6 = C0341h.m5274a().mo6804a(this.f9071d, a5[0]);
                i = C0341h.m5274a().mo6804a(this.f9071d, a5[1]);
                i2 = a6;
            }
            if (this.f9083p != a2 || this.f9082o != a4 || this.f9084q != i2 || this.f9085r != i) {
                this.f9083p = a2;
                this.f9082o = a4;
                this.f9084q = i2;
                this.f9085r = i;
                new C0515d(this).mo6699a(a2, a4, i2, i, this.f9071d.density, this.f9086s.getDefaultDisplay().getRotation());
                return;
            }
            return;
        }
        this.f9072e.mo6951f();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        if (mo6935m()) {
            setMeasuredDimension(0, 0);
            return;
        }
        isInEditMode();
        super.onMeasure(i, i2);
    }

    public final void onPause() {
        if (!mo6935m()) {
            try {
                super.onPause();
            } catch (Exception e) {
                C0633h.m5669b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo6935m()) {
            try {
                super.onResume();
            } catch (Exception e) {
                C0633h.m5669b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f9072e.mo6951f();
        if (!mo6935m()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public final void mo6939p() {
        if (this.f9078k == null) {
            C0384i a = this.f9079l.f8295b.mo6616a();
            this.f9078k = a;
            this.f9079l.mo6615a("native:view_load", a);
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

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final synchronized Boolean mo6978s() {
        return this.f9076i;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C0703m) {
            this.f9072e = (C0703m) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo6935m()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C0633h.m5669b("Could not stop loading webview.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized void mo6964c(String str) {
        if (!mo6935m()) {
            evaluateJavascript(str, null);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: d */
    public final void mo6661d(String str) {
        mo6963b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6961a(Boolean bool) {
        synchronized (this) {
            this.f9076i = bool;
        }
        C0597d d = C0387d.m5366d();
        synchronized (d.f8895a) {
            d.f8899e = bool;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6963b(String str) {
        int i = Build.VERSION.SDK_INT;
        if (mo6978s() == null) {
            m5823t();
        }
        if (mo6978s().booleanValue()) {
            mo6964c(str);
            return;
        }
        String valueOf = String.valueOf(str);
        mo6962a(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo6962a(String str) {
        if (!mo6935m()) {
            loadUrl(str);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: a */
    public final void mo6914a(String str, C0426e eVar) {
        C0703m mVar = this.f9072e;
        if (mVar != null) {
            synchronized (mVar.f9053c) {
                List list = (List) mVar.f9052b.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    mVar.f9052b.put(str, list);
                }
                list.add(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo6641a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C0633h.m5664a(valueOf.length() == 0 ? new String("Dispatching AFMA event: ") : "Dispatching AFMA event: ".concat(valueOf));
        mo6963b(sb.toString());
    }

    /* renamed from: a */
    public final void mo6915a(String str, ssx ssx) {
        C0703m mVar = this.f9072e;
        if (mVar != null) {
            synchronized (mVar.f9053c) {
                List<C0426e> list = (List) mVar.f9052b.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C0426e eVar : list) {
                        if (ssx.mo6692a(eVar)) {
                            arrayList.add(eVar);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6916a(boolean z, int i) {
        destroy();
        this.f9087t.mo6567a(new C0710t(z, i));
        this.f9087t.mo6566a(10003);
        return true;
    }
}
