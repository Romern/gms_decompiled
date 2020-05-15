package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: bekp */
final /* synthetic */ class bekp implements bqeg {

    /* renamed from: a */
    private final bekv f111727a;

    public bekp(bekv bekv) {
        this.f111727a = bekv;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bekv bekv = this.f111727a;
        try {
            return bqga.m112775a(bekv.mo60774a((Uri) bqga.m112780a((Future) bekv.f111737b)));
        } catch (IOException e) {
            if ((e instanceof begf) || (e.getCause() instanceof begf)) {
                return bqga.m112777a((Throwable) e);
            }
            return bqdx.m112674a(bqga.m112777a((Throwable) e), bljx.m107266a(new beks(bekv)), bekv.f111739d);
        }
    }
}
