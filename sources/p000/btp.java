package p000;

/* renamed from: btp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btp extends can {

    /* renamed from: a */
    public static final /* synthetic */ int f5577a = 0;

    static {
        btp.class.getSimpleName();
    }

    public btp(cat cat) {
        super(cat);
    }

    /* renamed from: a */
    public static final void m3601a(int i) {
        if (i != 0 && i != 256) {
            throw new bon("Correct Length 00", bop.f5264d);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bqx bqx = (bqx) bxm;
        new Object[1][0] = bxg.EFTPOS;
        int i = cbd.f6383a;
        bqx.mo3443b();
        if (bok.mo3326b() != 0) {
            new Object[1][0] = cbm.m3892a(bok.mo3326b());
            throw new bon("Cla Not Supported", bop.f5262b);
        } else if (bok.mo3328d() == 4) {
            byte e = bok.mo3329e();
            if (e == 0 || e == 2) {
                int i2 = bok.mo3335i();
                if (i2 < 5 || i2 > 16) {
                    throw new bon("Wrong Length", bop.f5273m);
                }
                m3601a(bok.mo3336j());
                byte[] f = bok.mo3331f();
                bys a = mo3491a(bqx.f5984f);
                if (!mo3633a(bqx, f)) {
                    if (can.m3841a(f)) {
                        bqx.mo3601i();
                        return mo3634b(bqx, a);
                    }
                    String a2 = cbm.m3893a(bok.mo3331f());
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 37);
                    sb.append("Application with AID '");
                    sb.append(a2);
                    sb.append("'  not found. )");
                    sb.toString();
                    return new boo(bop.f5265e);
                } else if (!bqx.f5989k) {
                    return new boo(bop.f5263c);
                } else {
                    bqx.mo3602j();
                    bqx.f5991m = false;
                    bqx.f5375a = false;
                    bxb d = ((bqv) bqx.f5984f).mo3578d();
                    d.mo3570a(f);
                    if ((((bsi) d.mo3576c(byy.f6232a)).mo3582a(new byte[]{-57})[0] & 16) != 16) {
                        return mo3632a(bqx, a);
                    }
                    byte[] bArr = mo3632a(bqx, a).f5254a;
                    int length = bArr.length;
                    if (length >= 2) {
                        int i3 = length - 2;
                        byte[] bArr2 = new byte[i3];
                        System.arraycopy(bArr, 0, bArr2, 0, i3);
                        return new boo(bArr2, bop.f5275o);
                    }
                    throw new IllegalArgumentException("response bytes do not contain enough data");
                }
            } else {
                throw new bon("Incorrect P1P2", bop.f5267g);
            }
        } else {
            throw new bon("Incorrect P1P2", bop.f5267g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byg mo3490a(bxm bxm) {
        bsz bsz = (bsz) bxm.f5984f.mo3578d().mo3576c(bsz.f5558a);
        if (bsz != null) {
            bxw a = bsz.mo3475a();
            if (a.mo3563i() != null) {
                return new byg(a.mo3563i());
            }
            throw new bon("Missing aid", bop.f5261a);
        }
        throw new bon("Missing DGI FCI Discretionary Data Template (Main Application)", bop.f5261a);
    }

    /* renamed from: a */
    public final bys mo3491a(bxd bxd) {
        bys b = bxd.mo3578d().mo3424b();
        if (b != null) {
            return b;
        }
        throw new bon("Missing PPSE dgi", bop.f5261a);
    }
}
