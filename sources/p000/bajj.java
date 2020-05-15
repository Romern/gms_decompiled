package p000;

import com.google.android.gms.libs.vcdiff.VcDiffEncoderDecoder;

/* renamed from: bajj */
final /* synthetic */ class bajj implements bmxj {

    /* renamed from: a */
    private final bair f101058a;

    public bajj(bair bair) {
        this.f101058a = bair;
    }

    public final Object apply(Object obj) {
        badq badq;
        byhi byhi;
        bair bair = this.f101058a;
        bygu bygu = (bygu) obj;
        int a = bygt.m124796a(bygu.f166387d);
        if (a == 0 || a != 3 || bygu.f166385b != 4 || (badq = (badq) bair.f101012a.apply(((byhi) bygu.f166386c).f166455c)) == null) {
            return bygu;
        }
        try {
            bxvd da = bygu.f166382e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygu bygu2 = (bygu) da.f164949b;
            bygu2.f166387d = 2;
            bygu2.f166384a |= 1;
            if (bygu.f166385b == 4) {
                byhi = (byhi) bygu.f166386c;
            } else {
                byhi = byhi.f166451f;
            }
            bxtx a2 = bair.m86940a(badq.mo55650b());
            bmxy.m108589a(a2.equals(byhi.f166455c), "Can't compute diff between footprints with different secondary ids!");
            byte[] b = VcDiffEncoderDecoder.m66818b(badq.mo55649a(), byhi.f166456d.mo73780k());
            bxvd da2 = byhj.f166458h.mo74144da();
            long longValue = badq.mo55651c().longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byhj byhj = (byhj) da2.f164949b;
            byhj.f166460a |= 1;
            byhj.f166461b = longValue;
            byhh byhh = byhi.f166457e;
            if (byhh == null) {
                byhh = byhh.f166447c;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byhj byhj2 = (byhj) da2.f164949b;
            byhh.getClass();
            byhj2.f166466g = byhh;
            byhj2.f166460a |= 32;
            bxtx a3 = bxtx.m123261a(b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byhj byhj3 = (byhj) da2.f164949b;
            a3.getClass();
            byhj3.f166460a |= 8;
            byhj3.f166464e = a3;
            bxtx a4 = bafi.m86739a(byhi);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byhj byhj4 = (byhj) da2.f164949b;
            a4.getClass();
            byhj4.f166460a |= 16;
            byhj4.f166465f = a4;
            if (badq.mo55650b() != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                byhj byhj5 = (byhj) da2.f164949b;
                a2.getClass();
                byhj5.f166460a = 4 | byhj5.f166460a;
                byhj5.f166463d = a2;
            }
            byhj byhj6 = (byhj) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygu bygu3 = (bygu) da.f164949b;
            byhj6.getClass();
            bygu3.f166386c = byhj6;
            bygu3.f166385b = 6;
            return (bygu) da.mo74062i();
        } catch (aefa e) {
            throw new badv(e);
        } catch (badv e2) {
            achw achw = (achw) bair.f101013b.mo16713a();
            ((acdc) bair.f101014c.mo16713a()).mo32707a("Failed to encode footprint payload!", e2);
            return bygu;
        }
    }
}
