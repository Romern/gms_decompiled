package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxy extends dwm {

    /* renamed from: a */
    final Map f14379a = new HashMap();

    /* renamed from: a */
    private final aucb m9774a(ContextManagerClientInfo contextManagerClientInfo) {
        if (contextManagerClientInfo.mo18066a().mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dxy", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[StandardPlaceAliasManager] Cannot use Places Alias Fences with anonymous accounts.");
            return aucu.m76778a(Collections.emptyMap());
        }
        Context f = dwq.m9662f();
        aemh aemh = new aemh();
        aemh.f63515a = contextManagerClientInfo.f30678b;
        aemh.f63516b = contextManagerClientInfo.f30680d;
        aemh.f63518d = contextManagerClientInfo.f30677a;
        return aema.m52142b(f, aemh.mo34328a()).mo34287a().mo50383b(dwq.m9667k().mo9432a(dqy.m9123a("StandardPlaceAliasManager_getStandardAliases")), new dxw());
    }

    /* renamed from: a */
    public final aucb mo9841a(Map map) {
        if (!map.isEmpty()) {
            return aema.m52142b(dwq.m9662f(), null).mo34288a((String[]) map.values().toArray(new String[map.size()])).mo50383b(dwq.m9667k().mo9432a(dqy.m9123a("StandardPlaceAliasManager_getPlacesByIds")), new dxx(map));
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dxy", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[StandardPlaceAliasManager] Cannot use getPlacesByIds with anonymous accounts.");
        return aucu.m76778a((Object) null);
    }

    /* renamed from: a */
    public final Map mo9842a(doh doh) {
        return (Map) this.f14379a.get(doh);
    }
}
