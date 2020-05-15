package p000;

import java.util.Arrays;

/* renamed from: xkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkg {

    /* renamed from: a */
    public final xkj f52499a;

    /* renamed from: b */
    public final xkh f52500b;

    public xkg(xkj xkj, xkh xkh) {
        sdo.m34959a(xkj);
        this.f52499a = xkj;
        if (!xkj.equals(xkj.CTAP1_ERR_SUCCESS)) {
            sdo.m34974b(xkh == null);
        }
        this.f52500b = xkh;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xkg) {
            xkg xkg = (xkg) obj;
            if (!bmxi.m108538a(this.f52499a, xkg.f52499a) || !bmxi.m108538a(this.f52500b, xkg.f52500b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52499a, this.f52500b});
    }
}
