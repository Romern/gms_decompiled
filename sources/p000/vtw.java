package p000;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;

/* renamed from: vtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vtw extends IntentOperation {

    /* renamed from: a */
    public vtt f49968a;

    /* renamed from: b */
    public vrb f49969b;

    public final void onCreate() {
        vuk.m41322a();
        this.f49969b = vuk.m41326e(getApplicationContext());
        vuk.m41322a();
        this.f49968a = vuk.m41328g(getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    public void onHandleIntent(Intent intent) {
        char c;
        if (intent.getAction() != null) {
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -480690540) {
                if (hashCode == 1918395325 && action.equals("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE")) {
                    c = 0;
                    if (c == 0) {
                        Log.i("CAR.DRIVINGMODE", "Snooze Driving Mode launch from notification.");
                        this.f49969b.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE);
                        vtt vtt = this.f49968a;
                        vtt.mo28854k();
                        long c2 = ccul.m131704c();
                        vtt.f49962a.mo25681b("CAR.DRIVINGMODE", 3, SystemClock.elapsedRealtime() + c2, vtt.mo28853j(), "");
                        C1099jb jbVar = new C1099jb(0, vtt.f49970c.getString(C0126R.string.car_driving_mode_common_turn_on), vtt.mo28851h());
                        C1099jb jbVar2 = new C1099jb(0, vtt.f49970c.getString(C0126R.string.car_driving_mode_notification_stop_title), vtt.mo28852i());
                        String a = vtt.mo28844a(c2, C0126R.plurals.car_driving_mode_notification_eta_mins, C0126R.plurals.car_driving_mode_notification_eta_secs);
                        C1102je f = vtt.mo28849f();
                        f.mo13632b(a);
                        C1101jd jdVar = new C1101jd();
                        jdVar.mo13593a(a);
                        f.mo13626a(jdVar);
                        f.mo13633b(true);
                        f.mo13624a(jbVar);
                        f.mo13624a(jbVar2);
                        vtt.mo28857a(50384636, f.mo13629b());
                        return;
                    } else if (c != 1) {
                        String valueOf = String.valueOf(intent.getAction());
                        Log.w("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Unexpected notification intent action received: ") : "Unexpected notification intent action received: ".concat(valueOf));
                        return;
                    } else {
                        this.f49968a.mo28846b();
                        this.f49968a.mo28845a();
                        return;
                    }
                }
            } else if (action.equals("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW")) {
                c = 1;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }
}
