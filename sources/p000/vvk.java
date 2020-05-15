package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: vvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vvk implements Runnable {

    /* renamed from: a */
    vvq f50034a = null;

    /* renamed from: b */
    final /* synthetic */ vvl f50035b;

    public vvk(vvl vvl) {
        this.f50035b = vvl;
    }

    /* renamed from: a */
    private final void m41458a() {
        vvq vvq = this.f50034a;
        if (vvq != null) {
            vvq.mo28907b();
            this.f50034a = null;
        }
    }

    public final void run() {
        bmxv bmxv;
        long j = 0;
        while (true) {
            try {
                if (this.f50034a != null) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.f50035b.f50042g);
                    bmxv = (bmxv) this.f50035b.f50043h.poll((nanos + j) - System.nanoTime(), TimeUnit.NANOSECONDS);
                } else {
                    bmxv = (bmxv) this.f50035b.f50043h.take();
                }
                if (bmxv != null) {
                    if (!bmxv.mo66813a()) {
                        break;
                    }
                    vvj vvj = (vvj) bmxv.mo66814b();
                    vvq vvq = this.f50034a;
                    if (vvq == null || !vvq.mo28906a()) {
                        m41458a();
                        j = System.nanoTime();
                        vvl vvl = this.f50035b;
                        vvl.f50040e.mo18378b((int) vvl.f50041f);
                        vvl vvl2 = this.f50035b;
                        this.f50034a = vvl2.f50038c.mo28904a(vvl2.f50039d, vvl2.f50040e);
                    }
                    vvj.f50033b.offer(this.f50034a.mo28905a(vvj.f50032a));
                    if (!this.f50034a.mo28906a()) {
                        m41458a();
                    }
                } else {
                    m41458a();
                }
            } catch (InterruptedException e) {
            }
        }
        m41458a();
    }
}
