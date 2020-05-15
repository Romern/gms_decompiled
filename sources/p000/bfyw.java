package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;

/* renamed from: bfyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyw {

    /* renamed from: a */
    public final bfzt f115741a;

    public bfyw(Context context) {
        bfxc.m98131a(context);
        int i = bfzt.f115788E;
        synchronized (bfzt.class) {
            if (bfzt.f115787A == null) {
                bfzt.f115787A = new bfzt(context, new aytg());
                bfzt bfzt = bfzt.f115787A;
                bgal bgal = bfzt.f115905K;
                if (bgal != null) {
                    int i2 = 0;
                    for (bgak bgak : bgal.f115889j.values()) {
                        int i3 = 0;
                        for (; bgak != null; bgak = null) {
                            bgak bgak2 = bgak.f115879b;
                            i3++;
                        }
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    bgal.f115884d = new bgak[i2];
                    bgal.f115886f = new bgak[i2];
                    bgal.f115887h = 0;
                    for (bgak bgak3 = (bgak) bgal.f115889j.get(bgal.f115890k); bgak3 != null; bgak3 = null) {
                        bgak[] bgakArr = bgal.f115886f;
                        int i4 = bgal.f115887h;
                        bgakArr[i4] = bgak3;
                        bgak bgak4 = bgak3.f115879b;
                        bgal.f115887h = i4 + 1;
                    }
                    bgal.f115885e = -1;
                    bgal.mo62538a();
                    bgal.f115888i.mo62551c(bgal.obtainMessage(-2, bgal.f115881b));
                }
                bfzx bfzx = bfzt.f115819x;
                bfzx.f115842a.getContentResolver().registerContentObserver(aymk.f97976b, true, bfzx.f115843b);
                bfzx.f115842a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, bfzx.f115843b);
                bfwg bfwg = bfzt.f115808m.f115748f;
                bfwg.f115496b = rsk.m34333a(bfwg.f115498d, bfwg.f115495a, 2, new rsh());
                bfzt.f115807l.getApplicationContext().registerReceiver(bfzt.f115815t, bfzt.f115814s);
                int i5 = Build.VERSION.SDK_INT;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_FOREGROUND");
                intentFilter.addAction("android.intent.action.USER_BACKGROUND");
                bfzt.f115807l.getApplicationContext().registerReceiver(bfzt.f115815t, intentFilter);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter2.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
                intentFilter2.addDataScheme("package");
                bfzt.f115807l.getApplicationContext().registerReceiver(bfzt.f115815t, intentFilter2);
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
                bfzt.f115807l.getApplicationContext().registerReceiver(bfzt.f115815t, intentFilter3, "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
                IntentFilter intentFilter4 = new IntentFilter("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                intentFilter4.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                bfzt.f115807l.getApplicationContext().registerReceiver(bfzt.f115815t, intentFilter4);
                stw stw = new stw(bfzt.f115807l);
                if (cewp.f183479a.mo6606a().showMacAddressWhenDisconnected()) {
                    stw.mo26079a(new bfzj(bfzt));
                } else {
                    stw.mo26079a(new bfza(bfzt));
                }
            }
        }
        this.f115741a = bfzt.f115787A;
    }
}
