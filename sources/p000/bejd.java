package p000;

import android.net.Uri;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bejd */
final /* synthetic */ class bejd implements bqeg {

    /* renamed from: a */
    private final bejk f111637a;

    /* renamed from: b */
    private final bqeh f111638b;

    /* renamed from: c */
    private final Executor f111639c;

    public bejd(bejk bejk, bqeh bqeh, Executor executor) {
        this.f111637a = bejk;
        this.f111638b = bqeh;
        this.f111639c = executor;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bejk bejk = this.f111637a;
        bqeh bqeh = this.f111638b;
        Executor executor = this.f111639c;
        Uri uri = (Uri) bqga.m112780a((Future) bejk.f111650b);
        begv a = begv.m95030a((Closeable) bejk.f111652d.mo60643a(uri, beho.m95054a(), new beer[0]));
        try {
            bqgg b = bejk.mo60758b(uri);
            bqgg a2 = bqdx.m112674a(b, bqeh, executor);
            bqgg a3 = bqdx.m112674a(a2, bljx.m107266a(new bejf(bejk, b, a2)), bqfb.INSTANCE);
            bqgg[] bqggArr = {a3};
            bqgg a4 = bqga.m112783b(bqggArr).mo69216a(new beji(a.mo60707a(), a3), bqfb.INSTANCE);
            a.close();
            return a4;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
