package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aixt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixt {
    /* renamed from: a */
    public static boolean m58148a(Context context, String str) {
        if (cfos.m141992f()) {
            return ahgv.m55731b(context, str);
        }
        return cfop.m141873c() || m58149a(context, str, cfop.f185115a.mo6606a().mo82239r());
    }

    /* renamed from: b */
    private static Set m58152b(String str) {
        return sqw.m36047b(str.split(","));
    }

    /* renamed from: a */
    public static boolean m58149a(Context context, String str, String str2) {
        Set<ahgu> a = ahgv.m55730a(str2);
        try {
            String e = spn.m35882e(context, str);
            for (ahgu ahgu : a) {
                if (ahgu.f67190a.equals(str) && ahgu.f67191b.equalsIgnoreCase(e)) {
                    srn srn = ahfq.f67120a;
                    return true;
                }
            }
            srn srn2 = ahfq.f67120a;
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("aixt", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Package not found: %s", str);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m58150a(Context context, String str, Set set, String str2) {
        try {
            String e = spn.m35882e(context, str);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ahgu ahgu = (ahgu) it.next();
                if (ahgu.f67190a.equals(str) && ahgu.f67191b.equalsIgnoreCase(e)) {
                    srn srn = ahfq.f67120a;
                    return true;
                }
            }
            srn srn2 = ahfq.f67120a;
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("aixt", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Package not found: %s", str);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m58151a(String str) {
        if (str.startsWith("0p:")) {
            return !m58152b(cfop.f185115a.mo6606a().mo82219W()).contains(str);
        }
        return m58152b(cfop.f185115a.mo6606a().mo82241t()).contains(str);
    }
}
