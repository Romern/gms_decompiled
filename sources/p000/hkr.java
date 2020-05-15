package p000;

import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: hkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkr implements hep {

    /* renamed from: a */
    private final String f19956a;

    public hkr(String str) {
        sdo.m34977c(str);
        this.f19956a = str;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_RECORD_CANCELLED_SIGN_IN;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        try {
            hje hje = (hje) hje.f19881a.mo33309a();
            String str = this.f19956a;
            synchronized (hje.f19882b) {
                String a = hje.mo12575a(str);
                bnic c = bnfi.m109235a(bnnt.f131877a.mo68166b(bnfi.m109236a(bnfi.m109235a(hje.f19883c.getStringSet(a, new HashSet())).mo67501a(hiy.f19843a).mo67504a(), Arrays.asList(Long.valueOf(System.currentTimeMillis()))), (int) cccl.m129243b())).mo67501a(hiz.f19844a).mo67508c();
                hje.f19883c.edit().putStringSet(a, c).apply();
                c.size();
            }
            return bqga.m112775a((Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            throw adbe.m50106a(28442);
        }
    }
}
