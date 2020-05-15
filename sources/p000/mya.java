package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: mya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mya {

    /* renamed from: a */
    public final Set f34919a = new HashSet();

    /* renamed from: b */
    private final Executor f34920b = new soc(3, 9);

    /* renamed from: a */
    public final void mo20306a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mo20307a((mvt) it.next());
        }
    }

    /* renamed from: a */
    public final void mo20307a(mvt mvt) {
        mxz mxz = new mxz(this, mvt);
        this.f34919a.add(mxz);
        mxz.executeOnExecutor(this.f34920b, new Void[0]);
    }
}
