package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yin implements yif {

    /* renamed from: a */
    private String f53872a = "";

    /* renamed from: a */
    private final void m44192a(caae caae, yhe yhe) {
        ypq.m44540a(Level.FINE, "%1$s%2$s %3$tF %3$tT - %4$tF %4$tT", this.f53872a, caae.f172326b, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yhe.mo30494b())), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yhe.mo30495c())));
    }

    /* renamed from: a */
    public final void mo30538a(yid yid) {
        m44192a(yid.f53853a, yid.f53854b);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo30539a(yie yie) {
        yln yln = yie.f53855a;
        caae caae = yie.f53857c;
        if (caae == null) {
            ypq.m44540a(Level.FINE, "Transformation %s", yln);
        } else {
            m44192a(caae, yie.f53856b);
        }
        String str = this.f53872a;
        try {
            this.f53872a = String.valueOf(str).concat("  ");
            for (yig yig : yie.f53858d) {
                yig.mo30534a(this);
            }
            this.f53872a = str;
        } catch (Throwable th) {
            this.f53872a = str;
            throw th;
        }
    }
}
