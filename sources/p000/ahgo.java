package p000;

import java.util.Arrays;

/* renamed from: ahgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahgo {

    /* renamed from: a */
    final String f67172a;

    /* renamed from: b */
    final int f67173b;

    public ahgo(int i) {
        this.f67172a = null;
        this.f67173b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahgo) {
            ahgo ahgo = (ahgo) obj;
            return sdg.m34949a(this.f67172a, ahgo.f67172a) && sdg.m34949a(Integer.valueOf(this.f67173b), Integer.valueOf(ahgo.f67173b));
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        int i = this.f67172a;
        if (i == null) {
            i = 0;
        }
        objArr[0] = i;
        objArr[1] = Integer.valueOf(this.f67173b);
        return Arrays.hashCode(objArr);
    }

    public ahgo(String str, int i) {
        this.f67172a = str;
        this.f67173b = i;
    }
}
