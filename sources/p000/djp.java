package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.container.ModuleApi;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: djp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djp {

    /* renamed from: a */
    private static volatile djp f13351a = null;

    /* renamed from: b */
    private final Object f13352b = new Object();

    /* renamed from: c */
    private C1245ok f13353c = new C1245ok();

    /* renamed from: d */
    private final Map f13354d = adyi.m51410a();

    /* renamed from: e */
    private final Map f13355e = adyi.m51410a();

    /* renamed from: a */
    static final Resources m8661a(dht dht) {
        if (dht instanceof dfz) {
            return null;
        }
        try {
            return dht.mo8911c();
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(dht);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Config is out of date: ");
            sb.append(valueOf);
            sb.append(" has been removed");
            Log.w("ChimeraModuleLdr", sb.toString());
            String valueOf2 = String.valueOf(dht);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("can't load resources from ");
            sb2.append(valueOf2);
            throw new InvalidConfigException(sb2.toString(), e);
        } catch (djq | RuntimeException e2) {
            String valueOf3 = String.valueOf(dht);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
            sb3.append("Failed to load resources for module ");
            sb3.append(valueOf3);
            Log.e("ChimeraModuleLdr", sb3.toString(), e2);
            throw e2;
        }
    }

    /* renamed from: a */
    public static djp m8662a() {
        djp djp = f13351a;
        if (djp == null) {
            synchronized (djp.class) {
                djp = f13351a;
                if (djp == null) {
                    djp = new djp();
                    f13351a = djp;
                }
            }
        }
        return djp;
    }

    /* renamed from: a */
    static final void m8663a(dht dht, djy djy, boolean z) {
        try {
            if (dht.mo8957a(djy, z)) {
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        String valueOf = String.valueOf(dht);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("Config is out of date: ");
        sb.append(valueOf);
        sb.append(" has been modified");
        Log.w("ChimeraModuleLdr", sb.toString());
        String valueOf2 = String.valueOf(dht);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
        sb2.append("Module APK has been modified: ");
        sb2.append(valueOf2);
        throw new InvalidConfigException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo9138a(Context context, djz djz, int i, djy djy, dfp dfp) {
        dfc dfc;
        djo djo;
        boolean z;
        int i2;
        djo djo2;
        dht dht;
        ClassLoader classLoader;
        String str;
        ModuleApi moduleApi;
        String str2;
        int i3;
        ArrayList arrayList;
        dka dka;
        dnc dnc;
        ArrayList arrayList2;
        ClassLoader classLoader2;
        String str3;
        int i4;
        String str4;
        int i5;
        Context context2 = context;
        djz djz2 = djz;
        int i6 = i;
        djy djy2 = djy;
        String str5 = ":";
        String str6 = "ChimeraModuleLdr";
        dfc dfc2 = new dfc(djy2);
        int a = this.f13353c.mo15616a(dfc2);
        if (a >= 0) {
            return a;
        }
        int j = djy.mo9159j();
        boolean z2 = j == 1 && djy.mo9167r().mo9183R() == i6;
        if (j == 0) {
            dfc = dfc2;
        } else if (z2) {
            dfc = dfc2;
        } else if (djz2 == null) {
            String valueOf = String.valueOf(djy.mo9151b());
            throw new InvalidConfigException(valueOf.length() == 0 ? new String("failed to load installed modules for ") : "failed to load installed modules for ".concat(valueOf));
        } else {
            String e = djy.mo9154e();
            ModuleApi a2 = mo9142a(e);
            if (a2 == null) {
                dgd.m8383a(context2, 15, e);
                String valueOf2 = String.valueOf(e);
                throw new djq(valueOf2.length() == 0 ? new String("failed to get module api:") : "failed to get module api:".concat(valueOf2));
            }
            Set instrumentationFilterRules = a2.getInstrumentationFilterRules(context2);
            ArrayList arrayList3 = new ArrayList(j);
            ArrayList arrayList4 = new ArrayList(j);
            brtm brtm = new brtm();
            dnc dnc2 = new dnc();
            dfc = dfc2;
            dka dka2 = new dka();
            Map a3 = adyi.m51410a();
            int i7 = j - 1;
            Set set = instrumentationFilterRules;
            while (true) {
                dnc dnc3 = dnc2;
                if (i7 < 0) {
                    break;
                }
                djy2.mo9150a(brtm, i7);
                int R = brtm.mo9183R();
                if (i6 != R) {
                    Set set2 = set;
                    i3 = i7;
                    ArrayList arrayList5 = arrayList4;
                    ArrayList arrayList6 = arrayList3;
                    moduleApi = a2;
                    int a4 = mo9138a(context, djz, R, djz2.mo9169a(R), dfp);
                    djy djy3 = ((dfc) this.f13353c.mo15620b(a4)).f13003a;
                    djo djo3 = (djo) this.f13353c.mo15621c(a4);
                    arrayList6.add(djo3);
                    int B = brtm.mo69893B();
                    int i8 = 0;
                    while (i8 < B) {
                        ArrayList arrayList7 = arrayList6;
                        String str7 = str5;
                        ArrayList arrayList8 = arrayList5;
                        String str8 = str6;
                        dnc dnc4 = dnc3;
                        djz2.mo9173a(dnc4, brtm.mo69923d(i8));
                        int __offset = dnc4.__offset(10);
                        if (__offset != 0) {
                            i5 = dnc4.f143329bb.getInt(__offset + dnc4.bb_pos);
                        } else {
                            i5 = 0;
                        }
                        djz2.mo9171a(dka2, i5);
                        this.f13354d.put(dka2.mo9184b(), djy3);
                        i8++;
                        dnc3 = dnc4;
                        arrayList6 = arrayList7;
                        str6 = str8;
                        str5 = str7;
                        arrayList5 = arrayList8;
                    }
                    m8663a(djo3.f13347a, djy3, dfp.mo8869h());
                    ClassLoader classLoader3 = djo3.f13349c;
                    if (!arrayList5.isEmpty()) {
                        arrayList2 = arrayList5;
                        classLoader2 = (ClassLoader) arrayList2.get(arrayList5.size() - 1);
                    } else {
                        arrayList2 = arrayList5;
                        classLoader2 = djg.m8632a();
                    }
                    boolean c = dfp.mo8864c();
                    Set b = adyi.m51413b();
                    dnc dnc5 = new dnc();
                    int B2 = brtm.mo69893B();
                    arrayList = arrayList6;
                    int i9 = 0;
                    while (i9 < B2) {
                        int i10 = B2;
                        djz2.mo9173a(dnc5, brtm.mo69923d(i9));
                        String str9 = str5;
                        a3.put(dnc5.mo9301e(), Integer.valueOf(dnc5.mo9168Q()));
                        if (b == null) {
                            str3 = str6;
                        } else {
                            int __offset2 = dnc5.__offset(8);
                            if (__offset2 != 0) {
                                i4 = dnc5.__vector_len(__offset2);
                            } else {
                                i4 = 0;
                            }
                            if (i4 == 0) {
                                str3 = str6;
                                b = null;
                            } else {
                                int i11 = 0;
                                while (i11 < i4) {
                                    int i12 = i4;
                                    String str10 = str6;
                                    int __offset3 = dnc5.__offset(8);
                                    if (__offset3 != 0) {
                                        str4 = dnc5.__string(dnc5.__vector(__offset3) + (i11 * 4));
                                    } else {
                                        str4 = null;
                                    }
                                    b.add(str4);
                                    i11++;
                                    str6 = str10;
                                    i4 = i12;
                                }
                                str3 = str6;
                            }
                        }
                        i9++;
                        B2 = i10;
                        str6 = str3;
                        str5 = str9;
                    }
                    str = str5;
                    str2 = str6;
                    if (c) {
                        int i13 = Build.VERSION.SDK_INT;
                    } else if (b != null) {
                        if (set2 != null) {
                            b.addAll(set2);
                        }
                        classLoader3 = new djg(classLoader3, classLoader2, false, (String[]) b.toArray(new String[b.size()]));
                        arrayList2.add(classLoader3);
                        dka = dka2;
                        dnc = dnc3;
                        set = null;
                    }
                    arrayList2.add(classLoader3);
                    dka = dka2;
                    dnc = dnc3;
                    set = null;
                } else {
                    i3 = i7;
                    arrayList = arrayList3;
                    moduleApi = a2;
                    str = str5;
                    str2 = str6;
                    dka = dka2;
                    dnc = dnc3;
                    arrayList2 = arrayList4;
                }
                i7 = i3 - 1;
                i6 = i;
                arrayList4 = arrayList2;
                dnc2 = dnc;
                dka2 = dka;
                arrayList3 = arrayList;
                str6 = str2;
                a2 = moduleApi;
                str5 = str;
                djy2 = djy;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (Build.SUPPORTED_64_BIT_ABIS.length > 0 && Build.SUPPORTED_32_BIT_ABIS.length > 0) {
                dgd.m8383a(context2, !djr.m8670a() ? 71 : 72, djy.mo9164o());
            }
            bmxy.m108600b(!arrayList3.isEmpty() && arrayList4.size() == arrayList3.size());
            dht a5 = dht.m8526a(context2, djy2);
            if (a5 != null) {
                try {
                    a2.onBeforeApkLoad(context.getApplicationContext(), a5);
                    try {
                        ClassLoader a6 = a5.mo8908a((ClassLoader) arrayList4.get(arrayList4.size() - 1));
                        if (!dfp.mo8864c()) {
                            int size = arrayList4.size();
                            boolean z3 = true;
                            djo djo4 = null;
                            while (size >= 0) {
                                if (!z3) {
                                    classLoader = (ClassLoader) arrayList4.get(size);
                                } else {
                                    classLoader = a6;
                                }
                                try {
                                    classLoader.loadClass("com.google.android.chimeraresources.R$id");
                                    djo4 = !z3 ? (djo) arrayList3.get(size) : null;
                                    size--;
                                    z3 = false;
                                } catch (ClassNotFoundException e2) {
                                }
                            }
                            djo2 = djo4;
                        } else {
                            int i15 = Build.VERSION.SDK_INT;
                            djo2 = null;
                        }
                        Context applicationContext = context.getApplicationContext();
                        if (djo2 != null) {
                            dht = djo2.f13347a;
                        } else {
                            dht = a5;
                        }
                        ModuleContext createApplicationContext = ModuleContext.createApplicationContext(applicationContext, a5, m8661a(dht), a6, a3, dfp);
                        try {
                            a2.onApkLoaded(createApplicationContext);
                            djo = new djo(a5, createApplicationContext, a6, djo2);
                            this.f13353c.put(dfc, djo);
                            return this.f13353c.mo15616a(dfc);
                        } catch (Exception e3) {
                            Exception exc = e3;
                            String b2 = djy.mo9151b();
                            String valueOf3 = String.valueOf(b2);
                            Log.e(str6, valueOf3.length() == 0 ? new String("Initialization failed for module apk ") : "Initialization failed for module apk ".concat(valueOf3), exc);
                            String name = new File(b2).getName();
                            String message = exc.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(message).length());
                            sb.append(name);
                            sb.append(str5);
                            sb.append(message);
                            dgd.m8383a(context2, 18, sb.toString());
                            throw new djq("onApkLoaded failed.", exc);
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        String valueOf4 = String.valueOf(a5);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
                        sb2.append("Config is out of date: ");
                        sb2.append(valueOf4);
                        sb2.append(" has been removed");
                        Log.w(str6, sb2.toString());
                        String valueOf5 = String.valueOf(a5);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                        sb3.append("can't load code from ");
                        sb3.append(valueOf5);
                        throw new InvalidConfigException(sb3.toString(), e4);
                    } catch (djq | RuntimeException e5) {
                        String valueOf6 = String.valueOf(a5);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 31);
                        sb4.append("Failed to load code for module ");
                        sb4.append(valueOf6);
                        Log.e(str6, sb4.toString(), e5);
                        File file = new File(djy.mo9151b());
                        String name2 = file.getName();
                        String message2 = e5.getMessage();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(name2).length() + 1 + String.valueOf(message2).length());
                        sb5.append(name2);
                        sb5.append(str5);
                        sb5.append(message2);
                        String sb6 = sb5.toString();
                        if (djy.mo9149a() == 3 && !file.canRead()) {
                            String valueOf7 = String.valueOf(sb6);
                            String str11 = "";
                            int i16 = 0;
                            while (file != null && i16 < 10) {
                                if (!file.canRead()) {
                                    i2 = 0;
                                } else {
                                    i2 = 4;
                                }
                                if (file.canWrite()) {
                                    i2 |= 2;
                                }
                                if (file.canExecute()) {
                                    i2 |= 1;
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str11).length() + 12);
                                sb7.append("/");
                                sb7.append(i2);
                                sb7.append(str11);
                                str11 = sb7.toString();
                                file = file.getParentFile();
                                i16++;
                            }
                            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 1 + String.valueOf(str11).length());
                            sb8.append(valueOf7);
                            sb8.append(str5);
                            sb8.append(str11);
                            sb6 = sb8.toString();
                        }
                        dgd.m8383a(context2, 17, sb6);
                        throw e5;
                    }
                } catch (Exception e6) {
                    String valueOf8 = String.valueOf(a5);
                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 24);
                    sb9.append("Setup failed for module ");
                    sb9.append(valueOf8);
                    Log.e(str6, sb9.toString(), e6);
                    String name3 = new File(djy.mo9151b()).getName();
                    String message3 = e6.getMessage();
                    StringBuilder sb10 = new StringBuilder(String.valueOf(name3).length() + 1 + String.valueOf(message3).length());
                    sb10.append(name3);
                    sb10.append(str5);
                    sb10.append(message3);
                    dgd.m8383a(context2, 16, sb10.toString());
                    throw new djq("onBeforeApkLoad failed.", e6);
                }
            } else {
                throw new djq("failed to create ModuleApk");
            }
        }
        if (djy.mo9149a() == 1) {
            z = true;
        } else {
            z = false;
        }
        bmzs.m108698a(z);
        Map a7 = adyi.m51410a();
        if (z2 && djz2 != null) {
            int B3 = djy.mo9167r().mo69893B();
            dnc dnc6 = new dnc();
            for (int i17 = 0; i17 < B3; i17++) {
                int d = djy.mo9167r().mo69923d(i17);
                if (djz2.mo9173a(dnc6, d) == null || dnc6.mo9301e() == null) {
                    String b3 = djy.mo9151b();
                    StringBuilder sb11 = new StringBuilder(String.valueOf(b3).length() + 81);
                    sb11.append("failed to load installed modules for ");
                    sb11.append(b3);
                    sb11.append(": error reading on availableApis ");
                    sb11.append(d);
                    throw new InvalidConfigException(sb11.toString());
                }
                a7.put(dnc6.mo9301e(), Integer.valueOf(dnc6.mo9168Q()));
            }
        }
        dfz dfz = new dfz(context2);
        Context applicationContext2 = context.getApplicationContext();
        djo = new djo(dfz, ModuleContext.createApplicationContext(applicationContext2, dfz, null, applicationContext2.getClassLoader(), a7, dfp), context.getClassLoader(), null);
        this.f13353c.put(dfc, djo);
        return this.f13353c.mo15616a(dfc);
    }

    /* renamed from: a */
    public final Context mo9139a(Context context, dfp dfp) {
        return mo9141a(context, null, "", -1, -1, new dfz(context).mo8915g(), false, dfp);
    }

    /* renamed from: a */
    public final Context mo9140a(Context context, djz djz, dka dka, dfp dfp) {
        return mo9141a(context, djz, dka.mo9184b(), dka.mo9186e(), dka.mo9183R(), djz.mo9169a(dka.mo9183R()), dfp.mo8868g(), dfp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo9141a(Context context, djz djz, String str, int i, int i2, djy djy, boolean z, dfp dfp) {
        Object obj;
        ModuleContext moduleContext;
        String str2 = str;
        Object obj2 = this.f13352b;
        synchronized (obj2) {
            try {
                djy djy2 = (djy) this.f13354d.get(str2);
                if (djy2 != null) {
                    if (dff.m8282a(djy2, djy, true) != 0) {
                        throw new InvalidConfigException("Module already loaded from different APK");
                    }
                }
                int a = mo9138a(context, djz, i2, djy, dfp);
                djy djy3 = ((dfc) this.f13353c.mo15620b(a)).f13003a;
                djo djo = (djo) this.f13353c.mo15621c(a);
                Resources a2 = m8661a(djo.f13350d.f13347a);
                this.f13354d.put(str2, djy3);
                m8663a(djo.f13347a, djy3, dfp.mo8869h());
                ModuleContext moduleContext2 = djo.f13348b;
                if (!z) {
                    moduleContext = moduleContext2;
                } else {
                    ModuleContext moduleContext3 = (ModuleContext) djo.f13346e.get(str2);
                    if (moduleContext3 == null) {
                        ModuleContext createApplicationContext = ModuleContext.createApplicationContext(djo.f13348b, str2, i, dfp);
                        djo.f13346e.put(str2, createApplicationContext);
                        moduleContext = createApplicationContext;
                    } else {
                        moduleContext = moduleContext3;
                    }
                }
                obj = obj2;
                ModuleContext moduleContext4 = new ModuleContext(context, moduleContext, djo.f13347a, str, i, a2, djo.f13349c, dfp);
                return moduleContext4;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ModuleApi mo9142a(String str) {
        ModuleApi moduleApi;
        synchronized (this.f13355e) {
            moduleApi = (ModuleApi) this.f13355e.get(str);
            if (moduleApi == null) {
                try {
                    moduleApi = (ModuleApi) Class.forName(str).asSubclass(ModuleApi.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48 + String.valueOf(valueOf).length());
                    sb.append("Failed to instantiate chimera ModuleApi class ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        Log.e("ChimeraModuleLdr", sb2);
                    } else {
                        Log.e("ChimeraModuleLdr", sb2, cause);
                    }
                }
                if (moduleApi != null) {
                    this.f13355e.put(str, moduleApi);
                }
            }
        }
        return moduleApi;
    }

    /* renamed from: a */
    public final void mo9143a(djz djz) {
        boolean z;
        dka a;
        synchronized (this.f13352b) {
            C1245ok okVar = new C1245ok();
            for (Map.Entry entry : this.f13354d.entrySet()) {
                String str = (String) entry.getKey();
                djy djy = (djy) entry.getValue();
                djy djy2 = null;
                if (!(djz == null || (a = djz.mo9172a(str)) == null)) {
                    djy2 = djz.mo9169a(a.mo9183R());
                }
                if (djy2 != null) {
                    boolean z2 = false;
                    if (djy.mo9149a() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dff.m8282a(djy, djy2, z) == 0) {
                        dfc dfc = new dfc(djy2);
                        djo djo = (djo) this.f13353c.get(dfc);
                        if (djy2.mo9149a() == 1) {
                            z2 = true;
                        } else if (djo != null) {
                            z2 = true;
                        }
                        bmzs.m108698a(z2);
                        if (djo != null) {
                            int a2 = okVar.mo15616a(dfc);
                            if (a2 >= 0) {
                                djy2 = ((dfc) okVar.mo15620b(a2)).f13003a;
                            } else {
                                okVar.put(dfc, djo);
                            }
                        }
                        entry.setValue(djy2);
                    }
                }
                String valueOf = String.valueOf(str);
                Log.i("ChimeraModuleLdr", valueOf.length() == 0 ? new String("Module config changed, forcing restart due to module ") : "Module config changed, forcing restart due to module ".concat(valueOf));
                Process.killProcess(Process.myPid());
                return;
            }
            this.f13353c = okVar;
        }
    }
}
