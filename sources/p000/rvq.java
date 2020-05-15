package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: rvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvq {

    /* renamed from: a */
    public static final /* synthetic */ int f43776a = 0;

    /* renamed from: b */
    private static final Map f43777b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: a */
    public static final ruf m34531a() {
        return new ruf();
    }

    /* renamed from: b */
    public final void mo25210b(rvl rvl) {
        new rvp(false, ruo.m34494a(new rvm(this, rvl)));
    }

    /* renamed from: a */
    public static void m34532a(rvo rvo) {
        f43777b.put(rvo.getClass().getName(), rvo);
    }

    /* renamed from: a */
    public static boolean m34533a(List list, rvl rvl) {
        Throwable e;
        int size = list.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2 = true;
            try {
                if (((rvh) ((bqgg) list.get(i)).get()).f43739b && cdkp.m133842i()) {
                    try {
                        rvw.m34541a(TimeUnit.SECONDS.toMillis(cdkp.f181122a.mo6606a().mo77802E()), rvl);
                        z = true;
                    } catch (InterruptedException | CancellationException | ExecutionException e2) {
                        e = e2;
                        Log.e("FixerFramework", "applyFixes future failed", e);
                        Thread.currentThread().interrupt();
                        z = z2;
                        i++;
                    }
                    i++;
                } else {
                    i++;
                }
            } catch (InterruptedException | CancellationException | ExecutionException e3) {
                z2 = z;
                e = e3;
                Log.e("FixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
                z = z2;
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0270, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025c A[SYNTHETIC, Splitter:B:138:0x025c] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x027a A[SYNTHETIC, Splitter:B:158:0x027a] */
    /* renamed from: a */
    public final rvp mo25209a(rvl rvl) {
        rvl rvl2;
        boolean z;
        ruf ruf;
        rvl rvl3;
        rvl rvl4;
        ruf ruf2;
        bqgg bqgg;
        ArrayList arrayList;
        rvi rvi;
        bqgg bqgg2;
        HashMap hashMap;
        bngx bngx;
        if (!cdkp.f181122a.mo6606a().mo77823j()) {
            return new rvp(false, bqga.m112775a((Object) null));
        }
        try {
            bngs bngs = new bngs();
            synchronized (f43777b) {
                try {
                    for (rvo rvo : f43777b.values()) {
                        bngs.mo67668c(rvo.mo25187a());
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            bngx<rvj> a = bngs.mo67664a();
            ArrayList arrayList2 = new ArrayList(a.size());
            try {
                if (cdng.m134178e()) {
                    for (rvj rvj : a) {
                        rvl4 = rvl;
                        try {
                            if (rvj.mo25197a(rvl4)) {
                                ruf2 = m34531a();
                                rvl2 = rvl4;
                            }
                        } catch (RuntimeException e) {
                            e = e;
                            ruf2 = null;
                            try {
                                rvc.m34510a(e, rvl4.f43760b, rvl4.f43759a, "FixerFramework");
                                rvp rvp = new rvp(false, bqga.m112775a((Object) null));
                                if (ruf2 != null) {
                                    try {
                                        ruf2.close();
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return rvp;
                            } catch (Throwable th3) {
                                th = th3;
                                ruf = ruf2;
                                rvl2 = rvl4;
                                z = false;
                                if (ruf != null) {
                                    try {
                                        ruf.close();
                                    } catch (Throwable th4) {
                                        Throwable th5 = th4;
                                        if (z && cdkp.m133842i()) {
                                            rvw.m34543a(rvl2);
                                        }
                                        throw th5;
                                    }
                                }
                                if (z && cdkp.m133842i()) {
                                    rvw.m34543a(rvl2);
                                }
                                throw th;
                            }
                        }
                    }
                    return new rvp(false, bqga.m112775a((Object) null));
                }
                rvl4 = rvl;
                ruf2 = m34531a();
                try {
                    List a2 = ruf2.mo25176a();
                    rvk d = rvl.mo25205d();
                    if (a2 != null) {
                        bngx = bngx.m109368a((Collection) a2);
                    } else {
                        bngx = null;
                    }
                    d.f43752d = bngx;
                    rvl2 = d.mo25198a();
                } catch (RuntimeException e2) {
                    e = e2;
                    rvc.m34510a(e, rvl4.f43760b, rvl4.f43759a, "FixerFramework");
                    rvp rvp2 = new rvp(false, bqga.m112775a((Object) null));
                    if (ruf2 != null) {
                    }
                    return rvp2;
                }
                try {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (rvj rvj2 : a) {
                        rvk d2 = rvl2.mo25205d();
                        d2.f43756h = rvj2;
                        rvl a3 = d2.mo25198a();
                        if (rvj2.mo25197a(a3)) {
                            HashSet<rvd> hashSet = new HashSet(rvj2.f43744c.size());
                            HashMap hashMap2 = new HashMap();
                            String str = rvj2.f43742a;
                            bngs j = bngx.m109377j();
                            for (int i = 0; i < a3.mo25204b().size(); i++) {
                                ruk ruk = (ruk) a3.mo25204b().get(i);
                                if (ruk.f43702a.equals(str)) {
                                    j.mo67668c(ruk);
                                }
                            }
                            bngx a4 = j.mo67664a();
                            int i2 = 0;
                            while (i2 < a4.size()) {
                                ruk ruk2 = (ruk) a4.get(i2);
                                hashMap2.put(ruk2.f43704c, Long.valueOf(ruk2.f43706e));
                                i2++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            bnre i3 = rvj2.f43744c.listIterator();
                            while (i3.hasNext()) {
                                rvd rvd = (rvd) i3.next();
                                try {
                                    if (rvd.mo25188a(a3)) {
                                        Long l = (Long) hashMap2.get(rvd.f43726a);
                                        if (l != null) {
                                            hashMap = hashMap2;
                                            if (l.longValue() > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                                                hashMap2 = hashMap;
                                            }
                                        } else {
                                            hashMap = hashMap2;
                                        }
                                        hashSet.add(rvd);
                                        hashMap2 = hashMap;
                                    }
                                } catch (RuntimeException e3) {
                                    rvc.m34511a(e3, a3, rvd.f43726a);
                                    hashMap2 = hashMap2;
                                }
                            }
                            if (hashSet.isEmpty()) {
                                rvi = new rvi(false, bqga.m112775a(rvh.f43738a));
                            } else {
                                for (rvd rvd2 : hashSet) {
                                    rvk d3 = a3.mo25205d();
                                    d3.mo25201a(new rve(rvd2.f43726a, 2));
                                    a3 = d3.mo25198a();
                                    rvj2.mo25195a(a3, rvd2, ruf2);
                                }
                                if (rvj2.f43745d) {
                                    bqgg2 = ruo.m34495a(new rvf(rvj2, a3, ruf2, hashSet));
                                } else {
                                    bqgg2 = bqga.m112775a(rvj2.mo25194a(a3, ruf2, hashSet));
                                }
                                rvi = new rvi(true, bqgg2);
                            }
                        } else {
                            arrayList = arrayList2;
                            rvi = new rvi(false, bqga.m112775a(rvh.f43738a));
                        }
                        if (rvi.f43740a) {
                            z3 = true;
                        }
                        if (!rvi.f43741b.isDone()) {
                            z2 = true;
                        }
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(rvi.f43741b);
                        arrayList2 = arrayList3;
                    }
                    ArrayList arrayList4 = arrayList2;
                    if (z2) {
                        try {
                            bqgg = ruo.m34494a(new rvn(arrayList4, rvl2, ruf2));
                            ruf = null;
                            z = false;
                        } catch (Throwable th6) {
                            th = th6;
                            ruf = null;
                            z = false;
                            if (ruf != null) {
                            }
                            rvw.m34543a(rvl2);
                            throw th;
                        }
                    } else {
                        try {
                            bqgg = bqga.m112775a((Object) null);
                            if (!cdkp.f181122a.mo6606a().mo77836w()) {
                                ruf = ruf2;
                                z = false;
                            } else {
                                z = m34533a(arrayList4, rvl2);
                                ruf = ruf2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            ruf = ruf2;
                            z = false;
                            if (ruf != null) {
                            }
                            rvw.m34543a(rvl2);
                            throw th;
                        }
                    }
                    try {
                        rvp rvp3 = new rvp(z3, bqgg);
                        if (ruf != null) {
                            try {
                                ruf.close();
                            } catch (Throwable th8) {
                                Throwable th9 = th8;
                                if (z && cdkp.m133842i()) {
                                    rvw.m34543a(rvl2);
                                }
                                throw th9;
                            }
                        }
                        if (z && cdkp.m133842i()) {
                            rvw.m34543a(rvl2);
                        }
                        return rvp3;
                    } catch (Throwable th10) {
                        th = th10;
                        if (ruf != null) {
                        }
                        rvw.m34543a(rvl2);
                        throw th;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                    rvl4 = rvl2;
                    rvc.m34510a(e, rvl4.f43760b, rvl4.f43759a, "FixerFramework");
                    rvp rvp22 = new rvp(false, bqga.m112775a((Object) null));
                    if (ruf2 != null) {
                    }
                    return rvp22;
                }
            } catch (RuntimeException e5) {
                e = e5;
                rvl4 = rvl;
                ruf2 = null;
                rvc.m34510a(e, rvl4.f43760b, rvl4.f43759a, "FixerFramework");
                rvp rvp222 = new rvp(false, bqga.m112775a((Object) null));
                if (ruf2 != null) {
                }
                return rvp222;
            }
        } catch (Throwable th11) {
            th = th11;
            rvl3 = rvl;
            rvl2 = rvl3;
            ruf = null;
            z = false;
            if (ruf != null) {
            }
            rvw.m34543a(rvl2);
            throw th;
        }
    }
}
