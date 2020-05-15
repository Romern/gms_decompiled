package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: bnfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfq extends bnfj implements Set {
    protected bnfq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Set mo67560a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo9243b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return obj == this || mo67560a().equals(obj);
    }

    public final int hashCode() {
        return mo67560a().hashCode();
    }
}
