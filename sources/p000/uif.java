package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: uif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uif {

    /* renamed from: a */
    public Long f47676a;

    public uif(Long l) {
        this.f47676a = l;
        if (l != null) {
            sdo.m34974b(l.longValue() >= 0);
        }
    }

    /* renamed from: a */
    public static uif m38672a(long j) {
        return new uif(Long.valueOf(j));
    }

    /* renamed from: a */
    public final boolean mo27498a() {
        return this.f47676a != null;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uif uif = (uif) obj;
            Long l2 = this.f47676a;
            if (!(l2 == null || (l = uif.f47676a) == null)) {
                return l2.equals(l);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47676a});
    }

    public final String toString() {
        return String.format(Locale.US, "EntryKey[%s]", this.f47676a);
    }
}
