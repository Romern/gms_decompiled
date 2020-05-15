package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: yyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyk {
    /* renamed from: a */
    private static int m45006a(caal caal, caah caah) {
        boolean z;
        int indexOf = caah.f172337c.indexOf(caal);
        if (indexOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108606b(z, "Data type [%s] does not have field [%s]", bzzn.m126362a(caah), bzzj.m126353a(caal));
        return indexOf;
    }

    /* renamed from: b */
    public static bnhe m45021b(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            caae caae = cadn.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            bngs bngs = (bngs) hashMap.get(caae);
            if (bngs == null) {
                bngs = bngx.m109377j();
                caae caae2 = cadn.f172705e;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                hashMap.put(caae2, bngs);
            }
            bngs.mo67668c(cadn);
        }
        bnha a = bnhe.m109406a(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            a.mo67695b((caae) entry.getKey(), ((bngs) entry.getValue()).mo67664a());
        }
        return a.mo67618b();
    }

    /* renamed from: c */
    public static int m45024c(cadn cadn, caal caal, caah caah) {
        int a = caak.m126415a(caal.f172343c);
        boolean z = true;
        if (!(a == 0 || a == 1)) {
            z = false;
        }
        bmxy.m108588a(z);
        caaw b = m45022b(cadn, caal, caah);
        bmxy.m108581a(b);
        return b.f172382b;
    }

    /* renamed from: d */
    public static float m45025d(cadn cadn, caal caal, caah caah) {
        int a = caak.m126415a(caal.f172343c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            z = false;
        }
        bmxy.m108588a(z);
        caaw b = m45022b(cadn, caal, caah);
        bmxy.m108581a(b);
        return (float) b.f172383c;
    }

    /* renamed from: a */
    public static int m45007a(cadn cadn, caal caal) {
        boolean z;
        int a = caak.m126415a(caal.f172343c);
        boolean z2 = false;
        if (a == 0) {
            z = true;
        } else {
            z = a == 1;
        }
        bmxy.m108588a(z);
        caae caae = cadn.f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        int a2 = caak.m126415a(caal.f172343c);
        if (a2 == 0) {
            z2 = true;
        } else if (a2 == 1) {
            z2 = true;
        }
        bmxy.m108588a(z2);
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return m45024c(cadn, caal, caah);
    }

    /* renamed from: b */
    public static caaw m45022b(cadn cadn, caal caal, caah caah) {
        return m45009a(cadn, m45006a(caal, caah));
    }

    /* renamed from: b */
    public static String m45023b(cadn cadn) {
        String str;
        if (cadn == null) {
            return null;
        }
        Object[] objArr = new Object[7];
        objArr[0] = yyp.m45050a(cadn.f172704d);
        objArr[1] = Long.valueOf(cadn.f172703c);
        objArr[2] = Long.valueOf(cadn.f172702b);
        objArr[3] = Long.valueOf(cadn.f172707g);
        objArr[4] = Long.valueOf(cadn.f172708h);
        caae caae = cadn.f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        objArr[5] = yyd.m44990b(caae);
        if ((cadn.f172701a & 8) == 0) {
            str = "_";
        } else {
            caae caae2 = cadn.f172706f;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            str = yyd.m44990b(caae2);
        }
        objArr[6] = str;
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", objArr);
    }

    /* renamed from: a */
    public static caah m45008a(cadn cadn) {
        boolean z;
        if ((cadn.f172701a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Data point must have data source.");
        caae caae = cadn.f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        caah caah = caae.f172330f;
        return caah == null ? caah.f172333d : caah;
    }

    /* renamed from: a */
    public static caaw m45009a(cadn cadn, int i) {
        if (i < cadn.f172704d.size()) {
            return (caaw) cadn.f172704d.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static cadn m45010a(caae caae) {
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        bmxy.m108582a(caae, "Data source cannot be null");
        int i = 0;
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        caae.getClass();
        cadn.f172705e = caae;
        cadn.f172701a |= 4;
        while (true) {
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (i >= caah.f172337c.size()) {
                return (cadn) cadm.mo74062i();
            }
            cadm.mo74613a(caaw.f172379i);
            i++;
        }
    }

    /* renamed from: a */
    public static cadn m45011a(caae caae, long j, long j2, TimeUnit timeUnit, caaw... caawArr) {
        return m45015a(caae, null, j, j2, timeUnit, caawArr);
    }

    /* renamed from: a */
    public static cadn m45012a(caae caae, long j, TimeUnit timeUnit, double d) {
        cadn a = m45014a(caae, j, timeUnit, yyp.m45046a(d));
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        cadm cadm = (cadm) bxvd;
        long nanos = timeUnit.toNanos(j);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn cadn2 = cadn.f172699j;
        cadn.f172701a |= 2;
        cadn.f172703c = nanos;
        return (cadn) cadm.mo74062i();
    }

    /* renamed from: a */
    public static cadn m45013a(caae caae, long j, TimeUnit timeUnit, Iterable iterable) {
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        caae.getClass();
        cadn.f172705e = caae;
        cadn.f172701a |= 4;
        cadm.mo74614a(iterable);
        if (j != 0) {
            long nanos = timeUnit.toNanos(j);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn2 = (cadn) cadm.f164949b;
            cadn2.f172701a |= 1;
            cadn2.f172702b = nanos;
        }
        return (cadn) cadm.mo74062i();
    }

    /* renamed from: a */
    public static cadn m45014a(caae caae, long j, TimeUnit timeUnit, caaw... caawArr) {
        return m45013a(caae, j, timeUnit, Arrays.asList(caawArr));
    }

    /* renamed from: a */
    public static cadn m45015a(caae caae, caae caae2, long j, long j2, TimeUnit timeUnit, caaw... caawArr) {
        List asList = Arrays.asList(caawArr);
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        caae.getClass();
        cadn.f172705e = caae;
        int i = cadn.f172701a | 4;
        cadn.f172701a = i;
        if (caae2 != null) {
            caae2.getClass();
            cadn.f172706f = caae2;
            cadn.f172701a = i | 8;
        }
        if (j2 != 0) {
            long nanos = timeUnit.toNanos(j2);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn2 = (cadn) cadm.f164949b;
            cadn2.f172701a |= 1;
            cadn2.f172702b = nanos;
        }
        cadm.mo74614a(asList);
        cadn cadn3 = (cadn) cadm.mo74062i();
        bxvd bxvd = (bxvd) cadn3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadn3);
        cadm cadm2 = (cadm) bxvd;
        if (j != 0) {
            long nanos2 = timeUnit.toNanos(j);
            if (cadm2.f164950c) {
                cadm2.mo74035c();
                cadm2.f164950c = false;
            }
            cadn cadn4 = (cadn) cadm2.f164949b;
            cadn4.f172701a |= 2;
            cadn4.f172703c = nanos2;
        }
        return (cadn) cadm2.mo74062i();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static String m45016a(Iterable r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            sb.append(m45023b((cadn) r4.get(i)));
            sb.append(',');
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m45017a(cadm cadm, long j, long j2) {
        if (j != 0) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn cadn2 = cadn.f172699j;
            cadn.f172701a |= 2;
            cadn.f172703c = j;
        }
        if (j2 != 0) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn3 = (cadn) cadm.f164949b;
            cadn cadn4 = cadn.f172699j;
            cadn3.f172701a |= 1;
            cadn3.f172702b = j2;
        }
    }

    /* renamed from: a */
    public static void m45018a(cadm cadm, caal caal, caah caah, int i) {
        int a = caak.m126415a(caal.f172343c);
        boolean z = true;
        if (!(a == 0 || a == 1)) {
            z = false;
        }
        bmxy.m108588a(z);
        m45019a(cadm, caal, caah, yyp.m45047a(i));
    }

    /* renamed from: a */
    public static void m45019a(cadm cadm, caal caal, caah caah, caaw caaw) {
        caaw caaw2;
        int a = m45006a(caal, caah);
        if (a >= ((cadn) cadm.f164949b).f172704d.size()) {
            for (int size = ((cadn) cadm.f164949b).f172704d.size(); size <= a; size++) {
                if (size != a) {
                    caaw2 = caaw.f172379i;
                } else {
                    caaw2 = caaw;
                }
                cadm.mo74613a(caaw2);
            }
            return;
        }
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn cadn2 = cadn.f172699j;
        caaw.getClass();
        cadn.mo74615c();
        cadn.f172704d.set(a, caaw);
    }

    /* renamed from: a */
    public static boolean m45020a(cadn cadn, caal caal, caah caah) {
        caaw b = m45022b(cadn, caal, caah);
        if (!yyp.m45052c(b)) {
            return false;
        }
        int a = caak.m126415a(caal.f172343c);
        if (a == 0) {
            a = 1;
        }
        switch (a) {
            case 1:
                if ((b.f172381a & 1) != 0) {
                    return true;
                }
                return false;
            case 2:
                if ((b.f172381a & 2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if ((b.f172381a & 4) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (b.f172385e.size() > 0) {
                    return true;
                }
                return false;
            case 5:
                if (b.f172386f.size() > 0) {
                    return true;
                }
                return false;
            case 6:
                if (b.f172387g.size() > 0) {
                    return true;
                }
                return false;
            default:
                if ((b.f172381a & 8) != 0) {
                    return true;
                }
                return false;
        }
    }
}
