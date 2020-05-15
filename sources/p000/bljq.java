package p000;

import android.os.Build;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bljq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bljq implements bljn {

    /* renamed from: a */
    public static final bnrt f126688a = bnrt.m110178a("bljq");

    /* renamed from: b */
    public final ayte f126689b;

    /* renamed from: c */
    public final bqgk f126690c;

    /* renamed from: d */
    public final ConcurrentMap f126691d = new ConcurrentHashMap(2, 0.75f, 1);

    /* renamed from: e */
    public final AtomicLong f126692e = new AtomicLong(2100000);

    /* renamed from: f */
    public final int f126693f;

    /* renamed from: g */
    private final blii f126694g;

    /* renamed from: h */
    private final cijl f126695h;

    /* renamed from: i */
    private final blkc f126696i;

    /* renamed from: j */
    private final blir f126697j;

    public bljq(blii blii, ayte ayte, bqgk bqgk, cijl cijl, blkc blkc, blir blir, bmxv bmxv) {
        this.f126694g = blii;
        this.f126689b = ayte;
        this.f126690c = bqgk;
        this.f126695h = cijl;
        this.f126696i = blkc;
        this.f126697j = blir;
        this.f126693f = (!bmxv.mo66813a() || ((Integer) bmxv.mo66814b()).intValue() <= 0) ? 500 : ((Integer) bmxv.mo66814b()).intValue();
    }

    /* renamed from: a */
    private final void m107257a(blkk blkk) {
        blim blim = blkk.f126740d.f126720g;
        if (blim == null) {
            blim = blim.f126629d;
        }
        long b = this.f126689b.mo54418b() - blkk.f126739c;
        bljz bljz = blkk.f126740d;
        bxvd bxvd = (bxvd) bljz.mo74142c(5);
        bxvd.mo73625a((bxvk) bljz);
        bxvd bxvd2 = (bxvd) blim.mo74142c(5);
        bxvd2.mo73625a((bxvk) blim);
        bxvd da = blik.f126620d.mo74144da();
        int i = blkk.f126742f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blik blik = (blik) da.f164949b;
        int i2 = blik.f126622a | 2;
        blik.f126622a = i2;
        blik.f126624c = i;
        blik.f126622a = i2 | 1;
        blik.f126623b = b;
        blik blik2 = (blik) da.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        blim blim2 = (blim) bxvd2.f164949b;
        blik2.getClass();
        blim2.f126633c = blik2;
        blim2.f126631a |= 2;
        blim blim3 = (blim) bxvd2.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bljz bljz2 = (bljz) bxvd.f164949b;
        bljz bljz3 = bljz.f126712i;
        blim3.getClass();
        bljz2.f126720g = blim3;
        bljz2.f126714a |= 16;
        bljz bljz4 = (bljz) bxvd.mo74062i();
        int size = bljz4.f126717d.size() - 1;
        Iterator it = bnkn.m109666a((List) bljz4.f126717d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bliz bliz = (bliz) it.next();
            int i3 = bliz.f126649a;
            if ((i3 & 16) == 0 && (i3 & 4) != 0) {
                size = bliz.f126651c;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            String str = "";
            if (size >= 0) {
                bliz bliz2 = (bliz) bljz4.f126717d.get(size);
                int i5 = (int) bliz2.f126653e;
                String valueOf = String.valueOf(bliz2.f126650b);
                if ((bliz2.f126649a & 16) == 0) {
                    str = " (Timed Out)";
                }
                arrayList.add(new StackTraceElement("tk_trace", str.length() == 0 ? new String(valueOf) : valueOf.concat(str), "Started After", (i5 - i4) / 1000));
                size = ((bliz) bljz4.f126717d.get(size)).f126652d;
                i4 = i5;
            } else {
                bnrq bnrq = (bnrq) f126688a.mo68387b();
                bnrq.mo68437a(new blkd(str, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                bnrq.mo68432a("bljq", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68425a("Trace %s timed out after %d ms. Complete trace: %s", blkk.f126737a, Long.valueOf(b), bljz4);
                mo66598a(bljz4, blkk.f126741e, blkk.f126737a);
                return;
            }
        }
    }

    /* renamed from: a */
    public final bljg mo66584a(String str, bljf bljf, int i, int i2) {
        long j;
        String str2 = str;
        int i3 = i2;
        long a = this.f126689b.mo54417a();
        long b = this.f126689b.mo54418b();
        bljg b2 = blkh.m107292b();
        if (b2 != null) {
            blkh.m107290a(b2, str2);
        }
        blir blir = this.f126697j;
        UUID uuid = new UUID((blir.mo66579a() & -61441) ^ blir.f126635a.getMostSignificantBits(), (blir.mo66579a() >>> 2) ^ blir.f126635a.getLeastSignificantBits());
        boolean a2 = blkb.m107276a(uuid.getLeastSignificantBits(), this.f126696i.f126723a);
        bxvd da = bljz.f126712i.mo74144da();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bljz bljz = (bljz) da.f164949b;
        bljz.f126714a |= 2;
        bljz.f126716c = leastSignificantBits;
        long mostSignificantBits = uuid.getMostSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bljz bljz2 = (bljz) da.f164949b;
        int i4 = bljz2.f126714a | 1;
        bljz2.f126714a = i4;
        bljz2.f126715b = mostSignificantBits;
        int i5 = i4 | 4;
        bljz2.f126714a = i5;
        bljz2.f126718e = a;
        int i6 = i5 | 8;
        bljz2.f126714a = i6;
        bljz2.f126719f = b;
        int i7 = i3 - 1;
        if (i3 != 0) {
            bljz2.f126721h = i7;
            bljz2.f126714a = i6 | 32;
            bljz bljz3 = (bljz) da.mo74062i();
            if (i3 != 2) {
                j = this.f126689b.mo54419c();
            } else {
                j = b;
            }
            blkj blkj = new blkj(str2, bljf, i);
            blkl blkl = new blkl(this, uuid, bljz3, blkj, j, a2);
            UUID uuid2 = uuid;
            blix blix = new blix(blkj, uuid, blkl, this.f126689b, j, a2, i3 == 3);
            blii blii = this.f126694g;
            bmxy.m108581a(blix);
            if (blii.f126616d.compareAndSet(false, true)) {
                blii.f126615c.execute(new blif(blii));
            }
            blih blih = new blih(blix, blii.f126614b);
            blii.f126613a.put(blih, Boolean.TRUE);
            blig blig = blih.f126612a;
            bqgk bqgk = this.f126690c;
            blkl.f126746d = blig;
            blig.mo741a(blkl, bqgk);
            this.f126691d.put(uuid2, blkl);
            blkh.m107293b(blix);
            return blix;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo66598a(bljz bljz, SparseArray sparseArray, String str) {
        RuntimeException runtimeException;
        bljg b = blkh.m107292b();
        blkh.m107293b(bliu.m107218b(str, blje.f126668a));
        try {
            runtimeException = null;
            for (bljm bljm : (Set) this.f126695h.mo6445a()) {
                bljm.mo16707a(bljz, sparseArray);
            }
            if (runtimeException == null) {
                blkh.m107293b(b);
                return;
            }
            throw runtimeException;
        } catch (RuntimeException e) {
            if (runtimeException != null) {
                int i = Build.VERSION.SDK_INT;
                bqye.m113761a(runtimeException, e);
            } else {
                runtimeException = e;
            }
        } catch (Throwable th) {
            blkh.m107293b(b);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66599a(bqgg bqgg, blkk blkk) {
        blkk blkk2 = blkk;
        bmxy.m108600b(this.f126691d.remove(blkk2.f126738b) != null);
        if (!bqgg.isCancelled()) {
            try {
                bqga.m112780a((Future) bqgg);
                long j = blkk2.f126739c;
                while (true) {
                    long j2 = this.f126692e.get();
                    if (j <= j2) {
                        break;
                    } else if (this.f126692e.compareAndSet(j2, 300000 + j)) {
                        long j3 = j - 2100000;
                        for (blkl blkl : this.f126691d.values()) {
                            if (blkl.f126744b < j3) {
                                bqgi a = this.f126690c.mo25814a(bljo.f126686a, 10, TimeUnit.SECONDS);
                                blkl.getClass();
                                a.mo741a(new bljp(blkl), bqfb.INSTANCE);
                            }
                        }
                    }
                }
                mo66598a(blkk2.f126740d, blkk2.f126741e, blkk2.f126737a);
            } catch (ExecutionException e) {
                bnrq bnrq = (bnrq) f126688a.mo68387b();
                bnrq.mo68437a(e.getCause());
                bnrq.mo68432a("bljq", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68420a("Trace %s failed collection", blkk2.f126737a);
            }
        } else {
            blim blim = blkk2.f126740d.f126720g;
            if (blim == null) {
                blim = blim.f126629d;
            }
            long b = this.f126689b.mo54418b() - blkk2.f126739c;
            bljz bljz = blkk2.f126740d;
            bxvd bxvd = (bxvd) bljz.mo74142c(5);
            bxvd.mo73625a((bxvk) bljz);
            bxvd bxvd2 = (bxvd) blim.mo74142c(5);
            bxvd2.mo73625a((bxvk) blim);
            bxvd da = blik.f126620d.mo74144da();
            int i = blkk2.f126742f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blik blik = (blik) da.f164949b;
            int i2 = blik.f126622a | 2;
            blik.f126622a = i2;
            blik.f126624c = i;
            blik.f126622a = 1 | i2;
            blik.f126623b = b;
            blik blik2 = (blik) da.mo74062i();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            blim blim2 = (blim) bxvd2.f164949b;
            blik2.getClass();
            blim2.f126633c = blik2;
            blim2.f126631a |= 2;
            blim blim3 = (blim) bxvd2.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bljz bljz2 = (bljz) bxvd.f164949b;
            bljz bljz3 = bljz.f126712i;
            blim3.getClass();
            bljz2.f126720g = blim3;
            bljz2.f126714a |= 16;
            bljz bljz4 = (bljz) bxvd.mo74062i();
            int size = bljz4.f126717d.size() - 1;
            Iterator it = bnkn.m109666a((List) bljz4.f126717d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bliz bliz = (bliz) it.next();
                int i3 = bliz.f126649a;
                if ((i3 & 16) == 0 && (i3 & 4) != 0) {
                    size = bliz.f126651c;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (true) {
                String str = "";
                if (size >= 0) {
                    bliz bliz2 = (bliz) bljz4.f126717d.get(size);
                    int i5 = (int) bliz2.f126653e;
                    String valueOf = String.valueOf(bliz2.f126650b);
                    if ((bliz2.f126649a & 16) == 0) {
                        str = " (Timed Out)";
                    }
                    arrayList.add(new StackTraceElement("tk_trace", str.length() == 0 ? new String(valueOf) : valueOf.concat(str), "Started After", (i5 - i4) / 1000));
                    size = ((bliz) bljz4.f126717d.get(size)).f126652d;
                    i4 = i5;
                } else {
                    bnrq bnrq2 = (bnrq) f126688a.mo68387b();
                    bnrq2.mo68437a(new blkd(str, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                    bnrq2.mo68432a("bljq", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68425a("Trace %s timed out after %d ms. Complete trace: %s", blkk2.f126737a, Long.valueOf(b), bljz4);
                    mo66598a(bljz4, blkk2.f126741e, blkk2.f126737a);
                    return;
                }
            }
        }
    }
}
