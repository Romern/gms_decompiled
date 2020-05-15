package p000;

import java.util.concurrent.Callable;

/* renamed from: bdxm */
final /* synthetic */ class bdxm implements Callable {

    /* renamed from: a */
    private final bdxs f106594a;

    /* renamed from: b */
    private final long f106595b;

    /* renamed from: c */
    private final Iterable f106596c;

    public bdxm(bdxs bdxs, long j, Iterable iterable) {
        this.f106594a = bdxs;
        this.f106595b = j;
        this.f106596c = iterable;
    }

    public final Object call() {
        this.f106594a.mo58427b(this.f106595b, this.f106596c);
        return null;
    }
}
