package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: lhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lhf implements lhi {

    /* renamed from: a */
    public final Object f26101a = new Object();

    /* renamed from: b */
    public final Set f26102b = new LinkedHashSet();

    protected lhf() {
    }

    /* renamed from: a */
    public final void mo15074a(krf krf) {
        synchronized (this.f26101a) {
            this.f26102b.add(krf);
        }
    }
}
