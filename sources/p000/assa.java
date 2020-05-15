package p000;

import java.util.Objects;

/* renamed from: assa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assa {

    /* renamed from: a */
    public final int f89551a;

    /* renamed from: b */
    public final int f89552b;

    public assa(int i, int i2) {
        this.f89551a = i;
        this.f89552b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof assa) {
            assa assa = (assa) obj;
            return this.f89551a == assa.f89551a && this.f89552b == assa.f89552b;
        }
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f89551a), Integer.valueOf(this.f89552b));
    }
}
