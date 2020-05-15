package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpm {

    /* renamed from: a */
    private final List f11773a = new ArrayList();

    /* renamed from: a */
    public final synchronized ccv mo8084a(Class cls) {
        ccv ccv;
        List list = this.f11773a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ccv = null;
                break;
            }
            cpl cpl = (cpl) list.get(i);
            i++;
            if (cpl.f11771a.isAssignableFrom(cls)) {
                ccv = cpl.f11772b;
                break;
            }
        }
        return ccv;
    }

    /* renamed from: a */
    public final synchronized void mo8085a(Class cls, ccv ccv) {
        this.f11773a.add(new cpl(cls, ccv));
    }
}
