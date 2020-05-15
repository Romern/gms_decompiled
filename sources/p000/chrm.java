package p000;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: chrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrm implements Comparable {

    /* renamed from: b */
    private static final long f189038b;

    /* renamed from: c */
    private static final long f189039c;

    /* renamed from: d */
    private static final long f189040d = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: g */
    private static final chrl f189041g = new chrl();

    /* renamed from: a */
    public final long f189042a;

    /* renamed from: e */
    private final chrl f189043e;

    /* renamed from: f */
    private volatile boolean f189044f;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f189038b = nanos;
        f189039c = -nanos;
    }

    private chrm(chrl chrl, long j, long j2) {
        this.f189043e = chrl;
        long min = Math.min(f189038b, Math.max(f189039c, j2));
        this.f189042a = j + min;
        this.f189044f = min <= 0;
    }

    /* renamed from: a */
    public static chrm m149457a(long j, TimeUnit timeUnit) {
        chrl chrl = f189041g;
        if (timeUnit != null) {
            return new chrm(chrl, System.nanoTime(), timeUnit.toNanos(j));
        }
        throw new NullPointerException("units");
    }

    /* renamed from: b */
    public final void mo85571b(chrm chrm) {
        chrl chrl = this.f189043e;
        if (chrl != chrm.f189043e) {
            String valueOf = String.valueOf(chrl);
            String valueOf2 = String.valueOf(chrm.f189043e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
            sb.append("Tickers (");
            sb.append(valueOf);
            sb.append(" and ");
            sb.append(valueOf2);
            sb.append(") don't match. Custom Ticker should only be used in tests!");
            throw new AssertionError(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof chrm)) {
            return false;
        }
        chrm chrm = (chrm) obj;
        chrl chrl = this.f189043e;
        if (chrl == null ? chrm.f189043e == null : chrl == chrm.f189043e) {
            if (this.f189042a == chrm.f189042a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f189043e, Long.valueOf(this.f189042a)).hashCode();
    }

    public final String toString() {
        long a = mo85569a(TimeUnit.NANOSECONDS);
        long abs = Math.abs(a) / f189040d;
        long abs2 = Math.abs(a) % f189040d;
        StringBuilder sb = new StringBuilder();
        if (a < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        chrl chrl = this.f189043e;
        if (chrl != f189041g) {
            String valueOf = String.valueOf(chrl);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append(" (ticker=");
            sb2.append(valueOf);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int compareTo(chrm chrm) {
        mo85571b(chrm);
        long j = this.f189042a - chrm.f189042a;
        if (j >= 0) {
            return j <= 0 ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo85569a(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.f189044f && this.f189042a - nanoTime <= 0) {
            this.f189044f = true;
        }
        return timeUnit.convert(this.f189042a - nanoTime, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public final boolean mo85570a() {
        if (!this.f189044f) {
            if (this.f189042a - System.nanoTime() > 0) {
                return false;
            }
            this.f189044f = true;
        }
        return true;
    }
}
