package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bare */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bare {

    /* renamed from: a */
    private final Object f101596a;

    /* renamed from: b */
    private final Throwable f101597b;

    public bare(Object obj, Throwable th) {
        this.f101596a = obj;
        this.f101597b = th;
    }

    /* renamed from: a */
    public static bare m87435a(Exception exc) {
        bmxy.m108581a(exc);
        return new bare(null, exc);
    }

    /* renamed from: a */
    public final boolean mo55902a() {
        return this.f101597b == null;
    }

    /* renamed from: b */
    public final Object mo55903b() {
        Throwable th = this.f101597b;
        if (th == null) {
            return this.f101596a;
        }
        throw new ExecutionException(th);
    }

    /* renamed from: c */
    public final Throwable mo55904c() {
        bmxy.m108601b(this.f101597b != null, "Throwable was not initialized");
        return this.f101597b;
    }
}
