package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ypo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypo implements ypj {

    /* renamed from: a */
    private final long f54339a;

    public ypo(long j) {
        this.f54339a = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30649a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        yhu yhu = null;
        boolean z = false;
        while (it.hasNext()) {
            yhu yhu2 = (yhu) it.next();
            if (yhu != null) {
                if (yhu2.mo30387b() - yhu.mo30387b() > this.f54339a) {
                    z = false;
                } else {
                    if (!z) {
                        arrayList.add(yhu);
                    }
                    arrayList.add(yhu2);
                    z = true;
                }
                yhu = yhu2;
            } else {
                yhu = yhu2;
            }
        }
        return arrayList;
    }
}
