package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface bqgj extends ExecutorService {
    /* renamed from: a */
    bqgg mo25812a(Runnable runnable);

    /* renamed from: a */
    bqgg mo25813a(Runnable runnable, Object obj);

    /* renamed from: b */
    bqgg mo25819b(Callable callable);

    List invokeAll(Collection collection);

    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
