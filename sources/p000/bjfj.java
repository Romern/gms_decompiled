package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: bjfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfj implements bjew {

    /* renamed from: a */
    private final Context f122626a;

    public bjfj(Context context) {
        this.f122626a = context;
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent;
        Intent intent2 = bjfc.f122612a;
        Intent intent3 = (Intent) intent2.getParcelableExtra("launchingIntent");
        bwsb bwsb = (bwsb) bjhq.m103510a(intent2, "appInfo", bwsb.f160826g);
        bwsc bwsc = bwsb.f160833f;
        if (bwsc == null) {
            bwsc = bwsc.f160834e;
        }
        String str = bwsb.f160829b;
        int i = 4;
        try {
            PackageInfo packageInfo = this.f122626a.getPackageManager().getPackageInfo(str, 64);
            if (bjys.m104925a(str, bwsc.f160837b, bwsc.f160838c, packageInfo.versionCode)) {
                if ((bwsc.f160836a & 4) != 0) {
                    if (!bjyt.m104927a(packageInfo, bwsc.f160839d)) {
                        i = 3;
                    }
                }
                if (bjys.m104924a(this.f122626a, str, intent3)) {
                    i = 0;
                }
            } else {
                i = 2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            i = 1;
        }
        if (i != 0) {
            intent = bjfd.m103295a(2);
            intent.putExtra("errorType", i);
        } else {
            intent = bjfd.m103295a(0);
        }
        return new bjfd(intent);
    }
}
