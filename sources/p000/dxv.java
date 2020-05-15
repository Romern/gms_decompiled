package p000;

import java.util.Map;

/* renamed from: dxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxv implements aubg {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        Map map = (Map) aucb.mo50386d();
        new Object[1][0] = map;
        if (sqw.m36042a(map)) {
            return aucu.m76778a((Object) null);
        }
        if (!map.isEmpty()) {
            return aema.m52142b(dwq.m9662f(), null).mo34288a((String[]) map.values().toArray(new String[map.size()])).mo50383b(dwq.m9667k().mo9432a(dqy.m9123a("StandardPlaceAliasManager_getPlacesByIds")), new dxx(map));
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dxy", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[StandardPlaceAliasManager] Cannot use getPlacesByIds with anonymous accounts.");
        return aucu.m76778a((Object) null);
    }
}
