package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: chuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chuc {

    /* renamed from: a */
    public final List f189177a;

    /* renamed from: b */
    public final chqh f189178b;

    /* renamed from: c */
    public final chty f189179c;

    public chuc(List list, chqh chqh, chty chty) {
        this.f189177a = Collections.unmodifiableList(new ArrayList(list));
        bmxy.m108582a(chqh, "attributes");
        this.f189178b = chqh;
        this.f189179c = chty;
    }

    /* renamed from: a */
    public static chub m149577a() {
        return new chub();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chuc) {
            chuc chuc = (chuc) obj;
            if (!bmxi.m108538a(this.f189177a, chuc.f189177a) || !bmxi.m108538a(this.f189178b, chuc.f189178b) || !bmxi.m108538a(this.f189179c, chuc.f189179c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189177a, this.f189178b, this.f189179c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("addresses", this.f189177a);
        a.mo66885a("attributes", this.f189178b);
        a.mo66885a("serviceConfig", this.f189179c);
        return a.toString();
    }
}
