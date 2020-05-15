package p000;

import com.android.volley.toolbox.HurlStack;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* renamed from: fgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgm extends HurlStack {

    /* renamed from: a */
    private final CronetEngine f16517a;

    /* renamed from: b */
    private final int f16518b;

    public fgm(CronetEngine cronetEngine, int i) {
        this.f16517a = cronetEngine;
        this.f16518b = i;
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection createConnection(URL url) {
        citq citq = new citq(url, this.f16517a);
        citq.mo86534a(shr.m35311a(4102));
        citq.mo86536b(this.f16518b);
        return citq;
    }
}
