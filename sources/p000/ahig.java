package p000;

import java.util.Arrays;

/* renamed from: ahig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahig implements rjh, rjj {

    /* renamed from: a */
    public final String f67237a;

    public ahig(ahif ahif) {
        this.f67237a = ahif.f67236a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahig) {
            return sdg.m34949a(this.f67237a, ((ahig) obj).f67237a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67237a});
    }
}
