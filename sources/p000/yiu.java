package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: yiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yiu {

    /* renamed from: a */
    private static final yhy f53884a = new yhy();

    /* renamed from: a */
    public final bngx mo30549a(Map map, yie yie, Map map2, yik yik) {
        int i;
        boolean z;
        yln yln = yie.f53855a;
        yhe yhe = yie.f53856b;
        yib yib = new yib(yln, yhe);
        if (map.containsKey(yib)) {
            return (bngx) map.get(yib);
        }
        List list = yie.f53858d;
        bngs j = bngx.m109377j();
        yis yis = new yis(this, j, map, map2, yik);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((yig) list.get(i2)).mo30534a(yis);
        }
        bngx a = j.mo67664a();
        bnre i3 = a.listIterator();
        boolean z2 = false;
        while (i3.hasNext()) {
            if (((yhz) i3.next()).mo30522c().f172716e) {
                z2 = true;
            }
        }
        if (a.isEmpty()) {
            return bngx.m109376e();
        }
        bngs j2 = bngx.m109377j();
        long b = yhe.mo30494b();
        if (yhe.mo30497e()) {
            int size2 = a.size();
            for (int i4 = 0; i4 < size2; i4++) {
                bngx a2 = ((ygx) a.get(i4)).mo30473a();
                if (!a2.isEmpty()) {
                    b = Math.min(b, ((yhu) a2.get(0)).mo30385a());
                }
            }
        }
        for (ygx ygx : yie.f53855a.mo30571e(a, yfv.m44005a(b, yhe.mo30495c()), f53884a)) {
            yhz yhz = (yhz) ygx;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(yhz.mo30522c().f172714c);
            caae caae = yhz.mo30522c().f172713b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            cado b2 = yyl.m45033b(caae);
            if (b2.f164950c) {
                b2.mo74035c();
                b2.f164950c = false;
            }
            cadp cadp = (cadp) b2.f164949b;
            cadp cadp2 = cadp.f172710f;
            cadp.f172712a |= 4;
            cadp.f172716e = z2;
            if (yhe.mo30496d()) {
                i = Math.max(0, arrayList.size() - yhe.f53820b);
            } else {
                i = 0;
            }
            int size3 = arrayList.size();
            if (i <= size3) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            b2.mo74617a(arrayList.subList(i, size3));
            j2.mo67668c(new yhz((cadp) b2.mo74062i()));
        }
        bngx a3 = j2.mo67664a();
        map.put(yib, a3);
        return a3;
    }
}
