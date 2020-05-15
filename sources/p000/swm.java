package p000;

import java.util.concurrent.Executor;

/* renamed from: swm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swm implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
