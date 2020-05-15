package p000;

import java.util.Arrays;

/* renamed from: bqve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqve {

    /* renamed from: a */
    final long[] f141666a;

    /* renamed from: b */
    final long[] f141667b;

    /* renamed from: c */
    final long[] f141668c;

    public bqve() {
        this(new long[10], new long[10], new long[10]);
    }

    /* renamed from: a */
    static void m113456a(bqve bqve, bqvd bqvd) {
        bqvy.m113506c(bqve.f141666a, bqvd.f141664a.f141666a, bqvd.f141665b);
        long[] jArr = bqve.f141667b;
        bqve bqve2 = bqvd.f141664a;
        bqvy.m113506c(jArr, bqve2.f141667b, bqve2.f141668c);
        bqvy.m113506c(bqve.f141668c, bqvd.f141664a.f141668c, bqvd.f141665b);
    }

    public bqve(bqvd bqvd) {
        this();
        m113456a(this, bqvd);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo69340a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = this.f141668c;
        int i = bqvy.f141700a;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        bqvy.m113504b(jArr5, jArr4);
        bqvy.m113504b(jArr14, jArr5);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113506c(jArr6, jArr13, jArr4);
        bqvy.m113506c(jArr7, jArr6, jArr5);
        bqvy.m113504b(jArr13, jArr7);
        bqvy.m113506c(jArr8, jArr13, jArr6);
        bqvy.m113504b(jArr13, jArr8);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113506c(jArr9, jArr13, jArr8);
        bqvy.m113504b(jArr13, jArr9);
        bqvy.m113504b(jArr14, jArr13);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            bqvy.m113504b(jArr13, jArr14);
            bqvy.m113504b(jArr14, jArr13);
        }
        bqvy.m113506c(jArr10, jArr14, jArr9);
        bqvy.m113504b(jArr13, jArr10);
        bqvy.m113504b(jArr14, jArr13);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            bqvy.m113504b(jArr13, jArr14);
            bqvy.m113504b(jArr14, jArr13);
        }
        bqvy.m113506c(jArr13, jArr14, jArr10);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113504b(jArr13, jArr14);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            bqvy.m113504b(jArr14, jArr13);
            bqvy.m113504b(jArr13, jArr14);
        }
        bqvy.m113506c(jArr11, jArr13, jArr9);
        bqvy.m113504b(jArr13, jArr11);
        bqvy.m113504b(jArr14, jArr13);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            bqvy.m113504b(jArr13, jArr14);
            bqvy.m113504b(jArr14, jArr13);
        }
        bqvy.m113506c(jArr12, jArr14, jArr11);
        bqvy.m113504b(jArr14, jArr12);
        bqvy.m113504b(jArr13, jArr14);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            bqvy.m113504b(jArr14, jArr13);
            bqvy.m113504b(jArr13, jArr14);
        }
        bqvy.m113506c(jArr14, jArr13, jArr12);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113504b(jArr14, jArr13);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            bqvy.m113504b(jArr13, jArr14);
            bqvy.m113504b(jArr14, jArr13);
        }
        bqvy.m113506c(jArr13, jArr14, jArr11);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113504b(jArr13, jArr14);
        bqvy.m113504b(jArr14, jArr13);
        bqvy.m113506c(jArr, jArr14, jArr7);
        bqvy.m113506c(jArr2, this.f141666a, jArr);
        bqvy.m113506c(jArr3, this.f141667b, jArr);
        byte[] a = bqvy.m113502a(jArr3);
        byte b = a[31];
        int i8 = bqvg.f141671a;
        a[31] = (byte) (((bqvy.m113502a(jArr2)[0] & 1) << 7) ^ b);
        return a;
    }

    public bqve(bqve bqve) {
        this.f141666a = Arrays.copyOf(bqve.f141666a, 10);
        this.f141667b = Arrays.copyOf(bqve.f141667b, 10);
        this.f141668c = Arrays.copyOf(bqve.f141668c, 10);
    }

    public bqve(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f141666a = jArr;
        this.f141667b = jArr2;
        this.f141668c = jArr3;
    }
}
