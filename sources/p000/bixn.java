package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bixn */
final /* synthetic */ class bixn implements ThreadFactory {

    /* renamed from: a */
    private final String f122210a;

    public bixn(String str) {
        this.f122210a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f122210a);
    }
}
