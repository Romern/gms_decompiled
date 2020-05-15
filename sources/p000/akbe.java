package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;

/* renamed from: akbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akbe {

    /* renamed from: a */
    private static akbe f71549a;

    /* renamed from: b */
    private final Map f71550b = new C1223np();

    private akbe() {
    }

    /* renamed from: a */
    public static synchronized akbe m59276a() {
        akbe akbe;
        synchronized (akbe.class) {
            if (f71549a == null) {
                f71549a = new akbe();
            }
            akbe = f71549a;
        }
        return akbe;
    }

    /* renamed from: b */
    public final synchronized void mo39147b() {
        for (ShareTarget shareTarget : this.f71550b.keySet()) {
            ((rod) this.f71550b.get(shareTarget)).mo24968a(new akbd(shareTarget));
        }
        this.f71550b.clear();
    }

    /* renamed from: a */
    public final synchronized void mo39144a(ShareTarget shareTarget) {
        this.f71550b.remove(shareTarget);
    }

    /* renamed from: a */
    public final synchronized void mo39145a(ShareTarget shareTarget, rod rod) {
        this.f71550b.put(shareTarget, rod);
    }

    /* renamed from: a */
    public final synchronized void mo39146a(rod rod) {
        this.f71550b.values().remove(rod);
    }
}
