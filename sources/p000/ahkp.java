package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ahkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkp {
    /* renamed from: a */
    public static int m55985a(String str) {
        if ("android.permission.BLUETOOTH".equals(str)) {
            return 8030;
        }
        if ("android.permission.BLUETOOTH_ADMIN".equals(str)) {
            return 8031;
        }
        if ("android.permission.ACCESS_WIFI_STATE".equals(str)) {
            return 8032;
        }
        if ("android.permission.CHANGE_WIFI_STATE".equals(str)) {
            return 8033;
        }
        if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return 8034;
        }
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
            return 8036;
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
        bnsl.mo68432a("ahkp", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Need to add corresponding status code for missing permission %s", str);
        return 8;
    }

    /* renamed from: b */
    private static String m55989b(Context context, String str) {
        try {
            return spn.m35882e(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahkp", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", str);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m55986a(Context context, String str) {
        String str2;
        try {
            str2 = spn.m35882e(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahkp", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", str);
            str2 = null;
        }
        if (str2 == null) {
            bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
            bnsl2.mo68432a("ahkp", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("PermissionUtils deemed package %s as not whitelisted because its fingerprint couldn't be computed", str);
            return false;
        } else if (!"EDA6413C3E3A95492114FE07CD953AD897E40D1A".equalsIgnoreCase(str2)) {
            String bb = cfnv.f184625a.mo6606a().mo81810bb();
            if (!bb.isEmpty()) {
                String[] split = bb.split(",");
                for (String str3 : split) {
                    String[] split2 = str3.split(":");
                    if (split2.length != 2) {
                        bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68387b();
                        bnsl3.mo68432a("ahkp", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("PermissionUtils found malformed whitelist entry %s", str3);
                    } else if (split2[0].equals(str) && split2[1].equals(str2)) {
                        srn srn = ahkm.f67363a;
                        return true;
                    }
                }
            }
            return false;
        } else {
            srn srn2 = ahkm.f67363a;
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m55987a(Context context, String str, boolean z) {
        String str2;
        if (!z && !rfz.m33557a(context).mo24610b(str)) {
            try {
                str2 = spn.m35882e(context, str);
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ahkp", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("PermissionUtils couldn't find package %s while trying to compute its fingerprint", str);
                str2 = null;
            }
            if (str2 == null) {
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
                bnsl2.mo68432a("ahkp", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("PermissionUtils deemed package %s as not whitelisted because its fingerprint couldn't be computed", str);
            } else if (!"EDA6413C3E3A95492114FE07CD953AD897E40D1A".equalsIgnoreCase(str2)) {
                String bb = cfnv.f184625a.mo6606a().mo81810bb();
                if (!bb.isEmpty()) {
                    String[] split = bb.split(",");
                    for (String str3 : split) {
                        String[] split2 = str3.split(":");
                        if (split2.length != 2) {
                            bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68387b();
                            bnsl3.mo68432a("ahkp", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("PermissionUtils found malformed whitelist entry %s", str3);
                        } else if (split2[0].equals(str) && split2[1].equals(str2)) {
                            srn srn = ahkm.f67363a;
                        }
                    }
                }
            } else {
                srn srn2 = ahkm.f67363a;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m55988a(String str, String str2) {
        String bb = cfnv.f184625a.mo6606a().mo81810bb();
        if (!bb.isEmpty()) {
            String[] split = bb.split(",");
            for (String str3 : split) {
                String[] split2 = str3.split(":");
                if (split2.length != 2) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl.mo68432a("ahkp", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("PermissionUtils found malformed whitelist entry %s", str3);
                } else if (split2[0].equals(str) && split2[1].equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
