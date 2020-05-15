package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: bndb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bndb extends bncx implements Set {

    /* renamed from: f */
    final /* synthetic */ bndd f131475f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bndb(bndd bndd, Object obj, Set set) {
        super(bndd, obj, set, null);
        this.f131475f = bndd;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = bnpf.m110053a((Set) this.f131468b, collection);
        if (a) {
            bndd.m109027a(this.f131475f, this.f131468b.size() - size);
            mo67217b();
        }
        return a;
    }
}
