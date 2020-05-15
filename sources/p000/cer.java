package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: cer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cer implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new ceq(runnable), "glide-active-resources");
    }
}
