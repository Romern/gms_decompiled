package p000;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* renamed from: cita */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cita implements Executor {

    /* renamed from: a */
    private final Executor f191381a;

    public cita(Executor executor) {
        this.f191381a = executor;
    }

    public final void execute(Runnable runnable) {
        cisz cisz = new cisz(runnable, Thread.currentThread());
        this.f191381a.execute(cisz);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = cisz.f191379b;
        if (inlineExecutionProhibitedException == null) {
            cisz.f191378a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }
}
