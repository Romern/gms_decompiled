package p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbd {

    /* renamed from: a */
    public static final /* synthetic */ int f6383a = 0;

    /* renamed from: b */
    private static final ThreadPoolExecutor f6384b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    static {
        cbd.class.getSimpleName();
        new cbc();
    }

    /* renamed from: a */
    public static void m3884a(String str, long j) {
        Object[] objArr = {str, Long.valueOf(System.currentTimeMillis() - j)};
    }

    /* renamed from: b */
    public static void m3885b(String str, long j) {
        Object[] objArr = {str, Long.valueOf(System.nanoTime() - j)};
    }
}
