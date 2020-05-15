package p000;

/* renamed from: bnfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfu extends bndi {

    /* renamed from: a */
    final Object f131561a;

    /* renamed from: b */
    int f131562b;

    /* renamed from: c */
    final /* synthetic */ bngd f131563c;

    public bnfu(bngd bngd, int i) {
        this.f131563c = bngd;
        this.f131561a = bngd.f131578a[i];
        this.f131562b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67570a() {
        int i = this.f131562b;
        if (i != -1) {
            bngd bngd = this.f131563c;
            if (i <= bngd.f131580c && bmxi.m108538a(bngd.f131578a[i], this.f131561a)) {
                return;
            }
        }
        this.f131562b = this.f131563c.mo67595a(this.f131561a);
    }

    public final Object getKey() {
        return this.f131561a;
    }

    public final Object getValue() {
        mo67570a();
        int i = this.f131562b;
        if (i != -1) {
            return this.f131563c.f131579b[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        mo67570a();
        int i = this.f131562b;
        if (i == -1) {
            return this.f131563c.put(this.f131561a, obj);
        }
        Object obj2 = this.f131563c.f131579b[i];
        if (bmxi.m108538a(obj2, obj)) {
            return obj;
        }
        this.f131563c.mo67605b(this.f131562b, obj);
        return obj2;
    }
}
