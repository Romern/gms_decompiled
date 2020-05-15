package p000;

import java.util.List;

/* renamed from: xfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xfo {

    /* renamed from: c */
    public final Long f52131c;

    /* renamed from: d */
    public final int f52132d;

    public xfo(int i, Long l) {
        this.f52132d = i;
        this.f52131c = l;
    }

    /* renamed from: a */
    protected static String m42820a(List list) {
        return list != null ? list.toString().replace("[", "[\n  ").replace(", ", ",\n  ").replace("]", "\n]\n") : "null";
    }

    /* renamed from: a */
    public abstract bxtx mo29694a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xfo xfo = (xfo) obj;
            if (this.f52132d == xfo.f52132d) {
                Long l = this.f52131c;
                if (l != null) {
                    if (!l.equals(xfo.f52131c)) {
                        return false;
                    }
                } else if (xfo.f52131c != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f52132d + 31) * 31;
        Long l = this.f52131c;
        return i + (l != null ? l.hashCode() : 0);
    }
}
