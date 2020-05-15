package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: chqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqx {

    /* renamed from: a */
    public static final chqs f189019a = new chqu();

    /* renamed from: a */
    public static chqp m149438a(chqp chqp, List list) {
        bmxy.m108582a(chqp, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chqp = new chqw(chqp, (chqt) it.next());
        }
        return chqp;
    }

    /* renamed from: a */
    public static chqp m149439a(chqp chqp, chqt... chqtArr) {
        return m149438a(chqp, Arrays.asList(chqtArr));
    }
}
