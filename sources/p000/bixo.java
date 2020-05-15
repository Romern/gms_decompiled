package p000;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bixo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixo {

    /* renamed from: a */
    public static final bixo f122211a = new bixo(m102947a("SetupCompatServiceInvoker", 50));

    /* renamed from: b */
    public static final bixo f122212b = new bixo(m102947a("SetupBindbackServiceExecutor", 1));

    /* renamed from: c */
    public final Executor f122213c;

    private bixo(Executor executor) {
        this.f122213c = executor;
    }

    /* renamed from: a */
    public static ExecutorService m102947a(String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new bixn(str));
    }
}
