package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: belq */
final /* synthetic */ class belq implements Callable {

    /* renamed from: a */
    private final bels f111787a;

    /* renamed from: b */
    private final bqgg f111788b;

    public belq(bels bels, bqgg bqgg) {
        this.f111787a = bels;
        this.f111788b = bqgg;
    }

    public final Object call() {
        bels bels = this.f111787a;
        String str = (String) bqga.m112780a((Future) this.f111788b);
        bpwx a = ((batv) bqga.m112780a((Future) bels.f111796a)).mo55958a(str);
        if (a == null) {
            return null;
        }
        bxvd da = bpyq.f139912g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyq bpyq = (bpyq) da.f164949b;
        str.getClass();
        int i = bpyq.f139914a | 1;
        bpyq.f139914a = i;
        bpyq.f139915b = str;
        a.getClass();
        bpyq.f139916c = a;
        bpyq.f139914a = i | 2;
        bels.mo60785a((bpyq) da.mo74062i(), (int) a.f139588d);
        return null;
    }
}
