package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: abho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class abho extends WebViewClient {

    /* renamed from: a */
    protected final abhp f57488a;

    /* renamed from: b */
    protected final aasf f57489b;

    public abho(aasf aasf) {
        this.f57488a = new abhp(aasf);
        this.f57489b = aasf;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abhp.a(android.net.Uri, boolean):boolean
     arg types: [android.net.Uri, int]
     candidates:
      abhp.a(java.lang.String, boolean):boolean
      abhp.a(android.net.Uri, boolean):boolean */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        aasf aasf = this.f57489b;
        if ((aasf instanceof abbi) && abht.m47731a(str, (abbi) aasf, new bebk())) {
            return true;
        }
        if (abhp.m47717a(Uri.parse(str), true)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context k = this.f57489b.mo18630k();
        if (!spn.m35860a(k, intent)) {
            Toast.makeText(k, k.getResources().getString(C0126R.string.gh_action_not_supported_message), 0).show();
        } else {
            k.startActivity(intent);
        }
        return true;
    }
}
