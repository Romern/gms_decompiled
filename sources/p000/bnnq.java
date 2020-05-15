package p000;

import java.util.Iterator;

/* renamed from: bnnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnq extends bnpc {

    /* renamed from: a */
    final /* synthetic */ bndm f131870a;

    public bnnq() {
    }

    public final void clear() {
        this.f131870a.clear();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof bnno) {
            bnno bnno = (bnno) obj;
            if (bnno.mo68118a() <= 0 || this.f131870a.mo67285a(bnno.f131866a) != bnno.mo68118a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f131870a.mo67289b();
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof bnno)) {
            return false;
        }
        bnno bnno = (bnno) obj;
        Object obj2 = bnno.f131866a;
        int a = bnno.mo68118a();
        if (a != 0) {
            return this.f131870a.mo67292c(obj2, a);
        }
        return false;
    }

    public final int size() {
        return this.f131870a.mo67291c();
    }

    public bnnq(bndm bndm) {
        this.f131870a = bndm;
    }
}
