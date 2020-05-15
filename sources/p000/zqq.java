package p000;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: zqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqq implements zqo {

    /* renamed from: a */
    public static final srn f55716a = zvt.m46581a();

    /* renamed from: b */
    public final zre f55717b;

    /* renamed from: c */
    private final Handler f55718c;

    /* renamed from: d */
    private final long f55719d;

    public zqq(zre zre, Handler handler, int i) {
        this.f55717b = zre;
        this.f55718c = handler;
        this.f55719d = TimeUnit.HOURS.toNanos((long) i);
    }

    /* renamed from: a */
    public final void mo31333a(zqn zqn) {
        Long l = zqn.f55711c;
        if (l != null && l.longValue() >= 0 && zqn.f55713e >= zqn.f55711c.longValue()) {
            if (zqn.f55713e - zqn.f55712d > this.f55719d) {
                bnic bnic = zre.f55742a;
                caah caah = zqn.f55710b.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                if (!bnic.contains(caah.f172336b)) {
                    return;
                }
            }
            this.f55718c.post(new zqp(this, zqn));
        }
    }
}
