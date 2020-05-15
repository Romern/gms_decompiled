package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.backup.settings.backupnow.BackUpNowOperation$1;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mug extends aaab {

    /* renamed from: a */
    public static final lvn f34754a = new lvn("BackUpNowOperation");

    /* renamed from: b */
    public final muh f34755b;

    /* renamed from: c */
    public final muc f34756c;

    /* renamed from: d */
    public bqgy f34757d;

    /* renamed from: e */
    public int f34758e;

    /* renamed from: f */
    public int f34759f;

    /* renamed from: g */
    public boolean f34760g;

    /* renamed from: h */
    private final mof f34761h;

    /* renamed from: i */
    private final BackUpNowConfig f34762i;

    /* renamed from: j */
    private final bmxv f34763j;

    /* renamed from: k */
    private final bmxv f34764k;

    /* renamed from: l */
    private PowerManager f34765l;

    /* renamed from: o */
    private BroadcastReceiver f34766o;

    public mug(mof mof, BackUpNowConfig backUpNowConfig, muh muh, mtz mtz, muc muc, bmxv bmxv, bmxv bmxv2) {
        super(175, "BackUpNow");
        sdo.m34959a(mof);
        this.f34761h = mof;
        sdo.m34959a(backUpNowConfig);
        this.f34762i = backUpNowConfig;
        sdo.m34959a(muh);
        this.f34755b = muh;
        sdo.m34959a(mtz);
        sdo.m34959a(muc);
        this.f34756c = muc;
        sdo.m34959a(bmxv);
        this.f34763j = bmxv;
        sdo.m34959a(bmxv2);
        this.f34764k = bmxv2;
    }

    /* renamed from: a */
    private final int m25630a(Context context, lvp lvp, mud mud, List list) {
        if (list.isEmpty()) {
            return 29005;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            if (this.f34762i.f28978a && connectivityManager.isActiveNetworkMetered()) {
                f34754a.logVerbose("Metered network, but wanted unmetered.", new Object[0]);
                return 29002;
            } else if (this.f34762i.f28979b && !batteryManager.isCharging()) {
                f34754a.logVerbose("Not charging, but require charging.", new Object[0]);
                return 29006;
            } else if (this.f34762i.f28980c && this.f34765l.isInteractive() && !this.f34760g) {
                f34754a.logVerbose("Not idle, but require idle.", new Object[0]);
                return 29007;
            } else if (!this.f34762i.f28982e && this.f34765l.isPowerSaveMode() && !batteryManager.isCharging()) {
                f34754a.logVerbose("In power saver and not charging.", new Object[0]);
                return 29008;
            } else if (m25631a(lvp, mud, packageInfo.packageName) == 29003) {
                f34754a.logVerbose("Aborting backup.", new Object[0]);
                return 29003;
            }
        }
        return 29000;
    }

    /* renamed from: a */
    private final int m25631a(lvp lvp, mud mud, String str) {
        try {
            this.f34757d = bqgy.m112818c();
            f34754a.mo25414c("Requesting backup for package: %s", str);
            int i = Build.VERSION.SDK_INT;
            lvp.mo19638a(new String[]{str}, new mue(this, mud), new muf(this), 0);
            int intValue = ((Integer) this.f34757d.get((long) ((int) ccli.f179330a.mo6606a().mo76268a()), TimeUnit.SECONDS)).intValue();
            if (intValue == 0) {
                return 29000;
            }
            if (intValue != -1000) {
                f34754a.logVerbose("Error in backup manager.", new Object[0]);
                return 29001;
            }
            f34754a.logVerbose("Transport error.", new Object[0]);
            return 29003;
        } catch (ExecutionException e) {
            f34754a.mo25415d("ExecutionException while requesting backup.", e, new Object[0]);
            return 29001;
        } catch (TimeoutException e2) {
            f34754a.logVerbose("Request for backup has timed out.", new Object[0]);
            return 29004;
        } catch (InterruptedException e3) {
            f34754a.mo25415d("InterruptedException while requesting backup.", e3, new Object[0]);
            return 29001;
        }
    }

    /* renamed from: a */
    private final void m25632a(Context context, mud mud, int i) {
        String str;
        if (this.f34766o != null) {
            if (ccog.f179619a.mo6606a().mo76528a()) {
                try {
                    context.unregisterReceiver(this.f34766o);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    f34754a.mo25417e("Exception when unregistering a receiver: ", e, new Object[0]);
                    mab.m24748a(context, e, ccna.f179481a.mo6606a().mo76400a());
                }
            } else {
                context.unregisterReceiver(this.f34766o);
            }
        }
        f34754a.mo25414c("Backup done for all packages, result code: %d", Integer.valueOf(i));
        this.f34756c.mo20244a(i);
        if (i == 29000) {
            mud.m25628a(mud.f34745b);
        } else {
            if (i != 29002) {
                str = mud.f34745b.getString(C0126R.string.backup_now_error_text);
            } else {
                str = mud.f34745b.getString(C0126R.string.backup_now_network_error_text);
            }
            mud.f34746c.setProgress(0, 0, false).setAutoCancel(true).setOngoing(false).setContentTitle(mud.f34745b.getString(C0126R.string.backup_now_error_title)).setContentText(str);
            int i2 = Build.VERSION.SDK_INT;
            mud.f34746c.setTimeoutAfter(0);
            mud.mo20246a();
        }
        this.f34755b.mo20251a(i);
        this.f34755b.mo20255b();
        try {
            this.f34761h.mo20214a(Status.f30107a);
        } catch (RemoteException e2) {
            f34754a.mo25417e("Unable to call back the client.", e2, new Object[0]);
        }
    }

    /* renamed from: a */
    private static final boolean m25633a(Context context, long j) {
        try {
            new lvw(snp.m35703a(1, 10), new rtj(context, "BackupDeviceState", true), srb.f45012a, j).mo19685a().get((long) ((int) ccli.f179330a.mo6606a().mo76282o()), TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f34754a.mo25415d("Exception caught while waiting for poller ", e, new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f34754a.mo25414c("Running", new Object[0]);
        this.f34755b.mo20250a();
        boolean z = this.f34762i.f28981d;
        int i = mua.f34733a;
        mud mud = new mud(context, z);
        this.f34765l = (PowerManager) context.getSystemService("power");
        try {
            if (this.f34763j.mo66813a()) {
                if (this.f34764k.mo66813a() && !((Boolean) ((mui) this.f34764k.mo66814b()).get(ccmt.f179472a.mo6606a().mo76395b(), TimeUnit.MILLISECONDS)).booleanValue() && !((lwd) this.f34763j.mo66814b()).mo19701b()) {
                    f34754a.mo25416d("Could not sync secondary key.", new Object[0]);
                    m25632a(context, mud, 29010);
                    return;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            f34754a.mo25417e("Waiting for key sync was interrupted", e, new Object[0]);
            m25632a(context, mud, 29009);
            return;
        } catch (ExecutionException e2) {
            f34754a.mo25417e("Exception while waiting for key to sync", e2, new Object[0]);
            m25632a(context, mud, 29009);
            return;
        } catch (TimeoutException e3) {
            f34754a.mo25417e(" Waiting for key to sync timed out", e3, new Object[0]);
            if (!((lwd) this.f34763j.mo66814b()).mo19701b()) {
                m25632a(context, mud, 29011);
                return;
            }
        }
        if (this.f34762i.f28980c && this.f34765l.isInteractive()) {
            f34754a.logVerbose("Required idle and screen is on, assuming we're dreaming", new Object[0]);
            this.f34760g = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
            BackUpNowOperation$1 backUpNowOperation$1 = new BackUpNowOperation$1(this, "backup");
            this.f34766o = backUpNowOperation$1;
            context.registerReceiver(backUpNowOperation$1, intentFilter);
        }
        lvp lvp = new lvp(context);
        this.f34756c.mo20245a(mqk.f34276G, mqj.BACK_UP_NOW_START);
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
            String str = packageInfo.packageName;
            if (lvp.mo19648f() && lvp.f33054a.isAppEligibleForBackup(str)) {
                arrayList.add(packageInfo);
            }
        }
        Collections.shuffle(arrayList);
        mud.f34747d = arrayList.size();
        mud.mo20246a();
        f34754a.logVerbose("Waiting for any ongoing backup to finish...", new Object[0]);
        m25633a(context, 0);
        this.f34758e = arrayList.size();
        this.f34759f = 0;
        if (!new lsp(context).mo19593b() && ccli.f179330a.mo6606a().mo76285r()) {
            bngs j = bngx.m109377j();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PackageInfo packageInfo2 = (PackageInfo) arrayList.get(i2);
                if (packageInfo2.applicationInfo.backupAgentName != null && (packageInfo2.applicationInfo.flags & 67108864) == 0) {
                    j.mo67668c(packageInfo2);
                }
            }
            int a = m25630a(context, lvp, mud, j.mo67664a());
            f34754a.mo25412b("Backup pass with KV packages ended with %d", Integer.valueOf(a));
            if (a == 29003 && !m25633a(context, (long) ((int) ccli.f179330a.mo6606a().mo76280m()))) {
                m25632a(context, mud, 29003);
                return;
            }
        }
        m25632a(context, mud, m25630a(context, lvp, mud, arrayList));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f34756c.mo20244a(status.f30115i);
        this.f34761h.mo20214a(status);
    }
}
