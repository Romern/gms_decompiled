package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: cavj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavj implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f176136a;

    public cavj(String str) {
        this.f176136a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f176136a);
        thread.setDaemon(true);
        return thread;
    }
}
