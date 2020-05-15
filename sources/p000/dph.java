package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: dph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dph {

    /* renamed from: a */
    public final HashMap f13741a = new HashMap();

    /* renamed from: a */
    public final void mo9378a() {
        this.f13741a.clear();
    }

    /* renamed from: b */
    public final Collection mo9381b() {
        return this.f13741a.values();
    }

    /* renamed from: a */
    public final boolean mo9379a(dpi dpi, dpg dpg) {
        HashMap hashMap = (HashMap) this.f13741a.get(dpi);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f13741a.put(dpi, hashMap);
        } else if (hashMap.containsKey(dpg.f13737a)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dph", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[AppIntervalMap] insertRecord: map already contains identical record");
            return false;
        }
        hashMap.put(dpg.f13737a, dpg);
        return true;
    }

    /* renamed from: a */
    public final boolean mo9380a(dpi dpi, dwa dwa) {
        if (this.f13741a.containsKey(dpi)) {
            return ((HashMap) this.f13741a.get(dpi)).containsKey(dwa);
        }
        return false;
    }
}
