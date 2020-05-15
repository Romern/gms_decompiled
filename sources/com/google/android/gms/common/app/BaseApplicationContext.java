package com.google.android.gms.common.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpClientStack;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.stats.radio.NetworkActivityDbHelper;
import com.google.android.gms.common.stats.radio.NetworkLatencyDbHelper;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import com.google.android.gms.common.transporter.FileMigrationApi;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BaseApplicationContext extends ContextWrapper {
    private static final String TAG = "BaseAppContext";
    private rpw apiaryRequestQueue;
    private Context baseContext;
    private boolean createNewAssetMgrs;
    private volatile CronetEngine cronetEngine;
    private final Object cronetEngineLock;
    /* access modifiers changed from: private */
    public String currentLanguage;
    private FileMigrationApi fileMigrationApi;
    private final BaseApplicationContext globalGmsState;
    private volatile boolean inSafeBoot;
    private final WeakHashMap knownLanguageObjects;
    private final Map lockMap;
    private rpw requestQueue;

    protected BaseApplicationContext(Context context) {
        this(context, null);
    }

    private rpw buildRequestQueue(String str, HttpClientStack httpClientStack) {
        rpw rpw = new rpw(new DiskBasedCache(new File(getCacheDir(), str)), new shp(httpClientStack), new adzt(Looper.getMainLooper()));
        rpw.start();
        return rpw;
    }

    private RadiosTracingLoggerProvider.NetworkActivityLogger createNetworkActivityLoggerImpl() {
        return new smm(new NetworkActivityDbHelper(this), snp.m35703a(1, 10), cdna.m134123d(), TimeUnit.MILLISECONDS, (int) cdna.m134122c());
    }

    private RadiosTracingLoggerProvider.NetworkLatencyLogger createNetworkLatencyLoggerImpl() {
        return new smo(new NetworkLatencyDbHelper(this), snp.m35703a(1, 10), cdna.m134123d(), TimeUnit.MILLISECONDS, (int) cdna.m134122c());
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f5, code lost:
        if (r0 == false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f8, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022e A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0231 A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0239 A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x023a A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0280 A[SYNTHETIC, Splitter:B:116:0x0280] */
    public synchronized Resources getResourcesWithLanguageAssets(Resources resources) {
        boolean z;
        char c;
        Context a;
        boolean z2;
        Resources resources2 = resources;
        synchronized (this) {
            rzz.m34726a(this.globalGmsState);
            if (this.currentLanguage != null) {
                AssetManager assets = resources.getAssets();
                AssetManager assetManager = !this.createNewAssetMgrs ? assets : resources2;
                WeakReference weakReference = (WeakReference) this.knownLanguageObjects.get(assetManager);
                if (weakReference != null) {
                    Resources resources3 = (Resources) weakReference.get();
                    if (this.createNewAssetMgrs) {
                        z2 = true;
                    } else {
                        z2 = resources3 == null;
                    }
                    rzz.m34729a(z2);
                    if (this.createNewAssetMgrs) {
                        if (resources3 != null) {
                            resources3.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                            return resources3;
                        }
                    }
                }
                bxvd da = bpve.f139314f.mo74144da();
                try {
                    AssetManager assetManager2 = assets;
                    if (this.createNewAssetMgrs) {
                        AssetManager assetManager3 = (AssetManager) AssetManager.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Object invoke = AssetManager.class.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager3, getApplicationInfo().sourceDir);
                        if (!(invoke instanceof Integer) || ((Integer) invoke).intValue() == 0) {
                            throw new Exception("addAssetPath(sourceDir) failed");
                        }
                        assetManager2 = assetManager3;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    String str = this.currentLanguage;
                    Resources resources4 = null;
                    if (!bqxw.m113733a(resources2, getPackageName())) {
                        c = 1;
                    } else if (bqxw.m113734a(resources2, str, getPackageName())) {
                        a = bqxx.m113736a(this);
                        String packageName = getPackageName();
                        String a2 = bqxw.m113729a(str);
                        if (bqxw.m113734a(resources2, a2, packageName)) {
                            String valueOf = String.valueOf(a.getFilesDir());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                            sb.append(valueOf);
                            File file = new File(sb.toString(), bqxw.m113727a(a, a2));
                            if (!file.exists() || file.lastModified() < new File(a.getPackageCodePath()).lastModified()) {
                                bqxw.m113731a(assetManager2, bqxw.m113726a(a, assetManager2, a2));
                                c = 2;
                            } else {
                                String a3 = bqxw.m113727a(a, a2);
                                String valueOf2 = String.valueOf(a.getFilesDir());
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(a3).length());
                                sb2.append(valueOf2);
                                sb2.append("/");
                                sb2.append(a3);
                                bqxw.m113731a(assetManager2, sb2.toString());
                                c = 3;
                            }
                        } else {
                            String valueOf3 = String.valueOf(a2);
                            throw new RuntimeException(valueOf3.length() == 0 ? new String("Does not have compressed data for language: ") : "Does not have compressed data for language: ".concat(valueOf3));
                        }
                    } else {
                        c = 4;
                    }
                    int uptimeMillis2 = (int) (SystemClock.uptimeMillis() - uptimeMillis);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpve bpve = (bpve) da.f164949b;
                    bpve.f139316a |= 4;
                    bpve.f139319d = uptimeMillis2;
                    if (c == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    try {
                        if (this.createNewAssetMgrs) {
                            resources4 = new Resources(assetManager2, resources.getDisplayMetrics(), resources.getConfiguration());
                        }
                        if (z) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpve bpve2 = (bpve) da.f164949b;
                            bpve2.f139317b = 2;
                            int i = bpve2.f139316a | 1;
                            bpve2.f139316a = i;
                            String str2 = this.currentLanguage;
                            str2.getClass();
                            bpve2.f139316a = i | 2;
                            bpve2.f139318c = str2;
                            sendBroadcast(spn.m35889g("com.google.android.gms.common.LEMON_LOG").putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                        }
                        this.knownLanguageObjects.put(assetManager, new WeakReference(resources4));
                        boolean z3 = this.createNewAssetMgrs;
                    } catch (Exception e) {
                        e = e;
                        try {
                            String valueOf4 = String.valueOf(e);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 17);
                            sb3.append("ResourcesHelper: ");
                            sb3.append(valueOf4);
                            Log.w(TAG, sb3.toString());
                            String message = e.getMessage() != null ? "" : e.getMessage();
                            if (!da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpve bpve3 = (bpve) da.f164949b;
                            message.getClass();
                            int i2 = bpve3.f139316a | 8;
                            bpve3.f139316a = i2;
                            bpve3.f139320e = message;
                            if (z) {
                                bpve3.f139317b = 2;
                                int i3 = i2 | 1;
                                bpve3.f139316a = i3;
                                String str3 = this.currentLanguage;
                                str3.getClass();
                                bpve3.f139316a = i3 | 2;
                                bpve3.f139318c = str3;
                                sendBroadcast(spn.m35889g("com.google.android.gms.common.LEMON_LOG").putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                            }
                            return resources2;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpve bpve4 = (bpve) da.f164949b;
                            bpve4.f139317b = 2;
                            int i4 = bpve4.f139316a | 1;
                            bpve4.f139316a = i4;
                            String str4 = this.currentLanguage;
                            str4.getClass();
                            bpve4.f139316a = i4 | 2;
                            bpve4.f139318c = str4;
                            sendBroadcast(spn.m35889g("com.google.android.gms.common.LEMON_LOG").putExtra("proto", ((bpve) da.mo74062i()).mo73642k()));
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    bqxw.m113730a(a, "locale-filtered-resources-", -1, null);
                    throw new RuntimeException("AssetManager-twiddling failed", e2);
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                    String valueOf42 = String.valueOf(e);
                    StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf42).length() + 17);
                    sb32.append("ResourcesHelper: ");
                    sb32.append(valueOf42);
                    Log.w(TAG, sb32.toString());
                    if (e.getMessage() != null) {
                    }
                    if (!da.f164950c) {
                    }
                    bpve bpve32 = (bpve) da.f164949b;
                    message.getClass();
                    int i22 = bpve32.f139316a | 8;
                    bpve32.f139316a = i22;
                    bpve32.f139320e = message;
                    if (z) {
                    }
                    return resources2;
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z) {
                    }
                    throw th;
                }
            }
        }
    }

    public void attachBaseContext(Context context) {
        this.baseContext = context;
        if (ssw.m36269a()) {
            context = context.createAttributionContext("apkappcontext");
        }
        super.attachBaseContext(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r0;
     */
    @Deprecated
    public synchronized RequestQueue getAuthChannelBoundApiaryRequestQueue() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext == null) {
            rpw rpw = this.apiaryRequestQueue;
            if (rpw == null) {
                rpw = buildRequestQueue("volleyApiary", new rqq(this, ((Boolean) rsv.f43612a.mo25081c()).booleanValue()));
                this.apiaryRequestQueue = rpw;
            }
        } else {
            return baseApplicationContext.getAuthChannelBoundApiaryRequestQueue();
        }
    }

    public Context getBaseContext() {
        return this.baseContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ InvalidConfigException -> 0x0062, bxwf -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ InvalidConfigException -> 0x0062, bxwf -> 0x0060 }] */
    public CronetEngine getCronetEngine() {
        CronetEngine cronetEngine2;
        CronetEngine cronetEngine3 = this.cronetEngine;
        if (cronetEngine3 != null) {
            return cronetEngine3;
        }
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getCronetEngine();
        }
        synchronized (this.cronetEngineLock) {
            cronetEngine2 = this.cronetEngine;
            if (cronetEngine2 == null) {
                CronetEngine.Builder builder = new CronetEngine.Builder(this);
                builder.enableQuic(true);
                try {
                    for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this).getAllModulesWithMetadata("com.google.android.gmscore.cronet.config.proto")) {
                        try {
                            for (aylq aylq : ((aylr) GeneratedMessageLite.m124014a(aylr.f97922b, moduleInfo.getMetadata(this).getByteArray("com.google.android.gmscore.cronet.config.proto"))).f97924a) {
                                builder.addQuicHint(aylq.f97918a, aylq.f97919b, aylq.f97920c);
                            }
                        } catch (InvalidConfigException e) {
                            e = e;
                            String valueOf = String.valueOf(moduleInfo.moduleId);
                            Log.e("CronetEngineFactory", valueOf.length() != 0 ? new String("Failed to read or parse cronet config metadata for module ") : "Failed to read or parse cronet config metadata for module ".concat(valueOf), e);
                        } catch (bxwf e2) {
                            e = e2;
                            String valueOf2 = String.valueOf(moduleInfo.moduleId);
                            Log.e("CronetEngineFactory", valueOf2.length() != 0 ? new String("Failed to read or parse cronet config metadata for module ") : "Failed to read or parse cronet config metadata for module ".concat(valueOf2), e);
                        }
                    }
                    cronetEngine2 = builder.build();
                } catch (InvalidConfigException e3) {
                    Log.e("CronetEngineFactory", "Failed to read metadata com.google.android.gmscore.cronet.config.proto", e3);
                    cronetEngine2 = builder.build();
                }
                this.cronetEngine = cronetEngine2;
            }
        }
        return cronetEngine2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r0;
     */
    public synchronized FileMigrationApi getFileMigrationApi() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext == null) {
            FileMigrationApi fileMigrationApi2 = this.fileMigrationApi;
            if (fileMigrationApi2 == null) {
                fileMigrationApi2 = new FileMigrationApi();
                this.fileMigrationApi = fileMigrationApi2;
            }
        } else {
            return baseApplicationContext.getFileMigrationApi();
        }
    }

    /* access modifiers changed from: protected */
    public BaseApplicationContext getGlobalState() {
        return this.globalGmsState;
    }

    public boolean getInSafeBoot() {
        return this.inSafeBoot;
    }

    public ConcurrentMap getLockMap(String str) {
        ConcurrentMap concurrentMap;
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getLockMap(str);
        }
        synchronized (this.lockMap) {
            concurrentMap = (ConcurrentMap) this.lockMap.get(str);
            if (concurrentMap == null) {
                concurrentMap = new ConcurrentHashMap();
                this.lockMap.put(str, concurrentMap);
            }
        }
        return concurrentMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.isNopLogger() == false) goto L_0x002c;
     */
    public synchronized RadiosTracingLoggerProvider.NetworkActivityLogger getNetworkActivityLogger() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext == null) {
            boolean f = cdna.m134125f();
            RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLoggerImpl = RadiosTracingLoggerProvider.getNetworkActivityLoggerImpl();
            if (f) {
                if (networkActivityLoggerImpl != null) {
                    if (!networkActivityLoggerImpl.isNopLogger()) {
                    }
                }
                RadiosTracingLoggerProvider.setNetworkActivityLoggerImpl(createNetworkActivityLoggerImpl());
                return RadiosTracingLoggerProvider.getNetworkActivityLoggerImpl();
            }
            if (!f) {
                if (networkActivityLoggerImpl == null) {
                }
                RadiosTracingLoggerProvider.setNetworkActivityLoggerImpl(new smm());
            }
            return RadiosTracingLoggerProvider.getNetworkActivityLoggerImpl();
        }
        return baseApplicationContext.getNetworkActivityLogger();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.isNopLogger() == false) goto L_0x002c;
     */
    public synchronized RadiosTracingLoggerProvider.NetworkLatencyLogger getNetworkLatencyLogger() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext == null) {
            boolean b = cdna.m134121b();
            RadiosTracingLoggerProvider.NetworkLatencyLogger networkLatencyLoggerImpl = RadiosTracingLoggerProvider.getNetworkLatencyLoggerImpl();
            if (b) {
                if (networkLatencyLoggerImpl != null) {
                    if (!networkLatencyLoggerImpl.isNopLogger()) {
                    }
                }
                RadiosTracingLoggerProvider.setNetworkLatencyLoggerImpl(createNetworkLatencyLoggerImpl());
                return RadiosTracingLoggerProvider.getNetworkLatencyLoggerImpl();
            }
            if (!b) {
                if (networkLatencyLoggerImpl == null) {
                }
                RadiosTracingLoggerProvider.setNetworkLatencyLoggerImpl(new smo());
            }
            return RadiosTracingLoggerProvider.getNetworkLatencyLoggerImpl();
        }
        return baseApplicationContext.getNetworkLatencyLogger();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r0;
     */
    @Deprecated
    public synchronized RequestQueue getRequestQueue() {
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext == null) {
            rpw rpw = this.requestQueue;
            if (rpw == null) {
                rpw = buildRequestQueue("volley", new sho(this, ((Boolean) rsv.f43612a.mo25081c()).booleanValue()));
                this.requestQueue = rpw;
            }
        } else {
            return baseApplicationContext.getRequestQueue();
        }
    }

    public void installLanguageAssets(Resources resources) {
        rzz.m34726a(this.globalGmsState);
        this.currentLanguage = resources.getConfiguration().locale.getLanguage();
        int i = Build.VERSION.SDK_INT;
        this.createNewAssetMgrs = false;
        if (bqxw.m113733a(resources, getPackageName())) {
            sns sns = new sns(9);
            registerReceiver(new aacn("common-api") {
                /* class com.google.android.gms.common.app.BaseApplicationContext.C15641 */

                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    if (!BaseApplicationContext.this.currentLanguage.equals(intent.getStringExtra("lang"))) {
                        Process.killProcess(Process.myPid());
                    }
                }
            }, new IntentFilter("com.google.android.gms.common.LANGUAGE_RELOAD"), "com.google.android.gms.permission.INTERNAL_BROADCAST", new snr(sns));
            sns.start();
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFromContainer() {
        return BaseApplicationContext.class.getClassLoader() == getClassLoader() || ModuleManager.get(this).getCurrentModuleApk().apkRequired;
    }

    public void setInSafeBoot() {
        this.inSafeBoot = true;
    }

    public void watchForLeaks(Object obj) {
    }

    protected BaseApplicationContext(Context context, BaseApplicationContext baseApplicationContext) {
        super(context);
        this.inSafeBoot = false;
        this.currentLanguage = null;
        this.knownLanguageObjects = new WeakHashMap();
        this.cronetEngineLock = new Object();
        this.baseContext = context;
        this.globalGmsState = baseApplicationContext;
        if (baseApplicationContext == null) {
            this.lockMap = new HashMap();
        } else {
            this.lockMap = null;
        }
    }
}
