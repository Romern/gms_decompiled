package p000;

import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.SystemUpdateManager;
import android.text.format.Formatter;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.UpdateDescription;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: avmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmx {

    /* renamed from: A */
    private static final avta f93435A = new avta("control.installation.download_ignore_offpeak_window", false);

    /* renamed from: B */
    private static final avta f93436B = new avta("control.installation.ab_installation_ignore_device_idle_condition", false);

    /* renamed from: C */
    private static final avta f93437C = new avta("control.installation.installation_ignore_maintenance_window", false);

    /* renamed from: D */
    private static final avta f93438D = new avta("control.installation.ignore_server_postpone_ab_installation_config", false);

    /* renamed from: E */
    private static final avta f93439E = new avta("control.installation.ignore_optional_post_install", false);

    /* renamed from: F */
    private static final avta f93440F = new avta("control.installation.is_streaming", false);

    /* renamed from: G */
    private static final avto f93441G = new avto("control.installation.local_package_file_path", "");

    /* renamed from: H */
    private static final avtk f93442H = new avtk("control.installation.activity_started_at", -1L);

    /* renamed from: I */
    private static final avta f93443I = new avta("control.installation.activity_started_from_setup_wizard", false);

    /* renamed from: J */
    private static final avtk f93444J = new avtk("control.installation.auto_reboot_approved_at", -1L);

    /* renamed from: K */
    private static final avtk f93445K = new avtk("control.installation.auto_reboot_end_time", -1L);

    /* renamed from: a */
    public static final Logger f93446a = avpq.m79017d("InstallationControl");

    /* renamed from: b */
    public static final avto f93447b = new avto("control.installation.current_update_url", "");

    /* renamed from: c */
    public static final avtk f93448c = new avtk("control.installation.device_policy_updated_at", -1L);

    /* renamed from: d */
    public static final avtk f93449d = new avtk("control.installation.reboot_approved_at", -1L);

    /* renamed from: e */
    public static final avtg f93450e = new avtg("control.installation.status", 0);
    @Deprecated

    /* renamed from: f */
    public static final avta f93451f = new avta("control.installation.reboot_with_resume_prepared", false);

    /* renamed from: g */
    public static final avta f93452g = new avta("control.installation.encountered_recovery_system_install_exception", false);

    /* renamed from: h */
    public static final avsz f93453h = new avmw();

    /* renamed from: n */
    private static final long f93454n = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: o */
    private static final long f93455o = TimeUnit.HOURS.toMillis(1);

    /* renamed from: p */
    private static final long f93456p = TimeUnit.HOURS.toMillis(1);

    /* renamed from: q */
    private static final bnic f93457q = bnic.m109490a((Object) 528, (Object) 272);

    /* renamed from: r */
    private static final avtk f93458r = new avtk("control.installation.update_url_changed_at", 0L);

    /* renamed from: s */
    private static final avta f93459s = new avta("control.installation.download_approved", false);

    /* renamed from: t */
    private static final avtg f93460t = new avtg("control.installation.update_engine_status", -1);

    /* renamed from: u */
    private static final avtg f93461u = new avtg("control.installation.update_engine_completion_code", -1);

    /* renamed from: v */
    private static final avtb f93462v = new avtb("control.installation.progress", Double.valueOf(-1.0d));

    /* renamed from: w */
    private static final avtk f93463w = new avtk("control.installation.progress_notified_at", 0L);

    /* renamed from: x */
    private static final avta f93464x = new avta("control.installation.download_paused_by_user", false);

    /* renamed from: y */
    private static final avta f93465y = new avta("control.installation.ab_installation_paused_by_user", false);

    /* renamed from: z */
    private static final avta f93466z = new avta("control.installation.download_ignore_network_condition", false);

    /* renamed from: L */
    private final DevicePolicyManager f93467L;

    /* renamed from: M */
    private final avms f93468M;

    /* renamed from: N */
    private final skc f93469N;

    /* renamed from: i */
    public final Object f93470i = new Object();

    /* renamed from: j */
    public final Context f93471j;

    /* renamed from: k */
    public final avtn f93472k;

    /* renamed from: l */
    public final avmq f93473l;

    /* renamed from: m */
    public final Map f93474m;

    public avmx(Context context) {
        this.f93471j = context;
        this.f93472k = (avtn) avtn.f93892a.mo51589b();
        this.f93467L = (DevicePolicyManager) context.getSystemService("device_policy");
        this.f93468M = (avms) avms.f93422b.mo51589b();
        this.f93474m = new HashMap();
        this.f93469N = new skc(context);
        this.f93473l = (avmq) avmq.f93413e.mo51589b();
    }

    /* renamed from: a */
    private static String m78830a(String str) {
        Uri parse = Uri.parse(str);
        return parse != null ? parse.getPath() : str;
    }

    /* renamed from: c */
    private static final List m78832c(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        if (downloadOptions.f109446a) {
            arrayList.add(f93466z.mo51602b(true));
        }
        if (downloadOptions.f109447b) {
            arrayList.add(f93435A.mo51602b(true));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* renamed from: i */
    private final void m78834i() {
        int i;
        avsv avsv;
        this.f93471j.sendBroadcast(avmj.m78803a().putExtra("status", mo51414d().f109461c));
        if (cfsg.f185570a.mo6606a().mo82620D()) {
            this.f93471j.sendBroadcast(new Intent("com.google.android.update.SYSTEM_UPDATE").putExtra("status", mo51414d().f109461c));
        }
        synchronized (this.f93470i) {
            Iterator it = this.f93474m.entrySet().iterator();
            while (true) {
                i = 0;
                if (it.hasNext()) {
                    avkj avkj = (avkj) ((Map.Entry) it.next()).getValue();
                    if (avkj.asBinder().isBinderAlive()) {
                        try {
                            avkj.mo51332a(mo51414d());
                        } catch (RemoteException e) {
                            f93446a.mo25417e("Failed to trigger status update callback.", e, new Object[0]);
                        }
                    } else {
                        it.remove();
                    }
                }
            }
        }
        if (cfsg.f185570a.mo6606a().mo82619C()) {
            SystemUpdateStatus d = mo51414d();
            int i2 = Build.VERSION.SDK_INT;
            SystemUpdateManager systemUpdateManager = (SystemUpdateManager) this.f93471j.getSystemService("system_update");
            int i3 = d.f109461c;
            int i4 = Build.VERSION.SDK_INT;
            sdo.m34974b(true);
            if (i3 != 0) {
                if (i3 != 1) {
                    if (!(i3 == 2 || i3 == 3 || i3 == 4)) {
                        if (i3 != 5) {
                            if (!(i3 == 262 || i3 == 263 || i3 == 518 || i3 == 519 || i3 == 774 || i3 == 775 || i3 == 786 || i3 == 787 || i3 == 1298 || i3 == 1299)) {
                                switch (i3) {
                                    case 5:
                                    case 278:
                                    case 1555:
                                    case 1811:
                                    case 2067:
                                    case 2323:
                                    case 2579:
                                        break;
                                    case 15:
                                    case 267:
                                    case 779:
                                    case 784:
                                    case 1031:
                                    case 1035:
                                    case 1291:
                                    case 1296:
                                    case 1552:
                                    case 2059:
                                    case 2315:
                                    case 2571:
                                        break;
                                    case 1547:
                                    case 1803:
                                        break;
                                    default:
                                        switch (i3) {
                                            case 22:
                                            case 23:
                                            case 24:
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 272:
                                                        i = 4;
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 528:
                                                                i = 5;
                                                                break;
                                                            default:
                                                                switch (i3) {
                                                                }
                                                            case 529:
                                                            case 530:
                                                            case 531:
                                                                i = 3;
                                                                break;
                                                        }
                                                    case 273:
                                                    case 274:
                                                    case 275:
                                                        break;
                                                }
                                        }
                                }
                                avsw a = avou.m78959a();
                                int i5 = Build.VERSION.SDK_INT;
                                sdo.m34974b(true);
                                PersistableBundle persistableBundle = new PersistableBundle();
                                persistableBundle.putInt("status", i);
                                if (i != 1) {
                                    persistableBundle.putBoolean("is_security_update", ((Boolean) avma.f93362h.mo51364a()).booleanValue());
                                    persistableBundle.putString("title", (String) avma.f93355a.mo51364a());
                                }
                                avsv = a.f93871d;
                                if (avsv == null) {
                                    avsv = avsv.f93858g;
                                }
                                if (!avsv.f93865f.isEmpty()) {
                                    persistableBundle.putString("target_security_patch_level", avsv.f93865f);
                                }
                                if (!avsv.f93861b.isEmpty()) {
                                    persistableBundle.putString("target_build_fingerprint", bmxr.m108544a("|").mo66874a((Iterable) avsv.f93861b));
                                }
                                Bundle retrieveSystemUpdateInfo = systemUpdateManager.retrieveSystemUpdateInfo();
                                int i6 = Build.VERSION.SDK_INT;
                                sdo.m34974b(true);
                                for (String str : persistableBundle.keySet()) {
                                    if (!bmxi.m108538a(persistableBundle.get(str), retrieveSystemUpdateInfo.get(str))) {
                                        systemUpdateManager.updateSystemUpdateInfo(persistableBundle);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i = 3;
                    avsw a2 = avou.m78959a();
                    int i52 = Build.VERSION.SDK_INT;
                    sdo.m34974b(true);
                    PersistableBundle persistableBundle2 = new PersistableBundle();
                    persistableBundle2.putInt("status", i);
                    if (i != 1) {
                    }
                    avsv = a2.f93871d;
                    if (avsv == null) {
                    }
                    if (!avsv.f93865f.isEmpty()) {
                    }
                    if (!avsv.f93861b.isEmpty()) {
                    }
                    Bundle retrieveSystemUpdateInfo2 = systemUpdateManager.retrieveSystemUpdateInfo();
                    int i62 = Build.VERSION.SDK_INT;
                    sdo.m34974b(true);
                    while (r2.hasNext()) {
                    }
                }
                i = 2;
                avsw a22 = avou.m78959a();
                int i522 = Build.VERSION.SDK_INT;
                sdo.m34974b(true);
                PersistableBundle persistableBundle22 = new PersistableBundle();
                persistableBundle22.putInt("status", i);
                if (i != 1) {
                }
                avsv = a22.f93871d;
                if (avsv == null) {
                }
                if (!avsv.f93865f.isEmpty()) {
                }
                if (!avsv.f93861b.isEmpty()) {
                }
                Bundle retrieveSystemUpdateInfo22 = systemUpdateManager.retrieveSystemUpdateInfo();
                int i622 = Build.VERSION.SDK_INT;
                sdo.m34974b(true);
                while (r2.hasNext()) {
                }
            }
            i = 1;
            avsw a222 = avou.m78959a();
            int i5222 = Build.VERSION.SDK_INT;
            sdo.m34974b(true);
            PersistableBundle persistableBundle222 = new PersistableBundle();
            persistableBundle222.putInt("status", i);
            if (i != 1) {
            }
            avsv = a222.f93871d;
            if (avsv == null) {
            }
            if (!avsv.f93865f.isEmpty()) {
            }
            if (!avsv.f93861b.isEmpty()) {
            }
            Bundle retrieveSystemUpdateInfo222 = systemUpdateManager.retrieveSystemUpdateInfo();
            int i6222 = Build.VERSION.SDK_INT;
            sdo.m34974b(true);
            while (r2.hasNext()) {
            }
        }
    }

    /* renamed from: b */
    public final void mo51408b() {
        this.f93472k.mo51605a(f93464x.mo51602b(true));
        this.f93468M.mo51399a(106);
    }

    /* renamed from: d */
    public final SystemUpdateStatus mo51414d() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        ActivityStatus activityStatus;
        String str2;
        avmq avmq = (avmq) avmq.f93413e.mo51589b();
        long longValue = ((Long) this.f93472k.mo51607b(f93448c)).longValue();
        if (longValue == -1) {
            j = ((Long) this.f93472k.mo51607b(f93458r)).longValue();
        } else {
            j = longValue;
        }
        long longValue2 = ((Long) this.f93472k.mo51607b(f93442H)).longValue();
        if (longValue2 == -1 || longValue2 + f93455o < System.currentTimeMillis()) {
            z = false;
        } else {
            z = true;
        }
        String str3 = (String) this.f93472k.mo51607b(f93441G);
        if (!cfsg.f185570a.mo6606a().mo82638j() || bmxx.m108577a(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            str3 = (String) this.f93472k.mo51607b(f93447b);
        }
        int intValue = ((Integer) this.f93472k.mo51607b(f93450e)).intValue();
        int intValue2 = ((Integer) this.f93472k.mo51607b(f93460t)).intValue();
        int intValue3 = ((Integer) this.f93472k.mo51607b(f93461u)).intValue();
        double doubleValue = ((Double) this.f93472k.mo51607b(f93462v)).doubleValue();
        DownloadOptions downloadOptions = new DownloadOptions(((Boolean) this.f93472k.mo51607b(f93466z)).booleanValue(), ((Boolean) this.f93472k.mo51607b(f93435A)).booleanValue());
        double d = doubleValue;
        InstallationOptions installationOptions = new InstallationOptions(((Boolean) this.f93472k.mo51607b(f93436B)).booleanValue(), ((Boolean) this.f93472k.mo51607b(f93437C)).booleanValue(), ((Boolean) this.f93472k.mo51607b(f93438D)).booleanValue(), ((Boolean) this.f93472k.mo51607b(f93439E)).booleanValue());
        boolean booleanValue = ((Boolean) this.f93472k.mo51607b(f93459s)).booleanValue();
        boolean z4 = ((Long) this.f93472k.mo51607b(f93449d)).longValue() == ((avmq) avmq.f93413e.mo51589b()).mo51394d();
        boolean booleanValue2 = ((Boolean) this.f93472k.mo51607b(f93464x)).booleanValue();
        boolean booleanValue3 = ((Boolean) this.f93472k.mo51607b(f93465y)).booleanValue();
        boolean booleanValue4 = ((Boolean) this.f93472k.mo51607b(f93440F)).booleanValue();
        long longValue3 = ((Long) this.f93472k.mo51607b(f93458r)).longValue();
        long c = avmq.mo51393c();
        long longValue4 = ((Long) avmq.f93420g.mo51607b(avmq.f93411c)).longValue();
        if (!z || !((Boolean) this.f93472k.mo51607b(f93443I)).booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        ActivityStatus activityStatus2 = new ActivityStatus(z, z3);
        long longValue5 = ((Long) this.f93472k.mo51607b(f93458r)).longValue() + avlt.m78746a(this.f93471j);
        String n = cfsg.f185570a.mo6606a().mo82642n();
        boolean booleanValue5 = ((Boolean) avma.f93362h.mo51364a()).booleanValue();
        long longValue6 = ((Long) this.f93472k.mo51607b(f93444J)).longValue();
        String c2 = cfsj.m142903c();
        String str4 = (String) avma.f93355a.mo51364a();
        String str5 = (String) avma.f93357c.mo51364a();
        if (cfrx.m142746b() || (cftk.f185685a.mo6606a().mo82703a() && ((Long) avma.f93356b.mo51364a()).longValue() > 0)) {
            activityStatus = activityStatus2;
            str = n;
            str2 = Formatter.formatFileSize(this.f93471j, ((Long) avma.f93356b.mo51364a()).longValue());
        } else {
            str2 = cfsg.f185570a.mo6606a().mo82622F();
            activityStatus = activityStatus2;
            str = n;
        }
        return new SystemUpdateStatus(str3, z2, intValue, intValue2, intValue3, d, downloadOptions, installationOptions, booleanValue, z4, booleanValue2, booleanValue3, booleanValue4, longValue3, c, longValue4, j, activityStatus, longValue5, str, booleanValue5, longValue6, c2, new UpdateDescription(str4, str5, str2), avlw.m78757a(this.f93471j), mo51415e(), avlw.m78759b(this.f93471j) && avls.m78742h(this.f93471j) && ((avmq) avmq.f93413e.mo51589b()).mo51396f() && !((avmq) avmq.f93413e.mo51589b()).mo51397g());
    }

    /* renamed from: e */
    public final boolean mo51415e() {
        return this.f93473l.mo51394d() == ((Long) this.f93472k.mo51607b(f93444J)).longValue() && System.currentTimeMillis() <= ((Long) this.f93472k.mo51607b(f93445K)).longValue();
    }

    /* renamed from: f */
    public final void mo51416f() {
        this.f93468M.mo51399a(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
    }

    /* renamed from: g */
    public final boolean mo51417g() {
        String str = (String) this.f93472k.mo51607b(f93447b);
        String b = bmxx.m108578b((String) avma.f93358d.mo51364a());
        this.f93472k.mo51605a(new avtc(f93447b, b));
        if (m78830a(str).equals(m78830a(b))) {
            return false;
        }
        f93446a.mo25414c("Update URL changed from \"%s\" to \"%s\".", str, b);
        this.f93472k.mo51605a(new avtc(f93458r, Long.valueOf(System.currentTimeMillis())));
        mo51401a();
        mo51413c(!b.isEmpty());
        return true;
    }

    /* renamed from: h */
    public final boolean mo51418h() {
        return avlw.m78759b(this.f93471j) && avls.m78742h(this.f93471j);
    }

    /* renamed from: b */
    public final void mo51409b(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f93464x.mo51602b(false));
        arrayList.addAll(m78832c(downloadOptions));
        this.f93472k.mo51604a(arrayList);
        this.f93468M.mo51399a(107);
    }

    /* renamed from: a */
    private final void m78831a(long j) {
        int i = Build.VERSION.SDK_INT;
        skc skc = this.f93469N;
        Context context = this.f93471j;
        skc.mo25673a("NotificationActionControl-Alarm", 0, j, PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationIntentOperation", "com.google.android.gms.update.SCHEDULED_INSTALL"), 134217728));
    }

    /* renamed from: b */
    public final void mo51410b(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f93465y.mo51602b(false));
        arrayList.addAll(m78833c(installationOptions));
        this.f93472k.mo51604a(arrayList);
        this.f93468M.mo51399a(109);
    }

    /* renamed from: c */
    private static final List m78833c(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        if (installationOptions.f109448a) {
            arrayList.add(f93436B.mo51602b(true));
        }
        if (installationOptions.f109449b) {
            arrayList.add(f93437C.mo51602b(true));
        }
        if (installationOptions.f109450c) {
            arrayList.add(f93438D.mo51602b(true));
        }
        arrayList.add(f93439E.mo51602b(Boolean.valueOf(installationOptions.f109451d)));
        return arrayList;
    }

    /* renamed from: b */
    public final void mo51411b(boolean z) {
        long j;
        avtc[] avtcArr;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            avmc a = avmc.m78777a(cfsj.m142903c());
            if (z) {
                this.f93472k.mo51605a(f93444J.mo51602b(Long.valueOf(this.f93473l.mo51394d())), f93445K.mo51602b(Long.valueOf(a.mo51371c(currentTimeMillis) + currentTimeMillis)));
                ((avms) avms.f93422b.mo51589b()).mo51399a(111);
            }
            if (!mo51415e()) {
                f93446a.logVerbose("Auto reboot not scheduled (probably because of expiry or device reboot).", new Object[0]);
                return;
            }
            int i = mo51414d().f109461c;
            if (a.mo51368a(currentTimeMillis) && f93457q.contains(Integer.valueOf(i)) && !z) {
                boolean b = avlw.m78759b(this.f93471j);
                boolean h = avls.m78742h(this.f93471j);
                if (b && h && !this.f93473l.mo51397g()) {
                    avtn avtn = this.f93472k;
                    avtc[] avtcArr2 = new avtc[2];
                    avtcArr2[0] = f93444J.mo51602b(Long.valueOf(this.f93473l.mo51394d()));
                    avtk avtk = f93445K;
                    if (!a.mo51367a()) {
                        avtcArr = avtcArr2;
                        j2 = 0;
                    } else if (!a.mo51370b()) {
                        long millis = TimeUnit.MINUTES.toMillis(a.f93375d);
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(currentTimeMillis);
                        avtcArr = avtcArr2;
                        if (avmc.m78778d(currentTimeMillis) > avmc.m78778d(a.f93375d)) {
                            instance.add(5, 1);
                        }
                        if (a.mo51368a(currentTimeMillis)) {
                            instance.add(5, 1);
                        }
                        instance.set(11, (int) TimeUnit.MILLISECONDS.toHours(millis));
                        instance.set(12, (int) (TimeUnit.MILLISECONDS.toMinutes(millis) % 60));
                        instance.set(13, 0);
                        j2 = instance.getTimeInMillis() - currentTimeMillis;
                    } else {
                        avtcArr = avtcArr2;
                        j2 = Long.MAX_VALUE;
                    }
                    avtcArr[1] = avtk.mo51602b(Long.valueOf(j2 + currentTimeMillis));
                    avtn.mo51605a(avtcArr);
                    ((avms) avms.f93422b.mo51589b()).mo51399a(111);
                    long b2 = currentTimeMillis + a.mo51369b(currentTimeMillis);
                    f93446a.mo25414c("Re-attempt to restart the device at: %d.", Long.valueOf(b2));
                    m78831a(b2);
                    return;
                }
                this.f93472k.mo51606a(f93444J, f93445K);
                this.f93471j.startActivity(new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 2));
            } else if (z) {
                if (mo51418h() && !this.f93473l.mo51396f()) {
                    ((avmq) avmq.f93413e.mo51589b()).mo51391a(ReceiverIntentOperation.m93722b(this.f93471j));
                }
                if (a.mo51368a(currentTimeMillis)) {
                    j = currentTimeMillis + f93456p;
                } else {
                    j = currentTimeMillis + a.mo51369b(currentTimeMillis);
                }
                f93446a.mo25414c("Re-attempt to restart the device at: %d.", Long.valueOf(j));
                m78831a(j);
            }
        } catch (avlq e) {
            f93446a.mo25418e("Unable to parse restart time window: %s.", cfsj.m142903c());
        }
    }

    /* renamed from: a */
    public final void mo51401a() {
        this.f93472k.mo51606a(f93436B, f93465y, f93442H, f93443I, f93448c, f93459s, f93466z, f93435A, f93464x, f93437C, f93438D, f93439E, f93440F, f93462v, f93463w, f93449d, f93451f, f93450e, f93461u, f93460t, f93444J, f93445K, f93452g);
        m78834i();
        this.f93468M.mo51399a(102);
    }

    /* renamed from: a */
    public final void mo51402a(int i, double d) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) this.f93472k.mo51607b(f93463w)).longValue();
        int intValue = ((Integer) this.f93472k.mo51607b(f93450e)).intValue();
        avtn avtn = this.f93472k;
        avtg avtg = f93450e;
        Integer valueOf = Integer.valueOf(i);
        avtb avtb = f93462v;
        Double valueOf2 = Double.valueOf(d);
        avtn.mo51605a(avtg.mo51602b(valueOf), avtb.mo51602b(valueOf2));
        if (intValue != i || elapsedRealtime - longValue >= f93454n || elapsedRealtime < longValue) {
            f93446a.mo25414c("Installation progress updated to (0x%03X, %.3f).", valueOf, valueOf2);
            this.f93472k.mo51605a(f93463w.mo51602b(Long.valueOf(elapsedRealtime)));
            m78834i();
            this.f93468M.mo51399a(100);
        }
    }

    /* renamed from: c */
    public final void mo51412c() {
        this.f93472k.mo51605a(f93465y.mo51602b(true));
        this.f93468M.mo51399a(108);
    }

    /* renamed from: a */
    public final void mo51403a(int i, int i2) {
        Logger Logger = f93446a;
        Integer valueOf = Integer.valueOf(i);
        Logger.mo25414c("Update engine status updated to 0x%03X.", valueOf);
        if (((Integer) this.f93472k.mo51607b(f93460t)).intValue() != i || ((Integer) this.f93472k.mo51607b(f93461u)).intValue() != i2) {
            this.f93472k.mo51605a(f93460t.mo51602b(valueOf), f93461u.mo51602b(Integer.valueOf(i2)));
            this.f93468M.mo51399a(101);
        }
    }

    /* renamed from: c */
    public final void mo51413c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (z) {
            this.f93467L.notifyPendingSystemUpdate(((Long) this.f93472k.mo51607b(f93458r)).longValue());
        } else {
            this.f93467L.notifyPendingSystemUpdate(-1);
        }
    }

    /* renamed from: a */
    public final void mo51404a(ActivityStatus activityStatus) {
        if (activityStatus.f109420a) {
            this.f93472k.mo51605a(f93442H.mo51602b(Long.valueOf(System.currentTimeMillis())), f93443I.mo51602b(Boolean.valueOf(activityStatus.f109421b)));
        } else {
            this.f93472k.mo51606a(f93442H, f93443I);
        }
        ((avms) avms.f93422b.mo51589b()).mo51399a(110);
    }

    /* renamed from: a */
    public final void mo51405a(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f93459s.mo51602b(true));
        arrayList.addAll(m78832c(downloadOptions));
        this.f93472k.mo51604a(arrayList);
        this.f93468M.mo51399a(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
    }

    /* renamed from: a */
    public final void mo51406a(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f93449d.mo51602b(Long.valueOf(((avmq) avmq.f93413e.mo51589b()).mo51394d())));
        arrayList.addAll(m78833c(installationOptions));
        this.f93472k.mo51604a(arrayList);
        this.f93468M.mo51399a(ErrorInfo.TYPE_SDU_MEMORY_FULL);
    }

    /* renamed from: a */
    public final void mo51407a(boolean z) {
        this.f93472k.mo51605a(f93440F.mo51602b(Boolean.valueOf(z)));
    }
}
