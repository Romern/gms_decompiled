package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: cirq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirq implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f191288a;

    /* renamed from: b */
    final /* synthetic */ cirw f191289b;

    public cirq(cirw cirw, Executor executor) {
        this.f191289b = cirw;
        this.f191288a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f191288a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f191289b.mo86445a(e);
        }
    }
}
