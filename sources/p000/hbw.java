package p000;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: hbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hbw extends WebChromeClient {
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        hbz.f19451a.mo25416d("%s/%s:%d - %s", consoleMessage.messageLevel(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = webView;
        message.sendToTarget();
        return true;
    }
}
