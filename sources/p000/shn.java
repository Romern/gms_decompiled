package p000;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: shn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shn {

    /* renamed from: a */
    public static final shn f44491a = new shn(rpr.m34216b());

    /* renamed from: b */
    private final qxq f44492b;

    private shn(Context context) {
        qws qws = new qws(context, "GMSCORE_BACKEND_COUNTERS", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        qxq qxq = new qxq(qws, qws.f42340g, 100);
        this.f44492b = qxq;
        qxq.mo24374a();
        this.f44492b.mo24375a(snp.m35703a(1, 10), 3600000);
    }

    /* renamed from: a */
    private static final String m35301a(String str) {
        if (str != null) {
            try {
                URL url = new URL(str.toLowerCase(Locale.US));
                String host = url.getHost();
                if (!"www.googleapis.com".equals(host)) {
                    return host;
                }
                String path = url.getPath();
                int indexOf = path.indexOf(47, 1);
                if (indexOf != -1) {
                    return path.substring(1, indexOf);
                }
                return null;
            } catch (MalformedURLException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo25564a() {
        if (cdle.m133954b() && cdle.f181186a.mo6606a().mo77854b()) {
            this.f44492b.mo24388e();
        }
    }

    /* renamed from: a */
    public final void mo25565a(chtv chtv, chuv chuv) {
        String str;
        if (cdle.m133954b()) {
            if (chtv != null) {
                String str2 = chtv.f189150b;
                String valueOf = String.valueOf(str2.substring(str2.lastIndexOf(46) + 1));
                str = valueOf.length() == 0 ? new String("GRPC-") : "GRPC-".concat(valueOf);
            } else {
                str = "GRPC";
            }
            this.f44492b.mo24385d(str).mo24367a(chuv.f189233s.f189211r);
        }
    }

    /* renamed from: a */
    public final void mo25566a(String str, int i) {
        if (cdle.m133954b()) {
            String a = m35301a(str);
            this.f44492b.mo24385d(a != null ? a.length() == 0 ? new String("Apiary-") : "Apiary-".concat(a) : "Apiary").mo24367a(i);
        }
    }
}
