package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: cjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjh implements cje {

    /* renamed from: b */
    public final Map f6936b;

    /* renamed from: c */
    public volatile Map f6937c;

    public cjh(Map map) {
        this.f6936b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjh) {
            return this.f6936b.equals(((cjh) obj).f6936b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6936b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6936b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
