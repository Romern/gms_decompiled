package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: bboj */
final /* synthetic */ class bboj implements Runnable {

    /* renamed from: a */
    private final bbol f103012a;

    /* renamed from: b */
    private final Runnable f103013b;

    /* renamed from: c */
    private final int f103014c;

    /* renamed from: d */
    private final ScheduledFuture f103015d;

    public bboj(bbol bbol, Runnable runnable, int i, ScheduledFuture scheduledFuture) {
        this.f103012a = bbol;
        this.f103013b = runnable;
        this.f103014c = i;
        this.f103015d = scheduledFuture;
    }

    public final void run() {
        bbol bbol = this.f103012a;
        Runnable runnable = this.f103013b;
        int i = this.f103014c;
        ScheduledFuture scheduledFuture = this.f103015d;
        runnable.run();
        bbol.f103020a.remove(Integer.valueOf(i));
        scheduledFuture.cancel(false);
    }
}
