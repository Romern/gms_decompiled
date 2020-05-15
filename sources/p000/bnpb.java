package p000;

import java.util.Set;

/* renamed from: bnpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnpb extends bnpd {

    /* renamed from: a */
    final /* synthetic */ Set f131950a;

    /* renamed from: b */
    final /* synthetic */ Set f131951b;

    public bnpb(Set set, Set set2) {
        this.f131950a = set;
        this.f131951b = set2;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnpa(this, this.f131950a.iterator(), this.f131951b.iterator());
    }

    public final boolean contains(Object obj) {
        return this.f131951b.contains(obj) ^ this.f131950a.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f131950a.equals(this.f131951b);
    }

    public final int size() {
        int i = 0;
        for (Object obj : this.f131950a) {
            if (!this.f131951b.contains(obj)) {
                i++;
            }
        }
        for (Object obj2 : this.f131951b) {
            if (!this.f131950a.contains(obj2)) {
                i++;
            }
        }
        return i;
    }
}
