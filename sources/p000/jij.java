package p000;

import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jij {

    /* renamed from: a */
    private static final Logger f22554a = jsy.m17256a("BeaconSeedConverter");

    /* renamed from: a */
    public static List m16758a(List list) {
        jto jto;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jrh jrh = (jrh) list.get(i);
            try {
                byte[] c = sqd.m35971c(jrh.mo7822b());
                bxvd da = jto.f23186d.mo74144da();
                ByteString a = ByteString.m123261a(c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((jto) da.f164949b).f23188a = a;
                long g = jrh.mo7826g();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((jto) da.f164949b).f23189b = g;
                long d = jrh.mo7824d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((jto) da.f164949b).f23190c = d;
                jto = (jto) da.mo74062i();
            } catch (IllegalArgumentException e) {
                f22554a.mo25418e("Couldn't decode v1 beacon seed", new Object[0]);
                jto = null;
            }
            if (jto == null) {
                return null;
            }
            arrayList.add(jto);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List m16760b(List list) {
        if (list != null) {
            return bnkn.m109663a((Iterable) bnkn.m109668a(list, jii.f22553a));
        }
        return null;
    }

    /* renamed from: a */
    public static jrh m16759a(jto jto) {
        jrg jrg = new jrg();
        jrg.f23128c = jto.f23189b;
        jrg.f23129d.add(4);
        jrg.f23127b = jto.f23190c;
        jrg.f23129d.add(3);
        jrg.f23126a = sqd.m35972d(jto.f23188a.getKey());
        jrg.f23129d.add(2);
        return new BeaconSeedEntity(jrg.f23129d, jrg.f23126a, jrg.f23127b, jrg.f23128c);
    }
}
