package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: piy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class piy {

    /* renamed from: a */
    private final Context f39258a;

    /* renamed from: b */
    private final ScheduledExecutorService f39259b;

    /* renamed from: c */
    private final phy f39260c;

    /* renamed from: d */
    private final poj f39261d;

    /* renamed from: e */
    private final sqv f39262e;

    /* renamed from: f */
    private final pzd f39263f;

    /* renamed from: g */
    private final pzi f39264g;

    /* renamed from: h */
    private final pmx f39265h;

    /* renamed from: i */
    private final pqb f39266i;

    public piy(Context context, ScheduledExecutorService scheduledExecutorService, phy phy, poj poj, sqv sqv, pzd pzd, pzi pzi, pmx pmx, pqb pqb) {
        this.f39258a = context;
        this.f39259b = scheduledExecutorService;
        this.f39260c = phy;
        this.f39261d = poj;
        this.f39262e = sqv;
        this.f39263f = pzd;
        this.f39264g = pzi;
        this.f39265h = pmx;
        this.f39266i = pqb;
    }

    /* renamed from: a */
    public final pjc mo23232a(CastDevice castDevice, String str, pim pim) {
        pjc pjc = new pjc(this.f39258a, this.f39259b, castDevice, str, pim, this.f39260c, this.f39261d, this.f39263f, this.f39264g, this.f39265h, this.f39266i);
        pjc.mo23248b(false);
        return pjc;
    }
}
