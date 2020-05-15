package p000;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: ydu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydu implements yhg {

    /* renamed from: a */
    public final long f53673a;

    /* renamed from: b */
    public final long f53674b;

    /* renamed from: c */
    public final int f53675c;

    /* renamed from: d */
    public final caae f53676d;

    public ydu(long j, long j2, int i, caae caae) {
        this.f53673a = j;
        this.f53674b = j2;
        this.f53675c = i;
        this.f53676d = caae;
    }

    /* renamed from: a */
    public final long mo30385a() {
        return this.f53673a;
    }

    /* renamed from: a */
    public final long mo30386a(TimeUnit timeUnit) {
        return yhf.m44093a(this, timeUnit);
    }

    /* renamed from: b */
    public final long mo30387b() {
        return this.f53674b;
    }

    /* renamed from: b */
    public final long mo30388b(TimeUnit timeUnit) {
        return yhf.m44095b(this, timeUnit);
    }

    /* renamed from: c */
    public final long mo30389c() {
        return yhf.m44092a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ydu) {
            ydu ydu = (ydu) obj;
            return this.f53673a == ydu.f53673a && this.f53674b == ydu.f53674b && this.f53675c == ydu.f53675c && bmxi.m108538a(this.f53676d, ydu.f53676d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53673a), Long.valueOf(this.f53674b), Integer.valueOf(this.f53675c), this.f53676d});
    }
}
