package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnm {

    /* renamed from: a */
    public static final Comparator f41782a = qne.f41767a;

    /* renamed from: b */
    public static final Comparator f41783b = qnf.f41768a;

    /* renamed from: c */
    private static final bmyx f41784c = bmyx.m108640a(',').mo66920b().mo66917a();

    /* renamed from: d */
    private static final bmyx f41785d = bmyx.m108640a(':').mo66920b().mo66917a();

    /* renamed from: a */
    public static bnic m32491a(Collection collection) {
        bnia c = bnic.m109499c(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dhs dhs = ((dgl) it.next()).f13189i;
            if (dhs != null) {
                c.mo67629b(dhs);
            }
        }
        return c.mo67751a();
    }

    /* renamed from: a */
    public static boolean m32502a(long j, long j2) {
        return j / 1000000 < j2 / 1000000;
    }

    /* renamed from: a */
    public static boolean m32503a(bojy bojy, int i) {
        return (bojy.f133372d & i) != 0;
    }

    /* renamed from: b */
    public static String m32510b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            qmk qmk = (qmk) it.next();
            if (!z) {
                sb.append(";");
            }
            sb.append(dhz.m8548a(qmk.f41707a));
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static bnkd m32492a(dky dky, Set set, qox qox) {
        bndu r = bndu.m109109r();
        boolean k = cdjh.f180979a.mo6606a().mo77746k();
        int size = dky.size();
        for (int i = 0; i < size; i++) {
            qmk qmk = (qmk) dky.get(i);
            if (m32509a(qmk, qox)) {
                String str = ((bojy) qmk.f41707a.get(0)).f133370b;
                if (set.contains(str)) {
                    qox.mo24183a(qmk, 6);
                } else {
                    List a = r.mo67124a(str);
                    if (!k || a.isEmpty() || m32508a((qmk) a.get(0), qmk)) {
                        a.add(0, qmk);
                    }
                }
            }
        }
        return r;
    }

    /* renamed from: b */
    public static qmk m32511b(String str) {
        bxvd da = qmk.f41705d.mo74144da();
        da.mo73997a(m32493a(str));
        return (qmk) da.mo74062i();
    }

    /* renamed from: a */
    public static bojy m32493a(String str) {
        long j;
        int a = srr.m36143a(201515033);
        int i = 99;
        if (a <= 0) {
            a = 99;
        }
        int b = srr.m36146b("20.15.15 (120300-{{cl}})");
        int c = srr.m36147c("20.15.15 (120300-{{cl}})");
        int d = srr.m36148d("20.15.15 (120300-{{cl}})");
        if (b == -1 || c == -1 || d == -1) {
            d = 99;
            c = 99;
        } else {
            i = b;
        }
        if (cdjl.f180997a.mo6606a().mo77695a()) {
            j = (((long) a) * 10000000) + 9000000 + (((long) i) * 10000) + (((long) c) * 100) + ((long) d);
        } else {
            j = (((long) a) * 1000000) + (((long) i) * 10000) + (((long) c) * 100) + ((long) d);
        }
        bojx bojx = (bojx) bojy.f133367g.mo74144da();
        if (bojx.f164950c) {
            bojx.mo74035c();
            bojx.f164950c = false;
        }
        bojy bojy = (bojy) bojx.f164949b;
        str.getClass();
        int i2 = bojy.f133369a | 1;
        bojy.f133369a = i2;
        bojy.f133370b = str;
        int i3 = i2 | 2;
        bojy.f133369a = i3;
        bojy.f133371c = (int) (j / 10000);
        int i4 = i3 | 8;
        bojy.f133369a = i4;
        bojy.f133373e = j;
        bojy.f133369a = i4 | 4;
        bojy.f133372d = 64;
        return (bojy) bojx.mo74062i();
    }

    /* renamed from: a */
    public static dhs m32494a(qmt qmt) {
        return new dhs(qmt.f41737b, qmt.f41739d);
    }

    /* renamed from: a */
    public static dky m32495a(List list) {
        return dky.m8765b(list, f41783b);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static Set m32496a(Iterable r5) {
        C1225nr nrVar = new C1225nr();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            bojy bojy = (bojy) r5.get(i);
            if (m32503a(bojy, 128)) {
                nrVar.add(bojy);
            }
        }
        return nrVar;
    }

    /* renamed from: a */
    public static Set m32497a(qnl qnl, Set set, boolean z) {
        if (qnl.f41779c.isEmpty()) {
            return Collections.emptySet();
        }
        String valueOf = String.valueOf(qnl.f41779c.keySet());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("All Zapp modules in module sets: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(set);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Already downloaded modules: ");
        sb2.append(valueOf2);
        sb2.toString();
        C1225nr nrVar = new C1225nr(qnl.f41779c.size());
        bnrd a = qnl.f41779c.keySet().iterator();
        while (a.hasNext()) {
            dhs dhs = (dhs) a.next();
            if (!set.contains(dhs)) {
                qmt qmt = (qmt) qnl.f41779c.get(dhs);
                bmzs.m108696a(qmt);
                String str = qmt.f41737b;
                String str2 = qmt.f41739d;
                int a2 = qmq.m32457a(qmt.f41740e);
                boolean z2 = true;
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i == 1) {
                    z2 = z;
                } else if (i == 2) {
                    z2 = false;
                }
                nrVar.add(new qnc(str, str2, z2));
            }
        }
        return nrVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[SYNTHETIC, Splitter:B:32:0x008e] */
    /* renamed from: a */
    public static qmk m32498a(Resources resources) {
        byte[] bArr;
        InputStream open;
        try {
            open = resources.getAssets().open("ChimeraModuleSet.pb", 3);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            dft.m8320a(open, allocate.array());
            allocate.order(ByteOrder.BIG_ENDIAN);
            int i = allocate.getInt();
            if (i >= 0) {
                if (i <= 10000) {
                    bArr = new byte[i];
                    dft.m8320a(open, bArr);
                    if (open != null) {
                        open.close();
                    }
                    if (bArr != null) {
                        try {
                            bxvd da = qmk.f41705d.mo74144da();
                            da.mo73635b(bArr, bxus.m123743b());
                            qmk qmk = (qmk) da.mo74062i();
                            bxvd bxvd = (bxvd) qmk.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) qmk);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ((qmk) bxvd.f164949b).f41707a = GeneratedMessageLite.m124030de();
                            bxvd.mo73997a(m32493a("container"));
                            for (int i2 = 0; i2 < ((qmk) bxvd.f164949b).f41709c.size(); i2++) {
                                djc djc = (djc) ((qmk) bxvd.f164949b).f41709c.get(i2);
                                bxvd bxvd2 = (bxvd) djc.mo74142c(5);
                                bxvd2.mo73625a((GeneratedMessageLite) djc);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                djc djc2 = (djc) bxvd2.f164949b;
                                djc djc3 = djc.f13307f;
                                djc2.f13309a |= 8;
                                djc2.f13313e = true;
                                djc djc4 = (djc) bxvd2.mo74062i();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                qmk qmk2 = (qmk) bxvd.f164949b;
                                djc4.getClass();
                                qmk2.mo24112c();
                                qmk2.f41709c.set(i2, djc4);
                            }
                            return (qmk) bxvd.mo74062i();
                        } catch (bxwf e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                            sb.append("Invalid container module set format: ");
                            sb.append(valueOf);
                            Log.e("ModuleSetUtils", sb.toString());
                        }
                    }
                    return null;
                }
            }
            StringBuilder sb2 = new StringBuilder(62);
            sb2.append("Asset ");
            sb2.append("ChimeraModuleSet.pb");
            sb2.append(" has bad prefixed length: ");
            sb2.append(i);
            Log.e("ConfigFileUtils", sb2.toString());
            if (open != null) {
                open.close();
                bArr = null;
            } else {
                bArr = null;
            }
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb3.append("Failed to read asset ChimeraModuleSet.pb: ");
            sb3.append(valueOf2);
            Log.e("ConfigFileUtils", sb3.toString());
            bArr = null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        if (bArr != null) {
        }
        return null;
        throw th;
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
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0220 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022e A[LOOP:8: B:74:0x022c->B:75:0x022e, LOOP_END] */
    /* renamed from: a */
    public static qnl m32499a(Map map, qmk qmk, qnq qnq) {
        int i;
        boolean z;
        Iterator it;
        C1245ok okVar;
        boolean z2;
        List list;
        bxwc bxwc;
        boolean z3;
        C1245ok okVar2;
        int i2;
        bxwc bxwc2;
        boolean z4;
        bxwc bxwc3;
        int size;
        int i3;
        int size2;
        int i4;
        bxwc bxwc4;
        C1245ok okVar3;
        C1245ok okVar4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        C1245ok okVar5;
        Map map2 = map;
        qmk qmk2 = qmk;
        qnq qnq2 = qnq;
        String str = "Can't locate container module set";
        String str2 = "container";
        boolean z8 = false;
        if (cdjl.f180997a.mo6606a().mo77694H()) {
            Collection values = map.values();
            C1245ok okVar6 = new C1245ok();
            C1245ok okVar7 = new C1245ok();
            boolean a = qnq.mo24137a();
            C1245ok okVar8 = new C1245ok();
            C1245ok okVar9 = new C1245ok();
            C1245ok okVar10 = new C1245ok();
            ArrayList arrayList = new ArrayList(values.size());
            Iterator it2 = values.iterator();
            while (it2.hasNext()) {
                qmk qmk3 = (qmk) it2.next();
                bojy bojy = (bojy) qmk3.f41707a.get(z8 ? 1 : 0);
                String str3 = bojy.f133370b;
                boolean a2 = m32504a(bojy, z8);
                bngs b = bngx.m109371b(qmk3.f41709c.size());
                Iterator it3 = it2;
                bxwc bxwc5 = qmk3.f41709c;
                String str4 = str;
                int size3 = bxwc5.size();
                String str5 = str2;
                int i6 = 0;
                while (i6 < size3) {
                    int i7 = size3;
                    djc djc = (djc) bxwc5.get(i6);
                    bxwc bxwc6 = bxwc5;
                    qng a3 = qng.m32486a(djc);
                    if (!a) {
                        z7 = a;
                        if (!djc.f13312d) {
                            z6 = m32506a(okVar8, a3, str3, a2);
                        } else if (qnq2.mo24138a(djc, qmk3)) {
                            boolean a4 = m32506a(okVar9, a3, str3, a2);
                            if (a4) {
                                bxvd bxvd = (bxvd) djc.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) djc);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                djc djc2 = (djc) bxvd.f164949b;
                                djc djc3 = djc.f13307f;
                                z6 = a4;
                                djc2.f13309a |= 4;
                                djc2.f13312d = false;
                                djc = (djc) bxvd.mo74062i();
                            } else {
                                z6 = a4;
                            }
                        } else {
                            z6 = qnq2.mo24139a(a3, a2) ? m32506a(okVar10, a3, str3, a2) : false;
                        }
                    } else if (!qnq2.mo24138a(djc, qmk3)) {
                        z7 = a;
                        z6 = false;
                    } else {
                        z7 = a;
                        if (!djc.f13312d) {
                            okVar5 = okVar8;
                        } else {
                            okVar5 = okVar9;
                        }
                        boolean a5 = m32506a(okVar5, a3, str3, a2);
                        if (!a5 || !djc.f13312d) {
                            z6 = a5;
                        } else {
                            bxvd bxvd2 = (bxvd) djc.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) djc);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            djc djc4 = (djc) bxvd2.f164949b;
                            djc djc5 = djc.f13307f;
                            z6 = a5;
                            djc4.f13309a |= 4;
                            djc4.f13312d = false;
                            djc = (djc) bxvd2.mo74062i();
                        }
                    }
                    if (z6) {
                        b.mo67668c(djc);
                    }
                    i6++;
                    size3 = i7;
                    bxwc5 = bxwc6;
                    a = z7;
                }
                arrayList.add(b.mo67664a());
                it2 = it3;
                str = str4;
                str2 = str5;
                a = a;
                z8 = false;
            }
            String str6 = str;
            String str7 = str2;
            dky a6 = dgk.m8395a(arrayList);
            qng qng = new qng();
            int size4 = a6.size();
            int i8 = 0;
            while (i8 < size4) {
                String str8 = str6;
                String str9 = str7;
                djc djc6 = (djc) a6.get(i8);
                boolean z9 = djc6.f13312d;
                if (!z9) {
                    okVar3 = okVar6;
                } else {
                    okVar3 = okVar7;
                }
                if (!z9) {
                    okVar4 = okVar8;
                } else {
                    okVar4 = okVar10;
                }
                qng.mo24130b(djc6);
                int a7 = okVar4.mo15616a(qng);
                if (a7 < 0 && !djc6.f13312d) {
                    okVar4 = okVar9;
                    i5 = okVar9.mo15616a(qng);
                } else {
                    i5 = a7;
                }
                if (i5 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bmzs.m108698a(z5);
                okVar3.put((qng) okVar4.mo15620b(i5), (String) okVar4.mo15621c(i5));
                i8++;
                str6 = str8;
                values = values;
                str7 = str9;
            }
            C1223np npVar = new C1223np(values.size());
            boolean a8 = qnq.mo24137a();
            Iterator it4 = values.iterator();
            while (it4.hasNext()) {
                qmk qmk4 = (qmk) it4.next();
                String str10 = ((bojy) qmk4.f41707a.get(0)).f133370b;
                bxvd da = qmk.f41705d.mo74144da();
                bojy bojy2 = (bojy) qmk4.f41707a.get(0);
                String str11 = bojy2.f133370b;
                C1225nr nrVar = new C1225nr(qmk4.f41709c.size());
                int i9 = 0;
                while (i9 < okVar6.f26809h) {
                    boolean z10 = a8;
                    Iterator it5 = it4;
                    if (str11.equals(okVar6.mo15621c(i9))) {
                        nrVar.add((qng) okVar6.mo15620b(i9));
                    }
                    i9++;
                    it4 = it5;
                    a8 = z10;
                }
                C1225nr nrVar2 = new C1225nr();
                qng qng2 = new qng();
                while (true) {
                    bxwc bxwc7 = qmk4.f41708b;
                    int size5 = bxwc7.size();
                    int i10 = 0;
                    boolean z11 = true;
                    while (i10 < size5) {
                        Iterator it6 = it4;
                        qmt qmt = (qmt) bxwc7.get(i10);
                        if (nrVar2.contains(qmt)) {
                            z3 = a8;
                            okVar2 = okVar6;
                            bxwc2 = bxwc7;
                            i2 = size5;
                        } else {
                            if (!a8) {
                                z3 = a8;
                                if (qmt.f41738c.size() == 0) {
                                    z4 = true;
                                    bxwc2 = bxwc7;
                                    bxwc3 = qmt.f41738c;
                                    i2 = size5;
                                    size = bxwc3.size();
                                    okVar2 = okVar6;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            bxwc4 = bxwc3;
                                            qng2.mo24131b((djd) bxwc3.get(i3));
                                            i3++;
                                            if (nrVar.contains(qng2)) {
                                                break;
                                            }
                                            bxwc3 = bxwc4;
                                        } else if (!z4) {
                                        }
                                    }
                                    nrVar2.add(qmt);
                                    bxwc bxwc8 = qmt.f41738c;
                                    size2 = bxwc8.size();
                                    for (i4 = 0; i4 < size2; i4++) {
                                        nrVar.add(qng.m32487a((djd) bxwc8.get(i4)));
                                    }
                                    z11 = false;
                                }
                            } else {
                                z3 = a8;
                            }
                            z4 = false;
                            bxwc2 = bxwc7;
                            bxwc3 = qmt.f41738c;
                            i2 = size5;
                            size = bxwc3.size();
                            okVar2 = okVar6;
                            i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                }
                                bxwc3 = bxwc4;
                            }
                            nrVar2.add(qmt);
                            bxwc bxwc82 = qmt.f41738c;
                            size2 = bxwc82.size();
                            while (i4 < size2) {
                            }
                            z11 = false;
                        }
                        i10++;
                        it4 = it6;
                        a8 = z3;
                        bxwc7 = bxwc2;
                        size5 = i2;
                        okVar6 = okVar2;
                    }
                    z = a8;
                    it = it4;
                    okVar = okVar6;
                    if (z11) {
                        break;
                    }
                    it4 = it;
                    a8 = z;
                    okVar6 = okVar;
                }
                if (!nrVar2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(nrVar2);
                    Collections.sort(arrayList2, f41782a);
                    da.mo73941E(arrayList2);
                }
                int size6 = qmk4.f41709c.size();
                if (size6 <= 0) {
                    list = bngx.m109376e();
                    z2 = false;
                } else {
                    ArrayList arrayList3 = new ArrayList(size6);
                    ArrayList arrayList4 = new ArrayList(size6);
                    bxwc bxwc9 = qmk4.f41709c;
                    int size7 = bxwc9.size();
                    int i11 = 0;
                    z2 = false;
                    while (i11 < size7) {
                        djc djc7 = (djc) bxwc9.get(i11);
                        qng2.mo24130b(djc7);
                        if (!nrVar.contains(qng2)) {
                            bxwc = bxwc9;
                            if (djc7.f13312d && str11.equals(okVar7.get(qng2))) {
                                arrayList3.add(djc7);
                            }
                        } else {
                            bxwc = bxwc9;
                            if (djc7.f13312d) {
                                bxvd bxvd3 = (bxvd) djc7.mo74142c(5);
                                bxvd3.mo73625a((GeneratedMessageLite) djc7);
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                djc djc8 = (djc) bxvd3.f164949b;
                                djc djc9 = djc.f13307f;
                                djc8.f13309a |= 4;
                                djc8.f13312d = false;
                                djc7 = (djc) bxvd3.mo74062i();
                                arrayList4.add(djc7.f13310b);
                            }
                            arrayList3.add(djc7);
                            z2 = true;
                        }
                        i11++;
                        bxwc9 = bxwc;
                    }
                    Collections.sort(arrayList3, dgk.f13059a);
                    da.mo73937C(arrayList3);
                    list = arrayList4;
                }
                if (z2 || !nrVar2.isEmpty() || m32504a(bojy2, false)) {
                    Collections.sort(list);
                    bxvd bxvd4 = (bxvd) bojy2.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) bojy2);
                    bojx bojx = (bojx) bxvd4;
                    if (bojx.f164950c) {
                        bojx.mo74035c();
                        bojx.f164950c = false;
                    }
                    bojy bojy3 = bojy.f133367g;
                    ((bojy) bojx.f164949b).f133374f = GeneratedMessageLite.m124030de();
                    bojx.mo68914a(list);
                    da.mo73996a(bojx);
                }
                npVar.put(str10, (qmk) da.mo74062i());
                it4 = it;
                a8 = z;
                okVar6 = okVar;
            }
            qmk qmk5 = (qmk) npVar.remove(str7);
            if (qmk5 == null) {
                qmk5 = (qmk) npVar.remove("container-missing");
            }
            if (qmk5 != null) {
                Collection<qmk> values2 = npVar.values();
                int i12 = 0;
                int i13 = 0;
                for (qmk qmk6 : values2) {
                    i12 += qmk6.f41707a.size();
                    i13 += qmk6.f41708b.size();
                }
                bngs b2 = bngx.m109371b(i12 + 1);
                bnha a9 = bnhe.m109406a(qmk5.f41708b.size() + i13);
                bnia c = bnic.m109499c(qmk5.f41708b.size());
                bnia c2 = bnic.m109499c(i13);
                bngs b3 = bngx.m109371b(values2.size() + 1);
                b2.mo67668c((bojy) qmk5.f41707a.get(0));
                b3.mo67668c(qmk5.f41709c);
                bxwc bxwc10 = qmk5.f41708b;
                int size8 = bxwc10.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    qmt qmt2 = (qmt) bxwc10.get(i14);
                    dhs a10 = m32494a(qmt2);
                    a9.mo67695b(a10, qmt2);
                    c.mo67629b(a10);
                }
                for (qmk qmk7 : values2) {
                    b2.mo67666b((Iterable) qmk7.f41707a);
                    b3.mo67668c(qmk7.f41709c);
                    bxwc bxwc11 = qmk7.f41708b;
                    int size9 = bxwc11.size();
                    for (int i15 = 0; i15 < size9; i15++) {
                        qmt qmt3 = (qmt) bxwc11.get(i15);
                        dhs a11 = m32494a(qmt3);
                        a9.mo67695b(a11, qmt3);
                        c2.mo67629b(a11);
                    }
                }
                return new qnl(dky.m8765b(b2.mo67664a(), dhz.f13197a), dgk.m8395a(b3.mo67664a()), a9.mo67618b(), c.mo67751a(), c2.mo67751a());
            }
            throw new InvalidConfigException(str6);
        }
        String str12 = str;
        String str13 = str2;
        qmk qmk8 = (qmk) map2.get(str13);
        if (qmk8 != null) {
            if (qmk8 == qmk2) {
                i = 0;
            } else if (!m32507a(qmk8, 64)) {
                bxvd bxvd5 = (bxvd) qmk8.mo74142c(5);
                bxvd5.mo73625a((GeneratedMessageLite) qmk8);
                if (!bxvd5.f164950c) {
                    i = 0;
                } else {
                    bxvd5.mo74035c();
                    i = 0;
                    bxvd5.f164950c = false;
                }
                ((qmk) bxvd5.f164949b).f41709c = GeneratedMessageLite.m124030de();
                bxvd5.mo73937C(dgk.m8400c(bngx.m109357a(qmk2.f41709c, qmk8.f41709c)));
                qmk8 = (qmk) bxvd5.mo74062i();
                map2.put(str13, qmk8);
            } else {
                i = 0;
            }
            qmk a12 = qnn.m32513a(map.values(), qnq2);
            qmk a13 = qnn.m32514a(a12, qnn.m32513a(Collections.singleton(qmk8), qnq2));
            qmk a14 = qnn.m32514a(a12, a13);
            bnha a15 = bnhe.m109406a(a14.f41708b.size() + a13.f41708b.size());
            bnia c3 = bnic.m109499c(a14.f41708b.size());
            bnia c4 = bnic.m109499c(a13.f41708b.size());
            bxwc bxwc12 = a14.f41708b;
            int size10 = bxwc12.size();
            for (int i16 = 0; i16 < size10; i16++) {
                qmt qmt4 = (qmt) bxwc12.get(i16);
                dhs a16 = m32494a(qmt4);
                a15.mo67695b(a16, qmt4);
                c3.mo67629b(a16);
            }
            bxwc bxwc13 = a13.f41708b;
            int size11 = bxwc13.size();
            while (i < size11) {
                qmt qmt5 = (qmt) bxwc13.get(i);
                dhs a17 = m32494a(qmt5);
                a15.mo67695b(a17, qmt5);
                c4.mo67629b(a17);
                i++;
            }
            return new qnl(dky.m8765b(new qnh(a14, a13), dhz.f13197a), dky.m8765b(new qni(a14, a13), dgk.f13059a), a15.mo67618b(), c3.mo67751a(), c4.mo67751a());
        }
        throw new InvalidConfigException(str12);
    }

    /* renamed from: a */
    public static void m32500a(Context context, Collection collection, int i, boolean z) {
        qox qox = new qox();
        if (z) {
            qox.mo24185b();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qox.mo24183a((qmk) it.next(), i);
        }
        qox.mo24179a(context);
    }

    /* renamed from: a */
    public static void m32501a(Context context, Collection collection, Collection collection2) {
        dhs a;
        if (!collection.isEmpty() && cdjh.f180979a.mo6606a().mo77758w()) {
            bndu a2 = bndu.m109108a(collection.size(), 1);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                qnc qnc = (qnc) it.next();
                a2.mo67268a(qnc.f41759a, qnc);
            }
            bnhp b = bnht.m109442b();
            for (String str : f41784c.mo66918a((CharSequence) cdjh.f180979a.mo6606a().mo77739d())) {
                Iterator it2 = f41785d.mo66918a((CharSequence) str).iterator();
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!it2.hasNext()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
                        sb.append("Blacklisted diffbase module specification ");
                        sb.append(str);
                        sb.append(" doesn't include a version.");
                        Log.w("ModuleSetUtils", sb.toString());
                    } else {
                        b.mo67730b(str2, (String) it2.next());
                    }
                }
            }
            bnht c = b.mo67731c();
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                dgl dgl = (dgl) it3.next();
                dhs dhs = dgl.f13189i;
                if (dhs != null) {
                    if (c.mo67271d(dhs.f13182a)) {
                        bnrd a3 = c.mo67692g(dhs.f13182a).iterator();
                        while (true) {
                            if (!a3.hasNext()) {
                                break;
                            }
                            String str3 = (String) a3.next();
                            if (str3.equals("*")) {
                                break;
                            } else if (str3.contains("*")) {
                                int indexOf = str3.indexOf(42);
                                if (dhs.f13183b.startsWith(str3.substring(0, indexOf)) && indexOf + 6 == dhs.f13183b.length()) {
                                    break;
                                }
                            } else if (str3.equals(dhs.f13183b)) {
                                break;
                            }
                        }
                    }
                    for (qnc qnc2 : a2.mo67127c(dhs.f13182a)) {
                        if (m32505a(qnc2.f41760b, qnc2.f41762d, dhs.f13183b)) {
                            qnc2.f41762d = dhs.f13183b;
                            qnc2.f41763e = dgl.f13070d;
                        }
                    }
                }
            }
            String N = cdjh.f180979a.mo6606a().mo77734N();
            if (!N.isEmpty()) {
                for (String str4 : bmyx.m108640a(',').mo66918a((CharSequence) N)) {
                    String b2 = new dhc(context, 0, str4).mo8910b();
                    if (!(b2 == null || (a = dhs.m8523a(b2)) == null)) {
                        for (qnc qnc3 : a2.mo67127c(a.f13182a)) {
                            if (m32505a(qnc3.f41760b, qnc3.f41762d, a.f13183b)) {
                                qnc3.f41762d = a.f13183b;
                                qnc3.f41763e = b2;
                            }
                        }
                    }
                }
            }
            for (qnc qnc4 : a2.mo67317p()) {
                String str5 = qnc4.f41763e;
                if (str5 != null) {
                    String str6 = qnc4.f41759a;
                    String str7 = qnc4.f41760b;
                    StringBuilder sb2 = new StringBuilder(str5.length() + 20 + String.valueOf(str6).length() + String.valueOf(str7).length());
                    sb2.append("Use diff base ");
                    sb2.append(str5);
                    sb2.append(" for ");
                    sb2.append(str6);
                    sb2.append(":");
                    sb2.append(str7);
                    sb2.toString();
                } else {
                    String str8 = qnc4.f41759a;
                    String str9 = qnc4.f41760b;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 24 + String.valueOf(str9).length());
                    sb3.append("No diff base found for ");
                    sb3.append(str8);
                    sb3.append(":");
                    sb3.append(str9);
                    sb3.toString();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4.equals("container-only") != false) goto L_0x0021;
     */
    /* renamed from: a */
    public static boolean m32504a(bojy bojy, boolean z) {
        String str = bojy.f133370b;
        if (str.startsWith("container")) {
            if (str.length() == 9) {
                return true;
            }
            if (z) {
            }
        }
        if (!str.startsWith("container-missing")) {
            return false;
        }
        if (str.length() == 17) {
            return true;
        }
        if (!z || !str.equals("container-missing-only")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m32505a(String str, String str2, String str3) {
        try {
            long parseLong = Long.parseLong(str);
            long parseLong2 = Long.parseLong(str3);
            if (str2 == null) {
                return true;
            }
            return Math.abs(parseLong - parseLong2) < Math.abs(parseLong - Long.parseLong(str2));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m32506a(C1245ok okVar, qng qng, String str, boolean z) {
        if (z && okVar.get(qng) != null) {
            return false;
        }
        okVar.put(qng, str);
        return true;
    }

    /* renamed from: a */
    public static boolean m32507a(qmk qmk, int i) {
        return m32503a((bojy) qmk.f41707a.get(0), i);
    }

    /* renamed from: a */
    public static boolean m32508a(qmk qmk, qmk qmk2) {
        return m32502a(((bojy) qmk.f41707a.get(0)).f133373e, ((bojy) qmk2.f41707a.get(0)).f133373e);
    }

    /* renamed from: a */
    public static boolean m32509a(qmk qmk, qox qox) {
        if ((((bojy) qmk.f41707a.get(0)).f133372d & -65536) != 0) {
            qox.mo24183a(qmk, 15);
            return false;
        } else if (qmk.f41707a.size() != 1) {
            String valueOf = String.valueOf(m32510b(bngx.m109356a(qmk)));
            Log.e("ModuleSetUtils", valueOf.length() == 0 ? new String("Malformed module set. Expecting exactly one ChimeraModuleSetInfo entry:") : "Malformed module set. Expecting exactly one ChimeraModuleSetInfo entry:".concat(valueOf));
            qox.mo24183a(qmk, 12);
            return false;
        } else if (!m32507a(qmk, 64)) {
            return true;
        } else {
            String valueOf2 = String.valueOf(m32510b(bngx.m109356a(qmk)));
            Log.e("ModuleSetUtils", valueOf2.length() == 0 ? new String("Rejecting server module set with TARGETING_TYPE_LOCAL:") : "Rejecting server module set with TARGETING_TYPE_LOCAL:".concat(valueOf2));
            qox.mo24183a(qmk, 11);
            return false;
        }
    }
}
