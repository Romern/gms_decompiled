package p000;

import android.webkit.ValueCallback;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;

/* renamed from: asbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbe implements ValueCallback {

    /* renamed from: a */
    final /* synthetic */ String f88646a;

    /* renamed from: b */
    final /* synthetic */ AccountChallengeWebView f88647b;

    public asbe(AccountChallengeWebView accountChallengeWebView, String str) {
        this.f88647b = accountChallengeWebView;
        this.f88646a = str;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f88647b.f108252l.loadUrl(this.f88646a);
    }
}
