package p000;

import java.util.concurrent.Executor;

/* renamed from: svt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svt implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
