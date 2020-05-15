package p000;

import java.util.Arrays;

/* renamed from: eit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eit extends ejb {

    /* renamed from: a */
    public final String f15098a;

    /* renamed from: b */
    public final byte[] f15099b;

    /* renamed from: c */
    public final eie f15100c;

    public eit(String str, byte[] bArr, eie eie) {
        this.f15098a = str;
        this.f15099b = bArr;
        this.f15100c = eie;
    }

    /* renamed from: a */
    public final String mo10171a() {
        return this.f15098a;
    }

    /* renamed from: b */
    public final byte[] mo10172b() {
        return this.f15099b;
    }

    /* renamed from: c */
    public final eie mo10173c() {
        return this.f15100c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejb) {
            ejb ejb = (ejb) obj;
            if (this.f15098a.equals(ejb.mo10171a())) {
                return Arrays.equals(this.f15099b, ejb instanceof eit ? ((eit) ejb).f15099b : ejb.mo10172b()) && this.f15100c.equals(ejb.mo10173c());
            }
        }
    }

    public final int hashCode() {
        return ((((this.f15098a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15099b)) * 1000003) ^ this.f15100c.hashCode();
    }
}
