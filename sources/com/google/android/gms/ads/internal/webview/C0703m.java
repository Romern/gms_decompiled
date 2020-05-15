package com.google.android.gms.ads.internal.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0308a;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.augmentedreality.C0316a;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.common.C0356b;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0397j;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.mraid.C0514c;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0526d;
import com.google.android.gms.ads.internal.p012js.C0500r;
import com.google.android.gms.ads.internal.safebrowsing.C0580b;
import com.google.android.gms.ads.internal.scionintegration.C0591k;
import com.google.android.gms.ads.internal.util.C0653k;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.webview.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0703m extends WebViewClient implements C0689ae {

    /* renamed from: e */
    public static final /* synthetic */ int f9050e = 0;

    /* renamed from: a */
    protected final C0699i f9051a;

    /* renamed from: b */
    public final HashMap f9052b = new HashMap();

    /* renamed from: c */
    public final Object f9053c = new Object();

    /* renamed from: d */
    public boolean f9054d;

    /* renamed from: f */
    private C0500r f9055f;

    public C0703m(C0699i iVar) {
        new C0514c(iVar, iVar.mo6919d(), new C0356b(iVar.getContext()));
        this.f9051a = iVar;
        this.f9054d = false;
    }

    /* renamed from: b */
    private final WebResourceResponse m5783b(String str, Map map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C0387d.m5363a().mo6854a(this.f9051a.getContext(), this.f9051a.mo6930j().f8949a, httpURLConnection);
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
                                return m5784g();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                C0633h.m5664a(headerField.length() == 0 ? new String("Redirecting to ") : "Redirecting to ".concat(headerField));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                C0633h.m5672d(protocol.length() == 0 ? new String("Unsupported scheme: ") : "Unsupported scheme: ".concat(protocol));
                                return m5784g();
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

    /* renamed from: g */
    private static WebResourceResponse m5784g() {
        if (((Boolean) C0371o.f8189C.mo6604a()).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo6948a(String str, Map map) {
        try {
            String b = C0591k.m5599b(str, this.f9051a.getContext());
            if (!b.equals(str)) {
                return m5783b(b, map);
            }
            if (CacheOffering.m5254a(str) != null) {
                CacheEntryParcel a = C0387d.m5367e().mo6560a();
                if (a.mo6554a()) {
                    return new WebResourceResponse("", "", a.mo6555b());
                }
            }
            if (!C0632g.m5653a() || !((Boolean) C0397j.f8339b.mo6621a()).booleanValue()) {
                return null;
            }
            return m5783b(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            C0387d.m5366d().mo6783a(e, "AdWebViewClient.interceptRequest");
            return m5784g();
        }
    }

    /* renamed from: a */
    public final C0308a mo6884a() {
        return null;
    }

    /* renamed from: a */
    public final void mo6886a(C0500r rVar) {
        this.f9055f = rVar;
    }

    /* renamed from: c */
    public final C0580b mo6887c() {
        return null;
    }

    /* renamed from: d */
    public final void mo6888d() {
        synchronized (this.f9053c) {
            this.f9054d = true;
            C0645d.f8976d.execute(new C0700j(this));
        }
    }

    /* renamed from: e */
    public final void mo6889e() {
    }

    /* renamed from: f */
    public final void mo6951f() {
        synchronized (this.f9053c) {
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Loading resource: ");
        } else {
            "Loading resource: ".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo6885a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r1.mo6693a();
        r0.f9055f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0.f9051a.mo6939p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r0.f9055f;
     */
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f9053c) {
            if (this.f9051a.mo6935m()) {
                this.f9051a.mo6937n();
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C0316a q = this.f9051a.mo6940q();
        if (q != null && webView == q.mo6550a()) {
            q.mo6551b();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f9051a.mo6916a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo6948a(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("AdWebView shouldOverrideUrlLoading: ");
        } else {
            "AdWebView shouldOverrideUrlLoading: ".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo6885a(parse);
            return true;
        } else if (!this.f9051a.mo6913a().willNotDraw()) {
            try {
                if (this.f9051a.mo6883i() == null) {
                    AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = new AdLauncherIntentInfoParcel("android.intent.action.VIEW", parse.toString());
                    if (this.f9051a.mo6932l()) {
                        this.f9051a.mo6922f();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(adLauncherIntentInfoParcel, this.f9051a.mo6930j());
                    C0387d.m5376n();
                    C0526d.m5520a(this.f9051a.getContext(), adOverlayInfoParcel);
                    return true;
                }
                throw null;
            } catch (dbf e) {
                String valueOf2 = String.valueOf(str);
                C0633h.m5672d(valueOf2.length() == 0 ? new String("Unable to append parameter to URL: ") : "Unable to append parameter to URL: ".concat(valueOf2));
            }
        } else {
            String valueOf3 = String.valueOf(str);
            C0633h.m5672d(valueOf3.length() == 0 ? new String("AdWebView unable to handle URL: ") : "AdWebView unable to handle URL: ".concat(valueOf3));
            return true;
        }
    }

    /* renamed from: a */
    public final void mo6885a(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f9052b.get(path);
        if (list == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(valueOf);
            sb.toString();
            if (((Boolean) C0371o.f8221aH.mo6604a()).booleanValue() && C0387d.m5366d().mo6781a() != null) {
                C0645d.f8973a.execute(new C0701k(path));
            }
        } else if (!((Boolean) C0371o.f8242at.mo6604a()).booleanValue()) {
            mo6949a(C0387d.m5363a().mo6847a(uri), list, path);
        } else {
            bqga.m112781a(bqdx.m112674a(bqga.m112775a((Object) null), new C0653k(C0387d.m5363a(), uri), C0645d.f8973a), new C0702l(this, list, path), C0645d.f8977e);
        }
    }

    /* renamed from: a */
    public final void mo6949a(Map map, List list, String str) {
        if (C0633h.m5667a(2)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                new String("Received GMSG: ");
            } else {
                "Received GMSG: ".concat(valueOf);
            }
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                sb.toString();
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0426e) it.next()).mo6625a(this.f9051a, map);
        }
    }

    /* renamed from: b */
    public final void mo6950b() {
        synchronized (this.f9053c) {
            this.f9052b.clear();
            this.f9055f = null;
            this.f9054d = false;
        }
    }
}
