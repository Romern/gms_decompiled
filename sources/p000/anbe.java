package p000;

import java.util.Objects;

/* renamed from: anbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anbe {

    /* renamed from: a */
    public final amjf f76531a;

    /* renamed from: b */
    public final amkb f76532b;

    /* renamed from: c */
    public final amjd f76533c;

    public anbe(amjf amjf, amkb amkb, amjd amjd) {
        amjf amjf2 = amjf.UNSPECIFIED;
        this.f76531a = amjf;
        this.f76532b = amkb;
        this.f76533c = amjd;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbe) {
            anbe anbe = (anbe) obj;
            return this.f76531a == anbe.f76531a && this.f76532b == anbe.f76532b && this.f76533c == anbe.f76533c;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f76531a, this.f76532b, this.f76533c);
    }
}
