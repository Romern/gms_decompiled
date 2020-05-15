package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: wrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrw {
    /* renamed from: a */
    public static boolean m42188a(Context context) {
        if (!cfoj.m141545Z() || !new burh(context).mo73038b()) {
            return false;
        }
        if (rfz.m33557a(context).mo24610b("com.google.location.nearby.apps.fastpair.autotest")) {
            return true;
        }
        bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
        bnsl.mo68432a("wrw", "a", 28, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("AutoTestChecker: Auto test is not Google signed, check if it's local build");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.location.nearby.apps.fastpair.autotest", 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68388c();
                bnsl2.mo68432a("wrw", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("AutoTestChecker: Auto test should only have one signature!");
                return false;
            }
            boolean equals = cfog.f184854a.mo6606a().mo82026d().equals(packageInfo.signatures[0].toCharsString());
            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68388c();
            bnsl3.mo68432a("wrw", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("AutoTestChecker: isNearByDevSigned=%b", Boolean.valueOf(equals));
            return equals;
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl4 = (bnsl) wtw.f51331a.mo68388c();
            bnsl4.mo68437a(e);
            bnsl4.mo68432a("wrw", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("AutoTestChecker: Auto test package not found!");
            return false;
        }
    }
}
