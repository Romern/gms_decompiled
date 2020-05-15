package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: uih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uih {

    /* renamed from: a */
    public final String f47682a;

    /* renamed from: b */
    public final long f47683b;

    public uih(String str, long j) {
        this.f47682a = str;
        this.f47683b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uih uih = (uih) obj;
            return this.f47682a.equals(uih.f47682a) && this.f47683b == uih.f47683b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47682a, Long.valueOf(this.f47683b)});
    }

    public final String toString() {
        return String.format(Locale.US, "Account[%s, %d]", this.f47682a, Long.valueOf(this.f47683b));
    }
}
