package p000;

import java.util.Arrays;

/* renamed from: dtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtc {

    /* renamed from: a */
    public final duu f13976a;

    /* renamed from: b */
    public final dri f13977b;

    /* renamed from: c */
    public final boolean f13978c;

    public dtc(duu duu, dri dri, boolean z) {
        this.f13976a = duu;
        this.f13977b = dri;
        this.f13978c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dtc) {
            dtc dtc = (dtc) obj;
            return this.f13976a.equals(dtc.f13976a) && this.f13977b.equals(dtc.f13977b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13976a, this.f13977b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("fncReg", this.f13976a);
        a.mo25396a("consK", this.f13977b);
        a.mo25396a("isExisting", Boolean.valueOf(this.f13978c));
        return a.toString();
    }
}
