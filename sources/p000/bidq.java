package p000;

import java.util.concurrent.Executor;

/* renamed from: bidq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bidq implements Executor {

    /* renamed from: a */
    final /* synthetic */ bidv f120316a;

    public bidq(bidv bidv) {
        this.f120316a = bidv;
    }

    public final void execute(Runnable runnable) {
        this.f120316a.f120328c.post(runnable);
    }
}
