package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: blii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blii {

    /* renamed from: a */
    public static final ConcurrentHashMap f126613a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ReferenceQueue f126614b = new ReferenceQueue();

    /* renamed from: c */
    public final ExecutorService f126615c;

    /* renamed from: d */
    public final AtomicBoolean f126616d = new AtomicBoolean(false);

    public blii(ExecutorService executorService) {
        this.f126615c = executorService;
    }
}
