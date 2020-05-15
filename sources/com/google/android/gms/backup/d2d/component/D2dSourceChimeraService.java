package com.google.android.gms.backup.d2d.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2dSourceChimeraService extends Service {

    /* renamed from: a */
    public static final lvn f29027a = new lvn("D2dSourceChimeraService");

    /* renamed from: b */
    public bqgj f29028b;

    /* renamed from: c */
    public mgj f29029c;

    /* renamed from: d */
    public mgc f29030d;

    /* renamed from: e */
    public mez f29031e;

    /* renamed from: f */
    private mgx f29032f;

    /* renamed from: g */
    private mgw f29033g;

    /* renamed from: h */
    private BroadcastReceiver f29034h;

    /* renamed from: i */
    private mgq f29035i;

    /* renamed from: j */
    private lzl f29036j;

    /* renamed from: a */
    public static Intent m21900a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.backup.component.D2dSourceService");
        return intent;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f29033g.mo20002a(printWriter);
    }

    public final IBinder onBind(Intent intent) {
        f29027a.mo25409a("onBind", new Object[0]);
        return new mfx(this);
    }

    public final void onCreate() {
        PowerManager powerManager;
        f29027a.mo25409a("onCreate", new Object[0]);
        super.onCreate();
        this.f29028b = snp.m35704b(9);
        this.f29031e = new mez();
        met met = new met(this);
        met.f33213d = SystemClock.elapsedRealtime();
        bxvd bxvd = met.f33214e;
        int i = -1;
        if (((mta) bxvd.f164949b).f34620b == -10) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mta mta = (mta) bxvd.f164949b;
            mta mta2 = mta.f34617g;
            mta.f34619a |= 1;
            mta.f34620b = -1;
        }
        int i2 = ModuleManager.get(met.f33211b).getCurrentModuleApk().apkVersionCode;
        lys.f33210a.mo25412b("Apk version: %d", Integer.valueOf(i2));
        bxvd bxvd2 = met.f33543l;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mtb mtb = (mtb) bxvd2.f164949b;
        mtb mtb2 = mtb.f34626o;
        mtb.f34628a |= 4;
        mtb.f34631d = i2;
        if (cckw.m130267e()) {
            try {
                i = gie.m13199d(met.f33211b, "com.google").length;
            } catch (RemoteException | rfv | rfw e) {
                lys.f33210a.mo25417e("Unable to get number of accounts", e, new Object[0]);
            }
            bxvd bxvd3 = met.f33543l;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            mtb mtb3 = (mtb) bxvd3.f164949b;
            mtb3.f34628a |= 16;
            mtb3.f34636i = i;
        }
        if (cckw.m130267e()) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) met.f33211b.getSystemService("connectivity")).getActiveNetworkInfo();
            bxvd bxvd4 = met.f33543l;
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            mtb mtb4 = (mtb) bxvd4.f164949b;
            mtb4.f34628a |= 32;
            mtb4.f34637j = z;
        }
        if (ccnr.f179566a.mo6606a().mo76485f() && (powerManager = (PowerManager) met.f33211b.getSystemService("power")) != null) {
            bxvd bxvd5 = met.f33543l;
            boolean isPowerSaveMode = powerManager.isPowerSaveMode();
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            mtb mtb5 = (mtb) bxvd5.f164949b;
            mtb5.f34628a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            mtb5.f34641n = isPowerSaveMode;
        }
        this.f29032f = mgx.m25092a(this);
        this.f29035i = new mgq(this);
        this.f29030d = mgc.m25049a(this);
        mfr a = mfr.m24971a(this, met);
        snf a2 = snp.m35703a(1, 10);
        this.f29036j = new lzl(this, a2, "com.google.android.gms.backup.component.D2dSourceService");
        this.f29033g = new mgw(this, a, met, this.f29031e, this.f29035i, this.f29036j, mao.f33350f, a2);
        this.f29029c = new mgj(this, this.f29028b, a2, this.f29031e, met, this.f29033g, this.f29032f, this.f29035i, a, new lyz(this), new lsp(this), this.f29030d, snp.m35704b(10));
        this.f29034h = new aacn("backup") {
            /* class com.google.android.gms.backup.d2d.component.D2dSourceChimeraService.C15581 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("e2e_tcp_source_port", -1);
                D2dSourceChimeraService d2dSourceChimeraService = D2dSourceChimeraService.this;
                lvn lvn = D2dSourceChimeraService.f29027a;
                d2dSourceChimeraService.f29028b.execute(new meb(this, intExtra));
            }
        };
        if (mce.m24861b()) {
            registerReceiver(this.f29034h, new IntentFilter("com.google.android.gms.backup.ACTION_LAUNCH_SOURCE_E2E_TEST"));
            Log.i("BackupE2E", "source receiver registered");
        }
    }

    public final void onDestroy() {
        f29027a.mo25409a("onDestroy", new Object[0]);
        if (this.f29032f.mo20007a()) {
            f29027a.mo25416d("Wake lock should have been released before source service onDestroy.", new Object[0]);
        }
        if (cckx.f179265a.mo6606a().mo76205a()) {
            this.f29028b.execute(new mea(this));
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent.getBooleanExtra("stop_service", false)) {
            this.f29033g.mo20001a(11, null, 1, 1);
            this.f29032f.mo20007a();
            this.f29033g.mo20006e();
            return 2;
        }
        if (!ccnu.m130916d()) {
            new mee(this).start();
        }
        mgx mgx = this.f29032f;
        sdo.m34967a("Wake lock must be acquired from the main thread.");
        if (mgx.f33675b.mo49124e()) {
            mgx.f33674a.mo25409a("acquireWakeLockIfNotHeld(): wake lock already held so not acquiring", new Object[0]);
        } else {
            mgx.f33674a.mo25409a("acquireWakeLockIfNotHeld(): wake lock not held so acquiring", new Object[0]);
            mgx.f33675b.mo49113a("migrate_transfer");
        }
        this.f29035i.f33654c.f33649b = intent.getBooleanExtra("is_wifi_d2d", false);
        this.f29035i.mo19999a();
        bqga.m112781a(this.f29036j.mo19781a(), new med(), bqfb.INSTANCE);
        return 2;
    }
}
