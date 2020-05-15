package p000;

import java.util.Arrays;

/* renamed from: bqvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqvc {

    /* renamed from: a */
    final long[] f141661a;

    /* renamed from: b */
    final long[] f141662b;

    /* renamed from: c */
    final long[] f141663c;

    bqvc() {
        this(new long[10], new long[10], new long[10]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69339a(bqvc bqvc, int i) {
        bquu.m113452a(this.f141661a, bqvc.f141661a, i);
        bquu.m113452a(this.f141662b, bqvc.f141662b, i);
        bquu.m113452a(this.f141663c, bqvc.f141663c, i);
    }

    public bqvc(bqvc bqvc) {
        this.f141661a = Arrays.copyOf(bqvc.f141661a, 10);
        this.f141662b = Arrays.copyOf(bqvc.f141662b, 10);
        this.f141663c = Arrays.copyOf(bqvc.f141663c, 10);
    }

    public bqvc(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f141661a = jArr;
        this.f141662b = jArr2;
        this.f141663c = jArr3;
    }
}
