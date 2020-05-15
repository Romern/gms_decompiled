package p000;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: bcdb */
final /* synthetic */ class bcdb implements Callable {

    /* renamed from: a */
    private final bcdf f103977a;

    public bcdb(bcdf bcdf) {
        this.f103977a = bcdf;
    }

    public final Object call() {
        bcdf bcdf = this.f103977a;
        bdae bdae = bcdf.f103992b;
        bcde bcde = bcdf.f103994d;
        Cursor a = bdae.mo54677a(bcde.f103982c, bcde.f103983d, bcde.f103984e, bcde.f103985f, bcde.f103986g, bcde.f103987h);
        try {
            Object apply = bcdf.f103994d.f103980a.apply(a);
            if (a != null) {
                a.close();
            }
            return apply;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
