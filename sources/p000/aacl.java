package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: aacl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacl {
    /* renamed from: a */
    public static synchronized void m21090a(bdpp bdpp, boolean z) {
        bmzi bmzi;
        ExecutorService executorService;
        float f;
        synchronized (aacl.class) {
            aacf aacf = new aacf(bdpp, z);
            boolean z2 = true;
            if (!aacf.f27923b) {
                bmzi = bmzn.m108683a(aach.f27932a);
            } else {
                bljl bljl = new bljl();
                if (cdoz.f181455a.mo6606a().mo78105R()) {
                    executorService = Executors.newSingleThreadExecutor(aacc.f27919a);
                } else {
                    executorService = sne.m35694a(5, 10);
                }
                bljl.f126677a = executorService;
                bljl.f126678b = snp.m35703a(1, 10);
                bljl.f126680d = true;
                bljl.f126682f = blkb.m107275a();
                bljl.f126683g = bmxv.m108566b(100);
                bljl.f126684h = aacf.f27926e;
                blkc blkc = new blkc();
                if (!aacf.f27925d) {
                    f = ((float) cdoz.f181455a.mo6606a().mo78110c()) * 0.001f;
                } else {
                    f = 1.0f;
                }
                blkc.f126723a = f;
                bljl.f126681e = blkc;
                if (aacf.f27922a.mo58264a()) {
                    bljl.mo66595a(new blkm(new aacd(aacf), blkb.m107275a()));
                }
                if (aacf.f27924c) {
                    int i = aytg.f98445a;
                    aaby aaby = new aaby(new Random());
                    aaby.mo16706a((int) cdoz.f181455a.mo6606a().mo78092E(), (int) cdoz.f181455a.mo6606a().mo78091D());
                    bljl.mo66595a(aaby);
                }
                bmzi = bmzn.m108683a(bljl.mo66594a());
            }
            aach.m21086a(bmzi);
            if (aacf.f27923b) {
                aabd aabd = aabc.f27869a;
                if (cdoz.f181455a.mo6606a().mo78101N()) {
                    if (!aabd.f27870a) {
                        rpr b = rpr.m34216b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.BATTERY_LOW");
                        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                        int i2 = Build.VERSION.SDK_INT;
                        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                        int i3 = Build.VERSION.SDK_INT;
                        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                        b.registerReceiver(aabd, intentFilter);
                        Intent registerReceiver = b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        if (registerReceiver != null) {
                            aabd.f27871b = Boolean.valueOf(registerReceiver.getIntExtra("plugged", 0) > 0);
                            aabd.f27873d = Boolean.valueOf(registerReceiver.getBooleanExtra("battery_low", false));
                        }
                        PowerManager powerManager = (PowerManager) b.getSystemService("power");
                        if (powerManager != null) {
                            aabd.f27872c = Boolean.valueOf(srf.m36092a(powerManager));
                        }
                        aabd.f27874e = aabd.m21046a(b);
                        aabd.f27875f = aabd.m21047b(b);
                        aabd.f27870a = true;
                    } else {
                        throw new IllegalStateException("DeviceStateMonitor initialized more than once.");
                    }
                }
            }
            if (cdoz.f181455a.mo6606a().mo78096I()) {
                int i4 = aytg.f98445a;
                aabx aabx = new aabx(snp.m35704b(10), new Random(), (int) cdoz.f181455a.mo6606a().mo78098K(), (int) cdoz.f181455a.mo6606a().mo78097J(), new sgf((int) cdoz.f181455a.mo6606a().mo78099L(), 5, 5));
                if (aabs.f27896b != aabs.f27895a) {
                    z2 = false;
                }
                bmxy.m108601b(z2, "already initialized");
                aabs.f27896b = aabx;
            }
        }
    }
}
