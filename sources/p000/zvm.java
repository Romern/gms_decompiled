package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: zvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvm {
    /* renamed from: b */
    public static void m46573b(Context context, String str, cadu cadu) {
        boolean z;
        if (cadu != cadu.PERIODIC) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Don't enable periodic sync using trigger based syncs");
        if (ceab.m135731d()) {
            sre.m36089i(context);
            context.startService(zwd.m46606a(context, str, cadu));
        }
    }

    /* renamed from: a */
    public static void m46571a(Context context, String str) {
        boolean z;
        if (!ceab.f182124a.mo6606a().mo78650a()) {
            if (ceab.m135734g()) {
                z = zuq.m46520c(str);
            } else {
                sre.m36089i(context);
                z = zux.m46542c(str);
            }
            if (z) {
                return;
            }
        }
        if (ceab.m135734g()) {
            zuq.m46513a(context, str);
            return;
        }
        sre.m36089i(context);
        zux.m46540a(zux.m46539a(str));
        Bundle bundle = new Bundle();
        bundle.putBoolean("initialize", true);
        ContentResolver.requestSync(zux.m46539a(str), "com.google.android.gms.fitness", bundle);
    }

    /* renamed from: a */
    public static void m46572a(Context context, String str, cadu cadu) {
        boolean z;
        if (cadu != cadu.PERIODIC) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Don't enable periodic sync using trigger based syncs");
        yvq.m44915h(context);
        sre.m36089i(context);
        if (ceab.m135734g()) {
            zuq.m46514a(context, str, cadu);
            return;
        }
        if (!zux.m46542c(str)) {
            zux.m46540a(zux.m46539a(str));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        ContentResolver.requestSync(zux.m46539a(str), "com.google.android.gms.fitness", bundle);
    }
}
