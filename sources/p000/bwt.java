package p000;

/* renamed from: bwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwt extends can {
    public bwt(cat cat) {
        super(cat);
        bwt.class.getSimpleName();
        int i = cbd.f6383a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bua bua = (bua) bxm;
        new Object[1][0] = bxg.INTERAC_FLASH;
        int i = cbd.f6383a;
        byte[] f = bok.mo3331f();
        if (bok.mo3328d() != 4) {
            throw new bon("incorrect P1 - record not found", bop.f5270j);
        } else if (bok.mo3329e() != 0 && bok.mo3329e() != 2) {
            throw new bon("incorrect P1/P2", bop.f5270j);
        } else if (!bok.mo3332g()) {
            throw new bon("Le absent", bop.f5273m);
        } else if (bok.mo3336j() != 256) {
            throw new bon("Le required and is non-zero", bop.f5273m);
        } else if (bok.mo3335i() != bok.mo3331f().length) {
            throw new bon("Wrong length in data", bop.f5273m);
        } else if (bua.f5989k && (bok.mo3335i() < 5 || bok.mo3335i() > 16)) {
            throw new bon("Wrong length in application length", bop.f5273m);
        } else {
            bys a = mo3491a(bua.f5984f);
            if (!mo3633a(bua, f)) {
                if (can.m3841a(f)) {
                    bua.mo3601i();
                    return new boo(mo3635c(bua, a), bop.f5269i);
                } else if (can.m3841a(f) && bua.f5989k) {
                    return new boo(bop.f5263c);
                } else {
                    return new boo(bop.f5265e);
                }
            } else if (!bua.f5989k) {
                return new boo(bop.f5263c);
            } else {
                bua.mo3602j();
                bua.f5991m = false;
                ((btz) bua.f5984f).mo3578d().mo3570a(f);
                return mo3632a(bua, a);
            }
        }
    }

    /* renamed from: a */
    public final bys mo3491a(bxd bxd) {
        int i = cbd.f6383a;
        bvr bvr = (bvr) bxd.mo3578d().mo3576c(bvr.f5810a);
        if (bvr != null) {
            return bvr;
        }
        throw new bon("Missing dgi 9103", bop.f5261a);
    }
}
