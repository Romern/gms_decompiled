package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ydz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ydz implements yfd {

    /* renamed from: d */
    public static final /* synthetic */ int f53680d = 0;

    /* renamed from: f */
    private static final bnny f53681f = bnnt.f131877a.mo68137b();

    /* renamed from: g */
    private static final bnny f53682g = bnnt.f131877a.mo68159a(ydx.f53678a).mo68163b(f53681f.mo68159a(ydy.f53679a).mo67377a());

    /* renamed from: a */
    protected final caae f53683a;

    /* renamed from: b */
    protected long f53684b = Long.MAX_VALUE;

    /* renamed from: c */
    protected long f53685c = Long.MIN_VALUE;

    /* renamed from: e */
    private final Map f53686e = new HashMap();

    public ydz(caae caae) {
        this.f53683a = caae;
    }

    /* renamed from: a */
    public final caae mo30379a() {
        return this.f53683a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract double mo30383b(cadn cadn);

    /* renamed from: b */
    public final bngx mo30382b() {
        if (this.f53684b == Long.MAX_VALUE && this.f53685c == Long.MIN_VALUE) {
            return bngx.m109376e();
        }
        return bngx.m109356a(mo30384c());
    }

    /* renamed from: c */
    public abstract cadn mo30384c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final caae mo30394d() {
        if (!this.f53686e.isEmpty()) {
            return (caae) ((Map.Entry) f53682g.mo68166b(this.f53686e.entrySet(), 1).get(0)).getKey();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo30381a(cadn cadn) {
        bmxv bmxv;
        long j = cadn.f172702b;
        long j2 = cadn.f172703c;
        if (j2 == 0) {
            j2 = j;
        }
        this.f53684b = Math.min(this.f53684b, j2);
        this.f53685c = Math.max(this.f53685c, j);
        double b = mo30383b(cadn);
        int i = cadn.f172701a;
        if ((i & 8) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            bmxv = bmxv.m108566b(caae);
        } else if ((i & 4) == 0) {
            bmxv = bmvz.f131120a;
        } else {
            caae caae2 = cadn.f172705e;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            bmxv = bmxv.m108566b(caae2);
        }
        if (bmxv.mo66813a()) {
            caae caae3 = (caae) bmxv.mo66814b();
            if (!caae3.equals(this.f53683a)) {
                if (this.f53686e.containsKey(caae3)) {
                    b += ((Double) this.f53686e.get(caae3)).doubleValue();
                }
                this.f53686e.put(caae3, Double.valueOf(b));
            }
        }
    }
}
