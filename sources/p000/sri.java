package p000;

import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: sri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sri implements Iterable {

    /* renamed from: a */
    protected static final long f45033a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    protected static final int f45034b = m36105g(-16384);

    /* renamed from: c */
    protected static final int f45035c = m36105g(16256);

    /* renamed from: d */
    protected static final int f45036d = m36105g(127);

    /* renamed from: e */
    protected static final int f45037e = (((int) Math.pow(2.0d, (double) (32 - f45034b))) - 1);

    /* renamed from: f */
    public final int[] f45038f;

    /* renamed from: g */
    public int f45039g = 0;

    /* renamed from: h */
    public int f45040h = 0;

    /* renamed from: i */
    public long f45041i = -1;

    /* renamed from: j */
    private int f45042j = 0;

    /* renamed from: k */
    private long f45043k = -1;

    /* renamed from: d */
    public static int m36101d(int i) {
        return (i & -16384) >>> f45034b;
    }

    /* renamed from: d */
    private final boolean m36102d() {
        return this.f45039g == 0;
    }

    /* renamed from: e */
    public static int m36103e(int i) {
        return (i & 16256) >>> f45035c;
    }

    /* renamed from: f */
    public static int m36104f(int i) {
        return (i & 127) >>> f45036d;
    }

    /* renamed from: g */
    private static int m36105g(int i) {
        int i2 = 0;
        while (i != 0 && (i & 1) == 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo26007a(long j, int i, int i2);

    /* renamed from: a */
    public void mo26008a() {
        this.f45042j = 0;
        this.f45039g = 0;
        this.f45040h++;
        this.f45041i = -1;
        this.f45043k = -1;
    }

    /* renamed from: b */
    public final int mo26012b(int i) {
        return mo26015c(i + 1);
    }

    /* renamed from: c */
    public final int mo26014c() {
        return mo26015c(this.f45042j - this.f45039g);
    }

    public sri(int i) {
        this.f45038f = new int[i];
    }

    /* renamed from: a */
    public final void mo26009a(int i) {
        mo26010a(i, 0);
    }

    /* renamed from: b */
    public final ListIterator iterator() {
        return new srh(this);
    }

    /* renamed from: c */
    public final int mo26015c(int i) {
        int length = this.f45038f.length;
        return ((i % length) + length) % length;
    }

    /* renamed from: a */
    public final void mo26010a(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis() / f45033a;
        int i3 = 0;
        if (!m36102d()) {
            int i4 = (int) (currentTimeMillis - this.f45043k);
            if (i4 < 0 || i4 / f45037e >= this.f45038f.length - 1) {
                mo26008a();
            } else {
                while (true) {
                    int i5 = f45037e;
                    if (i4 < i5) {
                        break;
                    }
                    mo26011a(i5, 0, 0);
                    i4 -= f45037e;
                }
                i3 = i4;
            }
        }
        if (m36102d()) {
            this.f45041i = currentTimeMillis;
            this.f45043k = currentTimeMillis;
        }
        mo26011a(i3, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26011a(int i, int i2, int i3) {
        long j = this.f45041i;
        if (j == -1 || this.f45043k == -1) {
            throw new IllegalStateException();
        }
        int i4 = this.f45039g;
        int[] iArr = this.f45038f;
        if (i4 == iArr.length) {
            this.f45041i = j + ((long) m36101d(iArr[mo26014c()]));
        } else {
            this.f45039g = i4 + 1;
        }
        int[] iArr2 = this.f45038f;
        int i5 = this.f45042j;
        if (i <= f45037e) {
            iArr2[i5] = ((i2 << f45035c) & 16256) | ((i << f45034b) & -16384) | ((i3 << f45036d) & 127);
            this.f45042j = mo26012b(i5);
            this.f45043k += (long) i;
            this.f45040h++;
            return;
        }
        throw new IllegalStateException();
    }
}
