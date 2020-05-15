package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: bjyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjyj extends bjyl {

    /* renamed from: a */
    private static String f123632a;

    /* renamed from: b */
    private final Pattern f123633b;

    /* renamed from: c */
    private final Pattern f123634c;

    /* renamed from: d */
    private final boolean f123635d;

    /* renamed from: e */
    private final ArrayList f123636e;

    /* renamed from: f */
    public final Set f123637f;

    /* renamed from: g */
    protected final Handler f123638g = new adzt();

    /* renamed from: h */
    protected final Context f123639h;

    /* renamed from: i */
    public final ConcurrentHashMap f123640i;

    /* renamed from: j */
    public bjym f123641j;

    /* renamed from: k */
    public bjyh f123642k;

    /* renamed from: m */
    private final Pattern f123643m;

    /* renamed from: n */
    private final ConcurrentHashMap f123644n;

    public bjyj(Context context, WebView webView, String str, String str2, boolean z, String[] strArr, String str3) {
        Pattern pattern;
        Pattern pattern2;
        this.f123639h = context;
        Pattern pattern3 = null;
        if (!TextUtils.isEmpty(str)) {
            pattern = Pattern.compile(str);
        } else {
            pattern = null;
        }
        this.f123633b = pattern;
        if (!TextUtils.isEmpty(str2)) {
            pattern2 = Pattern.compile(str2);
        } else {
            pattern2 = null;
        }
        this.f123634c = pattern2;
        this.f123635d = z;
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (String str4 : strArr) {
            arrayList.add(Pattern.compile(str4));
        }
        this.f123636e = arrayList;
        this.f123643m = !TextUtils.isEmpty(str3) ? Pattern.compile(str3) : pattern3;
        this.f123640i = new ConcurrentHashMap(25);
        this.f123644n = new ConcurrentHashMap(5);
        this.f123637f = Collections.synchronizedSet(new HashSet(5));
        int i = Build.VERSION.SDK_INT;
        webView.addJavascriptInterface(new bjyn(this), "comGoogleAndroidWalletInterceptor");
    }

    /* renamed from: a */
    private static WebResourceResponse m104902a() {
        Charset defaultCharset = Charset.defaultCharset();
        return new WebResourceResponse("text/html", defaultCharset.name(), new ByteArrayInputStream("".getBytes(defaultCharset)));
    }

    /* renamed from: d */
    private final boolean m104906d(String str) {
        boolean contains = this.f123637f.contains(str);
        if (this.f123644n.containsKey(str)) {
            return ((Boolean) this.f123644n.get(str)).booleanValue();
        }
        if (!contains && this.f123640i.containsKey(str)) {
            return ((Boolean) this.f123640i.get(str)).booleanValue();
        }
        int a = mo65613a(str, contains);
        boolean z = true;
        if (a != 2) {
            if (a != 1) {
                z = false;
            }
            ConcurrentHashMap concurrentHashMap = this.f123640i;
            Boolean valueOf = Boolean.valueOf(z);
            concurrentHashMap.put(str, valueOf);
            if (contains) {
                this.f123644n.put(str, valueOf);
            }
        }
        return z;
    }

    /* renamed from: a */
    public abstract void mo65384a(int i, String str, int i2, String str2);

    /* renamed from: a */
    public abstract void mo65385a(String str);

    /* renamed from: b */
    public abstract void mo65386b(String str);

    /* renamed from: c */
    public abstract void mo65387c(String str);

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (!this.f123637f.contains(str)) {
            mo65384a(1, str, 0, (String) null);
            this.f123640i.remove(str);
            mo65387c(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        BufferedReader bufferedReader;
        super.onPageFinished(webView, str);
        if (str.startsWith("http")) {
            this.f123641j = null;
            if (this.f123633b != null) {
                if (f123632a == null) {
                    try {
                        InputStream openRawResource = this.f123639h.getResources().openRawResource(C0126R.raw.redirect_intercept);
                        StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                        bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "UTF-8"));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        f123632a = sb.toString();
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to load intercept js file.", e);
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                String valueOf = String.valueOf(f123632a);
                webView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
            }
        }
        mo65384a(1, str, 0, (String) null);
        this.f123637f.remove(str);
        this.f123640i.remove(str);
        this.f123644n.remove(str);
        mo65387c(str);
        return;
        throw th;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        mo65386b(str);
        this.f123637f.add(str);
        m104906d(str);
        int i = Build.VERSION.SDK_INT;
        Pattern pattern = this.f123643m;
        if (pattern == null || !pattern.matcher(str).matches()) {
            webView.removeJavascriptInterface("comGoogleAndroidWalletRedirectLanding");
            return;
        }
        webView.addJavascriptInterface(new bjyo(this), "comGoogleAndroidWalletRedirectLanding");
        mo65385a(str);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        mo65384a(2, str2, i, str);
        if (this.f123642k == null) {
            return;
        }
        if (Looper.myLooper() == this.f123638g.getLooper()) {
            this.f123642k.mo65401a(i, str);
        } else {
            mo65628a(5, str2, str, i);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = webResourceRequest.getUrl().toString();
        if (this.f123637f.contains(uri)) {
            mo65384a(2, uri, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (DataParser.CONNECT_TYPE_POST.equalsIgnoreCase(webResourceRequest.getMethod())) {
            this.f123637f.add(uri);
        }
        mo65386b(uri);
        return !m104906d(uri) ? super.shouldInterceptRequest(webView, webResourceRequest) : m104902a();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        mo65386b(str);
        this.f123637f.add(str);
        return m104906d(str) || super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: a */
    private final void m104903a(int i, String str) {
        m104905a(i, str, null, null, 0);
    }

    /* renamed from: a */
    private final void m104904a(int i, String str, bjym bjym) {
        m104905a(i, str, null, bjym, 0);
    }

    /* renamed from: a */
    private final void m104905a(int i, String str, String str2, bjym bjym, int i2) {
        bjyh bjyh = this.f123642k;
        if (bjyh != null) {
            this.f123638g.post(new bjyi(i, bjyh, str, str2, bjym, i2));
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        mo65386b(str);
        return !m104906d(str) ? super.shouldInterceptRequest(webView, str) : m104902a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo65613a(String str, boolean z) {
        bjym bjym;
        Pattern pattern = this.f123633b;
        if (pattern == null || !pattern.matcher(str).matches() || (bjym = this.f123641j) == null || !bjym.mo65641c()) {
            Pattern pattern2 = this.f123634c;
            if (pattern2 == null || !pattern2.matcher(str).matches()) {
                if (z) {
                    String lowerCase = str.toLowerCase(Locale.getDefault());
                    if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                        if (this.f123642k != null) {
                            if (Looper.myLooper() == this.f123638g.getLooper()) {
                                this.f123642k.mo65400F();
                            } else {
                                m104903a(6, str);
                            }
                        }
                        mo65384a(8, str, 0, (String) null);
                        return 2;
                    }
                }
                int size = this.f123636e.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (((Pattern) this.f123636e.get(i)).matcher(str).matches()) {
                            break;
                        }
                        i++;
                    } else if (this.f123635d) {
                        m104903a(3, str);
                        mo65384a(5, str, 0, (String) null);
                        return 1;
                    } else {
                        mo65384a(6, str, 0, (String) null);
                    }
                }
                return 0;
            }
            m104904a(1, str, this.f123641j);
            mo65384a(4, str, 0, (String) null);
            return 1;
        }
        m104904a(2, str, this.f123641j);
        mo65384a(3, str, 0, (String) null);
        return 1;
    }

    /* renamed from: a */
    public final void mo65628a(int i, String str, String str2, int i2) {
        m104905a(i, str, str2, null, i2);
    }
}
