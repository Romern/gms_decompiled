package com.google.android.gms.ads.internal.webview2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;

/* renamed from: com.google.android.gms.ads.internal.webview2.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0726j extends C0722f {

    /* renamed from: a */
    private final C0723g f9131a;

    /* renamed from: b */
    private boolean f9132b;

    /* renamed from: c */
    private boolean f9133c;

    public C0726j(Context context, C0723g gVar) {
        super(context);
        C0387d.m5366d().mo6784b();
        this.f9131a = gVar;
        super.setWebViewClient(gVar);
    }

    /* renamed from: a */
    private final synchronized void mo6913a() {
        if (!this.f9133c) {
            this.f9133c = true;
            C0387d.m5366d().mo6786c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6988a(boolean z) {
    }

    public final synchronized void destroy() {
        if (!this.f9132b) {
            this.f9132b = true;
            this.f9131a.f9126f = this;
            mo6988a(false);
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                C0387d.m5366d().mo6783a(e, "AdWebViewImpl.loadUrlUnsafe");
                C0633h.m5675e("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (mo7017m()) {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!mo7017m()) {
                    mo6988a(true);
                }
                mo6913a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo7017m()) {
            super.loadData(str, str2, str3);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo7017m()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo7017m()) {
            super.loadUrl(str);
        } else {
            C0633h.m5672d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized boolean mo7017m() {
        return this.f9132b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public synchronized void mo6937n() {
        mo6913a();
        C0645d.f8976d.execute(new C0725i(this));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!mo7017m()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo7017m()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo7017m()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo7017m() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo7018s() {
        super.destroy();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!mo7017m()) {
            super.stopLoading();
        }
    }

    /* renamed from: t */
    public final synchronized void mo7020t() {
        mo6937n();
    }
}
