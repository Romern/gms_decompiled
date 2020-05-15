package com.google.android.gms.magictether.host;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TetherListenerChimeraService extends Service {

    /* renamed from: a */
    public static BluetoothStateChangeReceiver f79823a;

    /* renamed from: e */
    public static final sek f79824e = new sek(new String[]{"TetherListenerService"}, (int[]) null);

    /* renamed from: b */
    public final Object f79825b;

    /* renamed from: c */
    public aezx f79826c;

    /* renamed from: d */
    public afav f79827d;

    /* renamed from: f */
    private final bqgj f79828f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BluetoothStateChangeReceiver extends aacn {
        public BluetoothStateChangeReceiver() {
            super("auth_magictether");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            Intent a = TetherListenerChimeraService.m67140a(context);
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                context.startService(a);
            } else {
                context.stopService(a);
            }
        }
    }

    public TetherListenerChimeraService() {
        this(new soc(1, 10), null);
    }

    /* renamed from: a */
    public static Intent m67140a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.magictether.host.TetherListenerService");
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) "==== TetherListenerService Dump ====\n");
        synchronized (this.f79825b) {
            aezx aezx = this.f79826c;
            if (aezx != null) {
                printWriter.append((CharSequence) "    +++ ProximityAuthGapiWrapper +++\n");
                printWriter.append((CharSequence) "    devices: \n");
                for (RemoteDevice remoteDevice : aezx.f64061b) {
                    String valueOf = String.valueOf(remoteDevice);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                    sb.append("        ");
                    sb.append(valueOf);
                    sb.append("\n");
                    printWriter.append((CharSequence) sb.toString());
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        if (!cfcj.m138659f()) {
            m67141a(this, true);
            afav afav = this.f79827d;
            if (afav != null) {
                afav.mo34719a();
                afav afav2 = this.f79827d;
                afaa afaa = afav2.f64105b;
                if (afaa != null) {
                    afaa.f64078e.f79806a = true;
                    afav2.f64105b = null;
                }
                this.f79827d = null;
            }
            synchronized (this.f79825b) {
                aezx aezx = this.f79826c;
                if (aezx != null) {
                    aezx.mo34700b();
                    this.f79826c = null;
                }
            }
            this.f79828f.shutdown();
            super.onDestroy();
            return;
        }
        this.f79828f.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (cfcj.m138659f()) {
            stopSelf();
            return 2;
        }
        this.f79828f.execute(new afay(this));
        return 1;
    }

    public TetherListenerChimeraService(bqgj bqgj, aezx aezx) {
        this.f79825b = new Object();
        this.f79828f = bqgj;
        this.f79826c = aezx;
    }

    /* renamed from: a */
    public static void m67141a(Context context, boolean z) {
        if (ifr.m15376b(context)) {
            afca a = afbz.m52827a(afbv.m52820a(context));
            aezy.m52769a(context).mo34703a(z);
            a.mo34736b();
            afcg.m52833a().mo34742b();
            AutoDisconnectIntentOperation.m67133a();
        }
    }

    /* renamed from: a */
    public final List mo43839a(afas afas) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        jpc a = jpy.m17097a(this);
        afba a2 = afaz.m52798a();
        try {
            for (SyncedCryptauthDevice syncedCryptauthDevice : (List) aucu.m76783a(a.mo13965a(), cfcj.m138655b(), TimeUnit.SECONDS)) {
                if (afas.mo34716a(syncedCryptauthDevice.f11187b)) {
                    if (!cfcs.f183635a.mo6606a().mo80844a()) {
                        z = "chrome".equals(syncedCryptauthDevice.f11194i);
                    } else {
                        z = syncedCryptauthDevice.f11197l.contains(bsni.MAGIC_TETHER_CLIENT.name());
                    }
                    if (z) {
                        jnd jnd = new jnd();
                        jnd.f22863a = RemoteDevice.m6768a(syncedCryptauthDevice.f11186a);
                        jnd.f22864b = syncedCryptauthDevice.f11188c;
                        jnd.f22865c = syncedCryptauthDevice.f11187b;
                        jnd.f22866d = syncedCryptauthDevice.f11186a;
                        jnd.f22867e = syncedCryptauthDevice.f11194i;
                        arrayList.add(jnd.mo13895a());
                    }
                }
            }
            a2.mo34725c(0);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f79824e.mo25417e("Error getting synced devices.", e, new Object[0]);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                i = 2;
            } else {
                i = e instanceof ExecutionException ? 1 : 3;
            }
            a2.mo34725c(i);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Set mo43840a() {
        Account[] accountArr;
        if (!cfcs.m138695b()) {
            return new HashSet();
        }
        jpc a = jpy.m17097a(this);
        HashSet hashSet = new HashSet();
        try {
            accountArr = gie.m13199d(this, "com.google");
            if (accountArr == null || accountArr.length == 0) {
                f79824e.mo25418e("Invalid account list.", new Object[0]);
                accountArr = new Account[0];
            }
        } catch (RemoteException | rfv | rfw e) {
            f79824e.mo25418e("Failed to fetch account list.", new Object[0]);
            accountArr = new Account[0];
        }
        for (Account account : accountArr) {
            try {
                if (((Integer) aucu.m76783a(a.mo13967a(bsni.MAGIC_TETHER_HOST, account), cfcj.m138655b(), TimeUnit.SECONDS)).intValue() == 1) {
                    hashSet.add(account.name);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                f79824e.mo25417e("Error getting feature enabled state.", e2, new Object[0]);
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return hashSet;
    }
}
