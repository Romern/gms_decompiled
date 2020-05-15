package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpo {

    /* renamed from: a */
    public final List f125077a;

    public bkpo(List list) {
        this.f125077a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkpo)) {
            return false;
        }
        return bkwv.m106780a(this.f125077a, ((bkpo) obj).f125077a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125077a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeEvent [updatedAttributes [");
        int size = this.f125077a.size();
        while (true) {
            size--;
            if (size >= 0) {
                sb.append(this.f125077a.get(size));
                if (size == 0) {
                    sb.append("]");
                } else {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
