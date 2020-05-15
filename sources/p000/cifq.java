package p000;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cifq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cifq implements ciho {

    /* renamed from: d */
    private static final Logger f190021d = Logger.getLogger(cigh.class.getName());

    /* renamed from: a */
    public final cifp f190022a;

    /* renamed from: b */
    public final ciho f190023b;

    /* renamed from: c */
    public final cigk f190024c;

    public cifq(cifp cifp, ciho ciho, cigk cigk) {
        bmxy.m108582a(cifp, "transportExceptionHandler");
        this.f190022a = cifp;
        bmxy.m108582a(ciho, "frameWriter");
        this.f190023b = ciho;
        bmxy.m108582a(cigk, "frameLogger");
        this.f190024c = cigk;
    }

    /* renamed from: a */
    public final void mo86032a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo86036a(ciia ciia) {
        throw null;
    }

    /* renamed from: a */
    public final void mo86038a(boolean z, int i, cipu cipu, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo86039a(boolean z, int i, List list) {
        throw null;
    }

    /* renamed from: b */
    public final void mo86040b() {
        try {
            this.f190023b.mo86040b();
        } catch (IOException e) {
            this.f190022a.mo86031a(e);
        }
    }

    /* renamed from: b */
    public final void mo86041b(ciia ciia) {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    public final void close() {
        Level level;
        try {
            this.f190023b.close();
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger = f190021d;
            if (iOException.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            logger.logp(level, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) iOException);
        }
    }

    /* renamed from: a */
    public final void mo86033a(int i, long j) {
        this.f190024c.mo86067a(2, i, j);
        try {
            this.f190023b.mo86033a(i, j);
        } catch (IOException e) {
            this.f190022a.mo86031a(e);
        }
    }

    /* renamed from: a */
    public final void mo86034a(int i, cihm cihm) {
        this.f190024c.mo86068a(2, i, cihm);
        try {
            this.f190023b.mo86034a(i, cihm);
        } catch (IOException e) {
            this.f190022a.mo86031a(e);
        }
    }

    /* renamed from: a */
    public final void mo86035a(cihm cihm, byte[] bArr) {
        this.f190024c.mo86069a(2, 0, cihm, cipx.m150786a(bArr));
        try {
            this.f190023b.mo86035a(cihm, bArr);
            this.f190023b.mo86040b();
        } catch (IOException e) {
            this.f190022a.mo86031a(e);
        }
    }

    /* renamed from: a */
    public final void mo86037a(boolean z, int i, int i2) {
        if (z) {
            cigk cigk = this.f190024c;
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (cigk.mo86073a()) {
                Logger logger = cigk.f190140a;
                Level level = cigk.f190141b;
                String a = cigi.m150239a(2);
                StringBuilder sb = new StringBuilder(a.length() + 42);
                sb.append(a);
                sb.append(" PING: ack=true bytes=");
                sb.append(j);
                logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
            }
        } else {
            this.f190024c.mo86071a(2, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f190023b.mo86037a(z, i, i2);
        } catch (IOException e) {
            this.f190022a.mo86031a(e);
        }
    }
}
