package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: bwbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbe implements bwbf {

    /* renamed from: a */
    public static final String f158692a = bwbe.class.getSimpleName();

    /* renamed from: p */
    private static final long f158693p = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: q */
    private static final long f158694q = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: r */
    private static final long f158695r = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: A */
    private boolean f158696A;

    /* renamed from: B */
    private int f158697B;

    /* renamed from: b */
    public final bwbb f158698b;

    /* renamed from: c */
    public Long f158699c = null;

    /* renamed from: d */
    public final CopyOnWriteArrayList f158700d;

    /* renamed from: e */
    public boolean f158701e;

    /* renamed from: f */
    public final SharedPreferences f158702f;

    /* renamed from: g */
    private final Random f158703g;

    /* renamed from: h */
    private final String f158704h;

    /* renamed from: i */
    private final String f158705i;

    /* renamed from: j */
    private final String f158706j;

    /* renamed from: k */
    private final String f158707k;

    /* renamed from: l */
    private final RequestQueue f158708l;

    /* renamed from: m */
    private final ThreadFactory f158709m;

    /* renamed from: n */
    private final bwak f158710n;

    /* renamed from: o */
    private cane f158711o;

    /* renamed from: s */
    private boolean f158712s;

    /* renamed from: t */
    private ArrayList f158713t;

    /* renamed from: u */
    private boolean f158714u;

    /* renamed from: v */
    private volatile int f158715v = 0;

    /* renamed from: w */
    private boolean f158716w;

    /* renamed from: x */
    private long f158717x;

    /* renamed from: y */
    private long f158718y = Long.MIN_VALUE;

    /* renamed from: z */
    private volatile int f158719z = 0;

    public bwbe(String str, String str2, String str3, String str4, cane cane, SharedPreferences sharedPreferences, RequestQueue requestQueue, bwak bwak, Random random, ThreadFactory threadFactory) {
        bwan.m121656a(str, "serverAddress");
        this.f158704h = str;
        bwan.m121656a(str2, "platformID");
        this.f158705i = str2;
        bwan.m121656a(str3, "softwareVersion");
        this.f158706j = str3;
        bwan.m121656a(str4, "distributionChannel");
        this.f158707k = str4;
        bwan.m121656a(cane, "ClientPropertiesRequestProto");
        this.f158711o = cane;
        bwan.m121656a(sharedPreferences, "SharedPreferences");
        this.f158702f = sharedPreferences;
        bwan.m121656a(requestQueue, "RequestQueue");
        this.f158708l = requestQueue;
        bwan.m121656a(bwak, "AndroidClock");
        this.f158710n = bwak;
        bwan.m121656a(random, "Random");
        this.f158703g = random;
        bwan.m121656a(threadFactory, "ThreadFactory");
        this.f158709m = threadFactory;
        synchronized (this) {
            this.f158700d = new CopyOnWriteArrayList();
            this.f158713t = new ArrayList();
            this.f158714u = false;
            this.f158701e = false;
            this.f158712s = true;
            this.f158717x = 0;
            this.f158716w = false;
            this.f158696A = false;
            this.f158697B = -1;
            this.f158698b = new bwbb(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7 A[SYNTHETIC, Splitter:B:29:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff A[Catch:{ all -> 0x02da }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0277  */
    /* renamed from: a */
    public static bwbf m121693a(Context context, String str, String str2, RequestQueue requestQueue, String str3, boolean z) {
        String str4;
        StrictMode.ThreadPolicy a;
        String str5;
        StringBuilder sb;
        StrictMode.ThreadPolicy b;
        int i;
        bxvd da;
        TelephonyManager telephonyManager;
        String str6;
        Cursor cursor;
        Context context2 = context;
        String str7 = str3;
        bwan.m121656a(context2, "Context");
        String a2 = bwar.f158672a.mo73413a("debug.mapview.gmmserver", "");
        if (a2.startsWith("http")) {
            String host = Uri.parse(a2).getHost();
            if (host.endsWith(".google.com") || host.equals("localhost")) {
                if (bwam.m121655a(f158692a, 4)) {
                    String str8 = f158692a;
                    String valueOf = String.valueOf(a2);
                    Log.i(str8, valueOf.length() == 0 ? new String("Hitting custom GMM server: ") : "Hitting custom GMM server: ".concat(valueOf));
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    String valueOf2 = String.valueOf(a2);
                    Toast.makeText(context2, valueOf2.length() == 0 ? new String("Hitting custom GMM server: ") : "Hitting custom GMM server: ".concat(valueOf2), 1).show();
                }
                if (a2.endsWith("/api")) {
                    str4 = String.valueOf(a2).concat("/api");
                } else {
                    str4 = a2;
                }
                String str9 = bwbq.f158754a;
                bwan.m121656a(context2, "context");
                a = bwap.f158670a.mo73410a();
                StringBuilder sb2 = new StringBuilder(21);
                sb2.append("name='");
                sb2.append("maps_client_id");
                sb2.append("'");
                cursor = context.getContentResolver().query(Uri.parse("content://com.google.settings/partner"), new String[]{"value"}, sb2.toString(), null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            str5 = cursor.getString(cursor.getColumnIndexOrThrow("value"));
                            if (cursor != null) {
                                cursor.close();
                            }
                            bwap.f158670a.mo73411a(a);
                            sb = new StringBuilder();
                            if (str5 != null || str5.length() == 0) {
                                sb.append("Web");
                            } else {
                                sb.append(str5);
                            }
                            String sb3 = sb.toString();
                            b = bwap.f158670a.mo73412b();
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
                            bwap.f158670a.mo73411a(b);
                            i = bwbg.f158721b;
                            bwan.m121656a(context2, "context");
                            bwan.m121656a(str7, "applicationName");
                            da = cane.f175337q.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cane cane = (cane) da.f164949b;
                            str3.getClass();
                            cane.f175339a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            cane.f175345g = str7;
                            cane.f175340b |= 8192;
                            cane.f175354p = z;
                            String str10 = Build.VERSION.SDK;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cane cane2 = (cane) da.f164949b;
                            str10.getClass();
                            int i2 = cane2.f175339a | 4194304;
                            cane2.f175339a = i2;
                            cane2.f175349k = str10;
                            int i3 = 16777216 | i2;
                            cane2.f175339a = i3;
                            cane2.f175350l = false;
                            int i4 = i3 | 64;
                            cane2.f175339a = i4;
                            cane2.f175344f = true;
                            "SYSTEM".getClass();
                            int i5 = i4 | 8192;
                            cane2.f175339a = i5;
                            cane2.f175346h = "SYSTEM";
                            "6.18.0".getClass();
                            cane2.f175340b |= 8;
                            cane2.f175352n = "6.18.0";
                            if (i <= 200) {
                                cane2.f175348j = 1;
                                cane2.f175339a = i5 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            } else {
                                cane2.f175348j = 3;
                                cane2.f175339a = i5 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            }
                            telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                            if (telephonyManager != null) {
                                String simCountryIso = telephonyManager.getSimCountryIso();
                                if (!bwaq.m121663a(simCountryIso)) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    cane cane3 = (cane) da.f164949b;
                                    simCountryIso.getClass();
                                    cane3.f175339a |= 8;
                                    cane3.f175343e = simCountryIso;
                                }
                            }
                            bwan.m121656a(context2, "context");
                            ContentResolver contentResolver = context.getContentResolver();
                            bwan.m121656a(contentResolver, "context.getContentResolver()");
                            str6 = bwbq.f158755b;
                            if (str6 == null) {
                                if (!svr.m36484b(context).mo26173a()) {
                                    str6 = Settings.Secure.getString(contentResolver, "logging_id2");
                                    StrictMode.ThreadPolicy a3 = bwap.f158670a.mo73410a();
                                    if (str6 == null) {
                                        try {
                                            str6 = aymk.m84258a(contentResolver, "logging_id2");
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            bwap.f158670a.mo73411a(a3);
                                            throw th2;
                                        }
                                    }
                                    bwap.f158670a.mo73411a(a3);
                                    if (bwam.m121655a(bwbq.f158754a, 3)) {
                                        String valueOf3 = String.valueOf(str6);
                                        if (valueOf3.length() == 0) {
                                            new String("getAndroidLoggingId2() => ");
                                        } else {
                                            "getAndroidLoggingId2() => ".concat(valueOf3);
                                        }
                                    }
                                    bwbq.f158755b = str6;
                                } else {
                                    str6 = null;
                                }
                            }
                            if (!bwaq.m121663a(str6)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                cane cane4 = (cane) da.f164949b;
                                str6.getClass();
                                cane4.f175339a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                cane4.f175347i = str6;
                            }
                            if (bwaq.m121663a(null)) {
                                return new bwbe(str4, str, str2, sb3, (cane) da.mo74062i(), sharedPreferences, requestQueue, bwak.f158662a, new Random(), new bwas("androidmapsapi-DataRequestDispatcher"));
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cane cane5 = (cane) da.f164949b;
                            cane5.f175340b |= 1024;
                            cane5.f175353o = true;
                            throw null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            if (bwam.m121655a(bwbq.f158754a, 3)) {
                            }
                            if (cursor != null) {
                            }
                            bwap.f158670a.mo73411a(a);
                            str5 = null;
                            sb = new StringBuilder();
                            if (str5 != null) {
                            }
                            sb.append("Web");
                            String sb32 = sb.toString();
                            b = bwap.f158670a.mo73412b();
                            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
                            bwap.f158670a.mo73411a(b);
                            i = bwbg.f158721b;
                            bwan.m121656a(context2, "context");
                            bwan.m121656a(str7, "applicationName");
                            da = cane.f175337q.mo74144da();
                            if (da.f164950c) {
                            }
                            cane cane6 = (cane) da.f164949b;
                            str3.getClass();
                            cane6.f175339a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            cane6.f175345g = str7;
                            cane6.f175340b |= 8192;
                            cane6.f175354p = z;
                            String str102 = Build.VERSION.SDK;
                            if (da.f164950c) {
                            }
                            cane cane22 = (cane) da.f164949b;
                            str102.getClass();
                            int i22 = cane22.f175339a | 4194304;
                            cane22.f175339a = i22;
                            cane22.f175349k = str102;
                            int i32 = 16777216 | i22;
                            cane22.f175339a = i32;
                            cane22.f175350l = false;
                            int i42 = i32 | 64;
                            cane22.f175339a = i42;
                            cane22.f175344f = true;
                            "SYSTEM".getClass();
                            int i52 = i42 | 8192;
                            cane22.f175339a = i52;
                            cane22.f175346h = "SYSTEM";
                            "6.18.0".getClass();
                            cane22.f175340b |= 8;
                            cane22.f175352n = "6.18.0";
                            if (i <= 200) {
                            }
                            telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                            if (telephonyManager != null) {
                            }
                            bwan.m121656a(context2, "context");
                            ContentResolver contentResolver2 = context.getContentResolver();
                            bwan.m121656a(contentResolver2, "context.getContentResolver()");
                            str6 = bwbq.f158755b;
                            if (str6 == null) {
                            }
                            if (!bwaq.m121663a(str6)) {
                            }
                            if (bwaq.m121663a(null)) {
                            }
                        } catch (Throwable th4) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            bwap.f158670a.mo73411a(a);
                            throw th4;
                        }
                    }
                }
                str5 = null;
                if (cursor != null) {
                }
                bwap.f158670a.mo73411a(a);
                sb = new StringBuilder();
                if (str5 != null) {
                }
                sb.append("Web");
                String sb322 = sb.toString();
                b = bwap.f158670a.mo73412b();
                SharedPreferences sharedPreferences22 = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
                bwap.f158670a.mo73411a(b);
                i = bwbg.f158721b;
                bwan.m121656a(context2, "context");
                bwan.m121656a(str7, "applicationName");
                da = cane.f175337q.mo74144da();
                if (da.f164950c) {
                }
                cane cane62 = (cane) da.f164949b;
                str3.getClass();
                cane62.f175339a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                cane62.f175345g = str7;
                cane62.f175340b |= 8192;
                cane62.f175354p = z;
                String str1022 = Build.VERSION.SDK;
                if (da.f164950c) {
                }
                cane cane222 = (cane) da.f164949b;
                str1022.getClass();
                int i222 = cane222.f175339a | 4194304;
                cane222.f175339a = i222;
                cane222.f175349k = str1022;
                int i322 = 16777216 | i222;
                cane222.f175339a = i322;
                cane222.f175350l = false;
                int i422 = i322 | 64;
                cane222.f175339a = i422;
                cane222.f175344f = true;
                "SYSTEM".getClass();
                int i522 = i422 | 8192;
                cane222.f175339a = i522;
                cane222.f175346h = "SYSTEM";
                "6.18.0".getClass();
                cane222.f175340b |= 8;
                cane222.f175352n = "6.18.0";
                if (i <= 200) {
                }
                telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                if (telephonyManager != null) {
                }
                bwan.m121656a(context2, "context");
                ContentResolver contentResolver22 = context.getContentResolver();
                bwan.m121656a(contentResolver22, "context.getContentResolver()");
                str6 = bwbq.f158755b;
                if (str6 == null) {
                }
                if (!bwaq.m121663a(str6)) {
                }
                if (bwaq.m121663a(null)) {
                }
            }
        }
        a2 = "https://clients4.google.com/glm/mmap";
        if (a2.endsWith("/api")) {
        }
        String str92 = bwbq.f158754a;
        bwan.m121656a(context2, "context");
        a = bwap.f158670a.mo73410a();
        try {
            StringBuilder sb22 = new StringBuilder(21);
            sb22.append("name='");
            sb22.append("maps_client_id");
            sb22.append("'");
            cursor = context.getContentResolver().query(Uri.parse("content://com.google.settings/partner"), new String[]{"value"}, sb22.toString(), null, null);
            if (cursor != null) {
            }
            str5 = null;
            if (cursor != null) {
            }
            bwap.f158670a.mo73411a(a);
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
            if (bwam.m121655a(bwbq.f158754a, 3)) {
                String valueOf4 = String.valueOf(th);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 59);
                sb4.append("Error getting distribution channel for key ");
                sb4.append("maps_client_id");
                sb4.append(": ");
                sb4.append(valueOf4);
                sb4.toString();
            }
            if (cursor != null) {
                cursor.close();
            }
            bwap.f158670a.mo73411a(a);
            str5 = null;
            sb = new StringBuilder();
            if (str5 != null) {
            }
            sb.append("Web");
            String sb3222 = sb.toString();
            b = bwap.f158670a.mo73412b();
            SharedPreferences sharedPreferences222 = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
            bwap.f158670a.mo73411a(b);
            i = bwbg.f158721b;
            bwan.m121656a(context2, "context");
            bwan.m121656a(str7, "applicationName");
            da = cane.f175337q.mo74144da();
            if (da.f164950c) {
            }
            cane cane622 = (cane) da.f164949b;
            str3.getClass();
            cane622.f175339a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cane622.f175345g = str7;
            cane622.f175340b |= 8192;
            cane622.f175354p = z;
            String str10222 = Build.VERSION.SDK;
            if (da.f164950c) {
            }
            cane cane2222 = (cane) da.f164949b;
            str10222.getClass();
            int i2222 = cane2222.f175339a | 4194304;
            cane2222.f175339a = i2222;
            cane2222.f175349k = str10222;
            int i3222 = 16777216 | i2222;
            cane2222.f175339a = i3222;
            cane2222.f175350l = false;
            int i4222 = i3222 | 64;
            cane2222.f175339a = i4222;
            cane2222.f175344f = true;
            "SYSTEM".getClass();
            int i5222 = i4222 | 8192;
            cane2222.f175339a = i5222;
            cane2222.f175346h = "SYSTEM";
            "6.18.0".getClass();
            cane2222.f175340b |= 8;
            cane2222.f175352n = "6.18.0";
            if (i <= 200) {
            }
            telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            if (telephonyManager != null) {
            }
            bwan.m121656a(context2, "context");
            ContentResolver contentResolver222 = context.getContentResolver();
            bwan.m121656a(contentResolver222, "context.getContentResolver()");
            str6 = bwbq.f158755b;
            if (str6 == null) {
            }
            if (!bwaq.m121663a(str6)) {
            }
            if (bwaq.m121663a(null)) {
            }
        }
        sb = new StringBuilder();
        if (str5 != null) {
        }
        sb.append("Web");
        String sb32222 = sb.toString();
        b = bwap.f158670a.mo73412b();
        try {
            SharedPreferences sharedPreferences2222 = context2.getSharedPreferences("com.google.maps.api.android.lib6.drd.PREFERENCES_FILE", 0);
            bwap.f158670a.mo73411a(b);
            i = bwbg.f158721b;
            bwan.m121656a(context2, "context");
            bwan.m121656a(str7, "applicationName");
            da = cane.f175337q.mo74144da();
            if (da.f164950c) {
            }
            cane cane6222 = (cane) da.f164949b;
            str3.getClass();
            cane6222.f175339a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cane6222.f175345g = str7;
            cane6222.f175340b |= 8192;
            cane6222.f175354p = z;
            String str102222 = Build.VERSION.SDK;
            if (da.f164950c) {
            }
            cane cane22222 = (cane) da.f164949b;
            str102222.getClass();
            int i22222 = cane22222.f175339a | 4194304;
            cane22222.f175339a = i22222;
            cane22222.f175349k = str102222;
            int i32222 = 16777216 | i22222;
            cane22222.f175339a = i32222;
            cane22222.f175350l = false;
            int i42222 = i32222 | 64;
            cane22222.f175339a = i42222;
            cane22222.f175344f = true;
            "SYSTEM".getClass();
            int i52222 = i42222 | 8192;
            cane22222.f175339a = i52222;
            cane22222.f175346h = "SYSTEM";
            "6.18.0".getClass();
            cane22222.f175340b |= 8;
            cane22222.f175352n = "6.18.0";
            if (i <= 200) {
            }
            telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            if (telephonyManager != null) {
            }
            bwan.m121656a(context2, "context");
            ContentResolver contentResolver2222 = context.getContentResolver();
            bwan.m121656a(contentResolver2222, "context.getContentResolver()");
            str6 = bwbq.f158755b;
            if (str6 == null) {
            }
            if (!bwaq.m121663a(str6)) {
            }
            if (bwaq.m121663a(null)) {
            }
        } catch (Throwable th6) {
            bwap.f158670a.mo73411a(b);
            throw th6;
        }
    }

    /* renamed from: s */
    private final synchronized void m121695s() {
        this.f158718y = Long.MIN_VALUE;
        this.f158716w = false;
        this.f158717x = 0;
        this.f158697B = -1;
    }

    /* renamed from: a */
    public final synchronized void mo73426a() {
        this.f158719z++;
    }

    /* renamed from: b */
    public final synchronized void mo73430b() {
        this.f158719z--;
    }

    /* renamed from: c */
    public final void mo73432c() {
        bwbi bwbi;
        if (mo73435f()) {
            synchronized (this) {
                if (this.f158713t.isEmpty() || !this.f158714u) {
                    bwbi = null;
                } else {
                    ArrayList arrayList = this.f158713t;
                    this.f158713t = new ArrayList();
                    this.f158714u = false;
                    bwbi = new bwbi(this, arrayList, bwbg.f158725f, this.f158708l, this.f158704h, this.f158705i, this.f158706j, this.f158707k, this.f158709m);
                }
            }
            if (bwbi != null) {
                bwbi.f158733b.mo73426a();
                bwbi.f158735d.newThread(bwbi).start();
            }
        }
    }

    /* renamed from: d */
    public final void mo73433d() {
        mo73446q();
        if (mo73434e()) {
            mo73432c();
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo73434e() {
        return this.f158714u;
    }

    /* renamed from: f */
    public final synchronized boolean mo73435f() {
        boolean z;
        z = true;
        if (!mo73436g() || this.f158719z >= 10 || (!this.f158696A && this.f158719z != 0)) {
            z = false;
        }
        return z;
    }

    /* renamed from: g */
    public final synchronized boolean mo73436g() {
        return this.f158701e;
    }

    /* renamed from: h */
    public final synchronized void mo73437h() {
        this.f158701e = false;
    }

    /* renamed from: i */
    public final synchronized boolean mo73438i() {
        return this.f158712s;
    }

    /* renamed from: j */
    public final synchronized long mo73439j() {
        return this.f158697B != 4 ? this.f158717x : this.f158717x + 800 + (this.f158703g.nextLong() % this.f158717x);
    }

    /* renamed from: k */
    public final synchronized void mo73440k() {
        this.f158696A = true;
        m121695s();
    }

    /* renamed from: l */
    public final synchronized long mo73441l() {
        Long l = this.f158699c;
        if (l == null) {
            long j = this.f158702f.getLong("SessionID", 0);
            if (j == 0) {
                if (bwam.m121655a(f158692a, 4)) {
                    Log.i(f158692a, "No GMM Server cookie cached. Initiating new request.");
                }
                mo73428a(new bwbp(this));
            } else if (bwam.m121655a(f158692a, 4)) {
                String str = f158692a;
                String valueOf = String.valueOf(Long.toHexString(j));
                Log.i(str, valueOf.length() == 0 ? new String("GMM Server cookie (cached): ") : "GMM Server cookie (cached): ".concat(valueOf));
            }
            Long valueOf2 = Long.valueOf(j);
            this.f158699c = valueOf2;
            return valueOf2.longValue();
        }
        return l.longValue();
    }

    /* renamed from: m */
    public final synchronized String mo73442m() {
        cane cane = this.f158711o;
        if ((cane.f175339a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return null;
        }
        return cane.f175345g;
    }

    /* renamed from: n */
    public final synchronized String mo73443n() {
        cane cane = this.f158711o;
        if ((cane.f175340b & 4) == 0) {
            return null;
        }
        return cane.f175351m;
    }

    /* renamed from: o */
    public final synchronized cane mo73444o() {
        return this.f158711o;
    }

    /* renamed from: p */
    public final synchronized void mo73445p() {
        String str;
        String str2 = null;
        if ((this.f158711o.f175339a & 1) == 0) {
            str = this.f158702f.getString("Cohort", null);
        } else {
            str = null;
        }
        if ((this.f158711o.f175339a & 2) == 0) {
            str2 = this.f158702f.getString("LegalCountry", null);
        }
        if (str != null || str2 != null) {
            cane cane = this.f158711o;
            bxvd bxvd = (bxvd) cane.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cane);
            if (str != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cane cane2 = (cane) bxvd.f164949b;
                cane cane3 = cane.f175337q;
                str.getClass();
                cane2.f175339a |= 1;
                cane2.f175341c = str;
            }
            if (str2 != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cane cane4 = (cane) bxvd.f164949b;
                cane cane5 = cane.f175337q;
                str2.getClass();
                cane4.f175339a |= 2;
                cane4.f175342d = str2;
            }
            this.f158711o = (cane) bxvd.mo74062i();
        }
    }

    /* renamed from: q */
    public final synchronized void mo73446q() {
    }

    /* renamed from: r */
    public final void mo73447r() {
        boolean z;
        synchronized (this) {
            z = true;
            if (!this.f158716w) {
                if (bwam.m121655a(f158692a, 6)) {
                    Log.e(f158692a, "In Error Mode");
                }
                this.f158716w = true;
                this.f158718y = Long.MIN_VALUE;
            } else {
                z = false;
            }
        }
        if (z) {
            Iterator it = this.f158700d.iterator();
            while (it.hasNext()) {
                bwav bwav = (bwav) it.next();
            }
        }
    }

    /* renamed from: b */
    public final void mo73431b(bwbd bwbd) {
        Iterator it = this.f158700d.iterator();
        while (it.hasNext()) {
            ((bwav) it.next()).mo34773a(bwbd);
        }
    }

    /* renamed from: a */
    private static void m121694a(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        StrictMode.ThreadPolicy b = bwap.f158670a.mo73412b();
        try {
            edit.commit();
        } finally {
            bwap.f158670a.mo73411a(b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo73427a(int i, Throwable th) {
        boolean z;
        long j;
        if (bwam.m121655a(f158692a, 6)) {
            String str = f158692a;
            StringBuilder sb = new StringBuilder(18);
            sb.append("Error #");
            sb.append(i);
            Log.e(str, sb.toString(), th);
        }
        synchronized (this) {
            this.f158697B = i;
            z = false;
            if (i == 4) {
                long j2 = this.f158717x;
                if (j2 != 0) {
                    if (!this.f158716w) {
                        if (j2 < f158695r) {
                            long j3 = this.f158717x;
                            this.f158717x = j3 + j3;
                        }
                    }
                }
                m121695s();
                this.f158697B = 4;
                this.f158717x = 200;
            } else if (this.f158716w) {
                if (this.f158717x >= f158694q) {
                    j = (this.f158717x * 5) / 4;
                    this.f158717x = j;
                } else {
                    j = f158694q;
                    this.f158717x = j;
                }
                if (j > f158695r) {
                    this.f158717x = f158695r;
                }
            } else {
                this.f158717x = 200;
                long j4 = this.f158718y;
                if (j4 == Long.MIN_VALUE) {
                    this.f158718y = SystemClock.elapsedRealtime();
                } else if (j4 + f158693p < SystemClock.elapsedRealtime()) {
                    z = true;
                }
            }
        }
        if (z) {
            mo73447r();
        }
    }

    /* renamed from: a */
    public final void mo73428a(bwbd bwbd) {
        bwbd.mo73421g();
        if (bwam.m121655a(f158692a, 3)) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Add Data Request: ");
            sb.append(bwbd.mo73402a());
            sb.toString();
        }
        synchronized (this) {
            if (bwbd.mo73405b()) {
                this.f158714u = true;
            }
            this.f158713t.add(bwbd);
        }
        if (bwbd.mo73405b()) {
            mo73446q();
            mo73432c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo73429a(canf canf) {
        String str;
        bwan.m121656a(canf, "ClientPropertiesResponseProto");
        int i = canf.f175357a;
        String str2 = null;
        if ((i & 1) != 0) {
            str = canf.f175358b;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = canf.f175359c;
        }
        if (str != null || str2 != null) {
            cane cane = this.f158711o;
            bxvd bxvd = (bxvd) cane.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cane);
            if (str != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cane cane2 = (cane) bxvd.f164949b;
                cane cane3 = cane.f175337q;
                str.getClass();
                cane2.f175339a |= 1;
                cane2.f175341c = str;
                m121694a(this.f158702f, "Cohort", str);
            }
            if (str2 != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cane cane4 = (cane) bxvd.f164949b;
                cane cane5 = cane.f175337q;
                str2.getClass();
                cane4.f175339a |= 2;
                cane4.f175342d = str2;
                m121694a(this.f158702f, "LegalCountry", str2);
            }
            this.f158711o = (cane) bxvd.mo74062i();
        }
    }
}
