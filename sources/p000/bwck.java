package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bwck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bwck implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "MSMux:AHRF");
        thread.setPriority(4);
        return thread;
    }
}
