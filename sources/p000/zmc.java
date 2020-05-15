package p000;

import android.content.Context;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmc {

    /* renamed from: a */
    private static final srn f55440a = zvt.m46581a();

    /* renamed from: a */
    public static Set m45739a(Context context) {
        HashSet hashSet = new HashSet(yzq.m45107a(context).mo30874b().mo30715b());
        hashSet.remove("none");
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m45740a(zre zre, zrk zrk) {
        try {
            if (!zrk.mo31400b()) {
                return false;
            }
            HashSet hashSet = new HashSet();
            bnrd a = zrk.mo31396a().iterator();
            while (a.hasNext()) {
                hashSet.add(((yqe) a.next()).f54380a);
            }
            hashSet.removeAll((Collection) yvq.f54692a.mo30787a());
            if (hashSet.isEmpty()) {
                return zre.mo31349b() > 0;
            }
            return true;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55440a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error reading store while syncing");
            return false;
        }
    }
}
