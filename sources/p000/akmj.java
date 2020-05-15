package p000;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Base64;
import java.util.Map;

/* renamed from: akmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmj {
    /* renamed from: a */
    public static caey m60011a(String str) {
        try {
            return (caey) bxvk.m124016a(caey.f172871e, Base64.decode(str, 0), bxus.m123744c());
        } catch (bxwf e) {
            return caey.f172871e;
        }
    }

    /* renamed from: a */
    public static boolean m60013a(caey caey) {
        if (caey == null) {
            return false;
        }
        int i = caey.f172874b;
        return i == 2 || i == 1;
    }

    /* renamed from: a */
    public static String m60012a(PackageManager packageManager) {
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid.length > 1) {
            eoa.m10828c("NetRec", "Application trying to register as AuthenticationApp has more than one package for its UID, using first package in list.", new Object[0]);
        }
        return packagesForUid[0];
    }

    /* renamed from: a */
    public static boolean m60014a(caey caey, String str, Map map) {
        boolean z;
        caex caex;
        if (!m60013a(caey)) {
            return false;
        }
        if (caey.f172874b != 2 || !map.containsKey(str)) {
            z = false;
        } else {
            caex caex2 = (caex) map.get(str);
            if (caey.f172874b == 2) {
                caex = caex.m126562a(((Integer) caey.f172875c).intValue());
                if (caex == null) {
                    caex = caex.PACKAGE_ID_UNKNOWN;
                }
            } else {
                caex = caex.PACKAGE_ID_UNKNOWN;
            }
            if (!caex2.equals(caex)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z || (caey.f172874b == 1 && !((String) caey.f172875c).equals(str));
    }
}
