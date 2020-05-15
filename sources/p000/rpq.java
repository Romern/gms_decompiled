package p000;

import android.app.Application;
import android.app.NotificationManager;
import android.app.usage.UsageStatsManager;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.common.app.SignalHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rpq extends Application implements ComponentCallbacks {

    /* renamed from: a */
    static final AtomicBoolean f43493a = new AtomicBoolean(false);

    /* renamed from: b */
    private aabl f43494b;

    /* renamed from: c */
    private final rpr f43495c;

    /* renamed from: d */
    private boolean f43496d = false;

    /* renamed from: e */
    private boolean f43497e = false;

    /* renamed from: f */
    private volatile rpg f43498f;

    static {
        bdny bdny = bdny.f106105a;
        if (bdny.f106107c == 0) {
            bdny.f106107c = SystemClock.elapsedRealtime();
            bdny.f106112h.f106100a = true;
        }
    }

    public rpq() {
        if (!f43493a.getAndSet(true)) {
            int i = Build.VERSION.SDK_INT;
            try {
                Os.prctl(OsConstants.PR_SET_DUMPABLE, 1, 0, 0, 0);
            } catch (Exception e) {
                Log.e("GmsApplication", "Failed to enable native stack dump capture", e);
            }
            this.f43495c = new rpr();
            return;
        }
        throw new rpp();
    }

    /* renamed from: a */
    private final aabl m34211a() {
        if (cdoz.f181455a.mo6606a().mo78118k() && this.f43494b == null) {
            this.f43494b = new aabl(getClass(), 24, "container");
        }
        return this.f43494b;
    }

    /* renamed from: b */
    private final rpg m34212b() {
        rpg rpg = this.f43498f;
        if (rpg == null) {
            synchronized (this) {
                rpg = this.f43498f;
                if (rpg == null) {
                    rpg = new rpg(this, super.getResources());
                    this.f43498f = rpg;
                }
            }
        }
        return rpg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgv.a(dkw, boolean, dks):boolean
     arg types: [dkv, int, dks]
     candidates:
      dgv.a(java.io.File, dke, boolean):boolean
      dgv.a(java.util.Set, dks, boolean):boolean
      dgv.a(dkw, boolean, dks):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qmc.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      qmc.a(android.content.Context, java.lang.String):void
      qmc.a(java.lang.String, java.util.Set):void
      qmc.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        HashSet hashSet;
        RandomAccessFile randomAccessFile;
        BufferedReader bufferedReader;
        String readLine;
        if (!this.f43496d) {
            this.f43496d = true;
            super.attachBaseContext(context);
            this.f43495c.attachBaseContext(this);
            bdyx.m91614a((Context) this);
            ryu.m34677a();
            if (cdjw.f181081a.mo6606a().mo77766a()) {
                adyi.m51412a(new adyk());
            }
            if (cdks.f181170a.mo6606a().mo77841a()) {
                aytw.m84812a();
            }
            if (!aytw.m84815b(this)) {
                hashSet = new HashSet(Arrays.asList(rsv.m34363a()));
                rtc[] a = qlk.m32361a();
                for (int i = 0; i < 3; i++) {
                    hashSet.add(a[i].f43644b);
                }
            } else {
                hashSet = null;
            }
            rtc.m34380a(this, hashSet);
            if (cdkp.m133841h()) {
                rvb.m34509a();
            }
            new rui(this, new sba(), new rvq()).mo25336a();
            int i2 = Build.VERSION.SDK_INT;
            new rpy(this).mo25336a();
            new rpi(this).mo25336a();
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            if (!aytw.m84815b(this)) {
                Log.w("DirectBootExitBR", "User is in direct boot mode.");
                if (cdks.f181170a.mo6606a().mo77842b()) {
                    registerReceiver(new rpj(), new IntentFilter("android.intent.action.BOOT_COMPLETED"));
                    if (aytw.m84815b(this)) {
                        Process.killProcess(Process.myPid());
                    }
                }
            }
            dfy.m8329a(this);
            if (cdon.f181438a.mo6606a().mo78075a()) {
                File[] listFiles = getDir("native_crashes", 0).listFiles();
                if (listFiles != null) {
                    boolean z = false;
                    for (File file : listFiles) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                            do {
                                readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                    continue;
                                }
                            } while (readLine != null);
                            bufferedReader.close();
                            String sb2 = sb.toString();
                            DropBoxManager dropBoxManager = (DropBoxManager) getSystemService("dropbox");
                            if (dropBoxManager != null) {
                                if (dropBoxManager.isTagEnabled("system_app_crash")) {
                                    dropBoxManager.addText("system_app_crash", sb2);
                                    file.getCanonicalFile().delete();
                                }
                            }
                            String valueOf = String.valueOf(file.getAbsolutePath());
                            Log.w("GmsSignalHandler", valueOf.length() == 0 ? new String("Unable to write crash report from file ") : "Unable to write crash report from file ".concat(valueOf));
                            z = true;
                        } catch (IOException e) {
                            Log.w("GmsSignalHandler", "Unable to process crash report(s): ", e);
                            z = true;
                        } catch (Throwable th) {
                            bqye.m113761a(th, th);
                        }
                    }
                    if (!z) {
                        int c = (int) cdon.f181438a.mo6606a().mo78077c();
                        int b = (int) cdon.f181438a.mo6606a().mo78076b();
                        int d = (int) cdon.f181438a.mo6606a().mo78078d();
                        SignalHandler signalHandler = new SignalHandler(this);
                        try {
                            synchronized (SignalHandler.class) {
                                if (!SignalHandler.f30144a) {
                                    SignalHandler.f30144a = ssj.m36231b(signalHandler.f30145b, "gmscore");
                                    boolean z2 = SignalHandler.f30144a;
                                    if (!z2) {
                                        Log.w("GmsSignalHandler", "Failed to load libgmscore native library, not installing signal handlers.");
                                    }
                                }
                                if (!SignalHandler.installShushSignalHandlers("", c, b, d, true)) {
                                    Log.w("GmsSignalHandler", "Shush SignalHandlers did not install.");
                                }
                            }
                        } catch (Throwable th2) {
                            Log.w("GmsSignalHandler", "Failed to install Shush SignalHandlers", th2);
                        }
                    }
                }
                Log.e("GmsApplication", "Error reporting previously seen crashes, not installing shush signal handlers");
            }
            qkk.m32288a(rpr.m34216b());
            int i5 = Build.VERSION.SDK_INT;
            bmzi bmzi = rpk.f43488a;
            bmzi bmzi2 = rpl.f43489a;
            dfq.f13017a = bmzi;
            dfq.f13018b = bmzi2;
            boolean booleanValue = ((Boolean) qlj.f41642a.mo58455c()).booleanValue();
            boolean booleanValue2 = ((Boolean) qlj.f41643b.mo58455c()).booleanValue();
            if ((booleanValue || booleanValue2) && !stu.m36317c().equals(stu.m36319e())) {
                Log.i("GmsApplication", "Staging modules and/or updating config");
                try {
                    randomAccessFile = new RandomAccessFile(new File(aytw.m84817d(this).getCacheDir(), ".stage_update.lock"), "rw");
                    randomAccessFile.getChannel().lock();
                    if (booleanValue) {
                        Log.i("GmsApplication", "Staging modules");
                        dgv a2 = dgv.m8427a(this);
                        Log.i("FileApkMgr", "Extracting modules...");
                        a2.mo8983a((dkw) new dkv(), false, dks.m8749a(dko.f13418a, bqgs.m112810a()));
                        Log.i("FileApkMgr", "Extracting modules completed");
                        int i6 = Build.VERSION.SDK_INT;
                        Log.i("GmsApplication", "Staging modules completed");
                    }
                    if (booleanValue2) {
                        Log.i("GmsApplication", "Updating config");
                        qmc.m32425a(false, true);
                        Log.i("GmsApplication", "Updating config completed");
                    }
                    randomAccessFile.close();
                } catch (IOException e2) {
                    Log.w("GmsApplication", "Staging modules and/or updating config failed", e2);
                } catch (Throwable th3) {
                    bqye.m113761a(th, th3);
                }
            }
            if (ssw.m36269a() && cdmh.f181235a.mo6606a().mo77892a()) {
                sdn.m34958a(this);
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final String getAttributionTag() {
        return "app";
    }

    public final Resources getResources() {
        return m34212b().getResources();
    }

    public final Resources.Theme getTheme() {
        return m34212b().getTheme();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        m34212b().mo24981a(configuration);
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0432, code lost:
        if (r6 == p000.aymd.f97953d) goto L_0x0434;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a6 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a7 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b0 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b1 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d8 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d9 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f2 A[SYNTHETIC, Splitter:B:117:0x01f2] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d2 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e2 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03f6 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03f7 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0418 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x045e A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04be A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04c2 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04ea A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04eb A[ADDED_TO_REGION, Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0519 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0115 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0132 A[SYNTHETIC, Splitter:B:80:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0148 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0066, all -> 0x057f }] */
    public final void onCreate() {
        boolean z;
        sla sla;
        blji a;
        boolean z2;
        aymd aymd;
        aymd m;
        char c;
        boolean z3;
        rvp a2;
        rud rud;
        ruf a3;
        if (!this.f43497e) {
            this.f43497e = true;
            super.onCreate();
            bdny bdny = bdny.f106105a;
            if (beel.m91854a() && bdny.f106107c > 0 && bdny.f106108d == 0) {
                bdny.f106108d = SystemClock.elapsedRealtime();
                bdny.f106112h.f106101b = true;
                beel.m91852a(new bdns(bdny));
                registerActivityLifecycleCallbacks(new bdnw(bdny, this));
            }
            bdij a4 = bdij.m90859a();
            try {
                eoh.f15386a = this;
                svr.f45246a = new ayku();
                spx.f44955a = new ayks();
                aymt.m84282a(this);
                if (spn.m35881e(this) != stu.m36318d()) {
                    ssj.m36230b(this);
                }
                aptm.m70976a(this);
                z = false;
            } catch (Exception | UnsatisfiedLinkError e) {
                if (!ssj.m36232c(this) || !((Boolean) rsv.f43615d.mo25081c()).booleanValue()) {
                    Log.w("GmsApplication", "Unable to install secure provider, due to exception:", e);
                    z = false;
                } else {
                    Log.w("GmsApplication", "Unable to install secure provider, due to exception:", e);
                    ssj.m36233d(this);
                    try {
                        aptm.m70976a(this);
                        z = true;
                    } catch (Exception | UnsatisfiedLinkError e2) {
                        Log.w("GmsApplication", "Still unable to install secure provider, due to exception:", e);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                blji a5 = aabl.m21058a(m34211a(), "onCreate_stopTimer");
                try {
                    bdgs.m90764a().mo58024a(a4, bdgg.m90734a("GmsApplication#onCreate"));
                    if (a5 != null) {
                        a5.close();
                    }
                    throw th;
                } catch (Throwable th2) {
                    if (a5 != null) {
                        try {
                            a5.close();
                        } catch (Throwable th3) {
                            bqye.m113761a(th2, th3);
                        }
                    }
                    throw th2;
                }
            }
            if (!cdng.m134176c()) {
                if (cdkp.m133837d()) {
                    bdym.m91584a(this);
                }
                if (!cdkp.m133841h()) {
                    rvb.m34509a();
                }
                rvk c2 = rvl.m34524c();
                c2.f43750b = this;
                c2.f43749a = bpun.STARTUP;
                new rvq().mo25210b(c2.mo25198a());
                if (((Boolean) rsv.f43637z.mo25081c()).booleanValue()) {
                    this.f43495c.installLanguageAssets(super.getResources());
                }
                if (cdoq.f181444a.mo6606a().mo78080a()) {
                    try {
                        bepg bepg = new bepg(rpm.f43490a);
                        bepg.mo60890a(2, "com.google.android.libraries.phenotype.client.PhenotypeFlag#get");
                        bepg.mo60890a(3, "androidx.work.impl.WorkDatabasePathHelper#getDatabasePath");
                        if (Build.MANUFACTURER != null) {
                            String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.US);
                            String lowerCase2 = Build.MODEL.toLowerCase(Locale.US);
                            switch (lowerCase.hashCode()) {
                                case -1320380160:
                                    if (lowerCase.equals("oneplus")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -759499589:
                                    if (lowerCase.equals("xiaomi")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3620012:
                                    if (lowerCase.equals("vivo")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1864941562:
                                    if (lowerCase.equals("samsung")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                bepg.mo60891b(3, "android.util.GeneralUtil#isSupportedGloveModeInternal");
                                bepg.mo60891b(2, "android.graphics.Typeface#SetAppTypeFace");
                                bepg.mo60891b(2, "android.graphics.Typeface#setAppTypeFace");
                                bepg.mo60891b(2, "android.app.ApplicationPackageManager#queryIntentActivities");
                                bepg.mo60891b(2, "android.app.ActivityThread#parseCSCAppResource");
                                bepg.mo60891b(2, "android.app.ActivityThread#performLaunchActivity");
                                bepg.mo60891b(2, "com.samsung.android.knox.custom.ProKioskManager#getProKioskState");
                                if (lowerCase2.equals("sm-g9350")) {
                                    bepg.mo60891b(1, "android.content.res.Resources#loadDrawable");
                                }
                                if (lowerCase2.equals("sm-j700f")) {
                                    int i = Build.VERSION.SDK_INT;
                                }
                            } else if (c == 1) {
                                bepg.mo60891b(3, "com.android.server.am.ActivityManagerService#checkProcessExist");
                            } else if (c == 2) {
                                bepg.mo60891b(2, "android.content.res.VivoResources#loadThemeValues");
                            } else if (c == 3) {
                                bepg.mo60891b(2, "com.android.internal.policy.PhoneWindow#getDecorView");
                                bepg.mo60891b(1, "miui.content.res.ThemeResourcesSystem#checkUpdate");
                                bepg.mo60891b(2, "android.util.BoostFramework#<init>");
                            }
                            bepg.mo60891b(2, "com.qualcomm.qti.Performance#<clinit>");
                            bepg.mo60891b(2, "com.android.messageformat.MessageFormat#formatNamedArgs");
                            bepg.mo60891b(16, "com.android.internal.widget.SwipeDismissLayout#init");
                            int i2 = Build.VERSION.SDK_INT;
                            bepg.mo60891b(3, "java.lang.ThreadGroup#uncaughtException");
                            int i3 = Build.VERSION.SDK_INT;
                            bepg.mo60891b(3, "android.widget.VideoView#openVideo");
                            bepg.mo60891b(2, "com.google.android.gsf.UseLocationForServices#getUseLocationForServices");
                            bepg.mo60891b(3, "com.android.server.inputmethod.InputMethodManagerService#startInputOrWindowGainedFocus");
                            bepg.mo60890a(3, "android.support.v4.content.res.ResourcesCompat#getFont");
                            int i4 = Build.VERSION.SDK_INT;
                            bepg.mo60891b(3, "com.android.webview.chromium.WebViewChromiumFactoryProvider#startChromiumLocked");
                            bepg.mo60891b(2, "android.webkit.WebViewDelegate#addWebViewAssetPath");
                            bepg.mo60891b(3, "android.webkit.WebView#<init>");
                            bepg.mo60891b(2, "com.squareup.leakcanary.internal.DisplayLeakActivity$LeakListAdapter#getView");
                            bepg.mo60891b(3, "com.squareup.leakcanary.internal.DisplayLeakActivity#deleteAllLeaks");
                            bepg.mo60891b(2, "com.squareup.leakcanary.internal.DisplayLeakActivity#onCreateOptionsMenu");
                            bepg.mo60891b(2, "com.squareup.leakcanary.internal.DisplayLeakActivity#shareHeapDump");
                            bepg.mo60891b(2, "com.badlogic.gdx.utils.GdxNativesLoader#load");
                            bepg.mo60891b(2, "com.badlogic.gdx.backends.android.AndroidFragmentApplication#initializeForView");
                            int i5 = Build.VERSION.SDK_INT;
                            bepi bepi = new bepi(bepg.f111977a, bepg.f111978b.mo67664a(), bepg.f111979c.mo67664a());
                            StrictMode.ThreadPolicy b = bepd.m95383b(new StrictMode.ThreadPolicy.Builder().penaltyLog().build());
                            beph beph = new beph(bepi);
                            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(b);
                            builder.penaltyListener(bepi.f111981a, beph);
                            bepd.m95382a(builder.build());
                            bepd.m95382a(bepd.m95383b(new StrictMode.ThreadPolicy.Builder().penaltyDropBox().build()));
                            StrictMode.VmPolicy build = new StrictMode.VmPolicy.Builder().penaltyDropBox().build();
                            bmxy.m108581a(new beoy());
                            StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects = new StrictMode.VmPolicy.Builder(build).detectLeakedClosableObjects().detectLeakedSqlLiteObjects();
                            int i6 = Build.VERSION.SDK_INT;
                            detectLeakedSqlLiteObjects.detectLeakedRegistrationObjects();
                            int i7 = Build.VERSION.SDK_INT;
                            detectLeakedSqlLiteObjects.detectFileUriExposure();
                            int i8 = Build.VERSION.SDK_INT;
                            detectLeakedSqlLiteObjects.detectActivityLeaks();
                            int i9 = Build.VERSION.SDK_INT;
                            int i10 = Build.VERSION.SDK_INT;
                            detectLeakedSqlLiteObjects.detectContentUriWithoutPermission();
                            int i11 = Build.VERSION.SDK_INT;
                            int i12 = Build.VERSION.SDK_INT;
                            detectLeakedSqlLiteObjects.detectCredentialProtectedWhileLocked();
                            detectLeakedSqlLiteObjects.detectImplicitDirectBoot();
                            StrictMode.setVmPolicy(detectLeakedSqlLiteObjects.build());
                        } else {
                            throw new IllegalStateException("Device manufacturer is null, something is horribly wrong");
                        }
                    } catch (Exception e3) {
                        Log.e("GmsApplication", "Failed to install StrictMode whitelists");
                    }
                }
                boolean a6 = slh.m35572a(slf.m35566a());
                StringBuilder sb = new StringBuilder(34);
                sb.append("Set StatisticalEventTracker: ");
                sb.append(a6);
                sb.toString();
                aaao.m21026a();
                if (cdpl.m134607b()) {
                    sla = new sla(adzl.f62962b.mo25877a(1, 2), skx.m35565a());
                } else {
                    sla = null;
                }
                asfb.f88804n = new sls(sla);
                int i13 = Build.VERSION.SDK_INT;
                if (getApplicationInfo().targetSdkVersion >= 26) {
                    if (rrz.m34323a()) {
                        Log.i("GmsApplication", "Registering the BackgroundBroadcastReceiverSupport receiver.");
                        rrz.m34321a(this);
                    }
                }
                rph rph = new rph(this);
                if (!cdiy.f180964a.mo6606a().mo77659a()) {
                    int i14 = Build.VERSION.SDK_INT;
                    aymd aymd2 = aymd.BUILD_TYPE_UNKNOWN;
                    int i15 = Build.VERSION.SDK_INT;
                    aymd aymd3 = aymd.BUILD_TYPE_PRODMNC;
                    aymd m2 = stu.m36327m();
                    if (m2 != aymd.BUILD_TYPE_PROD) {
                        if (aymd3 != aymd.BUILD_TYPE_PRODMNC) {
                        }
                        NotificationManager notificationManager = (NotificationManager) rph.f43487a.getSystemService("notification");
                        try {
                            notificationManager.cancel("NOT_MNC", 10436);
                            notificationManager.cancel("NOT_MNC", 39789);
                        } catch (SecurityException e4) {
                            Log.w("BuildVerifier", "Failure to cancel notifications.", e4);
                        }
                    }
                    rfi.f42868a.mo24587a(rph.f43487a, 2, "NOT_MNC");
                } else {
                    aymd aymd4 = aymd.BUILD_TYPE_UNKNOWN;
                    int i16 = Build.VERSION.SDK_INT;
                    if (!rph.f43487a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        int i17 = Build.VERSION.SDK_INT;
                        if (!rph.f43487a.getPackageManager().hasSystemFeature("android.software.leanback")) {
                            int i18 = Build.VERSION.SDK_INT;
                            if (!rph.f43487a.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                int i19 = Build.VERSION.SDK_INT;
                                if (!rph.f43487a.getPackageManager().hasSystemFeature("android.hardware.ram.low")) {
                                    int i20 = Build.VERSION.SDK_INT;
                                    int i21 = Build.VERSION.SDK_INT;
                                    int i22 = Build.VERSION.SDK_INT;
                                    int i23 = Build.VERSION.SDK_INT;
                                    aymd = aymd.BUILD_TYPE_PRODQT;
                                    z2 = true;
                                    m = stu.m36327m();
                                    if (m != aymd) {
                                        rph.mo24987a(true, false, aymd, m);
                                    } else {
                                        if (z2) {
                                            int ordinal = m.ordinal();
                                            if (ordinal == 1 || ordinal == 3 || ordinal == 5 || ordinal == 12 || ordinal == 9 || ordinal == 10) {
                                                rph.mo24987a(true, true, aymd, m);
                                            }
                                        }
                                        rph.mo24987a(false, false, aymd, m);
                                    }
                                } else {
                                    aymd = aymd.BUILD_TYPE_PRODGO;
                                }
                            } else {
                                aymd = aymd.BUILD_TYPE_AUTO;
                            }
                        } else {
                            aymd = aymd.BUILD_TYPE_ATV;
                        }
                    } else {
                        aymd = aymd.BUILD_TYPE_WEARABLE;
                    }
                    z2 = false;
                    m = stu.m36327m();
                    if (m != aymd) {
                    }
                }
                if (ssj.m36232c(this)) {
                    if (!z && ((Boolean) rsv.f43615d.mo25081c()).booleanValue()) {
                        new rpo(this).start();
                    }
                }
                int i24 = Build.VERSION.SDK_INT;
                sft.f44147a.mo25487a(getPackageManager());
                rue.m34467a();
                qma qma = new qma();
                synchronized (rue.class) {
                    rue.f43695a.add(qma);
                }
                registerReceiver(new rug(), new IntentFilter("com.google.android.gms.common.config.devicedoctor.UPDATED"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
                sgd.m35197a((Application) this);
                rss.m34362a(this);
                if (cdme.m134019e()) {
                    new adzt().postDelayed(new rpn(this), cdme.f181224a.mo6606a().mo77885d());
                }
                a = aabl.m21058a(m34211a(), "onCreate_stopTimer");
                try {
                    bdgs.m90764a().mo58024a(a4, bdgg.m90734a("GmsApplication#onCreate"));
                    if (a == null) {
                        return;
                    }
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                }
            } else {
                if (!cdkp.m133841h()) {
                    rvb.m34509a();
                }
                rvx rvx = new rvx();
                if (cdng.m134176c()) {
                    Log.i("Safeboot", "Checking safeboot...");
                    if (!rvz.m34545b()) {
                        Log.i("Safeboot", "Not entering safeboot; wrong process.");
                    } else {
                        rvk c3 = rvl.m34524c();
                        c3.f43750b = this;
                        c3.f43749a = bpun.SAFEBOOT_STARTUP;
                        c3.f43751c = new rwf();
                        if (!cdng.m134178e() && !cdng.m134179f()) {
                            try {
                                a3 = rvq.m34531a();
                                rud = a3.mo25179c();
                                try {
                                    a3.close();
                                } catch (SQLiteException e5) {
                                    e = e5;
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                rud = null;
                                Log.e("Safeboot", "Couldn't fetch crashData", e);
                                if (rud != null) {
                                }
                                rvl a7 = c3.mo25198a();
                                if (!cdng.m134177d()) {
                                }
                                a2 = rvx.f43784a.mo25209a(a7);
                                if (z3) {
                                }
                                if (a2.f43774a) {
                                }
                                if (cdkp.m133837d()) {
                                }
                                if (!cdkp.m133841h()) {
                                }
                                rvk c22 = rvl.m34524c();
                                c22.f43750b = this;
                                c22.f43749a = bpun.STARTUP;
                                new rvq().mo25210b(c22.mo25198a());
                                if (((Boolean) rsv.f43637z.mo25081c()).booleanValue()) {
                                }
                                if (cdoq.f181444a.mo6606a().mo78080a()) {
                                }
                                boolean a62 = slh.m35572a(slf.m35566a());
                                StringBuilder sb2 = new StringBuilder(34);
                                sb2.append("Set StatisticalEventTracker: ");
                                sb2.append(a62);
                                sb2.toString();
                                aaao.m21026a();
                                if (cdpl.m134607b()) {
                                }
                                asfb.f88804n = new sls(sla);
                                int i132 = Build.VERSION.SDK_INT;
                                if (getApplicationInfo().targetSdkVersion >= 26) {
                                }
                                rph rph2 = new rph(this);
                                if (!cdiy.f180964a.mo6606a().mo77659a()) {
                                }
                                if (ssj.m36232c(this)) {
                                }
                                int i242 = Build.VERSION.SDK_INT;
                                sft.f44147a.mo25487a(getPackageManager());
                                rue.m34467a();
                                qma qma2 = new qma();
                                synchronized (rue.class) {
                                }
                            } catch (Throwable th5) {
                                bqye.m113761a(th, th5);
                            }
                            if (rud != null) {
                                c3.f43755g = rud;
                            }
                        }
                        rvl a72 = c3.mo25198a();
                        z3 = !cdng.m134177d() && !cdng.m134179f();
                        a2 = rvx.f43784a.mo25209a(a72);
                        if (z3) {
                            try {
                                rws.m34583a(a72.f43760b).delete();
                            } catch (SecurityException e7) {
                                Log.w("Safeboot", "Failed to delete safeboot condition file.", e7);
                            }
                        }
                        if (a2.f43774a) {
                            Log.i("Safeboot", "Starting safeboot.");
                            new Thread(new rvv(a2.f43775b, rvw.m34541a(Math.max(cdkp.f181122a.mo6606a().mo77810M(), rvx.f43785b), a72))).start();
                            this.f43495c.setInSafeBoot();
                            a = aabl.m21058a(m34211a(), "onCreate_stopTimer");
                            try {
                                bdgs.m90764a().mo58024a(a4, bdgg.m90734a("GmsApplication#onCreate"));
                                if (a == null) {
                                    return;
                                }
                            } catch (Throwable th6) {
                                bqye.m113761a(th, th6);
                            }
                        }
                    }
                }
                if (cdkp.m133837d()) {
                }
                if (!cdkp.m133841h()) {
                }
                rvk c222 = rvl.m34524c();
                c222.f43750b = this;
                c222.f43749a = bpun.STARTUP;
                new rvq().mo25210b(c222.mo25198a());
                if (((Boolean) rsv.f43637z.mo25081c()).booleanValue()) {
                }
                if (cdoq.f181444a.mo6606a().mo78080a()) {
                }
                boolean a622 = slh.m35572a(slf.m35566a());
                StringBuilder sb22 = new StringBuilder(34);
                sb22.append("Set StatisticalEventTracker: ");
                sb22.append(a622);
                sb22.toString();
                aaao.m21026a();
                if (cdpl.m134607b()) {
                }
                asfb.f88804n = new sls(sla);
                int i1322 = Build.VERSION.SDK_INT;
                if (getApplicationInfo().targetSdkVersion >= 26) {
                }
                rph rph22 = new rph(this);
                if (!cdiy.f180964a.mo6606a().mo77659a()) {
                }
                if (ssj.m36232c(this)) {
                }
                int i2422 = Build.VERSION.SDK_INT;
                sft.f44147a.mo25487a(getPackageManager());
                rue.m34467a();
                qma qma22 = new qma();
                synchronized (rue.class) {
                }
            }
            a.close();
            return;
        }
        return;
        throw th;
        throw th;
        throw th;
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 5) {
            SQLiteDatabase.releaseMemory();
        }
    }

    public final void setTheme(int i) {
        m34212b().setTheme(i);
    }

    public final ComponentName startService(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        try {
            return super.startService(intent);
        } catch (IllegalStateException e) {
            Log.e("GmsApplication", "/system/etc/sysconfig/google.xml must have <allow-in-power-save package=\"com.google.android.gms\"/>.");
            try {
                ((UsageStatsManager) getSystemService(UsageStatsManager.class)).whitelistAppTemporarily("com.google.android.gms", 60000, Process.myUserHandle());
            } catch (SecurityException e2) {
                Log.e("GmsApplication", "Unable to re-add to doze whitelist", e2);
            }
            try {
                return super.startService(intent);
            } catch (IllegalStateException e3) {
                int i2 = Build.VERSION.SDK_INT;
                if ((bmxx.m108577a(intent.getPackage()) || "com.google.android.gms".equals(intent.getPackage())) && cdje.m133542b() && ((double) new Random().nextFloat()) < cdje.m133543c()) {
                    Log.e("GmsApplication", "Google Play services is unable to start a service. Exiting.", e3);
                    spn.m35884e();
                }
                throw e3;
            }
        }
    }

    /* renamed from: a */
    public final void mo24993a(String str, String str2) {
        aeat a = aeat.m51532a(this);
        long max = Math.max(TimeUnit.HOURS.toSeconds(12), cdme.f181224a.mo6606a().mo77890i());
        long max2 = Math.max(1 + max, cdme.f181224a.mo6606a().mo77889h());
        aebi aebi = new aebi();
        aebi.f63097i = str;
        aebi.mo34004a(max, max2);
        aebi.mo34023a(2);
        aebi.mo34024a(0, 0);
        aebi.f63102n = true;
        aebi.mo34027b(1);
        aebi.f63099k = str2;
        aebi.mo34026a(true);
        a.mo33984a(aebi.mo33974b());
    }
}
