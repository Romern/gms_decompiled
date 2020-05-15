package p000;

/* renamed from: yip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yip {

    /* renamed from: a */
    long f53874a;

    /* renamed from: b */
    long f53875b;

    public yip() {
        this.f53874a = Long.MAX_VALUE;
        this.f53875b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30547a(yip yip) {
        this.f53874a = Math.min(yip.f53874a, this.f53874a);
        this.f53875b = Math.max(yip.f53875b, this.f53875b);
    }

    public yip(long j, long j2) {
        this.f53874a = j;
        this.f53875b = j2;
    }
}
