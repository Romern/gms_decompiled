package p000;

import java.io.Serializable;

/* renamed from: bpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpj implements Serializable, bpb {

    /* renamed from: a */
    public final int f5314a;

    /* renamed from: b */
    public final bpo f5315b;

    public bpj(int i, bpo bpo) {
        this.f5314a = i;
        this.f5315b = bpo;
    }

    /* renamed from: a */
    public final bpo mo3349a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            bpj bpj = (bpj) obj;
            if (this.f5314a == bpj.f5314a) {
                bpo bpo = this.f5315b;
                bpo bpo2 = bpj.f5315b;
                if (bpo == bpo2 || bpo.equals(bpo2)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5314a + 93) * 31) + this.f5315b.hashCode();
    }
}
