package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cavi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cavi {

    /* renamed from: a */
    private final Set f176135a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo74960a(caup caup) {
        this.f176135a.add(caup);
    }

    /* renamed from: b */
    public final synchronized void mo74961b(caup caup) {
        this.f176135a.remove(caup);
    }

    /* renamed from: c */
    public final synchronized boolean mo74962c(caup caup) {
        return this.f176135a.contains(caup);
    }
}
