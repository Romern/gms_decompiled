package p000;

import java.util.Arrays;

/* renamed from: bqvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqvd {

    /* renamed from: a */
    final bqve f141664a;

    /* renamed from: b */
    final long[] f141665b;

    bqvd() {
        this(new bqve(), new long[10]);
    }

    public bqvd(bqvd bqvd) {
        this.f141664a = new bqve(bqvd.f141664a);
        this.f141665b = Arrays.copyOf(bqvd.f141665b, 10);
    }

    public bqvd(bqve bqve, long[] jArr) {
        this.f141664a = bqve;
        this.f141665b = jArr;
    }
}
