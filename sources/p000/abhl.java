package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class abhl extends WebViewClient {

    /* renamed from: a */
    protected final HelpChimeraActivity f57483a;

    /* renamed from: b */
    protected final aasg f57484b;

    /* renamed from: c */
    private aaxx f57485c;

    /* renamed from: d */
    private final aass f57486d = new aass(this.f57483a, this.f57484b);

    public abhl(HelpChimeraActivity helpChimeraActivity, aasg aasg) {
        this.f57483a = helpChimeraActivity;
        this.f57484b = aasg;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f57484b.f56429d > 0.0f) {
            webView.postDelayed(new abhk(this, webView), 10);
        }
        aasg aasg = this.f57484b;
        HelpChimeraActivity helpChimeraActivity = this.f57483a;
        wzh wzh = aasg.f56432g;
        if (wzh != null) {
            int i = aasg.f56434i;
            long a = wzh.mo29582a();
            bzpv bzpv = bzpv.HELP_ANSWER_FRAGMENT;
            String str2 = aasg.f56428c;
            aasm aasm = aasg.f56426a;
            abcx.m47468a(helpChimeraActivity, i, a, bzpv, str2, aasm != null ? aasm.f56497g : null, aasg.f56427b);
            aasg.f56432g = null;
            aasg.f56434i = 1;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        HelpChimeraActivity helpChimeraActivity;
        InProductHelp inProductHelp;
        if (!abht.m47731a(str, this.f57483a, new bebk())) {
            Uri parse = Uri.parse(str);
            if (!this.f57486d.mo31749a(parse, 29)) {
                if (!aaya.m47229b(cehp.m136861d()) || !this.f57484b.mo31706c()) {
                    aasm a = aasm.m46882a(str, this.f57484b.mo31707d(), this.f57483a.f56986y);
                    if (a != null) {
                        if (this.f57485c == null) {
                            this.f57485c = new aaxx(this.f57483a);
                        }
                        String a2 = this.f57485c.mo31883a(a.f56497g);
                        if (!TextUtils.isEmpty(a2)) {
                            a.f56504n = a2;
                        }
                        if (!this.f57484b.mo31705b()) {
                            abcx.m47473a(this.f57483a, 29, a.f56497g, -1, "");
                        }
                        abgx.m47704a(this.f57483a, a, 29, -1);
                        return true;
                    } else if (TextUtils.isEmpty(str) || (helpChimeraActivity = this.f57483a) == null) {
                        return false;
                    } else {
                        abht.m47727a(helpChimeraActivity, parse, helpChimeraActivity.f56986y, helpChimeraActivity.f56987z);
                        return true;
                    }
                } else {
                    Intent intent = this.f57483a.getIntent();
                    HelpConfig helpConfig = this.f57483a.f56986y;
                    if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
                        inProductHelp = (InProductHelp) sef.m35067a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
                    } else {
                        inProductHelp = new InProductHelp((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), null, null, 0, null, 0);
                    }
                    inProductHelp.f78784a.f78753D = helpConfig.f78830e;
                    inProductHelp.f78786c = str;
                    inProductHelp.mo43200b();
                    Intent intent2 = new Intent(this.f57483a.getIntent());
                    sef.m35071a(inProductHelp, intent2, "EXTRA_IN_PRODUCT_HELP");
                    this.f57483a.startActivity(intent2);
                    return true;
                }
            }
        }
        return true;
    }
}
