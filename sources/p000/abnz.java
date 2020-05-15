package p000;

import java.util.concurrent.Executor;

/* renamed from: abnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abnz implements Executor {
    public final void execute(Runnable runnable) {
        try {
            runnable.run();
        } catch (NullPointerException e) {
            eoa.m10824a("Herrevad", "requestCellInfoUpdate runnable error %s", e.getMessage());
        }
    }
}
