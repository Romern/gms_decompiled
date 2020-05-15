package p000;

import java.util.Set;

/* renamed from: axwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwj {

    /* renamed from: a */
    final String f96602a;

    /* renamed from: b */
    final Set f96603b;

    public axwj(String str, Set set) {
        bmxy.m108581a(str);
        this.f96602a = str;
        bmxy.m108581a(set);
        this.f96603b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof axwj) {
            axwj axwj = (axwj) obj;
            if (this.f96602a.equals(axwj.f96602a)) {
                return this.f96603b.equals(axwj.f96603b);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f96602a.hashCode() * 31) + this.f96603b.hashCode();
    }
}
