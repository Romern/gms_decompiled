package p000;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: ovp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovp extends Thread {

    /* renamed from: a */
    final /* synthetic */ ovq f38490a;

    public ovp(ovq ovq) {
        this.f38490a = ovq;
    }

    public final void run() {
        boolean z;
        String str;
        if (Log.isLoggable("CAR.SERVICE", 3)) {
            Log.d("CAR.SERVICE", "starting device capability check");
        }
        ovq ovq = this.f38490a;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) ovq.f38493c.getSystemService("activity")).getMemoryInfo(memoryInfo);
        int i = 1;
        if (memoryInfo.totalMem < 891289600) {
            long j = memoryInfo.totalMem;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Not supported: total mem ");
            sb.append(j);
            sb.append(" is lower than minimum 891289600");
            Log.w("CAR.SERVICE", sb.toString());
            z = false;
        } else {
            if (!ovq.mo22702b(8640000)) {
                Log.w("CAR.SERVICE", "device encoder failed in long iframe interval, trying short one");
                if (!ovq.mo22702b(60)) {
                    z = false;
                }
            }
            z = true;
        }
        if (Log.isLoggable("CAR.SERVICE", 4)) {
            int i2 = this.f38490a.f38492b;
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("check device capability result ");
            sb2.append(z);
            sb2.append(" iframe interval ");
            sb2.append(i2);
            Log.i("CAR.SERVICE", sb2.toString());
        }
        if (z) {
            ovq ovq2 = this.f38490a;
            npd npd = ovq2.f38494d;
            int i3 = ovq2.f38492b;
            SharedPreferences.Editor edit = npd.f36296c.edit();
            try {
                str = Integer.toString(npd.f36295b.getPackageManager().getPackageInfo(npd.f36295b.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                bnsi c = npd.f36292a.mo68388c();
                c.mo68432a("npd", "l", 433, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("cannot get package version");
                str = "unknown";
            }
            int i4 = Build.VERSION.SDK_INT;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 12);
            sb3.append(str);
            sb3.append(',');
            sb3.append(i4);
            edit.putString("car_device_support_projection", sb3.toString());
            edit.putInt("car_device_encoder_iframe_interval", i3);
            edit.apply();
        }
        ovq ovq3 = this.f38490a;
        if (!z) {
            i = 4;
        } else if (!ovq3.f38495e.mo22704b()) {
            i = 0;
        }
        ovq3.mo22701a(i);
    }
}
