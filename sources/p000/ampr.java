package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: ampr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ampr implements Callable {

    /* renamed from: a */
    public volatile FutureTask f75690a;

    /* renamed from: b */
    private final Callable f75691b;

    /* renamed from: c */
    private final ArrayDeque f75692c;

    public ampr(Callable callable, ArrayDeque arrayDeque) {
        this.f75691b = callable;
        this.f75692c = arrayDeque;
    }

    public final Object call() {
        String valueOf = String.valueOf(Thread.currentThread().getName());
        if (valueOf.length() == 0) {
            new String("Future called for ");
        } else {
            "Future called for ".concat(valueOf);
        }
        Object call = this.f75691b.call();
        if (this.f75690a != null) {
            synchronized (this.f75692c) {
                this.f75692c.remove(this.f75690a);
            }
            this.f75690a = null;
        }
        return call;
    }
}
