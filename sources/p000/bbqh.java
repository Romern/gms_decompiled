package p000;

import java.util.concurrent.Callable;

/* renamed from: bbqh */
final /* synthetic */ class bbqh implements Callable {

    /* renamed from: a */
    private final long f103067a;

    public bbqh(long j) {
        this.f103067a = j;
    }

    public final Object call() {
        long j = this.f103067a;
        try {
            if (bbqi.f103068a == null) {
                bbqi.f103068a = bbqv.m88428a();
            }
            Thread.sleep(j);
            return null;
        } catch (InterruptedException e) {
            bbos.m88292b("FutureUtils", "error when sleeping", e);
            throw e;
        }
    }
}
