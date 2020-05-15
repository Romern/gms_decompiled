package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.augmentedreality.C0316a;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.overlay.C0520c;
import com.google.android.gms.ads.internal.p012js.C0444a;
import com.google.android.gms.ads.internal.p012js.C0506x;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.C0681c;

/* renamed from: com.google.android.gms.ads.internal.webview.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface C0699i extends C0444a, C0716z, C0506x, C0688ad, C0681c {
    /* renamed from: a */
    WebView mo6913a();

    /* renamed from: a */
    void mo6914a(String str, C0426e eVar);

    /* renamed from: a */
    void mo6915a(String str, ssx ssx);

    /* renamed from: a */
    boolean mo6916a(boolean z, int i);

    /* renamed from: b */
    View mo6917b();

    /* renamed from: c */
    Activity mo6918c();

    /* renamed from: d */
    Context mo6919d();

    void destroy();

    /* renamed from: e */
    C0520c mo6921e();

    /* renamed from: f */
    C0691ag mo6922f();

    /* renamed from: g */
    C0689ae mo6923g();

    Context getContext();

    int getHeight();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    /* renamed from: h */
    WebViewClient mo6929h();

    /* renamed from: i */
    dbe mo6883i();

    /* renamed from: j */
    VersionInfoParcel mo6930j();

    /* renamed from: k */
    vzr mo6931k();

    /* renamed from: l */
    boolean mo6932l();

    void loadData(String str, String str2, String str3);

    void loadUrl(String str);

    /* renamed from: m */
    boolean mo6935m();

    void measure(int i, int i2);

    /* renamed from: n */
    void mo6937n();

    /* renamed from: o */
    void mo6938o();

    /* renamed from: p */
    void mo6939p();

    /* renamed from: q */
    C0316a mo6940q();

    /* renamed from: r */
    boolean mo6941r();

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);
}
