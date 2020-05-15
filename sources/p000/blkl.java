package p000;

import android.util.SparseArray;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: blkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blkl implements Runnable, bliw {

    /* renamed from: a */
    public final bljq f126743a;

    /* renamed from: b */
    public final long f126744b;

    /* renamed from: c */
    public final AtomicReference f126745c;

    /* renamed from: d */
    public bqgg f126746d;

    /* renamed from: e */
    int f126747e = 0;

    /* renamed from: f */
    private final UUID f126748f;

    /* renamed from: g */
    private final boolean f126749g;

    /* renamed from: h */
    private final bljz f126750h;

    public blkl(bljq bljq, UUID uuid, bljz bljz, blkj blkj, long j, boolean z) {
        this.f126743a = bljq;
        this.f126748f = uuid;
        this.f126750h = bljz;
        this.f126744b = j;
        this.f126749g = z;
        this.f126745c = new AtomicReference(blkj);
    }

    public final void run() {
        blkk blkk;
        int i;
        bljq bljq = this.f126743a;
        bqgg bqgg = this.f126746d;
        synchronized (this) {
            blkj blkj = (blkj) this.f126745c.get();
            int i2 = blkj.f126734e + 1;
            blkj[] blkjArr = new blkj[i2];
            while (blkj != null) {
                blkjArr[blkj.f126734e] = blkj;
                blkj = blkj.f126735f;
            }
            bljz bljz = this.f126750h;
            bxvd bxvd = (bxvd) bljz.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bljz);
            SparseArray sparseArray = new SparseArray(i2);
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                blkj blkj2 = blkjArr[i3];
                boolean z2 = this.f126749g;
                bxvd da = bliz.f126647i.mo74144da();
                String str = blkj2.f126731b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = z;
                }
                bliz bliz = (bliz) da.f164949b;
                str.getClass();
                int i5 = bliz.f126649a | 1;
                bliz.f126649a = i5;
                bliz.f126650b = str;
                int i6 = blkj2.f126734e;
                int i7 = i5 | 2;
                bliz.f126649a = i7;
                bliz.f126651c = i6;
                blkj blkj3 = blkj2.f126730a;
                if (blkj3 != null) {
                    i = blkj3.f126734e;
                } else {
                    i = -1;
                }
                int i8 = i7 | 4;
                bliz.f126649a = i8;
                bliz.f126652d = i;
                int i9 = i2;
                bliz.f126649a = i8 | 8;
                bliz.f126653e = (long) blkj2.f126732c;
                int i10 = blkj2.f126736g;
                if (i10 != 0) {
                    bmxy.m108600b(true);
                    long j = (long) (1073741823 & i10);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bliz bliz2 = (bliz) da.f164949b;
                    bliz2.f126649a |= 16;
                    bliz2.f126654f = j;
                    bmxy.m108600b(true);
                    boolean z3 = (i10 & JGCastService.FLAG_PRIVATE_DISPLAY) != 0;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bliz bliz3 = (bliz) da.f164949b;
                    bliz3.f126649a |= 64;
                    bliz3.f126656h = z3;
                }
                if (z2) {
                    int i11 = blkj2.get();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bliz bliz4 = (bliz) da.f164949b;
                    bliz4.f126649a |= 32;
                    bliz4.f126655g = i11;
                }
                bliz bliz5 = (bliz) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bljz bljz2 = (bljz) bxvd.f164949b;
                bljz bljz3 = bljz.f126712i;
                bliz5.getClass();
                if (!bljz2.f126717d.mo73666a()) {
                    bljz2.f126717d = GeneratedMessageLite.m124021a(bljz2.f126717d);
                }
                bljz2.f126717d.add(bliz5);
                sparseArray.append(blkj2.f126734e, blkj2.f126733d);
                if (!blkj2.mo66611a()) {
                    i4++;
                }
                i3++;
                i2 = i9;
                z = false;
            }
            if (this.f126747e != 0) {
                bxvd da2 = blim.f126629d.mo74144da();
                bxvd da3 = blil.f126625c.mo74144da();
                int i12 = this.f126747e;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blil blil = (blil) da3.f164949b;
                blil.f126627a |= 1;
                blil.f126628b = i12;
                blil blil2 = (blil) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blim blim = (blim) da2.f164949b;
                blil2.getClass();
                blim.f126632b = blil2;
                blim.f126631a |= 1;
                blim blim2 = (blim) da2.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bljz bljz4 = (bljz) bxvd.f164949b;
                bljz bljz5 = bljz.f126712i;
                blim2.getClass();
                bljz4.f126720g = blim2;
                bljz4.f126714a |= 16;
            }
            blkk = new blkk(blkjArr[0].f126731b, this.f126748f, this.f126744b, (bljz) bxvd.mo74062i(), sparseArray, i4);
        }
        bmxy.m108600b(bljq.f126691d.remove(blkk.f126738b) != null);
        if (!bqgg.isCancelled()) {
            try {
                bqga.m112780a((Future) bqgg);
                long j2 = blkk.f126739c;
                while (true) {
                    long j3 = bljq.f126692e.get();
                    if (j2 <= j3) {
                        break;
                    } else if (bljq.f126692e.compareAndSet(j3, 300000 + j2)) {
                        long j4 = j2 - 2100000;
                        for (blkl blkl : bljq.f126691d.values()) {
                            if (blkl.f126744b < j4) {
                                bqgi a = bljq.f126690c.mo25814a(bljo.f126686a, 10, TimeUnit.SECONDS);
                                blkl.getClass();
                                a.mo741a(new bljp(blkl), bqfb.INSTANCE);
                            }
                        }
                    }
                }
                bljq.mo66598a(blkk.f126740d, blkk.f126741e, blkk.f126737a);
            } catch (ExecutionException e) {
                bnrq bnrq = (bnrq) bljq.f126688a.mo68387b();
                bnrq.mo68437a(e.getCause());
                bnrq.mo68432a("bljq", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68420a("Trace %s failed collection", blkk.f126737a);
            }
        } else {
            blim blim3 = blkk.f126740d.f126720g;
            if (blim3 == null) {
                blim3 = blim.f126629d;
            }
            long b = bljq.f126689b.mo54418b() - blkk.f126739c;
            bljz bljz6 = blkk.f126740d;
            bxvd bxvd2 = (bxvd) bljz6.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bljz6);
            bxvd bxvd3 = (bxvd) blim3.mo74142c(5);
            bxvd3.mo73625a((GeneratedMessageLite) blim3);
            bxvd da4 = blik.f126620d.mo74144da();
            int i13 = blkk.f126742f;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            blik blik = (blik) da4.f164949b;
            int i14 = blik.f126622a | 2;
            blik.f126622a = i14;
            blik.f126624c = i13;
            blik.f126622a = 1 | i14;
            blik.f126623b = b;
            blik blik2 = (blik) da4.mo74062i();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            blim blim4 = (blim) bxvd3.f164949b;
            blik2.getClass();
            blim4.f126633c = blik2;
            blim4.f126631a |= 2;
            blim blim5 = (blim) bxvd3.mo74062i();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bljz bljz7 = (bljz) bxvd2.f164949b;
            bljz bljz8 = bljz.f126712i;
            blim5.getClass();
            bljz7.f126720g = blim5;
            bljz7.f126714a |= 16;
            bljz bljz9 = (bljz) bxvd2.mo74062i();
            int size = bljz9.f126717d.size() - 1;
            Iterator it = bnkn.m109666a((List) bljz9.f126717d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bliz bliz6 = (bliz) it.next();
                int i15 = bliz6.f126649a;
                if ((i15 & 16) == 0 && (i15 & 4) != 0) {
                    size = bliz6.f126651c;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i16 = 0;
            while (size >= 0) {
                bliz bliz7 = (bliz) bljz9.f126717d.get(size);
                int i17 = (int) bliz7.f126653e;
                String valueOf = String.valueOf(bliz7.f126650b);
                String str2 = (bliz7.f126649a & 16) != 0 ? "" : " (Timed Out)";
                arrayList.add(new StackTraceElement("tk_trace", str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2), "Started After", (i17 - i16) / 1000));
                size = ((bliz) bljz9.f126717d.get(size)).f126652d;
                i16 = i17;
            }
            bnrq bnrq2 = (bnrq) bljq.f126688a.mo68387b();
            bnrq2.mo68437a(new blkd("", (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
            bnrq2.mo68432a("bljq", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68425a("Trace %s timed out after %d ms. Complete trace: %s", blkk.f126737a, Long.valueOf(b), bljz9);
            bljq.mo66598a(bljz9, blkk.f126741e, blkk.f126737a);
        }
    }
}
