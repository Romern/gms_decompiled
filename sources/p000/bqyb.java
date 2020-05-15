package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: bqyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqyb extends bqxy {

    /* renamed from: b */
    private final bqya f141933b = new bqya();

    /* renamed from: a */
    public final void mo69458a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.f141933b.mo69465a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69462b(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f141933b.mo69465a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69459a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f141933b.mo69465a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69460a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f141933b.mo69465a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }

    /* renamed from: a */
    public final Throwable[] mo69461a(Throwable th) {
        List a = this.f141933b.mo69465a(th, false);
        return (a == null || a.isEmpty()) ? bqxy.f141929a : (Throwable[]) a.toArray(bqxy.f141929a);
    }
}
