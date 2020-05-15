package p000;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.VersionedPackage;
import android.content.rollback.PackageRollbackInfo;
import android.content.rollback.RollbackInfo;
import android.content.rollback.RollbackManager;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phonesky.recovery.NotificationClickedIntentOperation;
import com.google.android.gms.phonesky.recovery.RollbackCommittedIntentOperation;
import java.util.Iterator;
import java.util.List;

/* renamed from: anjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjf {

    /* renamed from: a */
    private final Context f76991a;

    /* renamed from: b */
    private final anjg f76992b;

    /* renamed from: c */
    private final anjd f76993c;

    /* renamed from: d */
    private final anje f76994d;

    public anjf(Context context) {
        anjg anjg = new anjg(context, new anje(context));
        anjd anjd = new anjd(new svq(context));
        anje anje = new anje(context);
        this.f76991a = context;
        this.f76992b = anjg;
        this.f76993c = anjd;
        this.f76994d = anje;
    }

    /* renamed from: a */
    public final void mo41868a() {
        if (sre.m36082b(this.f76991a) && !cgez.f186703a.mo6606a().mo83579c()) {
            anjb.m64557b("Latchsky device, recovery not supported", new Object[0]);
        } else if (!m64564b()) {
            long b = anjc.m64559b(this.f76991a);
            boolean a = this.f76993c.mo41865a(cgez.m144971c());
            if (b != -1) {
                long currentTimeMillis = System.currentTimeMillis() - b;
                if (currentTimeMillis < cgez.m144970b() && !a) {
                    anjc.m64560c(this.f76991a);
                    this.f76994d.mo41866a(4);
                    anjb.m64556a("Package successfully uninstalled", new Object[0]);
                    return;
                } else if (currentTimeMillis < cgez.f186703a.mo6606a().mo83578b()) {
                    anjb.m64557b("Notification recently shown", new Object[0]);
                    return;
                }
            }
            this.f76992b.mo41870a();
            anjc.m64560c(this.f76991a);
            if (a) {
                anjb.m64556a("Should show recovery notification", new Object[0]);
                anjg anjg = this.f76992b;
                if (anjg.f76997c.mo66813a()) {
                    int i = Build.VERSION.SDK_INT;
                    if (((sex) anjg.f76997c.mo66814b()).mo25437a("com.google.android.gms.phonesky.recovery.ShowNotification") == null) {
                        ((sex) anjg.f76997c.mo66814b()).mo25442a(new NotificationChannel("com.google.android.gms.phonesky.recovery.ShowNotification", anjg.mo41869a(C0126R.string.notification_channel_name), 2));
                    }
                    Context context = anjg.f76995a;
                    PendingIntent service = PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, NotificationClickedIntentOperation.class, "com.google.android.gms.phonesky.recovery.CLICK"), 134217728);
                    C1102je jeVar = new C1102je(anjg.f76995a, "com.google.android.gms.phonesky.recovery.ShowNotification");
                    jeVar.mo13630b(qkj.m32287a(anjg.f76995a, C0126R.C0127drawable.quantum_ic_play_prism_grey600_24));
                    jeVar.mo13633b(true);
                    jeVar.f22258j = -1;
                    jeVar.mo13640e(anjg.mo41869a(C0126R.string.notification_content_title));
                    jeVar.mo13632b(anjg.mo41869a(C0126R.string.notification_content_text));
                    jeVar.f22254f = service;
                    jeVar.mo13618a(qkj.m32287a(anjg.f76995a, C0126R.C0127drawable.quantum_ic_done_grey600_24), anjg.mo41869a(C0126R.string.common_continue), service);
                    int i2 = Build.VERSION.SDK_INT;
                    Bundle bundle = new Bundle();
                    bundle.putString("android.substName", anjg.mo41869a(C0126R.string.notification_app_name));
                    jeVar.mo13623a(bundle);
                    ((sex) anjg.f76997c.mo66814b()).mo25441a(1, jeVar.mo13629b());
                    Context context2 = anjg.f76995a;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    SharedPreferences.Editor edit = anjc.m64558a(context2).edit();
                    edit.putLong("last_shown_timestamp_ms", currentTimeMillis2);
                    edit.apply();
                    anjg.f76996b.mo41866a(2);
                    return;
                }
                anjb.m64557b("Missing NotificationManager", new Object[0]);
                anjg.f76996b.mo41867a(2, 3);
            }
        }
    }

    /* renamed from: b */
    private final boolean m64564b() {
        anja anja;
        if (!ssw.m36269a() || !cgez.f186703a.mo6606a().mo83577a() || !this.f76993c.mo41865a(cgez.m144971c())) {
            return false;
        }
        this.f76994d.mo41866a(5);
        RollbackManager rollbackManager = (RollbackManager) this.f76991a.getSystemService("rollback");
        if (rollbackManager == null) {
            this.f76994d.mo41867a(6, 3);
            anjb.m64557b("Failed to get RollbackManager", new Object[0]);
            return false;
        }
        List availableRollbacks = rollbackManager.getAvailableRollbacks();
        if (availableRollbacks == null || availableRollbacks.isEmpty()) {
            this.f76994d.mo41866a(7);
            anjb.m64556a("No rollback is available", new Object[0]);
            return false;
        }
        Iterator it = availableRollbacks.iterator();
        while (true) {
            if (!it.hasNext()) {
                anja = null;
                break;
            }
            RollbackInfo rollbackInfo = (RollbackInfo) it.next();
            Iterator it2 = rollbackInfo.getPackages().iterator();
            while (true) {
                if (it2.hasNext()) {
                    PackageRollbackInfo packageRollbackInfo = (PackageRollbackInfo) it2.next();
                    if ("com.android.vending".equals(packageRollbackInfo.getPackageName())) {
                        anjh anjh = new anjh();
                        anjh.f76998a = Integer.valueOf(rollbackInfo.getRollbackId());
                        VersionedPackage versionRolledBackFrom = packageRollbackInfo.getVersionRolledBackFrom();
                        if (versionRolledBackFrom != null) {
                            anjh.f76999b = versionRolledBackFrom;
                            String str = anjh.f76998a == null ? " rollbackId" : "";
                            if (anjh.f76999b == null) {
                                str = str.concat(" versionRolledBackFrom");
                            }
                            if (!str.isEmpty()) {
                                String valueOf = String.valueOf(str);
                                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                            }
                            anja = new anja(anjh.f76998a.intValue(), anjh.f76999b);
                        } else {
                            throw new NullPointerException("Null versionRolledBackFrom");
                        }
                    }
                }
            }
        }
        if (anja == null) {
            this.f76994d.mo41866a(7);
            anjb.m64556a("No rollback is available for %s", "com.android.vending");
            return false;
        }
        if (!RollbackCommittedIntentOperation.f82161a.isEmpty()) {
            RollbackCommittedIntentOperation.f82161a.clear();
        }
        try {
            rollbackManager.commitRollback(anja.f76987a, bngx.m109356a(anja.f76988b), RollbackCommittedIntentOperation.m68270a(this.f76991a));
            Intent a = RollbackCommittedIntentOperation.m68269a();
            if (a == null) {
                this.f76994d.mo41867a(6, 3);
                anjb.m64557b("Failed to receive the status of rollback", new Object[0]);
                return false;
            } else if (a.getIntExtra("android.content.rollback.extra.STATUS", 1) == 0) {
                this.f76994d.mo41866a(6);
                anjb.m64556a("Package successfully rolled back", new Object[0]);
                return true;
            } else {
                this.f76994d.mo41867a(6, 3);
                anjb.m64557b("Rollback of Phonesky failed: %s", a.getStringExtra("android.content.rollback.extra.STATUS_MESSAGE"));
                return false;
            }
        } catch (NoSuchMethodError e) {
            this.f76994d.mo41867a(6, 3);
            anjb.m64557b("Rollback is not supported", new Object[0]);
            return false;
        }
    }
}
