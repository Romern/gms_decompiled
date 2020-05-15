package p000;

import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import com.felicanetworks.mfc.Felica;
import java.io.Closeable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: aboy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aboy extends abor implements Closeable {

    /* renamed from: c */
    public int f57824c;

    /* renamed from: d */
    public int f57825d;

    /* renamed from: e */
    public SSLSocketFactory f57826e;

    /* renamed from: f */
    private Context f57827f;

    public aboy(Context context) {
        this(context, true);
    }

    /* renamed from: a */
    public final HttpURLConnection mo32271a(URL url) {
        return mo32272a(url, (Network) null);
    }

    @Deprecated
    public final void close() {
    }

    public aboy(Context context, boolean z) {
        this(context, z, aboq.PERMIT_ALL);
    }

    /* renamed from: a */
    public final HttpURLConnection mo32272a(URL url, Network network) {
        URLConnection uRLConnection;
        SSLSocketFactory sSLSocketFactory;
        Bundle a;
        String string;
        sdo.m34959a(url);
        sdo.m34959a(url);
        if (!(this.f57811b == aboq.PERMIT_NONE || (a = this.f57810a.mo32269a(url.toString())) == null)) {
            if (a.getString("block") != null) {
                String string2 = a.getString("name");
                String valueOf = String.valueOf(url);
                StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 13 + String.valueOf(valueOf).length());
                sb.append("Blocked by ");
                sb.append(string2);
                sb.append(": ");
                sb.append(valueOf);
                Log.w("GoogleURLConnFactory", sb.toString());
                throw new abos(a);
            } else if (this.f57811b == aboq.PERMIT_ALL && (string = a.getString("rewrite")) != null && (URLUtil.isHttpUrl(string) || URLUtil.isHttpsUrl(string))) {
                url = new URL(string);
            }
        }
        if (network != null) {
            this.f57827f.getSystemService("connectivity");
            uRLConnection = network.openConnection(url);
        } else {
            uRLConnection = url.openConnection();
        }
        uRLConnection.setConnectTimeout(this.f57825d);
        uRLConnection.setReadTimeout(this.f57824c);
        if ((uRLConnection instanceof HttpsURLConnection) && (sSLSocketFactory = this.f57826e) != null) {
            ((HttpsURLConnection) uRLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return (HttpURLConnection) uRLConnection;
    }

    public aboy(Context context, boolean z, aboq aboq) {
        super(context, aboq);
        this.f57824c = Felica.MAX_TIMEOUT;
        this.f57825d = Felica.MAX_TIMEOUT;
        this.f57827f = context;
        if (z) {
            this.f57826e = apto.m70980a((int) Felica.MAX_TIMEOUT, context);
        }
    }
}
