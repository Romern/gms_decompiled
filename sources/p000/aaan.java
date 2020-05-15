package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aaan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaan {
    /* renamed from: a */
    public static void m21025a(String str, int i, int i2, Set set) {
        if (i2 != 3 && i != 2) {
            if (i2 != 0) {
                rpr b = rpr.m34216b();
                if (!(i == 3 || i == 6)) {
                    rfz.m33557a(b).mo24605a(str);
                }
                sdo.m34974b(!set.isEmpty());
                if (i2 == 2) {
                    return;
                }
                if (i2 == 1) {
                    sdt sdt = sdt.f44074f;
                    if (sdt.f44076b) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (sdt.f44079e.contains(Integer.toString(((Integer) it.next()).intValue()))) {
                                return;
                            }
                        }
                    }
                    if (i == 3) {
                        sdt sdt2 = sdt.f44074f;
                        if (sdt2.f44077c && sdt2.f44078d.contains(str) && Math.random() < cdok.f181430a.mo6606a().mo78072e()) {
                            List a = sfc.m35144a(rpr.m34216b(), true, cdok.f181430a.mo6606a().mo78068a()).mo25461a(rpr.m34216b());
                            bxvd da = bptz.f139214d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bptz bptz = (bptz) da.f164949b;
                            str.getClass();
                            bptz.f139216a = 1 | bptz.f139216a;
                            bptz.f139217b = str;
                            sgj a2 = sgj.m35206a(((Integer) set.iterator().next()).intValue());
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bptz bptz2 = (bptz) da.f164949b;
                            bptz2.f139218c = a2.mo3214a();
                            bptz2.f139216a |= 2;
                            bptz bptz3 = (bptz) da.mo74062i();
                            bxvd da2 = bpvf.f139321t.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpvf bpvf = (bpvf) da2.f164949b;
                            bptz3.getClass();
                            if (!bpvf.f139340r.mo73666a()) {
                                bpvf.f139340r = GeneratedMessageLite.m124021a(bpvf.f139340r);
                            }
                            bpvf.f139340r.add(bptz3);
                            qwo a3 = ((qws) a.get(0)).mo24333a((bpvf) da2.mo74062i());
                            a3.f42322f = cagz.UNMETERED_ONLY;
                            a3.mo24327b();
                            return;
                        }
                        return;
                    }
                    throw new SecurityException(String.format("%s is not allowed to access service# %d which is GMS First party only", str, set.iterator().next()));
                }
                throw new AssertionError();
            }
            throw new SecurityException("GMS Internal API");
        }
    }
}
