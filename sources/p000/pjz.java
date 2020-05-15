package p000;

import com.google.android.gms.cast.CastDevice;
import java.util.Collection;

/* renamed from: pjz */
final /* synthetic */ class pjz implements pmw {

    /* renamed from: a */
    private final pkd f39416a;

    public pjz(pkd pkd) {
        this.f39416a = pkd;
    }

    /* renamed from: a */
    public final void mo23283a(Collection collection, Collection collection2) {
        pkd pkd = this.f39416a;
        CastDevice a = pkd.f39424d.mo23451a(pkd.f39431k);
        if (a != null) {
            pkd.f39423c.mo23857a("The endpoint of %s is online. Connecting to %s", pkd.f39230a, a);
            pkd.f39431k = null;
            pkd.f39424d.mo23463b(pkd.f39430j);
            pkd.f39432l = false;
            pkd.mo23292a(a, a.f29723k);
        }
    }
}
