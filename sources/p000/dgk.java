package p000;

import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgk {

    /* renamed from: a */
    public static final Comparator f13059a = dgi.f13057a;

    /* renamed from: b */
    public static final Comparator f13060b = dgj.f13058a;

    /* renamed from: c */
    public static final dky f13061c = dky.m8763a(f13059a);

    /* renamed from: d */
    public static final dky f13062d = dky.m8763a(f13060b);

    /* renamed from: a */
    public static dky m8394a(dky dky) {
        bngs b = bngx.m109371b(dky.size());
        int size = dky.size();
        for (int i = 0; i < size; i++) {
            b.mo67668c(((djd) dky.get(i)).f13317b);
        }
        return dky.m8761a((Iterable) b.mo67664a());
    }

    /* renamed from: b */
    public static dky m8398b(dky dky) {
        bngs b = bngx.m109371b(dky.size());
        int size = dky.size();
        for (int i = 0; i < size; i++) {
            djc djc = (djc) dky.get(i);
            if (!djc.f13312d) {
                b.mo67668c(djc.f13310b);
            }
        }
        return dky.m8761a((Iterable) b.mo67664a());
    }

    /* renamed from: c */
    public static dky m8400c(List list) {
        djc djc;
        Map a = adyi.m51410a();
        Map a2 = adyi.m51410a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (djc djc2 : (List) it.next()) {
                djc djc3 = (djc) a.get(djc2.f13310b);
                djc djc4 = (djc) a2.get(djc2.f13310b);
                if (!djc2.f13312d) {
                    if (djc4 != null && djc4.f13311c <= djc2.f13311c) {
                        a2.remove(djc2.f13310b);
                    }
                    djc djc5 = (djc) a.get(djc2.f13310b);
                    if (djc5 == null || djc5.f13311c < djc2.f13311c) {
                        a.put(djc2.f13310b, djc2);
                    }
                } else if ((djc3 == null || djc3.f13311c < djc2.f13311c) && ((djc = (djc) a2.get(djc2.f13310b)) == null || djc.f13311c < djc2.f13311c)) {
                    a2.put(djc2.f13310b, djc2);
                }
            }
        }
        bngs b = bngx.m109371b(a.size() + a2.size());
        b.mo67666b((Iterable) a.values());
        b.mo67666b((Iterable) a2.values());
        return dky.m8765b(b.mo67664a(), f13059a);
    }

    /* renamed from: a */
    public static dky m8395a(List list) {
        try {
            return m8400c(list);
        } catch (InvalidConfigException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static String m8399b(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            djc djc = (djc) list.get(i);
            sb.append(djc.f13310b);
            sb.append(':');
            sb.append(djc.f13311c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static dky m8396a(List list, List list2) {
        Map a = adyi.m51410a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            djc djc = (djc) it.next();
            if (!djc.f13312d) {
                a.put(djc.f13310b, djc);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            djc djc2 = (djc) it2.next();
            if (!djc2.f13312d) {
                a.put(djc2.f13310b, djc2);
            }
        }
        return dky.m8765b(a.values(), f13059a);
    }

    /* renamed from: a */
    public static List m8397a(dmn dmn) {
        ArrayList arrayList = new ArrayList(dmn.f13567q.size());
        for (int i = 0; i < dmn.f13567q.size(); i++) {
            bxvd da = djc.f13307f.mo74144da();
            String str = ((djd) dmn.f13567q.get(i)).f13317b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            djc djc = (djc) da.f164949b;
            str.getClass();
            djc.f13309a |= 1;
            djc.f13310b = str;
            long j = ((djd) dmn.f13567q.get(i)).f13318c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            djc djc2 = (djc) da.f164949b;
            djc2.f13309a |= 2;
            djc2.f13311c = j;
            arrayList.add((djc) da.mo74062i());
        }
        return arrayList;
    }
}
