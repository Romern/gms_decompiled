package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.mobiledataplan.p055ui.ConsentWebView;

/* renamed from: agtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtt extends bece {

    /* renamed from: a */
    final /* synthetic */ ConsentWebView f66516a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agtt(ConsentWebView consentWebView, becg becg) {
        super(becg, becg);
        this.f66516a = consentWebView;
    }

    /* renamed from: b */
    public final boolean mo36088b(String str) {
        ConsentWebView.f80319b.mo26019b(agyt.m55307c()).mo68420a("Not whitelisted url: %s", str);
        if (cfmq.f184403a.mo6606a().mo81519l()) {
            agrl.m54942a().mo36003a(bygd.CLICK_CONSENT_TERMS, 9, "Ui", "MDP_UiAction");
        }
        if (URLUtil.isNetworkUrl(str)) {
            try {
                this.f66516a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (ActivityNotFoundException e) {
                bnsl bnsl = (bnsl) ConsentWebView.f80319b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Can't launch url '%s externally", str);
            }
        } else {
            ((bnsl) ConsentWebView.f80319b.mo68388c()).mo68420a("Not a network url: %s", str);
            Toast.makeText(this.f66516a.getContext(), "Can't handle URL", 1).show();
            return false;
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        ConsentWebView consentWebView = this.f66516a;
        srn srn = ConsentWebView.f80319b;
        ConsentWebView.m67300a(webView, consentWebView.f80320a);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        int i = Build.VERSION.SDK_INT;
    }
}
