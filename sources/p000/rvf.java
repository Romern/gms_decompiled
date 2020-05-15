package p000;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: rvf */
final /* synthetic */ class rvf implements Callable {

    /* renamed from: a */
    private final rvj f43732a;

    /* renamed from: b */
    private final rvl f43733b;

    /* renamed from: c */
    private final ruf f43734c;

    /* renamed from: d */
    private final Set f43735d;

    public rvf(rvj rvj, rvl rvl, ruf ruf, Set set) {
        this.f43732a = rvj;
        this.f43733b = rvl;
        this.f43734c = ruf;
        this.f43735d = set;
    }

    public final Object call() {
        return this.f43732a.mo25194a(this.f43733b, this.f43734c, this.f43735d);
    }
}
