package p000;

/* renamed from: bfzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzs extends bfzc {
    public bfzs(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.WALKING_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo62473b() {
        if (this.f115763b.mo62460a()) {
            return 300;
        }
        if (this.f115763b.mo62463b(100000.0d)) {
            return -1;
        }
        if (!this.f115763b.mo62463b(3333.3333333333335d)) {
            return 180;
        }
        return 300;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo62474c() {
        if (this.f115763b.mo62460a()) {
            return 60;
        }
        if (!this.f115763b.mo62463b(100000.0d)) {
            return Math.max(20, Math.min(1800, this.f115763b.f115743a));
        }
        return 1800;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo62475d() {
        int i = this.f115763b.f115744b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "WalkingActivityState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final double mo62479h() {
        return 1.5d;
    }
}
