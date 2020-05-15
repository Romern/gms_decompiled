package p000;

import android.os.Handler;
import java.util.Set;

/* renamed from: noo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class noo implements ojl {

    /* renamed from: a */
    final /* synthetic */ Set f36244a;

    /* renamed from: b */
    final /* synthetic */ noy f36245b;

    public noo(noy noy, Set set) {
        this.f36245b = noy;
        this.f36244a = set;
    }

    /* renamed from: a */
    public final void mo21210a() {
        bnsi d = noy.f36261a.mo68390d();
        d.mo68432a("noo", "a", 222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Car services started");
        noy noy = this.f36245b;
        Handler handler = noy.f36265e;
        nox nox = noy.f36268h;
        nox.getClass();
        handler.post(new non(nox));
    }

    /* renamed from: a */
    public final boolean mo21211a(ofs ofs, int i) {
        return this.f36244a.contains(Integer.valueOf(i));
    }
}
