package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwg implements akww {

    /* renamed from: b */
    public static final Logger f72993b = akzt.m60725a("OctarineAppPermissionsBridge");

    /* renamed from: a */
    public final List f72994a = bmyx.m108640a(',').mo66917a().mo66920b().mo66925c((CharSequence) cfqw.f185476a.mo6606a().mo82538b());

    /* renamed from: c */
    private final rfz f72995c;

    /* renamed from: d */
    private final PackageManager f72996d;

    /* renamed from: e */
    private final bmzi f72997e;

    /* renamed from: f */
    private final bmzi f72998f;

    /* renamed from: g */
    private final WebView f72999g;

    public akwg(PackageManager packageManager, rfz rfz, WebView webView) {
        this.f72995c = rfz;
        this.f72996d = packageManager;
        this.f72999g = webView;
        this.f72997e = bmzn.m108681a((bmzi) new akwd(this, packageManager));
        this.f72998f = bmzn.m108681a((bmzi) new akwe(packageManager));
    }

    /* renamed from: a */
    private static void m60589a(WebView webView, int i) {
        m60591a(webView, String.format(Locale.ROOT, "window.ocAppPermissionsCallback(%s, %s, %s)", Integer.valueOf(i), null, true));
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public void getAppPermissionsData(int i) {
        List<PackageInfo> list = (List) this.f72998f.mo6606a();
        if (list == null) {
            f72993b.mo25418e("get installed packages return null", new Object[0]);
            m60589a(this.f72999g, i);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (PackageInfo packageInfo : list) {
            String str = packageInfo.packageName;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (!(str == null || applicationInfo == null || this.f72995c.mo24610b(str) || (applicationInfo.flags & 1) == 1)) {
                PackageManager packageManager = this.f72996d;
                List<String> list2 = this.f72994a;
                bngs j = bngx.m109377j();
                for (String str2 : list2) {
                    if (packageManager.checkPermission(str2, str) == 0) {
                        j.mo67668c(str2);
                    }
                }
                bngx<String> a = j.mo67664a();
                if (!a.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("packageName", str);
                        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
                        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                        jSONObject.put("installerPackageName", this.f72996d.getInstallerPackageName(str));
                        if (this.f72996d.getApplicationLabel(applicationInfo) != null) {
                            jSONObject.put("label", this.f72996d.getApplicationLabel(applicationInfo).toString());
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        for (String str3 : a) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("permission", str3);
                            jSONArray2.put(jSONObject2);
                        }
                        jSONObject.put("permissions", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        f72993b.mo25417e("converting to JSON failed", e, new Object[0]);
                        m60589a(this.f72999g, i);
                        return;
                    }
                }
            }
        }
        m60590a(this.f72999g, i, jSONArray.toString());
    }

    @JavascriptInterface
    public void getSupportedPermissionsDescription(int i) {
        JSONArray jSONArray = (JSONArray) this.f72997e.mo6606a();
        if (jSONArray != null) {
            m60590a(this.f72999g, i, jSONArray.toString());
        } else {
            m60589a(this.f72999g, i);
        }
    }

    /* renamed from: a */
    private static void m60590a(WebView webView, int i, String str) {
        m60591a(webView, String.format(Locale.ROOT, "window.ocAppPermissionsCallback(%s, %s)", Integer.valueOf(i), str));
    }

    /* renamed from: a */
    private static void m60591a(WebView webView, String str) {
        if (webView != null) {
            webView.post(new akwf(webView, str));
        }
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocAppPermissions", new akzu(Pattern.compile(bmxx.m108578b(cfqw.f185476a.mo6606a().mo82539c())), Pattern.compile(bmxx.m108578b(cfqw.f185476a.mo6606a().mo82537a()))), true);
    }
}
