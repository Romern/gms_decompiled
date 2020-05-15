package p000;

import com.google.location.bluemoon.inertialanchor.InertialAnchorBase;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: bsco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsco extends bsbq {

    /* renamed from: f */
    private static final long f144070f = TimeUnit.SECONDS.toNanos(12);

    /* renamed from: b */
    final Deque f144071b;

    /* renamed from: c */
    final bscr f144072c;

    /* renamed from: d */
    public final InertialAnchorBase f144073d;

    /* renamed from: e */
    long f144074e = Long.MIN_VALUE;

    /* renamed from: g */
    private final long f144075g;

    /* renamed from: h */
    private final bsev f144076h;

    /* renamed from: i */
    private final bscx f144077i;

    /* renamed from: j */
    private final bsct f144078j;

    /* renamed from: k */
    private final bsct f144079k;

    /* renamed from: l */
    private final bscw f144080l;

    /* renamed from: m */
    private final float f144081m;

    /* renamed from: n */
    private long f144082n = Long.MIN_VALUE;

    /* renamed from: o */
    private final bsci f144083o;

    /* renamed from: p */
    private final bsbn f144084p;

    /* renamed from: q */
    private final bseb f144085q;

    /* renamed from: r */
    private final bsbo f144086r;

    public bsco(float f, bsev bsev, int i, int i2, int i3, bsdh bsdh, InertialAnchorBase inertialAnchorBase, bseb bseb) {
        bsbn bsbn;
        bscr bscr;
        ArrayDeque arrayDeque;
        bsdh bsdh2 = bsdh;
        this.f144076h = bsev;
        bseh bseh = (bseh) bsev;
        bsbo bsbo = null;
        this.f144083o = bseh.f144320m ? new bscj(bseh.f144328u) : null;
        if (bseh.f144323p) {
            bsbn = new bsbn(bseh.f144324q);
        } else {
            bsbn = null;
        }
        this.f144084p = bsbn;
        this.f144073d = inertialAnchorBase;
        this.f144085q = bseb;
        if (bsdh2 != null) {
            bscr = new bscr(bsdh2, f144070f);
        } else {
            bscr = null;
        }
        this.f144072c = bscr;
        this.f144077i = new bscx();
        this.f144080l = new bscw();
        this.f144081m = f;
        this.f144075g = bsgk.m115738a(bseh.f144310c);
        if (bseh.f144309b) {
            arrayDeque = new ArrayDeque(bseh.f144311d);
        } else {
            arrayDeque = null;
        }
        this.f144071b = arrayDeque;
        bsck bsck = new bsck(new bsbr());
        bsbu bsbu = new bsbu(new bscl(), 3);
        this.f144078j = new bscm(new bsbr());
        this.f144079k = new bsbt(new bscp(new bsce(i, i2), new bscn(this.f144078j, bsck), true, i3), bsbu);
        bsbo = bseh.f144313f ? new bsbo(bsgk.m115738a(bseh.f144314g), bsgk.m115738a(bseh.f144315h), bsgk.m115738a(bseh.f144316i), bseh.f144317j) : bsbo;
        this.f144086r = bsbo;
        if (bsbo != null) {
            this.f144002a = new bsct[]{this.f144079k, this.f144080l, bsbo};
        } else {
            this.f144002a = new bsct[]{this.f144079k, this.f144080l};
        }
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        int a = this.f144079k.mo70205a(j, i);
        bsbo bsbo = this.f144086r;
        if (bsbo != null) {
            a |= bsbo.mo70205a(j, i);
        }
        if (!mo70251e()) {
            if (!this.f144080l.mo70254b(j)) {
                a |= 16;
            }
            if (!mo70249c(j)) {
                return a;
            }
            bscr bscr = this.f144072c;
            if (bscr != null) {
                return bscr.mo70205a(j, i) | a;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        boolean z;
        if (((bseh) this.f144076h).f144309b) {
            z = mo70248b(this.f144074e);
        } else {
            z = mo70247a(this.f144074e);
        }
        if (!z || this.f144072c.mo70206a() == null) {
            return this.f144079k.mo70214b();
        }
        return this.f144072c.mo70214b();
    }

    /* renamed from: c */
    public final void mo70215c() {
        super.mo70215c();
        bscr bscr = this.f144072c;
        if (bscr != null) {
            bscr.mo70215c();
        }
        bsci bsci = this.f144083o;
        if (bsci != null) {
            bsci.mo61306a();
        }
        bsbn bsbn = this.f144084p;
        if (bsbn != null) {
            bsbn.mo70204a();
        }
        this.f144077i.mo70255a();
    }

    /* renamed from: d */
    public final void mo70216d() {
        super.mo70216d();
        bscr bscr = this.f144072c;
        if (bscr != null) {
            bscr.mo70216d();
        }
        bsci bsci = this.f144083o;
        if (bsci != null) {
            bsci.mo61306a();
        }
        bsbn bsbn = this.f144084p;
        if (bsbn != null) {
            bsbn.mo70204a();
        }
        this.f144077i.mo70255a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo70251e() {
        bsbl a = this.f144079k.mo70206a();
        return a != null && a.mo70193g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo70252e(long j) {
        bseb bseb;
        bscr bscr;
        boolean z = false;
        if (((bseh) this.f144076h).f144318k && (bseb = this.f144085q) != null) {
            if (bseb.mo62244b() + ((bseh) this.f144076h).f144319l > j) {
                z = true;
            }
            if (z && (bscr = this.f144072c) != null) {
                if (j > bscr.f144107b) {
                    bscr.f144107b = j;
                }
                return true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo70248b(long j) {
        boolean z;
        if (!((bseh) this.f144076h).f144327t || this.f144077i.f144138a != bscs.IN_VEHICLE) {
            z = false;
        } else {
            z = true;
        }
        return (mo70247a(j) && mo70250d(j) && !z) || mo70252e(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo70249c(long j) {
        double a = (double) this.f144080l.mo70253a(j);
        for (bsgn bsgn : bsgm.f144529a) {
        }
        return a < ((bseh) this.f144076h).f144308a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo70250d(long j) {
        while (!this.f144071b.isEmpty() && ((Long) this.f144071b.peekFirst()).longValue() < j - this.f144075g) {
            this.f144071b.removeFirst();
        }
        return this.f144071b.size() == ((bseh) this.f144076h).f144311d;
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        boolean z;
        bsbl bsbl;
        int i;
        bsci bsci;
        if (((bseh) this.f144076h).f144309b) {
            z = mo70248b(this.f144074e);
        } else {
            z = mo70247a(this.f144074e);
        }
        if (z) {
            bsbl = this.f144072c.mo70206a();
        } else {
            bsbl = null;
        }
        if (!z || bsbl == null) {
            bsbl = this.f144079k.mo70206a();
        }
        if (bsbl == null) {
            return bsbl;
        }
        for (bsgn bsgn : bsgm.f144529a) {
        }
        bsbo bsbo = this.f144086r;
        if (bsbo != null) {
            long j = this.f144074e;
            bsbl bsbl2 = bsbo.f143985c;
            if (bsbl2 == null || j - bsbo.f143986d >= bsbo.f143983a) {
                bsbl bsbl3 = bsbo.f143987e;
                if (bsbl3 != null && j - bsbo.f143988f < bsbo.f143984b) {
                    bsbl = bsgj.m115736a(bsbl3, bsbl);
                }
            } else {
                bsbl = bsgj.m115736a(bsbl2, bsbl);
            }
            long j2 = bsbo.f143989g;
            if (j2 > 0 && bsbl.f143975k == null && bsbo.f143990h != null && j - bsbo.f143992j < j2) {
                bsbj n = bsbl.mo70201n();
                n.mo70180a(bsbo.f143990h);
                n.f143952k = bsbo.f143991i;
                bsbl = n.mo70174a();
            }
        }
        int i2 = bsbl.f143968d;
        bseh bseh = (bseh) this.f144076h;
        if (bseh.f144320m && (bsci = this.f144083o) != null) {
            if (bseh.f144325r) {
                bsbl = bsci.mo61305a(bsbl, this.f144074e);
            } else {
                bsbl = bsci.mo61305a(bsbl, mo70214b());
            }
        }
        bseh bseh2 = (bseh) this.f144076h;
        if (!bseh2.f144323p) {
            return bsbl;
        }
        if (bseh2.f144325r) {
            i = this.f144084p.mo70203a(i2, this.f144074e);
        } else {
            i = this.f144084p.mo70203a(i2, mo70214b());
        }
        double d = ((bseh) this.f144076h).f144322o;
        bsbj n2 = bsbl.mo70201n();
        int i3 = bsbl.f143966b;
        int i4 = bsbl.f143967c;
        double d2 = (double) i;
        Double.isNaN(d2);
        n2.mo70178a(i3, i4, (int) (d2 * d));
        return n2.mo70174a();
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        for (bsgn bsgn : bsgm.f144529a) {
        }
        super.mo70208a(j, f, f2);
        this.f144082n = j;
        bseh bseh = (bseh) this.f144076h;
        if (bseh.f144309b) {
            if (bseh.f144311d == this.f144071b.size()) {
                this.f144071b.removeFirst();
            }
            while (!this.f144071b.isEmpty() && ((Long) this.f144071b.peekFirst()).longValue() <= j - this.f144075g) {
                this.f144071b.removeFirst();
            }
            if (this.f144071b.isEmpty() || ((Long) this.f144071b.peekLast()).longValue() != j) {
                this.f144071b.add(Long.valueOf(j));
            }
        }
        this.f144074e = j;
        if (mo70247a(j)) {
            this.f144072c.mo70208a(j, f, f2);
        }
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        bseb bseb;
        for (bsgn bsgn : bsgm.f144529a) {
        }
        if (((bseh) this.f144076h).f144326s) {
            bsbl a = bscq.m115246a(bsbl, this.f144081m);
            this.f144077i.mo70256a(a);
            super.mo70209a(j, a);
        } else {
            this.f144077i.mo70256a(bsbl);
            super.mo70209a(j, bsbl);
        }
        this.f144078j.mo70209a(j, bsbl);
        this.f144074e = j;
        if (mo70247a(j)) {
            this.f144072c.mo70209a(j, bsbl);
        } else if (((bseh) this.f144076h).f144318k && (bseb = this.f144085q) != null) {
            bseb.mo62247d(2);
        }
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
        super.mo70210a(j, bscd);
        this.f144074e = j;
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        String.valueOf(bscs);
        for (bsgn bsgn : bsgm.f144529a) {
        }
        this.f144077i.mo70257a(bscs);
        super.mo70211a(j, this.f144077i.f144138a);
        if (((bseh) this.f144076h).f144321n) {
            bsci bsci = this.f144083o;
            if (bsci instanceof bscj) {
                bscs bscs2 = bscs.UNKNOWN;
                int ordinal = bscs.ordinal();
                if (ordinal == 0) {
                    bscj bscj = (bscj) bsci;
                    bscj.f144065b = bscj.f144064a.mo70354a();
                    bscj.f144066c = bscj.f144064a.mo70355b();
                } else if (ordinal == 1) {
                    ((bscj) bsci).mo70246b();
                } else if (ordinal == 2) {
                    bscj bscj2 = (bscj) bsci;
                    bscj2.f144065b = bscj2.f144064a.mo70356c();
                    bscj2.f144066c = bscj2.f144064a.mo70357d();
                } else if (ordinal == 3) {
                    ((bscj) bsci).mo70246b();
                } else if (ordinal == 4) {
                    ((bscj) bsci).mo70246b();
                }
            }
        }
        this.f144074e = j;
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
        super.mo70212a(j, bsde);
        this.f144074e = j;
        if (mo70247a(j)) {
            this.f144072c.mo70212a(j, bsde);
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        printWriter.printf("ParticleFilterFusion: should run: %b\n", Boolean.valueOf(mo70247a(this.f144074e)));
        if (this.f144072c == null) {
            printWriter.println("  Particle filter implementation not instantiated.");
        }
        bscr bscr = this.f144072c;
        if (bscr != null) {
            bscr.mo70213a(j, printWriter);
        }
        InertialAnchorBase inertialAnchorBase = this.f144073d;
        if (inertialAnchorBase != null) {
            inertialAnchorBase.mo86635a(printWriter);
        }
        super.mo70213a(j, printWriter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo70247a(long j) {
        boolean z;
        boolean z2 = false;
        if (this.f144072c == null) {
            return false;
        }
        boolean c = mo70249c(j);
        bseh bseh = (bseh) this.f144076h;
        if (bseh.f144309b && !bseh.f144312e) {
            z = mo70250d(j);
        } else {
            long j2 = this.f144082n;
            if (j2 != Long.MIN_VALUE) {
                z = j - j2 < this.f144075g;
            } else {
                z = false;
            }
        }
        boolean e = mo70251e();
        boolean e2 = mo70252e(j);
        if (c && z && !e) {
            z2 = true;
        } else if (e2) {
            z2 = true;
        }
        for (bsgn bsgn : bsgm.f144529a) {
        }
        return z2;
    }
}
