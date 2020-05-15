package p000;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: bnud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnud extends LogRecord implements bnth {

    /* renamed from: a */
    private final bnsw f132157a;

    public bnud(bnsw bnsw) {
        super(bnsw.mo68438c(), null);
        this.f132157a = bnsw;
        bnsc f = bnsw.mo68441f();
        setSourceClassName(f.mo68449a());
        setSourceMethodName(f.mo68450b());
        setLoggerName(bnsw.mo68440e());
        setMillis(TimeUnit.NANOSECONDS.toMillis(bnsw.mo68439d()));
    }

    /* renamed from: a */
    public static void m110435a(bnsw bnsw, StringBuilder sb) {
        sb.append("  original message: ");
        if (bnsw.mo68442g() == null) {
            sb.append(bnsw.mo68444i());
        } else {
            sb.append(bnsw.mo68442g().f132133b);
            sb.append("\n  original arguments:");
            Object[] h = bnsw.mo68443h();
            for (Object obj : h) {
                sb.append("\n    ");
                sb.append(bnti.m110384a(obj));
            }
        }
        bnta k = bnsw.mo68446k();
        if (k.mo68393a() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < k.mo68393a(); i++) {
                sb.append("\n    ");
                sb.append(k.mo68395a(i).f132072a);
                sb.append(": ");
                sb.append(k.mo68396b(i));
            }
        }
        sb.append("\n  level: ");
        sb.append(bnsw.mo68438c());
        sb.append("\n  timestamp (nanos): ");
        sb.append(bnsw.mo68439d());
        sb.append("\n  class: ");
        sb.append(bnsw.mo68441f().mo68449a());
        sb.append("\n  method: ");
        sb.append(bnsw.mo68441f().mo68450b());
        sb.append("\n  line number: ");
        sb.append(bnsw.mo68441f().mo68451c());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append(10);
        m110435a(this.f132157a, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public bnud(bnsw bnsw, byte[] bArr) {
        this(bnsw);
        bnti.m110386a(bnsw, this, bnti.f132124b);
    }

    /* renamed from: a */
    public final void mo68481a(Level level, String str, Throwable th) {
        setMessage(str);
        setThrown(th);
    }

    public bnud(RuntimeException runtimeException, bnsw bnsw) {
        this(bnsw);
        setLevel(bnsw.mo68438c().intValue() >= Level.WARNING.intValue() ? bnsw.mo68438c() : Level.WARNING);
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append(10);
        m110435a(bnsw, sb);
        setMessage(sb.toString());
    }
}
