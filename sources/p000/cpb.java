package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: cpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpb {

    /* renamed from: a */
    public final Set f11760a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List f11761b = new ArrayList();

    /* renamed from: c */
    public boolean f11762c;

    /* renamed from: a */
    public final boolean mo8078a(cpv cpv) {
        boolean z = true;
        if (cpv != null) {
            boolean remove = this.f11760a.remove(cpv);
            if (!this.f11761b.remove(cpv) && !remove) {
                z = false;
            }
            if (z) {
                cpv.mo8112b();
            }
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.f11760a.size();
        boolean z = this.f11762c;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 41);
        sb.append(obj);
        sb.append("{numRequests=");
        sb.append(size);
        sb.append(", isPaused=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
