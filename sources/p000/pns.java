package p000;

import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pns {

    /* renamed from: a */
    public final InetSocketAddress f39876a;

    /* renamed from: b */
    public final Map f39877b = new HashMap();

    public pns(InetSocketAddress inetSocketAddress) {
        this.f39876a = inetSocketAddress;
    }

    /* renamed from: a */
    public final pno mo23508a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (pno) this.f39877b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23509a(pno pno) {
        this.f39877b.put(pno.f39857a, pno);
    }
}
