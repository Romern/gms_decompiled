package p000;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lpt */
final /* synthetic */ class lpt implements Runnable {

    /* renamed from: a */
    private final lpy f26559a;

    /* renamed from: b */
    private final bqgg f26560b;

    /* renamed from: c */
    private final lqe f26561c;

    public lpt(lpy lpy, bqgg bqgg, lqe lqe) {
        this.f26559a = lpy;
        this.f26560b = bqgg;
        this.f26561c = lqe;
    }

    public final void run() {
        lpy lpy = this.f26559a;
        bqgg bqgg = this.f26560b;
        try {
            this.f26561c.mo15371a((Collection) ((kek) bqgg.get()).f23936a.stream().filter(lpv.f26564a).map(new lpw(lpy)).collect(Collectors.toList()));
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) lpy.f26569d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lpy", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Execution exception while populating payment card datasets");
        }
    }
}
