package p000;

/* renamed from: cgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgb implements cgj {

    /* renamed from: a */
    public final boolean f6772a;

    /* renamed from: b */
    private final cgj f6773b;

    /* renamed from: c */
    private final cdg f6774c;

    /* renamed from: d */
    private int f6775d;

    /* renamed from: e */
    private boolean f6776e;

    /* renamed from: f */
    private final cfu f6777f;

    public cgb(cgj cgj, boolean z, cdg cdg, cfu cfu) {
        crb.m7382a(cgj);
        this.f6773b = cgj;
        this.f6772a = z;
        this.f6774c = cdg;
        crb.m7382a(cfu);
        this.f6777f = cfu;
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return this.f6773b.mo3841a();
    }

    /* renamed from: b */
    public final Object mo3842b() {
        return this.f6773b.mo3842b();
    }

    /* renamed from: c */
    public final int mo3843c() {
        return this.f6773b.mo3843c();
    }

    /* renamed from: d */
    public final synchronized void mo3844d() {
        if (this.f6775d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f6776e) {
            this.f6776e = true;
            this.f6773b.mo3844d();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: e */
    public final synchronized void mo3845e() {
        if (!this.f6776e) {
            this.f6775d++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: chr.a(cdg, cgj):void
     arg types: [cdg, cgb]
     candidates:
      chr.a(java.lang.Object, java.lang.Object):void
      cqy.a(java.lang.Object, java.lang.Object):void
      chr.a(cdg, cgj):void */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3846f() {
        int i;
        synchronized (this) {
            int i2 = this.f6775d;
            if (i2 > 0) {
                i = i2 - 1;
                this.f6775d = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            cfu cfu = this.f6777f;
            cdg cdg = this.f6774c;
            cfu.f6732e.mo3784a(cdg);
            if (this.f6772a) {
                cfu.f6733f.mo3907a(cdg, (cgj) this);
            } else {
                cfu.f6730c.mo3864a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.f6772a;
        String valueOf = String.valueOf(this.f6777f);
        String valueOf2 = String.valueOf(this.f6774c);
        int i = this.f6775d;
        boolean z2 = this.f6776e;
        String valueOf3 = String.valueOf(this.f6773b);
        int length = String.valueOf(valueOf).length();
        sb = new StringBuilder(length + 107 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(z);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", key=");
        sb.append(valueOf2);
        sb.append(", acquired=");
        sb.append(i);
        sb.append(", isRecycled=");
        sb.append(z2);
        sb.append(", resource=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
