package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bncl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncl extends bnmj {

    /* renamed from: a */
    final /* synthetic */ bncn f131444a;

    public bncl(bncn bncn) {
        this.f131444a = bncn;
    }

    /* renamed from: a */
    public final Map mo67129a() {
        return this.f131444a;
    }

    public final boolean contains(Object obj) {
        return bnec.m109118a(this.f131444a.f131448a.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new bncm(this.f131444a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        bndd bndd = this.f131444a.f131449b;
        Collection collection = (Collection) bnmt.m109806c(bndd.f131477a, ((Map.Entry) obj).getKey());
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        bndd.f131478b -= size;
        return true;
    }
}
