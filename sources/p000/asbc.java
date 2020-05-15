package p000;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;

/* renamed from: asbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbc extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ AccountChallengeWebView f88644a;

    public asbc(AccountChallengeWebView accountChallengeWebView) {
        this.f88644a = accountChallengeWebView;
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2;
        String str3;
        int i;
        arpw arpw = new arpw();
        String cookie = arpw.f88108a.getCookie(str);
        if (cookie != null) {
            String a = arpw.m73281a(str);
            String[] split = cookie.split("\\;");
            str3 = null;
            str2 = null;
            for (String str4 : split) {
                int indexOf = str4.indexOf(61);
                if (indexOf > 0 && (i = indexOf + 1) < str4.length()) {
                    String trim = str4.substring(0, indexOf).trim();
                    String trim2 = str4.substring(i).trim();
                    if ("oauth_token".equalsIgnoreCase(trim)) {
                        arpw.mo48741a(a, "oauth_token");
                        str2 = trim2;
                    }
                    if ("GASC".equalsIgnoreCase(trim)) {
                        arpw.mo48741a(a, "GASC");
                        str3 = trim2;
                    }
                    if (!(str2 == null || str3 == null)) {
                        break;
                    }
                }
            }
        } else {
            str3 = null;
            str2 = null;
        }
        arpv arpv = new arpv(str2, str3);
        String str5 = arpv.f88105a;
        String str6 = arpv.f88106b;
        if (str5 == null && str6 == null) {
            AccountChallengeWebView accountChallengeWebView = this.f88644a;
            sek sek = AccountChallengeWebView.f108239a;
            arwo arwo = accountChallengeWebView.f108255o;
            if (arwo != null) {
                arws arws = arwo.f88372a;
                arws.mo48886a(arws.f88378d.f108252l.getTitle());
                AccountChallengeWebView accountChallengeWebView2 = arwo.f88372a.f88378d;
                int i2 = Build.VERSION.SDK_INT;
                accountChallengeWebView2.setOnApplyWindowInsetsListener(new biza());
            }
            this.f88644a.f108252l.bringToFront();
            this.f88644a.f108252l.setVisibility(0);
            this.f88644a.f108253m.mo71366e().setVisibility(4);
        } else if (!TextUtils.isEmpty(str5)) {
            AccountChallengeWebView accountChallengeWebView3 = this.f88644a;
            sek sek2 = AccountChallengeWebView.f108239a;
            accountChallengeWebView3.f108246f.add(accountChallengeWebView3.f108251k);
            new asbj(this.f88644a, this.f88644a.f108251k.getString("name"), str5).execute(new Void[0]);
        } else if (!TextUtils.isEmpty(str6)) {
            AccountChallengeWebView accountChallengeWebView4 = this.f88644a;
            sek sek3 = AccountChallengeWebView.f108239a;
            accountChallengeWebView4.f108251k.putString("sessionCheckpoint", str6);
            this.f88644a.f108251k.putString("url", null);
            AccountChallengeWebView accountChallengeWebView5 = this.f88644a;
            accountChallengeWebView5.f108246f.add(accountChallengeWebView5.f108251k);
            this.f88644a.mo59182g();
            this.f88644a.mo59176c();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(AccountChallengeWebView.f108240b);
        if (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter) || Integer.valueOf(queryParameter).intValue() != 1) {
            return false;
        }
        this.f88644a.mo59177d();
        return true;
    }
}
