package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: atcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcs {

    /* renamed from: a */
    public final long f90092a;

    /* renamed from: b */
    public final long f90093b;

    public atcs(long j, long j2) {
        this.f90092a = j;
        this.f90093b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atcs) {
            atcs atcs = (atcs) obj;
            return this.f90092a == atcs.f90092a && this.f90093b == atcs.f90093b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f90092a), Long.valueOf(this.f90093b)});
    }

    public final String toString() {
        return String.format(Locale.US, "[%dms - %dms]", Long.valueOf(this.f90092a), Long.valueOf(this.f90093b));
    }
}
