package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: cirm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirm implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ int f191285a;

    public cirm(int i) {
        this.f191285a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new cirl(this, runnable));
    }
}
