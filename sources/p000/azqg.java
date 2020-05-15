package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: azqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqg {

    /* renamed from: c */
    private static WeakReference f99880c = new WeakReference(null);

    /* renamed from: a */
    public final bnhe f99881a;

    /* renamed from: b */
    public final Context f99882b;

    public azqg(Context context) {
        this.f99882b = context;
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap = new HashMap();
        for (String str : bmyx.m108640a(';').mo66918a((CharSequence) cfgs.f183989a.mo6606a().mo81166V())) {
            List c = bmyx.m108640a(',').mo66925c((CharSequence) str);
            if (c.size() == 2) {
                hashMap.put(Locale.forLanguageTag((String) c.get(0)), Locale.forLanguageTag((String) c.get(1)));
            } else {
                azoj.m85933c("LWCacheUtils", "Incorrect prebundled_locales_map flag value. Expected a key-value pair but found %s", str);
            }
        }
        this.f99881a = bnhe.m109413a(hashMap);
    }

    /* renamed from: a */
    public static synchronized azqg m86158a(Context context) {
        azqg azqg;
        synchronized (azqg.class) {
            azqg = (azqg) f99880c.get();
            if (azqg == null) {
                azqg = new azqg(context.getApplicationContext());
                f99880c = new WeakReference(azqg);
            }
        }
        return azqg;
    }

    /* renamed from: b */
    public static boolean m86161b(String str) {
        return str.startsWith(cfgs.m139385E()) && str.contains(cfgs.f183989a.mo6606a().mo81187b());
    }

    /* renamed from: a */
    private final bmxv m86159a(String str, String str2, Map map) {
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.f99882b.getAssets().open(str));
            int i = Build.VERSION.SDK_INT;
            WebResourceResponse webResourceResponse = new WebResourceResponse(str2, "UTF-8", BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "OK", map, gZIPInputStream);
            new Object[1][0] = str;
            azph.m85998a(this.f99882b).mo55165b(2003);
            return bmxv.m108566b(webResourceResponse);
        } catch (IOException e) {
            azoj.m85931a("LWCacheUtils", e, "Error when attempting to load asset", new Object[0]);
            azph.m85998a(this.f99882b).mo55171c(2004, 51, str);
            azpy.m86121a().mo55205a(bopw.FAILED_TO_LOAD_PREBUNDLED_ASSET, System.currentTimeMillis());
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static boolean m86160a(String str) {
        return str.startsWith(cfgs.m139394N()) && str.contains("matchstick_version");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final bmxv mo55217a(String str, Locale locale) {
        azpy.m86121a();
        azpy.m86122a("LWCacheUtils", "getPrebundledAssetForUrl called with URL %s and locale %s", str, locale);
        if (m86160a(str)) {
            azpk.m86089a(this.f99882b).mo55185d("Matchstick.Latency.Lighter.Prebundle.LoadIndexPage.Time");
            if (cfgs.m139416v()) {
                azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_HTML, System.currentTimeMillis());
                return m86159a("lighterweb/prebundle-html.gz", "text/html", azrm.f99949c);
            }
            azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_HTML, System.currentTimeMillis());
            return m86159a("lighterweb/prebundle-non-agnostic-html.gz", "text/html", azrm.f99949c);
        }
        if (cfgs.m139416v()) {
            if (m86161b(str)) {
                azpk.m86089a(this.f99882b).mo55187e("Matchstick.Latency.Lighter.Prebundle.LoadIndexPage.Time");
                azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_JS, System.currentTimeMillis());
                azpk.m86089a(this.f99882b).mo55185d("Matchstick.Latency.Lighter.Prebundle.LoadJsBundle.Time");
                return m86159a("lighterweb/prebundle-js.gz", "text/javascript", azrm.f99950d);
            } else if (str.startsWith(cfgs.m139385E()) && str.contains(cfgs.f183989a.mo6606a().mo81160P())) {
                azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_LOCALE_DATA_JS, System.currentTimeMillis());
                int i = Build.VERSION.SDK_INT;
                String valueOf = String.valueOf(bmwb.m108442a(!TextUtils.isEmpty(locale.toLanguageTag()) ? locale.toLanguageTag() : locale.toString()).replace('_', '-'));
                String valueOf2 = String.valueOf(File.separator);
                String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28);
                sb.append("lighterweb/");
                sb.append(str2);
                sb.append("locale-data-js.gz");
                return m86159a(sb.toString(), "text/javascript", azrm.f99950d);
            }
        } else if (str.startsWith(cfgs.m139385E()) && str.contains(cfgs.m139398d())) {
            azpk.m86089a(this.f99882b).mo55187e("Matchstick.Latency.Lighter.Prebundle.LoadIndexPage.Time");
            azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_JS, System.currentTimeMillis());
            azpk.m86089a(this.f99882b).mo55185d("Matchstick.Latency.Lighter.Prebundle.LoadJsBundle.Time");
            return m86159a("lighterweb/prebundle-non-agnostic-js.gz", "text/javascript", azrm.f99950d);
        }
        if (str.startsWith(cfgs.f183989a.mo6606a().mo81158N())) {
            azpy.m86121a().mo55205a(bopw.PREBUNDLE_INTERCEPT_CSS, System.currentTimeMillis());
            return m86159a("lighterweb/prebundle-css.gz", "text/css", azrm.f99950d);
        }
        new Object[1][0] = str;
        return bmvz.f131120a;
    }
}
