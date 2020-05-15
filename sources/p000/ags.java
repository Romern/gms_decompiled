package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: ags */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ags {

    /* renamed from: a */
    final ArrayDeque f523a;

    /* renamed from: b */
    private final Runnable f524b;

    public ags() {
        this(null);
    }

    /* renamed from: a */
    public final void mo686a() {
        Iterator descendingIterator = this.f523a.descendingIterator();
        while (descendingIterator.hasNext()) {
            agp agp = (agp) descendingIterator.next();
            if (agp.f514a) {
                C1050hj hjVar = agp.f516c;
                hjVar.mo12535a(true);
                if (!hjVar.f19854e.f514a) {
                    hjVar.f19853d.mo686a();
                    return;
                } else {
                    hjVar.mo12548c();
                    return;
                }
            }
        }
        Runnable runnable = this.f524b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public ags(Runnable runnable) {
        this.f523a = new ArrayDeque();
        this.f524b = runnable;
    }
}
