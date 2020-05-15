package p000;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: chxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxh {

    /* renamed from: a */
    static final Logger f189449a = Logger.getLogger(chqq.class.getName());

    /* renamed from: b */
    public final Object f189450b = new Object();

    /* renamed from: c */
    public final chse f189451c;

    /* renamed from: d */
    public final Collection f189452d;

    public chxh(chse chse, long j, String str) {
        bmxy.m108582a(str, "description");
        bmxy.m108582a(chse, "logId");
        this.f189451c = chse;
        this.f189452d = null;
        chrx chrx = new chrx();
        chrx.f189067a = String.valueOf(str).concat(" created");
        chrx.f189068b = chry.CT_INFO;
        chrx.mo85590a(j);
        mo85789a(chrx.mo85589a());
    }

    /* renamed from: a */
    static void m149751a(chse chse, Level level, String str) {
        if (f189449a.isLoggable(level)) {
            String valueOf = String.valueOf(chse);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(str).length());
            sb.append("[");
            sb.append(valueOf);
            sb.append("] ");
            sb.append(str);
            LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(f189449a.getName());
            logRecord.setSourceClassName(f189449a.getName());
            logRecord.setSourceMethodName("log");
            f189449a.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85788a() {
        synchronized (this.f189450b) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85789a(chrz chrz) {
        Level level;
        chry chry = chry.CT_UNKNOWN;
        int ordinal = chrz.f189077b.ordinal();
        if (ordinal == 2) {
            level = Level.FINER;
        } else if (ordinal != 3) {
            level = Level.FINEST;
        } else {
            level = Level.FINE;
        }
        mo85788a();
        m149751a(this.f189451c, level, chrz.f189076a);
    }
}
