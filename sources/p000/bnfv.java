package p000;

/* renamed from: bnfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfv extends bndi {

    /* renamed from: a */
    final bngd f131564a;

    /* renamed from: b */
    final Object f131565b;

    /* renamed from: c */
    int f131566c;

    public bnfv(bngd bngd, int i) {
        this.f131564a = bngd;
        this.f131565b = bngd.f131579b[i];
        this.f131566c = i;
    }

    /* renamed from: a */
    private final void m109268a() {
        int i = this.f131566c;
        if (i != -1) {
            bngd bngd = this.f131564a;
            if (i <= bngd.f131580c && bmxi.m108538a(this.f131565b, bngd.f131579b[i])) {
                return;
            }
        }
        this.f131566c = this.f131564a.mo67601b(this.f131565b);
    }

    public final Object getKey() {
        return this.f131565b;
    }

    public final Object getValue() {
        m109268a();
        int i = this.f131566c;
        if (i != -1) {
            return this.f131564a.f131578a[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        m109268a();
        int i = this.f131566c;
        if (i == -1) {
            return this.f131564a.mo67598a(this.f131565b, obj);
        }
        Object obj2 = this.f131564a.f131578a[i];
        if (bmxi.m108538a(obj2, obj)) {
            return obj;
        }
        this.f131564a.mo67600a(this.f131566c, obj);
        return obj2;
    }
}
