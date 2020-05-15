package p000;

import java.util.Iterator;

/* renamed from: yjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjz extends bnch {

    /* renamed from: a */
    private final long f53956a;

    /* renamed from: b */
    private final long f53957b;

    /* renamed from: c */
    private final long f53958c;

    /* renamed from: d */
    private final bnjq f53959d;

    public yjz(Iterator it, long j, yhg yhg) {
        this.f53959d = bnjr.m109626h(it);
        this.f53956a = j;
        yfw yfw = (yfw) yhg;
        this.f53957b = yfw.f53737a;
        this.f53958c = yfw.f53738b;
    }

    /* renamed from: a */
    private final boolean m44268a(yhu yhu) {
        return yhu.mo30387b() > this.f53957b && yhu.mo30387b() <= this.f53958c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f53959d.hasNext()) {
            return (yhu) mo67118d();
        }
        yhu yhu = (yhu) this.f53959d.next();
        if (!m44268a(yhu)) {
            return yhu;
        }
        long b = yhu.mo30387b();
        while (this.f53959d.hasNext() && m44268a((yhu) this.f53959d.mo67862a()) && Math.abs(((yhu) this.f53959d.mo67862a()).mo30387b() - b) <= this.f53956a) {
            yhu yhu2 = (yhu) this.f53959d.next();
            if (bneu.f131545b.mo67472a(yhu2.mo30514g(), yhu.mo30514g()).mo67472a(yhu2.mo30513f(), yhu.mo30513f()).mo67470a() > 0) {
                yhu = yhu2;
            }
        }
        return yhu;
    }
}
