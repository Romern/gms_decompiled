package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import java.util.Arrays;
import java.util.Set;

/* renamed from: bvee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvee {
    /* renamed from: a */
    public static void m121027a(Context context) {
        if (context != null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                int length = packagesForUid.length;
                int i = 0;
                while (i < length) {
                    String str = packagesForUid[i];
                    if (Binder.getCallingUid() != Process.myUid() && !m121028a(context, str)) {
                        if (cfos.m141992f()) {
                            if (m121028a(context, str)) {
                                return;
                            }
                        } else if (cfoa.m141098e() || m121029a(context, str, cfoa.f184773a.mo6606a().mo81866g())) {
                            return;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
            String valueOf = String.valueOf(Arrays.toString(packagesForUid));
            throw new SecurityException(valueOf.length() == 0 ? new String("Illegal package ") : "Illegal package ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private static boolean m121028a(Context context, String str) {
        if (!cfos.m141992f()) {
            return cfoa.m141098e() || m121029a(context, str, cfoa.f184773a.mo6606a().mo81872m());
        }
        return ahgv.m55731b(context, str);
    }

    /* renamed from: a */
    private static boolean m121029a(Context context, String str, String str2) {
        Set<ahgu> a = ahgv.m55730a(str2);
        try {
            String e = spn.m35882e(context, str);
            for (ahgu ahgu : a) {
                if (ahgu.f67190a.equals(str) && ahgu.f67191b.equalsIgnoreCase(e)) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
                    bnsl.mo68432a("bvee", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Allowing whitelisted package %s", str);
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("bvee", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Package not found: %s", str);
            return false;
        }
    }
}
