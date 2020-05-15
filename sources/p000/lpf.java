package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/* renamed from: lpf */
final /* synthetic */ class lpf implements Runnable {

    /* renamed from: a */
    private final lpk f26532a;

    /* renamed from: b */
    private final bqgg f26533b;

    /* renamed from: c */
    private final lqe f26534c;

    public lpf(lpk lpk, bqgg bqgg, lqe lqe) {
        this.f26532a = lpk;
        this.f26533b = bqgg;
        this.f26534c = lqe;
    }

    public final void run() {
        lpk lpk = this.f26532a;
        bqgg bqgg = this.f26533b;
        try {
            this.f26534c.mo15371a((Collection) ((kek) bqgg.get()).f23936a.stream().filter(lpg.f26535a).map(new lph(lpk)).collect(Collectors.toList()));
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) lpk.f26540d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lpk", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Execution exception while populating credential datasets");
        }
    }
}
