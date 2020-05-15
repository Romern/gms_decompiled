package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lji */
final /* synthetic */ class lji implements bqeg {

    /* renamed from: a */
    private final bngx f26193a;

    public lji(bngx bngx) {
        this.f26193a = bngx;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bngx bngx = this.f26193a;
        srn srn = ljj.f26194a;
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            try {
                bqga.m112780a((Future) ((bqgg) i.next()));
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) ljj.f26194a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
            }
        }
        return bqga.m112775a((Object) null);
    }
}
