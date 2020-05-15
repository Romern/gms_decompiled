package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bbm implements bbl {

    /* renamed from: a */
    public final List f2844a;

    public bbm(Object obj) {
        this(Collections.singletonList(new beo(obj)));
    }

    /* renamed from: b */
    public final List mo2974b() {
        return this.f2844a;
    }

    /* renamed from: c */
    public final boolean mo2975c() {
        return this.f2844a.isEmpty() || (this.f2844a.size() == 1 && ((beo) this.f2844a.get(0)).mo3071d());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f2844a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f2844a.toArray()));
        }
        return sb.toString();
    }

    public bbm(List list) {
        this.f2844a = list;
    }
}
