package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: dlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dlc implements ThreadFactory {

    /* renamed from: a */
    private final String f13438a;

    public dlc(String str) {
        this.f13438a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f13438a);
        return thread;
    }
}
