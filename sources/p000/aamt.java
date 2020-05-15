package p000;

/* renamed from: aamt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamt {

    /* renamed from: a */
    private final bnfd f28495a = bnfd.m109230a((int) cecz.m136064l());

    /* renamed from: b */
    private int f28496b = 0;

    /* renamed from: a */
    public final synchronized void mo17061a() {
        this.f28496b = 0;
        this.f28495a.clear();
    }

    /* renamed from: a */
    public final synchronized void mo17062a(blnc blnc) {
        if (this.f28496b > 0) {
            bxvd da = blml.f126850k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blml blml = (blml) da.f164949b;
            blml.f126853b = 1;
            int i = 1 | blml.f126852a;
            blml.f126852a = i;
            int i2 = this.f28496b;
            blml.f126852a = i | 2;
            blml.f126854c = i2;
            blnc.mo66685a(da);
        }
        bnfd bnfd = this.f28495a;
        if (blnc.f164950c) {
            blnc.mo74035c();
            blnc.f164950c = false;
        }
        blnf blnf = (blnf) blnc.f164949b;
        blnf blnf2 = blnf.f126936z;
        blnf.mo66686a();
        bxsy.m123078a(bnfd, blnf.f126955r);
    }

    /* renamed from: a */
    public final void mo17063a(bxvd bxvd) {
        if (cecz.m136064l() > 0) {
            synchronized (this) {
                bnfd bnfd = this.f28495a;
                if (bnfd.f131554a - bnfd.size() == 0) {
                    this.f28496b++;
                }
                this.f28495a.add((blml) bxvd.mo74062i());
            }
        }
    }
}
