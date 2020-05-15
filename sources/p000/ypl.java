package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ypl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypl implements ypj {

    /* renamed from: a */
    private final double f54335a;

    public ypl(double d) {
        this.f54335a = d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30649a(Iterable iterable) {
        double d;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yhu yhu = (yhu) it.next();
            yfu a = yhu.mo30509a(2);
            if (a.mo30437d()) {
                d = a.mo30435b();
            } else {
                d = 0.0d;
            }
            if (d < this.f54335a) {
                arrayList.add(yhu);
            }
        }
        return arrayList;
    }
}
