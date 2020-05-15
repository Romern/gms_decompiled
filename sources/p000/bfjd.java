package p000;

/* renamed from: bfjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfjd implements Comparable {

    /* renamed from: a */
    final long f114148a;

    /* renamed from: b */
    final long f114149b;

    /* renamed from: c */
    final int f114150c;

    /* renamed from: d */
    final Integer f114151d;

    public bfjd(long j, long j2, int i, Integer num) {
        this.f114148a = j;
        this.f114149b = j2;
        this.f114150c = i;
        this.f114151d = num;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bsax mo61780a() {
        bsax bsax = new bsax(bgox.f117115cb);
        bsax.mo70117b(1, this.f114148a);
        bsax.mo70117b(2, this.f114149b);
        bsax.mo70134g(4, this.f114150c);
        Integer num = this.f114151d;
        if (num != null) {
            bsax.mo70134g(5, num.intValue());
        }
        return bsax;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.f114148a > ((bfjd) obj).f114148a ? 1 : (this.f114148a == ((bfjd) obj).f114148a ? 0 : -1));
    }
}
