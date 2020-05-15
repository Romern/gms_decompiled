package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: buqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqh {

    /* renamed from: a */
    public final buqg f154703a;

    public buqh(buqg buqg) {
        this.f154703a = buqg;
    }

    /* renamed from: a */
    public static buqh m120234a(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 10);
        handlerThread.start();
        return new buqh(new buqm(str, handlerThread.getLooper()));
    }

    /* renamed from: b */
    public final void mo72984b() {
        buqg buqg = this.f154703a;
        if (cfos.f185168a.mo6606a().mo82257i()) {
            Thread thread = Looper.myLooper().getThread();
            Thread thread2 = ((buqm) buqg).f154713c.getLooper().getThread();
            if (thread.getId() != thread2.getId()) {
                throw new IllegalStateException(String.format("This method must run in the EventLoop thread '%s (id: %s)'. Was called from thread '%s (id: %s)'.", thread2.getName(), Long.valueOf(thread2.getId()), thread.getName(), Long.valueOf(thread.getId())));
            }
        }
    }

    /* renamed from: c */
    public final Handler mo72986c() {
        return ((buqm) this.f154703a).f154713c;
    }

    /* renamed from: d */
    public final void mo72988d(buqn buqn) {
        buqm buqm = (buqm) this.f154703a;
        buqm.f154713c.post(new buqi(buqm, buqn));
    }

    /* renamed from: e */
    public final void mo72989e(buqn buqn) {
        buqg buqg = this.f154703a;
        if (buqn != null) {
            ((buqm) buqg).f154713c.removeMessages(0, buqn);
        }
    }

    /* renamed from: c */
    public final void mo72987c(buqn buqn) {
        ((buqm) this.f154703a).f154713c.mo72993a(buqn, 0, false);
    }

    /* renamed from: a */
    public final void mo72981a() {
        buqm buqm = (buqm) this.f154703a;
        Looper looper = buqm.f154713c.getLooper();
        looper.getThread().getName();
        looper.getThread().getId();
        looper.quit();
        buqm.f154715e = true;
    }

    /* renamed from: b */
    public final boolean mo72985b(buqn buqn) {
        return ((buqm) this.f154703a).f154713c.hasMessages(0, buqn);
    }

    /* renamed from: a */
    public final void mo72982a(buqn buqn) {
        ((buqm) this.f154703a).mo72995a(buqn, false);
    }

    /* renamed from: a */
    public final void mo72983a(buqn buqn, long j) {
        ((buqm) this.f154703a).f154713c.mo72993a(buqn, j, false);
    }
}
