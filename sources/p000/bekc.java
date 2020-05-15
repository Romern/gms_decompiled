package p000;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bekc */
final /* synthetic */ class bekc implements bqeg {

    /* renamed from: a */
    private final bekk f111693a;

    /* renamed from: b */
    private final bqeh f111694b;

    /* renamed from: c */
    private final Executor f111695c;

    public bekc(bekk bekk, bqeh bqeh, Executor executor) {
        this.f111693a = bekk;
        this.f111694b = bqeh;
        this.f111695c = executor;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bqgg bqgg;
        bekk bekk = this.f111693a;
        bqeh bqeh = this.f111694b;
        Executor executor = this.f111695c;
        Uri uri = (Uri) bqga.m112780a((Future) bekk.f111710b);
        begv a = begv.m95030a((Closeable) bekk.f111713e.mo60643a(uri, beho.m95054a(), new beer[0]));
        try {
            bqgg = bqga.m112775a(bekk.mo60772a(uri));
        } catch (IOException e) {
            try {
                bqgg = bqdx.m112674a(bekk.m95215a(e), bljx.m107266a(new bekh(bekk, uri)), bekk.f111712d);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        bqgg a2 = bqdx.m112674a(bqgg, bqeh, executor);
        bqgg a3 = bqdx.m112674a(a2, bljx.m107266a(new bekd(bekk, bqgg, a2)), bqfb.INSTANCE);
        bqgg[] bqggArr = {a3};
        bqgg a4 = bqga.m112783b(bqggArr).mo69216a(new bekg(a.mo60707a(), a3), bqfb.INSTANCE);
        a.close();
        return a4;
        throw th;
    }
}
