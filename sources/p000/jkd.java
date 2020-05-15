package p000;

import java.lang.ref.WeakReference;
import java.util.TimerTask;

/* renamed from: jkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jkd extends TimerTask {

    /* renamed from: a */
    private final WeakReference f22677a;

    /* renamed from: b */
    private final int f22678b;

    public jkd(jke jke, int i) {
        this.f22677a = new WeakReference(jke);
        this.f22678b = i;
    }

    public final void run() {
        jke jke = (jke) this.f22677a.get();
        if (jke == null) {
            jke.f22679a.mo25418e("Channel was destroyed before task began; cannot proceed.", new Object[0]);
            return;
        }
        synchronized (jke.f22683e) {
            if (this.f22678b == jke.f22692n) {
                jta a = jsz.m17257a();
                switch (this.f22678b) {
                    case 1:
                        if (!jke.f22694p) {
                            a.mo14051g(2);
                            jke.f22694p = true;
                            break;
                        }
                        break;
                    case 2:
                        a.mo14050f(3);
                        break;
                    case 3:
                        a.mo14049e(3);
                        break;
                    case 4:
                        a.mo14050f(4);
                        break;
                    case 5:
                        a.mo14049e(4);
                        break;
                    case 6:
                        a.mo14050f(5);
                        break;
                    case 7:
                        a.mo14049e(5);
                        break;
                }
                if (jke.f22691m != 0) {
                    jke.f22679a.mo25418e("Timeout occurred waiting; channel will now disconnect. Status: %s.", jke.m16821a(this.f22678b));
                    jke.mo13827g();
                }
            }
        }
    }
}
