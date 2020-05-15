package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bndr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bndr extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bnds f131495a;

    public bndr(bnds bnds) {
        this.f131495a = bnds;
    }

    public final void clear() {
        this.f131495a.mo67371a();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof bnqi) {
            bnqi bnqi = (bnqi) obj;
            Map map = (Map) bnmt.m109793a(this.f131495a.mo68267e(), bnqi.mo68323a());
            if (map == null || !bnec.m109118a(map.entrySet(), bnmt.m109797a(bnqi.mo68324b(), bnqi.mo68325c()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f131495a.mo67373c();
    }

    public final boolean remove(Object obj) {
        if (obj instanceof bnqi) {
            bnqi bnqi = (bnqi) obj;
            Map map = (Map) bnmt.m109793a(this.f131495a.mo68267e(), bnqi.mo68323a());
            if (map != null) {
                Set entrySet = map.entrySet();
                Map.Entry a = bnmt.m109797a(bnqi.mo68324b(), bnqi.mo68325c());
                bmxy.m108581a(entrySet);
                try {
                    if (entrySet.remove(a)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException e) {
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.f131495a.mo68266d();
    }
}
