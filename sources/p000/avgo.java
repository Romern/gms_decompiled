package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.udc.p077ui.AuthenticatingWebViewChimeraActivity;

/* renamed from: avgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgo extends bece {

    /* renamed from: a */
    final /* synthetic */ AuthenticatingWebViewChimeraActivity f93150a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avgo(AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity, becg becg) {
        super(becg, becg);
        this.f93150a = authenticatingWebViewChimeraActivity;
    }

    /* renamed from: b */
    public final boolean mo36088b(String str) {
        bnsl bnsl = (bnsl) AuthenticatingWebViewChimeraActivity.f109384b.mo68387b();
        bnsl.mo68432a("avgo", "b", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Url is not whitelisted.");
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.f93150a;
        Intent a = avin.m78589a(authenticatingWebViewChimeraActivity.f109388f, authenticatingWebViewChimeraActivity.f109385c, authenticatingWebViewChimeraActivity.getPackageName());
        if (spn.m35860a(this.f93150a, a)) {
            this.f93150a.startActivity(a);
        } else {
            Toast.makeText(this.f93150a, (int) C0126R.string.common_missing_url_viewer, 1).show();
        }
        return true;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.f93150a;
        srn srn = AuthenticatingWebViewChimeraActivity.f109384b;
        if (authenticatingWebViewChimeraActivity.f109386d) {
            authenticatingWebViewChimeraActivity.f109387e.setVisibility(8);
        }
        C1341rz aW = this.f93150a.mo8628aW();
        if (aW.mo15867f() && TextUtils.isEmpty(aW.mo15849b()) && !TextUtils.isEmpty(webView.getTitle())) {
            aW.mo15858c(true);
            aW.mo15845a(webView.getTitle());
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.f93150a;
        srn srn = AuthenticatingWebViewChimeraActivity.f109384b;
        if (authenticatingWebViewChimeraActivity.f109386d) {
            authenticatingWebViewChimeraActivity.f109387e.setVisibility(0);
        }
    }
}
