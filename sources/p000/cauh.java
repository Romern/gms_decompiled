package p000;

import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import javax.net.SocketFactory;

/* renamed from: cauh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauh implements URLStreamHandlerFactory, Cloneable {

    /* renamed from: a */
    private final cauf f176025a;

    public cauh(cauf cauf) {
        this.f176025a = cauf;
    }

    /* renamed from: a */
    public final HttpURLConnection mo74899a(URL url) {
        return mo74900a(url, this.f176025a.f176001c);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new cauh(this.f176025a.clone());
    }

    public final URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals("https")) {
            return new caug(this, str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HttpURLConnection mo74900a(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        cauf cauf = new cauf(this.f176025a);
        if (cauf.f176004f == null) {
            cauf.f176004f = ProxySelector.getDefault();
        }
        if (cauf.f176005g == null) {
            cauf.f176005g = CookieHandler.getDefault();
        }
        if (cauf.f176006h == null) {
            cauf.f176006h = SocketFactory.getDefault();
        }
        if (cauf.f176007i == null) {
            cauf.f176007i = cauf.m127231b();
        }
        if (cauf.f176008j == null) {
            cauf.f176008j = cayn.f176430a;
        }
        if (cauf.f176009k == null) {
            cauf.f176009k = cato.f175853a;
        }
        if (cauf.f176018t == null) {
            cauf.f176018t = caxc.f176303a;
        }
        if (cauf.f176010l == null) {
            cauf.f176010l = catt.f175956a;
        }
        if (cauf.f176002d == null) {
            cauf.f176002d = cauf.f175998a;
        }
        if (cauf.f176003e == null) {
            cauf.f176003e = cauf.f175999b;
        }
        if (cauf.f176011m == null) {
            cauf.f176011m = catz.f175975a;
        }
        cauf.f176001c = proxy;
        if (protocol.equals("http")) {
            return new cayh(url, cauf);
        }
        if (protocol.equals("https")) {
            return new cayi(new cayh(url, cauf));
        }
        String valueOf = String.valueOf(protocol);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
    }
}
