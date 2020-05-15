package p000;

import java.util.Arrays;
import java.util.Set;

/* renamed from: uzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzt {

    /* renamed from: a */
    public final uzs f48780a;

    /* renamed from: b */
    public final Set f48781b;

    /* renamed from: c */
    public final String f48782c;

    public uzt(uzs uzs, Set set, String str) {
        sdo.m34959a(uzs);
        this.f48780a = uzs;
        sdo.checkIfNull(set, "Query can't have null spaces (have you validated them?)");
        this.f48781b = set;
        sdo.m34975b(!set.isEmpty(), "Query can't have empty spaces (have you validated them?)");
        this.f48782c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uzt uzt = (uzt) obj;
            return sdg.m34949a(this.f48780a, uzt.f48780a) && sdg.m34949a(this.f48781b, uzt.f48781b) && sdg.m34949a(this.f48782c, uzt.f48782c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48780a, this.f48781b, this.f48782c});
    }

    public final String toString() {
        return String.format("ApiaryFeedParameters[filter=%s, spaces=%s, orderBy=%s]", this.f48780a.f48779b, this.f48781b.toString(), this.f48782c);
    }
}
