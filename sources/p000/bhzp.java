package p000;

import java.util.Arrays;
import java.util.Set;

/* renamed from: bhzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzp {

    /* renamed from: a */
    public final Set f119978a;

    /* renamed from: b */
    public final int f119979b;

    /* renamed from: c */
    public final int f119980c;

    /* renamed from: d */
    public final int f119981d;

    /* renamed from: e */
    public final String f119982e;

    /* renamed from: f */
    public final boolean f119983f;

    public bhzp(Set set, int i, int i2, int i3, String str, boolean z) {
        this.f119978a = set;
        this.f119979b = i;
        this.f119980c = i2;
        this.f119981d = i3;
        this.f119982e = str;
        this.f119983f = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhzp) {
            bhzp bhzp = (bhzp) obj;
            if (sdg.m34949a(this.f119978a, bhzp.f119978a) && this.f119979b == bhzp.f119979b && this.f119980c == bhzp.f119980c && this.f119981d == bhzp.f119981d && sdg.m34949a(this.f119982e, bhzp.f119982e) && this.f119983f == bhzp.f119983f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119978a, Integer.valueOf(this.f119979b), Integer.valueOf(this.f119980c), Integer.valueOf(this.f119981d), this.f119982e, Boolean.valueOf(this.f119983f)});
    }
}
