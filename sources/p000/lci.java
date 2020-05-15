package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lci implements Runnable {

    /* renamed from: a */
    private final bqgy f25789a;

    /* renamed from: b */
    private final List f25790b;

    public lci(bqgy bqgy, List list) {
        this.f25789a = bqgy;
        this.f25790b = list;
    }

    public final void run() {
        if (!this.f25789a.isDone()) {
            for (bqgg bqgg : this.f25790b) {
                if (bqgg.isDone()) {
                    try {
                        bmxv bmxv = (bmxv) bqga.m112780a((Future) bqgg);
                        if (bmxv.mo66813a()) {
                            this.f25789a.mo69138b(bmxv);
                        }
                    } catch (ExecutionException e) {
                        bnsl bnsl = (bnsl) lcj.f25791a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("lci", "run", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68448m();
                    }
                } else {
                    return;
                }
            }
            this.f25789a.mo69138b(bmvz.f131120a);
        }
    }
}
