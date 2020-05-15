package p000;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: bscw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscw implements bsct {

    /* renamed from: a */
    static final long f144125a = TimeUnit.SECONDS.toNanos(15);

    /* renamed from: b */
    static final long f144126b = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: c */
    static final long f144127c = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: d */
    static final long f144128d = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: e */
    private bscs f144129e = bscs.IN_VEHICLE;

    /* renamed from: f */
    private long f144130f = Long.MAX_VALUE;

    /* renamed from: g */
    private float f144131g = Float.NaN;

    /* renamed from: h */
    private long f144132h = Long.MAX_VALUE;

    /* renamed from: i */
    private long f144133i = Long.MAX_VALUE;

    /* renamed from: j */
    private float f144134j = Float.MAX_VALUE;

    /* renamed from: k */
    private long f144135k = Long.MAX_VALUE;

    /* renamed from: a */
    public final float mo70253a(long j) {
        boolean b = mo70254b(j);
        this.f144129e.toString();
        for (bsgn bsgn : bsgm.f144529a) {
        }
        if (b) {
            return this.f144131g;
        }
        long j2 = this.f144130f;
        if (j2 == Long.MAX_VALUE || j - j2 >= f144126b) {
            return 30.0f;
        }
        long j3 = this.f144133i;
        if (j3 != Long.MAX_VALUE && j - j3 < f144128d && this.f144129e.equals(bscs.STILL)) {
            return 2.5f;
        }
        float f = this.f144134j;
        if (f != Float.MAX_VALUE && f < 5.0f) {
            long j4 = this.f144135k;
            if (j4 != Long.MAX_VALUE && j - j4 < f144127c && (this.f144129e.equals(bscs.ON_BICYCLE) || this.f144129e.equals(bscs.IN_VEHICLE))) {
                return 2.5f;
            }
        }
        bscs bscs = this.f144129e;
        bscs bscs2 = bscs.UNKNOWN;
        int ordinal = bscs.ordinal();
        if (ordinal == 0) {
            return 2.5f;
        }
        if (ordinal == 1) {
            return 0.0f;
        }
        if (ordinal == 2) {
            return 2.5f;
        }
        if (ordinal != 3) {
            return 30.0f;
        }
        return 10.0f;
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return 0;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        this.f144133i = j;
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        this.f144129e = bscs;
        this.f144130f = j;
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        throw new UnsupportedOperationException("Speed estimator don't support estimating positions and their time.");
    }

    /* renamed from: b */
    public final boolean mo70254b(long j) {
        long j2 = this.f144132h;
        return j2 != Long.MAX_VALUE && j - j2 < f144125a;
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144129e = bscs.IN_VEHICLE;
        this.f144130f = Long.MAX_VALUE;
        this.f144131g = Float.NaN;
        this.f144132h = Long.MAX_VALUE;
        this.f144133i = Long.MAX_VALUE;
        this.f144134j = Float.MAX_VALUE;
        this.f144135k = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public final void mo70216d() {
        mo70215c();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        throw new UnsupportedOperationException("Speed estimator don't support estimating positions and their time.");
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        if (bsbl.mo70190e() && bsbl.mo70194h()) {
            this.f144131g = bsbl.f143969e;
            this.f144132h = j;
        }
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
        float f = 0.0f;
        if (bscd.f144034a != 0) {
            float[] fArr = bscd.f144036c;
            if (fArr.length != 0) {
                f = fArr[0];
            }
        }
        float f2 = this.f144134j;
        if (f2 != Float.MAX_VALUE) {
            f = (f * 0.100000024f) + (f2 * 0.9f);
        }
        this.f144134j = f;
        this.f144135k = j;
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("SpeedEstimator");
        long j2 = this.f144130f;
        if (j2 != Long.MAX_VALUE) {
            String valueOf = String.valueOf(this.f144129e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append(" activity{");
            sb2.append(j2);
            sb2.append(",");
            sb2.append(valueOf);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j3 = this.f144132h;
        if (j3 != Long.MAX_VALUE) {
            float f = this.f144131g;
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append(" speed{");
            sb3.append(j3);
            sb3.append(",");
            sb3.append(f);
            sb3.append("}");
            sb.append(sb3.toString());
        }
        long j4 = this.f144135k;
        if (j4 != Long.MAX_VALUE) {
            float f2 = this.f144134j;
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append(" snr{");
            sb4.append(j4);
            sb4.append(",");
            sb4.append(f2);
            sb4.append("}");
            sb.append(sb4.toString());
        }
        long j5 = this.f144133i;
        if (j5 != Long.MAX_VALUE) {
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append(" steps at ");
            sb5.append(j5);
            sb.append(sb5.toString());
        }
    }
}
