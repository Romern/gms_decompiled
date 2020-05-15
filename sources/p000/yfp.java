package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: yfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfp {

    /* renamed from: a */
    public static final bnny f53730a;

    /* renamed from: b */
    private static final bnny f53731b = bnnt.f131877a.mo68159a(yfn.f53728a);

    static {
        bnny a = bnnt.f131877a.mo68159a(yfo.f53729a);
        f53730a = a;
        f53731b.mo68163b(a);
    }

    /* renamed from: a */
    public static float m43954a(Iterable iterable) {
        Iterator it = iterable.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += ((yhu) it.next()).mo30510b(0);
        }
        return f;
    }

    /* renamed from: b */
    public static int m43968b(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((yhu) it.next()).mo30517j();
        }
        return i;
    }

    /* renamed from: c */
    private static yhu m43974c(ListIterator listIterator, long j) {
        while (listIterator.hasPrevious()) {
            yhu yhu = (yhu) listIterator.previous();
            if (yhu.mo30387b() <= j) {
                return yhu;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m43976d(yhg yhg, yhg yhg2) {
        return yhg.mo30385a() >= yhg2.mo30387b();
    }

    /* renamed from: e */
    public static boolean m43977e(yhg yhg, yhg yhg2) {
        return yhg2.mo30385a() <= yhg.mo30385a() && yhg2.mo30387b() >= yhg.mo30387b();
    }

    /* renamed from: a */
    public static float m43955a(ListIterator listIterator, long j, long j2) {
        float f = 0.0f;
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            yhu yhu = (yhu) listIterator.next();
            if (yhu.mo30387b() > j) {
                if (yhu.mo30387b() > j2) {
                    listIterator.previous();
                    break;
                }
                f += yhu.mo30510b(0);
            }
        }
        return f;
    }

    /* renamed from: b */
    public static long m43969b(List list, TimeUnit timeUnit) {
        if (!list.isEmpty()) {
            return yhf.m44095b((yhu) bnjd.m109595d(list), timeUnit) - yhf.m44093a((yhu) list.get(0), timeUnit);
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m43975c(yhg yhg, yhg yhg2) {
        return yhg.mo30387b() <= yhg2.mo30385a();
    }

    /* renamed from: a */
    public static float m43956a(yhu yhu, int i) {
        if (i != 1) {
            return yhu.mo30510b(0);
        }
        return (float) yhu.mo30517j();
    }

    /* renamed from: b */
    public static bngx m43970b(yhg yhg, ListIterator listIterator) {
        bngs j = bngx.m109377j();
        yfw yfw = (yfw) yhg;
        yhu b = m43972b(listIterator, yfw.f53737a, yfw.f53738b);
        while (b != null) {
            j.mo67668c(b);
            b = m43972b(listIterator, yfw.f53737a, yfw.f53738b);
        }
        bngx a = j.mo67664a();
        if (!a.isEmpty() && yfw.f53738b < ((yhu) bnjd.m109595d(a)).mo30387b()) {
            listIterator.previous();
        }
        return a;
    }

    /* renamed from: a */
    public static long m43957a(List list, TimeUnit timeUnit) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j += yhh.m44102a((yhu) list.get(i), timeUnit);
        }
        return j;
    }

    /* renamed from: a */
    public static long m43958a(yhu yhu) {
        long a = yhu.mo30385a();
        return a <= 0 ? yhu.mo30387b() : a;
    }

    /* renamed from: a */
    public static bngx m43959a(yhg yhg, ListIterator listIterator) {
        bngs j = bngx.m109377j();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            yhu yhu = (yhu) listIterator.next();
            long b = yhu.mo30387b();
            if (yhu.mo30385a() < yhg.mo30385a() || b > yhg.mo30387b()) {
                if (b >= yhg.mo30385a() && b > yhg.mo30387b()) {
                    listIterator.previous();
                    break;
                }
            } else {
                j.mo67668c(yhu);
            }
        }
        return j.mo67664a();
    }

    /* renamed from: b */
    public static yhu m43971b(ListIterator listIterator, long j) {
        yhu yhu;
        if (!listIterator.hasNext()) {
            yhu = m43974c(listIterator, j);
        } else {
            yhu = null;
        }
        while (listIterator.hasNext()) {
            yhu = (yhu) listIterator.next();
            if (yhu.mo30387b() > j) {
                return m43974c(listIterator, j);
            }
        }
        return yhu;
    }

    /* renamed from: b */
    public static yhu m43972b(ListIterator listIterator, long j, long j2) {
        while (listIterator.hasNext()) {
            yhu yhu = (yhu) listIterator.next();
            long b = yhu.mo30387b();
            long a = yhu.mo30385a();
            if (b > j) {
                if (a < j2) {
                    return yhu;
                }
                listIterator.previous();
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m43973b(yhg yhg, yhg yhg2) {
        long a = yhg.mo30385a();
        long b = yhg.mo30387b();
        yfw yfw = (yfw) yhg2;
        return a == 0 ? yfw.f53737a <= b && b <= yfw.f53738b : a >= yfw.f53737a && b <= yfw.f53738b;
    }

    /* renamed from: a */
    public static List m43960a(List list, Object obj) {
        if (list == null) {
            return bngx.m109356a(obj);
        }
        if (!(list instanceof ArrayList)) {
            list = new ArrayList(list);
        }
        list.add(obj);
        return list;
    }

    /* renamed from: a */
    public static yhu m43961a(ListIterator listIterator, long j) {
        yhu yhu = null;
        while (listIterator.hasNext()) {
            yhu = (yhu) listIterator.next();
            if (yhu.mo30387b() >= j) {
                break;
            }
        }
        return yhu;
    }

    /* renamed from: a */
    public static void m43962a(yht yht, float f, int i) {
        yft a = yht.mo30503a();
        if (i != 1) {
            a.mo30432a((double) f);
        } else {
            a.mo30433a(Math.round(f));
        }
    }

    /* renamed from: a */
    public static void m43963a(yht yht, List list) {
        boolean z;
        ArrayList arrayList;
        int size = list.size();
        List list2 = yht.f53833b;
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (list2 == null) {
            arrayList = new ArrayList(size);
        } else {
            if (list2 instanceof ArrayList) {
                arrayList = (ArrayList) list2;
            } else {
                arrayList = new ArrayList(list2);
            }
            arrayList.ensureCapacity(size);
        }
        yht.f53833b = arrayList;
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            yfu yfu = (yfu) list.get(i);
            yft a = yht.mo30503a();
            if (!yfu.mo30437d()) {
                caaw caaw = yfu.f53736a;
                int i2 = caaw.f172381a;
                if ((i2 & 1) != 0) {
                    a.mo30433a(yfu.mo30434a());
                } else if ((i2 & 4) != 0) {
                    bmxy.m108588a(true);
                    String str = yfu.f53736a.f172384d;
                    caau caau = a.f53735a;
                    if (caau.f164950c) {
                        caau.mo74035c();
                        caau.f164950c = false;
                    }
                    caaw caaw2 = (caaw) caau.f164949b;
                    caaw caaw3 = caaw.f172379i;
                    str.getClass();
                    caaw2.f172381a |= 4;
                    caaw2.f172384d = str;
                } else if (Collections.unmodifiableMap(caaw.f172385e).isEmpty()) {
                    caaw caaw4 = yfu.f53736a;
                    if ((caaw4.f172381a & 8) != 0) {
                        byte[] e = yfu.mo30438e();
                        caau caau2 = a.f53735a;
                        ByteString a2 = ByteString.m123261a(e);
                        if (caau2.f164950c) {
                            caau2.mo74035c();
                            caau2.f164950c = false;
                        }
                        caaw caaw5 = (caaw) caau2.f164949b;
                        caaw caaw6 = caaw.f172379i;
                        a2.getClass();
                        caaw5.f172381a |= 8;
                        caaw5.f172388h = a2;
                    } else if (caaw4.f172387g.size() > 0) {
                        a.f53735a.mo74601a(bqcl.m112573a(bqcl.m112574a(yfu.f53736a.f172387g)));
                    } else if (yfu.f53736a.f172386f.size() > 0) {
                        a.f53735a.mo74603b(bqcn.m112586b(bqcn.m112584a(yfu.f53736a.f172386f)));
                    }
                } else {
                    Map c = yfu.mo30436c();
                    caau caau3 = a.f53735a;
                    if (caau3.f164950c) {
                        caau3.mo74035c();
                        caau3.f164950c = false;
                    }
                    caaw caaw7 = caaw.f172379i;
                    ((caaw) caau3.f164949b).mo74604c().clear();
                    for (Map.Entry entry : c.entrySet()) {
                        Float f = (Float) entry.getValue();
                        if (f != null) {
                            caau caau4 = a.f53735a;
                            String str2 = (String) entry.getKey();
                            bxvd da = caar.f172365c.mo74144da();
                            double floatValue = (double) f.floatValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            caar caar = (caar) da.f164949b;
                            caar.f172367a |= 1;
                            caar.f172368b = floatValue;
                            caau4.mo74602a(str2, (caar) da.mo74062i());
                        }
                    }
                }
            } else {
                a.mo30432a(yfu.mo30435b());
            }
        }
    }

    /* renamed from: a */
    public static void m43964a(yhx yhx, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m43965a(yhx, (yhu) it.next());
        }
    }

    /* renamed from: a */
    public static void m43965a(yhx yhx, yhu yhu) {
        yht c = yhx.mo30521c();
        c.mo30504a(yhu).mo30506a(yhu.mo30511d());
        m43963a(c, yhu.mo30516i());
    }

    /* renamed from: a */
    public static boolean m43966a(yhg yhg, long j, long j2) {
        return yhg.mo30387b() < j || yhg.mo30385a() > j2;
    }

    /* renamed from: a */
    public static boolean m43967a(yhg yhg, yhg yhg2) {
        yfw yfw = (yfw) yhg2;
        return yhg.mo30387b() <= yfw.f53737a || yhg.mo30385a() >= yfw.f53738b;
    }
}
