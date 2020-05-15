package p000;

import java.util.concurrent.Executor;

/* renamed from: bqfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqfb implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
