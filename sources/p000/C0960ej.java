package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0960ej implements Executor {

    /* renamed from: a */
    private final Executor f15111a;

    /* renamed from: b */
    private final ArrayDeque f15112b = new ArrayDeque();

    /* renamed from: c */
    private Runnable f15113c;

    public C0960ej(Executor executor) {
        this.f15111a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo10186a() {
        Runnable runnable = (Runnable) this.f15112b.poll();
        this.f15113c = runnable;
        if (runnable != null) {
            this.f15111a.execute(runnable);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.f15112b.offer(new C0959ei(this, runnable));
        if (this.f15113c == null) {
            mo10186a();
        }
    }
}
