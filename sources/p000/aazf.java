package p000;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aazf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aazf implements aazl {

    /* renamed from: a */
    final /* synthetic */ aasg f56882a;

    /* renamed from: b */
    final /* synthetic */ boolean f56883b;

    /* renamed from: c */
    final /* synthetic */ aazn f56884c;

    public aazf(aazn aazn, aasg aasg, boolean z) {
        this.f56884c = aazn;
        this.f56882a = aasg;
        this.f56883b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* renamed from: a */
    public final void mo31937a() {
        String str;
        aazn aazn = this.f56884c;
        aasg aasg = this.f56882a;
        boolean z = this.f56883b;
        if (!z) {
            if (aasg.f56433h != 29) {
                aazn.f56892a.clearHistory();
                aazn.f56893b.clear();
            } else if (!aazn.f56893b.isEmpty()) {
                ((aasg) aazn.f56893b.peek()).f56429d = aazn.mo31950d();
            }
        }
        aasf aasf = aazn.f56894c;
        if (aasf instanceof HelpChimeraActivity) {
            WebView webView = aazn.f56892a;
            int i = Build.VERSION.SDK_INT;
            webView.setWebViewClient(new abhm((HelpChimeraActivity) aasf, aasg));
        } else {
            WebView webView2 = aazn.f56892a;
            webView2.setWebViewClient(abht.m47722a(aasf));
            abht.m47725a(aasf.mo18630k(), webView2);
        }
        aasm aasm = aasg.f56426a;
        if (aasm == null || !(aasm.f56495e == 2 || aasm.mo31724h() || aasm.f56495e == 14)) {
            throw new IllegalStateException("Unsupported leaf content.");
        }
        WebView webView3 = aazn.f56892a;
        if (aasg.mo31705b()) {
            String str2 = "";
            if (!z && ceeg.f182447a.mo6606a().mo78936D()) {
                aasf aasf2 = aazn.f56894c;
                if (aasf2 instanceof HelpChimeraActivity) {
                    aazi aazi = new aazi((HelpChimeraActivity) aasf2, aasg);
                    str = "gmhSearchResults";
                    webView3.addJavascriptInterface(aazi, str);
                    String a = abfm.m47619a(aazn.f56894c.mo18626g());
                    if (!TextUtils.isEmpty(str)) {
                        str2 = String.format(ceeg.f182447a.mo6606a().mo78962aC(), a, str);
                    }
                    aasm aasm2 = aasg.f56426a;
                    webView3.loadDataWithBaseURL(aasg.f56430e, abht.m47723a(aasm2.f56496f, aasm2.mo31735r(), a, str2, true), "text/html", "UTF-8", null);
                }
            }
            str = str2;
            String a2 = abfm.m47619a(aazn.f56894c.mo18626g());
            if (!TextUtils.isEmpty(str)) {
            }
            aasm aasm22 = aasg.f56426a;
            webView3.loadDataWithBaseURL(aasg.f56430e, abht.m47723a(aasm22.f56496f, aasm22.mo31735r(), a2, str2, true), "text/html", "UTF-8", null);
        } else if (aaya.m47229b(cehp.m136861d()) && aasg.mo31706c()) {
            if (aaya.m47229b(cehv.f182694a.mo6606a().mo79151c())) {
                aasf aasf3 = aazn.f56894c;
                if (aasf3 instanceof HelpChimeraActivity) {
                    webView3.addJavascriptInterface(new abco((HelpChimeraActivity) aasf3), "activity");
                    abht.m47732b(webView3, aasg.f56430e, aasm.f56496f, aasm.mo31735r(), abfm.m47619a(aazn.f56894c.mo18626g()), true);
                }
            }
            webView3.addJavascriptInterface(new aazh(aazn, webView3), "activity");
            abht.m47732b(webView3, aasg.f56430e, aasm.f56496f, aasm.mo31735r(), abfm.m47619a(aazn.f56894c.mo18626g()), true);
        } else {
            abht.m47728a(webView3, aasg.f56430e, aasm.f56496f, aasm.mo31735r(), abfm.m47619a(aazn.f56894c.mo18626g()), true);
        }
        aazn.f56895d = true;
        if (!z) {
            aazn.f56893b.push(aasg);
        }
    }
}
