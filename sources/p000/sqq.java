package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

/* renamed from: sqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqq {

    /* renamed from: a */
    public static final LruCache f44991a = new LruCache(16);

    /* renamed from: b */
    private static final WeakHashMap f44992b = new WeakHashMap();

    /* renamed from: a */
    private static boju m35988a(ModuleManager.ConfigInfo configInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        bxvd da = boju.f133349e.mo74144da();
        if (configInfo != null) {
            for (ModuleManager.ModuleSetInfo moduleSetInfo : configInfo.moduleSets) {
                sdo.m34970a(moduleSetInfo != null);
                bojx bojx = (bojx) bojy.f133367g.mo74144da();
                try {
                    bojx.mo73633b(moduleSetInfo.getProtoBytes());
                } catch (bxwf e) {
                    String str = moduleSetInfo.moduleSetId;
                    if (bojx.f164950c) {
                        bojx.mo74035c();
                        bojx.f164950c = false;
                    }
                    bojy bojy = (bojy) bojx.f164949b;
                    str.getClass();
                    int i = 1 | bojy.f133369a;
                    bojy.f133369a = i;
                    bojy.f133370b = str;
                    int i2 = moduleSetInfo.moduleSetVariant;
                    int i3 = i | 2;
                    bojy.f133369a = i3;
                    bojy.f133371c = i2;
                    int i4 = moduleSetInfo.moduleTargeting;
                    bojy.f133369a = i3 | 4;
                    bojy.f133372d = i4;
                }
                bojy bojy2 = (bojy) bojx.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boju boju = (boju) da.f164949b;
                bojy2.getClass();
                boju.mo68913a();
                boju.f133352b.add(bojy2);
            }
            if (!configInfo.optionalModules.isEmpty()) {
                Collection<ModuleManager.ModuleInfo> collection = configInfo.optionalModules;
                C1245ok okVar = new C1245ok(collection.size());
                for (ModuleManager.ModuleInfo moduleInfo : collection) {
                    if (moduleInfo != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sdo.m34970a(z3);
                    bxvd da2 = bojw.f133362d.mo74144da();
                    String str2 = moduleInfo.moduleId;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bojw bojw = (bojw) da2.f164949b;
                    str2.getClass();
                    int i5 = bojw.f133364a | 1;
                    bojw.f133364a = i5;
                    bojw.f133365b = str2;
                    int i6 = moduleInfo.moduleVersion;
                    bojw.f133364a = i5 | 2;
                    bojw.f133366c = i6;
                    bojw bojw2 = (bojw) da2.mo74062i();
                    ArrayList arrayList = (ArrayList) okVar.get(moduleInfo.moduleApk);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        okVar.put(moduleInfo.moduleApk, arrayList);
                    }
                    arrayList.add(bojw2);
                }
                for (int i7 = 0; i7 < okVar.f26809h; i7++) {
                    ArrayList arrayList2 = (ArrayList) okVar.mo15621c(i7);
                    if (arrayList2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rzz.m34729a(z);
                    ModuleManager.ModuleApkInfo moduleApkInfo = (ModuleManager.ModuleApkInfo) okVar.mo15620b(i7);
                    if (moduleApkInfo != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sdo.m34970a(z2);
                    bxvd da3 = bojv.f133355f.mo74144da();
                    String str3 = moduleApkInfo.apkPackageName;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bojv bojv = (bojv) da3.f164949b;
                    str3.getClass();
                    int i8 = bojv.f133357a | 1;
                    bojv.f133357a = i8;
                    bojv.f133358b = str3;
                    int i9 = moduleApkInfo.apkVersionCode;
                    bojv.f133357a = i8 | 4;
                    bojv.f133360d = i9;
                    if (!bojv.f133361e.mo73666a()) {
                        bojv.f133361e = bxvk.m124021a(bojv.f133361e);
                    }
                    bxsy.m123078a(arrayList2, bojv.f133361e);
                    String str4 = moduleApkInfo.apkVersionName;
                    if (str4 != null) {
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bojv bojv2 = (bojv) da3.f164949b;
                        str4.getClass();
                        bojv2.f133357a |= 2;
                        bojv2.f133359c = str4;
                    }
                    bojv bojv3 = (bojv) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boju boju2 = (boju) da.f164949b;
                    bojv3.getClass();
                    if (!boju2.f133353c.mo73666a()) {
                        boju2.f133353c = bxvk.m124021a(boju2.f133353c);
                    }
                    boju2.f133353c.add(bojv3);
                }
            }
            int i10 = configInfo.chimeraConfigModifierFlags;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boju boju3 = (boju) da.f164949b;
            boju3.f133351a |= 1;
            boju3.f133354d = i10;
        }
        return (boju) da.mo74062i();
    }

    /* renamed from: b */
    public static boju m35992b(ModuleManager moduleManager) {
        ModuleManager.ConfigInfo configInfo;
        try {
            configInfo = moduleManager.getCurrentConfig();
        } catch (InvalidConfigException e) {
            Log.w("ChimeraUtils", "Can't get Chimera config");
            configInfo = null;
        }
        return m35988a(configInfo);
    }

    /* renamed from: c */
    public static ModuleManager.ModuleInfo m35994c(Context context) {
        try {
            return ModuleManager.get(context).getCurrentModule();
        } catch (IllegalStateException e) {
            Log.w("ChimeraUtils", "Non Chimera context");
            return null;
        }
    }

    /* renamed from: d */
    public static CharSequence m35995d(Context context) {
        try {
            return context.getResources().getString(C0126R.string.common_app_name);
        } catch (Resources.NotFoundException e) {
            Log.w("ChimeraUtils", "Missing string: common_app_name");
            return "Google Play services";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        android.util.Log.w("ChimeraUtils", java.lang.String.format("Module %s has invalid metadata: %s", r3.moduleId, r10.getMessage()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r10 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[ExcHandler: InvalidConfigException (r10v12 'e' com.google.android.chimera.config.InvalidConfigException A[CUSTOM_DECLARE]), Splitter:B:4:0x0015] */
    /* renamed from: b */
    public static CharSequence m35993b(Context context) {
        String str;
        Resources resources = context.getResources();
        ModuleManager.ModuleInfo c = m35994c(context);
        if (!(c == null || resources == null)) {
            try {
                str = c.getMetadata(context).getString("display_name_string_id");
                if (!TextUtils.isEmpty(str)) {
                    return resources.getText(resources.getIdentifier(str, "string", c.moduleApk.apkPackageName));
                }
                Log.w("ChimeraUtils", String.format("Module %s has empty metadata %s", c.moduleId, "display_name_string_id"));
            } catch (Resources.NotFoundException e) {
                Log.w("ChimeraUtils", String.format("Module %s missing resource %s(%d)", c.moduleId, str, -1));
            } catch (RuntimeException e2) {
                Log.w("ChimeraUtils", String.format("Module %s missing resource %s", c.moduleId, str));
            } catch (InvalidConfigException e3) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m35989a(Context context) {
        ModuleManager.ModuleInfo c = m35994c(context);
        if (c == null) {
            return null;
        }
        String str = c.moduleId;
        if (str == null) {
            Log.w("ChimeraUtils", "Null module id!");
            return null;
        }
        if (str.startsWith("com.google.android.gms.")) {
            str = str.substring(23);
        } else {
            Log.w("ChimeraUtils", str.length() == 0 ? new String("Unexpected module id prefix: ") : "Unexpected module id prefix: ".concat(str));
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("ChimeraUtils", "Empty module id ignored");
        return null;
    }

    /* renamed from: a */
    public static String m35990a(String str) {
        if (str.startsWith("com.google.android.gms.")) {
            return str.substring(23);
        }
        return str.isEmpty() ? "container" : str;
    }

    /* renamed from: a */
    public static sqp m35991a(ModuleManager moduleManager) {
        ModuleManager.ConfigInfo configInfo;
        sqp sqp;
        try {
            configInfo = moduleManager.getCurrentConfig();
        } catch (InvalidConfigException e) {
            Log.w("ChimeraUtils", "Can't get Chimera config");
            configInfo = null;
        }
        synchronized (f44992b) {
            sqp = (sqp) f44992b.get(configInfo);
            if (sqp == null) {
                sqp = new sqp(m35988a(configInfo));
                f44992b.put(configInfo, sqp);
            }
        }
        return sqp;
    }
}
