package p000;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: eqk */
final /* synthetic */ class eqk implements rkl {

    /* renamed from: a */
    private final ffk f15526a;

    /* renamed from: b */
    private final epd f15527b;

    public eqk(ffk ffk, epd epd) {
        this.f15526a = ffk;
        this.f15527b = epd;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        ffk ffk = this.f15526a;
        epd epd = this.f15527b;
        alky alky = (alky) rkk;
        try {
            if (alky.mo7183bo().mo17710c() && alky.mo12459b() != null) {
                Iterator it = alky.mo12459b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        alzr alzr = (alzr) it.next();
                        if (alzr.mo41071l() && ffk.f16458a.equals(alzr.mo41063c())) {
                            bxvd da = ffl.f16459d.mo74144da();
                            String c = alzr.mo41063c();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            c.getClass();
                            ((ffl) da.f164949b).f16461a = c;
                            String d = alzr.mo41064d();
                            if (!stm.m36302d(d)) {
                                if (!ffk.f16458a.equals(d)) {
                                    String d2 = alzr.mo41064d();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    d2.getClass();
                                    ((ffl) da.f164949b).f16462b = d2;
                                }
                            }
                            if (!stm.m36302d(alzr.mo41069j())) {
                                int hashCode = Arrays.hashCode(new Object[]{alzr.mo41069j()});
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ((ffl) da.f164949b).f16463c = hashCode;
                            }
                            epd.mo2450b(bmxv.m108566b((ffl) da.mo74062i()));
                        }
                    }
                    break;
                }
            }
            break;
            bxvd da2 = ffl.f16459d.mo74144da();
            String str = ffk.f16458a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((ffl) da2.f164949b).f16461a = str;
            epd.mo2450b(bmxv.m108566b((ffl) da2.mo74062i()));
        } finally {
            alky.mo12460c();
        }
    }
}
