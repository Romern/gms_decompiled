package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bjxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxt extends bjyj {

    /* renamed from: a */
    final ConcurrentHashMap f123601a;

    /* renamed from: b */
    final ConcurrentHashMap f123602b;

    /* renamed from: c */
    final Set f123603c;

    /* renamed from: d */
    public List f123604d;

    /* renamed from: e */
    public bkdb f123605e;

    /* renamed from: m */
    private final LogContext f123606m;

    /* renamed from: n */
    private int f123607n = -1;

    /* renamed from: o */
    private DisplayMetrics f123608o;

    public bjxt(Context context, WebView webView, String str, String str2, boolean z, String[] strArr, String str3, LogContext logContext) {
        super(context, webView, str, str2, z, strArr, str3);
        this.f123606m = logContext;
        this.f123601a = new ConcurrentHashMap(25);
        this.f123602b = new ConcurrentHashMap(25);
        this.f123603c = Collections.synchronizedSet(new HashSet(25));
    }

    /* renamed from: a */
    private static int m104851a(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 40;
            case 3:
                return 41;
            case 4:
                return 42;
            case 5:
                return 43;
            case 6:
                return 44;
            case 7:
                return 45;
            default:
                return 46;
        }
    }

    /* renamed from: d */
    static String m104852d(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.query(null);
        buildUpon.fragment(null);
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public final void mo65386b(String str) {
        TimedEvent timedEvent;
        if (!this.f123601a.containsKey(str)) {
            this.f123601a.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        if (!this.f123602b.containsKey(str)) {
            LogContext logContext = this.f123606m;
            String d = m104852d(str);
            if (!bjst.m104536d(logContext)) {
                Log.e("ClientLog", "Tried to log startWebViewPageLoad() in an invalid session.");
                timedEvent = null;
            } else {
                bxvd e = bjst.m104537e(logContext);
                bwfe bwfe = bwfe.EVENT_NAME_WEB_VIEW_PAGE_LOAD_START;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr = (bwfr) e.f164949b;
                bwfr bwfr2 = bwfr.f159113m;
                bwfr.f159121g = bwfe.f159083I;
                bwfr.f159115a |= 4;
                bxvd da = bwga.f159162f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwga bwga = (bwga) da.f164949b;
                d.getClass();
                bwga.f159164a |= 1;
                bwga.f159165b = d;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr3 = (bwfr) e.f164949b;
                bwga bwga2 = (bwga) da.mo74062i();
                bwga2.getClass();
                bwfr3.f159117c = bwga2;
                bwfr3.f159116b = 13;
                bwfr bwfr4 = (bwfr) e.mo74062i();
                bjst.m104528a(logContext.mo71783b(), bwfr4);
                timedEvent = new TimedEvent(bwfr4);
            }
            if (timedEvent != null) {
                this.f123602b.put(str, timedEvent);
            }
        }
    }

    /* renamed from: c */
    public final void mo65387c(String str) {
        this.f123601a.remove(str);
        this.f123602b.remove(str);
        this.f123603c.remove(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo65613a(String str, boolean z) {
        bmkd bmkd;
        if (z) {
            Context context = this.f123639h;
            List list = this.f123604d;
            if (list != null) {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    bmkd = (bmkd) list.get(i);
                    if (context.getPackageManager().resolveActivity(bjva.m104681a(bmkd, str), 0) != null) {
                        break;
                    }
                    i++;
                }
            }
            bmkd = null;
            if (bmkd != null) {
                if (rfi.f42868a.mo24590b(this.f123639h) == 0) {
                    bjyh bjyh = this.f123642k;
                    if (bjyh != null) {
                        this.f123638g.post(new bjxs((bjxr) bjyh, bmkd, str));
                    }
                    mo65384a(7, str, 0, (String) null);
                    return 1;
                }
            }
        }
        return super.mo65613a(str, z);
    }

    /* renamed from: a */
    public final void mo65384a(int i, String str, int i2, String str2) {
        long j;
        if (!this.f123603c.contains(str)) {
            bjst.m104525a(this.f123606m, (TimedEvent) this.f123602b.get(str), this.f123637f.contains(str), m104851a(i), i2, str2);
            if (this.f123605e != null) {
                this.f123603c.add(str);
                WebViewPageLoadEvent webViewPageLoadEvent = new WebViewPageLoadEvent();
                webViewPageLoadEvent.f151749a = m104852d(str);
                webViewPageLoadEvent.f151750b = this.f123637f.contains(str);
                if (this.f123601a.containsKey(str)) {
                    j = ((Long) this.f123601a.get(str)).longValue();
                } else {
                    j = -1;
                }
                webViewPageLoadEvent.f151751c = j;
                webViewPageLoadEvent.f151752d = i2;
                if (str2 != null) {
                    webViewPageLoadEvent.f151753e = str2;
                }
                int i3 = this.f123639h.getResources().getConfiguration().orientation;
                webViewPageLoadEvent.f151754f = i3;
                DisplayMetrics displayMetrics = this.f123608o;
                if (displayMetrics == null || i3 != this.f123607n) {
                    displayMetrics = bjzh.m104970a(this.f123639h);
                    this.f123607n = webViewPageLoadEvent.f151754f;
                    this.f123608o = displayMetrics;
                }
                webViewPageLoadEvent.f151755g = displayMetrics.widthPixels;
                webViewPageLoadEvent.f151756h = displayMetrics.heightPixels;
                webViewPageLoadEvent.f151757i = displayMetrics.xdpi;
                webViewPageLoadEvent.f151758j = displayMetrics.ydpi;
                Bundle bundle = new Bundle();
                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 772);
                bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", webViewPageLoadEvent);
                bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", m104851a(i));
                this.f123605e.mo51905a(7, bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo65385a(String str) {
        LogContext logContext = this.f123606m;
        if (!bjst.m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log landingMessageJavaScriptInjected() in an invalid session.");
            return;
        }
        bxvd e = bjst.m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_LANDING_MESSAGE_JAVASCRIPT_INJECTED;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bxvd da = bwga.f159162f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwga bwga = (bwga) da.f164949b;
        str.getClass();
        bwga.f159164a |= 1;
        bwga.f159165b = str;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) e.f164949b;
        bwga bwga2 = (bwga) da.mo74062i();
        bwga2.getClass();
        bwfr3.f159117c = bwga2;
        bwfr3.f159116b = 13;
        bjst.m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
    }
}
