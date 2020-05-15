package p000;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: bnuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnuc extends bnsx {

    /* renamed from: a */
    private static volatile boolean f132155a = false;

    /* renamed from: b */
    private final Logger f132156b;

    public bnuc(Logger logger) {
        this.f132156b = logger;
    }

    /* renamed from: a */
    private static void m110429a(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler handler : logger.getHandlers()) {
            handler.publish(logRecord);
        }
        if (logger.getUseParentHandlers() && (parent = logger.getParent()) != null) {
            m110429a(parent, logRecord);
        }
    }

    /* renamed from: a */
    public final String mo68471a() {
        return this.f132156b.getName();
    }

    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        mo68489a(new bnud(bnsw, (byte[]) null), bnsw.mo68445j());
    }

    /* renamed from: a */
    public final void mo25077a(RuntimeException runtimeException, bnsw bnsw) {
        mo68489a(new bnud(runtimeException, bnsw), bnsw.mo68445j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68489a(LogRecord logRecord, boolean z) {
        if (!z || this.f132156b.isLoggable(logRecord.getLevel())) {
            this.f132156b.log(logRecord);
            return;
        }
        Filter filter = this.f132156b.getFilter();
        if (filter != null) {
            filter.isLoggable(logRecord);
        }
        if (this.f132156b.getClass() != Logger.class && !f132155a) {
            Logger logger = Logger.getLogger(String.valueOf(this.f132156b.getName()).concat(".__forced__"));
            try {
                logger.setLevel(Level.ALL);
                logger.log(logRecord);
            } catch (SecurityException e) {
                f132155a = true;
                Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger sub-classes.\n");
                m110429a(this.f132156b, logRecord);
            }
        } else {
            m110429a(this.f132156b, logRecord);
        }
    }

    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        return this.f132156b.isLoggable(level);
    }
}
