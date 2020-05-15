package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: bdpt */
final /* synthetic */ class bdpt implements Runnable {

    /* renamed from: a */
    private final bdqh f106231a;

    /* renamed from: b */
    private final bdps f106232b;

    public bdpt(bdps bdps, bdqh bdqh) {
        this.f106232b = bdps;
        this.f106231a = bdqh;
    }

    public final void run() {
        bdps bdps = this.f106232b;
        cinx[] a = bdqi.m91285a(bdid.f105688a, this.f106231a);
        if (a != null && a.length != 0) {
            bxvd da = cinu.f190982h.mo74144da();
            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cinu cinu = (cinu) da.f164949b;
            cinu.f190984a |= 1;
            cinu.f190985b = leastSignificantBits;
            List asList = Arrays.asList(a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cinu cinu2 = (cinu) da.f164949b;
            cinu2.mo86262c();
            bxsy.m123078a(asList, cinu2.f190987d);
            cinu cinu3 = (cinu) da.mo74062i();
            bxvd da2 = cios.f191113s.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cios cios = (cios) da2.f164949b;
            cinu3.getClass();
            cios.f191127m = cinu3;
            cios.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            cios cios2 = (cios) da2.mo74062i();
            long j = cinu3.f190985b;
            if (cinu3.f190987d.size() > 0) {
                String str = ((cinx) cinu3.f190987d.get(0)).f190996b;
            }
            bdps.f106226a.mo58102a(cios2);
        }
    }
}
