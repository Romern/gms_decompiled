package p000;

/* renamed from: bdah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdah extends bdar {

    /* renamed from: a */
    public final bmxj f105227a;

    /* renamed from: b */
    public final bdaq f105228b = new bdaf(this);

    /* renamed from: c */
    public boolean f105229c;

    /* renamed from: d */
    public bdar f105230d;

    /* renamed from: e */
    private final bqgg f105231e;

    /* renamed from: h */
    private final bqgj f105232h;

    public bdah(bqgg bqgg, bmxj bmxj, bqgj bqgj) {
        this.f105231e = bqgg;
        this.f105227a = bmxj;
        this.f105232h = bqgj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo56704a() {
        this.f105229c = false;
        bqga.m112781a(this.f105231e, new bdag(this), this.f105232h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo56706b() {
        this.f105229c = true;
        bdar bdar = this.f105230d;
        if (bdar != null) {
            bdar.mo56711b(this.f105228b);
        }
    }
}
