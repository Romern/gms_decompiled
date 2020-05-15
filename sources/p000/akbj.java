package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;

/* renamed from: akbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akbj {

    /* renamed from: a */
    private static akbj f71554a;

    /* renamed from: b */
    private final Map f71555b = new C1223np();

    private akbj() {
    }

    /* renamed from: a */
    public static synchronized akbj m59294a() {
        akbj akbj;
        synchronized (akbj.class) {
            if (f71554a == null) {
                f71554a = new akbj();
            }
            akbj = f71554a;
        }
        return akbj;
    }

    /* renamed from: b */
    public final synchronized void mo39152b() {
        for (ShareTarget shareTarget : this.f71555b.keySet()) {
            ((rod) this.f71555b.get(shareTarget)).mo24968a(new akbi(shareTarget));
        }
        this.f71555b.clear();
    }

    /* renamed from: a */
    public final synchronized void mo39149a(ShareTarget shareTarget) {
        this.f71555b.remove(shareTarget);
    }

    /* renamed from: a */
    public final synchronized void mo39150a(ShareTarget shareTarget, rod rod) {
        this.f71555b.put(shareTarget, rod);
    }

    /* renamed from: a */
    public final synchronized void mo39151a(rod rod) {
        this.f71555b.values().remove(rod);
    }
}
