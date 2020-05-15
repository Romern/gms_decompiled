package p000;

import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: qnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnn {
    /* renamed from: a */
    private static List m32512a(List list, List list2, Comparator comparator) {
        if (list.isEmpty() || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int i2 = 0;
        while (i < list.size() && i2 < list2.size()) {
            int compare = comparator.compare(list.get(i), list2.get(i2));
            if (compare == 0) {
                i++;
                i2++;
            } else if (compare < 0) {
                arrayList.add(list.get(i));
                i++;
            } else {
                i2++;
            }
        }
        while (i < list.size()) {
            arrayList.add(list.get(i));
            i++;
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(bojy, boolean):boolean
     arg types: [bojy, int]
     candidates:
      qnm.a(long, long):boolean
      qnm.a(bojy, int):boolean
      qnm.a(qmk, int):boolean
      qnm.a(qmk, qmk):boolean
      qnm.a(qmk, qox):boolean
      qnm.a(bojy, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        r10.add(r7);
        r4 = r7.f41738c;
        r6 = r4.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r7 >= r6) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r9.add(p000.qng.m32487a((p000.djd) r4.get(r7)));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        r15 = false;
     */
    /* renamed from: a */
    static qmk m32513a(Collection collection, qnq qnq) {
        qng qng;
        int i;
        qng qng2;
        int i2;
        C1245ok okVar;
        C1245ok okVar2;
        boolean z;
        boolean z2;
        int i3;
        bxwc bxwc;
        Iterator it;
        int i4;
        bxwc bxwc2;
        Iterator it2;
        boolean z3;
        qnq qnq2 = qnq;
        C1245ok okVar3 = new C1245ok();
        C1245ok okVar4 = new C1245ok();
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            qmk qmk = (qmk) it3.next();
            C1225nr nrVar = new C1225nr();
            if (!qnq.mo24137a()) {
                bxwc bxwc3 = qmk.f41709c;
                int size = bxwc3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    djc djc = (djc) bxwc3.get(i5);
                    if (!djc.f13312d || qnq2.mo24138a(djc, qmk)) {
                        nrVar.add(qng.m32486a(djc));
                    }
                }
            } else {
                bxwc bxwc4 = qmk.f41709c;
                int size2 = bxwc4.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    djc djc2 = (djc) bxwc4.get(i6);
                    if (djc2.f13312d && qnq2.mo24138a(djc2, qmk)) {
                        nrVar.add(qng.m32486a(djc2));
                    }
                }
            }
            C1225nr nrVar2 = new C1225nr();
            qng a = qng.m32486a(djc.f13307f);
            while (true) {
                bxwc bxwc5 = qmk.f41708b;
                int size3 = bxwc5.size();
                int i7 = 0;
                boolean z4 = true;
                while (i7 < size3) {
                    qmt qmt = (qmt) bxwc5.get(i7);
                    if (nrVar2.contains(qmt)) {
                        it2 = it3;
                        bxwc2 = bxwc5;
                    } else {
                        if (qnq.mo24137a() || qmt.f41738c.size() != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        bxwc bxwc6 = qmt.f41738c;
                        it2 = it3;
                        int size4 = bxwc6.size();
                        bxwc2 = bxwc5;
                        int i8 = 0;
                        while (true) {
                            if (i8 < size4) {
                                int i9 = size4;
                                a.mo24131b((djd) bxwc6.get(i8));
                                i8++;
                                if (nrVar.contains(a)) {
                                    break;
                                }
                                size4 = i9;
                            } else if (!z3) {
                            }
                        }
                    }
                    i7++;
                    it3 = it2;
                    bxwc5 = bxwc2;
                }
                it = it3;
                if (z4) {
                    break;
                }
                it3 = it;
            }
            bxvd da = qmk.f41705d.mo74144da();
            boolean a2 = qnm.m32504a((bojy) qmk.f41707a.get(0), false);
            ArrayList arrayList2 = new ArrayList();
            bxwc bxwc7 = qmk.f41709c;
            int size5 = bxwc7.size();
            for (int i10 = 0; i10 < size5; i10++) {
                djc djc3 = (djc) bxwc7.get(i10);
                qng a3 = qng.m32486a(djc3);
                if (!djc3.f13312d) {
                    m32515a(okVar4, a3, da, a2);
                    arrayList2.add(djc3);
                } else if (nrVar.contains(a3)) {
                    m32515a(okVar3, a3, da, a2);
                    bxvd bxvd = (bxvd) djc3.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) djc3);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    djc djc4 = (djc) bxvd.f164949b;
                    djc4.f13309a |= 4;
                    djc4.f13312d = false;
                    arrayList2.add((djc) bxvd.mo74062i());
                } else if (qnq2.mo24139a(a3, a2)) {
                    arrayList2.add(djc3);
                }
            }
            Collections.sort(arrayList2, dgk.f13059a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((qmk) da.f164949b).f41708b = GeneratedMessageLite.m124030de();
            da.mo73941E(nrVar2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((qmk) da.f164949b).f41709c = GeneratedMessageLite.m124030de();
            da.mo73937C(arrayList2);
            if (!da.f164950c) {
                i4 = 0;
            } else {
                da.mo74035c();
                i4 = 0;
                da.f164950c = false;
            }
            ((qmk) da.f164949b).f41707a = GeneratedMessageLite.m124030de();
            bojy bojy = (bojy) qmk.f41707a.get(i4);
            bxvd bxvd2 = (bxvd) bojy.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bojy);
            bojx bojx = (bojx) bxvd2;
            if (bojx.f164950c) {
                bojx.mo74035c();
                bojx.f164950c = false;
            }
            bojy bojy2 = bojy.f133367g;
            ((bojy) bojx.f164949b).f133374f = GeneratedMessageLite.m124030de();
            da.mo73996a(bojx);
            arrayList.add(da);
            it3 = it;
        }
        bngs j = bngx.m109377j();
        int size6 = arrayList.size();
        int i11 = 0;
        while (i11 < size6) {
            j.mo67668c(Collections.unmodifiableList(((qmk) ((bxvd) arrayList.get(i11)).f164949b).f41709c));
            i11++;
            okVar4 = okVar4;
            okVar3 = okVar3;
        }
        dky a4 = dgk.m8395a(j.mo67664a());
        C1225nr nrVar3 = new C1225nr();
        Set b = adyi.m51413b();
        qng a5 = qng.m32486a(djc.f13307f);
        int size7 = a4.size();
        int i12 = 0;
        while (i12 < size7) {
            djc djc5 = (djc) a4.get(i12);
            if (!djc5.f13312d) {
                qng.mo24130b(djc5);
                bxvd bxvd3 = (bxvd) okVar4.get(qng);
                if (bxvd3 == null) {
                    bxvd3 = (bxvd) okVar3.get(qng);
                    if (bxvd3 != null) {
                        z = true;
                    } else {
                        String valueOf = String.valueOf(qng);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("Feature not provided:");
                        sb.append(valueOf);
                        throw new InvalidConfigException(sb.toString());
                    }
                } else {
                    z = false;
                }
                for (qmt qmt2 : Collections.unmodifiableList(((qmk) bxvd3.f164949b).f41708b)) {
                    bxwc bxwc8 = qmt2.f41738c;
                    int size8 = bxwc8.size();
                    qng qng3 = qng;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size8) {
                            qng = qng3;
                            break;
                        }
                        C1245ok okVar5 = okVar3;
                        djd djd = (djd) bxwc8.get(i13);
                        C1245ok okVar6 = okVar4;
                        int i14 = size7;
                        if (djd.f13317b.equals(djc5.f13310b)) {
                            bxwc = bxwc8;
                            i3 = size8;
                            if (djd.f13318c == djc5.f13311c) {
                                b.add(qmt2);
                                qng = qng3;
                                okVar4 = okVar6;
                                okVar3 = okVar5;
                                size7 = i14;
                                break;
                            }
                        } else {
                            bxwc = bxwc8;
                            i3 = size8;
                        }
                        i13++;
                        bxwc8 = bxwc;
                        okVar4 = okVar6;
                        okVar3 = okVar5;
                        size7 = i14;
                        size8 = i3;
                    }
                }
                qng2 = qng;
                okVar = okVar3;
                okVar2 = okVar4;
                i2 = size7;
                if (z) {
                    bojy l = bxvd3.mo74077l();
                    bxvd bxvd4 = (bxvd) l.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) l);
                    bojx bojx2 = (bojx) bxvd4;
                    String str = djc5.f13310b;
                    List unmodifiableList = Collections.unmodifiableList(((bojy) bojx2.f164949b).f133374f);
                    int binarySearch = Collections.binarySearch(unmodifiableList, str);
                    if (binarySearch < 0) {
                        binarySearch = -(binarySearch + 1);
                    }
                    if (!bojx2.f164950c) {
                        z2 = false;
                    } else {
                        bojx2.mo74035c();
                        z2 = false;
                        bojx2.f164950c = false;
                    }
                    bojy bojy3 = bojy.f133367g;
                    ((bojy) bojx2.f164949b).f133374f = GeneratedMessageLite.m124030de();
                    bojx2.mo68914a(unmodifiableList.subList(z2 ? 1 : 0, binarySearch));
                    if (bojx2.f164950c) {
                        bojx2.mo74035c();
                        bojx2.f164950c = z2;
                    }
                    bojy bojy4 = (bojy) bojx2.f164949b;
                    str.getClass();
                    bojy4.mo68915a();
                    bojy4.f133374f.add(str);
                    bojx2.mo68914a(unmodifiableList.subList(binarySearch, unmodifiableList.size()));
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    qmk.m32445a((qmk) bxvd3.f164949b, (bojy) bojx2.mo74062i());
                }
                nrVar3.add(bxvd3.mo74077l().f133370b);
            } else {
                qng2 = qng;
                okVar = okVar3;
                okVar2 = okVar4;
                i2 = size7;
            }
            i12++;
            a5 = qng2;
            okVar4 = okVar2;
            okVar3 = okVar;
            size7 = i2;
        }
        int size9 = arrayList.size();
        int i15 = 0;
        while (i15 < size9) {
            bxvd bxvd5 = (bxvd) arrayList.get(i15);
            Iterator it4 = Collections.unmodifiableList(((qmk) bxvd5.f164949b).f41708b).iterator();
            while (true) {
                i = i15 + 1;
                if (!it4.hasNext()) {
                    break;
                }
                qmt qmt3 = (qmt) it4.next();
                if (qmt3.f41738c.size() == 0) {
                    b.add(qmt3);
                    nrVar3.add(bxvd5.mo74077l().f133370b);
                }
            }
            i15 = i;
        }
        ArrayList arrayList3 = new ArrayList(b);
        Collections.sort(arrayList3, qnm.f41782a);
        ArrayList arrayList4 = new ArrayList();
        int size10 = arrayList.size();
        for (int i16 = 0; i16 < size10; i16++) {
            bojy l2 = ((bxvd) arrayList.get(i16)).mo74077l();
            if (!nrVar3.contains(l2.f133370b)) {
                if (!qnm.m32504a(l2, false)) {
                }
            }
            arrayList4.add(l2);
        }
        Collections.sort(arrayList4, dhz.f13197a);
        bxvd da2 = qmk.f41705d.mo74144da();
        da2.mo73937C(a4);
        da2.mo73941E(arrayList3);
        da2.mo73939D(arrayList4);
        return (qmk) da2.mo74062i();
    }

    /* renamed from: a */
    public static qmk m32514a(qmk qmk, qmk qmk2) {
        List a = m32512a(qmk.f41707a, qmk2.f41707a, dhz.f13198b);
        List a2 = m32512a(qmk.f41708b, qmk2.f41708b, qnm.f41782a);
        List a3 = m32512a(qmk.f41709c, qmk2.f41709c, dgk.f13059a);
        bxvd da = qmk.f41705d.mo74144da();
        da.mo73939D(a);
        da.mo73937C(a3);
        da.mo73941E(a2);
        return (qmk) da.mo74062i();
    }

    /* renamed from: a */
    private static void m32515a(C1245ok okVar, qng qng, bxvd bxvd, boolean z) {
        if (!z || okVar.get(qng) == null) {
            okVar.put(qng, bxvd);
        }
    }
}
