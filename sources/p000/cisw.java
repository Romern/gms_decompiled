package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: cisw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisw implements Executor {

    /* renamed from: a */
    public final Executor f191355a;

    /* renamed from: b */
    public final Runnable f191356b = new cisv(this);

    /* renamed from: c */
    public final ArrayDeque f191357c = new ArrayDeque();

    /* renamed from: d */
    public boolean f191358d;

    public cisw(Executor executor) {
        this.f191355a = executor;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f191357c) {
            this.f191357c.addLast(runnable);
            try {
                this.f191355a.execute(this.f191356b);
            } catch (RejectedExecutionException e) {
                this.f191357c.removeLast();
            }
        }
    }
}
