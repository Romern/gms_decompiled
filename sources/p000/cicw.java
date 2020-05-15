package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: cicw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicw extends WeakReference {

    /* renamed from: a */
    public static final /* synthetic */ int f189852a = 0;

    /* renamed from: b */
    private static final boolean f189853b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: c */
    private static final RuntimeException f189854c;

    /* renamed from: d */
    private final ReferenceQueue f189855d;

    /* renamed from: e */
    private final ConcurrentMap f189856e;

    /* renamed from: f */
    private final String f189857f;

    /* renamed from: g */
    private final Reference f189858g;

    /* renamed from: h */
    private final AtomicBoolean f189859h = new AtomicBoolean();

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f189854c = runtimeException;
    }

    public cicw(cicx cicx, chsz chsz, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(cicx, referenceQueue);
        RuntimeException runtimeException;
        if (f189853b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = f189854c;
        }
        this.f189858g = new SoftReference(runtimeException);
        this.f189857f = chsz.toString();
        this.f189855d = referenceQueue;
        this.f189856e = concurrentMap;
        concurrentMap.put(this, this);
        m150028a(referenceQueue);
    }

    /* renamed from: a */
    static void m150028a(ReferenceQueue referenceQueue) {
        while (true) {
            cicw cicw = (cicw) referenceQueue.poll();
            if (cicw != null) {
                RuntimeException runtimeException = (RuntimeException) cicw.f189858g.get();
                cicw.m150029b();
                if (!cicw.f189859h.get()) {
                    Level level = Level.SEVERE;
                    if (cicx.f189860b.isLoggable(level)) {
                        String property = System.getProperty("line.separator");
                        StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 148);
                        sb.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                        sb.append(property);
                        sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        LogRecord logRecord = new LogRecord(level, sb.toString());
                        logRecord.setLoggerName(cicx.f189860b.getName());
                        logRecord.setParameters(new Object[]{cicw.f189857f});
                        logRecord.setThrown(runtimeException);
                        cicx.f189860b.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private final void m150029b() {
        super.clear();
        this.f189856e.remove(this);
        this.f189858g.clear();
    }

    public final void clear() {
        m150029b();
        m150028a(this.f189855d);
    }

    /* renamed from: a */
    public final void mo85968a() {
        if (!this.f189859h.getAndSet(true)) {
            clear();
        }
    }
}
