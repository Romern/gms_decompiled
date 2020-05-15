package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: bgoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgoo {

    /* renamed from: a */
    final long f116940a;

    /* renamed from: b */
    bfcs f116941b;

    /* renamed from: c */
    public long f116942c;

    /* renamed from: d */
    long f116943d;

    /* renamed from: e */
    private final String f116944e;

    /* renamed from: f */
    private final bgon f116945f = new bgon();

    public bgoo(String str, bfcs bfcs, long j, long j2) {
        this.f116944e = str;
        this.f116941b = bfcs;
        this.f116940a = j;
        mo63046a(j2);
    }

    /* renamed from: a */
    private static long m99528a(long j, long j2, long j3, long j4) {
        return Math.min(j4, (j + j2) - j3);
    }

    /* renamed from: d */
    private final void m99529d() {
        this.f116942c = 0;
        this.f116943d = -1;
    }

    /* renamed from: b */
    public final synchronized long mo63051b(long j) {
        mo63057e(j);
        return this.f116942c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo63054c() {
        this.f116945f.mo63040a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo63055c(long j) {
        return j <= this.f116942c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        return;
     */
    /* renamed from: e */
    public final synchronized void mo63057e(long j) {
        long j2 = this.f116943d;
        long j3 = 0;
        if (j2 != -1) {
            bfcs bfcs = this.f116941b;
            long j4 = bfcs.f113430b;
            long j5 = (j - j2) / j4;
            if (j5 >= 0) {
                j3 = bfcs.f113429a * j5;
                this.f116943d = (j5 * j4) + j2;
            }
        } else {
            j3 = this.f116941b.f113429a;
            this.f116943d = j;
        }
        long j6 = this.f116942c;
        long min = Math.min(j3 + j6, this.f116941b.f113431c);
        this.f116942c = min;
        if (min == j6) {
            if (j2 == this.f116943d) {
                return;
            }
        }
        String valueOf = String.valueOf(toString());
        if (valueOf.length() == 0) {
            new String("Adjusted: ");
        } else {
            "Adjusted: ".concat(valueOf);
        }
    }

    public final synchronized String toString() {
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        return String.format(Locale.US, "%s - current tokens: %d, last refill: %s, params: %s", this.f116944e, Long.valueOf(this.f116942c), simpleDateFormat.format(new Date(this.f116940a + this.f116943d)), this.f116941b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized bgom mo63044a(long j, long j2) {
        if (j >= 0) {
            mo63057e(j2);
            if (mo63050a(j, j2, false)) {
                this.f116942c = Math.max(0L, this.f116942c - j);
                return new bgom(this, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized bunb mo63052b() {
        return this.f116945f.mo63043c();
    }

    /* renamed from: d */
    public final synchronized long mo63056d(long j) {
        if (j < 0) {
            return 0;
        }
        long min = Math.min(j, this.f116941b.f113431c - this.f116942c);
        this.f116942c = Math.min(this.f116942c + min, this.f116941b.f113431c);
        return min;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    public final synchronized void mo63053b(long j, long j2) {
        if (j >= 0) {
            mo63057e(j2);
            this.f116942c = Math.max(0L, this.f116942c - j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bsax mo63045a() {
        return this.f116945f.mo63042b();
    }

    /* renamed from: a */
    public final synchronized void mo63046a(long j) {
        m99529d();
        mo63057e(j);
    }

    /* renamed from: a */
    public final synchronized void mo63047a(long j, long j2, long j3, bsax bsax) {
        bsax bsax2 = bsax;
        synchronized (this) {
            if (bsax2 != null) {
                long c = bsax2.mo70124c(2);
                long c2 = bsax2.mo70124c(1);
                if (m99528a(j2, j3, this.f116940a, j) + 86400000 < j || c == -1) {
                    m99529d();
                } else {
                    this.f116943d = m99528a(j2, c, this.f116940a, j);
                    this.f116942c = Math.min(this.f116941b.f113431c, c2);
                }
                mo63057e(j);
                return;
            }
            mo63046a(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo63048a(bfcs bfcs, long j) {
        mo63057e(j);
        long j2 = this.f116942c;
        long j3 = bfcs.f113431c;
        if (j2 > j3) {
            this.f116942c = j3;
        }
        String valueOf = String.valueOf(bfcs.toString());
        if (valueOf.length() == 0) {
            new String("Updated bucket parameters to ");
        } else {
            "Updated bucket parameters to ".concat(valueOf);
        }
        this.f116941b = bfcs;
    }

    /* renamed from: a */
    public final synchronized void mo63049a(bsax bsax) {
        bsax.mo70117b(1, this.f116942c);
        bsax.mo70117b(2, this.f116943d);
    }

    /* renamed from: a */
    public final synchronized boolean mo63050a(long j, long j2, boolean z) {
        boolean c;
        mo63057e(j2);
        c = mo63055c(j);
        if (z) {
            this.f116945f.mo63041a(!c);
        }
        return c;
    }
}
