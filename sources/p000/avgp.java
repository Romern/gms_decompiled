package p000;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.udc.p077ui.AuthenticatingWebViewChimeraActivity;

/* renamed from: avgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgp extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ AuthenticatingWebViewChimeraActivity f93151a;

    public avgp(AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity) {
        this.f93151a = authenticatingWebViewChimeraActivity;
    }

    public final void onProgressChanged(WebView webView, int i) {
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.f93151a;
        srn srn = AuthenticatingWebViewChimeraActivity.f109384b;
        if (authenticatingWebViewChimeraActivity.f109386d) {
            authenticatingWebViewChimeraActivity.f109387e.setProgress(i);
            if (i == 100) {
                this.f93151a.f109387e.setVisibility(8);
            }
        }
    }
}
