package p000;

import android.util.Log;

/* renamed from: auov */
public final /* synthetic */ class auov implements Runnable {

    /* renamed from: a */
    private final auox f92231a;

    /* renamed from: b */
    private final aumt f92232b;

    public auov(auox auox, aumt aumt) {
        this.f92231a = auox;
        this.f92232b = aumt;
    }

    public final void run() {
        auox auox = this.f92231a;
        aumt aumt = this.f92232b;
        try {
            synchronized (auox.f92236a) {
                aumt aumt2 = auox.f92238c;
                if (aumt2 != null) {
                    aumy[] aumyArr = aumt.f92095a;
                    int length = aumyArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= 9) {
                            break;
                        }
                        aumy aumy = aumyArr[i];
                        Object a = aumt.mo50671a(aumy);
                        if (a != null) {
                            if (aumy != aumt.f92105m && !a.equals(aumt2.mo50671a(aumy))) {
                                break;
                            }
                        } else if (aumt2.mo50671a(aumy) != null) {
                            break;
                        }
                        i++;
                    }
                }
                auox.f92238c = aumt;
                auox.f92237b.mo50676a(aumt);
            }
        } catch (aumn e) {
            Log.e("Coffee-TrustStatusMonitor", "ModelNotFoundException", e);
        }
    }
}
