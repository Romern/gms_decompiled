package p000;

import java.util.Arrays;

/* renamed from: axea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axea implements rjh {

    /* renamed from: a */
    public final int f95847a;

    public axea(int i) {
        this.f95847a = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof axea) && this.f95847a == ((axea) obj).f95847a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f95847a)});
    }
}
