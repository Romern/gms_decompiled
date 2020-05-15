package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnd extends dez {

    /* renamed from: f */
    private static volatile qnd f41764f;

    /* renamed from: e */
    public final Object f41765e = new Object();

    /* renamed from: g */
    private qmk f41766g;

    public qnd(Context context) {
        super(context, "stored_modulesets.pb");
    }

    /* renamed from: a */
    public static int m32467a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            qmk qmk = ((qmm) ((qmn) list.get(i)).f41723a.get(0)).f41716b;
            if (qmk == null) {
                qmk = qmk.f41705d;
            }
            if (str.equals(((bojy) qmk.f41707a.get(0)).f133370b)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    static qmo m32474e() {
        bxvd da = qmo.f41724g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qmo qmo = (qmo) da.f164949b;
        qmo.f41726a |= 1;
        qmo.f41727b = 2;
        return (qmo) da.mo74062i();
    }

    /* renamed from: h */
    static final long m32475h() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: b */
    public final dky mo24124b(bnic bnic) {
        qmo d;
        if (mo8638b()) {
            Log.e("ModuleSetMgr", "not migrated with user locked");
            return null;
        }
        synchronized (this.f41765e) {
            d = mo24125d();
        }
        qnl a = mo24121a(d, qnm.m32491a(dgv.m8427a(this.f12990a).mo8990h()), bnic, bnic.isEmpty(), d.f41731f);
        if (a != null) {
            return a.f41777a;
        }
        return null;
    }

    /* renamed from: d */
    public final qmo mo24125d() {
        qmo qmo;
        File a = m32468a(this.f12991b);
        if (mo8639c()) {
            File a2 = m32468a(dft.m8317a(dge.m8385a(this.f12990a)));
            if (a2.exists()) {
                try {
                    dhb.m8475a(a2, a, new byte[8192]);
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Failed to migrate moduleset config: ");
                    sb.append(valueOf);
                    Log.w("ModuleSetMgr", sb.toString());
                }
                a2.delete();
            }
            this.f12993d = true;
        }
        if (!mo8637a() || a.exists()) {
            byte[] a3 = dft.m8323a(a);
            if (a3 != null) {
                try {
                    qmo = (qmo) bxvk.m124016a(qmo.f41724g, a3, bxus.m123743b());
                } catch (bxwf e2) {
                    String valueOf2 = String.valueOf(e2.getMessage());
                    Log.e("ModuleSetMgr", valueOf2.length() == 0 ? new String("Failed to read modulesets file: ") : "Failed to read modulesets file: ".concat(valueOf2));
                    qmo = null;
                }
                if (qmo != null) {
                    int i = qmo.f41727b;
                    if (i == 2) {
                        return qmo;
                    }
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("Discarding config with unexpected version ");
                    sb2.append(i);
                    sb2.toString();
                }
            }
            return m32474e();
        }
        qmo e3 = m32474e();
        mo24123a(e3);
        return e3;
    }

    /* renamed from: f */
    public final void mo24126f() {
        dgv.m8427a(this.f12990a).mo8989g();
        qmc.m32424a(false);
    }

    /* renamed from: g */
    public final synchronized qmk mo24127g() {
        qmk qmk;
        qmk = this.f41766g;
        if (qmk == null) {
            qmk a = qnm.m32498a(this.f12990a.getResources());
            if (a == null) {
                a = qnm.m32511b("container-missing");
            }
            this.f41766g = a;
            qmk = this.f41766g;
        }
        return qmk;
    }

    /* renamed from: a */
    private static final File m32468a(File file) {
        if (file != null) {
            return new File(file, "stored_modulesets.pb");
        }
        return new File("stored_modulesets.pb");
    }

    /* renamed from: a */
    public static C1223np m32469a(qnl qnl, Map map, bnic bnic) {
        C1223np npVar = new C1223np(((C1245ok) map).f26809h);
        for (qmk qmk : map.values()) {
            bojy bojy = (bojy) qmk.f41707a.get(0);
            npVar.put(bojy.f133370b, bojy);
        }
        dky dky = qnl.f41777a;
        int size = dky.size();
        for (int i = 0; i < size; i++) {
            bojy bojy2 = (bojy) dky.get(i);
            String str = bojy2.f133370b;
            if (!"container-missing".equals(str)) {
                qmk qmk2 = (qmk) map.get(str);
                bmzs.m108696a(qmk2);
                bnic j = qnl.f41779c.keySet();
                bxwc bxwc = qmk2.f41708b;
                int size2 = bxwc.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    dhs a = qnm.m32494a((qmt) bxwc.get(i2));
                    if (j.contains(a) && !bnic.contains(a)) {
                        break;
                    }
                    i2++;
                }
            }
            npVar.remove(bojy2.f133370b);
        }
        return npVar;
    }

    /* renamed from: a */
    public static qmk m32470a(qmk qmk, Map map) {
        qmk qmk2 = (qmk) map.get("container");
        if (qmk2 != null && !qnm.m32508a(qmk2, qmk)) {
            return qmk2;
        }
        map.put("container", qmk);
        return qmk;
    }

    /* renamed from: a */
    public static qnd m32471a(Context context) {
        qnd qnd = f41764f;
        if (qnd == null) {
            synchronized (qnd.class) {
                qnd = f41764f;
                if (qnd == null) {
                    qnd = new qnd(context);
                    f41764f = qnd;
                }
            }
        }
        return qnd;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
        if (r1 != 1) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
        if (r1 != 1) goto L_0x013c;
     */
    /* renamed from: a */
    public static final void m32472a(List list, bmxz bmxz, boolean z, Map map) {
        long j;
        int i;
        int i2;
        int i3;
        int a;
        long D = cdjl.f180997a.mo6606a().mo77690D();
        if (D != -1) {
            j = m32475h() - D;
        } else {
            j = Long.MAX_VALUE;
        }
        int a2 = qmq.m32457a((int) cdjl.f180997a.mo6606a().mo77703i());
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = qms.m32459a((int) cdjl.f180997a.mo6606a().mo77704j());
        if (a3 == 0) {
            a3 = 1;
        }
        int size = list.size();
        boolean z2 = false;
        int i4 = 0;
        while (i4 < size) {
            bxwc bxwc = ((qmn) list.get(i4)).f41723a;
            int size2 = bxwc.size();
            int i5 = 0;
            boolean z3 = z2;
            while (true) {
                if (i5 >= size2) {
                    i = size;
                    i2 = a2;
                    break;
                }
                qmm qmm = (qmm) bxwc.get(i5);
                if (!qmm.f41717c) {
                    if (!z || !qmm.f41718d) {
                        qmk qmk = qmm.f41716b;
                        if (qmk == null) {
                            qmk = qmk.f41705d;
                        }
                        if (!bmxz.mo6527a(qmk)) {
                            String str = ((bojy) qmk.f41707a.get(z3 ? 1 : 0)).f133370b;
                            qmk qmk2 = qmm.f41716b;
                            if (qmk2 == null) {
                                qmk2 = qmk.f41705d;
                            }
                            int i6 = 5;
                            bxvd bxvd = (bxvd) qmk2.mo74142c(5);
                            bxvd.mo73625a((bxvk) qmk2);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = z3;
                            }
                            ((qmk) bxvd.f164949b).f41708b = bxvk.m124030de();
                            qmk qmk3 = qmm.f41716b;
                            if (qmk3 == null) {
                                qmk3 = qmk.f41705d;
                            }
                            bxwc bxwc2 = qmk3.f41708b;
                            int size3 = bxwc2.size();
                            for (int i7 = z3; i7 < size3; i7++) {
                                qmt qmt = (qmt) bxwc2.get(i7);
                                bxvd bxvd2 = (bxvd) qmt.mo74142c(i6);
                                bxvd2.mo73625a((bxvk) qmt);
                                int a4 = qmq.m32457a(((qmt) bxvd2.f164949b).f41740e);
                                if (a4 == 0) {
                                    i3 = size;
                                } else {
                                    i3 = size;
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                qmt qmt2 = (qmt) bxvd2.f164949b;
                                qmt qmt3 = qmt.f41734g;
                                qmt2.f41740e = a2 - 1;
                                qmt2.f41736a |= 8;
                                int a5 = qms.m32459a(((qmt) bxvd2.f164949b).f41741f);
                                if (a5 == 0) {
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                qmt qmt4 = (qmt) bxvd2.f164949b;
                                qmt qmt5 = qmt.f41734g;
                                qmt4.f41741f = a3 - 1;
                                qmt4.f41736a |= 16;
                                int i8 = a2;
                                if (qmm.f41719e <= j && (a = qms.m32459a(((qmt) bxvd2.f164949b).f41741f)) != 0 && a == 3) {
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    qmt qmt6 = (qmt) bxvd2.f164949b;
                                    qmt qmt7 = qmt.f41734g;
                                    qmt6.f41740e = 3;
                                    qmt6.f41736a |= 8;
                                }
                                qmt qmt8 = (qmt) bxvd2.mo74062i();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                qmk qmk4 = (qmk) bxvd.f164949b;
                                qmt8.getClass();
                                qmk4.mo24111b();
                                qmk4.f41708b.add(qmt8);
                                a2 = i8;
                                size = i3;
                                i6 = 5;
                            }
                            i = size;
                            i2 = a2;
                            map.put(str, (qmk) bxvd.mo74062i());
                        }
                    }
                }
                i5++;
                a2 = a2;
                size = size;
                z3 = false;
            }
            i4++;
            a2 = i2;
            size = i;
            z2 = false;
        }
    }

    /* renamed from: a */
    public static boolean m32473a(qmk qmk, Collection collection) {
        bojy bojy = (bojy) qmk.f41707a.get(0);
        String str = bojy.f133370b;
        long j = bojy.f133373e;
        int i = bojy.f133372d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bojy bojy2 = (bojy) it.next();
            if (str.equals(bojy2.f133370b) && j == bojy2.f133373e && i == bojy2.f133372d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Collection mo24118a(bnic bnic) {
        Collection h = dgv.m8427a(this.f12990a).mo8990h();
        Set a = mo24119a(bnic, bnic.isEmpty(), qnm.m32491a(h));
        if (a != null) {
            qnm.m32501a(this.f12990a, a, h);
        }
        return a;
    }

    /* renamed from: a */
    public final Set mo24119a(bnic bnic, boolean z, bnic bnic2) {
        qmo d;
        if (mo8638b()) {
            Log.e("ModuleSetMgr", "not migrated with user locked");
            return null;
        }
        synchronized (this.f41765e) {
            d = mo24125d();
        }
        qnl a = mo24121a(d, bnic2, bnic, z, d.f41731f);
        if (a != null) {
            return qnm.m32497a(a, bnic2, !bnic.isEmpty());
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(android.content.Context, java.util.Collection, int, boolean):void
     arg types: [android.content.Context, java.util.Collection, int, int]
     candidates:
      qnm.a(ok, qng, java.lang.String, boolean):boolean
      qnm.a(android.content.Context, java.util.Collection, int, boolean):void */
    /* renamed from: a */
    public final qnl mo24120a(Map map, qnq qnq) {
        try {
            return qnm.m32499a(map, mo24127g(), qnq);
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Failed to merge module sets: ");
            sb.append(valueOf);
            Log.e("ModuleSetMgr", sb.toString());
            qlp.m32393a().mo8861a(this.f12990a, 22, "merge");
            qnm.m32500a(this.f12990a, map.values(), 4, true);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [dky, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* renamed from: a */
    public final qnl mo24121a(qmo qmo, bnic bnic, bnic bnic2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        qmo qmo2 = qmo;
        C1223np npVar = new C1223np();
        m32472a(qmo2.f41728c, qmw.f41744a, true, npVar);
        qmk a = m32470a(mo24127g(), npVar);
        if (!z2 || !cdjh.m133554d()) {
            z3 = false;
        } else {
            z3 = true;
        }
        qno qno = new qno(qmo, z2, bnic, bnic2, z3);
        qnl a2 = mo24120a(npVar, qno);
        if (a2 == null) {
            return null;
        }
        int i = 128;
        if (z) {
            C1223np a3 = m32469a(a2, npVar, bnic);
            C1223np npVar2 = new C1223np();
            m32472a(qmo2.f41728c, bmyd.ALWAYS_FALSE, true, npVar2);
            dky a4 = dky.m8762a((Iterable) a2.f41777a, dhz.f13198b);
            C1225nr nrVar = new C1225nr();
            C1225nr nrVar2 = new C1225nr();
            int i2 = 0;
            for (qmk qmk : npVar2.values()) {
                if (qnm.m32507a(qmk, i)) {
                    i2++;
                    String str = ((bojy) qmk.f41707a.get(0)).f133370b;
                    if (a3.containsKey(str)) {
                        nrVar.add((bojy) qmk.f41707a.get(0));
                    } else if (npVar.containsKey(str)) {
                        int a5 = a4.mo9239a((bojy) ((qmk) npVar.get(str)).f41707a.get(0));
                        if (a5 >= 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bmzs.m108698a(z4);
                        nrVar2.add((bojy) a4.get(a5));
                    }
                    i = 128;
                } else {
                    i = 128;
                }
            }
            if (nrVar.f26758b != i2) {
                npVar.clear();
                m32472a(qmo2.f41728c, new qmx(nrVar), true, npVar);
                qmk a6 = m32470a(mo24127g(), npVar);
                qnl a7 = mo24120a(npVar, qno);
                if (a7 == null) {
                    return null;
                }
                a = a6;
                a2 = a7;
            }
            if (!nrVar2.isEmpty()) {
                a2 = a2.mo24136a(nrVar2);
            }
        }
        Context context = this.f12990a;
        Collection<qmk> values = npVar.values();
        dky dky = a2.f41777a;
        qox qox = new qox();
        for (qmk qmk2 : values) {
            bxwc bxwc = qmk2.f41707a;
            int size = bxwc.size();
            for (int i3 = 0; i3 < size; i3++) {
                bojy bojy = (bojy) bxwc.get(i3);
                if (!dky.contains(bojy)) {
                    qox.mo24180a(bojy, 14);
                }
            }
        }
        qox.mo24179a(context);
        if (z2 && !qnm.m32507a(a, 128)) {
            if (cdjh.m133554d()) {
                Log.i("ModuleSetMgr", "Container features not yet downloaded are disabled.");
            } else {
                Log.i("ModuleSetMgr", "Discarding container Zapp APKs.");
                bnha a8 = bnhe.m109406a(a2.f41781e.size());
                bnrd a9 = a2.f41781e.iterator();
                while (a9.hasNext()) {
                    dhs dhs = (dhs) a9.next();
                    qmt qmt = (qmt) a2.f41779c.get(dhs);
                    bmzs.m108696a(qmt);
                    a8.mo67695b(dhs, qmt);
                }
                return new qnl(a2.f41777a, a2.f41778b, a8.mo67618b(), bnon.f131923a, a2.f41781e);
            }
        }
        return a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(java.io.File, dke, boolean):boolean
     arg types: [java.io.File, dke, int]
     candidates:
      dgv.a(dkw, boolean, dks):boolean
      dgv.a(java.util.Set, dks, boolean):boolean
      dgv.a(java.io.File, dke, boolean):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c9, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cb, code lost:
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r21).length() + 23) + java.lang.String.valueOf(r22).length());
        r5.append(r0);
        r5.append(":");
        r5.append(r2);
        r5.append(" ingested successfully");
        r5.toString();
        r3 = p000.qlp.m32393a();
        r5 = r20.f12990a;
        r8 = new java.lang.StringBuilder((java.lang.String.valueOf(r21).length() + 1) + java.lang.String.valueOf(r22).length());
        r8.append(r0);
        r8.append(":");
        r8.append(r2);
        r3.mo8861a(r5, 21, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x022a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo24122a(String str, String str2, File file) {
        long j;
        int i;
        String str3 = str;
        String str4 = str2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Processing download for module ");
        sb.append(str3);
        sb.append(":");
        sb.append(str4);
        sb.toString();
        long length = file.length();
        File d = dgv.m8427a(this.f12990a).mo8986d();
        if (d != null) {
            j = d.getUsableSpace();
        } else {
            j = 0;
        }
        if (j >= (((Long) qlk.f41653i.mo25081c()).longValue() * length) / 100) {
            dhs dhs = new dhs(str3, str4);
            dgv a = dgv.m8427a(this.f12990a);
            if (a.mo8638b()) {
                return false;
            }
            synchronized (dgv.f13087f) {
                try {
                    dkw b = dfq.m8315b();
                    File d2 = a.mo8986d();
                    boolean z = true;
                    if (d2 != null) {
                        if (d2.isDirectory()) {
                            try {
                                dke k = a.mo8993k();
                                bxvd bxvd = (bxvd) k.mo74142c(5);
                                bxvd.mo73625a((bxvk) k);
                                bxvd bxvd2 = bxvd;
                                a.mo8978a(bxvd, d2, new dfz(a.f12990a), (Set) null, b);
                                String builder = new Uri.Builder().scheme("download").appendPath(dhs.f13182a).appendPath(dhs.f13183b).toString();
                                bxvd da = dkd.f13379j.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                dkd dkd = (dkd) da.f164949b;
                                builder.getClass();
                                int i2 = dkd.f13381a | 1;
                                dkd.f13381a = i2;
                                dkd.f13382b = builder;
                                dkd.f13387g = 2;
                                dkd.f13381a = i2 | 16;
                                int binarySearch = Collections.binarySearch(Collections.unmodifiableList(((dke) bxvd2.f164949b).f13394c), (dkd) da.mo74062i(), dha.f13094c);
                                if (binarySearch >= 0) {
                                    dfq.m8314a();
                                    if (cdjh.f180979a.mo6606a().mo77736a()) {
                                        if (!bxvd2.mo74040d(binarySearch).f13384d) {
                                        }
                                    }
                                    String valueOf = String.valueOf(builder);
                                    Log.w("FileApkMgr", valueOf.length() == 0 ? new String("Ignoring attempt to re-stage previously ingested download: ") : "Ignoring attempt to re-stage previously ingested download: ".concat(valueOf));
                                }
                                if (binarySearch < 0) {
                                    i = dha.m8457a(bxvd2, binarySearch, (dkd) da.mo74062i());
                                } else {
                                    i = binarySearch;
                                }
                                String valueOf2 = String.valueOf(dhs);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
                                sb2.append("Staging: ");
                                sb2.append(valueOf2);
                                sb2.toString();
                                bxvd bxvd3 = da;
                                int i3 = i;
                                if (a.mo8982a(b, true, bxvd2, da, i, Collections.singletonList(new dgt(file, dhs)), d2, null)) {
                                    bxvd2.mo73968a(i3, (dkd) bxvd3.mo74062i());
                                    dha.m8467a(bxvd2);
                                    if (!a.mo8984a(a.f12991b, (dke) bxvd2.mo74062i(), true)) {
                                        Log.e("FileApkMgr", "Failed to write config file");
                                        dgd.m8383a(a.f12990a, 32, "fileapk");
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                } else {
                                    dgd.m8383a(a.f12990a, 46, dhs.toString());
                                    z = false;
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    }
                    Log.e("FileApkMgr", "Failed to get module files directory");
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } else {
            qlp.m32393a().mo8860a(this.f12990a, 35);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo24123a(qmo qmo) {
        byte[] k = qmo.mo73642k();
        File file = new File(this.f12991b, "pending_modulesets.pb");
        File a = m32468a(this.f12991b);
        new File(this.f12991b, "current_modulesets.pb").delete();
        boolean z = false;
        if (dft.m8316a(k, file, a, false) > 0) {
            z = true;
        }
        aytw.m84814b();
        if (z) {
            this.f12993d = true;
        }
        return z;
    }
}
