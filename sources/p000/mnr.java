package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.backup.p032g1.backup.G1BackupApiChimeraService;
import com.google.android.gms.backup.p032g1.backup.G1BackupApiStub$1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: mnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnr extends moj implements aaai {

    /* renamed from: a */
    public static final lvn f34049a = new lvn("G1BackupApi");

    /* renamed from: b */
    public final G1BackupApiChimeraService f34050b;

    /* renamed from: c */
    public final Map f34051c;

    /* renamed from: d */
    private final lvr f34052d = lvr.f33060a;

    /* renamed from: e */
    private final lvt f34053e = lvt.f33072a;

    /* renamed from: f */
    private final aaag f34054f;

    /* renamed from: g */
    private final lsp f34055g;

    /* renamed from: h */
    private final lvp f34056h;

    /* renamed from: i */
    private final GetServiceRequest f34057i;

    /* renamed from: j */
    private final mbx f34058j;

    /* renamed from: k */
    private final mnq f34059k;

    public mnr(G1BackupApiChimeraService g1BackupApiChimeraService, aaag aaag, GetServiceRequest getServiceRequest) {
        this.f34050b = g1BackupApiChimeraService;
        this.f34054f = aaag;
        this.f34055g = new lsp(g1BackupApiChimeraService);
        this.f34056h = new lvp(g1BackupApiChimeraService);
        sdo.m34959a(getServiceRequest);
        this.f34057i = getServiceRequest;
        this.f34051c = new HashMap();
        this.f34059k = new mnq(this);
        this.f34058j = new mbx(g1BackupApiChimeraService);
    }

    /* renamed from: a */
    public final void mo20186a(Status status) {
        for (lua lua : this.f34051c.values()) {
            try {
                Parcel bj = lua.mo8529bj();
                dcl.m8165a(bj, status);
                lua.mo8530c(1, bj);
            } catch (RemoteException e) {
                f34049a.mo25417e("Unable to call back the client.", e, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo20194b(boolean z) {
        SharedPreferences.Editor edit = new rtj(this.f34050b, "backup_settings", true).edit();
        edit.putBoolean("use_mobile_data", z);
        edit.apply();
        this.f34050b.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED").setPackage("com.google.android.gms"));
    }

    /* renamed from: c */
    public final boolean mo20196c() {
        return this.f34053e.mo19682g(this.f34050b);
    }

    /* renamed from: d */
    public final boolean mo20197d() {
        long a = this.f34056h.mo19639a("--");
        return (a == 0 || a == 1) ? false : true;
    }

    /* renamed from: e */
    public final boolean mo20198e() {
        return new rtj(this.f34050b, "g1_shared_prefs", true).getBoolean("use_mobile_data_for_mms", false);
    }

    /* renamed from: f */
    public final boolean mo20199f() {
        return new rtj(this.f34050b, "backup_settings", true).getBoolean("use_mobile_data", false);
    }

    /* renamed from: g */
    public final int mo20200g() {
        boolean z;
        if (!ccls.f179387a.mo6606a().mo76341c()) {
            return 5;
        }
        if (!ccls.f179387a.mo6606a().mo76330K().f165797a.contains(this.f34050b.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            throw new RemoteException("API not supported for this caller.");
        } else if (!mo20193a()) {
            return 1;
        } else {
            if (!mo20195b() || !mo20196c()) {
                z = false;
            } else {
                z = true;
            }
            if (System.currentTimeMillis() - new rtj(this.f34050b, "BackupDeviceState", true).getLong("lastFullBackupPassTimeMs", 0) > TimeUnit.DAYS.toMillis(ccls.f179387a.mo6606a().mo76356r())) {
                return z ? 3 : 4;
            }
            if (!z) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: h */
    public final long mo20201h() {
        if (!ccls.f179387a.mo6606a().mo76336Q().f165797a.contains(this.f34050b.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            throw new RemoteException("API not supported for this caller.");
        } else if (ccls.f179387a.mo6606a().mo76334O()) {
            return new rtj(this.f34050b, "BackupDeviceState", true).getLong("lastFullBackupPassTimeMs", 0);
        } else {
            throw new RemoteException("The getLastAutobackupTimestamp API is currently disabled.");
        }
    }

    /* renamed from: a */
    public final void mo20187a(String str) {
        if (ccls.m130536o()) {
            this.f34051c.remove(str);
        }
    }

    /* renamed from: b */
    public final boolean mo20195b() {
        return this.f34052d.mo19661f(this.f34050b);
    }

    /* renamed from: a */
    public final void mo20188a(String str, lua lua) {
        if (ccls.m130536o()) {
            this.f34051c.put(str, lua);
        }
    }

    /* renamed from: a */
    public final void mo20189a(mof mof) {
        long j = 0;
        if (ccls.m130541t()) {
            long j2 = Settings.Secure.getLong(this.f34050b.getContentResolver(), "backup_now_mms_backup_last_requested", 0);
            if (j2 > 0) {
                j = System.currentTimeMillis() - j2;
            }
            G1BackupApiChimeraService g1BackupApiChimeraService = this.f34050b;
            Settings.Secure.putLong(g1BackupApiChimeraService.getContentResolver(), "backup_now_mms_backup_last_requested", System.currentTimeMillis());
        }
        this.f34058j.mo19825a(3, j / 1000);
        G1BackupApiStub$1 g1BackupApiStub$1 = new G1BackupApiStub$1(this, new snr(new sns(10)), mof);
        mnq mnq = this.f34059k;
        Intent intent = new Intent();
        intent.setClassName(mnq.f34048a.f34050b, "com.google.android.gms.backup.mms.MmsBackupService");
        intent.putExtra("resultReceiver", g1BackupApiStub$1);
        mnq.f34048a.f34050b.startService(intent);
    }

    /* renamed from: a */
    public final void mo20190a(rnt rnt, boolean z, String str, BackupOptInSettings backupOptInSettings) {
        if (!ccls.f179387a.mo6606a().mo76332M().f165797a.contains(this.f34057i.f30230d)) {
            rnt.mo11797a(Status.f30112f);
        } else {
            this.f34054f.mo16658a(new mnp(rnt, z, str, backupOptInSettings));
        }
    }

    /* renamed from: a */
    public final void mo20191a(boolean z) {
        SharedPreferences.Editor edit = new rtj(this.f34050b, "g1_shared_prefs", true).edit();
        edit.putBoolean("use_mobile_data_for_mms", z);
        edit.apply();
        Intent startIntent = IntentOperation.getStartIntent(this.f34050b, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED");
        if (startIntent != null) {
            this.f34050b.startService(startIntent);
        }
    }

    /* renamed from: a */
    public final void mo20192a(boolean z, String str) {
        Intent startIntent;
        int i;
        Account a = this.f34055g.mo19591a();
        if ((a != null && a.name != null && a.name.equals(str)) || !z) {
            this.f34053e.mo19681g(this.f34050b, z);
            mbx mbx = this.f34058j;
            if (ccls.m130540s()) {
                bxvd a2 = lyu.m24685a();
                bxvd da = mrz.f34496i.mo74144da();
                if (!z) {
                    i = 6;
                } else {
                    i = 5;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrz mrz = (mrz) da.f164949b;
                mrz.f34499b = i - 1;
                mrz.f34498a |= 1;
                if (a2.f164950c) {
                    a2.mo74035c();
                    a2.f164950c = false;
                }
                mqk mqk = (mqk) a2.f164949b;
                mrz mrz2 = (mrz) da.mo74062i();
                mqk mqk2 = mqk.f34276G;
                mrz2.getClass();
                mqk.f34280C = mrz2;
                mqk.f34285b |= 64;
                mbx.mo19833a(a2, mqj.MMS_BACKUP, 0);
            }
            if (!this.f34052d.mo19661f(this.f34050b) && z) {
                this.f34052d.mo19656c(this.f34050b, true);
            }
            if (z && (startIntent = IntentOperation.getStartIntent(this.f34050b, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED")) != null) {
                this.f34050b.startService(startIntent);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo20193a() {
        return this.f34056h.mo19644b();
    }
}
