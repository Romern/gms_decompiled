package p000;

import android.content.ComponentName;
import java.util.Objects;

/* renamed from: pbc */
final /* synthetic */ class pbc implements Runnable {

    /* renamed from: a */
    private final pbd f38751a;

    /* renamed from: b */
    private final ComponentName f38752b;

    public pbc(pbd pbd, ComponentName componentName) {
        this.f38751a = pbd;
        this.f38752b = componentName;
    }

    public final void run() {
        pbd pbd = this.f38751a;
        ComponentName componentName = this.f38752b;
        pbm pbm = pbd.f38753a;
        bnsn bnsn = pbm.f38775a;
        pbm.mo22871f();
        if (Objects.equals(componentName, pbm.f38787m.f38772e)) {
            bnsi d = pbm.f38775a.mo68390d();
            d.mo68432a("pbm", "a", 479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("onStartupServiceDisconnected - Unable to check interest for %s", componentName);
            pbl pbl = pbm.f38787m;
            pbl.f38772e = null;
            if (pbl.f38768a) {
                pbm.f38777c.unbindService(pbm.f38786l);
                pbm.f38787m.f38768a = false;
            }
            pbm.f38783i.mo22569a(componentName, false);
        }
    }
}
