package p000;

import java.util.concurrent.Callable;

/* renamed from: ahnh */
final /* synthetic */ class ahnh implements Callable {

    /* renamed from: a */
    private final ahnp f67606a;

    /* renamed from: b */
    private final buuw f67607b;

    public ahnh(ahnp ahnp, buuw buuw) {
        this.f67606a = ahnp;
        this.f67607b = buuw;
    }

    public final Object call() {
        ahnp ahnp = this.f67606a;
        return (ahnm) ahnp.f67636c.get(this.f67607b);
    }
}
