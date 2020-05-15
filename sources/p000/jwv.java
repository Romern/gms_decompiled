package p000;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Locale;

/* renamed from: jwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jwv extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ jwx f23421a;

    public jwv(jwx jwx) {
        this.f23421a = jwx;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        jwx.f23423a.mo25412b(String.format(Locale.getDefault(), "%s/%s:%d - %s", consoleMessage.messageLevel(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message()), new Object[0]);
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = this.f23421a.f23425c;
        message.sendToTarget();
        return true;
    }
}
