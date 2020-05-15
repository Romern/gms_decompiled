package p000;

import java.util.Objects;

/* renamed from: anbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbf {

    /* renamed from: a */
    public final int f76534a;

    /* renamed from: b */
    public final String f76535b;

    public anbf(int i, String str) {
        this.f76534a = i;
        this.f76535b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbf) {
            anbf anbf = (anbf) obj;
            return this.f76534a == anbf.f76534a && this.f76535b.equals(anbf.f76535b);
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f76534a), this.f76535b);
    }
}
