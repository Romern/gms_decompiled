package p000;

/* renamed from: bkwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwj implements bkwk {

    /* renamed from: a */
    private final bkws f125348a;

    public bkwj(bkws bkws) {
        this.f125348a = bkws;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkws.a(bkwq, bkwq):void
     arg types: [bkwi, bkwi]
     candidates:
      bkws.a(blhf, blhf):bkwk
      bkws.a(java.util.List, blhg):blhg
      bkws.a(bkwp, bkwq):void
      bkws.a(bkwq, bkwq):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkws.a(bkwp, bkwq):void
     arg types: [bkwi, bkwq]
     candidates:
      bkws.a(blhf, blhf):bkwk
      bkws.a(java.util.List, blhg):blhg
      bkws.a(bkwq, bkwq):void
      bkws.a(bkwp, bkwq):void */
    /* renamed from: a */
    public final void mo66386a(bkwq bkwq, bkwq bkwq2) {
        blhg b = bkwq.mo66389b();
        blhg b2 = bkwq2.mo66389b();
        blhf blhf = b.f126522b;
        blhf blhf2 = blhf.COMPOUND;
        blhf blhf3 = b2.f126522b;
        blhf blhf4 = blhf.COMPOUND;
        if (blhf != blhf2) {
            bkwi bkwi = new bkwi(b2.mo66538h());
            bkws bkws = this.f125348a;
            while (bkwi.mo66389b() != null) {
                bkws.mo66396a(bkwq, bkwi);
                bkwi.mo66391d();
            }
            if (bkwi.f125343a) {
                bkwq2.mo66388a(bksz.m106565a(bkwi.mo66387a()));
            }
        } else if (blhf3 == blhf4) {
            bkwi bkwi2 = new bkwi(b.mo66538h());
            bkwi bkwi3 = new bkwi(b2.mo66538h());
            bkws bkws2 = this.f125348a;
            while (bkwi2.mo66389b() != null) {
                while (bkwi3.mo66389b() != null) {
                    bkws2.mo66396a((bkwq) bkwi2, (bkwq) bkwi3);
                    bkwi3.mo66391d();
                }
                bkwi3.mo66392e();
                bkwi2.mo66391d();
            }
            if (bkwi2.f125343a) {
                bkwq.mo66388a(bksz.m106565a(bkwi2.mo66387a()));
            }
            if (bkwi3.f125343a) {
                bkwq2.mo66388a(bksz.m106565a(bkwi3.mo66387a()));
            }
        } else {
            bkwi bkwi4 = new bkwi(b.mo66538h());
            this.f125348a.mo66395a((bkwp) bkwi4, bkwq2);
            if (bkwi4.f125343a) {
                bkwq.mo66388a(bksz.m106565a(bkwi4.mo66387a()));
            }
        }
    }
}
