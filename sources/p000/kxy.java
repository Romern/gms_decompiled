package p000;

import android.view.autofill.AutofillId;
import java.util.concurrent.TimeUnit;

/* renamed from: kxy */
final /* synthetic */ class kxy implements bqeh {

    /* renamed from: a */
    private final kya f25381a;

    /* renamed from: b */
    private final bmza f25382b;

    public kxy(kya kya, bmza bmza) {
        this.f25381a = kya;
        this.f25382b = bmza;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kya kya = this.f25381a;
        bmza bmza = this.f25382b;
        kjs kjs = (kjs) obj;
        bmza.mo66931e();
        long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
        bngx bngx = kjs.f24276a;
        bngs b = bngx.m109371b(bngx.size());
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            kjp kjp = (kjp) i.next();
            bngx bngx2 = kjp.f24265b;
            bngs b2 = bngx.m109371b(bngx2.size());
            bnre i2 = bngx2.listIterator();
            while (i2.hasNext()) {
                kjl kjl = (kjl) i2.next();
                kjk f = kjl.mo14534f();
                f.f24254c = kya.f25386c.mo7954a((AutofillId) kjl.mo14516a().f24609h);
                b2.mo67668c(f.mo14524a());
            }
            bngx a2 = b2.mo67664a();
            kjo a3 = kjp.mo14538a();
            bngs j = bngx.m109377j();
            j.mo67666b((Iterable) a2);
            a3.f24259a = j;
            kjp a4 = a3.mo14537a();
            bmxv bmxv = a4.f24267d;
            if (bmxv.mo66813a()) {
                kjj kjj = (kjj) bmxv.mo66814b();
                int a5 = kya.f25386c.mo7954a((AutofillId) kjj.mo14510a().f24609h);
                if (kjj.mo14512c() != a5) {
                    kjj = new kjh(kjj.mo14510a(), kjj.mo14511b(), a5);
                }
                kjo a6 = a4.mo14538a();
                a6.f24261c = kjj;
                a4 = a6.mo14537a();
            }
            b.mo67668c(a4);
        }
        bngx a7 = b.mo67664a();
        bnia c = bnic.m109499c(kjs.f24278c.size() + kjs.f24279d.size());
        c.mo67752b((Iterable) kjs.f24278c);
        c.mo67752b((Iterable) kjs.f24279d);
        int size = c.mo67751a().size();
        bngx bngx3 = kjs.f24280e;
        bxvd da = lap.f25588g.mo74144da();
        bxvd da2 = kzz.f25505d.mo74144da();
        int a8 = kya.f25386c.mo7953a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kzz) da2.f164949b).f25507a = a8;
        lbh c2 = kya.f25386c.mo7957c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c2.getClass();
        ((kzz) da2.f164949b).f25509c = c2;
        kzx b3 = kya.f25386c.mo7956b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        b3.getClass();
        ((kzz) da2.f164949b).f25508b = b3;
        kzz kzz = (kzz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lap lap = (lap) da.f164949b;
        kzz.getClass();
        lap.f25594e = kzz;
        lap.f25590a = a;
        lap.f25593d = 1;
        ((lap) da.f164949b).f25592c = size;
        bnre i3 = bngx3.listIterator();
        while (i3.hasNext()) {
            kjt kjt = (kjt) i3.next();
            if (kjt instanceof knl) {
                knl knl = (knl) kjt;
                bxvd da3 = lao.f25582e.mo74144da();
                lbc a9 = knl.mo14701a();
                lbc lbc = lbc.UNKNOWN_DETECTION_METHOD;
                int ordinal = a9.ordinal();
                int i4 = 4;
                if (ordinal == 4) {
                    i4 = 3;
                } else if (ordinal != 5) {
                    ((bnsl) kya.f25384a.mo68387b()).mo68405a("Unsupported detection method for prediction processor.");
                    i4 = 2;
                }
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((lao) da3.f164949b).f25584a = i4 - 2;
                boolean b4 = knl.mo14702b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((lao) da3.f164949b).f25585b = b4;
                boolean c3 = knl.mo14703c();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((lao) da3.f164949b).f25586c = c3;
                boolean d = knl.mo14704d();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((lao) da3.f164949b).f25587d = d;
                lao lao = (lao) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lap lap2 = (lap) da.f164949b;
                lao.getClass();
                if (!lap2.f25595f.mo73666a()) {
                    lap2.f25595f = bxvk.m124021a(lap2.f25595f);
                }
                lap2.f25595f.add(lao);
            }
        }
        int size2 = a7.size();
        for (int i5 = 0; i5 < size2; i5++) {
            lbf a10 = kwv.m18704a((kjp) a7.get(i5));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lap lap3 = (lap) da.f164949b;
            a10.getClass();
            if (!lap3.f25591b.mo73666a()) {
                lap3.f25591b = bxvk.m124021a(lap3.f25591b);
            }
            lap3.f25591b.add(a10);
        }
        kwu kwu = kya.f25385b;
        da.getClass();
        kwu.mo14900a(new kxz(da));
        return bqga.m112775a(new kjs(a7, kjs.f24278c, kjs.f24279d, kjs.f24280e));
    }
}
