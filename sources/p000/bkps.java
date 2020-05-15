package p000;

import java.util.Arrays;

/* renamed from: bkps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkps implements Comparable {

    /* renamed from: a */
    public final blhg f125085a;

    /* renamed from: b */
    public final long f125086b;

    /* renamed from: c */
    public final int f125087c;

    /* renamed from: d */
    public final String f125088d;

    /* renamed from: e */
    public final int f125089e;

    /* renamed from: f */
    public final Long f125090f;

    public bkps(blhg blhg, long j, int i, String str, int i2, Long l) {
        boolean z;
        bkww.m106781a(blhg, "operation");
        this.f125085a = blhg;
        this.f125086b = j;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106782a(z, "revision must be nonnegative");
        this.f125087c = i;
        this.f125088d = str;
        this.f125089e = i2;
        this.f125090f = l;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f125087c - ((bkps) obj).f125087c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkps)) {
            return false;
        }
        bkps bkps = (bkps) obj;
        return bkwv.m106780a(this.f125085a, bkps.f125085a, Long.valueOf(this.f125086b), Long.valueOf(bkps.f125086b), Integer.valueOf(this.f125087c), Integer.valueOf(bkps.f125087c), this.f125088d, bkps.f125088d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125085a, Long.valueOf(this.f125086b), Integer.valueOf(this.f125087c), this.f125088d});
    }
}
