package p000;

/* renamed from: chym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chym extends chzf {

    /* renamed from: a */
    public final chsp f189518a;

    /* renamed from: b */
    public final chrk f189519b = chrk.m149453a();

    /* renamed from: c */
    final /* synthetic */ chyn f189520c;

    public chym(chyn chyn, chsp chsp) {
        this.f189520c = chyn;
        this.f189518a = chsp;
    }

    /* renamed from: b */
    public final void mo85764b(chuv chuv) {
        super.mo85764b(chuv);
        synchronized (this.f189520c.f189521a) {
            chyn chyn = this.f189520c;
            if (chyn.f189525e != null) {
                boolean remove = chyn.f189527g.remove(this);
                if (!this.f189520c.mo85822a()) {
                    if (remove) {
                        chyn chyn2 = this.f189520c;
                        chyn2.f189522b.mo85704a(chyn2.f189524d);
                        chyn chyn3 = this.f189520c;
                        if (chyn3.f189528h != null) {
                            chyn3.f189522b.mo85704a(chyn3.f189525e);
                            this.f189520c.f189525e = null;
                        }
                    }
                }
            }
        }
        this.f189520c.f189522b.mo85703a();
    }
}
