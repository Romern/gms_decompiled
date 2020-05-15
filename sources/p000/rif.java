package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: rif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rif extends WebViewClient {
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (rie.m33632a(str)) {
            return false;
        }
        Toast.makeText(webView.getContext(), (int) C0126R.string.common_no_browser_for_restricted_url, 1).show();
        return true;
    }
}
