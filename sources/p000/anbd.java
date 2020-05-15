package p000;

import java.util.Objects;

/* renamed from: anbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbd {

    /* renamed from: a */
    public ammz f76528a = ammz.UNSPECIFIED;

    /* renamed from: b */
    public final amjf f76529b;

    /* renamed from: c */
    public final boolean f76530c;

    public anbd(ammz ammz, amjf amjf, boolean z) {
        amjf amjf2 = amjf.UNSPECIFIED;
        this.f76528a = ammz;
        this.f76529b = amjf;
        this.f76530c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbd) {
            anbd anbd = (anbd) obj;
            return this.f76528a == anbd.f76528a && this.f76529b == anbd.f76529b && this.f76530c == anbd.f76530c;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f76528a, this.f76529b, Boolean.valueOf(this.f76530c));
    }
}
