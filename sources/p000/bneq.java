package p000;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: bneq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bneq extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f131543a;

    public bneq(Comparator comparator) {
        bmxy.m108581a(comparator);
        this.f131543a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f131543a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bneq) {
            return this.f131543a.equals(((bneq) obj).f131543a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131543a.hashCode();
    }

    public final String toString() {
        return this.f131543a.toString();
    }
}
