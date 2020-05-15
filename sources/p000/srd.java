package p000;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: srd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srd {

    /* renamed from: a */
    private static volatile Boolean f45013a = false;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.wearable.settings").path("bluetooth_mode").build();
    }

    /* renamed from: a */
    private static int m36073a(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 5;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:196:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04b3  */
    /* renamed from: a */
    public static void m36074a(Context context, bxvd bxvd) {
        int i;
        int i2;
        int i3;
        boolean z;
        List<String> list;
        EGLDisplay eGLDisplay;
        EGLDisplay eGLDisplay2;
        boolean z2;
        Context context2 = context;
        bxvd bxvd2 = bxvd;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        int i4 = deviceConfigurationInfo.reqTouchScreen;
        if (i4 != 1) {
            i = i4 != 2 ? i4 != 3 ? 1 : 4 : 3;
        } else {
            i = 2;
        }
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd = (qhd) bxvd2.f164949b;
        qhd qhd2 = qhd.f41286y;
        qhd.f41288b = i - 1;
        qhd.f41287a |= 1;
        int i5 = deviceConfigurationInfo.reqKeyboardType;
        if (i5 != 1) {
            i2 = i5 != 2 ? i5 != 3 ? 1 : 4 : 3;
        } else {
            i2 = 2;
        }
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd3 = (qhd) bxvd2.f164949b;
        qhd3.f41289c = i2 - 1;
        qhd3.f41287a |= 2;
        int i6 = deviceConfigurationInfo.reqNavigation;
        int i7 = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? 1 : 5 : 4 : 3 : 2;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd4 = (qhd) bxvd2.f164949b;
        qhd4.f41290d = i7 - 1;
        qhd4.f41287a |= 4;
        int i8 = deviceConfigurationInfo.reqInputFeatures & 1;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd5 = (qhd) bxvd2.f164949b;
        qhd5.f41287a |= 32;
        qhd5.f41293g = i8 != 0;
        boolean z3 = (deviceConfigurationInfo.reqInputFeatures & 2) > 0;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd6 = (qhd) bxvd2.f164949b;
        qhd6.f41287a |= 64;
        qhd6.f41294h = z3;
        new Point();
        int i9 = Build.VERSION.SDK_INT;
        Point stableDisplaySize = ((DisplayManager) context2.getSystemService("display")).getStableDisplaySize();
        Point point = new Point(Math.min(stableDisplaySize.x, stableDisplaySize.y), Math.max(stableDisplaySize.x, stableDisplaySize.y));
        int i10 = point.x;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd7 = (qhd) bxvd2.f164949b;
        qhd7.f41287a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qhd7.f41296j = i10;
        int i11 = point.y;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd8 = (qhd) bxvd2.f164949b;
        qhd8.f41287a |= 512;
        qhd8.f41297k = i11;
        Display defaultDisplay = ((WindowManager) context2.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i12 = Build.VERSION.SDK_INT;
        defaultDisplay.getRealMetrics(displayMetrics);
        int i13 = displayMetrics.densityDpi;
        int i14 = Build.VERSION.SDK_INT;
        try {
            i13 = DisplayMetrics.class.getField("DENSITY_DEVICE_STABLE").getInt(displayMetrics);
        } catch (NoSuchFieldException e) {
            Log.w("DeviceConfigUtils", "No stable density DPI found: ", e);
        } catch (IllegalAccessException e2) {
            Log.w("DeviceConfigUtils", "No stable density DPI found: ", e2);
        }
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd9 = (qhd) bxvd2.f164949b;
        qhd9.f41287a |= 128;
        qhd9.f41295i = i13;
        Configuration configuration = context.getResources().getConfiguration();
        int a = m36073a(configuration.screenLayout);
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd10 = (qhd) bxvd2.f164949b;
        qhd10.f41292f = a - 1;
        qhd10.f41287a |= 16;
        float f = 160.0f / ((float) i13);
        int i15 = Build.VERSION.SDK_INT;
        int i16 = (int) (((float) point.x) * f);
        int i17 = (int) (((float) point.y) * f);
        if (i17 < 470) {
            z = false;
            i3 = 1;
        } else {
            i3 = (i17 < 960 || i16 < 720) ? (i17 < 640 || i16 < 480) ? 2 : 3 : 4;
            z = (i17 * 3) / 5 >= i16 + -1;
        }
        if (!z) {
            i3 |= 16;
        }
        int a2 = m36073a(i3);
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd11 = (qhd) bxvd2.f164949b;
        qhd11.f41291e = a2 - 1;
        qhd11.f41287a |= 8;
        int i18 = configuration.smallestScreenWidthDp;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd12 = (qhd) bxvd2.f164949b;
        qhd12.f41287a |= 4096;
        qhd12.f41305s = i18;
        int i19 = deviceConfigurationInfo.reqGlEsVersion;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd13 = (qhd) bxvd2.f164949b;
        qhd13.f41287a |= 1024;
        qhd13.f41298l = i19;
        PackageManager packageManager = context.getPackageManager();
        String[] systemSharedLibraryNames = packageManager.getSystemSharedLibraryNames();
        if (systemSharedLibraryNames != null) {
            Arrays.sort(systemSharedLibraryNames);
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            ((qhd) bxvd2.f164949b).f41299m = bxvk.m124030de();
            List asList = Arrays.asList((String[]) systemSharedLibraryNames.clone());
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qhd qhd14 = (qhd) bxvd2.f164949b;
            if (!qhd14.f41299m.mo73666a()) {
                qhd14.f41299m = bxvk.m124021a(qhd14.f41299m);
            }
            bxsy.m123078a(asList, qhd14.f41299m);
        }
        FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            int length = systemAvailableFeatures.length;
            String[] strArr = new String[length];
            int i20 = 0;
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (!TextUtils.isEmpty(featureInfo.name)) {
                    strArr[i20] = featureInfo.name;
                    i20++;
                }
            }
            Arrays.sort(strArr, 0, i20);
            List subList = Arrays.asList(strArr).subList(0, i20);
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qhd qhd15 = (qhd) bxvd2.f164949b;
            if (!qhd15.f41300n.mo73666a()) {
                qhd15.f41300n = bxvk.m124021a(qhd15.f41300n);
            }
            bxsy.m123078a(subList, qhd15.f41300n);
            TreeSet treeSet = new TreeSet(new src());
            treeSet.addAll(Arrays.asList(systemAvailableFeatures));
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                FeatureInfo featureInfo2 = (FeatureInfo) it.next();
                if (!TextUtils.isEmpty(featureInfo2.name)) {
                    bxvd da = qhe.f41312d.mo74144da();
                    String str = featureInfo2.name;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhe qhe = (qhe) da.f164949b;
                    str.getClass();
                    qhe.f41314a |= 1;
                    qhe.f41315b = str;
                    int i21 = featureInfo2.reqGlEsVersion;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhe qhe2 = (qhe) da.f164949b;
                    qhe2.f41314a |= 2;
                    qhe2.f41316c = i21;
                    qhe qhe3 = (qhe) da.mo74062i();
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    qhd qhd16 = (qhd) bxvd2.f164949b;
                    qhe3.getClass();
                    if (!qhd16.f41301o.mo73666a()) {
                        qhd16.f41301o = bxvk.m124021a(qhd16.f41301o);
                    }
                    qhd16.f41301o.add(qhe3);
                }
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        if (Build.SUPPORTED_ABIS != null) {
            for (String str2 : Build.SUPPORTED_ABIS) {
                bxvd2.mo74071j(str2);
            }
        } else {
            bxvd2.mo74071j(Build.CPU_ABI);
            if (!Build.CPU_ABI2.equals("unknown")) {
                bxvd2.mo74071j(Build.CPU_ABI2);
            }
        }
        String[] locales = context.getAssets().getLocales();
        if (locales != null) {
            ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((qhd) bxvd2.f164949b).f41303q));
            Arrays.sort(locales);
            for (String str3 : locales) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            ((qhd) bxvd2.f164949b).f41303q = bxvk.m124030de();
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qhd qhd17 = (qhd) bxvd2.f164949b;
            if (!qhd17.f41303q.mo73666a()) {
                qhd17.f41303q = bxvk.m124021a(qhd17.f41303q);
            }
            bxsy.m123078a(arrayList, qhd17.f41303q);
        }
        SharedPreferences sharedPreferences = context2.getSharedPreferences("DeviceConfigUtils", 0);
        String string = sharedPreferences.getString("cachedGlExt", null);
        if (m36077a(context) || TextUtils.isEmpty(string)) {
            HashSet hashSet = new HashSet();
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            if (egl10 == null) {
                Log.e("DeviceConfigUtils", "Couldn't get EGL");
            } else {
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                if (!egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr)) {
                    Log.e("DeviceConfigUtils", "Couldn't get EGL config count");
                } else {
                    int i23 = iArr[0];
                    EGLConfig[] eGLConfigArr = new EGLConfig[i23];
                    if (!egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i23, iArr)) {
                        Log.e("DeviceConfigUtils", "Couldn't get EGL configs");
                    } else {
                        int[] iArr2 = {12375, 1, 12374, 1, 12344};
                        int[] iArr3 = {12440, 2, 12344};
                        int[] iArr4 = new int[1];
                        int i24 = 0;
                        boolean z4 = false;
                        boolean z5 = false;
                        while (true) {
                            if (i24 >= iArr[0]) {
                                eGLDisplay = eglGetDisplay;
                                break;
                            }
                            int[] iArr5 = iArr;
                            egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i24], 12327, iArr4);
                            if (iArr4[0] != 12368) {
                                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i24], 12339, iArr4);
                                if ((iArr4[0] & 1) != 0) {
                                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i24], 12352, iArr4);
                                    if (!z4) {
                                        if ((iArr4[0] & 1) != 0) {
                                            m36076a(egl10, eglGetDisplay, eGLConfigArr[i24], iArr2, null, hashSet);
                                            z2 = true;
                                            if (!z5) {
                                                eGLDisplay = eglGetDisplay;
                                            } else if ((iArr4[0] & 4) != 0) {
                                                eGLDisplay = eglGetDisplay;
                                                m36076a(egl10, eGLDisplay, eGLConfigArr[i24], iArr2, iArr3, hashSet);
                                                z5 = true;
                                            } else {
                                                eGLDisplay = eglGetDisplay;
                                            }
                                            if (z2 && z5) {
                                                break;
                                            }
                                            z4 = z2;
                                            i24++;
                                            eglGetDisplay = eGLDisplay;
                                            iArr = iArr5;
                                        }
                                    }
                                    z2 = z4;
                                    if (!z5) {
                                    }
                                    if (z2) {
                                        break;
                                        break;
                                    }
                                    z4 = z2;
                                    i24++;
                                    eglGetDisplay = eGLDisplay;
                                    iArr = iArr5;
                                } else {
                                    eGLDisplay2 = eglGetDisplay;
                                }
                            } else {
                                eGLDisplay2 = eglGetDisplay;
                            }
                            i24++;
                            eglGetDisplay = eGLDisplay;
                            iArr = iArr5;
                        }
                        egl10.eglTerminate(eGLDisplay);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hashSet);
            Collections.sort(arrayList2);
            sharedPreferences.edit().putString("cachedGlExt", TextUtils.join(" ", arrayList2)).apply();
            list = arrayList2;
        } else {
            list = Arrays.asList(string.split(" "));
        }
        for (String str4 : list) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qhd qhd18 = (qhd) bxvd2.f164949b;
            str4.getClass();
            if (!qhd18.f41304r.mo73666a()) {
                qhd18.f41304r = bxvk.m124021a(qhd18.f41304r);
            }
            qhd18.f41304r.add(str4);
        }
        int i25 = Build.VERSION.SDK_INT;
        boolean d = sre.m36084d(context);
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd19 = (qhd) bxvd2.f164949b;
        qhd19.f41287a |= 8192;
        qhd19.f41306t = d;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd20 = (qhd) bxvd2.f164949b;
        qhd20.f41287a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        qhd20.f41307u = j;
        int i26 = Build.VERSION.SDK_INT;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd21 = (qhd) bxvd2.f164949b;
        qhd21.f41287a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        qhd21.f41308v = availableProcessors;
        int i27 = Build.VERSION.SDK_INT;
        boolean isDeviceSecure = ((KeyguardManager) context2.getSystemService("keyguard")).isDeviceSecure();
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        qhd qhd22 = (qhd) bxvd2.f164949b;
        qhd22.f41287a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        qhd22.f41309w = isDeviceSecure;
        String a3 = stn.m36304a("ro.oem.key1", "");
        if (!TextUtils.isEmpty(a3)) {
            if (bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            qhd qhd23 = (qhd) bxvd2.f164949b;
            a3.getClass();
            qhd23.f41287a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            qhd23.f41310x = a3;
        }
    }

    /* renamed from: b */
    public static void m36078b(Context context) {
        int i = Build.VERSION.SDK_INT;
        sre.m36089i(context);
    }

    /* renamed from: a */
    public static void m36075a(Context context, bxvd bxvd, SharedPreferences sharedPreferences) {
        if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
            String str = Build.FINGERPRINT;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf = (qhf) bxvd.f164949b;
            qhf qhf2 = qhf.f41317r;
            str.getClass();
            qhf.f41319a |= 1;
            qhf.f41320b = str;
        }
        String radioVersion = Build.getRadioVersion();
        if (TextUtils.isEmpty(radioVersion)) {
            radioVersion = null;
        }
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
        }
        String string = sharedPreferences.getString("lastRadio", null);
        if (radioVersion == null) {
            radioVersion = string;
        } else if (!radioVersion.equals(string)) {
            sharedPreferences.edit().putString("lastRadio", radioVersion).apply();
        }
        if (!TextUtils.isEmpty(radioVersion)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf3 = (qhf) bxvd.f164949b;
            qhf qhf4 = qhf.f41317r;
            radioVersion.getClass();
            qhf3.f41319a |= 2;
            qhf3.f41321c = radioVersion;
        }
        if (!TextUtils.isEmpty(Build.BOOTLOADER)) {
            String str2 = Build.BOOTLOADER;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf5 = (qhf) bxvd.f164949b;
            qhf qhf6 = qhf.f41317r;
            str2.getClass();
            qhf5.f41319a |= 4;
            qhf5.f41322d = str2;
        }
        if (!TextUtils.isEmpty(Build.HARDWARE)) {
            String str3 = Build.HARDWARE;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf7 = (qhf) bxvd.f164949b;
            qhf qhf8 = qhf.f41317r;
            str3.getClass();
            qhf7.f41319a |= 8;
            qhf7.f41323e = str3;
        }
        if (!TextUtils.isEmpty(Build.BRAND)) {
            String str4 = Build.BRAND;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf9 = (qhf) bxvd.f164949b;
            qhf qhf10 = qhf.f41317r;
            str4.getClass();
            qhf9.f41319a |= 16;
            qhf9.f41324f = str4;
        }
        if (!TextUtils.isEmpty(Build.DEVICE)) {
            String str5 = Build.DEVICE;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf11 = (qhf) bxvd.f164949b;
            qhf qhf12 = qhf.f41317r;
            str5.getClass();
            qhf11.f41319a |= 512;
            qhf11.f41329k = str5;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str6 = Build.MODEL;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf13 = (qhf) bxvd.f164949b;
            qhf qhf14 = qhf.f41317r;
            str6.getClass();
            qhf13.f41319a |= 1024;
            qhf13.f41330l = str6;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str7 = Build.MANUFACTURER;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf15 = (qhf) bxvd.f164949b;
            qhf qhf16 = qhf.f41317r;
            str7.getClass();
            qhf15.f41319a |= 2048;
            qhf15.f41331m = str7;
        }
        if (!TextUtils.isEmpty(Build.PRODUCT)) {
            String str8 = Build.PRODUCT;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf17 = (qhf) bxvd.f164949b;
            qhf qhf18 = qhf.f41317r;
            str8.getClass();
            qhf17.f41319a |= 4096;
            qhf17.f41332n = str8;
        }
        long j = Build.TIME / 1000;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qhf qhf19 = (qhf) bxvd.f164949b;
        qhf qhf20 = qhf.f41317r;
        qhf19.f41319a |= 64;
        qhf19.f41326h = j;
        int i = Build.VERSION.SDK_INT;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qhf qhf21 = (qhf) bxvd.f164949b;
        qhf21.f41319a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qhf21.f41328j = i;
        int i2 = Build.VERSION.SDK_INT;
        String str9 = Build.VERSION.SECURITY_PATCH;
        if (!TextUtils.isEmpty(str9)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qhf qhf22 = (qhf) bxvd.f164949b;
            str9.getClass();
            qhf22.f41319a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            qhf22.f41335q = str9;
        }
        boolean exists = new File("/system/recovery-from-boot.p").exists();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qhf qhf23 = (qhf) bxvd.f164949b;
        qhf23.f41319a |= 8192;
        qhf23.f41333o = exists;
        m36078b(context);
    }

    /* renamed from: a */
    private static void m36076a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr, int[] iArr2, Set set) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr2);
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr);
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
                return;
            }
            egl10.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            String glGetString = GLES10.glGetString(7939);
            if (!TextUtils.isEmpty(glGetString)) {
                for (String str : glGetString.split(" ")) {
                    set.add(str);
                }
            }
            egl10.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eGLDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
        }
    }

    /* renamed from: a */
    public static boolean m36077a(Context context) {
        if (f45013a != null) {
            return f45013a.booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
        String str = Build.FINGERPRINT;
        String str2 = Build.RADIO;
        String str3 = Build.BOOTLOADER;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        sb.append("\n");
        sb.append(str3);
        String sb2 = sb.toString();
        if (sb2.equals(sharedPreferences.getString("lastBuildFingerprint", null))) {
            f45013a = false;
        } else {
            sharedPreferences.edit().putString("lastBuildFingerprint", sb2).apply();
            f45013a = true;
        }
        return f45013a.booleanValue();
    }
}
