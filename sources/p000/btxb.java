package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: btxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxb {

    /* renamed from: a */
    public final List f152786a;

    /* renamed from: b */
    public final long f152787b;

    public btxb(List list, long j) {
        ArrayList arrayList = new ArrayList(list);
        this.f152786a = arrayList;
        Collections.sort(arrayList, Collections.reverseOrder(btxa.f152783c));
        this.f152787b = j;
    }

    /* renamed from: a */
    public final boolean mo72457a() {
        return !this.f152786a.isEmpty();
    }

    /* renamed from: b */
    public final btxa mo72458b() {
        if (mo72457a()) {
            return (btxa) this.f152786a.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btxb) {
            btxb btxb = (btxb) obj;
            if (!this.f152786a.equals(btxb.f152786a) || this.f152787b != btxb.f152787b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f152786a.hashCode();
        long j = this.f152787b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
