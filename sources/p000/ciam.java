package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciam {

    /* renamed from: g */
    private static final Logger f189668g = Logger.getLogger(ciam.class.getName());

    /* renamed from: a */
    public final long f189669a;

    /* renamed from: b */
    public final bmza f189670b;

    /* renamed from: c */
    public Map f189671c = new LinkedHashMap();

    /* renamed from: d */
    public boolean f189672d;

    /* renamed from: e */
    public Throwable f189673e;

    /* renamed from: f */
    public long f189674f;

    public ciam(long j, bmza bmza) {
        this.f189669a = j;
        this.f189670b = bmza;
    }

    /* renamed from: a */
    public static Runnable m149928a() {
        return new ciak();
    }

    /* renamed from: a */
    public static Runnable m149929a(cibn cibn) {
        return new cial(cibn);
    }

    /* renamed from: a */
    public static void m149930a(cibn cibn, Executor executor, Throwable th) {
        m149931a(executor, m149929a(cibn));
    }

    /* renamed from: a */
    public static void m149931a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f189668g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }
}
