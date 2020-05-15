package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.provider.Telephony;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bjvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjvu {

    /* renamed from: A */
    private static long f123414A;

    /* renamed from: B */
    private static Boolean f123415B;

    /* renamed from: C */
    private static long f123416C;

    /* renamed from: D */
    private static Boolean f123417D;

    /* renamed from: E */
    private static long f123418E;

    /* renamed from: F */
    private static bjvt f123419F;

    /* renamed from: G */
    private static long f123420G;

    /* renamed from: p */
    public static final C1231nx f123421p = new C1231nx(5);

    /* renamed from: q */
    public static Boolean f123422q;

    /* renamed from: r */
    public static Boolean f123423r;

    /* renamed from: s */
    public static List f123424s;

    /* renamed from: t */
    public static long f123425t;

    /* renamed from: w */
    private static final String[] f123426w = {"apn"};

    /* renamed from: x */
    private static Integer f123427x;

    /* renamed from: y */
    private static long f123428y;

    /* renamed from: z */
    private static bygi f123429z;

    /* renamed from: a */
    public final Context f123430a;

    /* renamed from: b */
    public byte[] f123431b;

    /* renamed from: c */
    public boolean f123432c;

    /* renamed from: d */
    public int f123433d;

    /* renamed from: e */
    public String f123434e;

    /* renamed from: f */
    public boolean f123435f;

    /* renamed from: g */
    public boolean f123436g;

    /* renamed from: h */
    public List f123437h;

    /* renamed from: i */
    public int[] f123438i;

    /* renamed from: j */
    public boolean f123439j;

    /* renamed from: k */
    public bjyy f123440k;

    /* renamed from: l */
    public bjyg f123441l;

    /* renamed from: m */
    public List f123442m;

    /* renamed from: n */
    public xnn f123443n;

    /* renamed from: o */
    public long f123444o;

    /* renamed from: u */
    public int f123445u = 1;

    /* renamed from: v */
    public int f123446v;

    public bjvu(Context context) {
        this.f123430a = context.getApplicationContext();
        this.f123439j = true;
    }

    /* renamed from: a */
    public static long m104743a(double d) {
        return (long) ((d * 1000000.0d) / 8.0d);
    }

    /* renamed from: b */
    public static long m104749b(double d) {
        return (long) ((d * 1000.0d) / 8.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
    /* renamed from: a */
    public static bjvt m104744a(Context context, long j) {
        Integer num;
        TelephonyManager telephonyManager;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        Cursor cursor;
        String str9;
        String str10;
        Context context2 = context;
        if (f123419F == null || j - f123420G > ((long) ((Integer) bjwe.f123498s.mo54082a()).intValue())) {
            boolean a = bjzc.m104960a(context2, "android.permission.READ_PHONE_STATE");
            if (a && ((Boolean) bjwe.f123501v.mo54082a()).booleanValue()) {
                int i2 = Build.VERSION.SDK_INT;
                SubscriptionManager subscriptionManager = (SubscriptionManager) context2.getSystemService("telephony_subscription_service");
                if (subscriptionManager != null) {
                    num = Integer.valueOf(subscriptionManager.getActiveSubscriptionInfoCount());
                    telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    if (telephonyManager != null) {
                        str7 = null;
                        i = -1;
                        str6 = null;
                        str5 = null;
                        str4 = null;
                        str3 = null;
                        str2 = null;
                        str = null;
                        bool = null;
                    } else {
                        if (a) {
                            i = telephonyManager.getPhoneType();
                        } else {
                            i = -1;
                        }
                        if (a) {
                            str9 = telephonyManager.getSubscriberId();
                        } else {
                            str9 = null;
                        }
                        String str11 = (String) bjwe.f123482c.mo54082a();
                        if (!TextUtils.isEmpty(str11)) {
                            new adzt(Looper.getMainLooper()).post(new bjvr(context2, str11));
                            str5 = str11;
                        } else {
                            str5 = telephonyManager.getSimOperator();
                        }
                        str4 = telephonyManager.getNetworkOperator();
                        String simOperatorName = telephonyManager.getSimOperatorName();
                        if (a) {
                            try {
                                str10 = telephonyManager.getDeviceId();
                            } catch (StringIndexOutOfBoundsException e) {
                                str10 = null;
                            }
                        } else {
                            str10 = null;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (a) {
                            str2 = telephonyManager.getGroupIdLevel1();
                        } else {
                            str2 = null;
                        }
                        if (a) {
                            str = telephonyManager.getLine1Number();
                        } else {
                            str = null;
                        }
                        if (((Boolean) bjwe.f123501v.mo54082a()).booleanValue()) {
                            int i4 = Build.VERSION.SDK_INT;
                            bool = Boolean.valueOf(telephonyManager.isSmsCapable());
                            str7 = str9;
                            str6 = simOperatorName;
                        } else {
                            str7 = str9;
                            str6 = simOperatorName;
                            bool = null;
                        }
                        str3 = str10;
                    }
                    if (a || !((Boolean) bjwe.f123501v.mo54082a()).booleanValue()) {
                        str8 = null;
                    } else {
                        int i5 = Build.VERSION.SDK_INT;
                        int i6 = Build.VERSION.SDK_INT;
                        int defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                        try {
                            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(Telephony.Carriers.CONTENT_URI, String.format("preferapn/subId/%s", Integer.valueOf(defaultSubscriptionId))), f123426w, null, null, null);
                            str8 = null;
                            while (query != null) {
                                try {
                                    if (!query.moveToNext()) {
                                        break;
                                    }
                                    str8 = query.getString(0);
                                } catch (SecurityException e2) {
                                    e = e2;
                                    cursor = query;
                                    try {
                                        Log.e("RequestContextBuilder", "Could not query TelephonyProvider", e);
                                        if (cursor != null) {
                                        }
                                        f123419F = new bjvt(a, i, str7, str5, str6, str4, str2, str3, str, str8, bool, num);
                                        f123420G = j;
                                        return f123419F;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (query != null) {
                                query.close();
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            cursor = null;
                            str8 = null;
                            Log.e("RequestContextBuilder", "Could not query TelephonyProvider", e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            f123419F = new bjvt(a, i, str7, str5, str6, str4, str2, str3, str, str8, bool, num);
                            f123420G = j;
                            return f123419F;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = null;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    f123419F = new bjvt(a, i, str7, str5, str6, str4, str2, str3, str, str8, bool, num);
                    f123420G = j;
                }
            }
            num = null;
            telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            if (telephonyManager != null) {
            }
            if (a) {
            }
            str8 = null;
            f123419F = new bjvt(a, i, str7, str5, str6, str4, str2, str3, str, str8, bool, num);
            f123420G = j;
        }
        return f123419F;
    }

    /* renamed from: a */
    public static bygg m104745a(bjvt bjvt) {
        bxvd da = bygg.f166294p.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygg bygg = (bygg) da.f164949b;
        bygg.f166297b = 0;
        bygg.f166296a |= 1;
        if (!TextUtils.isEmpty(bjvt.f123409h)) {
            int i = bjvt.f123403b;
            if (i == 1) {
                String str = bjvt.f123409h;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bygg bygg2 = (bygg) da.f164949b;
                str.getClass();
                bygg2.f166296a = 2 | bygg2.f166296a;
                bygg2.f166298c = str;
            } else if (i == 2) {
                if (bjvt.f123409h.length() <= 8) {
                    String str2 = bjvt.f123409h;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bygg bygg3 = (bygg) da.f164949b;
                    str2.getClass();
                    bygg3.f166296a |= 16;
                    bygg3.f166300e = str2;
                } else {
                    String str3 = bjvt.f123409h;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bygg bygg4 = (bygg) da.f164949b;
                    str3.getClass();
                    bygg4.f166296a |= 4;
                    bygg4.f166299d = str3;
                }
            }
        }
        if (!TextUtils.isEmpty(bjvt.f123410i)) {
            String str4 = bjvt.f123410i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg5 = (bygg) da.f164949b;
            str4.getClass();
            bygg5.f166296a |= 32;
            bygg5.f166301f = str4;
        }
        long longValue = ((Long) bjwe.f123480a.mo54082a()).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygg bygg6 = (bygg) da.f164949b;
        bygg6.f166296a |= 64;
        bygg6.f166302g = longValue;
        if (!TextUtils.isEmpty(Build.DEVICE)) {
            String str5 = Build.DEVICE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg7 = (bygg) da.f164949b;
            str5.getClass();
            bygg7.f166296a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bygg7.f166303h = str5;
        }
        if (!TextUtils.isEmpty(Build.PRODUCT)) {
            String str6 = Build.PRODUCT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg8 = (bygg) da.f164949b;
            str6.getClass();
            bygg8.f166296a |= 512;
            bygg8.f166304i = str6;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str7 = Build.MODEL;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg9 = (bygg) da.f164949b;
            str7.getClass();
            bygg9.f166296a |= 1024;
            bygg9.f166305j = str7;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str8 = Build.MANUFACTURER;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg10 = (bygg) da.f164949b;
            str8.getClass();
            bygg10.f166296a |= 2048;
            bygg10.f166306k = str8;
        }
        if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
            String str9 = Build.FINGERPRINT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg11 = (bygg) da.f164949b;
            str9.getClass();
            bygg11.f166296a |= 4096;
            bygg11.f166307l = str9;
        }
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str10 = Build.VERSION.RELEASE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg12 = (bygg) da.f164949b;
            str10.getClass();
            bygg12.f166296a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bygg12.f166308m = str10;
        }
        if (!TextUtils.isEmpty(Build.BRAND)) {
            String str11 = Build.BRAND;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg13 = (bygg) da.f164949b;
            str11.getClass();
            bygg13.f166296a |= 1048576;
            bygg13.f166309n = str11;
        }
        if (!TextUtils.isEmpty(Build.SERIAL)) {
            String a = bjyw.m104935a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygg bygg14 = (bygg) da.f164949b;
            a.getClass();
            bygg14.f166296a |= 2097152;
            bygg14.f166310o = a;
        }
        return (bygg) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029b A[Catch:{ MissingResourceException -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029c A[Catch:{ MissingResourceException -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0340 A[LOOP:0: B:128:0x033e->B:129:0x0340, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026a  */
    /* renamed from: a */
    public static bygh m104746a(Context context, PackageInfo packageInfo, PackageInfo packageInfo2, bjvt bjvt, long j, long j2) {
        bxvd bxvd;
        int i;
        String country;
        int size;
        int i2;
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        boolean z;
        Intent registerReceiver;
        bygh bygh = (bygh) bygk.f166327s.mo74144da();
        if (packageInfo != null) {
            m104747a(bygh, packageInfo);
        }
        if (packageInfo2 != null) {
            m104747a(bygh, packageInfo2);
        }
        boolean z2 = true;
        if (f123429z == null || j - f123414A > ((long) ((Integer) bjwe.f123494o.mo54082a()).intValue())) {
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
                            bygi bygi = (bygi) bxvd.f164949b;
                            bygi.f166313a |= 2;
                            bygi.f166315c = latitude;
                            double longitude = lastKnownLocation.getLongitude();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi2 = (bygi) bxvd.f164949b;
                            bygi2.f166313a |= 4;
                            bygi2.f166316d = longitude;
                            double time = (double) lastKnownLocation.getTime();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi3 = (bygi) bxvd.f164949b;
                            bygi3.f166313a |= 16;
                            bygi3.f166318f = time;
                            double altitude = lastKnownLocation.getAltitude();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi4 = (bygi) bxvd.f164949b;
                            bygi4.f166313a |= 1;
                            bygi4.f166314b = altitude;
                            float accuracy = lastKnownLocation.getAccuracy();
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bygi bygi5 = (bygi) bxvd.f164949b;
                            bygi5.f166313a |= 8;
                            bygi5.f166317e = accuracy;
                            f123429z = (bygi) bxvd.mo74062i();
                            f123414A = j;
                        } catch (Exception e) {
                            e = e;
                            Log.e("RequestContextBuilder", "Exception getting risk info", e);
                            if (bxvd != null) {
                            }
                            if (f123427x != null) {
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
                            if (f123415B != null) {
                            }
                            contentResolver2 = context.getContentResolver();
                            int i3 = Build.VERSION.SDK_INT;
                            if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) == 1) {
                            }
                            if (bygh.f164950c) {
                            }
                            bygk bygk3 = (bygk) bygh.f164949b;
                            bygk3.f166329a |= 16;
                            bygk3.f166334f = z;
                            f123415B = Boolean.valueOf(z);
                            f123416C = j;
                            if (f123417D != null) {
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
                            f123417D = Boolean.valueOf(z2);
                            f123418E = j;
                            Locale locale = context.getResources().getConfiguration().locale;
                            String iSO3Language = locale.getISO3Language();
                            if (bygh.f164950c) {
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
                            country = locale.getCountry();
                            String valueOf = String.valueOf(country);
                            if (valueOf.length() == 0) {
                            }
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
                            if (!TextUtils.isEmpty(bjvt.f123407f)) {
                            }
                            if (!TextUtils.isEmpty(bjvt.f123405d)) {
                            }
                            int i6 = bjvt.f123403b;
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
                    Log.e("RequestContextBuilder", "Exception getting risk info", e);
                    if (bxvd != null) {
                    }
                    if (f123427x != null) {
                    }
                    registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver != null) {
                    }
                    i = -1;
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
                    if (f123415B != null) {
                    }
                    contentResolver2 = context.getContentResolver();
                    int i32 = Build.VERSION.SDK_INT;
                    if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) == 1) {
                    }
                    if (bygh.f164950c) {
                    }
                    bygk bygk32 = (bygk) bygh.f164949b;
                    bygk32.f166329a |= 16;
                    bygk32.f166334f = z;
                    f123415B = Boolean.valueOf(z);
                    f123416C = j;
                    if (f123417D != null) {
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
                    f123417D = Boolean.valueOf(z2);
                    f123418E = j;
                    Locale locale3 = context.getResources().getConfiguration().locale;
                    String iSO3Language2 = locale3.getISO3Language();
                    if (bygh.f164950c) {
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
                    country = locale3.getCountry();
                    String valueOf2 = String.valueOf(country);
                    if (valueOf2.length() == 0) {
                    }
                    if (bygh.f164950c) {
                    }
                    bygk bygk72 = (bygk) bygh.f164949b;
                    country.getClass();
                    bygk72.f166329a |= 512;
                    bygk72.f166340l = country;
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
                    if (!TextUtils.isEmpty(bjvt.f123407f)) {
                    }
                    if (!TextUtils.isEmpty(bjvt.f123405d)) {
                    }
                    int i62 = bjvt.f123403b;
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
            }
            bxvd = null;
        } else {
            bygi bygi6 = f123429z;
            bxvd = (bxvd) bygi6.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bygi6);
        }
        if (bxvd != null) {
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk11 = (bygk) bygh.f164949b;
            bygi bygi7 = (bygi) bxvd.mo74062i();
            bygi7.getClass();
            bygk11.f166333e = bygi7;
            bygk11.f166329a |= 8;
        }
        if (f123427x != null || j - f123428y > ((long) ((Integer) bjwe.f123495p.mo54082a()).intValue())) {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 > 0) {
                    Integer valueOf3 = Integer.valueOf((intExtra * 100) / intExtra2);
                    f123427x = valueOf3;
                    f123428y = j;
                    i = valueOf3.intValue();
                }
            }
            i = -1;
        } else {
            i = f123427x.intValue();
        }
        if (i != -1) {
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk12 = (bygk) bygh.f164949b;
            bygk12.f166329a |= 1;
            bygk12.f166331c = i;
        }
        long rawOffset22 = (long) TimeZone.getDefault().getRawOffset();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk102 = (bygk) bygh.f164949b;
        bygk102.f166329a |= 2;
        bygk102.f166332d = rawOffset22;
        String displayName22 = TimeZone.getDefault().getDisplayName();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk222 = (bygk) bygh.f164949b;
        displayName22.getClass();
        bygk222.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        bygk222.f166345q = displayName22;
        if (f123415B != null || j - f123416C > ((long) ((Integer) bjwe.f123496q.mo54082a()).intValue())) {
            contentResolver2 = context.getContentResolver();
            int i322 = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(contentResolver2, "adb_enabled", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk322 = (bygk) bygh.f164949b;
            bygk322.f166329a |= 16;
            bygk322.f166334f = z;
            f123415B = Boolean.valueOf(z);
            f123416C = j;
        } else {
            boolean booleanValue = f123415B.booleanValue();
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk13 = (bygk) bygh.f164949b;
            bygk13.f166329a |= 16;
            bygk13.f166334f = booleanValue;
        }
        if (f123417D != null || j - f123418E > ((long) ((Integer) bjwe.f123496q.mo54082a()).intValue())) {
            contentResolver = context.getContentResolver();
            int i422 = Build.VERSION.SDK_INT;
            int i522 = Build.VERSION.SDK_INT;
            if (Settings.Secure.getInt(contentResolver, "install_non_market_apps", 0) != 1) {
                z2 = false;
            }
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk422 = (bygk) bygh.f164949b;
            bygk422.f166329a |= 32;
            bygk422.f166335g = z2;
            f123417D = Boolean.valueOf(z2);
            f123418E = j;
        } else {
            boolean booleanValue2 = f123417D.booleanValue();
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk14 = (bygk) bygh.f164949b;
            bygk14.f166329a |= 32;
            bygk14.f166335g = booleanValue2;
        }
        Locale locale32 = context.getResources().getConfiguration().locale;
        try {
            String iSO3Language22 = locale32.getISO3Language();
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk522 = (bygk) bygh.f164949b;
            iSO3Language22.getClass();
            bygk522.f166329a |= 64;
            bygk522.f166336h = iSO3Language22;
        } catch (MissingResourceException e3) {
        }
        String language22 = locale32.getLanguage();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk622 = (bygk) bygh.f164949b;
        language22.getClass();
        bygk622.f166329a |= 128;
        bygk622.f166337i = language22;
        country = locale32.getCountry();
        if (country.matches("\\d+") && ((Boolean) bjwe.f123502w.mo54082a()).booleanValue()) {
            String valueOf22 = String.valueOf(country);
            country = valueOf22.length() == 0 ? new String("UN") : "UN".concat(valueOf22);
        }
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk722 = (bygk) bygh.f164949b;
        country.getClass();
        bygk722.f166329a |= 512;
        bygk722.f166340l = country;
        String locale222 = locale32.toString();
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk822 = (bygk) bygh.f164949b;
        locale222.getClass();
        bygk822.f166329a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bygk822.f166339k = locale222;
        ArrayList a22 = bjza.m104956a();
        size = a22.size();
        for (i2 = 0; i2 < size; i2++) {
            bygh.mo74377a(((InetAddress) a22.get(i2)).getHostAddress());
        }
        if (!TextUtils.isEmpty(bjvt.f123407f)) {
            String str = bjvt.f123407f;
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk15 = (bygk) bygh.f164949b;
            str.getClass();
            bygk15.f166329a |= 4096;
            bygk15.f166341m = str;
        }
        if (!TextUtils.isEmpty(bjvt.f123405d)) {
            String str2 = bjvt.f123405d;
            if (bygh.f164950c) {
                bygh.mo74035c();
                bygh.f164950c = false;
            }
            bygk bygk16 = (bygk) bygh.f164949b;
            str2.getClass();
            bygk16.f166329a |= 8192;
            bygk16.f166342n = str2;
        }
        int i622 = bjvt.f123403b;
        if (bygh.f164950c) {
            bygh.mo74035c();
            bygh.f164950c = false;
        }
        bygk bygk922 = (bygk) bygh.f164949b;
        int i722 = bygk922.f166329a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bygk922.f166329a = i722;
        bygk922.f166343o = i622;
        bygk922.f166329a = 131072 | i722;
        bygk922.f166344p = j2;
        return bygh;
    }

    /* renamed from: a */
    private static void m104747a(bygh bygh, PackageInfo packageInfo) {
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
    public static void m104748a(HashMap hashMap, List list, int i) {
        if (!list.isEmpty()) {
            bxvd da = blwl.f127951c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwl blwl = (blwl) da.f164949b;
            blwl.f127954b = i - 1;
            blwl.f127953a |= 1;
            blwl.m107717a(blwl);
            blwl blwl2 = (blwl) da.mo74062i();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = ((ResolveInfo) list.get(i2)).activityInfo.packageName;
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str, list2);
                }
                list2.add(blwl2);
            }
        }
    }

    /* renamed from: a */
    public final void mo65570a(bxvd bxvd) {
        xnn xnn = this.f123443n;
        roz b = rpa.m34196b();
        b.f43472a = new xnm();
        b.f43473b = new Feature[]{wzj.f51600a};
        try {
            boolean booleanValue = ((Boolean) aucu.m76783a(xnn.mo24701a(b.mo24977a()), this.f123444o, TimeUnit.MILLISECONDS)).booleanValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmah bmah = (bmah) bxvd.f164949b;
            bmah bmah2 = bmah.f128446d;
            bmah.f128448a |= 1;
            bmah.f128450c = booleanValue;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("RequestContextBuilder", "IsUVPAA call failed", e.getCause());
        }
    }
}
