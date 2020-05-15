package p000;

import java.util.Set;

/* renamed from: bnov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnov extends bnpd {

    /* renamed from: a */
    final /* synthetic */ Set f131937a;

    /* renamed from: b */
    final /* synthetic */ Set f131938b;

    public bnov(Set set, Set set2) {
        this.f131937a = set;
        this.f131938b = set2;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnou(this);
    }

    public final boolean contains(Object obj) {
        return this.f131937a.contains(obj) || this.f131938b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f131937a.isEmpty() && this.f131938b.isEmpty();
    }

    public final int size() {
        int size = this.f131937a.size();
        for (Object obj : this.f131938b) {
            if (!this.f131937a.contains(obj)) {
                size++;
            }
        }
        return size;
    }
}
