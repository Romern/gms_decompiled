package p000;

import java.util.concurrent.Executor;

/* renamed from: bgkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgkv implements Executor {

    /* renamed from: a */
    public final Runnable f116726a;

    /* renamed from: b */
    private final Executor f116727b;

    public bgkv(Executor executor, Runnable runnable) {
        this.f116727b = executor;
        this.f116726a = runnable;
    }

    public final void execute(Runnable runnable) {
        this.f116727b.execute(new bgku(this, runnable));
    }
}
