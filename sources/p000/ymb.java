package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ymb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ymb extends bnch {

    /* renamed from: a */
    private long f54066a = 0;

    /* renamed from: b */
    private final List f54067b = new ArrayList();

    /* renamed from: c */
    private final bnjq f54068c;

    public ymb(bnjq bnjq) {
        this.f54068c = bnjq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (!this.f54068c.hasNext()) {
            return (btxb) mo67118d();
        }
        while (this.f54068c.hasNext()) {
            yhu yhu = (yhu) this.f54068c.mo67862a();
            yfu a = yhu.mo30509a(0);
            Iterator it = a.mo30436c().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ypq.m44539a("Data point has zero confidence: %s", yhu);
                    this.f54068c.next();
                    break;
                }
                Float f = (Float) it.next();
                bmxy.m108582a(f, "Missing confidence.");
                if (f.floatValue() > 0.0f) {
                    long b = yhu.mo30387b();
                    if (b == this.f54066a || this.f54067b.isEmpty()) {
                        this.f54066a = b;
                        this.f54068c.next();
                        for (Map.Entry entry : a.mo30436c().entrySet()) {
                            Float f2 = (Float) entry.getValue();
                            bmxy.m108582a(f2, "Missing confidence.");
                            this.f54067b.add(new btxa(bzzh.m126347a((String) entry.getKey()), f2.intValue()));
                        }
                    } else {
                        btxb btxb = new btxb(this.f54067b, TimeUnit.NANOSECONDS.toMillis(this.f54066a));
                        this.f54067b.clear();
                        return btxb;
                    }
                }
            }
        }
        if (this.f54067b.isEmpty()) {
            return (btxb) mo67118d();
        }
        return new btxb(this.f54067b, TimeUnit.NANOSECONDS.toMillis(this.f54066a));
    }
}
