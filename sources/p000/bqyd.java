package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: bqyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqyd extends bqxy {
    /* renamed from: a */
    public final void mo69458a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    /* renamed from: b */
    public final void mo69462b(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: a */
    public final void mo69459a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    /* renamed from: a */
    public final void mo69460a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    /* renamed from: a */
    public final Throwable[] mo69461a(Throwable th) {
        return th.getSuppressed();
    }
}
