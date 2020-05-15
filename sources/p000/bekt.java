package p000;

import android.net.Uri;
import java.io.IOException;

/* renamed from: bekt */
final /* synthetic */ class bekt implements bqeh {

    /* renamed from: a */
    private final bekv f111734a;

    public bekt(bekv bekv) {
        this.f111734a = bekv;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bekv bekv = this.f111734a;
        Uri uri = (Uri) obj;
        Uri a = bell.m95260a(uri, ".bak");
        try {
            if (bekv.f111740e.mo60647c(a)) {
                bekv.f111740e.mo60645a(a, uri);
            }
            return bqga.m112775a((Object) null);
        } catch (IOException e) {
            return bqga.m112777a((Throwable) e);
        }
    }
}
