package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bqgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqgm implements Executor {

    /* renamed from: a */
    boolean f140623a = true;

    /* renamed from: b */
    final /* synthetic */ Executor f140624b;

    /* renamed from: c */
    final /* synthetic */ bqdt f140625c;

    public bqgm(Executor executor, bqdt bqdt) {
        this.f140624b = executor;
        this.f140625c = bqdt;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f140624b.execute(new bqgl(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.f140623a) {
                this.f140625c.mo69136a((Throwable) e);
            }
        }
    }
}
