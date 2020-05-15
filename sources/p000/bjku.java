package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: bjku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjku {

    /* renamed from: A */
    private static List f122878A;

    /* renamed from: B */
    private static long f122879B;

    /* renamed from: m */
    public static final /* synthetic */ int f122880m = 0;

    /* renamed from: n */
    private static final C1231nx f122881n = new C1231nx(5);

    /* renamed from: o */
    private static Boolean f122882o;

    /* renamed from: p */
    private static Boolean f122883p;

    /* renamed from: q */
    private static Integer f122884q;

    /* renamed from: r */
    private static long f122885r;

    /* renamed from: s */
    private static bygi f122886s;

    /* renamed from: t */
    private static long f122887t;

    /* renamed from: u */
    private static Boolean f122888u;

    /* renamed from: v */
    private static long f122889v;

    /* renamed from: w */
    private static Boolean f122890w;

    /* renamed from: x */
    private static long f122891x;

    /* renamed from: y */
    private static bjkt f122892y;

    /* renamed from: z */
    private static long f122893z;

    /* renamed from: a */
    public final Context f122894a;

    /* renamed from: b */
    public bwmj f122895b;

    /* renamed from: c */
    public boolean f122896c;

    /* renamed from: d */
    public int f122897d;

    /* renamed from: e */
    public long f122898e;

    /* renamed from: f */
    public String f122899f;

    /* renamed from: g */
    public List f122900g;

    /* renamed from: h */
    public boolean f122901h;

    /* renamed from: i */
    public Account f122902i;

    /* renamed from: j */
    public Account[] f122903j;

    /* renamed from: k */
    public int f122904k = 1;

    /* renamed from: l */
    public int f122905l;

    public bjku(Context context) {
        this.f122894a = context.getApplicationContext();
        this.f122901h = true;
    }

    /* renamed from: a */
    private static long m103794a(double d) {
        return (long) ((d * 1000000.0d) / 8.0d);
    }

    /* renamed from: b */
    private static long m103799b(double d) {
        return (long) ((d * 1000.0d) / 8.0d);
    }

    /* renamed from: a */
    private static bjkt m103795a(Context context, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        if (f122892y == null || j - f122893z > bjhz.m103567a().mo65268d()) {
            boolean a = bjzc.m104960a(context, "android.permission.READ_PHONE_STATE");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            int i2 = -1;
            String str9 = null;
            if (telephonyManager == null) {
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
                i = -1;
            } else {
                if (a) {
                    i2 = telephonyManager.getPhoneType();
                }
                if (a) {
                    str7 = telephonyManager.getSubscriberId();
                } else {
                    str7 = null;
                }
                str6 = bjhz.m103567a().mo65266b();
                String c = bjhz.m103567a().mo65267c();
                if (!TextUtils.isEmpty(str6)) {
                    if (!TextUtils.isEmpty(c)) {
                        str7 = c;
                    } else if (TextUtils.isEmpty(str7)) {
                        str7 = Long.toString(bjhz.m103567a().mo65265a());
                    }
                    new adzt(Looper.getMainLooper()).post(new bjkr(context, str6, str7));
                } else {
                    str6 = telephonyManager.getSimOperator();
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                str5 = telephonyManager.getSimOperatorName();
                if (a) {
                    try {
                        str8 = telephonyManager.getDeviceId();
                    } catch (StringIndexOutOfBoundsException e) {
                        str8 = null;
                    }
                } else {
                    str8 = null;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (a) {
                    str3 = telephonyManager.getGroupIdLevel1();
                } else {
                    str3 = null;
                }
                if (a) {
                    str9 = telephonyManager.getLine1Number();
                }
                str = str9;
                str2 = str8;
                str4 = networkOperator;
                i = i2;
            }
            f122892y = new bjkt(a, i, str7, str6, str5, str4, str3, str2, str);
            f122893z = j;
        }
        return f122892y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x026b A[Catch:{ MissingResourceException -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x026c A[Catch:{ MissingResourceException -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e4 A[LOOP:0: B:120:0x02e2->B:121:0x02e4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023a  */
    /* renamed from: a */
    private static bygh m103796a(Context context, PackageInfo packageInfo, PackageInfo packageInfo2, bjkt bjkt, long j, long j2) {
        bxvd bxvd;
        Integer num;
        int i;
        Boolean bool;
        Boolean bool2;
        int size;
        int i2;
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        boolean z;
        Intent registerReceiver;
        PackageInfo packageInfo3 = packageInfo;
        PackageInfo packageInfo4 = packageInfo2;
        bjkt bjkt2 = bjkt;
        bygh bygh = (bygh) bygk.f166327s.mo74144da();
        if (packageInfo3 != null) {
            m103797a(bygh, packageInfo);
        }
        if (packageInfo4 != null) {
            m103797a(bygh, packageInfo4);
        }
        bygi bygi = f122886s;
        boolean z2 = true;
        if (bygi == null || j - f122887t > 1800000) {
            if (bjzc.m104959a(context)) {
                try {
                    Location lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("network");
                    if (lastKnownLocation != null) {
                        bxvd = bygi.f166311g.mo74144da();
                        try {
                            double latitude = lastKnownLocation.getLatitude();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi2 = (bygi) bxvd.f164949b;
                            bygi2.f166313a |= 2;
                            bygi2.f166315c = latitude;
                            double longitude = lastKnownLocation.getLongitude();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi3 = (bygi) bxvd.f164949b;
                            bygi3.f166313a |= 4;
                            bygi3.f166316d = longitude;
                            double time = (double) lastKnownLocation.getTime();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi4 = (bygi) bxvd.f164949b;
                            bygi4.f166313a |= 16;
                            bygi4.f166318f = time;
                            double altitude = lastKnownLocation.getAltitude();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi5 = (bygi) bxvd.f164949b;
                            bygi5.f166313a |= 1;
                            bygi5.f166314b = altitude;
                            float accuracy = lastKnownLocation.getAccuracy();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi6 = (bygi) bxvd.f164949b;
                            bygi6.f166313a |= 8;
                            bygi6.f166317e = accuracy;
                            f122886s = (bygi) bxvd.mo74062i();
                            f122887t = j;
                        } catch (Exception e) {
                            e = e;
                            Log.e("O2RequestContextBuilder", "Exception getting risk info", e);
                            if (bxvd != null) {
                            }
                            num = f122884q;
                            if (num != null) {
                            }
                            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            if (registerReceiver != null) {
                            }
                            i = -1;
                            if (i != -1) {
                            }
                            long rawOffset = (long) TimeZone.getDefault().getRawOffset();
                            if (bygh.f164950c) {
                            }
                            bygk bygk = (bygk) bygh.f164949b;
                            bygk.f166329a |= 2;
                            bygk.f166332d = rawOffset;
                            String displayName = TimeZone.getDefault().getDisplayName();
                            if (bygh.f164950c) {
                            }
                            bygk bygk2 = (bygk) bygh.f164949b;
                            displayName.getClass();
                            bygk2.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            bygk2.f166345q = displayName;
                            bool = f122888u;
                            if (bool != null) {
                            }
                            contentResolver2 = context.getContentResolver();
                            int i3 = Build.VERSION.SDK_INT;
                            if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) != 1) {
                            }
                            if (bygh.f164950c) {
                            }
                            bygk bygk3 = (bygk) bygh.f164949b;
                            bygk3.f166329a |= 16;
                            bygk3.f166334f = z;
                            f122888u = Boolean.valueOf(z);
                            f122889v = j;
                            bool2 = f122890w;
                            if (bool2 != null) {
                            }
                            contentResolver = context.getContentResolver();
                            int i4 = Build.VERSION.SDK_INT;
                            int i5 = Build.VERSION.SDK_INT;
                            if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                            }
                            if (bygh.f164950c) {
                            }
                            bygk bygk4 = (bygk) bygh.f164949b;
                            bygk4.f166329a |= 32;
                            bygk4.f166335g = z2;
                            f122890w = Boolean.valueOf(z2);
                            f122891x = j;
                            Locale locale = context.getResources().getConfiguration().locale;
                            String iSO3Language = locale.getISO3Language();
                            if (!bygh.f164950c) {
                            }
                            bygk bygk5 = (bygk) bygh.f164949b;
                            iSO3Language.getClass();
                            bygk5.f166329a |= 64;
                            bygk5.f166336h = iSO3Language;
                            String language = locale.getLanguage();
                            if (bygh.f164950c) {
                            }
                            bygk bygk6 = (bygk) bygh.f164949b;
                            language.getClass();
                            bygk6.f166329a |= 128;
                            bygk6.f166337i = language;
                            String country = locale.getCountry();
                            if (bygh.f164950c) {
                            }
                            bygk bygk7 = (bygk) bygh.f164949b;
                            country.getClass();
                            bygk7.f166329a |= 512;
                            bygk7.f166340l = country;
                            String locale2 = locale.toString();
                            if (bygh.f164950c) {
                            }
                            bygk bygk8 = (bygk) bygh.f164949b;
                            locale2.getClass();
                            bygk8.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bygk8.f166339k = locale2;
                            ArrayList a = bjza.m104956a();
                            size = a.size();
                            while (i2 < size) {
                            }
                            if (!TextUtils.isEmpty(bjkt2.f122874f)) {
                            }
                            if (!TextUtils.isEmpty(bjkt2.f122872d)) {
                            }
                            int i6 = bjkt2.f122870b;
                            if (bygh.f164950c) {
                            }
                            bygk bygk9 = (bygk) bygh.f164949b;
                            int i7 = bygk9.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                            bygk9.f166329a = i7;
                            bygk9.f166343o = i6;
                            bygk9.f166329a = 131072 | i7;
                            bygk9.f166344p = j2;
                            return bygh;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    bxvd = null;
                    Log.e("O2RequestContextBuilder", "Exception getting risk info", e);
                    if (bxvd != null) {
                    }
                    num = f122884q;
                    if (num != null) {
                        i = num.intValue();
                        if (i != -1) {
                        }
                        long rawOffset2 = (long) TimeZone.getDefault().getRawOffset();
                        if (bygh.f164950c) {
                        }
                        bygk bygk10 = (bygk) bygh.f164949b;
                        bygk10.f166329a |= 2;
                        bygk10.f166332d = rawOffset2;
                        String displayName2 = TimeZone.getDefault().getDisplayName();
                        if (bygh.f164950c) {
                        }
                        bygk bygk22 = (bygk) bygh.f164949b;
                        displayName2.getClass();
                        bygk22.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bygk22.f166345q = displayName2;
                        bool = f122888u;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            if (bygh.f164950c) {
                            }
                            bygk bygk11 = (bygk) bygh.f164949b;
                            bygk11.f166329a |= 16;
                            bygk11.f166334f = booleanValue;
                            bool2 = f122890w;
                            if (bool2 != null) {
                                boolean booleanValue2 = bool2.booleanValue();
                                if (bygh.f164950c) {
                                }
                                bygk bygk12 = (bygk) bygh.f164949b;
                                bygk12.f166329a |= 32;
                                bygk12.f166335g = booleanValue2;
                                Locale locale3 = context.getResources().getConfiguration().locale;
                                String iSO3Language2 = locale3.getISO3Language();
                                if (!bygh.f164950c) {
                                }
                                bygk bygk52 = (bygk) bygh.f164949b;
                                iSO3Language2.getClass();
                                bygk52.f166329a |= 64;
                                bygk52.f166336h = iSO3Language2;
                                String language2 = locale3.getLanguage();
                                if (bygh.f164950c) {
                                }
                                bygk bygk62 = (bygk) bygh.f164949b;
                                language2.getClass();
                                bygk62.f166329a |= 128;
                                bygk62.f166337i = language2;
                                String country2 = locale3.getCountry();
                                if (bygh.f164950c) {
                                }
                                bygk bygk72 = (bygk) bygh.f164949b;
                                country2.getClass();
                                bygk72.f166329a |= 512;
                                bygk72.f166340l = country2;
                                String locale22 = locale3.toString();
                                if (bygh.f164950c) {
                                }
                                bygk bygk82 = (bygk) bygh.f164949b;
                                locale22.getClass();
                                bygk82.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                bygk82.f166339k = locale22;
                                ArrayList a2 = bjza.m104956a();
                                size = a2.size();
                                while (i2 < size) {
                                }
                                if (!TextUtils.isEmpty(bjkt2.f122874f)) {
                                }
                                if (!TextUtils.isEmpty(bjkt2.f122872d)) {
                                }
                                int i62 = bjkt2.f122870b;
                                if (bygh.f164950c) {
                                }
                                bygk bygk92 = (bygk) bygh.f164949b;
                                int i72 = bygk92.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                bygk92.f166329a = i72;
                                bygk92.f166343o = i62;
                                bygk92.f166329a = 131072 | i72;
                                bygk92.f166344p = j2;
                                return bygh;
                            }
                            contentResolver = context.getContentResolver();
                            int i42 = Build.VERSION.SDK_INT;
                            int i52 = Build.VERSION.SDK_INT;
                            if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                            }
                            if (bygh.f164950c) {
                            }
                            bygk bygk42 = (bygk) bygh.f164949b;
                            bygk42.f166329a |= 32;
                            bygk42.f166335g = z2;
                            f122890w = Boolean.valueOf(z2);
                            f122891x = j;
                            Locale locale32 = context.getResources().getConfiguration().locale;
                            String iSO3Language22 = locale32.getISO3Language();
                            if (!bygh.f164950c) {
                            }
                            bygk bygk522 = (bygk) bygh.f164949b;
                            iSO3Language22.getClass();
                            bygk522.f166329a |= 64;
                            bygk522.f166336h = iSO3Language22;
                            String language22 = locale32.getLanguage();
                            if (bygh.f164950c) {
                            }
                            bygk bygk622 = (bygk) bygh.f164949b;
                            language22.getClass();
                            bygk622.f166329a |= 128;
                            bygk622.f166337i = language22;
                            String country22 = locale32.getCountry();
                            if (bygh.f164950c) {
                            }
                            bygk bygk722 = (bygk) bygh.f164949b;
                            country22.getClass();
                            bygk722.f166329a |= 512;
                            bygk722.f166340l = country22;
                            String locale222 = locale32.toString();
                            if (bygh.f164950c) {
                            }
                            bygk bygk822 = (bygk) bygh.f164949b;
                            locale222.getClass();
                            bygk822.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bygk822.f166339k = locale222;
                            ArrayList a22 = bjza.m104956a();
                            size = a22.size();
                            while (i2 < size) {
                            }
                            if (!TextUtils.isEmpty(bjkt2.f122874f)) {
                            }
                            if (!TextUtils.isEmpty(bjkt2.f122872d)) {
                            }
                            int i622 = bjkt2.f122870b;
                            if (bygh.f164950c) {
                            }
                            bygk bygk922 = (bygk) bygh.f164949b;
                            int i722 = bygk922.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                            bygk922.f166329a = i722;
                            bygk922.f166343o = i622;
                            bygk922.f166329a = 131072 | i722;
                            bygk922.f166344p = j2;
                            return bygh;
                        }
                        contentResolver2 = context.getContentResolver();
                        int i32 = Build.VERSION.SDK_INT;
                        if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) != 1) {
                        }
                        if (bygh.f164950c) {
                        }
                        bygk bygk32 = (bygk) bygh.f164949b;
                        bygk32.f166329a |= 16;
                        bygk32.f166334f = z;
                        f122888u = Boolean.valueOf(z);
                        f122889v = j;
                        bool2 = f122890w;
                        if (bool2 != null) {
                        }
                        contentResolver = context.getContentResolver();
                        int i422 = Build.VERSION.SDK_INT;
                        int i522 = Build.VERSION.SDK_INT;
                        if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                        }
                        if (bygh.f164950c) {
                        }
                        bygk bygk422 = (bygk) bygh.f164949b;
                        bygk422.f166329a |= 32;
                        bygk422.f166335g = z2;
                        f122890w = Boolean.valueOf(z2);
                        f122891x = j;
                        Locale locale322 = context.getResources().getConfiguration().locale;
                        String iSO3Language222 = locale322.getISO3Language();
                        if (!bygh.f164950c) {
                        }
                        bygk bygk5222 = (bygk) bygh.f164949b;
                        iSO3Language222.getClass();
                        bygk5222.f166329a |= 64;
                        bygk5222.f166336h = iSO3Language222;
                        String language222 = locale322.getLanguage();
                        if (bygh.f164950c) {
                        }
                        bygk bygk6222 = (bygk) bygh.f164949b;
                        language222.getClass();
                        bygk6222.f166329a |= 128;
                        bygk6222.f166337i = language222;
                        String country222 = locale322.getCountry();
                        if (bygh.f164950c) {
                        }
                        bygk bygk7222 = (bygk) bygh.f164949b;
                        country222.getClass();
                        bygk7222.f166329a |= 512;
                        bygk7222.f166340l = country222;
                        String locale2222 = locale322.toString();
                        if (bygh.f164950c) {
                        }
                        bygk bygk8222 = (bygk) bygh.f164949b;
                        locale2222.getClass();
                        bygk8222.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bygk8222.f166339k = locale2222;
                        ArrayList a222 = bjza.m104956a();
                        size = a222.size();
                        while (i2 < size) {
                        }
                        if (!TextUtils.isEmpty(bjkt2.f122874f)) {
                        }
                        if (!TextUtils.isEmpty(bjkt2.f122872d)) {
                        }
                        int i6222 = bjkt2.f122870b;
                        if (bygh.f164950c) {
                        }
                        bygk bygk9222 = (bygk) bygh.f164949b;
                        int i7222 = bygk9222.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        bygk9222.f166329a = i7222;
                        bygk9222.f166343o = i6222;
                        bygk9222.f166329a = 131072 | i7222;
                        bygk9222.f166344p = j2;
                        return bygh;
                    }
                    registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver != null) {
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    long rawOffset22 = (long) TimeZone.getDefault().getRawOffset();
                    if (bygh.f164950c) {
                    }
                    bygk bygk102 = (bygk) bygh.f164949b;
                    bygk102.f166329a |= 2;
                    bygk102.f166332d = rawOffset22;
                    String displayName22 = TimeZone.getDefault().getDisplayName();
                    if (bygh.f164950c) {
                    }
                    bygk bygk222 = (bygk) bygh.f164949b;
                    displayName22.getClass();
                    bygk222.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    bygk222.f166345q = displayName22;
                    bool = f122888u;
                    if (bool != null) {
                    }
                    contentResolver2 = context.getContentResolver();
                    int i322 = Build.VERSION.SDK_INT;
                    if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) != 1) {
                    }
                    if (bygh.f164950c) {
                    }
                    bygk bygk322 = (bygk) bygh.f164949b;
                    bygk322.f166329a |= 16;
                    bygk322.f166334f = z;
                    f122888u = Boolean.valueOf(z);
                    f122889v = j;
                    bool2 = f122890w;
                    if (bool2 != null) {
                    }
                    contentResolver = context.getContentResolver();
                    int i4222 = Build.VERSION.SDK_INT;
                    int i5222 = Build.VERSION.SDK_INT;
                    if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                    }
                    if (bygh.f164950c) {
                    }
                    bygk bygk4222 = (bygk) bygh.f164949b;
                    bygk4222.f166329a |= 32;
                    bygk4222.f166335g = z2;
                    f122890w = Boolean.valueOf(z2);
                    f122891x = j;
                    Locale locale3222 = context.getResources().getConfiguration().locale;
                    String iSO3Language2222 = locale3222.getISO3Language();
                    if (!bygh.f164950c) {
                    }
                    bygk bygk52222 = (bygk) bygh.f164949b;
                    iSO3Language2222.getClass();
                    bygk52222.f166329a |= 64;
                    bygk52222.f166336h = iSO3Language2222;
                    String language2222 = locale3222.getLanguage();
                    if (bygh.f164950c) {
                    }
                    bygk bygk62222 = (bygk) bygh.f164949b;
                    language2222.getClass();
                    bygk62222.f166329a |= 128;
                    bygk62222.f166337i = language2222;
                    String country2222 = locale3222.getCountry();
                    if (bygh.f164950c) {
                    }
                    bygk bygk72222 = (bygk) bygh.f164949b;
                    country2222.getClass();
                    bygk72222.f166329a |= 512;
                    bygk72222.f166340l = country2222;
                    String locale22222 = locale3222.toString();
                    if (bygh.f164950c) {
                    }
                    bygk bygk82222 = (bygk) bygh.f164949b;
                    locale22222.getClass();
                    bygk82222.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bygk82222.f166339k = locale22222;
                    ArrayList a2222 = bjza.m104956a();
                    size = a2222.size();
                    while (i2 < size) {
                    }
                    if (!TextUtils.isEmpty(bjkt2.f122874f)) {
                    }
                    if (!TextUtils.isEmpty(bjkt2.f122872d)) {
                    }
                    int i62222 = bjkt2.f122870b;
                    if (bygh.f164950c) {
                    }
                    bygk bygk92222 = (bygk) bygh.f164949b;
                    int i72222 = bygk92222.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    bygk92222.f166329a = i72222;
                    bygk92222.f166343o = i62222;
                    bygk92222.f166329a = 131072 | i72222;
                    bygk92222.f166344p = j2;
                    return bygh;
                }
            }
            bxvd = null;
        } else {
            bxvd = (bxvd) bygi.mo74142c(5);
            bxvd.mo73625a((bxvk) bygi);
        }
        if (bxvd != null) {
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk13 = (bygk) bygh.f164949b;
            bygi bygi7 = (bygi) bxvd.mo74062i();
            bygi7.getClass();
            bygk13.f166333e = bygi7;
            bygk13.f166329a |= 8;
        }
        num = f122884q;
        if (num != null && j - f122885r <= 1800000) {
            i = num.intValue();
        } else {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 > 0) {
                    Integer valueOf = Integer.valueOf((intExtra * 100) / intExtra2);
                    f122884q = valueOf;
                    f122885r = j;
                    i = valueOf.intValue();
                }
            }
            i = -1;
        }
        if (i != -1) {
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk14 = (bygk) bygh.f164949b;
            bygk14.f166329a |= 1;
            bygk14.f166331c = i;
        }
        long rawOffset222 = (long) TimeZone.getDefault().getRawOffset();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk1022 = (bygk) bygh.f164949b;
        bygk1022.f166329a |= 2;
        bygk1022.f166332d = rawOffset222;
        String displayName222 = TimeZone.getDefault().getDisplayName();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk2222 = (bygk) bygh.f164949b;
        displayName222.getClass();
        bygk2222.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        bygk2222.f166345q = displayName222;
        bool = f122888u;
        if (bool != null && j - f122889v <= 2160000) {
            boolean booleanValue3 = bool.booleanValue();
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk112 = (bygk) bygh.f164949b;
            bygk112.f166329a |= 16;
            bygk112.f166334f = booleanValue3;
        } else {
            contentResolver2 = context.getContentResolver();
            int i3222 = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) != 1) {
                z = true;
            } else {
                z = false;
            }
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk3222 = (bygk) bygh.f164949b;
            bygk3222.f166329a |= 16;
            bygk3222.f166334f = z;
            f122888u = Boolean.valueOf(z);
            f122889v = j;
        }
        bool2 = f122890w;
        if (bool2 != null && j - f122891x <= 2160000) {
            boolean booleanValue22 = bool2.booleanValue();
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk122 = (bygk) bygh.f164949b;
            bygk122.f166329a |= 32;
            bygk122.f166335g = booleanValue22;
        } else {
            contentResolver = context.getContentResolver();
            int i42222 = Build.VERSION.SDK_INT;
            int i52222 = Build.VERSION.SDK_INT;
            if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                z2 = false;
            }
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk42222 = (bygk) bygh.f164949b;
            bygk42222.f166329a |= 32;
            bygk42222.f166335g = z2;
            f122890w = Boolean.valueOf(z2);
            f122891x = j;
        }
        Locale locale32222 = context.getResources().getConfiguration().locale;
        try {
            String iSO3Language22222 = locale32222.getISO3Language();
            if (!bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk522222 = (bygk) bygh.f164949b;
            iSO3Language22222.getClass();
            bygk522222.f166329a |= 64;
            bygk522222.f166336h = iSO3Language22222;
        } catch (MissingResourceException e3) {
        }
        String language22222 = locale32222.getLanguage();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk622222 = (bygk) bygh.f164949b;
        language22222.getClass();
        bygk622222.f166329a |= 128;
        bygk622222.f166337i = language22222;
        String country22222 = locale32222.getCountry();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk722222 = (bygk) bygh.f164949b;
        country22222.getClass();
        bygk722222.f166329a |= 512;
        bygk722222.f166340l = country22222;
        String locale222222 = locale32222.toString();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk822222 = (bygk) bygh.f164949b;
        locale222222.getClass();
        bygk822222.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bygk822222.f166339k = locale222222;
        ArrayList a22222 = bjza.m104956a();
        size = a22222.size();
        for (i2 = 0; i2 < size; i2++) {
            bygh.mo74377a(((InetAddress) a22222.get(i2)).getHostAddress());
        }
        if (!TextUtils.isEmpty(bjkt2.f122874f)) {
            String str = bjkt2.f122874f;
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk15 = (bygk) bygh.f164949b;
            str.getClass();
            bygk15.f166329a |= 4096;
            bygk15.f166341m = str;
        }
        if (!TextUtils.isEmpty(bjkt2.f122872d)) {
            String str2 = bjkt2.f122872d;
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk16 = (bygk) bygh.f164949b;
            str2.getClass();
            bygk16.f166329a |= 8192;
            bygk16.f166342n = str2;
        }
        int i622222 = bjkt2.f122870b;
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk922222 = (bygk) bygh.f164949b;
        int i722222 = bygk922222.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bygk922222.f166329a = i722222;
        bygk922222.f166343o = i622222;
        bygk922222.f166329a = 131072 | i722222;
        bygk922222.f166344p = j2;
        return bygh;
    }

    /* renamed from: a */
    private static void m103797a(bygh bygh, PackageInfo packageInfo) {
        bxvd da = bygj.f166319g.mo74144da();
        if (!TextUtils.isEmpty(packageInfo.packageName)) {
            String str = packageInfo.packageName;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygj bygj = (bygj) da.f164949b;
            str.getClass();
            bygj.f166321a |= 1;
            bygj.f166322b = str;
        }
        String num = Integer.toString(packageInfo.versionCode);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygj bygj2 = (bygj) da.f164949b;
        num.getClass();
        bygj2.f166321a |= 2;
        bygj2.f166323c = num;
        long j = packageInfo.firstInstallTime;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygj bygj3 = (bygj) da.f164949b;
        bygj3.f166321a |= 8;
        bygj3.f166325e = j;
        long j2 = packageInfo.lastUpdateTime;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygj bygj4 = (bygj) da.f164949b;
        bygj4.f166321a |= 4;
        bygj4.f166324d = j2;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.sourceDir)) {
            String str2 = applicationInfo.sourceDir;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygj bygj5 = (bygj) da.f164949b;
            str2.getClass();
            bygj5.f166321a |= 16;
            bygj5.f166326f = str2;
        }
        bygh.mo74376a(da);
    }

    /* renamed from: a */
    private static void m103798a(HashMap hashMap, List list, int i) {
        if (!list.isEmpty()) {
            bxvd da = bwlo.f160158c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwlo bwlo = (bwlo) da.f164949b;
            bwlo.f160161b = i - 1;
            bwlo.f160160a |= 1;
            bwlo.m122074a(bwlo);
            bwlo bwlo2 = (bwlo) da.mo74062i();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = ((ResolveInfo) list.get(i2)).activityInfo.packageName;
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str, list2);
                }
                list2.add(bwlo2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x074b  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x07e8  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0802  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0a88  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0a98  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0aa3  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0aae  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0ab8  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0ad9 A[LOOP:2: B:433:0x0ad7->B:434:0x0ad9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0af0  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0b19  */
    /* renamed from: a */
    public final bwmg mo65343a() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        bwma bwma;
        ConnectivityManager connectivityManager;
        long j;
        boolean z;
        bxvd da;
        bwmj bwmj;
        int i;
        bxvd bxvd;
        bwlt bwlt;
        Context context;
        bwma bwma2;
        int size;
        int i2;
        bxvd bxvd2;
        bxvd da2;
        int i3;
        int i4;
        NetworkInfo activeNetworkInfo;
        int type;
        List<ResolveInfo> queryIntentServices;
        Iterator it;
        Iterator it2;
        List<ResolveInfo> list;
        List list2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        bwlt bwlt2 = (bwlt) bwma.f160196M.mo74144da();
        int i5 = this.f122904k;
        if (bwlt2.f164950c) {
            bwlt2.mo74035c();
            bwlt2.f164950c = false;
        }
        bwma bwma3 = (bwma) bwlt2.f164949b;
        int i6 = i5 - 1;
        if (i5 != 0) {
            bwma3.f160207J = i6;
            bwma3.f160211b |= 4;
            String num = Integer.toString(Build.VERSION.SDK_INT);
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma4 = (bwma) bwlt2.f164949b;
            num.getClass();
            int i7 = bwma4.f160210a | 16;
            bwma4.f160210a = i7;
            bwma4.f160216g = num;
            bwma4.f160210a = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bwma4.f160219j = uptimeMillis;
            String displayName = TimeZone.getDefault().getDisplayName();
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma5 = (bwma) bwlt2.f164949b;
            displayName.getClass();
            bwma5.f160210a |= 512;
            bwma5.f160220k = displayName;
            if (!TextUtils.isEmpty(Build.DEVICE)) {
                String str = Build.DEVICE;
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma6 = (bwma) bwlt2.f164949b;
                str.getClass();
                bwma6.f160210a |= 32;
                bwma6.f160217h = str;
            }
            long a = bjhz.m103567a().mo65265a();
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma7 = (bwma) bwlt2.f164949b;
            bwma7.f160210a |= 64;
            bwma7.f160218i = a;
            if (!TextUtils.isEmpty(null)) {
                new adzt(Looper.getMainLooper()).post(new bjkq(this));
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma8 = (bwma) bwlt2.f164949b;
                throw null;
            }
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma9 = (bwma) bwlt2.f164949b;
            "am-google".getClass();
            bwma9.f160210a |= 4194304;
            bwma9.f160234y = "am-google";
            List list3 = this.f122900g;
            if (list3 != null) {
                if (!bwma9.f160235z.mo73666a()) {
                    bwma9.f160235z = bxvk.m124021a(bwma9.f160235z);
                }
                bxsy.m123078a(list3, bwma9.f160235z);
            }
            bjkt a2 = m103795a(this.f122894a, elapsedRealtime);
            int i8 = !a2.f122869a ? 3 : 2;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma10 = (bwma) bwlt2.f164949b;
            bwma10.f160212c = i8 - 1;
            bwma10.f160210a |= 1;
            if (!TextUtils.isEmpty(a2.f122871c)) {
                String a3 = bjyw.m104939a(a2.f122871c);
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma11 = (bwma) bwlt2.f164949b;
                a3.getClass();
                bwma11.f160210a |= 4;
                bwma11.f160214e = a3;
                try {
                    long parseLong = (Long.parseLong(a2.f122871c) / 100000) * 100000;
                    if (bwlt2.f164950c) {
                        bwlt2.mo74035c();
                        bwlt2.f164950c = false;
                    }
                    bwma bwma12 = (bwma) bwlt2.f164949b;
                    bwma12.f160210a |= 268435456;
                    bwma12.f160200C = parseLong;
                } catch (NumberFormatException e) {
                }
            }
            if (!TextUtils.isEmpty(a2.f122872d)) {
                String str2 = a2.f122872d;
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma13 = (bwma) bwlt2.f164949b;
                str2.getClass();
                bwma13.f160210a |= 8;
                bwma13.f160215f = str2;
            }
            if (!TextUtils.isEmpty(a2.f122873e)) {
                String str3 = a2.f122873e;
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma14 = (bwma) bwlt2.f164949b;
                str3.getClass();
                bwma14.f160210a |= 8388608;
                bwma14.f160198A = str3;
            }
            if (!TextUtils.isEmpty(a2.f122875g)) {
                String str4 = a2.f122875g;
                if (bwlt2.f164950c) {
                    bwlt2.mo74035c();
                    bwlt2.f164950c = false;
                }
                bwma bwma15 = (bwma) bwlt2.f164949b;
                str4.getClass();
                bwma15.f160210a |= 16777216;
                bwma15.f160199B = str4;
            }
            int i9 = !bjzc.m104960a(this.f122894a, "android.permission.CAMERA") ? 3 : 2;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma16 = (bwma) bwlt2.f164949b;
            bwma16.f160213d = i9 - 1;
            bwma16.f160210a |= 2;
            DisplayMetrics a4 = bjzh.m104970a(this.f122894a);
            int i10 = a4.widthPixels;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma17 = (bwma) bwlt2.f164949b;
            bwma17.f160210a |= 1024;
            bwma17.f160221l = i10;
            int i11 = a4.heightPixels;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma18 = (bwma) bwlt2.f164949b;
            bwma18.f160210a |= 2048;
            bwma18.f160222m = i11;
            float f = a4.xdpi;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma19 = (bwma) bwlt2.f164949b;
            bwma19.f160210a |= 4096;
            bwma19.f160223n = f;
            float f2 = a4.ydpi;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma20 = (bwma) bwlt2.f164949b;
            bwma20.f160210a |= 8192;
            bwma20.f160224o = f2;
            int i12 = a4.densityDpi;
            if (bwlt2.f164950c) {
                bwlt2.mo74035c();
                bwlt2.f164950c = false;
            }
            bwma bwma21 = (bwma) bwlt2.f164949b;
            int i13 = bwma21.f160210a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bwma21.f160210a = i13;
            bwma21.f160225p = i12;
            int i14 = this.f122905l;
            if (i14 == 3) {
                int i15 = this.f122897d;
                i13 |= 2097152;
                bwma21.f160210a = i13;
                bwma21.f160232w = (long) i15;
            }
            int i16 = i14 - 1;
            if (i14 != 0) {
                bwma21.f160226q = i16;
                bwma21.f160210a = 32768 | i13;
                PackageManager packageManager = this.f122894a.getPackageManager();
                String packageName = this.f122894a.getPackageName();
                bjks bjks = (bjks) f122881n.mo15546a(packageName);
                if (bjks == null) {
                    try {
                        PackageInfo packageInfo3 = this.f122894a.getPackageManager().getPackageInfo(packageName, 0);
                        if (packageInfo3 != null) {
                            try {
                                f122881n.mo15547a(packageName, new bjks(elapsedRealtime, packageInfo3));
                            } catch (PackageManager.NameNotFoundException e2) {
                            }
                        }
                        packageInfo = packageInfo3;
                    } catch (PackageManager.NameNotFoundException e3) {
                        packageInfo = null;
                    }
                } else {
                    packageInfo = bjks.f122868b;
                }
                if (packageInfo != null) {
                    if (bwlt2.f164950c) {
                        bwlt2.mo74035c();
                        bwlt2.f164950c = false;
                    }
                    bwma bwma22 = (bwma) bwlt2.f164949b;
                    packageName.getClass();
                    bwma22.f160210a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    bwma22.f160227r = packageName;
                    String num2 = Integer.toString(packageInfo.versionCode);
                    if (bwlt2.f164950c) {
                        bwlt2.mo74035c();
                        bwlt2.f164950c = false;
                    }
                    bwma bwma23 = (bwma) bwlt2.f164949b;
                    num2.getClass();
                    bwma23.f160210a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bwma23.f160228s = num2;
                    if (!TextUtils.isEmpty(packageInfo.versionName)) {
                        String str5 = packageInfo.versionName;
                        if (bwlt2.f164950c) {
                            bwlt2.mo74035c();
                            bwlt2.f164950c = false;
                        }
                        bwma bwma24 = (bwma) bwlt2.f164949b;
                        str5.getClass();
                        bwma24.f160210a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bwma24.f160229t = str5;
                    }
                }
                if (!TextUtils.isEmpty(this.f122899f)) {
                    String str6 = this.f122899f;
                    if (bwlt2.f164950c) {
                        bwlt2.mo74035c();
                        bwlt2.f164950c = false;
                    }
                    bwma bwma25 = (bwma) bwlt2.f164949b;
                    str6.getClass();
                    bwma25.f160210a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    bwma25.f160230u = str6;
                    String str7 = this.f122899f;
                    bjks bjks2 = (bjks) f122881n.mo15546a(str7);
                    if (bjks2 == null || elapsedRealtime - bjks2.f122867a > 1800000) {
                        try {
                            PackageInfo packageInfo4 = packageManager.getPackageInfo(str7, 0);
                            if (packageInfo4 != null) {
                                bjks bjks3 = new bjks(elapsedRealtime, packageInfo4);
                                try {
                                    f122881n.mo15547a(str7, bjks3);
                                } catch (PackageManager.NameNotFoundException e4) {
                                }
                                bjks2 = bjks3;
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                        }
                    }
                    if (bjks2 != null) {
                        PackageInfo packageInfo5 = bjks2.f122868b;
                        String valueOf = String.valueOf(C1147kv.m18618a(packageInfo5));
                        if (bwlt2.f164950c) {
                            bwlt2.mo74035c();
                            bwlt2.f164950c = false;
                        }
                        bwma bwma26 = (bwma) bwlt2.f164949b;
                        valueOf.getClass();
                        bwma26.f160210a |= 1048576;
                        bwma26.f160231v = valueOf;
                        packageInfo2 = packageInfo5;
                        if (f122878A == null || elapsedRealtime - f122879B <= 1800000) {
                            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.AUTHENTICATE_V1"), 0);
                            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.REDIRECT_CAPTURE_V1"), 0);
                            queryIntentServices = packageManager.queryIntentServices(new Intent("com.google.android.wallet.carrierbilling.operatorproperties.BIND"), 0);
                            HashMap hashMap = new HashMap(queryIntentActivities.size() + queryIntentServices.size());
                            m103798a(hashMap, queryIntentActivities, 2);
                            m103798a(hashMap, queryIntentActivities2, 4);
                            HashMap hashMap2 = hashMap;
                            if (!queryIntentServices.isEmpty()) {
                                bxvd da3 = bwlo.f160158c.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bwlo bwlo = (bwlo) da3.f164949b;
                                bwlo.f160161b = 2;
                                bwlo.f160160a |= 1;
                                bwlo.m122074a(bwlo);
                                bwlo bwlo2 = (bwlo) da3.mo74062i();
                                int size2 = queryIntentServices.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    String str8 = queryIntentServices.get(i17).serviceInfo.packageName;
                                    List list4 = (List) hashMap2.get(str8);
                                    if (list4 == null) {
                                        list = queryIntentServices;
                                        list2 = new ArrayList();
                                        hashMap2.put(str8, list2);
                                    } else {
                                        list = queryIntentServices;
                                        list2 = list4;
                                    }
                                    list2.add(bwlo2);
                                    i17++;
                                    queryIntentServices = list;
                                }
                            }
                            f122878A = new ArrayList(hashMap2.size());
                            it = hashMap2.keySet().iterator();
                            while (it.hasNext()) {
                                String str9 = (String) it.next();
                                bxvd da4 = bwlp.f160163e.mo74144da();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bwlp bwlp = (bwlp) da4.f164949b;
                                str9.getClass();
                                bwlp.f160165a |= 1;
                                bwlp.f160166b = str9;
                                try {
                                    String num3 = Integer.toString(packageManager.getPackageInfo(str9, 0).versionCode);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bwlp bwlp2 = (bwlp) da4.f164949b;
                                    num3.getClass();
                                    it2 = it;
                                    try {
                                        bwlp2.f160165a |= 2;
                                        bwlp2.f160167c = num3;
                                    } catch (PackageManager.NameNotFoundException e6) {
                                    }
                                } catch (PackageManager.NameNotFoundException e7) {
                                    it2 = it;
                                }
                                List list5 = (List) hashMap2.get(str9);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bwlp bwlp3 = (bwlp) da4.f164949b;
                                if (!bwlp3.f160168d.mo73666a()) {
                                    bwlp3.f160168d = bxvk.m124021a(bwlp3.f160168d);
                                }
                                bxsy.m123078a(list5, bwlp3.f160168d);
                                f122878A.add((bwlp) da4.mo74062i());
                                it = it2;
                            }
                            f122879B = elapsedRealtime;
                        }
                        List list6 = f122878A;
                        if (bwlt2.f164950c) {
                            bwlt2.mo74035c();
                            bwlt2.f164950c = false;
                        }
                        bwma = (bwma) bwlt2.f164949b;
                        if (!bwma.f160206I.mo73666a()) {
                            bwma.f160206I = bxvk.m124021a(bwma.f160206I);
                        }
                        bxsy.m123078a(list6, bwma.f160206I);
                        if (f122883p == null) {
                            f122883p = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
                        }
                        if (f122883p.booleanValue()) {
                            bwlt2.mo73525a(bwly.ANDROID_LEANBACK);
                        }
                        if (f122882o == null) {
                            f122882o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                        }
                        if (f122882o.booleanValue()) {
                            bwlt2.mo73525a(bwly.ANDROID_WEAR);
                        }
                        Intent intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
                        intent.setPackage("com.google.android.gms");
                        if (this.f122896c && packageManager.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null) {
                            bwlt2.mo73525a(bwly.CAMERA_DOCUMENT_CAPTURE);
                        }
                        if (bjhz.m103567a().mo65271g()) {
                            if (new akoz(this.f122894a).mo39623a() != null) {
                                if (bwlt2.f164950c) {
                                    bwlt2.mo74035c();
                                    bwlt2.f164950c = false;
                                }
                                bwma bwma27 = (bwma) bwlt2.f164949b;
                                bwma27.f160211b |= 16;
                                bwma27.f160209L = true;
                                bwlt2.mo73524a(bwlv.DEVICE_BASED_INPUT_TYPE_CARD_OCR);
                            }
                            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.f122894a);
                            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                                bwlt2.mo73524a(bwlv.DEVICE_BASED_INPUT_TYPE_NFC);
                            }
                        }
                        connectivityManager = (ConnectivityManager) this.f122894a.getSystemService("connectivity");
                        WifiManager wifiManager = (WifiManager) this.f122894a.getApplicationContext().getSystemService("wifi");
                        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                            type = activeNetworkInfo.getType();
                            if (type != 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                        j = m103799b(114.0d);
                                        break;
                                    case 2:
                                        j = m103799b(135.0d);
                                        break;
                                    case 3:
                                        j = m103799b(384.0d);
                                        break;
                                    case 4:
                                        j = m103799b(115.0d);
                                        break;
                                    case 5:
                                        j = m103799b(700.0d);
                                        break;
                                    case 6:
                                    case 14:
                                        j = m103799b(900.0d);
                                        break;
                                    case 7:
                                        j = m103799b(70.0d);
                                        break;
                                    case 8:
                                        j = m103794a(1.8d);
                                        break;
                                    case 9:
                                    case 10:
                                        j = m103794a(1.0d);
                                        break;
                                    case 11:
                                        j = m103799b(13.0d);
                                        break;
                                    case 12:
                                    case 13:
                                    case 15:
                                        j = m103794a(5.0d);
                                        break;
                                    default:
                                        j = 0;
                                        break;
                                }
                            } else if (type != 1) {
                                j = type != 6 ? type != 9 ? 0 : m103794a(480.0d) : m103794a(3.0d);
                            } else if (wifiManager != null) {
                                try {
                                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                                    if (connectionInfo != null) {
                                        j = m103794a((double) connectionInfo.getLinkSpeed());
                                    }
                                } catch (IllegalArgumentException | IllegalStateException | NullPointerException e8) {
                                    j = 0;
                                }
                            }
                            if (bwlt2.f164950c) {
                                bwlt2.mo74035c();
                                bwlt2.f164950c = false;
                            }
                            bwma bwma28 = (bwma) bwlt2.f164949b;
                            int i18 = bwma28.f160210a | 536870912;
                            bwma28.f160210a = i18;
                            bwma28.f160201D = j;
                            bwma28.f160210a = i18 | JGCastService.FLAG_PRIVATE_DISPLAY;
                            bwma28.f160202E = j;
                            int i19 = Build.VERSION.SDK_INT;
                            if (connectivityManager != null || !connectivityManager.isActiveNetworkMetered()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (bwlt2.f164950c) {
                                bwlt2.mo74035c();
                                bwlt2.f164950c = false;
                            }
                            bwma bwma29 = (bwma) bwlt2.f164949b;
                            bwma29.f160210a |= Integer.MIN_VALUE;
                            bwma29.f160203F = z;
                            da = bwmg.f160254n.mo74144da();
                            bwmj = this.f122895b;
                            if (bwmj != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bwmg bwmg = (bwmg) da.f164949b;
                                bwmj.getClass();
                                bwmg.f160259d = bwmj;
                                bwmg.f160256a |= 1;
                            }
                            String a5 = bjyw.m104936a(this.f122894a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwmg bwmg2 = (bwmg) da.f164949b;
                            a5.getClass();
                            int i20 = bwmg2.f160256a | 16;
                            bwmg2.f160256a = i20;
                            bwmg2.f160260e = a5;
                            bwmg2.f160261f = 2;
                            bwmg2.f160256a = i20 | 32;
                            long j2 = packageInfo != null ? (long) packageInfo.versionCode : 0;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwmg bwmg3 = (bwmg) da.f164949b;
                            bwmg3.f160256a |= 64;
                            bwmg3.f160262g = j2;
                            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwmg bwmg4 = (bwmg) da.f164949b;
                            int i21 = bwmg4.f160256a | 128;
                            bwmg4.f160256a = i21;
                            bwmg4.f160263h = leastSignificantBits;
                            long j3 = this.f122898e;
                            int i22 = i21 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bwmg4.f160256a = i22;
                            bwmg4.f160264i = j3;
                            bwmg4.f160256a = i22 | 512;
                            bwmg4.f160265j = false;
                            if (bjhz.m103567a().mo65276l()) {
                                if (this.f122901h) {
                                    i4 = this.f122903j.length;
                                } else {
                                    i4 = -1;
                                }
                                int length = this.f122903j.length;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bwmg bwmg5 = (bwmg) da.f164949b;
                                bwmg5.f160256a |= 2048;
                                bwmg5.f160266k = length;
                                int a6 = bjyu.m104928a(this.f122903j, this.f122902i);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bwmg bwmg6 = (bwmg) da.f164949b;
                                bwmg6.f160256a |= 4096;
                                bwmg6.f160267l = a6;
                                i = i4;
                            } else if (this.f122901h) {
                                Account[] accountsByType = AccountManager.get(this.f122894a).getAccountsByType("com.google");
                                this.f122903j = accountsByType;
                                i = accountsByType.length;
                            } else {
                                i = -1;
                            }
                            if (this.f122901h) {
                                bxvd da5 = bygl.f166347d.mo74144da();
                                bxvd da6 = bygg.f166294p.mo74144da();
                                if (!da6.f164950c) {
                                    i3 = 0;
                                } else {
                                    da6.mo74035c();
                                    i3 = 0;
                                    da6.f164950c = false;
                                }
                                bygg bygg = (bygg) da6.f164949b;
                                bygg.f166297b = i3;
                                bygg.f166296a |= 1;
                                if (!TextUtils.isEmpty(a2.f122876h)) {
                                    int i23 = a2.f122870b;
                                    if (i23 == 1) {
                                        String str10 = a2.f122876h;
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bygg bygg2 = (bygg) da6.f164949b;
                                        str10.getClass();
                                        bygg2.f166296a |= 2;
                                        bygg2.f166298c = str10;
                                    } else if (i23 == 2) {
                                        if (a2.f122876h.length() <= 8) {
                                            String str11 = a2.f122876h;
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            bygg bygg3 = (bygg) da6.f164949b;
                                            str11.getClass();
                                            bygg3.f166296a |= 16;
                                            bygg3.f166300e = str11;
                                        } else {
                                            String str12 = a2.f122876h;
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            bygg bygg4 = (bygg) da6.f164949b;
                                            str12.getClass();
                                            bygg4.f166296a |= 4;
                                            bygg4.f166299d = str12;
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(a2.f122877i)) {
                                    String str13 = a2.f122877i;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg5 = (bygg) da6.f164949b;
                                    str13.getClass();
                                    bygg5.f166296a |= 32;
                                    bygg5.f166301f = str13;
                                }
                                bwlt = bwlt2;
                                int i24 = i;
                                long a7 = bjhz.m103567a().mo65265a();
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bygg bygg6 = (bygg) da6.f164949b;
                                bxvd = da;
                                bygg6.f166296a |= 64;
                                bygg6.f166302g = a7;
                                if (!TextUtils.isEmpty(Build.DEVICE)) {
                                    String str14 = Build.DEVICE;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg7 = (bygg) da6.f164949b;
                                    str14.getClass();
                                    bygg7.f166296a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    bygg7.f166303h = str14;
                                }
                                if (!TextUtils.isEmpty(Build.PRODUCT)) {
                                    String str15 = Build.PRODUCT;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg8 = (bygg) da6.f164949b;
                                    str15.getClass();
                                    bygg8.f166296a |= 512;
                                    bygg8.f166304i = str15;
                                }
                                if (!TextUtils.isEmpty(Build.MODEL)) {
                                    String str16 = Build.MODEL;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg9 = (bygg) da6.f164949b;
                                    str16.getClass();
                                    bygg9.f166296a |= 1024;
                                    bygg9.f166305j = str16;
                                }
                                if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
                                    String str17 = Build.MANUFACTURER;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg10 = (bygg) da6.f164949b;
                                    str17.getClass();
                                    bygg10.f166296a |= 2048;
                                    bygg10.f166306k = str17;
                                }
                                if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
                                    String str18 = Build.FINGERPRINT;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg11 = (bygg) da6.f164949b;
                                    str18.getClass();
                                    bygg11.f166296a |= 4096;
                                    bygg11.f166307l = str18;
                                }
                                if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
                                    String str19 = Build.VERSION.RELEASE;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg12 = (bygg) da6.f164949b;
                                    str19.getClass();
                                    bygg12.f166296a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                    bygg12.f166308m = str19;
                                }
                                if (!TextUtils.isEmpty(Build.BRAND)) {
                                    String str20 = Build.BRAND;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg13 = (bygg) da6.f164949b;
                                    str20.getClass();
                                    bygg13.f166296a |= 1048576;
                                    bygg13.f166309n = str20;
                                }
                                if (!TextUtils.isEmpty(Build.SERIAL)) {
                                    String a8 = bjyw.m104935a();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygg bygg14 = (bygg) da6.f164949b;
                                    a8.getClass();
                                    bygg14.f166296a |= 2097152;
                                    bygg14.f166310o = a8;
                                }
                                bygg bygg15 = (bygg) da6.mo74062i();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bygl bygl = (bygl) da5.f164949b;
                                bygg15.getClass();
                                bygl.f166350b = bygg15;
                                bygl.f166349a |= 1;
                                bygh a9 = m103796a(this.f122894a, packageInfo, packageInfo2, a2, elapsedRealtime, uptimeMillis);
                                if (i24 >= 0) {
                                    if (a9.f164950c) {
                                        a9.mo74035c();
                                        a9.f164950c = false;
                                    }
                                    bygk bygk = (bygk) a9.f164949b;
                                    bygk bygk2 = bygk.f166327s;
                                    bygk.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                    bygk.f166346r = i24;
                                }
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bygl bygl2 = (bygl) da5.f164949b;
                                bygk bygk3 = (bygk) a9.mo74062i();
                                bygk3.getClass();
                                bygl2.f166351c = bygk3;
                                bygl2.f166349a |= 2;
                                if (bwlt.f164950c) {
                                    bwlt.mo74035c();
                                    bwlt.f164950c = false;
                                }
                                bwma bwma30 = (bwma) bwlt.f164949b;
                                bygl bygl3 = (bygl) da5.mo74062i();
                                bygl3.getClass();
                                bwma30.f160204G = bygl3;
                                bwma30.f160211b |= 1;
                            } else {
                                bxvd = da;
                                bwlt = bwlt2;
                            }
                            context = this.f122894a;
                            ArrayList arrayList = new ArrayList();
                            if (bjyw.m104942c(context)) {
                                arrayList.add(bwls.FINGERPRINT);
                            }
                            if (bjyw.m104943d(context)) {
                                arrayList.add(bwls.BIOMETRIC);
                            }
                            if (bjyw.m104941b(context)) {
                                arrayList.add(bwls.PIN_PASSWORD_OR_PATTERN);
                            }
                            if (bwlt.f164950c) {
                                bwlt.mo74035c();
                                bwlt.f164950c = false;
                            }
                            bwma2 = (bwma) bwlt.f164949b;
                            if (!bwma2.f160205H.mo73666a()) {
                                bwma2.f160205H = bxvk.m124019a(bwma2.f160205H);
                            }
                            size = arrayList.size();
                            for (i2 = 0; i2 < size; i2++) {
                                bwma2.f160205H.mo74153d(((bwls) arrayList.get(i2)).f160177f);
                            }
                            bxvd2 = bxvd;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bwmg bwmg7 = (bwmg) bxvd2.f164949b;
                            bwma bwma31 = (bwma) bwlt.mo74062i();
                            bwma31.getClass();
                            bwmg7.f160258c = bwma31;
                            bwmg7.f160257b = 10;
                            da2 = bwme.f160249b.mo74144da();
                            if ((((bwme) da2.f164949b).f160251a & 1) != 0) {
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bwmg bwmg8 = (bwmg) bxvd2.f164949b;
                                bwme bwme = (bwme) da2.mo74062i();
                                bwme.getClass();
                                bwmg8.f160268m = bwme;
                                bwmg8.f160256a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            }
                            return (bwmg) bxvd2.mo74062i();
                        }
                        j = 0;
                        if (bwlt2.f164950c) {
                        }
                        bwma bwma282 = (bwma) bwlt2.f164949b;
                        int i182 = bwma282.f160210a | 536870912;
                        bwma282.f160210a = i182;
                        bwma282.f160201D = j;
                        bwma282.f160210a = i182 | JGCastService.FLAG_PRIVATE_DISPLAY;
                        bwma282.f160202E = j;
                        int i192 = Build.VERSION.SDK_INT;
                        if (connectivityManager != null) {
                        }
                        z = false;
                        if (bwlt2.f164950c) {
                        }
                        bwma bwma292 = (bwma) bwlt2.f164949b;
                        bwma292.f160210a |= Integer.MIN_VALUE;
                        bwma292.f160203F = z;
                        da = bwmg.f160254n.mo74144da();
                        bwmj = this.f122895b;
                        if (bwmj != null) {
                        }
                        String a52 = bjyw.m104936a(this.f122894a);
                        if (da.f164950c) {
                        }
                        bwmg bwmg22 = (bwmg) da.f164949b;
                        a52.getClass();
                        int i202 = bwmg22.f160256a | 16;
                        bwmg22.f160256a = i202;
                        bwmg22.f160260e = a52;
                        bwmg22.f160261f = 2;
                        bwmg22.f160256a = i202 | 32;
                        if (packageInfo != null) {
                        }
                        if (da.f164950c) {
                        }
                        bwmg bwmg32 = (bwmg) da.f164949b;
                        bwmg32.f160256a |= 64;
                        bwmg32.f160262g = j2;
                        long leastSignificantBits2 = UUID.randomUUID().getLeastSignificantBits();
                        if (da.f164950c) {
                        }
                        bwmg bwmg42 = (bwmg) da.f164949b;
                        int i212 = bwmg42.f160256a | 128;
                        bwmg42.f160256a = i212;
                        bwmg42.f160263h = leastSignificantBits2;
                        long j32 = this.f122898e;
                        int i222 = i212 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bwmg42.f160256a = i222;
                        bwmg42.f160264i = j32;
                        bwmg42.f160256a = i222 | 512;
                        bwmg42.f160265j = false;
                        if (bjhz.m103567a().mo65276l()) {
                        }
                        if (this.f122901h) {
                        }
                        context = this.f122894a;
                        ArrayList arrayList2 = new ArrayList();
                        if (bjyw.m104942c(context)) {
                        }
                        if (bjyw.m104943d(context)) {
                        }
                        if (bjyw.m104941b(context)) {
                        }
                        if (bwlt.f164950c) {
                        }
                        bwma2 = (bwma) bwlt.f164949b;
                        if (!bwma2.f160205H.mo73666a()) {
                        }
                        size = arrayList2.size();
                        while (i2 < size) {
                        }
                        bxvd2 = bxvd;
                        if (bxvd2.f164950c) {
                        }
                        bwmg bwmg72 = (bwmg) bxvd2.f164949b;
                        bwma bwma312 = (bwma) bwlt.mo74062i();
                        bwma312.getClass();
                        bwmg72.f160258c = bwma312;
                        bwmg72.f160257b = 10;
                        da2 = bwme.f160249b.mo74144da();
                        if ((((bwme) da2.f164949b).f160251a & 1) != 0) {
                        }
                        return (bwmg) bxvd2.mo74062i();
                    }
                }
                packageInfo2 = null;
                List<ResolveInfo> queryIntentActivities3 = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.AUTHENTICATE_V1"), 0);
                List<ResolveInfo> queryIntentActivities22 = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.REDIRECT_CAPTURE_V1"), 0);
                queryIntentServices = packageManager.queryIntentServices(new Intent("com.google.android.wallet.carrierbilling.operatorproperties.BIND"), 0);
                HashMap hashMap3 = new HashMap(queryIntentActivities3.size() + queryIntentServices.size());
                m103798a(hashMap3, queryIntentActivities3, 2);
                m103798a(hashMap3, queryIntentActivities22, 4);
                HashMap hashMap22 = hashMap3;
                if (!queryIntentServices.isEmpty()) {
                }
                f122878A = new ArrayList(hashMap22.size());
                it = hashMap22.keySet().iterator();
                while (it.hasNext()) {
                }
                f122879B = elapsedRealtime;
                List list62 = f122878A;
                if (bwlt2.f164950c) {
                }
                bwma = (bwma) bwlt2.f164949b;
                if (!bwma.f160206I.mo73666a()) {
                }
                bxsy.m123078a(list62, bwma.f160206I);
                if (f122883p == null) {
                }
                if (f122883p.booleanValue()) {
                }
                if (f122882o == null) {
                }
                if (f122882o.booleanValue()) {
                }
                Intent intent2 = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
                intent2.setPackage("com.google.android.gms");
                bwlt2.mo73525a(bwly.CAMERA_DOCUMENT_CAPTURE);
                if (bjhz.m103567a().mo65271g()) {
                }
                connectivityManager = (ConnectivityManager) this.f122894a.getSystemService("connectivity");
                WifiManager wifiManager2 = (WifiManager) this.f122894a.getApplicationContext().getSystemService("wifi");
                type = activeNetworkInfo.getType();
                if (type != 0) {
                }
                if (bwlt2.f164950c) {
                }
                bwma bwma2822 = (bwma) bwlt2.f164949b;
                int i1822 = bwma2822.f160210a | 536870912;
                bwma2822.f160210a = i1822;
                bwma2822.f160201D = j;
                bwma2822.f160210a = i1822 | JGCastService.FLAG_PRIVATE_DISPLAY;
                bwma2822.f160202E = j;
                int i1922 = Build.VERSION.SDK_INT;
                if (connectivityManager != null) {
                }
                z = false;
                if (bwlt2.f164950c) {
                }
                bwma bwma2922 = (bwma) bwlt2.f164949b;
                bwma2922.f160210a |= Integer.MIN_VALUE;
                bwma2922.f160203F = z;
                da = bwmg.f160254n.mo74144da();
                bwmj = this.f122895b;
                if (bwmj != null) {
                }
                String a522 = bjyw.m104936a(this.f122894a);
                if (da.f164950c) {
                }
                bwmg bwmg222 = (bwmg) da.f164949b;
                a522.getClass();
                int i2022 = bwmg222.f160256a | 16;
                bwmg222.f160256a = i2022;
                bwmg222.f160260e = a522;
                bwmg222.f160261f = 2;
                bwmg222.f160256a = i2022 | 32;
                if (packageInfo != null) {
                }
                if (da.f164950c) {
                }
                bwmg bwmg322 = (bwmg) da.f164949b;
                bwmg322.f160256a |= 64;
                bwmg322.f160262g = j2;
                long leastSignificantBits22 = UUID.randomUUID().getLeastSignificantBits();
                if (da.f164950c) {
                }
                bwmg bwmg422 = (bwmg) da.f164949b;
                int i2122 = bwmg422.f160256a | 128;
                bwmg422.f160256a = i2122;
                bwmg422.f160263h = leastSignificantBits22;
                long j322 = this.f122898e;
                int i2222 = i2122 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bwmg422.f160256a = i2222;
                bwmg422.f160264i = j322;
                bwmg422.f160256a = i2222 | 512;
                bwmg422.f160265j = false;
                if (bjhz.m103567a().mo65276l()) {
                }
                if (this.f122901h) {
                }
                context = this.f122894a;
                ArrayList arrayList22 = new ArrayList();
                if (bjyw.m104942c(context)) {
                }
                if (bjyw.m104943d(context)) {
                }
                if (bjyw.m104941b(context)) {
                }
                if (bwlt.f164950c) {
                }
                bwma2 = (bwma) bwlt.f164949b;
                if (!bwma2.f160205H.mo73666a()) {
                }
                size = arrayList22.size();
                while (i2 < size) {
                }
                bxvd2 = bxvd;
                if (bxvd2.f164950c) {
                }
                bwmg bwmg722 = (bwmg) bxvd2.f164949b;
                bwma bwma3122 = (bwma) bwlt.mo74062i();
                bwma3122.getClass();
                bwmg722.f160258c = bwma3122;
                bwmg722.f160257b = 10;
                da2 = bwme.f160249b.mo74144da();
                if ((((bwme) da2.f164949b).f160251a & 1) != 0) {
                }
                return (bwmg) bxvd2.mo74062i();
            }
            throw null;
        }
        throw null;
    }
}
