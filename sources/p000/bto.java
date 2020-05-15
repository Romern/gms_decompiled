package p000;

/* renamed from: bto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bto extends cau {
    public bto(cat cat) {
        super(cat);
        bto.class.getSimpleName();
    }

    /* renamed from: a */
    public static byte m3598a(byte b, byte b2) {
        return (byte) ((b & 112) | ((byte) (b2 & 143)));
    }

    /* renamed from: a */
    public static final void m3599a(byte b) {
        if (b != 0) {
            int i = cbd.f6383a;
            throw new bon("Correct Length 00", bop.f5264d);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        brh brh;
        bqx bqx = (bqx) bxm;
        int i = 0;
        new Object[1][0] = bxg.EFTPOS;
        int i2 = cbd.f6383a;
        bqx.mo3443b();
        if (!bqx.f5990l) {
            throw new bon("Conditions Not Satisfied", bop.f5263c);
        } else if (bok.mo3328d() == 0 || (bok.mo3329e() & 7) != 4) {
            throw new bon("SFI not listed in AFL or record not found", bop.f5267g);
        } else if (bok.mo3335i() <= 0) {
            m3599a((byte) bok.mo3336j());
            if (bok.mo3337k() >= 11 && bok.mo3337k() <= 20) {
                throw new bon("Incorrect P1P2", bop.f5267g);
            } else if (bok.mo3337k() >= 21 && bok.mo3337k() <= 30 && bok.mo3337k() != 21 && bok.mo3337k() != 24) {
                throw new bon("Incorrect P1P2", bop.f5267g);
            } else if (bok.mo3337k() <= 0 || bok.mo3337k() > 30) {
                throw new bon("Incorrect P1P2", bop.f5267g);
            } else {
                bxb d = ((bqv) bqx.f5984f).mo3578d();
                byte k = bok.mo3337k();
                byte d2 = bok.mo3328d();
                if (d.mo3571a(k, d2)) {
                    new Object[1][0] = bxg.EFTPOS;
                    bxb d3 = bqx.f5984f.mo3578d();
                    byte k2 = bok.mo3337k();
                    byte d4 = bok.mo3328d();
                    try {
                        bys b = d3.mo3573b(k2, d4);
                        if (b.f6227c.f6241a != 1) {
                            return new bol(new byte[0], bop.f5265e);
                        }
                        bpo bpo = new bpo(bqw.f5374a);
                        if (b.mo3615a(bpo) && (b instanceof bzh)) {
                            bzh bzh = (bzh) b;
                            bzh bzh2 = new bzh(bzh.f6228d, bzh.mo3617k());
                            byte[] b2 = bzh2.mo3618b(bpo);
                            if (!(b2 == null || b2.length == 0 || (brh = ((bro) bqx.f5988j).f5484c) == null)) {
                                b2[9] = m3598a(b2[9], brh.mo3563i()[0]);
                                bpc b3 = bzh2.f6231f.mo3369b(bpo);
                                if (b3 == null) {
                                    String valueOf = String.valueOf(bpo.toString());
                                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("tag not present ") : "tag not present ".concat(valueOf));
                                }
                                b3.mo3353a(b2);
                                b = bzh2;
                            }
                        }
                        return new bol(new byp(b.mo3617k()).mo3564j().mo3358e(), bop.f5269i);
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Dgi not found for record number ");
                        sb.append((int) d4);
                        sb.toString();
                        return new bol(new byte[0], bop.f5265e);
                    }
                } else {
                    while (i < 256) {
                        if (!d.mo3571a(k, (byte) i)) {
                            i++;
                        } else {
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Dgi not found for record number ");
                            sb2.append((int) d2);
                            sb2.toString();
                            throw new bon(bop.f5270j);
                        }
                    }
                    StringBuilder sb3 = new StringBuilder(27);
                    sb3.append("File not found for sfi ");
                    sb3.append((int) k);
                    sb3.toString();
                    throw new bon(bop.f5265e);
                }
            }
        } else {
            throw new bon("Wrong Length", bop.f5273m);
        }
    }
}
