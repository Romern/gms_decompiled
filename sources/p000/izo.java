package p000;

import java.util.Arrays;

/* renamed from: izo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izo implements rjh {

    /* renamed from: a */
    public final String f22005a;

    public izo(izn izn) {
        this.f22005a = izn.f22004a;
    }

    /* renamed from: a */
    public static izn m16377a() {
        return new izn();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof izo) {
            return sdg.m34949a(this.f22005a, ((izo) obj).f22005a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22005a});
    }
}
