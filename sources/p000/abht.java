package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: abht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abht {
    /* renamed from: a */
    public static WebViewClient m47722a(aasf aasf) {
        int i = Build.VERSION.SDK_INT;
        return new abhn(aasf);
    }

    /* renamed from: b */
    public static void m47732b(WebView webView, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (!aaya.m47229b(cehv.f182694a.mo6606a().mo79149a())) {
            str5 = ceft.m136742c();
        } else if (!z) {
            str5 = ceeg.f182447a.mo6606a().mo78951S();
        } else {
            str5 = ceft.m136742c();
        }
        webView.loadDataWithBaseURL(str, m47723a(str2, str3, str4, str5, true), "text/html", "UTF-8", null);
    }

    /* renamed from: a */
    public static String m47723a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head>");
        if (!z) {
            str5 = "<style>.ghelp-search-snippet {  font-size:small;  margin-top:4px;}</style>";
        } else {
            str5 = "<style>.ghelp-body { margin: 0; }</style>";
        }
        sb.append(str5);
        sb.append("<title>");
        sb.append(str);
        sb.append("</title></head><body class=\"ghelp-body\"><script>window['sc_visit_id'] = '");
        sb.append(TextUtils.htmlEncode(str3));
        sb.append("'; </script>");
        sb.append(str4);
        sb.append("<div class=\"ghelp-content\">");
        sb.append(str2);
        sb.append("</div></body></html>");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m47724a(aasf aasf, WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkLoads(false);
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        if ("goldfish".equals(Build.HARDWARE)) {
            webView.setBackgroundColor(0);
        }
        webView.setOnTouchListener(new abhq(settings, webView));
        webView.setWebChromeClient(new WebChromeClient());
        int i = Build.VERSION.SDK_INT;
        m47725a(aasf.mo18630k(), webView);
        settings.setDomStorageEnabled(true);
    }

    /* renamed from: a */
    public static void m47725a(Context context, WebView webView) {
        if (!m47729a(context)) {
            webView.setOnLongClickListener(new abhr());
        }
    }

    /* renamed from: a */
    public static void m47726a(Activity activity, Intent intent, HelpConfig helpConfig) {
        intent.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity");
        intent.putExtra("EXTRA_HELP_CONFIG", helpConfig);
        activity.startActivityForResult(intent, 0);
    }

    /* renamed from: a */
    public static void m47727a(Activity activity, Uri uri, HelpConfig helpConfig, abcr abcr) {
        if (!ssk.m36235a(activity)) {
            Toast.makeText(activity, activity.getString(C0126R.string.gh_network_request_failed), 0).show();
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(uri);
        if (!spn.m35860a(activity, data)) {
            m47726a(activity, data, helpConfig);
            return;
        }
        activity.startActivity(data);
        abcx.m47494a(activity, helpConfig, uri.toString(), abcr);
    }

    /* renamed from: a */
    public static void m47728a(WebView webView, String str, String str2, String str3, String str4, boolean z) {
        webView.loadDataWithBaseURL(str, m47723a(str2, str3, str4, "", z), "text/html", "UTF-8", null);
    }

    /* renamed from: a */
    public static boolean m47729a(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            Log.w("gH_WebViewUtils", "USER_SETUP_COMPLETE setting not found, assuming it was completed.", e);
            return true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abhp.a(android.net.Uri, boolean):boolean
     arg types: [android.net.Uri, int]
     candidates:
      abhp.a(java.lang.String, boolean):boolean
      abhp.a(android.net.Uri, boolean):boolean */
    /* renamed from: a */
    public static boolean m47730a(Activity activity, Intent intent, HelpConfig helpConfig, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!(intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null)) {
            Uri data = intent.getData();
            String uri = data.toString();
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (aasm.m46883a(uri, aasw.m46952a(), helpConfig, z, i) != null && abhp.m47717a(data, true)) {
                intent.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity");
                intent.putExtra("EXTRA_HELP_CONFIG", helpConfig);
                intent.putExtra("extra_is_from_chat", z);
                if (cegr.m136797c()) {
                    if (i == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    intent.putExtra("extra_is_from_c2c", z3);
                }
                if (i == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intent.putExtra("extra_is_from_email", z2);
                if (i == 5) {
                    z4 = true;
                }
                intent.putExtra("extra_is_from_sj", z4);
                activity.startActivityForResult(intent, 1);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m47731a(String str, abbi abbi, bebk bebk) {
        String str2;
        HelpConfig helpConfig = abbi.f56986y;
        if (helpConfig != null) {
            Uri parse = Uri.parse(str);
            String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
            if (!aayh.m47254a(uri, cegr.f182647a.mo6606a().mo79115d())) {
                if (!TextUtils.isEmpty(uri)) {
                    String[] split = TextUtils.split(cegr.f182647a.mo6606a().mo79114c(), ",");
                    int length = split.length;
                    C1225nr nrVar = new C1225nr(length);
                    for (String str3 : split) {
                        String trim = str3.trim();
                        if (!TextUtils.isEmpty(trim)) {
                            nrVar.add(trim);
                        }
                    }
                    String[] a = aayh.m47256a(cegr.f182647a.mo6606a().mo79116e());
                    for (String str4 : a) {
                        if (!TextUtils.isEmpty(str4)) {
                            String[] split2 = TextUtils.split(str4, "%1\\$s");
                            if (split2.length == 2 && uri.startsWith(split2[0]) && uri.endsWith(split2[1]) && nrVar.contains(uri.substring(split2[0].length(), uri.length() - split2[1].length()))) {
                            }
                        }
                    }
                }
            }
            Account account = helpConfig.f78829d;
            if (account == null) {
                str2 = "";
            } else {
                try {
                    str2 = account.name;
                } catch (bebj e) {
                    m47727a(abbi, parse, helpConfig, abbi.f56987z);
                }
            }
            bebk.m91721a(abbi, str2);
            return true;
        }
        return false;
    }
}
