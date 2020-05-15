package p000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: baxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxp implements Executor {

    /* renamed from: a */
    private final Executor f102051a;

    /* renamed from: b */
    private final int f102052b;

    /* renamed from: c */
    private final Object f102053c = new Object();

    /* renamed from: d */
    private int f102054d = 0;

    /* renamed from: e */
    private final Queue f102055e = new ArrayDeque();

    public baxp(Executor executor, int i) {
        this.f102051a = executor;
        this.f102052b = i;
    }

    /* renamed from: a */
    public final void mo56025a() {
        synchronized (this.f102053c) {
            Runnable runnable = (Runnable) this.f102055e.poll();
            if (runnable == null) {
                this.f102054d--;
                return;
            }
            try {
                this.f102051a.execute(new baxo(this, runnable));
            } catch (Throwable th) {
                bbev.m87908a(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.f102053c) {
                    this.f102054d--;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        bmxy.m108581a(runnable);
        synchronized (this.f102053c) {
            int i = this.f102054d;
            if (i < this.f102052b) {
                this.f102054d = i + 1;
                try {
                    this.f102051a.execute(new baxo(this, runnable));
                } catch (Throwable th) {
                    synchronized (this.f102053c) {
                        this.f102054d--;
                        throw th;
                    }
                }
            } else {
                this.f102055e.add(runnable);
            }
        }
    }
}
