package p000;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.auth.login.BrowserChimeraActivity;

/* renamed from: jep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jep extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ BrowserChimeraActivity f22299a;

    public jep(BrowserChimeraActivity browserChimeraActivity) {
        this.f22299a = browserChimeraActivity;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = this.f22299a.f10979q;
        message.sendToTarget();
        return true;
    }
}
