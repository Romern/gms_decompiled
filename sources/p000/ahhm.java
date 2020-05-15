package p000;

import java.util.concurrent.Callable;

/* renamed from: ahhm */
final /* synthetic */ class ahhm implements Callable {

    /* renamed from: a */
    private final ahhp f67215a;

    /* renamed from: b */
    private final ahho f67216b;

    /* renamed from: c */
    private final Callable f67217c;

    public ahhm(ahhp ahhp, ahho ahho, Callable callable) {
        this.f67215a = ahhp;
        this.f67216b = ahho;
        this.f67217c = callable;
    }

    public final Object call() {
        ahhp ahhp = this.f67215a;
        ahho ahho = this.f67216b;
        Callable callable = this.f67217c;
        bqgy a = ahhp.m55792a(ahhp.f67221a, ahho);
        try {
            Object call = callable.call();
            a.mo69138b((Object) null);
            return call;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a.mo69136a((Throwable) e);
            throw e;
        } catch (Exception e2) {
            a.mo69136a((Throwable) e2);
            throw e2;
        }
    }
}
