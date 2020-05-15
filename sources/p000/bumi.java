package p000;

/* renamed from: bumi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumi {

    /* renamed from: a */
    public final int f154238a = -93;

    /* renamed from: b */
    public final int f154239b = -35;

    /* renamed from: c */
    public final int f154240c = 1000;

    /* renamed from: d */
    public final int f154241d = 1000;

    /* renamed from: e */
    public final bumg f154242e;

    /* renamed from: f */
    public final bumg f154243f;

    public bumi() {
        new bumq();
        this.f154242e = new bumg(bumq.class);
        this.f154243f = new bumg(bumq.class);
    }

    /* renamed from: a */
    public static final long m119975a(bumg bumg, int i) {
        return ((bumq[]) bumg.f154233a)[i].f154257c;
    }

    /* renamed from: b */
    public static final float m119977b(bumg bumg, int i) {
        return ((bumq[]) bumg.f154233a)[i].f154260f;
    }

    /* renamed from: c */
    public static final float m119978c(bumg bumg, int i) {
        return ((bumq[]) bumg.f154233a)[i].f154261g;
    }

    /* renamed from: d */
    public static final int m119979d(bumg bumg, int i) {
        return ((bumq[]) bumg.f154233a)[i].f154259e;
    }

    /* renamed from: e */
    public static final int m119980e(bumg bumg, int i) {
        return ((bumq[]) bumg.f154233a)[i].f154258d;
    }

    /* renamed from: a */
    public final int mo72857a() {
        return this.f154242e.f154234b;
    }

    /* renamed from: a */
    public static final void m119976a(bumg bumg, long j, int i, int i2, float f, float f2) {
        bumq bumq = ((bumq[]) bumg.f154233a)[bumg.mo72851b()];
        bumq.f154257c = j;
        bumq.f154258d = i;
        bumq.f154259e = i2;
        bumq.f154260f = f;
        bumq.f154261g = f2;
    }

    /* renamed from: b */
    public final int mo72860b(int i) {
        this.f154242e.mo72849a(i, "getSignalStrengthDbm");
        return m119980e(this.f154242e, i);
    }

    /* renamed from: c */
    public final int mo72861c(int i) {
        this.f154242e.mo72849a(i, "getRttSuccessCount");
        return m119979d(this.f154242e, i);
    }

    /* renamed from: d */
    public final float mo72862d(int i) {
        this.f154242e.mo72849a(i, "getRttDistanceM");
        return m119977b(this.f154242e, i);
    }

    /* renamed from: e */
    public final float mo72863e(int i) {
        this.f154242e.mo72849a(i, "getRttDistanceStdevM");
        return m119978c(this.f154242e, i);
    }

    /* renamed from: a */
    public final long mo72858a(int i) {
        this.f154242e.mo72849a(i, "getMacAddress");
        return m119975a(this.f154242e, i);
    }

    public bumi(byte[] bArr) {
        new bumq();
        this.f154242e = new bumg(bumq.class);
        this.f154243f = new bumg(bumq.class);
        this.f154238a = -100;
    }

    /* renamed from: a */
    public final void mo72859a(long[] jArr) {
        this.f154242e.mo72847a();
        int length = jArr.length;
        this.f154242e.mo72852b(length);
        for (long j : jArr) {
            m119976a(this.f154242e, j, 0, 0, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        }
        this.f154242e.mo72850a(bumq.f154256b);
    }
}
