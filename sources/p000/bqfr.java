package p000;

import java.util.concurrent.Callable;

/* renamed from: bqfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqfr implements Callable {

    /* renamed from: a */
    final /* synthetic */ Runnable f140604a;

    public bqfr(Runnable runnable) {
        this.f140604a = runnable;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f140604a.run();
        return null;
    }
}
