package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cigg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigg implements Runnable {

    /* renamed from: a */
    public final cigk f190087a;

    /* renamed from: b */
    cihn f190088b;

    /* renamed from: c */
    public boolean f190089c;

    /* renamed from: d */
    public final /* synthetic */ cigh f190090d;

    public cigg(cigh cigh, cihn cihn) {
        this(cigh, cihn, new cigk(Level.FINE, cigh.class));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    public final void run() {
        IOException iOException;
        Logger logger;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f190088b.mo86113a(this)) {
            try {
                cigh cigh = this.f190090d;
                Logger logger2 = cigh.f190093a;
                cibp cibp = cigh.f190129x;
                if (cibp != null) {
                    cibp.mo85907b();
                }
            } catch (Throwable th) {
                try {
                    this.f190088b.close();
                } catch (IOException e) {
                    cigh.f190093a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e);
                }
                cigh cigh2 = this.f190090d;
                Logger logger3 = cigh.f190093a;
                cigh2.f190112g.mo85894b();
                Thread.currentThread().setName(name);
                throw th;
            }
        }
        cigh cigh3 = this.f190090d;
        cihm cihm = cihm.INTERNAL_ERROR;
        chuv a = chuv.f189229p.mo85687a("End of stream or IOException");
        Logger logger4 = cigh.f190093a;
        cigh3.mo86056a(0, cihm, a);
        try {
            this.f190088b.close();
        } catch (IOException e2) {
            iOException = e2;
            logger = cigh.f190093a;
        }
        this.f190090d.f190112g.mo85894b();
        Thread.currentThread().setName(name);
        logger.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) iOException);
        this.f190090d.f190112g.mo85894b();
        Thread.currentThread().setName(name);
    }

    public cigg(cigh cigh, cihn cihn, cigk cigk) {
        this.f190090d = cigh;
        this.f190089c = true;
        this.f190088b = cihn;
        this.f190087a = cigk;
    }
}
