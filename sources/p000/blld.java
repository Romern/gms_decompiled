package p000;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: blld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blld implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;

    /* renamed from: a */
    public final String f126787a;

    /* renamed from: b */
    public final Long f126788b = null;

    public blld(String str) {
        this.f126787a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof blld) {
            blld blld = (blld) obj;
            if (Objects.equals(this.f126787a, blld.f126787a)) {
                Long l = blld.f126788b;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f126787a, null);
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("tokenValue", this.f126787a);
        a.mo66885a("expirationTimeMillis", (Object) null);
        return a.toString();
    }
}
