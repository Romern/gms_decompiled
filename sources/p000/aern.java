package p000;

import java.util.concurrent.Executor;

/* renamed from: aern */
final /* synthetic */ class aern implements Runnable {

    /* renamed from: a */
    private final aero f63677a;

    /* renamed from: b */
    private final aerd f63678b;

    /* renamed from: c */
    private final Executor f63679c;

    /* renamed from: d */
    private final String f63680d;

    /* renamed from: e */
    private final boolean f63681e;

    public aern(aero aero, aerd aerd, Executor executor, String str, boolean z) {
        this.f63677a = aero;
        this.f63678b = aerd;
        this.f63679c = executor;
        this.f63680d = str;
        this.f63681e = z;
    }

    public final void run() {
        aero aero = this.f63677a;
        aerd aerd = this.f63678b;
        Executor executor = this.f63679c;
        String str = this.f63680d;
        boolean z = this.f63681e;
        synchronized (aero.f63684c) {
            if (aero.f63684c.get(aerd) == executor) {
                aerd.mo34473a(str, z);
            }
        }
    }
}
