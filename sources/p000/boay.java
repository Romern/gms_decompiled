package p000;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: boay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boay implements boba {

    /* renamed from: a */
    static final boay f132482a = new boay();

    /* renamed from: a */
    public final void mo68840a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = boax.f132481a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", sb.toString(), th2);
    }
}
