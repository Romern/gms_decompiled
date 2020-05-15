package p000;

import android.util.Base64;
import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* renamed from: aecr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aecr implements bmxj {

    /* renamed from: a */
    private String f63172a = "";

    /* renamed from: b */
    private Map f63173b = bnoj.f131912b;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Map map;
        bxvp bxvp = (bxvp) obj;
        String L = chbh.f188248a.mo6606a().mo84930L();
        if (L == null) {
            L = "";
        }
        synchronized (this) {
            if (!this.f63172a.equals(L)) {
                try {
                    this.f63173b = Collections.unmodifiableMap(((byke) bxvk.m124016a(byke.f166739b, Base64.decode(L, 0), bxus.m123744c())).f166741a);
                    this.f63172a = L;
                } catch (bxwf | IllegalArgumentException e) {
                    Log.e("CachingPoliciesDecoder", "Could not decode sync policies", e);
                }
            }
            map = this.f63173b;
        }
        return (bylh) map.get(Integer.valueOf(bxvp.mo3214a()));
    }
}
