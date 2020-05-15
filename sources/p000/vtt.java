package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.drivingmode.DrivingModeLocationNotificationIntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: vtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtt extends vtx {

    /* renamed from: a */
    public final skc f49962a;

    /* renamed from: b */
    public boolean f49963b;

    public vtt(Context context) {
        super(context);
        vuk.m41322a();
        this.f49962a = vuk.m41323b(context);
    }

    /* renamed from: b */
    private final PendingIntent m41278b(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(vqx.m41080a());
        return PendingIntent.getService(this.f49970c, 0, intent, 134217728);
    }

    /* renamed from: e */
    static boolean m41279e() {
        return ccrg.m131342b() && ceyg.f183508a.mo6606a().enableDrivingModeLaunchOneTapNotification();
    }

    /* renamed from: m */
    private final PendingIntent m41280m() {
        return m41278b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo28843a(String str) {
        Intent startIntent = IntentOperation.getStartIntent(this.f49970c, DrivingModeLocationNotificationIntentOperation.class, str);
        bmxy.m108581a(startIntent);
        return PendingIntent.getService(this.f49970c, 0, startIntent, 134217728);
    }

    /* renamed from: c */
    public final void mo28847c() {
        mo28858l().edit().putLong("last_cancel_timestamp", System.currentTimeMillis()).commit();
        mo28846b();
    }

    /* renamed from: d */
    public final C1102je mo28848d() {
        if (!m41279e()) {
            C1099jb jbVar = new C1099jb(0, this.f49970c.getString(C0126R.string.car_driving_mode_common_turn_on), mo28851h());
            C1099jb jbVar2 = new C1099jb(0, this.f49970c.getString(C0126R.string.car_driving_mode_notification_stop_title), mo28852i());
            C1099jb jbVar3 = new C1099jb(0, mo28844a(ccul.m131704c(), C0126R.plurals.car_driving_mode_notification_snooze_action_mins, C0126R.plurals.car_driving_mode_notification_snooze_action_secs), mo28843a("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE"));
            String a = mo28844a(ccul.m131703b(), C0126R.plurals.car_driving_mode_notification_eta_mins, C0126R.plurals.car_driving_mode_notification_eta_secs);
            C1102je f = mo28849f();
            f.mo13632b(a);
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(a);
            f.mo13626a(jdVar);
            f.mo13624a(jbVar3);
            f.mo13624a(jbVar2);
            f.mo13624a(jbVar);
            return f;
        }
        C1099jb jbVar4 = new C1099jb(0, this.f49970c.getString(C0126R.string.car_driving_mode_notification_not_driving_title), mo28852i());
        String string = this.f49970c.getString(C0126R.string.driving_detected_title);
        C1102je f2 = mo28849f();
        f2.mo13632b(string);
        C1101jd jdVar2 = new C1101jd();
        jdVar2.mo13593a(string);
        f2.mo13626a(jdVar2);
        f2.mo13624a(jbVar4);
        return f2;
    }

    /* renamed from: f */
    public final C1102je mo28849f() {
        PendingIntent h = mo28851h();
        PendingIntent i = mo28852i();
        C1102je d = super.mo28848d();
        d.mo13640e(m41279e() ? this.f49970c.getString(C0126R.string.car_driving_mode_notification_title_one_tap) : this.f49970c.getString(C0126R.string.car_driving_mode_notification_title));
        d.mo13634c();
        d.mo13620a(h);
        d.mo13631b(i);
        return d;
    }

    /* renamed from: g */
    public final int mo28850g() {
        return 50384636;
    }

    /* renamed from: h */
    public final PendingIntent mo28851h() {
        return m41278b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT");
    }

    /* renamed from: i */
    public final PendingIntent mo28852i() {
        return m41278b("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL");
    }

    /* renamed from: j */
    public final PendingIntent mo28853j() {
        return mo28843a("com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW");
    }

    /* renamed from: k */
    public final void mo28854k() {
        this.f49962a.mo25668a(mo28853j());
        this.f49962a.mo25668a(m41280m());
    }

    /* renamed from: b */
    public final void mo28846b() {
        super.mo28846b();
        mo28854k();
        this.f49963b = false;
    }

    /* renamed from: a */
    public final String mo28844a(long j, int i, int i2) {
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        if (minutes == 0) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
            return this.f49970c.getResources().getQuantityString(i2, seconds, Integer.valueOf(seconds));
        }
        return this.f49970c.getResources().getQuantityString(i, minutes, Integer.valueOf(minutes));
    }

    /* renamed from: a */
    public final void mo28845a() {
        Long valueOf = Long.valueOf(mo28858l().getLong("last_cancel_timestamp", 0));
        if (Long.valueOf(System.currentTimeMillis()).longValue() > valueOf.longValue() + Long.valueOf(ccul.f179984a.mo6606a().mo76840e()).longValue()) {
            super.mo28845a();
            Log.i("CAR.DRIVINGMODE", "Showing Driving Mode Launch notification.");
            vuk.m41322a();
            vuk.m41326e(this.f49970c).mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW);
            if (!m41279e()) {
                this.f49962a.mo25681b("CAR.DRIVINGMODE", 3, SystemClock.elapsedRealtime() + ccul.m131703b(), m41280m(), "");
            }
            this.f49963b = true;
            return;
        }
        Log.i("CAR.DRIVINGMODE", "Notification didn't match showing requirement; abort showing.");
    }
}
