package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: bnev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnev extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator[] f131548a;

    public bnev(Comparator comparator, Comparator comparator2) {
        this.f131548a = new Comparator[]{comparator, comparator2};
    }

    public final int compare(Object obj, Object obj2) {
        for (int i = 0; i < 2; i++) {
            int compare = this.f131548a[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnev) {
            return Arrays.equals(this.f131548a, ((bnev) obj).f131548a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f131548a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f131548a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb.append("Ordering.compound(");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }
}
