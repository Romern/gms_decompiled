package p000;

import java.util.Arrays;

/* renamed from: aide */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aide {

    /* renamed from: a */
    private final Class f68791a;

    /* renamed from: b */
    private final rjk f68792b;

    public aide(rjx rjx, rjk rjk) {
        this.f68791a = rjx.getClass();
        this.f68792b = rjk;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aide) {
            aide aide = (aide) obj;
            return sdg.m34949a(this.f68791a, aide.f68791a) && sdg.m34949a(this.f68792b, aide.f68792b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68791a, this.f68792b});
    }
}
