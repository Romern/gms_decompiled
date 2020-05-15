package p000;

import java.util.List;

/* renamed from: barx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class barx extends basa {

    /* renamed from: a */
    public final List f101647a;

    public barx(List list) {
        this.f101647a = list;
    }

    /* renamed from: a */
    public final List mo55914a() {
        return this.f101647a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof basa) {
            return this.f101647a.equals(((basa) obj).mo55914a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f101647a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f101647a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("LatestFootprintsFilter{secondaryIdMatchers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
