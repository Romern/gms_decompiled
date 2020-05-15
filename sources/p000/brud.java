package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: brud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brud {

    /* renamed from: a */
    public ayte f143399a;

    /* renamed from: b */
    public brux f143400b;

    /* renamed from: c */
    public bmzi f143401c;

    /* renamed from: d */
    public bmzi f143402d;

    /* renamed from: e */
    public bmzi f143403e;

    /* renamed from: f */
    private Context f143404f;

    /* renamed from: g */
    private bruv f143405g;

    /* renamed from: h */
    private Executor f143406h;

    /* renamed from: i */
    private Executor f143407i;

    /* renamed from: j */
    private Executor f143408j;

    /* renamed from: k */
    private bmzi f143409k;

    /* renamed from: a */
    public final brue mo69973a() {
        String str = this.f143404f == null ? " context" : "";
        if (this.f143399a == null) {
            str = str.concat(" clock");
        }
        if (this.f143405g == null) {
            str = String.valueOf(str).concat(" transport");
        }
        if (this.f143406h == null) {
            str = String.valueOf(str).concat(" transportExecutor");
        }
        if (this.f143407i == null) {
            str = String.valueOf(str).concat(" ioExecutor");
        }
        if (this.f143408j == null) {
            str = String.valueOf(str).concat(" networkExecutor");
        }
        if (this.f143401c == null) {
            str = String.valueOf(str).concat(" recordNetworkMetricsToPrimes");
        }
        if (this.f143402d == null) {
            str = String.valueOf(str).concat(" recordCachingMetricsToPrimes");
        }
        if (this.f143403e == null) {
            str = String.valueOf(str).concat(" recordBandwidthMetrics");
        }
        if (this.f143409k == null) {
            str = String.valueOf(str).concat(" grpcIdleTimeoutMillis");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        brub brub = new brub(this.f143404f, this.f143399a, this.f143405g, this.f143406h, this.f143407i, this.f143408j, this.f143400b, this.f143401c, this.f143402d, this.f143403e, this.f143409k);
        boolean z = true;
        if (brub.f143379b != null && brub.f143378a == null) {
            z = false;
        }
        bmxy.m108601b(z, "If authContextManager is set, networkExecutor must be set.");
        return brub;
    }

    /* renamed from: b */
    public final void mo69978b(Executor executor) {
        if (executor != null) {
            this.f143408j = executor;
            return;
        }
        throw new NullPointerException("Null networkExecutor");
    }

    /* renamed from: c */
    public final void mo69979c(Executor executor) {
        if (executor != null) {
            this.f143406h = executor;
            return;
        }
        throw new NullPointerException("Null transportExecutor");
    }

    /* renamed from: a */
    public final void mo69974a(Context context) {
        if (context != null) {
            this.f143404f = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final void mo69975a(bmzi bmzi) {
        if (bmzi != null) {
            this.f143409k = bmzi;
            return;
        }
        throw new NullPointerException("Null grpcIdleTimeoutMillis");
    }

    /* renamed from: a */
    public final void mo69976a(bruv bruv) {
        if (bruv != null) {
            this.f143405g = bruv;
            return;
        }
        throw new NullPointerException("Null transport");
    }

    /* renamed from: a */
    public final void mo69977a(Executor executor) {
        if (executor != null) {
            this.f143407i = executor;
            return;
        }
        throw new NullPointerException("Null ioExecutor");
    }
}
