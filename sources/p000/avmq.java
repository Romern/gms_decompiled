package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.RecoverySystem;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.gms.update.control.ChimeraGcmTaskService;

/* renamed from: avmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmq {

    /* renamed from: a */
    public static final Logger f93409a = avpq.m79017d("DeviceControl");

    /* renamed from: b */
    public static final avta f93410b = new avta("control.device.passive_device_idle_monitoring_enabled", false);

    /* renamed from: c */
    public static final avtk f93411c = new avtk("control.device.device_idle_at", -1L);

    /* renamed from: d */
    public static final avtk f93412d = new avtk("control.device.lskf_captured_at", -1L);

    /* renamed from: e */
    public static final avsz f93413e = new avmp();

    /* renamed from: h */
    private static final avtk f93414h = new avtk("control.device.reboot_count", 0L);

    /* renamed from: i */
    private static final avtk f93415i = new avtk("control.device.last_elapsed_realtime", -1L);

    /* renamed from: j */
    private static final avtk f93416j = new avtk("control.device.provisioned_at", 0L);

    /* renamed from: k */
    private static final avtk f93417k = new avtk("control.device.boot_count", -1L);

    /* renamed from: l */
    private static final avtk f93418l = new avtk("control.device.resume_on_reboot_prepared_at", -2L);

    /* renamed from: f */
    public final Context f93419f;

    /* renamed from: g */
    public final avtn f93420g = ((avtn) avtn.f93892a.mo51589b());

    public avmq(Context context) {
        this.f93419f = context;
    }

    /* renamed from: a */
    public final void mo51390a() {
        this.f93420g.mo51605a(f93410b.mo51602b(true));
        ChimeraGcmTaskService.m93713a(this.f93419f);
    }

    /* renamed from: b */
    public final void mo51392b() {
        this.f93420g.mo51606a(f93410b);
        ChimeraGcmTaskService.m93714b(this.f93419f);
    }

    /* renamed from: d */
    public final long mo51394d() {
        mo51398h();
        return ((Long) this.f93420g.mo51607b(f93414h)).longValue();
    }

    /* renamed from: e */
    public final long mo51395e() {
        mo51398h();
        return ((Long) this.f93420g.mo51607b(f93417k)).longValue();
    }

    /* renamed from: f */
    public final boolean mo51396f() {
        return ((Long) this.f93420g.mo51607b(f93418l)).longValue() == mo51395e();
    }

    /* renamed from: g */
    public final boolean mo51397g() {
        if (((Boolean) ((avmx) avmx.f93453h.mo51589b()).f93472k.mo51607b(avmx.f93451f)).booleanValue() || ((Long) this.f93420g.mo51607b(f93412d)).longValue() == ((avmq) f93413e.mo51589b()).mo51394d()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo51398h() {
        long j;
        Context context = this.f93419f;
        int i = Build.VERSION.SDK_INT;
        long j2 = (long) Settings.Global.getInt(context.getContentResolver(), "boot_count", -1);
        try {
            j = ((Long) this.f93420g.mo51607b(f93417k)).longValue();
        } catch (NumberFormatException e) {
            f93409a.mo25418e("Unexpected boot count data corruption.", new Object[0]);
            j = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) this.f93420g.mo51607b(f93415i)).longValue();
        this.f93420g.mo51605a(new avtc(f93417k, Long.valueOf(j2)), new avtc(f93415i, Long.valueOf(elapsedRealtime)));
        if ((j2 == -1 || j == -1 || j2 != j) && longValue != -1 && elapsedRealtime < longValue) {
            avtn avtn = this.f93420g;
            avtk avtk = f93414h;
            avtn.mo51605a(new avtc(avtk, Long.valueOf(((Long) this.f93420g.mo51607b(avtk)).longValue() + 1)));
        }
    }

    /* renamed from: a */
    public final void mo51391a(PendingIntent pendingIntent) {
        f93409a.mo25414c("Prepare resume on reboot.", new Object[0]);
        long e = mo51395e();
        Context context = this.f93419f;
        String valueOf = String.valueOf(e);
        IntentSender intentSender = pendingIntent.getIntentSender();
        if (!ssw.m36269a()) {
            f93409a.mo25416d("Attempting to use unattended reboot on unsupported platform", new Object[0]);
        } else {
            f93409a.mo25412b("Prepare reboot with update token: %s.", valueOf);
            RecoverySystem.prepareForUnattendedUpdate(context, valueOf, intentSender);
        }
        this.f93420g.mo51605a(f93418l.mo51602b(Long.valueOf(e)));
    }

    /* renamed from: c */
    public final long mo51393c() {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = ((Long) this.f93420g.mo51607b(f93416j)).longValue();
        if (longValue != 0 && longValue <= currentTimeMillis) {
            return longValue;
        }
        if (Settings.Secure.getInt(this.f93419f.getContentResolver(), "device_provisioned", 0) == 0) {
            currentTimeMillis = 0;
        }
        this.f93420g.mo51605a(f93416j.mo51602b(Long.valueOf(currentTimeMillis)));
        return currentTimeMillis;
    }
}
