package p000;

import java.util.concurrent.Callable;

/* renamed from: lof */
final /* synthetic */ class lof implements Callable {

    /* renamed from: a */
    private final lop f26494a;

    public lof(lop lop) {
        this.f26494a = lop;
    }

    public final Object call() {
        kpy kpy = (kpy) this.f26494a.f26504d.mo14841p().get("PredictionDataSync");
        if (kpy == null) {
            return kpx.FAILURE;
        }
        return kpy.mo14774a();
    }
}
