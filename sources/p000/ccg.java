package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: ccg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ccg implements ThreadFactory {
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
