package p000;

import java.util.Arrays;

/* renamed from: zse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zse {

    /* renamed from: a */
    public final long f55771a;

    /* renamed from: b */
    public final long f55772b;

    public zse(long j, long j2) {
        this.f55771a = j;
        this.f55772b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zse)) {
            return false;
        }
        zse zse = (zse) obj;
        return this.f55771a == zse.f55771a && this.f55772b == zse.f55772b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f55771a), Long.valueOf(this.f55772b)});
    }

    public final String toString() {
        return String.format("[%s-%s]", Long.valueOf(this.f55771a), Long.valueOf(this.f55772b));
    }
}
