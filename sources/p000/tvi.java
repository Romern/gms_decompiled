package p000;

import com.android.volley.toolbox.HurlStack;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* renamed from: tvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tvi extends HurlStack {

    /* renamed from: a */
    private final CronetEngine f46713a;

    public tvi(CronetEngine cronetEngine) {
        this.f46713a = cronetEngine;
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection createConnection(URL url) {
        return (HttpURLConnection) this.f46713a.openConnection(url);
    }
}
