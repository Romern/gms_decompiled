package p000;

import com.google.android.gms.cast.CastDevice;
import java.util.Collection;

/* renamed from: pju */
final /* synthetic */ class pju implements pmw {

    /* renamed from: a */
    private final pjx f39397a;

    public pju(pjx pjx) {
        this.f39397a = pjx;
    }

    /* renamed from: a */
    public final void mo23283a(Collection collection, Collection collection2) {
        pjx pjx = this.f39397a;
        CastDevice a = pjx.f39401d.mo23451a(pjx.f39406i);
        if (a != null) {
            pjx.f39400c.mo23857a("The endpoint of %s is online. Connecting to %s", pjx.f39230a, a);
            pjx.f39406i = null;
            pjx.f39401d.mo23463b(pjx.f39405h);
            pjx.f39407j = false;
            pjx.mo23285a(a, a.f29723k);
        }
    }
}
