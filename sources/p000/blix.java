package p000;

import android.os.Build;
import com.google.android.cast.JGCastService;
import java.lang.ref.Reference;
import java.util.UUID;

/* renamed from: blix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blix extends bliq {

    /* renamed from: a */
    private final blkj f126641a;

    /* renamed from: b */
    private final bliw f126642b;

    /* renamed from: c */
    private final ayte f126643c;

    /* renamed from: d */
    private final int f126644d;

    /* renamed from: e */
    private final boolean f126645e;

    /* renamed from: f */
    private final boolean f126646f;

    private blix(blkj blkj, blix blix) {
        super(blkj.f126731b, blix, blkj.f126733d);
        this.f126641a = blkj;
        this.f126642b = blix.f126642b;
        this.f126643c = blix.f126643c;
        this.f126644d = blix.f126644d;
        this.f126646f = blix.f126646f;
        this.f126645e = blix.f126645e;
    }

    /* renamed from: d */
    private final int m107224d() {
        return ((int) (!this.f126645e ? this.f126643c.mo54418b() : this.f126643c.mo54419c())) - this.f126644d;
    }

    /* renamed from: f */
    private final void m107225f() {
        int i = Build.VERSION.SDK_INT;
        Reference.reachabilityFence(this);
    }

    /* renamed from: a */
    public final bljg mo66580a(String str, bljf bljf) {
        bliw bliw = this.f126642b;
        blkj blkj = new blkj(this.f126641a, str, m107224d(), bljf);
        while (true) {
            blkl blkl = (blkl) bliw;
            blkj blkj2 = (blkj) blkl.f126745c.get();
            int i = blkj2.f126734e + 1;
            if (i >= blkl.f126743a.f126693f) {
                blkj.mo66610a(-1, null);
                synchronized (bliw) {
                    ((blkl) bliw).f126747e++;
                    break;
                }
            }
            blkj.mo66610a(i, blkj2);
            if (blkl.f126745c.compareAndSet(blkj2, blkj)) {
                break;
            }
        }
        return new blix(blkj, this);
    }

    /* renamed from: e */
    public final boolean mo66583e() {
        return this.f126646f;
    }

    public blix(blkj blkj, UUID uuid, bliw bliw, ayte ayte, long j, boolean z, boolean z2) {
        super(blkj.f126731b, uuid, blkj.f126733d);
        this.f126641a = blkj;
        this.f126642b = bliw;
        this.f126643c = ayte;
        this.f126644d = (int) j;
        this.f126646f = z;
        this.f126645e = z2;
    }

    /* renamed from: a */
    public final void mo66581a(int i) {
        this.f126641a.addAndGet(i);
        m107225f();
    }

    /* renamed from: a */
    public final void mo66582a(boolean z) {
        int i;
        int d = m107224d();
        blkj blkj = this.f126641a;
        int i2 = d - blkj.f126732c;
        bmxy.m108600b(!blkj.mo66611a());
        if (!z) {
            i = 0;
        } else {
            i = JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        blkj.f126736g = i | Integer.MIN_VALUE | (i2 & 1073741823);
        m107225f();
    }
}
