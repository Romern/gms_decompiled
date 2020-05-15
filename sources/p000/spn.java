package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: spn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class spn {

    /* renamed from: a */
    public static final int f44932a = Process.myUid();

    /* renamed from: b */
    public static final rtc f44933b = rtc.m34377a("android_id", (Long) 0L);

    /* renamed from: c */
    public static volatile boolean f44934c = true;

    /* renamed from: d */
    private static final AtomicInteger f44935d = new AtomicInteger();

    /* renamed from: e */
    private static volatile String f44936e = null;

    /* renamed from: f */
    private static volatile Long f44937f = null;

    /* renamed from: g */
    private static Boolean f44938g;

    /* renamed from: h */
    private static Boolean f44939h = null;

    /* renamed from: i */
    private static String f44940i = null;

    private spn() {
    }

    /* renamed from: a */
    private static int m35842a(char c) {
        int upperCase = Character.toUpperCase(c) - '0';
        if (upperCase > 9) {
            upperCase -= 7;
        }
        if (upperCase >= 0 && upperCase <= 15) {
            return upperCase;
        }
        throw new IllegalArgumentException(String.format("'%c' is not a valid hexadecimal character", Character.valueOf(c)));
    }

    /* renamed from: b */
    public static int m35864b(Context context, String str) {
        return svr.m36484b(context).mo26176b(str, 0).versionCode;
    }

    /* renamed from: c */
    public static String m35870c(Activity activity) {
        android.app.Activity containerActivity = activity.getContainerActivity();
        String a = m35847a(containerActivity);
        if (a == null) {
            if (Log.isLoggable("AndroidUtils", 4)) {
                Log.i("AndroidUtils", "Was the Activity started with startActivityForResult?");
            }
            throw new SecurityException("Calling package was null");
        }
        rfz.m33557a(containerActivity).mo24605a(a);
        return a;
    }

    /* renamed from: d */
    public static int m35876d(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    @Deprecated
    /* renamed from: e */
    public static int m35881e(Context context) {
        return spo.m35902a(context);
    }

    /* renamed from: f */
    public static String m35885f(Context context) {
        if (f44936e == null) {
            String packageName = context.getPackageName();
            try {
                f44936e = svr.m36484b(context).mo26176b(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(packageName);
                Log.w("AndroidUtils", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        return f44936e;
    }

    @Deprecated
    /* renamed from: g */
    public static Intent m35889g(String str) {
        return m35845a(new Intent(str));
    }

    /* renamed from: h */
    public static Intent m35893h(String str) {
        return new Intent().setClassName("com.google.android.gms", str);
    }

    /* renamed from: i */
    public static int m35897i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return svr.m36484b(context).mo26172a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Cannot get application info for [");
            sb.append(str);
            sb.append("]");
            sb.toString();
            return -1;
        }
    }

    /* renamed from: j */
    public static String m35899j(Context context, String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(null)) {
            return null;
        }
        try {
            Bundle bundle = svr.m36484b(context).mo26172a(str, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString(null);
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf((Object) null).length() + BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR);
            sb.append("A required meta-data tag in your app's AndroidManifest.xml is not found.  You must have the following declaration within the <application> element:     <meta-data android:name=\"null\" android:value=\"SOME_METADATA_VALUE\" />");
            throw new IllegalStateException(sb.toString());
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("Cannot get meta data for [");
            sb2.append(str);
            sb2.append("]");
            sb2.toString();
            return null;
        }
    }

    /* renamed from: k */
    private static TelephonyManager m35901k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    public static ComponentName m35865b(Activity activity) {
        android.app.Activity containerActivity = activity.getContainerActivity();
        svr.m36484b(containerActivity);
        return containerActivity.getCallingActivity();
    }

    @Deprecated
    /* renamed from: d */
    public static String m35877d() {
        if (f44940i == null) {
            f44940i = ssy.m36271a();
        }
        return f44940i;
    }

    /* renamed from: e */
    public static String m35882e(Context context, String str) {
        return m35867b(context, str, "SHA1");
    }

    /* renamed from: g */
    public static boolean m35890g() {
        return BuildConfig.FLAVOR_client.equals(Build.BRAND);
    }

    /* renamed from: a */
    public static long m35843a(Context context) {
        if (aytw.m84813a(context)) {
            Log.w("AndroidUtils", "getAndroidId is called in direct boot mode.");
            return 0;
        } else if (!cdjz.f181084a.mo6606a().mo77774c()) {
            return ryv.m34678a(f44933b);
        } else {
            if (f44937f == null || f44937f.longValue() == 0) {
                try {
                    f44937f = Long.valueOf((String) aucu.m76783a(qco.m31854a(context).mo24701a((rpa) new qcl()), 1000, TimeUnit.MILLISECONDS));
                } catch (InterruptedException | NumberFormatException | ExecutionException | TimeoutException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    Log.e("AndroidUtils", "Failed to get Android ID", e);
                    f44937f = 0L;
                }
            }
            return f44937f.longValue();
        }
    }

    /* renamed from: d */
    public static Signature m35878d(String str) {
        int i = 0;
        while (i < 2) {
            try {
                Signature instance = Signature.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static KeyFactory m35883e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                KeyFactory instance = KeyFactory.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public static String m35894h() {
        try {
            int i = Build.VERSION.SDK_INT;
            return Build.getSerial();
        } catch (SecurityException e) {
            return "unknown";
        }
    }

    /* renamed from: d */
    public static void m35879d(Activity activity) {
        Window window;
        android.app.Activity containerActivity = activity.getContainerActivity();
        if (rfy.m33543a() && (window = containerActivity.getWindow()) != null) {
            window.addFlags(8192);
        }
    }

    /* renamed from: e */
    public static void m35884e() {
        Process.killProcess(Process.myPid());
        bqhi.m112839a(1000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: f */
    public static Cipher m35886f(String str) {
        int i = 0;
        while (i < 2) {
            try {
                Cipher instance = Cipher.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m35891g(Context context) {
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        if (systemSharedLibraryNames == null) {
            return false;
        }
        for (String str : systemSharedLibraryNames) {
            if ("com.google.android.pano.v1".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m35898i(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    /* renamed from: b */
    public static String m35866b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "none";
        }
        try {
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            return "none";
        }
    }

    /* renamed from: h */
    public static String m35895h(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m35882e(context, str);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
            sb.append("Cannot get package certificate for [");
            sb.append(str);
            sb.append("]");
            sb.toString();
            return null;
        }
    }

    /* renamed from: c */
    public static Mac m35871c(String str) {
        int i = 0;
        while (i < 2) {
            try {
                Mac instance = Mac.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m35887f() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    /* renamed from: g */
    public static boolean m35892g(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m35867b(Context context, String str, String str2) {
        return m35851a(svr.m36484b(context).mo26176b(str, 64), str2);
    }

    /* renamed from: c */
    public static void m35872c(Context context, String str) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != f44932a && !rfy.m33545a(context, callingUid, str)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: d */
    public static boolean m35880d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.wifi");
    }

    /* renamed from: j */
    public static boolean m35900j(Context context) {
        return context.getPackageManager().hasSystemFeature("org.chromium.arc");
    }

    @Deprecated
    /* renamed from: b */
    public static MessageDigest m35868b(String str) {
        return spo.m35903a(str);
    }

    /* renamed from: h */
    public static boolean m35896h(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    /* renamed from: b */
    public static boolean m35869b() {
        return Binder.getCallingUid() == f44932a;
    }

    /* renamed from: f */
    public static byte[] m35888f(Context context, String str) {
        return spo.m35904a(context, str, "SHA1");
    }

    /* renamed from: c */
    public static boolean m35873c() {
        Boolean bool = f44939h;
        if (bool != null) {
            return bool.booleanValue();
        }
        String d = m35877d();
        boolean z = true;
        if (!"com.google.android.gms.persistent".equals(d) && !"com.google.process.gapps".equals(d) && !"com.google.android.gms.location".equals(d)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f44939h = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public static PendingIntent m35844a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, f44935d.incrementAndGet(), intent, i);
    }

    /* renamed from: c */
    public static boolean m35874c(Context context) {
        return m35901k(context).getPhoneType() != 0;
    }

    @Deprecated
    /* renamed from: c */
    public static byte[] m35875c(Context context, String str, String str2) {
        return spo.m35904a(context, str, str2);
    }

    /* renamed from: a */
    public static Intent m35845a(Intent intent) {
        return intent.setPackage("com.google.android.gms");
    }

    /* renamed from: a */
    public static cafx m35846a(Context context, boolean z, String str, int i, Integer num, sqp sqp, boci boci) {
        bxvf bxvf = (bxvf) cafx.f173026C.mo74144da();
        if (z) {
            long a = m35843a(context);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx = (cafx) bxvf.f164949b;
            cafx.f173031a |= 1;
            cafx.f173032b = a;
        }
        if (str != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx2 = (cafx) bxvf.f164949b;
            str.getClass();
            cafx2.f173031a |= 2;
            cafx2.f173033c = str;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx3 = (cafx) bxvf.f164949b;
        cafx3.f173031a |= 8;
        cafx3.f173034d = i2;
        String str2 = Build.MODEL;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx4 = (cafx) bxvf.f164949b;
        str2.getClass();
        cafx4.f173031a |= 16;
        cafx4.f173035e = str2;
        String str3 = Build.PRODUCT;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx5 = (cafx) bxvf.f164949b;
        str3.getClass();
        cafx5.f173031a |= 32;
        cafx5.f173036f = str3;
        String str4 = Build.HARDWARE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx6 = (cafx) bxvf.f164949b;
        str4.getClass();
        cafx6.f173031a |= 64;
        cafx6.f173037g = str4;
        String str5 = Build.DEVICE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx7 = (cafx) bxvf.f164949b;
        str5.getClass();
        cafx7.f173031a |= 128;
        cafx7.f173038h = str5;
        String str6 = Build.ID;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx8 = (cafx) bxvf.f164949b;
        str6.getClass();
        cafx8.f173031a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cafx8.f173039i = str6;
        String simOperator = m35901k(context).getSimOperator();
        if (simOperator != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx9 = (cafx) bxvf.f164949b;
            simOperator.getClass();
            cafx9.f173031a |= 1024;
            cafx9.f173041k = simOperator;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (cdjz.f181084a.mo6606a().mo77776e()) {
            int simCarrierId = m35901k(context).getSimCarrierId();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx10 = (cafx) bxvf.f164949b;
            cafx10.f173031a |= 268435456;
            cafx10.f173029B = simCarrierId;
        }
        String str7 = Build.MANUFACTURER;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx11 = (cafx) bxvf.f164949b;
        str7.getClass();
        cafx11.f173031a |= 8192;
        cafx11.f173044o = str7;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx12 = (cafx) bxvf.f164949b;
        language.getClass();
        cafx12.f173031a |= 2048;
        cafx12.f173042l = language;
        String country = locale.getCountry();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx13 = (cafx) bxvf.f164949b;
        country.getClass();
        cafx13.f173031a |= 4096;
        cafx13.f173043n = country;
        String num2 = Integer.toString(i);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx14 = (cafx) bxvf.f164949b;
        num2.getClass();
        cafx14.f173031a |= 512;
        cafx14.f173040j = num2;
        String str8 = Build.BRAND;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx15 = (cafx) bxvf.f164949b;
        str8.getClass();
        cafx15.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        cafx15.f173045p = str8;
        String str9 = Build.BOARD;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx16 = (cafx) bxvf.f164949b;
        str9.getClass();
        cafx16.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        cafx16.f173046q = str9;
        String str10 = Build.FINGERPRINT;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx17 = (cafx) bxvf.f164949b;
        str10.getClass();
        cafx17.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        cafx17.f173048s = str10;
        String str11 = Build.TYPE;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx18 = (cafx) bxvf.f164949b;
        str11.getClass();
        cafx18.f173031a |= 33554432;
        cafx18.f173055z = str11;
        if (num != null) {
            int intValue = num.intValue();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx19 = (cafx) bxvf.f164949b;
            cafx19.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            cafx19.f173049t = intValue;
        }
        if (cdjz.f181084a.mo6606a().mo77777f() && stu.m36326l() != null) {
            aymg l = stu.m36326l();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx20 = (cafx) bxvf.f164949b;
            l.getClass();
            cafx20.f173050u = l;
            cafx20.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        if (sqp != null) {
            bxvf.mo74125a(cafk.f172920b, sqp.f44990a);
        }
        if (boci != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx21 = (cafx) bxvf.f164949b;
            boci.getClass();
            cafx21.f173054y = boci;
            cafx21.f173031a |= 16777216;
        }
        if (sre.m36082b(context)) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx22 = (cafx) bxvf.f164949b;
            cafx22.f173052w = 2;
            cafx22.f173031a |= 4194304;
        } else if (sre.m36080a(context)) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx23 = (cafx) bxvf.f164949b;
            int i4 = cafx23.f173031a | 1048576;
            cafx23.f173031a = i4;
            cafx23.f173051v = true;
            cafx23.f173052w = 1;
            cafx23.f173031a = i4 | 4194304;
        }
        String radioVersion = Build.getRadioVersion();
        if (radioVersion != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx24 = (cafx) bxvf.f164949b;
            radioVersion.getClass();
            cafx24.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            cafx24.f173047r = radioVersion;
        }
        sre.m36089i(context);
        sre.m36087g(context);
        if (sre.m36085e(context)) {
            bxvd da = cafy.f173056c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cafy cafy = (cafy) da.f164949b;
            cafy.f173058a |= 4;
            cafy.f173059b = true;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx25 = (cafx) bxvf.f164949b;
            cafy cafy2 = (cafy) da.mo74062i();
            cafy2.getClass();
            cafx25.f173053x = cafy2;
            cafx25.f173031a |= 8388608;
        }
        return (cafx) bxvf.mo74062i();
    }

    /* renamed from: a */
    public static String m35847a(android.app.Activity activity) {
        svr.m36484b(activity);
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        String valueOf = String.valueOf(callingActivity);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("getCallingPackage(): Couldn't get a package name from ");
        sb.append(valueOf);
        Log.e("PackageManagerWrapper", sb.toString());
        return null;
    }

    /* renamed from: a */
    public static String m35848a(Context context, String str) {
        return svr.m36484b(context).mo26176b(str, 0).versionName;
    }

    /* renamed from: a */
    public static String m35849a(Context context, String str, String str2) {
        Bundle bundle;
        try {
            ApplicationInfo a = svr.m36484b(context).mo26172a(str, 128);
            if (a == null || (bundle = a.metaData) == null) {
                return null;
            }
            return bundle.getString(str2);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AndroidUtils", "Caller attempted to insert app data for non-existent package.", e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m35850a(PackageInfo packageInfo) {
        return m35851a(packageInfo, "SHA1");
    }

    /* renamed from: a */
    public static String m35851a(PackageInfo packageInfo, String str) {
        byte[] a = spo.m35905a(packageInfo, str);
        if (a != null) {
            return srv.m36164d(a);
        }
        return null;
    }

    /* renamed from: a */
    public static String m35852a(Activity activity) {
        return m35847a(activity.getContainerActivity());
    }

    /* renamed from: a */
    public static void m35853a(Context context, int i, String str, int i2) {
        if (i != -1) {
            sqx.m36052a(context, str, ssy.m36272a(i), i2, null);
            Process.killProcess(i);
        }
    }

    /* renamed from: a */
    public static void m35854a(Context context, ComponentName componentName) {
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
    }

    /* renamed from: a */
    public static void m35855a(Context context, String str, int i) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), i, 1);
    }

    /* renamed from: a */
    public static void m35856a(Context context, String str, boolean z) {
        m35855a(context, str, !z ? 2 : 1);
    }

    /* renamed from: a */
    public static void m35857a(AsyncTask asyncTask, Object... objArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
    }

    /* renamed from: a */
    public static void m35858a(RemoteException remoteException) {
        if (!(remoteException instanceof TransactionTooLargeException)) {
            throw remoteException;
        }
    }

    /* renamed from: a */
    public static boolean m35859a() {
        boolean booleanValue;
        synchronized (spn.class) {
            if (f44938g == null) {
                boolean z = true;
                if (!"1".equals(stn.m36304a("ro.kernel.qemu", "0")) && !Build.HARDWARE.contains("ranchu")) {
                    z = false;
                }
                f44938g = Boolean.valueOf(z);
            }
            booleanValue = f44938g.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static boolean m35860a(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ApplicationInfo applicationInfo;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE)) {
            if (resolveInfo.priority >= 0 && (activityInfo = resolveInfo.activityInfo) != null && (applicationInfo = activityInfo.applicationInfo) != null && applicationInfo.enabled) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m35861a(String str) {
        int i = 1;
        int length = (str.length() + 1) / 2;
        byte[] bArr = new byte[length];
        int i2 = 0;
        if ((str.length() & 1) != 0) {
            bArr[0] = (byte) m35842a(str.charAt(0));
            i2 = 1;
        } else {
            i = 0;
        }
        while (i < length) {
            bArr[i] = (byte) ((m35842a(str.charAt(i2)) << 4) | m35842a(str.charAt(i2 + 1)));
            i++;
            i2 += 2;
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m35862a(String str, String str2) {
        if (str != null) {
            return m35863a(str.getBytes(Charset.forName("UTF-8")), str2);
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static byte[] m35863a(byte[] bArr, String str) {
        if (bArr == null) {
            return new byte[0];
        }
        MessageDigest a = spo.m35903a(str);
        if (a != null) {
            return a.digest(bArr);
        }
        return null;
    }
}
