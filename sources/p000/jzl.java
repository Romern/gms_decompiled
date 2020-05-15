package p000;

import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: jzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f23577a;

    /* renamed from: b */
    final /* synthetic */ CustomWebView f23578b;

    public jzl(String str, CustomWebView customWebView) {
        this.f23577a = str;
        this.f23578b = customWebView;
    }

    public final void run() {
        kaa.f23599d.mo25412b("runJavascript: %s", this.f23577a);
        CustomWebView customWebView = this.f23578b;
        String valueOf = String.valueOf(this.f23577a);
        customWebView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }
}
