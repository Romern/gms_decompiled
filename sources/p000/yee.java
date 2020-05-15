package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yee {
    /* renamed from: a */
    public static List m43883a(List list, long j) {
        if (j <= 0) {
            return list;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yhg yhg = (yhg) it.next();
            if (yhg.mo30389c() >= nanos) {
                arrayList.add(yhg);
            }
        }
        return arrayList;
    }
}
