package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: chze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chze implements chxu {

    /* renamed from: a */
    public final chxu f189565a;

    /* renamed from: b */
    public volatile boolean f189566b;

    /* renamed from: c */
    public List f189567c = new ArrayList();

    public chze(chxu chxu) {
        this.f189565a = chxu;
    }

    /* renamed from: a */
    private final void m149814a(Runnable runnable) {
        synchronized (this) {
            if (!this.f189566b) {
                this.f189567c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo85798b(chuv chuv, chtr chtr) {
        m149814a(new chzc(this, chuv, chtr));
    }

    /* renamed from: a */
    public final void mo85793a() {
        if (!this.f189566b) {
            m149814a(new chza(this));
        } else {
            this.f189565a.mo85793a();
        }
    }

    /* renamed from: a */
    public final void mo85794a(chtr chtr) {
        m149814a(new chzb(this, chtr));
    }

    /* renamed from: a */
    public final void mo85796a(chuv chuv, chxt chxt, chtr chtr) {
        m149814a(new chzd(this, chuv, chxt, chtr));
    }

    /* renamed from: a */
    public final void mo85797a(cidd cidd) {
        if (!this.f189566b) {
            m149814a(new chyz(this, cidd));
        } else {
            this.f189565a.mo85797a(cidd);
        }
    }
}
