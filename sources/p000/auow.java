package p000;

import android.util.Log;

/* renamed from: auow */
public final /* synthetic */ class auow implements Runnable {

    /* renamed from: a */
    private final auox f92233a;

    /* renamed from: b */
    private final aumv f92234b;

    public auow(auox auox, aumv aumv) {
        this.f92233a = auox;
        this.f92234b = aumv;
    }

    public final void run() {
        auox auox = this.f92233a;
        aumv aumv = this.f92234b;
        try {
            synchronized (auox.f92236a) {
                String b = aumv.mo50681b();
                aumv aumv2 = (aumv) auox.f92239d.get(b);
                if (aumv2 != null) {
                    aumy[] aumyArr = aumv.f92106a;
                    int length = aumyArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= 11) {
                            break;
                        }
                        aumy aumy = aumyArr[i];
                        Object a = aumv.mo50671a(aumy);
                        if (a != null) {
                            if (aumy != aumv.f92118o && !a.equals(aumv2.mo50671a(aumy))) {
                                break;
                            }
                        } else if (aumv2.mo50671a(aumy) != null) {
                            break;
                        }
                        i++;
                    }
                }
                auox.f92239d.put(b, aumv);
                auox.f92237b.mo50676a(aumv);
            }
        } catch (aumn e) {
            Log.e("Coffee-TrustStatusMonitor", "ModelNotFoundException", e);
        }
    }
}
