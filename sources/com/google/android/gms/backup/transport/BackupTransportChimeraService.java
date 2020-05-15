package com.google.android.gms.backup.transport;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.base.BackupTransportMigratorChimeraService;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupTransportChimeraService extends Service implements lvu, myy {

    /* renamed from: a */
    public static final lvn f29200a = new lvn("BackupTransportCS");

    /* renamed from: b */
    public mzf f29201b;

    /* renamed from: c */
    nac f29202c;

    /* renamed from: d */
    public nab f29203d;

    /* renamed from: e */
    private bjq f29204e = null;

    /* renamed from: f */
    private mym f29205f = null;

    /* renamed from: g */
    private bjr f29206g = null;

    /* renamed from: h */
    private bjr f29207h = null;

    /* renamed from: i */
    private lvp f29208i = null;

    /* renamed from: j */
    private lzz f29209j;

    /* renamed from: k */
    private rtj f29210k;

    /* renamed from: l */
    private rtj f29211l;

    /* renamed from: m */
    private myz f29212m;

    /* renamed from: n */
    private mbx f29213n;

    /* renamed from: o */
    private final BroadcastReceiver f29214o = new aacn("backup") {
        /* class com.google.android.gms.backup.transport.BackupTransportChimeraService.C15601 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                lvn lvn = BackupTransportChimeraService.f29200a;
                if (backupTransportChimeraService.mo17284d()) {
                    BackupTransportChimeraService.f29200a.mo25412b("Transport has been disabled, cancelling full backup", new Object[0]);
                    backupTransportChimeraService.f29203d.cancelFullBackup();
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                BackupTransportChimeraService backupTransportChimeraService2 = BackupTransportChimeraService.this;
                boolean isInitialStickyBroadcast = isInitialStickyBroadcast();
                lvn lvn2 = BackupTransportChimeraService.f29200a;
                backupTransportChimeraService2.mo17281a(isInitialStickyBroadcast);
            } else {
                BackupTransportChimeraService backupTransportChimeraService3 = BackupTransportChimeraService.this;
                lvn lvn3 = BackupTransportChimeraService.f29200a;
                if (!backupTransportChimeraService3.mo17283c() || (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action) && !"com.google.android.gms.backup.BackupAccountChanged".equals(action))) {
                    BackupTransportChimeraService.f29200a.mo25416d("Unexpected action %s received in broadcast receiver", action);
                    return;
                }
                BackupTransportChimeraService.this.mo17282b();
                BackupTransportChimeraService.this.mo17281a(isInitialStickyBroadcast());
            }
        }
    };

    /* renamed from: p */
    private bzsy f29215p = null;

    /* renamed from: a */
    private static mbb m21993a(Exception exc) {
        mbb mbb = new mbb();
        mbb.initCause(exc);
        return mbb;
    }

    /* renamed from: e */
    public static ComponentName m21997e() {
        return ComponentName.unflattenFromString("com.google.android.gms/.backup.BackupTransportService");
    }

    /* renamed from: b */
    public final void mo17282b() {
        f29200a.mo25409a("Accounts changed", new Object[0]);
        this.f29205f.mo3201b(0);
        this.f29206g.mo3201b(0);
        this.f29201b.mo19624a();
    }

    /* renamed from: c */
    public final boolean mo17283c() {
        return !nau.m25856a(this);
    }

    /* renamed from: d */
    public final boolean mo17284d() {
        return spn.m35876d(this, "com.google.android.gms.backup.BackupTransportService") == 2;
    }

    public final IBinder onBind(Intent intent) {
        if (!intent.getBooleanExtra("android.app.backup.extra.TRANSPORT_REGISTRATION", false) && !mo17283c()) {
            new adzt(getMainLooper()).post(new myn(this));
        }
        if (!BackupTransportMigratorChimeraService.m21863a(mo17280a())) {
            startService(BackupTransportMigratorChimeraService.m21860a(this));
        }
        Intent intent2 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent2.putExtra("transport", "com.google.android.gms/.backup.BackupTransportService");
        intent2.setPackage(getPackageName());
        sendBroadcast(intent2);
        return this.f29203d.getBinder();
    }

    public final void onCreate() {
        lvu lvu;
        ndw.m25994d();
        this.f29213n = new mbx(this);
        this.f29202c = new nac(this);
        this.f29212m = new myz(this);
        this.f29204e = new bjq();
        if (this.f29205f == null) {
            this.f29205f = nec.m26008a(this);
        }
        this.f29206g = nec.m26009b(this);
        this.f29207h = new bjr(getSharedPreferences("GmsBackupTransport.abortScheduler", 0));
        registerReceiver(this.f29214o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        registerReceiver(this.f29214o, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f29214o, intentFilter);
        registerReceiver(this.f29214o, new IntentFilter("com.google.android.gms.backup.BackupAccountChanged"));
        if (this.f29201b == null) {
            this.f29201b = new mzf(this);
        }
        if (this.f29209j == null) {
            this.f29209j = lzz.m24744a(this);
        }
        this.f29215p = bzsy.m126181a(new bzse()).mo74580a();
        this.f29210k = new rtj(this, "cloud_restore", true);
        this.f29211l = new rtj(this, "BackupDeviceState", true);
        lwc a = lwc.m24524a(this);
        if (cclp.m130477g()) {
            lvu = new lvy();
        } else {
            lvu = this;
        }
        bjr bjr = this.f29207h;
        mzf mzf = this.f29201b;
        mym mym = this.f29205f;
        mbx mbx = this.f29213n;
        myz myz = this.f29212m;
        nac nac = this.f29202c;
        bjq bjq = this.f29204e;
        bzsy bzsy = this.f29215p;
        rtj rtj = this.f29210k;
        rtj rtj2 = this.f29211l;
        aboy aboy = new aboy(this);
        lwj a2 = mca.m24847a(this, a);
        nae nae = new nae(this, this.f29206g);
        nck nck = new nck();
        ncm ncm = new ncm();
        mzd mzd = new mzd();
        myo myo = new myo(this);
        nad nad = new nad(this);
        lvp a3 = mo17280a();
        int i = Build.VERSION.SDK_INT;
        this.f29203d = new nab(this, this, lvu, this, bjr, mzf, mym, mbx, myz, nac, bjq, bzsy, rtj, rtj2, aboy, a2, nae, nck, ncm, mzd, myo, a, nad, a3, bmxv.m108566b(lwe.m24540a(this)));
        new adzt(getMainLooper()).post(new myp(this));
    }

    public final void onDestroy() {
        try {
            unregisterReceiver(this.f29214o);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f29200a.mo25415d("Exception when unregistering: ", e, new Object[0]);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m21994a(bxvd bxvd, bjr bjr, msk msk) {
        lth lth = (lth) bxvd.f164949b;
        int i = lth.f32916a;
        if ((i & 1) == 0 || (lth.f32917b <= 0 && (i & 2) == 0)) {
            long a = spn.m35843a(this);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lth lth2 = (lth) bxvd.f164949b;
            lth lth3 = lth.f32914q;
            lth2.f32916a |= 1;
            lth2.f32917b = a;
            if (cckq.m130234b()) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                lth lth4 = (lth) bxvd.f164949b;
                lth4.f32916a |= 2;
                lth4.f32918c = a;
            }
            if (((lth) bxvd.f164949b).f32917b == 0) {
                long currentTimeMillis = System.currentTimeMillis() + 43200000;
                bjr.mo3201b(currentTimeMillis);
                f29200a.mo25416d("Could not get a non-zero AndroidId. Moratorium: %d", Long.valueOf(currentTimeMillis));
                this.f29213n.mo19830a(6, msk, 4, 0);
                throw m21993a(new AccountsException("No Android ID available"));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    private final void m21995a(Exception exc, bjr bjr, Exception exc2, int i, msk msk, int i2, long j, boolean z) {
        bjr bjr2 = bjr;
        int i3 = i;
        msk msk2 = msk;
        int i4 = i2;
        bjr.mo3200b();
        long a = bjr2.mo3197a(this.f29204e);
        long currentTimeMillis = a - System.currentTimeMillis();
        long j2 = 0;
        if (currentTimeMillis <= 30000 && z) {
            f29200a.mo25416d("Network error: waiting until time %d (delay of %dms) to retry: ", Long.valueOf(a), Long.valueOf(currentTimeMillis), exc);
            while (true) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 >= j2 && currentTimeMillis2 < a) {
                    SystemClock.sleep(Math.min(a - currentTimeMillis2, 1000L));
                    j2 = currentTimeMillis2;
                }
            }
            this.f29213n.mo19830a(i3, msk2, 3, i4);
            return;
        }
        f29200a.mo25416d("Network error: proposed backoff of %dms considered too large, not retrying. Exception that caused this: %s", Long.valueOf(currentTimeMillis), exc.toString());
        this.f29213n.mo19830a(i3, msk2, 4, i4);
        if (j > 0) {
            long currentTimeMillis3 = System.currentTimeMillis() + j;
            bjr2.mo3201b(currentTimeMillis3);
            f29200a.mo25416d("Setting moratorium: %d", Long.valueOf(currentTimeMillis3));
        }
        throw exc2;
    }

    /* renamed from: a */
    private final boolean m21996a(bxvd bxvd, Account account, bjr bjr, msk msk, boolean z) {
        bxvd bxvd2 = bxvd;
        try {
            String a = may.m24781a(this, account, "android", cckt.m130239b());
            if (a != null) {
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                lth lth = (lth) bxvd2.f164949b;
                lth lth2 = lth.f32914q;
                a.getClass();
                lth.f32916a |= 16;
                lth.f32920e = a;
            }
            if ((((lth) bxvd2.f164949b).f32916a & 16) != 0) {
                return true;
            }
            f29200a.mo25416d("Could not obtain AuthToken.", new Object[0]);
            m21995a(m21993a(new AccountsException("No auth token available")), bjr, m21993a(new AccountsException("No auth token available")), 5, msk, 0, 43200000, z);
            return false;
        } catch (AuthenticatorException e) {
            f29200a.mo25415d("AuthenticationException when getting AuthToken", e, new Object[0]);
            m21995a(e, bjr, m21993a(e), 8, msk, 0, 43200000, z);
            return false;
        } catch (IOException e2) {
            f29200a.mo25415d("IOException when getting AuthToken", e2, new Object[0]);
            mbn mbn = new mbn();
            mbn.initCause(e2);
            m21995a(e2, bjr, mbn, 12, msk, 0, 0, true);
            return true;
        } catch (OperationCanceledException e3) {
            f29200a.mo25415d("OperationCanceledException when getting AuthToken", e3, new Object[0]);
            m21995a(e3, bjr, m21993a(e3), 10, msk, 0, 0, z);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Account mo17277a(bjr bjr, msk msk) {
        Account a = this.f29201b.mo19624a();
        if (a != null) {
            return a;
        }
        long currentTimeMillis = System.currentTimeMillis() + 604800000;
        bjr.mo3201b(currentTimeMillis);
        f29200a.mo25416d("Backup account missing, trying again later. Moratorium: %d", Long.valueOf(currentTimeMillis));
        this.f29213n.mo19829a(4, msk, 4);
        throw new mbh();
    }

    /* renamed from: a */
    public final bxvd mo17278a(String str, bjr bjr) {
        bxvd da = lsz.f32870k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lsz lsz = (lsz) da.f164949b;
        str.getClass();
        lsz.f32872a |= 1;
        lsz.f32873b = str;
        lsz lsz2 = (lsz) da.mo74062i();
        bxvd da2 = lth.f32914q.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        lth lth = (lth) da2.f164949b;
        lth.f32916a |= 64;
        lth.f32922g = 3;
        da2.mo74015a(lsz2);
        bmxv a = this.f29209j.mo19797a();
        if (a.mo66813a()) {
            String str2 = (String) a.mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lth lth2 = (lth) da2.f164949b;
            str2.getClass();
            lth2.f32916a |= 1024;
            lth2.f32924i = str2;
        }
        Account a2 = mo17277a(bjr, msk.FULL_BACKUP_REQUEST);
        m21994a(da2, bjr, msk.FULL_BACKUP_REQUEST);
        boolean z = true;
        while ((((lth) da2.f164949b).f32916a & 16) == 0) {
            try {
                z = m21996a(da2, a2, bjr, msk.FULL_BACKUP_REQUEST, z);
            } catch (mbn e) {
                throw m21993a(new IOException(e));
            }
        }
        return da2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        r11.f29213n.mo19829a(r0.mo19816b(), r12, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        com.google.android.gms.backup.transport.BackupTransportChimeraService.f29200a.mo25416d("IOException when parsing response from server.", new java.lang.Object[r9]);
        r4 = new p000.mbn();
        r4.initCause(r0);
        r21 = r8;
        r11 = r10;
        m21995a(r0, r25, r4, 11, r23, 0, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r21 = r8;
        r11 = r10;
        r4 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[ExcHandler: mbk | mbm | mbs | mbt (r0v20 'e' mbd A[CUSTOM_DECLARE]), Splitter:B:22:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a A[ExcHandler: IOException (r0v17 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:22:0x007b] */
    /* renamed from: a */
    public final ltq mo17279a(msk msk, bxvd bxvd, bjr bjr, boolean z) {
        adyd a;
        lzu a2;
        int i;
        boolean z2;
        lzu lzu;
        adyd adyd;
        lzu lzu2;
        adyd adyd2;
        mbc mbc;
        int i2;
        BackupTransportChimeraService backupTransportChimeraService = this;
        msk msk2 = msk;
        bxvd bxvd2 = bxvd;
        bjr bjr2 = bjr;
        boolean z3 = z;
        if (ccnl.m130844b() || Thread.holdsLock(backupTransportChimeraService.f29203d)) {
            a = adyd.m51363a(this);
            Account a3 = backupTransportChimeraService.mo17277a(bjr2, msk2);
            backupTransportChimeraService.m21994a(bxvd2, bjr2, msk2);
            a2 = lzu.m24733a(this);
            i = 0;
            boolean z4 = true;
            z2 = true;
            while (true) {
                if (!z3 && (((lth) bxvd2.f164949b).f32916a & 8192) == 0 && bjr2.mo3197a(backupTransportChimeraService.f29204e) > System.currentTimeMillis()) {
                    backupTransportChimeraService.f29213n.mo19831a(3, msk, 4, 0, bjr2 instanceof mym ? ((mym) bjr2).f34946d : 0);
                    throw new mbl(bjr2);
                } else if ((((lth) bxvd2.f164949b).f32916a & 16) != 0) {
                    try {
                        ltq a4 = a2.mo19792a(bxvd2, bjr2, z3);
                        try {
                            lzw.m24739a(a4);
                            bjr.mo3198a();
                            return a4;
                        } catch (mbc e) {
                            mbc = e;
                            lzu2 = a2;
                            adyd2 = a;
                        } catch (IOException e2) {
                        } catch (mbk | mbm | mbs | mbt e3) {
                        }
                    } catch (IOException e4) {
                        lzu = a2;
                        adyd = a;
                        mbn mbn = new mbn();
                        mbn.initCause(e4);
                        m21995a(e4, bjr, mbn, 9, msk, 0, 0, true);
                        i = 0;
                        a = adyd;
                        a2 = lzu;
                        backupTransportChimeraService = this;
                    } catch (mbf e5) {
                        lzu = a2;
                        adyd = a;
                        m21995a(e5, bjr, e5, 2, msk, e5.f33375a, 0, true);
                        i = 0;
                        a = adyd;
                        a2 = lzu;
                        backupTransportChimeraService = this;
                    }
                } else {
                    z4 = m21996a(bxvd, a3, bjr, msk, z4);
                    i = 0;
                    backupTransportChimeraService = this;
                }
            }
        } else {
            throw new IllegalStateException("lock not held");
        }
        lth lth = (lth) bxvd2.f164949b;
        if ((lth.f32916a & 16) != 0) {
            adyd2.mo33921b("com.google", lth.f32920e);
            if (!bxvd2.f164950c) {
                i2 = 0;
            } else {
                bxvd.mo74035c();
                i2 = 0;
                bxvd2.f164950c = false;
            }
            lth lth2 = (lth) bxvd2.f164949b;
            lth lth3 = lth.f32914q;
            lth2.f32916a &= -17;
            lth2.f32920e = lth.f32914q.f32920e;
        } else {
            i2 = 0;
        }
        f29200a.mo25416d("Server returned error, invalidating auth token. This is retried once.", new Object[i2]);
        m21995a(mbc, bjr, mbc, 8, msk, 0, 43200000, z2);
        i = 0;
        z2 = false;
        a = adyd2;
        a2 = lzu2;
        backupTransportChimeraService = this;
    }

    /* renamed from: a */
    public final synchronized lvp mo17280a() {
        if (this.f29208i == null) {
            this.f29208i = new lvp(this);
        }
        return this.f29208i;
    }

    /* renamed from: a */
    public final void mo17281a(boolean z) {
        mym mym = this.f29205f;
        ConnectivityManager connectivityManager = (ConnectivityManager) mym.f34945c.getSystemService("connectivity");
        int i = 4;
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                i = 1;
            }
        } else {
            i = 2;
        }
        boolean z2 = i == 1;
        mym.f34944b.mo25412b("Setting backup scheduler enabled=%b due to desired state %d", Boolean.valueOf(z2), Integer.valueOf(i));
        if (!z2) {
            mym.f34946d = 5;
        } else {
            mym.f34946d = 1;
        }
        bjs.m3228a(mym.f3403a.edit().putBoolean("OperationScheduler_enabledState", z2));
        mym.f34946d = i;
        int i2 = Build.VERSION.SDK_INT;
        if (!z) {
            if (this.f29205f.mo3197a(this.f29204e) > System.currentTimeMillis()) {
                f29200a.mo25409a("no backup now", new Object[0]);
                return;
            }
            lvp a = mo17280a();
            if (a == null) {
                f29200a.mo25418e("No BackupManager service available", new Object[0]);
                return;
            }
            f29200a.mo25409a("triggering backup now", new Object[0]);
            this.f29205f.mo3199a(Long.MAX_VALUE);
            int i3 = Build.VERSION.SDK_INT;
            if (a.mo19648f()) {
                a.f33054a.backupNow();
            }
        }
    }
}
