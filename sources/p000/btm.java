package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: btm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btm implements cas {
    static {
        btm.class.getSimpleName();
    }

    /* renamed from: a */
    public final byte[] mo3489a(bxd bxd, bpx bpx, bqi bqi) {
        if (!((bqu) bxd.mo3578d()).mo3436i().mo3465a()) {
            String b = bpx.mo3398b();
            if (b == null) {
                throw new bon("missing input data element: transaction date", bop.f5276p);
            } else if (!b.matches("\\d{6}")) {
                throw new bon(b.length() == 0 ? new String("Invalid transaction date: ") : "Invalid transaction date: ".concat(b), bop.f5271k);
            } else {
                String l = Long.toString(Math.abs(bpx.mo3397a()) % 4294967296L, 16);
                while (l.length() < 8) {
                    l = "0".concat(l);
                }
                caj caj = new caj(cbm.m3896a(l));
                bqt bqt = (bqt) ((bpz) bxd.f5949c).mo3405a(bxd).f5940a;
                bxp bxp = new bxp(bqt.f5370a);
                int i = cbd.f6383a;
                bqu bqu = (bqu) bxd.mo3578d();
                bsi bsi = (bsi) bqu.mo3576c(byy.f6232a);
                bsy bsy = (bsy) bqu.mo3576c(bsy.f5555a);
                brh brh = new brh();
                if (bqi.mo3418a()) {
                    brh.mo3446a(true);
                    brh.mo3445a(brg.CONFIRMATION_CODE_ENTERED);
                } else {
                    brh.mo3446a(false);
                    brh.mo3445a(brg.NOT_AVAILABLE);
                }
                brk a = bsi.mo3469a();
                a.mo3459g();
                a.mo3450a(new bre(cbm.m3896a("A1")));
                a.mo3453a(new bye(bsy.mo3474a(0, 1)));
                a.mo3452a(new brj(cbm.m3896a("A000000000")));
                a.mo3451a(brh);
                bri bri = bri.VERSION_05;
                cai cai = new cai(new byte[1]);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(bwz.m3708a(caj, bxp));
                    byteArrayOutputStream.write(a.mo3449a());
                    byteArrayOutputStream.write(a.mo3454b().mo3563i());
                    byteArrayOutputStream.write(a.mo3458f());
                    byteArrayOutputStream.write(bwz.m3708a(cai));
                    bri.mo3447a(byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    cat cat = bxd.f5949c;
                    byte[] a2 = cbe.m3886a(byteArray, bqt.f5371b);
                    new Object[1][0] = cbm.m3893a(a2);
                    bxt bxt = new bxt(a2);
                    bxw a3 = ((bsz) ((bqu) ((bqv) bxd).mo3578d()).mo3576c(bsz.f5558a)).mo3475a();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byteArrayOutputStream2.write(a.mo3449a() & 15);
                        byteArrayOutputStream2.write(a.mo3454b().mo3563i());
                        byteArrayOutputStream2.write(a.mo3458f());
                        byteArrayOutputStream2.write(bxt.mo3563i());
                        byteArrayOutputStream2.write(caj.mo3563i());
                        byteArrayOutputStream2.write(bxp.mo3563i());
                        byteArrayOutputStream2.write(a3.mo3563i()[5]);
                        byteArrayOutputStream2.write(new byte[]{-100});
                        byteArrayOutputStream2.write(new byte[]{0});
                        return byteArrayOutputStream2.toByteArray();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } else {
            throw new bon("application blocked", bop.f5275o);
        }
    }
}
