package p000;

import com.android.volley.toolbox.HurlStack;
import com.felicanetworks.mfc.Felica;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: fgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgq extends HurlStack {

    /* renamed from: a */
    private final cauh f16521a;

    public fgq() {
        cauf cauf = new cauf();
        cauf.f176013o = true;
        cauf.f176007i = apto.m70980a((int) Felica.MAX_TIMEOUT, rpr.m34216b());
        this.f16521a = new cauh(cauf);
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection createConnection(URL url) {
        return this.f16521a.mo74899a(url);
    }
}
