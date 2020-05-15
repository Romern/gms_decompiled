package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bnox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnox extends bnpd {

    /* renamed from: a */
    final /* synthetic */ Set f131941a;

    /* renamed from: b */
    final /* synthetic */ Set f131942b;

    public bnox(Set set, Set set2) {
        this.f131941a = set;
        this.f131942b = set2;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnow(this);
    }

    public final boolean contains(Object obj) {
        return this.f131941a.contains(obj) && this.f131942b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f131941a.containsAll(collection) && this.f131942b.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.f131942b, this.f131941a);
    }

    public final int size() {
        int i = 0;
        for (Object obj : this.f131941a) {
            if (this.f131942b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
