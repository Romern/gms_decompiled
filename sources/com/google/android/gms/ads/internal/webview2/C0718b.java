package com.google.android.gms.ads.internal.webview2;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0308a;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.augmentedreality.C0316a;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0397j;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0526d;
import com.google.android.gms.ads.internal.p012js.C0496n;
import com.google.android.gms.ads.internal.p012js.C0500r;
import com.google.android.gms.ads.internal.safebrowsing.C0580b;
import com.google.android.gms.ads.internal.scionintegration.C0591k;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.webview.C0689ae;
import com.google.android.gms.ads.internal.webview.C0699i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.webview2.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0718b extends C0723g implements C0689ae {

    /* renamed from: a */
    protected C0699i f9094a;

    /* renamed from: b */
    public final C0496n f9095b = new C0496n();

    /* renamed from: c */
    public final Object f9096c = new Object();

    /* renamed from: d */
    public volatile boolean f9097d;

    /* renamed from: e */
    public C0500r f9098e;

    /* renamed from: d */
    private final WebResourceResponse m5858d(C0724h hVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(hVar.f9127a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : hVar.f9129c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C0387d.m5363a().mo6854a(this.f9094a.getContext(), this.f9094a.mo6930j().f8949a, httpURLConnection);
                    C0632g gVar = new C0632g();
                    gVar.mo6813a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    gVar.mo6812a(httpURLConnection, responseCode);
                    if (responseCode >= 300 && responseCode < 400) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C0633h.m5672d("Protocol is null");
                                return m5859f();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                C0633h.m5664a(headerField.length() == 0 ? new String("Redirecting to ") : "Redirecting to ".concat(headerField));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                C0633h.m5672d(protocol.length() == 0 ? new String("Unsupported scheme: ") : "Unsupported scheme: ".concat(protocol));
                                return m5859f();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        return C0387d.m5363a().mo6844a(httpURLConnection);
    }

    /* renamed from: f */
    private static WebResourceResponse m5859f() {
        if (((Boolean) C0371o.f8189C.mo6604a()).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: a */
    public final C0308a mo6884a() {
        return null;
    }

    /* renamed from: a */
    public final void mo6886a(C0500r rVar) {
        this.f9098e = rVar;
    }

    /* renamed from: b */
    public final void mo6984b() {
        synchronized (this.f9096c) {
        }
    }

    /* renamed from: c */
    public final WebResourceResponse mo6985c(C0724h hVar) {
        WebResourceResponse webResourceResponse;
        String str;
        if ("mraid.js".equalsIgnoreCase(new File(hVar.f9127a).getName())) {
            mo6888d();
            this.f9094a.mo6922f();
            if (this.f9094a.mo6932l()) {
                str = (String) C0371o.f8255h.mo6604a();
            } else {
                str = (String) C0371o.f8254g.mo6604a();
            }
            webResourceResponse = C0387d.m5363a().mo6859b(this.f9094a.getContext(), this.f9094a.mo6930j().f8949a, str);
        } else {
            webResourceResponse = null;
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C0591k.m5599b(hVar.f9127a, this.f9094a.getContext()).equals(hVar.f9127a)) {
                return m5858d(hVar);
            }
            if (CacheOffering.m5254a(hVar.f9127a) != null) {
                CacheEntryParcel a = C0387d.m5367e().mo6560a();
                if (a.mo6554a()) {
                    return new WebResourceResponse("", "", a.mo6555b());
                }
            }
            if (!C0632g.m5653a() || !((Boolean) C0397j.f8339b.mo6621a()).booleanValue()) {
                return null;
            }
            return m5858d(hVar);
        } catch (Exception | NoClassDefFoundError e) {
            C0387d.m5366d().mo6783a(e, "AdWebViewClient.interceptRequest");
            return m5859f();
        }
    }

    /* renamed from: c */
    public final C0580b mo6887c() {
        return null;
    }

    /* renamed from: e */
    public final void mo6889e() {
    }

    /* renamed from: h */
    public final void mo6668h() {
        C0500r rVar = this.f9098e;
        if (rVar != null) {
            rVar.mo6693a();
            this.f9098e = null;
        }
        this.f9094a.mo6939p();
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C0316a q = this.f9094a.mo6940q();
        if (q != null && webView == q.mo6550a()) {
            q.mo6551b();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f9094a.mo6916a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: a */
    public final void mo6885a(Uri uri) {
        this.f9095b.mo6688b(uri);
    }

    /* renamed from: b */
    public final boolean mo6667b(C0724h hVar) {
        String valueOf = String.valueOf(hVar.f9127a);
        if (valueOf.length() == 0) {
            new String("AdWebView shouldOverrideUrlLoading: ");
        } else {
            "AdWebView shouldOverrideUrlLoading: ".concat(valueOf);
        }
        Uri uri = hVar.f9128b;
        if (this.f9095b.mo6687a(uri)) {
            return true;
        }
        if (!this.f9094a.mo6913a().willNotDraw()) {
            try {
                if (this.f9094a.mo6883i() == null) {
                    AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString());
                    if (this.f9094a.mo6932l()) {
                        this.f9094a.mo6922f();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(adLauncherIntentInfoParcel, this.f9094a.mo6930j());
                    C0387d.m5376n();
                    C0526d.m5520a(this.f9094a.getContext(), adOverlayInfoParcel);
                } else {
                    throw null;
                }
            } catch (dbf e) {
                String valueOf2 = String.valueOf(hVar.f9127a);
                C0633h.m5672d(valueOf2.length() == 0 ? new String("Unable to append parameter to URL: ") : "Unable to append parameter to URL: ".concat(valueOf2));
            }
        } else {
            String valueOf3 = String.valueOf(hVar.f9127a);
            C0633h.m5672d(valueOf3.length() == 0 ? new String("AdWebView unable to handle URL: ") : "AdWebView unable to handle URL: ".concat(valueOf3));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo6666a(C0724h hVar) {
        this.f9095b.mo6687a(hVar.f9128b);
    }

    /* renamed from: d */
    public final void mo6888d() {
        synchronized (this.f9096c) {
            this.f9097d = true;
            C0645d.f8976d.execute(new C0717a(this));
        }
    }
}
