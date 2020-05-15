package p000;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bukh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bukh {

    /* renamed from: a */
    static final Set f154082a = new HashSet();

    /* renamed from: e */
    public static final Comparator f154083e = new bukg();

    /* renamed from: b */
    public long f154084b = 0;

    /* renamed from: c */
    public Set f154085c = f154082a;

    /* renamed from: d */
    public final bumh f154086d = new bumh();

    /* renamed from: a */
    public final void mo72764a() {
        this.f154084b = 0;
        this.f154085c = f154082a;
        this.f154086d.mo72853a();
    }

    /* renamed from: b */
    public final boolean mo72766b() {
        Set set = this.f154085c;
        if (!(set == null || this.f154084b == 0 || set == f154082a)) {
            bumh bumh = this.f154086d;
            return (bumh.f154236a == Double.NEGATIVE_INFINITY || bumh.f154237b == Integer.MIN_VALUE) ? false : true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bukh) {
            bukh bukh = (bukh) obj;
            if (this.f154084b == bukh.f154084b) {
                Set set = this.f154085c;
                if (set == null ? bukh.f154085c == null : set.equals(bukh.f154085c)) {
                    return this.f154086d.equals(bukh.f154086d);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f154084b;
        int i = (int) (j ^ (j >>> 32));
        Set set = this.f154085c;
        if (set != null) {
            i = (i * 31) + set.hashCode();
        }
        return (i * 31) + this.f154086d.hashCode();
    }

    public final String toString() {
        long j = this.f154084b;
        String valueOf = String.valueOf(this.f154085c);
        double d = this.f154086d.f154236a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("s2cellid: ");
        sb.append(j);
        sb.append(" - apEntries: ");
        sb.append(valueOf);
        sb.append(" - logLikelihoodDelta: ");
        sb.append(d);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo72765a(bukh bukh) {
        this.f154084b = bukh.f154084b;
        this.f154085c = bukh.f154085c;
        bumh bumh = this.f154086d;
        bumh bumh2 = bukh.f154086d;
        bumh.f154236a = bumh2.f154236a;
        bumh.f154237b = bumh2.f154237b;
    }
}
