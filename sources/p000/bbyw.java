package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bbyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyw {

    /* renamed from: a */
    private final ConcurrentMap f103772a = bnmt.m109809c();

    /* renamed from: b */
    private final ConcurrentMap f103773b = bnmt.m109809c();

    /* renamed from: c */
    private final ConcurrentMap f103774c = bnmt.m109809c();

    /* renamed from: d */
    private final Context f103775d;

    /* renamed from: e */
    private final bcnt f103776e;

    /* renamed from: f */
    private final bmxv f103777f;

    /* renamed from: g */
    private final bmxv f103778g;

    public bbyw(Context context, bcnt bcnt, bmxv bmxv, bmxv bmxv2) {
        this.f103775d = context;
        this.f103776e = bcnt;
        this.f103777f = bmxv;
        this.f103778g = bmxv2;
    }

    /* renamed from: a */
    public final synchronized bdae mo56560a(long j) {
        ConcurrentMap concurrentMap = this.f103773b;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return (bdae) this.f103773b.get(valueOf);
        }
        bcax bcax = new bcax(mo56562b(j));
        return (bdae) bmxv.m108567c((bdae) this.f103773b.putIfAbsent(valueOf, bcax)).mo66812a(bcax);
    }

    /* renamed from: b */
    public final synchronized bbyv mo56562b(long j) {
        ConcurrentMap concurrentMap = this.f103774c;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return (bbyv) this.f103774c.get(valueOf);
        }
        bbyv bbyv = new bbyv(this.f103775d, j);
        return (bbyv) bmxv.m108567c((bbyv) this.f103774c.putIfAbsent(valueOf, bbyv)).mo66812a(bbyv);
    }

    /* renamed from: a */
    public final synchronized bdal mo56561a(bcoh bcoh) {
        Long valueOf = Long.valueOf(bcoh.mo57057a());
        if (this.f103772a.containsKey(valueOf)) {
            return (bdal) this.f103772a.get(valueOf);
        }
        bcas bcas = new bcas(this.f103775d, this.f103776e, mo56562b(valueOf.longValue()), this.f103777f.mo66813a() ? ((azco) this.f103777f.mo66814b()).mo54682a(valueOf.longValue()) : mo56560a(valueOf.longValue()), valueOf.longValue());
        return (bdal) bmxv.m108567c((bdal) this.f103772a.putIfAbsent(valueOf, bcas)).mo66812a(bcas);
    }
}
