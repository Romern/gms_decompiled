package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: chsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chsr {

    /* renamed from: a */
    public final List f189108a;

    /* renamed from: b */
    public final chqh f189109b;

    /* renamed from: c */
    public final Object f189110c;

    public chsr(List list, chqh chqh, Object obj) {
        bmxy.m108582a(list, "addresses");
        this.f189108a = Collections.unmodifiableList(new ArrayList(list));
        bmxy.m108582a(chqh, "attributes");
        this.f189109b = chqh;
        this.f189110c = obj;
    }

    /* renamed from: a */
    public static chsq m149493a() {
        return new chsq();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chsr) {
            chsr chsr = (chsr) obj;
            if (!bmxi.m108538a(this.f189108a, chsr.f189108a) || !bmxi.m108538a(this.f189109b, chsr.f189109b) || !bmxi.m108538a(this.f189110c, chsr.f189110c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189108a, this.f189109b, this.f189110c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("addresses", this.f189108a);
        a.mo66885a("attributes", this.f189109b);
        a.mo66885a("loadBalancingPolicyConfig", this.f189110c);
        return a.toString();
    }
}
