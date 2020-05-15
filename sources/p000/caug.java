package p000;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: caug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caug extends URLStreamHandler {

    /* renamed from: a */
    final /* synthetic */ String f176023a;

    /* renamed from: b */
    final /* synthetic */ cauh f176024b;

    public caug(cauh cauh, String str) {
        this.f176024b = cauh;
        this.f176023a = str;
    }

    /* access modifiers changed from: protected */
    public final int getDefaultPort() {
        if (this.f176023a.equals("http")) {
            return 80;
        }
        if (this.f176023a.equals("https")) {
            return 443;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public final URLConnection openConnection(URL url) {
        return this.f176024b.mo74899a(url);
    }

    /* access modifiers changed from: protected */
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.f176024b.mo74900a(url, proxy);
    }
}
