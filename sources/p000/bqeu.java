package p000;

import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqeu {

    /* renamed from: a */
    public static final Logger f140563a = Logger.getLogger(bqeu.class.getName());

    /* renamed from: b */
    public final bqes f140564b = new bqes();

    /* renamed from: c */
    public final bqfl f140565c;

    /* renamed from: d */
    private final AtomicReference f140566d = new AtomicReference(bqet.OPEN);

    public bqeu(bemp bemp, Executor executor) {
        bmxy.m108581a(bemp);
        bqhg a = bqhg.m112835a((Callable) new bqen(this, bemp));
        executor.execute(a);
        this.f140565c = a;
    }

    /* renamed from: a */
    public static bqeu m112716a(bqgg bqgg) {
        return new bqeu(bqgg);
    }

    /* renamed from: b */
    private final boolean m112719b(bqet bqet, bqet bqet2) {
        return this.f140566d.compareAndSet(bqet, bqet2);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (((bqet) this.f140566d.get()).equals(bqet.OPEN)) {
            f140563a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            mo69187a();
        }
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("state", this.f140566d.get());
        a.mo66881a(this.f140565c);
        return a.toString();
    }

    @Deprecated
    /* renamed from: a */
    public static bqeu m112717a(bqgg bqgg, Executor executor) {
        bmxy.m108581a(executor);
        bqeu bqeu = new bqeu(bqga.m112772a(bqgg));
        bqga.m112781a(bqgg, new bqem(bqeu, executor), bqfb.INSTANCE);
        return bqeu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.util.concurrent.RejectedExecutionException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m112718a(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new bqeq(closeable));
            } catch (RejectedExecutionException e) {
                RejectedExecutionException rejectedExecutionException = e;
                if (f140563a.isLoggable(Level.WARNING)) {
                    f140563a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) rejectedExecutionException);
                }
                m112718a(closeable, bqfb.INSTANCE);
            }
        }
    }

    private bqeu(bqgg bqgg) {
        this.f140565c = bqfl.m112747c(bqgg);
    }

    /* renamed from: a */
    public final bqeu mo69186a(bqer bqer, Executor executor) {
        bmxy.m108581a(bqer);
        bqeu bqeu = new bqeu(bqdx.m112674a(this.f140565c, new bqeo(this, bqer), executor));
        mo69188a(bqeu.f140564b);
        return bqeu;
    }

    /* renamed from: a */
    public final bqfl mo69187a() {
        if (m112719b(bqet.OPEN, bqet.WILL_CLOSE)) {
            f140563a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "closing", "will close {0}", this);
            this.f140565c.mo741a(new bqep(this), bqfb.INSTANCE);
        } else {
            int ordinal = ((bqet) this.f140566d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            } else if (ordinal == 1) {
                throw new IllegalStateException("Cannot call closing() after deriving another step");
            } else if (ordinal == 5) {
                throw new IllegalStateException("Cannot call closing() after calling getValueAndCloser()");
            }
        }
        return this.f140565c;
    }

    /* renamed from: a */
    public final void mo69188a(bqes bqes) {
        mo69189a(bqet.OPEN, bqet.SUBSUMED);
        bqes.mo69183a(this.f140564b, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo69189a(bqet bqet, bqet bqet2) {
        bmxy.m108606b(m112719b(bqet, bqet2), "Expected state to be %s, but it was %s", bqet, bqet2);
    }
}
