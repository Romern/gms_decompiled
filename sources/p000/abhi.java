package p000;

import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;

/* renamed from: abhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhi {

    /* renamed from: a */
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity f57479a;

    public abhi(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.f57479a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    @JavascriptInterface
    public void onSubmit() {
        int i;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.f57479a;
        if (!googleHelpRenderingApiWebViewChimeraActivity.f79008e) {
            if (!googleHelpRenderingApiWebViewChimeraActivity.f79007d) {
                i = C0126R.string.gh_c2c_success_message;
            } else {
                i = C0126R.string.gh_chat_thanks_feedback;
            }
            Toast.makeText(googleHelpRenderingApiWebViewChimeraActivity, googleHelpRenderingApiWebViewChimeraActivity.getString(i), 0).show();
        }
    }

    @JavascriptInterface
    public void onSubmitError() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.f57479a;
        Toast.makeText(googleHelpRenderingApiWebViewChimeraActivity, googleHelpRenderingApiWebViewChimeraActivity.getString(C0126R.string.gh_server_failure_dialog_message), 0).show();
        googleHelpRenderingApiWebViewChimeraActivity.runOnUiThread(new abhj(googleHelpRenderingApiWebViewChimeraActivity));
    }
}
