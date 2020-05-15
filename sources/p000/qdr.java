package p000;

import android.net.Network;
import android.net.NetworkRequest;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: qdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdr extends qdi {

    /* renamed from: b */
    private final qdq f41005b = new qdq(rpr.m34216b());

    /* renamed from: c */
    private final bmxv f41006c;

    public qdr(qdu qdu) {
        super(qdu);
        this.f41006c = qdu.f41049s.mo66813a() ? bmxv.m108566b((NetworkRequest) qdu.f41049s.mo66814b()) : bmvz.f131120a;
    }

    /* renamed from: a */
    public final HttpURLConnection mo23924a(String str) {
        if (!this.f41006c.mo66813a()) {
            return super.mo23924a(str);
        }
        bmxv a = this.f41005b.mo23960a();
        if (!a.mo66813a()) {
            a = this.f41005b.mo23961a((NetworkRequest) this.f41006c.mo66814b(), cdci.m132546l());
        }
        if (a.mo66813a()) {
            return super.mo23928b().mo32272a(new URL(str), (Network) a.mo66814b());
        }
        if (cdci.m132552r()) {
            return super.mo23924a(str);
        }
        throw new IOException("Unable to acquire network");
    }

    /* renamed from: a */
    public final HttpURLConnection mo23925a(String str, bdbg bdbg) {
        if (!this.f41006c.mo66813a()) {
            return super.mo23925a(str, bdbg);
        }
        bmxv a = this.f41005b.mo23960a();
        if (!a.mo66813a()) {
            a = this.f41005b.mo23961a((NetworkRequest) this.f41006c.mo66814b(), cdci.m132546l());
        }
        if (a.mo66813a()) {
            HttpURLConnection a2 = super.mo23928b().mo32272a(new URL(str), (Network) a.mo66814b());
            if (a2 instanceof HttpsURLConnection) {
                ((HttpsURLConnection) a2).setSSLSocketFactory(this.f40980a);
            }
            a2.setRequestMethod(DataParser.CONNECT_TYPE_POST);
            return a2;
        } else if (cdci.m132552r()) {
            return super.mo23925a(str, bdbg);
        } else {
            throw new IOException("Unable to acquire network");
        }
    }
}
