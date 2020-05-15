package p000;

import java.util.Comparator;
import java.util.List;

/* renamed from: dhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dhz {

    /* renamed from: a */
    public static final Comparator f13197a = dhx.f13195a;

    /* renamed from: b */
    public static final Comparator f13198b = dhy.f13196a;

    /* renamed from: c */
    public static final dky f13199c = dky.m8763a(f13197a);

    static {
        dky.m8763a(f13198b);
    }

    /* renamed from: a */
    public static int m8546a(bojy bojy, bojy bojy2, boolean z) {
        bneu a = bneu.f131545b.mo67473a(bojy.f133370b, bojy2.f133370b).mo67472a(bojy.f133373e, bojy2.f133373e);
        if (z) {
            bneu a2 = a.mo67471a(bojy.f133374f.size(), bojy2.f133374f.size());
            int i = 0;
            while (i < bojy.f133374f.size() && i < bojy2.f133374f.size()) {
                a2 = a2.mo67473a((String) bojy.f133374f.get(i), (String) bojy2.f133374f.get(i));
                i++;
            }
            a = a2;
        }
        return a.mo67470a();
    }

    /* renamed from: a */
    public static String m8547a(bojy bojy) {
        StringBuilder sb = new StringBuilder();
        m8549a(bojy, sb);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m8548a(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            m8549a((bojy) list.get(i), sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m8549a(bojy bojy, StringBuilder sb) {
        sb.append(bojy.f133370b);
        sb.append(':');
        sb.append(bojy.f133373e);
        bxwc bxwc = bojy.f133374f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            sb.append('+');
            sb.append((String) bxwc.get(i));
        }
    }

    /* renamed from: a */
    public static boolean m8550a(dky dky, dky dky2) {
        if (!dky.f13433a.equals(dky2.f13433a) || dky.size() != dky2.size()) {
            return false;
        }
        for (int i = 0; i < dky.size(); i++) {
            if (dky.f13433a.compare(dky.get(i), dky2.get(i)) != 0) {
                return false;
            }
        }
        return true;
    }
}
