package p000;

import java.util.Arrays;

/* renamed from: bedl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedl {

    /* renamed from: a */
    public final boolean f106975a;

    /* renamed from: b */
    public final boolean f106976b;

    public bedl(boolean z, boolean z2) {
        this.f106975a = z;
        this.f106976b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bedl) {
            bedl bedl = (bedl) obj;
            return bedl.f106975a == this.f106975a && bedl.f106976b == this.f106976b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f106975a), Boolean.valueOf(this.f106976b)});
    }

    public final String toString() {
        return String.format("{OnBodyDetection: %s, UserAuthentication: %s}", Boolean.valueOf(this.f106975a), Boolean.valueOf(this.f106976b));
    }
}
