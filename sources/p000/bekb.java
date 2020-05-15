package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: bekb */
final /* synthetic */ class bekb implements bqeg {

    /* renamed from: a */
    private final bekk f111692a;

    public bekb(bekk bekk) {
        this.f111692a = bekk;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bekk bekk = this.f111692a;
        Uri uri = (Uri) bqga.m112780a((Future) bekk.f111710b);
        try {
            return bqga.m112775a(bekk.mo60773b(uri));
        } catch (IOException e) {
            return bqdx.m112674a(bekk.m95215a(e), bljx.m107266a(new beki(bekk, uri)), bekk.f111712d);
        }
    }
}
