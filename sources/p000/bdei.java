package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bdei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdei {

    /* renamed from: a */
    public final Map f105414a = new HashMap();

    /* renamed from: a */
    public final bden mo57941a(bdeo bdeo) {
        bden bden = (bden) this.f105414a.get(bdeo);
        if (bden != null) {
            return bden;
        }
        String valueOf = String.valueOf(bdeo);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unregistered model: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
