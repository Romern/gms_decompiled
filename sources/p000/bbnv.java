package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bbnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnv {
    /* renamed from: a */
    public static int m88245a(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((bbns) list.get(i2)).f102971b == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m88251b(List list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((bbnt) list.get(i2)).f102978b == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static bbns m88246a(int i) {
        bxvd da = bbns.f102968e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bbns bbns = (bbns) da.f164949b;
        int i2 = bbns.f102970a | 1;
        bbns.f102970a = i2;
        bbns.f102971b = i;
        int i3 = i2 | 4;
        bbns.f102970a = i3;
        bbns.f102973d = 0;
        bbns.f102970a = i3 | 2;
        bbns.f102972c = 1;
        return (bbns) da.mo74062i();
    }

    /* renamed from: b */
    public static Map m88252b(bbnu bbnu) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = bbnu.f102987e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bbnt bbnt = (bbnt) bxwc.get(i);
            if ((bbnt.f102977a & 2) != 0) {
                hashMap.put(Integer.valueOf(bbnt.f102978b), Long.valueOf(bbnt.f102979c));
            }
        }
        bnrd a = m88250a(bbnu).iterator();
        while (a.hasNext()) {
            Integer valueOf = Integer.valueOf(((Integer) a.next()).intValue());
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, null);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static bbns m88247a(bbns bbns) {
        bxvd bxvd = (bxvd) bbns.mo74142c(5);
        bxvd.mo73625a((bxvk) bbns);
        long j = bbns.f102972c + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bbns bbns2 = (bbns) bxvd.f164949b;
        bbns bbns3 = bbns.f102968e;
        bbns2.f102970a |= 2;
        bbns2.f102972c = j;
        return (bbns) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bbnt m88248a(int i, long j, long j2) {
        bxvd da = bbnt.f102975e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bbnt bbnt = (bbnt) da.f164949b;
        int i2 = bbnt.f102977a | 1;
        bbnt.f102977a = i2;
        bbnt.f102978b = i;
        int i3 = i2 | 2;
        bbnt.f102977a = i3;
        bbnt.f102979c = j;
        bbnt.f102977a = i3 | 4;
        bbnt.f102980d = j2;
        return (bbnt) da.mo74062i();
    }

    /* renamed from: a */
    public static bbnt m88249a(bbnt bbnt, long j) {
        bxvd bxvd = (bxvd) bbnt.mo74142c(5);
        bxvd.mo73625a((bxvk) bbnt);
        bbnt bbnt2 = (bbnt) bxvd.f164949b;
        if ((bbnt2.f102977a & 2) == 0 || bbnt2.f102979c > j) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bbnt bbnt3 = (bbnt) bxvd.f164949b;
            bbnt bbnt4 = bbnt.f102975e;
            bbnt3.f102977a |= 2;
            bbnt3.f102979c = j;
        }
        bbnt bbnt5 = (bbnt) bxvd.f164949b;
        if ((bbnt5.f102977a & 4) == 0 || bbnt5.f102980d > j) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bbnt bbnt6 = (bbnt) bxvd.f164949b;
            bbnt bbnt7 = bbnt.f102975e;
            bbnt6.f102977a |= 4;
            bbnt6.f102980d = j;
        }
        return (bbnt) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bnic m88250a(bbnu bbnu) {
        bnia j = bnic.m109500j();
        bxwc bxwc = bbnu.f102984b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bbns bbns = (bbns) bxwc.get(i);
            if (bbns.f102972c != bbns.f102973d) {
                j.mo67629b(Integer.valueOf(bbns.f102971b));
            }
        }
        return j.mo67751a();
    }
}
