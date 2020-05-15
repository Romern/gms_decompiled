package p000;

import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import java.util.Arrays;

/* renamed from: xfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfr {

    /* renamed from: a */
    public final KeyHandle f52138a;

    /* renamed from: b */
    public final bxtx f52139b;

    /* renamed from: c */
    public final bxtx f52140c;

    /* renamed from: d */
    public final bmxv f52141d;

    public xfr(KeyHandle keyHandle, bxtx bxtx, bxtx bxtx2, bmxv bmxv) {
        bmxy.m108581a(keyHandle);
        this.f52138a = keyHandle;
        bmxy.m108581a(bxtx);
        this.f52139b = bxtx;
        int a = bxtx.mo73744a();
        boolean z = true;
        bmxy.m108588a(a == 32);
        bmxy.m108581a(bxtx2);
        this.f52140c = bxtx2;
        bmxy.m108588a(bxtx2.mo73744a() != 32 ? false : z);
        this.f52141d = bmxv;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xfr) {
            xfr xfr = (xfr) obj;
            if (!bmxi.m108538a(this.f52138a, xfr.f52138a) || !bmxi.m108538a(this.f52139b, xfr.f52139b) || !bmxi.m108538a(this.f52140c, xfr.f52140c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52138a, this.f52139b, this.f52140c});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("keyHandle", this.f52138a);
        a.mo66885a("application", boan.f132472f.mo68794a(this.f52139b.mo73780k()));
        a.mo66885a("challenge", boan.f132472f.mo68794a(this.f52140c.mo73780k()));
        if (this.f52141d.mo66813a()) {
            a.mo66885a("clientData", this.f52141d.mo66814b());
        }
        return a.toString();
    }
}
