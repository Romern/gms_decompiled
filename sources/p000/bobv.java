package p000;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: bobv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bobv implements Iterable, Serializable {
    /* renamed from: a */
    public static int m111053a(double d) {
        return bqcn.m112585b((long) d);
    }

    /* renamed from: c */
    public static void m111054c(int i) {
        bmxy.m108588a(i > 0);
    }

    /* renamed from: b */
    public abstract int mo68891b(int i);

    /* renamed from: d */
    public final int mo68897d(int i) {
        if (mo68890a(i)) {
            return mo68891b(i);
        }
        return -1;
    }

    public final Iterator iterator() {
        return new bobr(this);
    }

    /* renamed from: a */
    public boolean mo68890a(int i) {
        return mo68891b(i) >= 0;
    }
}
