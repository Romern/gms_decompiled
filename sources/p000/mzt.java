package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: mzt */
final /* synthetic */ class mzt implements Callable {

    /* renamed from: a */
    private final nab f35062a;

    /* renamed from: b */
    private final PackageInfo f35063b;

    public mzt(nab nab, PackageInfo packageInfo) {
        this.f35062a = nab;
        this.f35063b = packageInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r5.length() == 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    public final Object call() {
        nab nab = this.f35062a;
        PackageInfo packageInfo = this.f35063b;
        nab.f35117x.mo19826a(3, packageInfo.packageName);
        int i = 0;
        if (nab.f35115v.mo19624a() == null) {
            nab.f35117x.mo19822a(4, 4);
        } else if (!nab.mo20370a(false)) {
            nab.f35117x.mo19823a(9, 4, nab.f35116w.f34946d);
            i = -1000;
        } else {
            String str = packageInfo.packageName;
            String str2 = null;
            try {
                ApplicationInfo applicationInfo = nab.f35110q.getPackageManager().getApplicationInfo(str, 128);
                if (applicationInfo.metaData != null) {
                    str2 = applicationInfo.metaData.getString("com.google.android.backup.api_key");
                }
                try {
                    if ((applicationInfo.flags & 1) == 0) {
                        if (str2 == null) {
                        }
                        sek sek = nab.f35075a;
                        String valueOf = String.valueOf(str);
                        sek.mo25416d(valueOf.length() == 0 ? new String("IGNORING WIPE without API key: ") : "IGNORING WIPE without API key: ".concat(valueOf), new Object[0]);
                        nab.f35117x.mo19822a(5, 4);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    sek sek2 = nab.f35075a;
                    String valueOf2 = String.valueOf(str);
                    sek2.mo25418e(valueOf2.length() != 0 ? new String("Unknown package in wipe request: ") : "Unknown package in wipe request: ".concat(valueOf2), new Object[0]);
                    nab.f35117x.mo19822a(10, 2);
                    nab.f35096c.mo19796a(str, str2).mo19793a("");
                    ncz.m25949b(nab.f35110q, str);
                    nbd.m25878a(nab.f35110q).mo20434b(str);
                    nbd.m25879b(nab.f35110q).mo20434b(str);
                    return Integer.valueOf(i);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                sek sek22 = nab.f35075a;
                String valueOf22 = String.valueOf(str);
                sek22.mo25418e(valueOf22.length() != 0 ? new String("Unknown package in wipe request: ") : "Unknown package in wipe request: ".concat(valueOf22), new Object[0]);
                nab.f35117x.mo19822a(10, 2);
                nab.f35096c.mo19796a(str, str2).mo19793a("");
                ncz.m25949b(nab.f35110q, str);
                nbd.m25878a(nab.f35110q).mo20434b(str);
                nbd.m25879b(nab.f35110q).mo20434b(str);
                return Integer.valueOf(i);
            }
            nab.f35096c.mo19796a(str, str2).mo19793a("");
            ncz.m25949b(nab.f35110q, str);
            try {
                nbd.m25878a(nab.f35110q).mo20434b(str);
                nbd.m25879b(nab.f35110q).mo20434b(str);
            } catch (IOException e3) {
                nab.f35075a.mo25415d("Unable to clear crypto state for %s", e3, str);
            }
        }
        return Integer.valueOf(i);
    }
}
