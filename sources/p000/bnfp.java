package p000;

import java.util.Collection;
import java.util.Queue;

/* renamed from: bnfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfp extends bnfj implements Queue {
    protected bnfp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Queue mo67492a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo9243b() {
        throw null;
    }

    public final Object element() {
        return mo67492a().element();
    }

    public boolean offer(Object obj) {
        return mo67492a().offer(obj);
    }

    public final Object peek() {
        return mo67492a().peek();
    }

    public final Object poll() {
        return mo67492a().poll();
    }

    public final Object remove() {
        return mo67492a().remove();
    }
}
