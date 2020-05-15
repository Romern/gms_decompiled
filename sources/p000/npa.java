package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;

/* renamed from: npa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npa {

    /* renamed from: d */
    private static final String[] f36285d = {"com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps"};

    /* renamed from: a */
    private final Context f36286a;

    /* renamed from: b */
    private final olo f36287b;

    /* renamed from: c */
    private final oei f36288c;

    public npa(Context context, olo olo, oei oei) {
        this.f36286a = context;
        this.f36287b = olo;
        this.f36288c = oei;
    }

    /* renamed from: a */
    public final String mo21372a(String str) {
        char c;
        if (str.hashCode() == 1111982044 && str.equals("gmm_package_name")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return null;
        }
        CarInfo p = this.f36287b.mo21346p();
        CarUiInfo s = this.f36287b.mo21349s();
        PackageManager packageManager = this.f36286a.getPackageManager();
        String[] strArr = f36285d;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            try {
                packageManager.getPackageInfo(str2, 0);
                if (this.f36288c.mo22062c(p, s, str2, nhg.PROJECTION)) {
                    return str2;
                }
                i++;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return "";
    }
}
