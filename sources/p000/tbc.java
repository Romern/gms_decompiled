package p000;

import android.webkit.WebView;
import com.google.android.gms.constellation.p038ui.ConstellationWebSettingsChimeraActivity;

/* renamed from: tbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tbc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f45598a;

    /* renamed from: b */
    final /* synthetic */ ConstellationWebSettingsChimeraActivity f45599b;

    public tbc(ConstellationWebSettingsChimeraActivity constellationWebSettingsChimeraActivity, String str) {
        this.f45599b = constellationWebSettingsChimeraActivity;
        this.f45598a = str;
    }

    public final void run() {
        WebView webView = this.f45599b.f30568c;
        String valueOf = String.valueOf(this.f45598a);
        webView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }
}
