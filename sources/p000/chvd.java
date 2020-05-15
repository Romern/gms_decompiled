package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvd extends chrj {

    /* renamed from: a */
    static final ThreadLocal f189252a = new ThreadLocal();

    /* renamed from: b */
    private static final Logger f189253b = Logger.getLogger(chvd.class.getName());

    /* renamed from: a */
    public final chrk mo85563a() {
        chrk chrk = (chrk) f189252a.get();
        return chrk == null ? chrk.f189037b : chrk;
    }

    /* renamed from: a */
    public final chrk mo85564a(chrk chrk) {
        chrk a = mo85563a();
        f189252a.set(chrk);
        return a;
    }

    /* renamed from: a */
    public final void mo85565a(chrk chrk, chrk chrk2) {
        if (mo85563a() != chrk) {
            f189253b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (chrk2 == chrk.f189037b) {
            f189252a.set(null);
        } else {
            f189252a.set(chrk2);
        }
    }
}
