package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: blkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blkj extends AtomicInteger {

    /* renamed from: a */
    public final blkj f126730a;

    /* renamed from: b */
    public final String f126731b;

    /* renamed from: c */
    public final int f126732c;

    /* renamed from: d */
    public final bljf f126733d;

    /* renamed from: e */
    public int f126734e;

    /* renamed from: f */
    public blkj f126735f;

    /* renamed from: g */
    public volatile int f126736g;

    public blkj(blkj blkj, String str, int i, bljf bljf) {
        this.f126736g = 0;
        this.f126730a = blkj;
        this.f126731b = str;
        this.f126734e = -1;
        this.f126732c = i;
        this.f126733d = bljf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66610a(int i, blkj blkj) {
        this.f126734e = i;
        this.f126735f = blkj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo66611a() {
        return this.f126736g != 0;
    }

    public blkj(String str, bljf bljf, int i) {
        int i2 = 0;
        this.f126736g = 0;
        this.f126730a = null;
        this.f126731b = str;
        this.f126734e = 0;
        this.f126732c = 0;
        this.f126733d = bljf;
        this.f126736g = i != 2 ? Integer.MIN_VALUE : i2;
    }
}
