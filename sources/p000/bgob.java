package p000;

import java.lang.ref.WeakReference;

/* renamed from: bgob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgob implements Runnable {

    /* renamed from: a */
    private final WeakReference f116896a;

    /* renamed from: b */
    private final WeakReference f116897b;

    public bgob(bgns bgns, bgod bgod) {
        this.f116896a = new WeakReference(bgns);
        this.f116897b = new WeakReference(bgod);
    }

    /* renamed from: a */
    public static final void m99484a(bgod bgod) {
        if (bgod != null) {
            synchronized (bgod.f116900b) {
                bgnt bgnt = bgod.f116905g;
                if (bgnt != null) {
                    bgnt.mo61097E();
                    bgod.f116905g = null;
                }
            }
        }
    }

    public final void run() {
        m99484a((bgod) this.f116897b.get());
    }

    /* renamed from: a */
    public final void mo63030a() {
        bfor bfor;
        bfos bfos;
        bgns bgns = (bgns) this.f116896a.get();
        bgod bgod = (bgod) this.f116897b.get();
        if (!(bgod == null || (bfor = bgod.f116903e) == null || (bfos = bgod.f116904f) == null)) {
            bfor.mo62048a(bfos);
        }
        if (bgns != null) {
            bgns.mo62921a((Runnable) this);
        } else {
            m99484a(bgod);
        }
        if (bgod != null) {
            new Object[1][0] = bgod.f116899a;
        }
    }
}
