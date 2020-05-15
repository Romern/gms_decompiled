package p000;

import java.util.Arrays;

/* renamed from: bkrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkrw {

    /* renamed from: a */
    private final bkqo f125183a;

    /* renamed from: b */
    private final bkqo f125184b;

    public bkrw(bkqo bkqo, bkqo bkqo2) {
        this.f125183a = bkqo;
        this.f125184b = bkqo2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkrw)) {
            return false;
        }
        bkrw bkrw = (bkrw) obj;
        bkqo bkqo = this.f125183a;
        bkqo bkqo2 = bkrw.f125183a;
        if ((bkqo == bkqo2 && this.f125184b == bkrw.f125184b) || (bkqo == bkrw.f125184b && this.f125184b == bkqo2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.f125183a);
        int identityHashCode2 = System.identityHashCode(this.f125184b);
        if (identityHashCode < identityHashCode2) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(identityHashCode), Integer.valueOf(identityHashCode2)});
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(identityHashCode2), Integer.valueOf(identityHashCode)});
    }
}
