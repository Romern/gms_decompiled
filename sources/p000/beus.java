package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: beus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beus {

    /* renamed from: a */
    public final beur f112544a;

    /* renamed from: b */
    public final int f112545b;

    public beus(beur beur, int i) {
        this.f112544a = beur;
        this.f112545b = i;
    }

    /* renamed from: a */
    public static int m95921a(List list, beur beur) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            beus beus = (beus) it.next();
            if (beus.f112544a == beur) {
                return beus.f112545b;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof beus)) {
            beus beus = (beus) obj;
            return this.f112544a == beus.f112544a && this.f112545b == beus.f112545b;
        }
    }

    public final int hashCode() {
        beur beur = this.f112544a;
        return (((beur != null ? beur.hashCode() : 0) + 31) * 31) + this.f112545b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f112544a);
        int i = this.f112545b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("ActivityResult [activity=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
