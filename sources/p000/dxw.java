package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: dxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxw implements aubg {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        if (aucb.mo50384b()) {
            rkj rkj = (rkj) aucb.mo50386d();
            if (rkj == null || sqw.m36041a((Collection) rkj.mo24811e())) {
                return aucu.m76778a((Object) null);
            }
            dub dub = new dub(rkj);
            String a = dub.mo9606a("Home");
            String a2 = dub.mo9606a("Work");
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put("Home", a);
            }
            if (a2 != null) {
                hashMap.put("Work", a2);
            }
            return aucu.m76778a(hashMap);
        }
        String valueOf = String.valueOf(aucb.mo50387e());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("getStandardAliases failed: ");
        sb.append(valueOf);
        sb.toString();
        return aucu.m76778a((Object) null);
    }
}
