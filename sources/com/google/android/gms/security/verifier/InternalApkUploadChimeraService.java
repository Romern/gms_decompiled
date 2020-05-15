package com.google.android.gms.security.verifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalApkUploadChimeraService extends Service {

    /* renamed from: a */
    public static final int f107608a = aqgx.m71599b(1);

    /* renamed from: b */
    public static final int f107609b = aqgx.m71596a(15);

    /* renamed from: c */
    public static final int f107610c = 86400000;

    /* renamed from: d */
    public static final int f107611d = 7200000;

    /* renamed from: j */
    private static final long f107612j = 86400000;

    /* renamed from: k */
    private static final int f107613k = aqgx.m71599b(20);

    /* renamed from: e */
    protected aqgt f107614e;

    /* renamed from: f */
    public aqgi f107615f;

    /* renamed from: g */
    protected HandlerThread f107616g;

    /* renamed from: h */
    public aqgs f107617h;

    /* renamed from: i */
    protected aqgv f107618i;

    /* renamed from: l */
    private boolean f107619l = false;

    /* renamed from: m */
    private final BroadcastReceiver f107620m = new NetworkChangeBroadcastReceiver();

    /* renamed from: n */
    private final BroadcastReceiver f107621n = new PackageChangeBroadcastReceiver();

    /* renamed from: o */
    private final Object f107622o = new Object();

    /* renamed from: p */
    private apgy f107623p;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class NetworkChangeBroadcastReceiver extends aacn {
        public NetworkChangeBroadcastReceiver() {
            super("security");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            InternalApkUploadChimeraService.this.f107614e.mo47876a(context);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class PackageChangeBroadcastReceiver extends aacn {
        public PackageChangeBroadcastReceiver() {
            super("security");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            InternalApkUploadChimeraService.m92444a(context, (long) InternalApkUploadChimeraService.f107609b);
        }
    }

    /* renamed from: a */
    public static void m92443a(Context context) {
        Intent a = apuh.m71021a(context, InternalApkUploadChimeraService.class);
        a.setAction("com.google.android.gms.security.verifyapps.BOOT_COMPLETE");
        context.startService(a);
    }

    /* renamed from: b */
    public final boolean mo58953b() {
        if (!mo58950a() || !cgkw.m146063b() || !this.f107614e.mo47878b()) {
            return false;
        }
        return true;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f107614e = new aqgt((ConnectivityManager) getSystemService("connectivity"));
        this.f107618i = new aqgv();
        this.f107623p = new apgy(this);
        HandlerThread handlerThread = new HandlerThread("apk_upload_thread");
        this.f107616g = handlerThread;
        handlerThread.start();
        this.f107617h = new aqgs(this, this.f107616g.getLooper());
        this.f107615f = new aqgi(this);
    }

    public final void onDestroy() {
        mo58949a(false);
        this.f107616g.quit();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = intent != null ? intent.getAction() : "null";
        objArr[1] = Integer.valueOf(i2);
        if (!mo58950a()) {
            stopSelf(i2);
            return 2;
        } else if (!cgkw.m146063b()) {
            stopSelf(i2);
            return 2;
        } else if (!apgy.m70271c(this)) {
            stopSelf(i2);
            return 2;
        } else {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str == null) {
                this.f107617h.sendMessage(this.f107617h.obtainMessage(1, i2, 0));
                return 1;
            }
            if (str.equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
                new aqgr(this, intent, i2).execute(new Void[0]);
            } else if (str.equals("com.google.android.gms.security.verifyapps.PROCESS_QUEUE")) {
                Message obtainMessage = this.f107617h.obtainMessage(0, i2, 0);
                long longExtra = intent.getLongExtra("delay", -1);
                this.f107617h.removeMessages(0);
                if (longExtra != -1) {
                    this.f107617h.sendMessageDelayed(obtainMessage, longExtra);
                } else {
                    this.f107617h.sendMessage(obtainMessage);
                }
            } else if (str.equals("com.google.android.gms.security.verifyapps.BOOT_COMPLETE")) {
                this.f107617h.sendMessage(this.f107617h.obtainMessage(1, i2, 0));
            } else {
                Log.w("ApkUploadChimeraService", aqgy.m71603c("Unknown action: %s", str));
                this.f107617h.sendMessage(this.f107617h.obtainMessage(2, i2, 0));
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static void m92444a(Context context, long j) {
        Intent a = apuh.m71021a(context, InternalApkUploadChimeraService.class);
        a.setAction("com.google.android.gms.security.verifyapps.PROCESS_QUEUE");
        if (j != -1) {
            a.putExtra("delay", j);
        }
        context.startService(a);
    }

    /* renamed from: a */
    public static boolean m92445a(ApkUploadEntry apkUploadEntry) {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - apkUploadEntry.f107603f;
        int i = apkUploadEntry.f107604g;
        if (i == 0) {
            j = (long) f107611d;
        } else if (i == 1) {
            j = (long) f107610c;
        } else {
            aqgy.m71600a("Invalid entry state for entry id=%d: %d.", Long.valueOf(apkUploadEntry.f107598a), Integer.valueOf(apkUploadEntry.f107604g));
            return true;
        }
        if (currentTimeMillis > j || apkUploadEntry.f107603f - System.currentTimeMillis() > f107612j) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Boolean.toString(z), Long.valueOf(apkUploadEntry.f107598a), apkUploadEntry.f107599b, Integer.valueOf(apkUploadEntry.f107604g), Double.valueOf(aqgx.m71595a(currentTimeMillis))};
        return z;
    }

    /* renamed from: a */
    public final int mo58948a(File file, byte[] bArr, byte[] bArr2, int i) {
        int i2;
        aqgd aqgd = new aqgd(this, file, bArr, bArr2, i);
        long length = aqgd.f86026b.length();
        if (length != 0 && length <= 52428800) {
            aqgd.f86033i = (int) length;
            try {
                aqgd.f86034j = new FileInputStream(aqgd.f86026b);
                aqgd.f86035k = 0;
                bxvd da = aqgk.f86051f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqgk aqgk = (aqgk) da.f164949b;
                aqgk.f86054b = 0;
                aqgk.f86053a |= 1;
                bxvd da2 = aqgm.f86063f.mo74144da();
                aqgl aqgl = aqgl.f86059c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                aqgm aqgm = (aqgm) da2.f164949b;
                aqgl.getClass();
                aqgm.f86067c = aqgl;
                int i3 = aqgm.f86065a | 4;
                aqgm.f86065a = i3;
                "".getClass();
                int i4 = i3 | 1;
                aqgm.f86065a = i4;
                aqgm.f86066b = "";
                int i5 = aqgd.f86033i;
                aqgm.f86065a = i4 | 8;
                aqgm.f86068d = (long) i5;
                bxvd da3 = aqgl.f86059c.mo74144da();
                bxtx a = bxtx.m123261a(aqgd.f86027c);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                aqgl aqgl2 = (aqgl) da3.f164949b;
                a.getClass();
                aqgl2.f86061a |= 1;
                aqgl2.f86062b = a;
                aqgl aqgl3 = (aqgl) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                aqgm aqgm2 = (aqgm) da2.f164949b;
                aqgl3.getClass();
                aqgm2.f86067c = aqgl3;
                aqgm2.f86065a |= 4;
                long a2 = spn.m35843a(aqgd.f86025a);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                aqgm aqgm3 = (aqgm) da2.f164949b;
                aqgm3.f86065a |= 1024;
                aqgm3.f86069e = a2;
                if (cgkt.m145949u() && (i2 = aqgd.f86036l) != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aqgk aqgk2 = (aqgk) da.f164949b;
                    aqgk2.f86057e = i2 - 1;
                    aqgk2.f86053a |= 32;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqgk aqgk3 = (aqgk) da.f164949b;
                aqgm aqgm4 = (aqgm) da2.mo74062i();
                aqgm4.getClass();
                aqgk3.f86055c = aqgm4;
                aqgk3.f86053a |= 2;
                bxvd da4 = aqgo.f86072d.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                aqgo aqgo = (aqgo) da4.f164949b;
                aqgo.f86075b = 0;
                aqgo.f86074a |= 1;
                bxtx a3 = bxtx.m123261a(aqgd.f86028d);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                aqgo aqgo2 = (aqgo) da4.f164949b;
                a3.getClass();
                aqgo2.f86074a |= 4;
                aqgo2.f86076c = a3;
                aqgo aqgo3 = (aqgo) da4.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqgk aqgk4 = (aqgk) da.f164949b;
                aqgo3.getClass();
                aqgk4.f86056d = aqgo3;
                aqgk4.f86053a |= 16;
                aqgd.f86031g = rpr.m34216b().getRequestQueue();
                aqgd.f86031g.add(new aqgw("https://safebrowsing.google.com/safebrowsing/uploads/android", new aqfz(aqgd), new aqga(aqgd), (aqgk) da.mo74062i(), aqgd.f86033i));
            } catch (IOException e) {
                aqgd.f86029e.add(1);
            }
        } else {
            aqgd.f86029e.add(1);
        }
        try {
            long nanoTime = System.nanoTime() + (((long) f107613k) * 1000000);
            while (true) {
                try {
                    long nanoTime2 = System.nanoTime();
                    if (nanoTime2 <= nanoTime) {
                        Integer num = (Integer) aqgd.f86029e.poll(nanoTime - nanoTime2, TimeUnit.NANOSECONDS);
                        if (num != null) {
                            int intValue = num.intValue();
                            new Object[1][0] = Integer.valueOf(intValue);
                            return intValue;
                        }
                        throw new TimeoutException();
                    }
                    throw new TimeoutException();
                } catch (InterruptedException e2) {
                }
            }
        } catch (TimeoutException e3) {
            aqgy.m71602b("Upload timed out. Canceling upload", new Object[0]);
            aqgd.f86030f = true;
            return 0;
        } finally {
            aqgd.mo47858a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo58949a(boolean z) {
        if (!z) {
            if (this.f107619l) {
                unregisterReceiver(this.f107620m);
                unregisterReceiver(this.f107621n);
                this.f107619l = false;
            }
        } else if (!this.f107619l) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED");
            registerReceiver(this.f107620m, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter2.addDataScheme("package");
            registerReceiver(this.f107621n, intentFilter2);
            this.f107619l = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58950a() {
        return this.f107623p.mo47201a();
    }

    /* renamed from: a */
    public final boolean mo58951a(int i) {
        if (!mo58950a() || !cgkw.m146063b()) {
            stopSelf(i);
            return true;
        }
        synchronized (this.f107622o) {
            if (this.f107615f.mo47869a()) {
                new Object[1][0] = Integer.valueOf(i);
                stopSelf(i);
                return true;
            }
            new Object[1][0] = Integer.valueOf(i);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo58952a(PackageInfo packageInfo, byte[] bArr) {
        if (!packageInfo.applicationInfo.sourceDir.equals(packageInfo.applicationInfo.publicSourceDir)) {
            return false;
        }
        try {
            byte[] a = this.f107618i.mo47881a(packageInfo.packageName, packageInfo.lastUpdateTime, new File(packageInfo.applicationInfo.sourceDir));
            if (a == null) {
                return false;
            }
            boolean equals = Arrays.equals(a, bArr);
            new Object[1][0] = Boolean.valueOf(equals);
            return equals;
        } catch (IOException e) {
            aqgy.m71601a(e, "exception while reading apk", new Object[0]);
            return false;
        }
    }
}
