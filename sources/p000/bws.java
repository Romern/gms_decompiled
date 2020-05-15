package p000;

/* renamed from: bws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bws extends cau {
    public bws(cat cat) {
        super(cat);
        bws.class.getSimpleName();
        new bok((byte) 1, (byte) 12);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bua bua = (bua) bxm;
        int i = cbd.f6383a;
        bua.f5992n = true;
        if (!bua.f5990l) {
            throw new bon("Invalid state - SELECT must be performed", bop.f5263c);
        } else if (bok.mo3328d() == 0) {
            throw new bon("incorrect P1", bop.f5270j);
        } else if (((bok.mo3329e() & 7) ^ 4) != 0) {
            throw new bon("incorrect P2, bits 3-1 != 100", bop.f5267g);
        } else if (!bok.mo3332g()) {
            throw new bon("Le absent", bop.f5273m);
        } else if (bok.mo3336j() == 256) {
            bxb d = ((btz) bua.f5984f).mo3578d();
            byte k = bok.mo3337k();
            byte d2 = bok.mo3328d();
            try {
                bys b = d.mo3573b(k, d2);
                if (b.f6227c.f6241a == 1) {
                    return new bol(b.mo3617k(), bop.f5269i);
                }
                return new bol(new byte[0], bop.f5265e);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Dgi not found for record number ");
                sb.append((int) d2);
                sb.toString();
                return new bol(new byte[0], bop.f5270j);
            }
        } else {
            throw new bon("Le required and is non-zero", bop.f5273m);
        }
    }
}
