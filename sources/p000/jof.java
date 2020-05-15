package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: jof */
final /* synthetic */ class jof implements Runnable {

    /* renamed from: a */
    private final joh f22930a;

    /* renamed from: b */
    private final String f22931b;

    /* renamed from: c */
    private final int f22932c;

    public jof(joh joh, String str, int i) {
        this.f22930a = joh;
        this.f22931b = str;
        this.f22932c = i;
    }

    public final void run() {
        joh joh = this.f22930a;
        String str = this.f22931b;
        int i = this.f22932c;
        jrd b = joh.mo13939b(str, i);
        if (b != null) {
            ScheduledFuture scheduledFuture = b.f23115c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            b.f23113a.clear();
            joh.f22936a.remove(new jog(str, "tqcf", i));
        }
    }
}
