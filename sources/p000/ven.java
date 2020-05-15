package p000;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: ven */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ven implements vfk {

    /* renamed from: a */
    final /* synthetic */ veq f49125a;

    public ven(veq veq) {
        this.f49125a = veq;
    }

    /* renamed from: a */
    public final vfj mo28349a(URL url) {
        vep vep;
        synchronized (this.f49125a) {
            if (this.f49125a.mo28375c()) {
                try {
                    veq veq = this.f49125a;
                    vep = new vep(veq, veq.f49133b, (HttpURLConnection) stp.m36306a(url, 2818));
                } catch (Exception e) {
                    shr.m35312a();
                    throw e;
                }
            } else {
                throw new vex("No network matching permissions is available.");
            }
        }
        return vep;
    }
}
