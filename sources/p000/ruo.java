package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* renamed from: ruo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ruo {
    /* renamed from: a */
    public static bqgg m34494a(Runnable runnable) {
        return m34495a(Executors.callable(runnable));
    }

    /* renamed from: a */
    public static bqgg m34495a(Callable callable) {
        bqgh a = bqgh.m112796a(callable);
        new Thread(a).start();
        return a;
    }
}
