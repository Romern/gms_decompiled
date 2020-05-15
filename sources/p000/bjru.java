package p000;

import java.util.concurrent.Executor;

/* renamed from: bjru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjru implements Executor {

    /* renamed from: a */
    final /* synthetic */ bjsc f123194a;

    public bjru(bjsc bjsc) {
        this.f123194a = bjsc;
    }

    public final void execute(Runnable runnable) {
        this.f123194a.f123211h.post(runnable);
    }
}
