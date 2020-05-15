package p000;

import java.util.Set;

/* renamed from: bnoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnoz extends bnpd {

    /* renamed from: a */
    final /* synthetic */ Set f131945a;

    /* renamed from: b */
    final /* synthetic */ Set f131946b;

    public bnoz(Set set, Set set2) {
        this.f131945a = set;
        this.f131946b = set2;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnoy(this);
    }

    public final boolean contains(Object obj) {
        return this.f131945a.contains(obj) && !this.f131946b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f131946b.containsAll(this.f131945a);
    }

    public final int size() {
        int i = 0;
        for (Object obj : this.f131945a) {
            if (!this.f131946b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
