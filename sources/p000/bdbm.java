package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.chromium.net.CronetEngine;

/* renamed from: bdbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbm implements bdcf {

    /* renamed from: a */
    private final CronetEngine f105267a;

    public bdbm(CronetEngine cronetEngine) {
        this.f105267a = cronetEngine;
    }

    /* renamed from: a */
    public final HttpURLConnection mo57851a(String str) {
        URLConnection openConnection = this.f105267a.openConnection(new URL(str));
        if (openConnection instanceof HttpURLConnection) {
            return (HttpURLConnection) openConnection;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }
}
