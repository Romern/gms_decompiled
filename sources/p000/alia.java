package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: alia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alia implements alhx {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final alhy mo40360a(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        bxwc bxwc = cfuf.f185724a.mo6606a().mo82737c().f165797a;
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            String str = (String) bxwc.get(i2);
            try {
                packageManager.getPackageInfo(str, 128);
                if (!str.equals("com.google.android.apps.walletnfcrel")) {
                    i = str.equals("com.google.android.apps.nbu.paisa.user") ? 4 : 9;
                } else {
                    i = 3;
                }
                return new alhy(true, i);
            } catch (PackageManager.NameNotFoundException e) {
                i2++;
            }
        }
        return new alhy(false, 2);
    }
}
