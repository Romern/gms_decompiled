package p000;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: akui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akui {
    /* renamed from: a */
    public static final ExecutorService m60498a() {
        return new ThreadPoolExecutor(1, 1, 10000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1), new akuh());
    }
}
