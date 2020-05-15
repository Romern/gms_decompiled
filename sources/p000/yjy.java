package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* renamed from: yjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjy {
    /* renamed from: a */
    public static bngx m44257a(ygx ygx) {
        return ygx != null ? ygx.mo30473a() : bngx.m109376e();
    }

    /* renamed from: b */
    public static List m44267b(Iterable iterable, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ygx ygx = (ygx) it.next();
            if (str.equals(ygx.mo30474b().mo30423c()) && ygx.mo30474b().mo30427f().startsWith(str2)) {
                arrayList.add(ygx);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static String m44258a(Iterable r5) {
        StringBuilder sb = new StringBuilder();
        int size = r5.size();
        String str = "";
        int i = 0;
        while (i < size) {
            sb.append(str);
            sb.append(((ygx) r5.get(i)).mo30474b().mo30425e());
            i++;
            str = ",";
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m44259a(Iterable r5, ygd ygd) {
        ArrayList arrayList = new ArrayList();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            ygx ygx = (ygx) r5.get(i);
            if (ygd.mo30462a(ygx.mo30474b())) {
                arrayList.add(ygx);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m44260a(Iterable iterable, ygz ygz) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ygx ygx = (ygx) it.next();
            if (ygz.f53800e.equals(ygx.mo30474b().mo30423c()) && ygz.f53801f.mo30462a(ygx.mo30474b())) {
                arrayList.add(ygx);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ygx m44261a(Iterable iterable, String str) {
        ygd b = ygv.m44055b(str);
        Iterator it = iterable.iterator();
        ygx ygx = null;
        while (it.hasNext()) {
            ygx ygx2 = (ygx) it.next();
            if (b.mo30462a(ygx2.mo30474b()) && (ygx == null || ygx2.mo30473a().size() > ygx.mo30473a().size() || (ygx2.mo30473a().size() == ygx.mo30473a().size() && ygx2.mo30474b().mo30425e().compareTo(ygx.mo30474b().mo30425e()) < 0))) {
                ygx = ygx2;
            }
        }
        return ygx;
    }

    /* renamed from: a */
    public static ygx m44262a(Iterable iterable, String str, String str2) {
        List a = m44259a(iterable, ygv.m44053a(ygv.m44055b(str), ygv.m44057b(str2)));
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() > 1) {
            ypq.m44538a("More than one data source found in input.", Level.WARNING, "Data type: %s, stream name: %s", str, str2);
        }
        return (ygx) a.get(0);
    }

    /* renamed from: a */
    public static ygx m44263a(String str, String str2) {
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(str);
        a.mo30419a(str2);
        return yhy.m44167a(a.mo30415a()).mo30520b();
    }

    /* renamed from: a */
    public static ygx m44264a(yhy yhy, String str, String str2, List list) {
        ygx a = m44262a(list, str, str2);
        if (a != null) {
            return a;
        }
        ypq.m44538a("Desired data source not found in input.", Level.FINE, "Data type: %s, stream name: %s", str, str2);
        return m44263a(str, str2);
    }

    /* renamed from: a */
    public static yhx m44265a(String str, String str2, yfl yfl, caaq caaq) {
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(str);
        a.mo30419a(str2);
        if (yfl != null) {
            a.mo30420a(yfl);
        }
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        return yhy.m44167a(a.mo30415a());
    }

    /* renamed from: a */
    public static yhx m44266a(yhy yhy, yfr yfr) {
        return m44265a(yfr.mo30423c(), yfr.mo30427f(), yfr.mo30422b(), yfr.mo30428g());
    }
}
