package com.google.android.chimera;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Map;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleContext extends ContextThemeWrapper {

    /* renamed from: j */
    private static final ThreadLocal f7648j = new ThreadLocal();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final BroadcastReceiver f7649k = new deq();

    /* renamed from: l */
    private static final Object f7650l = new Object();

    /* renamed from: m */
    private static volatile div f7651m = null;

    /* renamed from: a */
    private ModuleContext f7652a;

    /* renamed from: b */
    private Context f7653b;

    /* renamed from: c */
    private dht f7654c;

    /* renamed from: d */
    private String f7655d;

    /* renamed from: e */
    private int f7656e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Resources f7657f;

    /* renamed from: g */
    private Resources f7658g;

    /* renamed from: h */
    private ClassLoader f7659h;

    /* renamed from: i */
    private bnhe f7660i;

    private ModuleContext() {
        super(null);
    }

    /* renamed from: a */
    private final Context m4858a(String str) {
        return new ModuleContext(super.createAttributionContext(str), this, null, this.f7657f);
    }

    public static ModuleContext createApplicationContext(Context context, dht dht, Resources resources, ClassLoader classLoader, Map map, dfp dfp) {
        m4860a(dfp);
        ModuleContext moduleContext = new ModuleContext();
        moduleContext.m4859a(context, moduleContext, dht, null, -1, "apkappcontext", resources, classLoader, map);
        deq.m8255a(context, moduleContext);
        return moduleContext;
    }

    public static ModuleContext getModuleContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof ModuleContext) {
                return (ModuleContext) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public Context createAttributionContext(String str) {
        String str2 = this.f7655d;
        if (str2 == null) {
            str2 = getAttributionTag();
        }
        if (str2 != null && str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
            sb.append(str2);
            sb.append(":");
            sb.append(str);
            str = sb.toString();
        } else if (str2 != null) {
            str = str2;
        }
        return m4858a(str);
    }

    public Context createCredentialProtectedStorageContext() {
        return new ModuleContext(super.createCredentialProtectedStorageContext(), this, this.f7655d, this.f7657f);
    }

    public Context createDeviceProtectedStorageContext() {
        return new ModuleContext(super.createDeviceProtectedStorageContext(), this, this.f7655d, this.f7657f);
    }

    public Context createDisplayContext(Display display) {
        Resources resources;
        if (this.f7657f != null) {
            try {
                resources = this.f7654c.mo8911c();
            } catch (PackageManager.NameNotFoundException | djq e) {
                throw new RuntimeException("Failed to create module Resources", e);
            }
        } else {
            resources = null;
        }
        return new ModuleContext(super.createDisplayContext(display), this, this.f7655d, resources);
    }

    public Context getApplicationContext() {
        return this.f7652a;
    }

    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = (ApplicationInfo) f7648j.get();
        return applicationInfo == null ? super.getApplicationInfo() : applicationInfo;
    }

    public Context getBaseContext() {
        return this.f7653b;
    }

    public ClassLoader getClassLoader() {
        return this.f7659h;
    }

    public Context getContainerContext() {
        return this.f7653b;
    }

    public Resources getContainerResources() {
        return this.f7658g;
    }

    public bnhe getFulfilledApis() {
        return this.f7660i;
    }

    public dht getModuleApk() {
        return this.f7654c;
    }

    public String getModuleId() {
        return this.f7655d;
    }

    public int getModuleVersion() {
        return this.f7656e;
    }

    public Resources getResources() {
        Resources resources = this.f7657f;
        return resources == null ? this.f7658g : resources;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public Object getSystemService(String str) {
        char c;
        Object systemService;
        switch (str.hashCode()) {
            case -905948230:
                if (str.equals("sensor")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -787751952:
                if (str.equals("window")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3599307:
                if (str.equals("user")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3649301:
                if (str.equals("wifi")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1923312055:
                if (str.equals("connectivity")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return this.f7653b.getSystemService(str);
        }
        if (c == 1 || c == 2 || c == 3 || c == 4) {
            return super.getBaseContext().getSystemService(str);
        }
        if (c != 5) {
            return super.getSystemService(str);
        }
        synchronized (f7650l) {
            systemService = super.getSystemService(str);
        }
        return systemService;
    }

    public ApplicationInfo overrideApplicationInfo(ApplicationInfo applicationInfo) {
        ApplicationInfo applicationInfo2 = (ApplicationInfo) f7648j.get();
        f7648j.set(applicationInfo);
        return applicationInfo2;
    }

    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks);
    }

    public void sendBroadcast(Intent intent) {
        div div = f7651m;
        bmzs.m108696a(div);
        super.sendBroadcast(diw.m8598a(this, intent, div, new String[0]));
    }

    public void sendBroadcastWithMultiplePermissions(Intent intent, String[] strArr) {
        div div = f7651m;
        bmzs.m108696a(div);
        super.sendBroadcastWithMultiplePermissions(diw.m8598a(this, intent, div, strArr), strArr);
    }

    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks);
    }

    public void updateModuleConfiguration(Configuration configuration) {
        Resources resources = this.f7657f;
        if (resources != null) {
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        ModuleContext moduleContext = this.f7652a;
        if (moduleContext != this) {
            moduleContext.updateModuleConfiguration(configuration);
        }
    }

    public ModuleContext(Context context, ModuleContext moduleContext, dht dht, String str, int i, Resources resources, ClassLoader classLoader, dfp dfp) {
        this();
        m4860a(dfp);
        m4859a(context, moduleContext, dht, str, i, str, resources, classLoader, moduleContext.getFulfilledApis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private final void m4859a(Context context, ModuleContext moduleContext, dht dht, String str, int i, String str2, Resources resources, ClassLoader classLoader, Map map) {
        Context context2;
        Resources resources2;
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 30 || !Build.VERSION.CODENAME.equals("REL")) {
            if (Build.VERSION.CODENAME.length() == 1) {
                boolean z2 = false;
                if (Build.VERSION.CODENAME.charAt(0) >= 'R' && Build.VERSION.CODENAME.charAt(0) <= 'Z') {
                    if (djs.f13356a != null) {
                        z = djs.f13356a.booleanValue();
                    } else {
                        try {
                            if (BuildConfig.FLAVOR_client.equals(Build.BRAND) && !Build.ID.startsWith("RPP1") && !Build.ID.startsWith("RPP2") && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457) {
                                z2 = true;
                            }
                            djs.f13356a = Boolean.valueOf(z2);
                        } catch (NumberFormatException e) {
                            djs.f13356a = true;
                        }
                        if (!djs.f13356a.booleanValue()) {
                            Log.w("PlatformUtils", "Build version must be at least 6301457 to support R in gmscore");
                        }
                        z = djs.f13356a.booleanValue();
                    }
                }
            }
            context2 = context;
            attachBaseContext(context2);
            this.f7652a = moduleContext;
            this.f7653b = context;
            this.f7654c = dht;
            this.f7655d = str;
            this.f7656e = i;
            this.f7659h = classLoader;
            this.f7660i = bnhe.m109413a(map);
            this.f7657f = resources;
            Resources resources3 = context.getResources();
            this.f7658g = resources3;
            resources2 = this.f7657f;
            if (resources2 != null) {
                resources2.updateConfiguration(resources3.getConfiguration(), this.f7658g.getDisplayMetrics());
                return;
            }
            return;
        }
        if (str2 != null) {
            ModuleContext moduleContext2 = getModuleContext(context);
            if (moduleContext2 != null) {
                context2 = moduleContext2.m4858a(str2);
            } else {
                context2 = context.createAttributionContext(str2);
            }
            attachBaseContext(context2);
            this.f7652a = moduleContext;
            this.f7653b = context;
            this.f7654c = dht;
            this.f7655d = str;
            this.f7656e = i;
            this.f7659h = classLoader;
            this.f7660i = bnhe.m109413a(map);
            this.f7657f = resources;
            Resources resources32 = context.getResources();
            this.f7658g = resources32;
            resources2 = this.f7657f;
            if (resources2 != null) {
            }
        }
        context2 = context;
        attachBaseContext(context2);
        this.f7652a = moduleContext;
        this.f7653b = context;
        this.f7654c = dht;
        this.f7655d = str;
        this.f7656e = i;
        this.f7659h = classLoader;
        this.f7660i = bnhe.m109413a(map);
        this.f7657f = resources;
        Resources resources322 = context.getResources();
        this.f7658g = resources322;
        resources2 = this.f7657f;
        if (resources2 != null) {
        }
    }

    public static ModuleContext createApplicationContext(ModuleContext moduleContext, String str, int i, dfp dfp) {
        m4860a(dfp);
        ModuleContext moduleContext2 = new ModuleContext();
        moduleContext2.m4859a(moduleContext.getContainerContext(), moduleContext2, moduleContext.f7654c, str, i, str, moduleContext.getResources(), moduleContext.f7659h, moduleContext.getFulfilledApis());
        return moduleContext2;
    }

    public void sendBroadcast(Intent intent, String str) {
        div div = f7651m;
        bmzs.m108696a(div);
        super.sendBroadcast(diw.m8598a(this, intent, div, str), str);
    }

    protected ModuleContext(Context context, ModuleContext moduleContext, String str, Resources resources) {
        this();
        m4859a(context, moduleContext.f7652a, moduleContext.f7654c, moduleContext.f7655d, moduleContext.f7656e, str, resources, moduleContext.f7659h, moduleContext.getFulfilledApis());
    }

    /* renamed from: a */
    private static void m4860a(dfp dfp) {
        if (f7651m == null) {
            synchronized (diw.class) {
                if (f7651m == null) {
                    f7651m = new div(dfp);
                }
            }
        }
    }
}
