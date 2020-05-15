package p000;

import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: ylc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylc {

    /* renamed from: a */
    public static final bngx f54018a = bngx.m109357a((Object) 7, (Object) 8);

    /* renamed from: b */
    public final long f54019b;

    public ylc(long j) {
        this.f54019b = TimeUnit.SECONDS.toNanos(j);
    }

    /* renamed from: a */
    public static yhu m44315a(ListIterator listIterator) {
        if (listIterator.hasNext()) {
            return (yhu) listIterator.next();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m44316a(yhu yhu, yhu yhu2) {
        return yhu.mo30387b() == yhu2.mo30385a() && yhu.mo30517j() == yhu2.mo30517j();
    }
}
