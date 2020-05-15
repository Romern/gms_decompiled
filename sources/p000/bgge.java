package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: bgge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgge implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setDaemon(true);
        return newThread;
    }
}
