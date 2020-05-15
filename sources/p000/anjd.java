package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.List;

/* renamed from: anjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjd {

    /* renamed from: a */
    private final svq f76989a;

    public anjd(svq svq) {
        this.f76989a = svq;
    }

    /* renamed from: a */
    public final boolean mo41865a(String str) {
        try {
            PackageInfo b = this.f76989a.mo26176b("com.android.vending", 0);
            long a = C1147kv.m18618a(b);
            if (str != null && !TextUtils.isEmpty(str.trim())) {
                for (String str2 : bmyx.m108644b(",").mo66920b().mo66918a((CharSequence) str)) {
                    List c = bmyx.m108644b(":").mo66920b().mo66925c((CharSequence) str2);
                    try {
                        if (c.isEmpty()) {
                            continue;
                        } else {
                            if (c.size() != 1) {
                                if (a >= Long.parseLong((String) c.get(0)) && a < Long.parseLong((String) c.get(1))) {
                                }
                            } else if (a != Long.parseLong((String) c.get(0))) {
                            }
                            return (b.applicationInfo.flags & 128) != 0;
                        }
                    } catch (NumberFormatException e) {
                        anjb.m64557b("NumberFormatException while parsing version list %s", e.getMessage());
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            anjb.m64557b("Invalid package name %s", e2.getMessage());
            return false;
        }
    }
}
